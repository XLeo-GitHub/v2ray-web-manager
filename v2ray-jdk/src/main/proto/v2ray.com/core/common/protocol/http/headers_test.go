package http_test

import (
	"bufio"
	"net/http"
	"strings"
	"testing"

	. "v2ray.com/core/common/protocol/http"
	. "v2ray.com/ext/assert"
)

func TestParseXForwardedFor(t *testing.T) {
	assert := With(t)

	header := http.Header{}
	header.Add("X-Forwarded-For", "129.78.138.66, 129.78.64.103")
	addrs := ParseXForwardedFor(header)
	assert(len(addrs), Equals, 2)
	assert(addrs[0].String(), Equals, "129.78.138.66")
	assert(addrs[1].String(), Equals, "129.78.64.103")
}

func TestHopByHopHeadersRemoving(t *testing.T) {
	assert := With(t)

	rawRequest := `GET /pkg/net/http/ HTTP/1.1
Host: golang.org
Connection: keep-alive,Foo, Bar
Foo: foo
Bar: bar
Proxy-Connection: keep-alive
Proxy-Authenticate: abc
Accept-Encoding: gzip
Accept-Charset: ISO-8859-1,UTF-8;q=0.7,*;q=0.7
Cache-Control: no-cache
Accept-Language: de,en;q=0.7,en-us;q=0.3

`
	b := bufio.NewReader(strings.NewReader(rawRequest))
	req, err := http.ReadRequest(b)
	assert(err, IsNil)
	assert(req.Header.Get("Foo"), Equals, "foo")
	assert(req.Header.Get("Bar"), Equals, "bar")
	assert(req.Header.Get("Connection"), Equals, "keep-alive,Foo, Bar")
	assert(req.Header.Get("Proxy-Connection"), Equals, "keep-alive")
	assert(req.Header.Get("Proxy-Authenticate"), Equals, "abc")

	RemoveHopByHopHeaders(req.Header)
	assert(req.Header.Get("Connection"), IsEmpty)
	assert(req.Header.Get("Foo"), IsEmpty)
	assert(req.Header.Get("Bar"), IsEmpty)
	assert(req.Header.Get("Proxy-Connection"), IsEmpty)
	assert(req.Header.Get("Proxy-Authenticate"), IsEmpty)
}
