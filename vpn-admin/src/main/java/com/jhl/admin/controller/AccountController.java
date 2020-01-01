package com.jhl.admin.controller;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.jhl.admin.Interceptor.PreAuth;
import com.jhl.admin.cache.UserCache;
import com.jhl.admin.constant.KVConst;
import com.jhl.admin.model.Account;
import com.jhl.admin.model.Server;
import com.jhl.admin.model.User;
import com.jhl.admin.repository.AccountRepository;
import com.jhl.admin.repository.ServerRepository;
import com.jhl.admin.repository.StatRepository;
import com.jhl.admin.service.AccountService;
import com.jhl.admin.service.UserService;
import com.ljh.common.model.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Slf4j
@Controller
public class AccountController {
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    AccountService accountService;
    @Autowired
    UserCache userCache;
    @Autowired
    StatRepository statRepository;
    @Autowired
    UserService userService;
    @Value("${proxy.getConnectionCountUrl}")
    String PROXY_API_CONNECTION_COUNT_URL;
    @Autowired
    ServerRepository serverRepository;
    @Autowired
    RestTemplate restTemplate;

    /**
     * 创建一个account
     *
     * @return
     */
    @PreAuth("admin")
    @ResponseBody
    @PostMapping("/account")
    public Result createAccount(@RequestBody Account account) {
        if (account == null || account.getUserId() == null) throw new NullPointerException("不能为空");
        accountService.create(account);
        return Result.SUCCESS();
    }

    /**
     * 更新一个账号
     *
     * @param account
     * @return
     */
    @PreAuth("admin")
    @ResponseBody
    @PutMapping("/account")
    public Result updateAccount(@RequestBody Account account) {
        if (account == null || account.getId() == null) throw new NullPointerException("不能为空");
        accountService.updateAccount(account);
        return Result.SUCCESS();
    }

    /**
     * 跟换服务器账号
     *
     * @param account
     * @return
     */
    @PreAuth("vip")
    @ResponseBody
    @PutMapping("/account/server")
    public Result updateAccountServer(@RequestBody Account account) {
        if (account == null || account.getId() == null) throw new NullPointerException("不能为空");
        accountService.updateAccountServer(account);
        return Result.SUCCESS();
    }

    /**
     * 获取用户账号列表
     *
     * @return
     */
    @PreAuth("vip")
    @ResponseBody
    @GetMapping("/account/{id}")
    public Result get(@CookieValue(KVConst.COOKIE_NAME) String auth, @PathVariable Integer id) {
        if (auth == null || userCache.getCache(auth) == null) return Result.builder().code(500).message("认证失败").build();
        User cacheUser = (User) userCache.getCache(auth);
        Integer userId = cacheUser.getId();

        List<Account> accounts = accountService.getAccounts(userId);
        return Result.buildPageObject(accounts.size(), accounts);
    }

    /**
     * 获取所有列表
     *
     * @param page
     * @param pageSize
     * @return
     */
    @PreAuth("admin")
    @ResponseBody
    @GetMapping("/account")
    public Result list(Integer page, Integer pageSize, String userEmail) {
        List<Account> accounts = Lists.newArrayList();
        long total = 0l;
        Date date = new Date();
        if (StringUtils.isBlank(userEmail)) {
            Page<Account> accountsPage = accountRepository.findAll(Example.of(Account.builder().build()),
                    PageRequest.of(page - 1, pageSize)
            );

            if (accountsPage.getSize() > 0) {
                accounts = accountsPage.getContent();
            }
            total = accountsPage.getTotalElements();
        } else {
            accounts = accountRepository.findByUserEmail("%" + userEmail + "%");
            total = accounts == null ? 0l : accounts.size();
        }
        accounts.forEach(account -> {
            accountService.fillAccount(date, account);
        });
        return Result.buildPageObject(total, accounts);
    }

    @PreAuth("vip")
    @ResponseBody
    @GetMapping("/account/connection/{accountId}")
    public Result getConnection(@PathVariable Integer accountId) {
        if (accountId == null) return Result.builder().code(500).message("不能为空").build();
        Account account = accountRepository.findById(accountId).orElse(null);
        int count =0;
        if (account != null) {
            Integer serverId = account.getServerId();
            if (serverId == null) throw new RuntimeException("未设置服务器");
            Server server = serverRepository.findById(serverId).orElse(null);
            String proxyIps = server.getProxyIp();
            Integer proxyPort = server.getProxyPort();
            String accountNo = account.getAccountNo();


            for (String url : buildConnectionCountUrl(proxyIps, proxyPort)) {
                Result remoteConnection = getRemoteConnection(accountId, accountNo, url);

                if (remoteConnection.getCode().equals(200)){
                    count+= (Integer) remoteConnection.getObj();
                }

            }
        }
        return Result.buildSuccess(count,null);
    }

    private Result getRemoteConnection(@PathVariable Integer accountId, String accountNo, String url) {
        try {
            HashMap<String, Object> objectObjectHashMap = Maps.newHashMap();
            objectObjectHashMap.put("accountNo", accountNo);
            ResponseEntity<Result> responseEntity = restTemplate.getForEntity(url, Result.class, objectObjectHashMap);
            if (responseEntity.getStatusCode().is2xxSuccessful()) {
                Result body = responseEntity.getBody();
                return body;
            } else {
                log.error("获取连接数失败:{},{}", accountId, responseEntity);
                return Result.builder().code(501).message("获取失败").build();
            }
        } catch (Exception e) {
            log.error("获取连接数失败:{}", e.getLocalizedMessage());
            return Result.builder().code(501).message("获取失败").build();

        }
    }


    private List<String> buildConnectionCountUrl(String ips, Integer port) {

        List<String> list = new ArrayList<>();
        for (String ip : ips.split(",")) {
            String to = ip + ":" + port;
            list.add(String.format(PROXY_API_CONNECTION_COUNT_URL, to));
        }
        return list;
    }
}
