// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/router/config.proto

package com.v2ray.core.app.router;

public interface GeoIPOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.app.router.GeoIP)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string country_code = 1;</code>
   */
  String getCountryCode();
  /**
   * <code>string country_code = 1;</code>
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
   */
  java.util.List<CIDR>
      getCidrList();
  /**
   * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
   */
  CIDR getCidr(int index);
  /**
   * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
   */
  int getCidrCount();
  /**
   * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
   */
  java.util.List<? extends CIDROrBuilder>
      getCidrOrBuilderList();
  /**
   * <code>repeated .v2ray.core.app.router.CIDR cidr = 2;</code>
   */
  CIDROrBuilder getCidrOrBuilder(
          int index);
}
