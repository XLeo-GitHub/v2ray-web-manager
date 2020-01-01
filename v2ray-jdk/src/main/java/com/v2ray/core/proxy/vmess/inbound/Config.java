// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/proxy/vmess/inbound/config.proto

package com.v2ray.core.proxy.vmess.inbound;

/**
 * Protobuf type {@code v2ray.core.proxy.vmess.inbound.Config}
 */
public  final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.proxy.vmess.inbound.Config)
    ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    user_ = java.util.Collections.emptyList();
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              user_ = new java.util.ArrayList<com.v2ray.core.common.protocol.User>();
              mutable_bitField0_ |= 0x00000001;
            }
            user_.add(
                input.readMessage(com.v2ray.core.common.protocol.User.parser(), extensionRegistry));
            break;
          }
          case 18: {
            com.v2ray.core.proxy.vmess.inbound.DefaultConfig.Builder subBuilder = null;
            if (default_ != null) {
              subBuilder = default_.toBuilder();
            }
            default_ = input.readMessage(com.v2ray.core.proxy.vmess.inbound.DefaultConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(default_);
              default_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.v2ray.core.proxy.vmess.inbound.DetourConfig.Builder subBuilder = null;
            if (detour_ != null) {
              subBuilder = detour_.toBuilder();
            }
            detour_ = input.readMessage(com.v2ray.core.proxy.vmess.inbound.DetourConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(detour_);
              detour_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            secureEncryptionOnly_ = input.readBool();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        user_ = java.util.Collections.unmodifiableList(user_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.proxy.vmess.inbound.ConfigOuterClass.internal_static_v2ray_core_proxy_vmess_inbound_Config_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.proxy.vmess.inbound.ConfigOuterClass.internal_static_v2ray_core_proxy_vmess_inbound_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Config.class, Builder.class);
  }

  private int bitField0_;
  public static final int USER_FIELD_NUMBER = 1;
  private java.util.List<com.v2ray.core.common.protocol.User> user_;
  /**
   * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
   */
  public java.util.List<com.v2ray.core.common.protocol.User> getUserList() {
    return user_;
  }
  /**
   * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
   */
  public java.util.List<? extends com.v2ray.core.common.protocol.UserOrBuilder> 
      getUserOrBuilderList() {
    return user_;
  }
  /**
   * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
   */
  public int getUserCount() {
    return user_.size();
  }
  /**
   * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
   */
  public com.v2ray.core.common.protocol.User getUser(int index) {
    return user_.get(index);
  }
  /**
   * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
   */
  public com.v2ray.core.common.protocol.UserOrBuilder getUserOrBuilder(
      int index) {
    return user_.get(index);
  }

  public static final int DEFAULT_FIELD_NUMBER = 2;
  private com.v2ray.core.proxy.vmess.inbound.DefaultConfig default_;
  /**
   * <code>.v2ray.core.proxy.vmess.inbound.DefaultConfig default = 2;</code>
   */
  public boolean hasDefault() {
    return default_ != null;
  }
  /**
   * <code>.v2ray.core.proxy.vmess.inbound.DefaultConfig default = 2;</code>
   */
  public com.v2ray.core.proxy.vmess.inbound.DefaultConfig getDefault() {
    return default_ == null ? com.v2ray.core.proxy.vmess.inbound.DefaultConfig.getDefaultInstance() : default_;
  }
  /**
   * <code>.v2ray.core.proxy.vmess.inbound.DefaultConfig default = 2;</code>
   */
  public com.v2ray.core.proxy.vmess.inbound.DefaultConfigOrBuilder getDefaultOrBuilder() {
    return getDefault();
  }

  public static final int DETOUR_FIELD_NUMBER = 3;
  private com.v2ray.core.proxy.vmess.inbound.DetourConfig detour_;
  /**
   * <code>.v2ray.core.proxy.vmess.inbound.DetourConfig detour = 3;</code>
   */
  public boolean hasDetour() {
    return detour_ != null;
  }
  /**
   * <code>.v2ray.core.proxy.vmess.inbound.DetourConfig detour = 3;</code>
   */
  public com.v2ray.core.proxy.vmess.inbound.DetourConfig getDetour() {
    return detour_ == null ? com.v2ray.core.proxy.vmess.inbound.DetourConfig.getDefaultInstance() : detour_;
  }
  /**
   * <code>.v2ray.core.proxy.vmess.inbound.DetourConfig detour = 3;</code>
   */
  public com.v2ray.core.proxy.vmess.inbound.DetourConfigOrBuilder getDetourOrBuilder() {
    return getDetour();
  }

  public static final int SECURE_ENCRYPTION_ONLY_FIELD_NUMBER = 4;
  private boolean secureEncryptionOnly_;
  /**
   * <code>bool secure_encryption_only = 4;</code>
   */
  public boolean getSecureEncryptionOnly() {
    return secureEncryptionOnly_;
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
    for (int i = 0; i < user_.size(); i++) {
      output.writeMessage(1, user_.get(i));
    }
    if (default_ != null) {
      output.writeMessage(2, getDefault());
    }
    if (detour_ != null) {
      output.writeMessage(3, getDetour());
    }
    if (secureEncryptionOnly_ != false) {
      output.writeBool(4, secureEncryptionOnly_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < user_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, user_.get(i));
    }
    if (default_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDefault());
    }
    if (detour_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDetour());
    }
    if (secureEncryptionOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, secureEncryptionOnly_);
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

    if (!getUserList()
        .equals(other.getUserList())) return false;
    if (hasDefault() != other.hasDefault()) return false;
    if (hasDefault()) {
      if (!getDefault()
          .equals(other.getDefault())) return false;
    }
    if (hasDetour() != other.hasDetour()) return false;
    if (hasDetour()) {
      if (!getDetour()
          .equals(other.getDetour())) return false;
    }
    if (getSecureEncryptionOnly()
        != other.getSecureEncryptionOnly()) return false;
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
    if (getUserCount() > 0) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUserList().hashCode();
    }
    if (hasDefault()) {
      hash = (37 * hash) + DEFAULT_FIELD_NUMBER;
      hash = (53 * hash) + getDefault().hashCode();
    }
    if (hasDetour()) {
      hash = (37 * hash) + DETOUR_FIELD_NUMBER;
      hash = (53 * hash) + getDetour().hashCode();
    }
    hash = (37 * hash) + SECURE_ENCRYPTION_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSecureEncryptionOnly());
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
   * Protobuf type {@code v2ray.core.proxy.vmess.inbound.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.proxy.vmess.inbound.Config)
      com.v2ray.core.proxy.vmess.inbound.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.proxy.vmess.inbound.ConfigOuterClass.internal_static_v2ray_core_proxy_vmess_inbound_Config_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.proxy.vmess.inbound.ConfigOuterClass.internal_static_v2ray_core_proxy_vmess_inbound_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Config.class, Builder.class);
    }

    // Construct using com.v2ray.core.proxy.vmess.inbound.Config.newBuilder()
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
        getUserFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      if (userBuilder_ == null) {
        user_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        userBuilder_.clear();
      }
      if (defaultBuilder_ == null) {
        default_ = null;
      } else {
        default_ = null;
        defaultBuilder_ = null;
      }
      if (detourBuilder_ == null) {
        detour_ = null;
      } else {
        detour_ = null;
        detourBuilder_ = null;
      }
      secureEncryptionOnly_ = false;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.proxy.vmess.inbound.ConfigOuterClass.internal_static_v2ray_core_proxy_vmess_inbound_Config_descriptor;
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
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (userBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          user_ = java.util.Collections.unmodifiableList(user_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.user_ = user_;
      } else {
        result.user_ = userBuilder_.build();
      }
      if (defaultBuilder_ == null) {
        result.default_ = default_;
      } else {
        result.default_ = defaultBuilder_.build();
      }
      if (detourBuilder_ == null) {
        result.detour_ = detour_;
      } else {
        result.detour_ = detourBuilder_.build();
      }
      result.secureEncryptionOnly_ = secureEncryptionOnly_;
      result.bitField0_ = to_bitField0_;
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
      if (userBuilder_ == null) {
        if (!other.user_.isEmpty()) {
          if (user_.isEmpty()) {
            user_ = other.user_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUserIsMutable();
            user_.addAll(other.user_);
          }
          onChanged();
        }
      } else {
        if (!other.user_.isEmpty()) {
          if (userBuilder_.isEmpty()) {
            userBuilder_.dispose();
            userBuilder_ = null;
            user_ = other.user_;
            bitField0_ = (bitField0_ & ~0x00000001);
            userBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUserFieldBuilder() : null;
          } else {
            userBuilder_.addAllMessages(other.user_);
          }
        }
      }
      if (other.hasDefault()) {
        mergeDefault(other.getDefault());
      }
      if (other.hasDetour()) {
        mergeDetour(other.getDetour());
      }
      if (other.getSecureEncryptionOnly() != false) {
        setSecureEncryptionOnly(other.getSecureEncryptionOnly());
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
    private int bitField0_;

    private java.util.List<com.v2ray.core.common.protocol.User> user_ =
      java.util.Collections.emptyList();
    private void ensureUserIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        user_ = new java.util.ArrayList<com.v2ray.core.common.protocol.User>(user_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.common.protocol.User, com.v2ray.core.common.protocol.User.Builder, com.v2ray.core.common.protocol.UserOrBuilder> userBuilder_;

    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
     */
    public java.util.List<com.v2ray.core.common.protocol.User> getUserList() {
      if (userBuilder_ == null) {
        return java.util.Collections.unmodifiableList(user_);
      } else {
        return userBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
     */
    public int getUserCount() {
      if (userBuilder_ == null) {
        return user_.size();
      } else {
        return userBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
     */
    public com.v2ray.core.common.protocol.User getUser(int index) {
      if (userBuilder_ == null) {
        return user_.get(index);
      } else {
        return userBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
     */
    public Builder setUser(
        int index, com.v2ray.core.common.protocol.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserIsMutable();
        user_.set(index, value);
        onChanged();
      } else {
        userBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
     */
    public Builder setUser(
        int index, com.v2ray.core.common.protocol.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        user_.set(index, builderForValue.build());
        onChanged();
      } else {
        userBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
     */
    public Builder addUser(com.v2ray.core.common.protocol.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserIsMutable();
        user_.add(value);
        onChanged();
      } else {
        userBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
     */
    public Builder addUser(
        int index, com.v2ray.core.common.protocol.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserIsMutable();
        user_.add(index, value);
        onChanged();
      } else {
        userBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
     */
    public Builder addUser(
        com.v2ray.core.common.protocol.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        user_.add(builderForValue.build());
        onChanged();
      } else {
        userBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
     */
    public Builder addUser(
        int index, com.v2ray.core.common.protocol.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        user_.add(index, builderForValue.build());
        onChanged();
      } else {
        userBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
     */
    public Builder addAllUser(
        Iterable<? extends com.v2ray.core.common.protocol.User> values) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, user_);
        onChanged();
      } else {
        userBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        user_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        userBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
     */
    public Builder removeUser(int index) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        user_.remove(index);
        onChanged();
      } else {
        userBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
     */
    public com.v2ray.core.common.protocol.User.Builder getUserBuilder(
        int index) {
      return getUserFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
     */
    public com.v2ray.core.common.protocol.UserOrBuilder getUserOrBuilder(
        int index) {
      if (userBuilder_ == null) {
        return user_.get(index);  } else {
        return userBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
     */
    public java.util.List<? extends com.v2ray.core.common.protocol.UserOrBuilder> 
         getUserOrBuilderList() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(user_);
      }
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
     */
    public com.v2ray.core.common.protocol.User.Builder addUserBuilder() {
      return getUserFieldBuilder().addBuilder(
          com.v2ray.core.common.protocol.User.getDefaultInstance());
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
     */
    public com.v2ray.core.common.protocol.User.Builder addUserBuilder(
        int index) {
      return getUserFieldBuilder().addBuilder(
          index, com.v2ray.core.common.protocol.User.getDefaultInstance());
    }
    /**
     * <code>repeated .v2ray.core.common.protocol.User user = 1;</code>
     */
    public java.util.List<com.v2ray.core.common.protocol.User.Builder> 
         getUserBuilderList() {
      return getUserFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.common.protocol.User, com.v2ray.core.common.protocol.User.Builder, com.v2ray.core.common.protocol.UserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.v2ray.core.common.protocol.User, com.v2ray.core.common.protocol.User.Builder, com.v2ray.core.common.protocol.UserOrBuilder>(
                user_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }

    private com.v2ray.core.proxy.vmess.inbound.DefaultConfig default_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.proxy.vmess.inbound.DefaultConfig, com.v2ray.core.proxy.vmess.inbound.DefaultConfig.Builder, com.v2ray.core.proxy.vmess.inbound.DefaultConfigOrBuilder> defaultBuilder_;
    /**
     * <code>.v2ray.core.proxy.vmess.inbound.DefaultConfig default = 2;</code>
     */
    public boolean hasDefault() {
      return defaultBuilder_ != null || default_ != null;
    }
    /**
     * <code>.v2ray.core.proxy.vmess.inbound.DefaultConfig default = 2;</code>
     */
    public com.v2ray.core.proxy.vmess.inbound.DefaultConfig getDefault() {
      if (defaultBuilder_ == null) {
        return default_ == null ? com.v2ray.core.proxy.vmess.inbound.DefaultConfig.getDefaultInstance() : default_;
      } else {
        return defaultBuilder_.getMessage();
      }
    }
    /**
     * <code>.v2ray.core.proxy.vmess.inbound.DefaultConfig default = 2;</code>
     */
    public Builder setDefault(com.v2ray.core.proxy.vmess.inbound.DefaultConfig value) {
      if (defaultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        default_ = value;
        onChanged();
      } else {
        defaultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.proxy.vmess.inbound.DefaultConfig default = 2;</code>
     */
    public Builder setDefault(
        com.v2ray.core.proxy.vmess.inbound.DefaultConfig.Builder builderForValue) {
      if (defaultBuilder_ == null) {
        default_ = builderForValue.build();
        onChanged();
      } else {
        defaultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.v2ray.core.proxy.vmess.inbound.DefaultConfig default = 2;</code>
     */
    public Builder mergeDefault(com.v2ray.core.proxy.vmess.inbound.DefaultConfig value) {
      if (defaultBuilder_ == null) {
        if (default_ != null) {
          default_ =
            com.v2ray.core.proxy.vmess.inbound.DefaultConfig.newBuilder(default_).mergeFrom(value).buildPartial();
        } else {
          default_ = value;
        }
        onChanged();
      } else {
        defaultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.proxy.vmess.inbound.DefaultConfig default = 2;</code>
     */
    public Builder clearDefault() {
      if (defaultBuilder_ == null) {
        default_ = null;
        onChanged();
      } else {
        default_ = null;
        defaultBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.v2ray.core.proxy.vmess.inbound.DefaultConfig default = 2;</code>
     */
    public com.v2ray.core.proxy.vmess.inbound.DefaultConfig.Builder getDefaultBuilder() {
      
      onChanged();
      return getDefaultFieldBuilder().getBuilder();
    }
    /**
     * <code>.v2ray.core.proxy.vmess.inbound.DefaultConfig default = 2;</code>
     */
    public com.v2ray.core.proxy.vmess.inbound.DefaultConfigOrBuilder getDefaultOrBuilder() {
      if (defaultBuilder_ != null) {
        return defaultBuilder_.getMessageOrBuilder();
      } else {
        return default_ == null ?
            com.v2ray.core.proxy.vmess.inbound.DefaultConfig.getDefaultInstance() : default_;
      }
    }
    /**
     * <code>.v2ray.core.proxy.vmess.inbound.DefaultConfig default = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.proxy.vmess.inbound.DefaultConfig, com.v2ray.core.proxy.vmess.inbound.DefaultConfig.Builder, com.v2ray.core.proxy.vmess.inbound.DefaultConfigOrBuilder> 
        getDefaultFieldBuilder() {
      if (defaultBuilder_ == null) {
        defaultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.proxy.vmess.inbound.DefaultConfig, com.v2ray.core.proxy.vmess.inbound.DefaultConfig.Builder, com.v2ray.core.proxy.vmess.inbound.DefaultConfigOrBuilder>(
                getDefault(),
                getParentForChildren(),
                isClean());
        default_ = null;
      }
      return defaultBuilder_;
    }

    private com.v2ray.core.proxy.vmess.inbound.DetourConfig detour_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.proxy.vmess.inbound.DetourConfig, com.v2ray.core.proxy.vmess.inbound.DetourConfig.Builder, com.v2ray.core.proxy.vmess.inbound.DetourConfigOrBuilder> detourBuilder_;
    /**
     * <code>.v2ray.core.proxy.vmess.inbound.DetourConfig detour = 3;</code>
     */
    public boolean hasDetour() {
      return detourBuilder_ != null || detour_ != null;
    }
    /**
     * <code>.v2ray.core.proxy.vmess.inbound.DetourConfig detour = 3;</code>
     */
    public com.v2ray.core.proxy.vmess.inbound.DetourConfig getDetour() {
      if (detourBuilder_ == null) {
        return detour_ == null ? com.v2ray.core.proxy.vmess.inbound.DetourConfig.getDefaultInstance() : detour_;
      } else {
        return detourBuilder_.getMessage();
      }
    }
    /**
     * <code>.v2ray.core.proxy.vmess.inbound.DetourConfig detour = 3;</code>
     */
    public Builder setDetour(com.v2ray.core.proxy.vmess.inbound.DetourConfig value) {
      if (detourBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        detour_ = value;
        onChanged();
      } else {
        detourBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.proxy.vmess.inbound.DetourConfig detour = 3;</code>
     */
    public Builder setDetour(
        com.v2ray.core.proxy.vmess.inbound.DetourConfig.Builder builderForValue) {
      if (detourBuilder_ == null) {
        detour_ = builderForValue.build();
        onChanged();
      } else {
        detourBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.v2ray.core.proxy.vmess.inbound.DetourConfig detour = 3;</code>
     */
    public Builder mergeDetour(com.v2ray.core.proxy.vmess.inbound.DetourConfig value) {
      if (detourBuilder_ == null) {
        if (detour_ != null) {
          detour_ =
            com.v2ray.core.proxy.vmess.inbound.DetourConfig.newBuilder(detour_).mergeFrom(value).buildPartial();
        } else {
          detour_ = value;
        }
        onChanged();
      } else {
        detourBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.v2ray.core.proxy.vmess.inbound.DetourConfig detour = 3;</code>
     */
    public Builder clearDetour() {
      if (detourBuilder_ == null) {
        detour_ = null;
        onChanged();
      } else {
        detour_ = null;
        detourBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.v2ray.core.proxy.vmess.inbound.DetourConfig detour = 3;</code>
     */
    public com.v2ray.core.proxy.vmess.inbound.DetourConfig.Builder getDetourBuilder() {
      
      onChanged();
      return getDetourFieldBuilder().getBuilder();
    }
    /**
     * <code>.v2ray.core.proxy.vmess.inbound.DetourConfig detour = 3;</code>
     */
    public com.v2ray.core.proxy.vmess.inbound.DetourConfigOrBuilder getDetourOrBuilder() {
      if (detourBuilder_ != null) {
        return detourBuilder_.getMessageOrBuilder();
      } else {
        return detour_ == null ?
            com.v2ray.core.proxy.vmess.inbound.DetourConfig.getDefaultInstance() : detour_;
      }
    }
    /**
     * <code>.v2ray.core.proxy.vmess.inbound.DetourConfig detour = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.v2ray.core.proxy.vmess.inbound.DetourConfig, com.v2ray.core.proxy.vmess.inbound.DetourConfig.Builder, com.v2ray.core.proxy.vmess.inbound.DetourConfigOrBuilder> 
        getDetourFieldBuilder() {
      if (detourBuilder_ == null) {
        detourBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.v2ray.core.proxy.vmess.inbound.DetourConfig, com.v2ray.core.proxy.vmess.inbound.DetourConfig.Builder, com.v2ray.core.proxy.vmess.inbound.DetourConfigOrBuilder>(
                getDetour(),
                getParentForChildren(),
                isClean());
        detour_ = null;
      }
      return detourBuilder_;
    }

    private boolean secureEncryptionOnly_ ;
    /**
     * <code>bool secure_encryption_only = 4;</code>
     */
    public boolean getSecureEncryptionOnly() {
      return secureEncryptionOnly_;
    }
    /**
     * <code>bool secure_encryption_only = 4;</code>
     */
    public Builder setSecureEncryptionOnly(boolean value) {
      
      secureEncryptionOnly_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool secure_encryption_only = 4;</code>
     */
    public Builder clearSecureEncryptionOnly() {
      
      secureEncryptionOnly_ = false;
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


    // @@protoc_insertion_point(builder_scope:v2ray.core.proxy.vmess.inbound.Config)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.proxy.vmess.inbound.Config)
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

