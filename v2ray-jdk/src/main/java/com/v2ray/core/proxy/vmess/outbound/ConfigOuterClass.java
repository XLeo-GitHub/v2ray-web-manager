// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/proxy/vmess/outbound/config.proto

package com.v2ray.core.proxy.vmess.outbound;

public final class ConfigOuterClass {
  private ConfigOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_v2ray_core_proxy_vmess_outbound_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_v2ray_core_proxy_vmess_outbound_Config_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n0v2ray.com/core/proxy/vmess/outbound/co" +
      "nfig.proto\022\037v2ray.core.proxy.vmess.outbo" +
      "und\0320v2ray.com/core/common/protocol/serv" +
      "er_spec.proto\"F\n\006Config\022<\n\010Receiver\030\001 \003(" +
      "\0132*.v2ray.core.common.protocol.ServerEnd" +
      "pointBS\n#com.v2ray.core.proxy.vmess.outb" +
      "oundP\001Z\010outbound\252\002\037V2Ray.Core.Proxy.Vmes" +
      "s.Outboundb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.v2ray.core.common.protocol.ServerSpec.getDescriptor(),
        }, assigner);
    internal_static_v2ray_core_proxy_vmess_outbound_Config_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_v2ray_core_proxy_vmess_outbound_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_v2ray_core_proxy_vmess_outbound_Config_descriptor,
        new String[] { "Receiver", });
    com.v2ray.core.common.protocol.ServerSpec.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
