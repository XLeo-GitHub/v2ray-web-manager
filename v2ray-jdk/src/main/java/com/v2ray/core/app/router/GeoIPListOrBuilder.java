// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/router/config.proto

package com.v2ray.core.app.router;

public interface GeoIPListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:v2ray.core.app.router.GeoIPList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .v2ray.core.app.router.GeoIP entry = 1;</code>
   */
  java.util.List<GeoIP>
      getEntryList();
  /**
   * <code>repeated .v2ray.core.app.router.GeoIP entry = 1;</code>
   */
  GeoIP getEntry(int index);
  /**
   * <code>repeated .v2ray.core.app.router.GeoIP entry = 1;</code>
   */
  int getEntryCount();
  /**
   * <code>repeated .v2ray.core.app.router.GeoIP entry = 1;</code>
   */
  java.util.List<? extends GeoIPOrBuilder>
      getEntryOrBuilderList();
  /**
   * <code>repeated .v2ray.core.app.router.GeoIP entry = 1;</code>
   */
  GeoIPOrBuilder getEntryOrBuilder(
          int index);
}
