// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/proxy/dokodemo/config.proto

package com.v2ray.core.proxy.dokodemo;

/**
 * Protobuf type {@code v2ray.core.proxy.dokodemo.Config}
 */
public  final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.proxy.dokodemo.Config)
    ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Config(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.v2ray.core.common.net.IPOrDomain.Builder subBuilder = null;
            if (address_ != null) {
              subBuilder = address_.toBuilder();
            }
            address_ = input.readMessage(com.v2ray.core.common.net.IPOrDomain.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(address_);
              address_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            port_ = input.readUInt32();
            break;
          }
          case 26: {
            com.v2ray.core.common.net.NetworkList.Builder subBuilder = null;
            if (networkList_ != null) {
              subBuilder = networkList_.toBuilder();
            }
            networkList_ = input.readMessage(com.v2ray.core.common.net.NetworkList.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(networkList_);
              networkList_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            timeout_ = input.readUInt32();
            break;
          }
          case 40: {

            followRedirect_ = input.readBool();
            break;
          }
          case 48: {

            userLevel_ = input.readUInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.proxy.dokodemo.ConfigOuterClass.internal_static_v2ray_core_proxy_dokodemo_Config_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.proxy.dokodemo.ConfigOuterClass.internal_static_v2ray_core_proxy_dokodemo_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Config.class, Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  private com.v2ray.core.common.net.IPOrDomain address_;
  /**
   * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
   */
  public boolean hasAddress() {
    return address_ != null;
  }
  /**
   * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
   */
  public com.v2ray.core.common.net.IPOrDomain getAddress() {
    return address_ == null ? com.v2ray.core.common.net.IPOrDomain.getDefaultInstance() : address_;
  }
  /**
   * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
   */
  public com.v2ray.core.common.net.IPOrDomainOrBuilder getAddressOrBuilder() {
    return getAddress();
  }

  public static final int PORT_FIELD_NUMBER = 2;
  private int port_;
  /**
   * <code>uint32 port = 2;</code>
   */
  public int getPort() {
    return port_;
  }

  public static final int NETWORK_LIST_FIELD_NUMBER = 3;
  private com.v2ray.core.common.net.NetworkList networkList_;
  /**
   * <code>.v2ray.core.common.net.NetworkList network_list = 3;</code>
   */
  public boolean hasNetworkList() {
    return networkList_ != null;
  }
  /**
   * <code>.v2ray.core.common.net.NetworkList network_list = 3;</code>
   */
  public com.v2ray.core.common.net.NetworkList getNetworkList() {
    return networkList_ == null ? com.v2ray.core.common.net.NetworkList.getDefaultInstance() : networkList_;
  }
  /**
   * <code>.v2ray.core.common.net.NetworkList network_list = 3;</code>
   */
  public com.v2ray.core.common.net.NetworkListOrBuilder getNetworkListOrBuilder() {
    return getNetworkList();
  }

  public static final int TIMEOUT_FIELD_NUMBER = 4;
  private int timeout_;
  /**
   * <code>uint32 timeout = 4 [deprecated = true];</code>
   */
  @Deprecated public int getTimeout() {
    return timeout_;
  }

  public static final int FOLLOW_REDIRECT_FIELD_NUMBER = 5;
  private boolean followRedirect_;
  /**
   * <code>bool follow_redirect = 5;</code>
   */
  public boolean getFollowRedirect() {
    return followRedirect_;
  }

  public static final int USER_LEVEL_FIELD_NUMBER = 6;
  private int userLevel_;
  /**
   * <code>uint32 user_level = 6;</code>
   */
  public int getUserLevel() {
    return userLevel_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (address_ != null) {
      output.writeMessage(1, getAddress());
    }
    if (port_ != 0) {
      output.writeUInt32(2, port_);
    }
    if (networkList_ != null) {
      output.writeMessage(3, getNetworkList());
    }
    if (timeout_ != 0) {
      output.writeUInt32(4, timeout_);
    }
    if (followRedirect_ != false) {
      output.writeBool(5, followRedirect_);
    }
    if (userLevel_ != 0) {
      output.writeUInt32(6, userLevel_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (address_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAddress());
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, port_);
    }
    if (networkList_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getNetworkList());
    }
    if (timeout_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, timeout_);
    }
    if (followRedirect_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, followRedirect_);
    }
    if (userLevel_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, userLevel_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Config)) {
      return super.equals(obj);
    }
    Config other = (Config) obj;

    if (hasAddress() != other.hasAddress()) return false;
    if (hasAddress()) {
      if (!getAddress()
          .equals(other.getAddress())) return false;
    }
    if (getPort()
        != other.getPort()) return false;
    if (hasNetworkList() != other.hasNetworkList()) return false;
    if (hasNetworkList()) {
      if (!getNetworkList()
          .equals(other.getNetworkList())) return false;
    }
    if (getTimeout()
        != other.getTimeout()) return false;
    if (getFollowRedirect()
        != other.getFollowRedirect()) return false;
    if (getUserLevel()
        != other.getUserLevel()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAddress()) {
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
    }
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    if (hasNetworkList()) {
      hash = (37 * hash) + NETWORK_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getNetworkList().hashCode();
    }
    hash = (37 * hash) + TIMEOUT_FIELD_NUMBER;
    hash = (53 * hash) + getTimeout();
    hash = (37 * hash) + FOLLOW_REDIRECT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFollowRedirect());
    hash = (37 * hash) + USER_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getUserLevel();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Config parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Config parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Config parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Config prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code v2ray.core.proxy.dokodemo.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.proxy.dokodemo.Config)
      com.v2ray.core.proxy.dokodemo.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.proxy.dokodemo.ConfigOuterClass.internal_static_v2ray_core_proxy_dokodemo_Config_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.proxy.dokodemo.ConfigOuterClass.internal_static_v2ray_core_proxy_dokodemo_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Config.class, Builder.class);
    }

    // Construct using com.v2ray.core.proxy.dokodemo.Config.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      if (addressBuilder_ == null) {
        address_ = null;
      } else {
        address_ = null;
        addressBuilder_ = null;
      }
      port_ = 0;

      if (networkListBuilder_ == null) {
        networkList_ = null;
      } else {
        networkList_ = null;
        networkListBuilder_ = null;
      }
      timeout_ = 0;

      followRedirect_ = false;

      userLevel_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.proxy.dokodemo.ConfigOuterClass.internal_static_v2ray_core_proxy_dokodemo_Config_descriptor;
    }

    @Override
    public Config getDefaultInstanceForType() {
      return Config.getDefaultInstance();
    }

    @Override
    public Config build() {
      Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Config buildPartial() {
      Config result = new Config(this);
      if (addressBuilder_ == null) {
        result.address_ = address_;
      } else {
        result.address_ = addressBuilder_.build();
      }
      result.port_ = port_;
      if (networkListBuilder_ == null) {
        result.networkList_ = networkList_;
      } else {
        result.networkList_ = networkListBuilder_.build();
      }
      result.timeout_ = timeout_;
      result.followRedirect_ = followRedirect_;
      result.userLevel_ = userLevel_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Config) {
        return mergeFrom((Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Config other) {
      if (other == Config.getDefaultInstance()) return this;
      if (other.hasAddress()) {
        mergeAddress(other.getAddress());
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
      }
      if (other.hasNetworkList()) {
        mergeNetworkList(other.getNetworkList());
      }
      if (other.getTimeout() != 0) {
        setTimeout(other.getTimeout());
      }
      if (other.getFollowRedirect() != false) {
        setFollowRedirect(other.getFollowRedirect());
      }
      if (other.getUserLevel() != 0) {
        setUserLevel(other.getUserLevel());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Config parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Config) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.v2ray.core.common.net.IPOrDomain address_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.net.IPOrDomain, com.v2ray.core.common.net.IPOrDomain.Builder, com.v2ray.core.common.net.IPOrDomainOrBuilder> addressBuilder_;
    /**
     * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
     */
    public boolean hasAddress() {
      return addressBuilder_ != null || address_ != null;
    }
    /**
     * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
     */
    public com.v2ray.core.common.net.IPOrDomain getAddress() {
      if (addressBuilder_ == null) {
        return address_ == null ? com.v2ray.core.common.net.IPOrDomain.getDefaultInstance() : address_;
      } else {
        return addressBuilder_.getMessage();
      }
    }
    /**
     * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
     */
    public Builder setAddress(com.v2ray.core.common.net.IPOrDomain value) {
      if (addressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        address_ = value;
        onChanged();
      } else {
        addressBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
     */
    public Builder setAddress(
        com.v2ray.core.common.net.IPOrDomain.Builder builderForValue) {
      if (addressBuilder_ == null) {
        address_ = builderForValue.build();
        onChanged();
      } else {
        addressBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
     */
    public Builder mergeAddress(com.v2ray.core.common.net.IPOrDomain value) {
      if (addressBuilder_ == null) {
        if (address_ != null) {
          address_ =
            com.v2ray.core.common.net.IPOrDomain.newBuilder(address_).mergeFrom(value).buildPartial();
        } else {
          address_ = value;
        }
        onChanged();
      } else {
        addressBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
     */
    public Builder clearAddress() {
      if (addressBuilder_ == null) {
        address_ = null;
        onChanged();
      } else {
        address_ = null;
        addressBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
     */
    public com.v2ray.core.common.net.IPOrDomain.Builder getAddressBuilder() {
      
      onChanged();
      return getAddressFieldBuilder().getBuilder();
    }
    /**
     * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
     */
    public com.v2ray.core.common.net.IPOrDomainOrBuilder getAddressOrBuilder() {
      if (addressBuilder_ != null) {
        return addressBuilder_.getMessageOrBuilder();
      } else {
        return address_ == null ?
            com.v2ray.core.common.net.IPOrDomain.getDefaultInstance() : address_;
      }
    }
    /**
     * <code>.v2ray.core.common.net.IPOrDomain address = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.net.IPOrDomain, com.v2ray.core.common.net.IPOrDomain.Builder, com.v2ray.core.common.net.IPOrDomainOrBuilder> 
        getAddressFieldBuilder() {
      if (addressBuilder_ == null) {
        addressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.common.net.IPOrDomain, com.v2ray.core.common.net.IPOrDomain.Builder, com.v2ray.core.common.net.IPOrDomainOrBuilder>(
                getAddress(),
                getParentForChildren(),
                isClean());
        address_ = null;
      }
      return addressBuilder_;
    }

    private int port_ ;
    /**
     * <code>uint32 port = 2;</code>
     */
    public int getPort() {
      return port_;
    }
    /**
     * <code>uint32 port = 2;</code>
     */
    public Builder setPort(int value) {
      
      port_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 port = 2;</code>
     */
    public Builder clearPort() {
      
      port_ = 0;
      onChanged();
      return this;
    }

    private com.v2ray.core.common.net.NetworkList networkList_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.net.NetworkList, com.v2ray.core.common.net.NetworkList.Builder, com.v2ray.core.common.net.NetworkListOrBuilder> networkListBuilder_;
    /**
     * <code>.v2ray.core.common.net.NetworkList network_list = 3;</code>
     */
    public boolean hasNetworkList() {
      return networkListBuilder_ != null || networkList_ != null;
    }
    /**
     * <code>.v2ray.core.common.net.NetworkList network_list = 3;</code>
     */
    public com.v2ray.core.common.net.NetworkList getNetworkList() {
      if (networkListBuilder_ == null) {
        return networkList_ == null ? com.v2ray.core.common.net.NetworkList.getDefaultInstance() : networkList_;
      } else {
        return networkListBuilder_.getMessage();
      }
    }
    /**
     * <code>.v2ray.core.common.net.NetworkList network_list = 3;</code>
     */
    public Builder setNetworkList(com.v2ray.core.common.net.NetworkList value) {
      if (networkListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        networkList_ = value;
        onChanged();
      } else {
        networkListBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.net.NetworkList network_list = 3;</code>
     */
    public Builder setNetworkList(
        com.v2ray.core.common.net.NetworkList.Builder builderForValue) {
      if (networkListBuilder_ == null) {
        networkList_ = builderForValue.build();
        onChanged();
      } else {
        networkListBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.net.NetworkList network_list = 3;</code>
     */
    public Builder mergeNetworkList(com.v2ray.core.common.net.NetworkList value) {
      if (networkListBuilder_ == null) {
        if (networkList_ != null) {
          networkList_ =
            com.v2ray.core.common.net.NetworkList.newBuilder(networkList_).mergeFrom(value).buildPartial();
        } else {
          networkList_ = value;
        }
        onChanged();
      } else {
        networkListBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.net.NetworkList network_list = 3;</code>
     */
    public Builder clearNetworkList() {
      if (networkListBuilder_ == null) {
        networkList_ = null;
        onChanged();
      } else {
        networkList_ = null;
        networkListBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.v2ray.core.common.net.NetworkList network_list = 3;</code>
     */
    public com.v2ray.core.common.net.NetworkList.Builder getNetworkListBuilder() {
      
      onChanged();
      return getNetworkListFieldBuilder().getBuilder();
    }
    /**
     * <code>.v2ray.core.common.net.NetworkList network_list = 3;</code>
     */
    public com.v2ray.core.common.net.NetworkListOrBuilder getNetworkListOrBuilder() {
      if (networkListBuilder_ != null) {
        return networkListBuilder_.getMessageOrBuilder();
      } else {
        return networkList_ == null ?
            com.v2ray.core.common.net.NetworkList.getDefaultInstance() : networkList_;
      }
    }
    /**
     * <code>.v2ray.core.common.net.NetworkList network_list = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.common.net.NetworkList, com.v2ray.core.common.net.NetworkList.Builder, com.v2ray.core.common.net.NetworkListOrBuilder> 
        getNetworkListFieldBuilder() {
      if (networkListBuilder_ == null) {
        networkListBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.common.net.NetworkList, com.v2ray.core.common.net.NetworkList.Builder, com.v2ray.core.common.net.NetworkListOrBuilder>(
                getNetworkList(),
                getParentForChildren(),
                isClean());
        networkList_ = null;
      }
      return networkListBuilder_;
    }

    private int timeout_ ;
    /**
     * <code>uint32 timeout = 4 [deprecated = true];</code>
     */
    @Deprecated public int getTimeout() {
      return timeout_;
    }
    /**
     * <code>uint32 timeout = 4 [deprecated = true];</code>
     */
    @Deprecated public Builder setTimeout(int value) {
      
      timeout_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 timeout = 4 [deprecated = true];</code>
     */
    @Deprecated public Builder clearTimeout() {
      
      timeout_ = 0;
      onChanged();
      return this;
    }

    private boolean followRedirect_ ;
    /**
     * <code>bool follow_redirect = 5;</code>
     */
    public boolean getFollowRedirect() {
      return followRedirect_;
    }
    /**
     * <code>bool follow_redirect = 5;</code>
     */
    public Builder setFollowRedirect(boolean value) {
      
      followRedirect_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool follow_redirect = 5;</code>
     */
    public Builder clearFollowRedirect() {
      
      followRedirect_ = false;
      onChanged();
      return this;
    }

    private int userLevel_ ;
    /**
     * <code>uint32 user_level = 6;</code>
     */
    public int getUserLevel() {
      return userLevel_;
    }
    /**
     * <code>uint32 user_level = 6;</code>
     */
    public Builder setUserLevel(int value) {
      
      userLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 user_level = 6;</code>
     */
    public Builder clearUserLevel() {
      
      userLevel_ = 0;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:v2ray.core.proxy.dokodemo.Config)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.proxy.dokodemo.Config)
  private static final Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Config();
  }

  public static Config getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Config>
      PARSER = new com.google.protobuf.AbstractParser<Config>() {
    @Override
    public Config parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Config(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Config> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Config> getParserForType() {
    return PARSER;
  }

  @Override
  public Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

