// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/transport/internet/websocket/config.proto

package com.v2ray.core.transport.internet.websocket;

/**
 * Protobuf type {@code v2ray.core.transport.internet.websocket.Config}
 */
public  final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.transport.internet.websocket.Config)
    ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    path_ = "";
    header_ = java.util.Collections.emptyList();
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
          case 18: {
            String s = input.readStringRequireUtf8();

            path_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              header_ = new java.util.ArrayList<com.v2ray.core.transport.internet.websocket.Header>();
              mutable_bitField0_ |= 0x00000002;
            }
            header_.add(
                input.readMessage(com.v2ray.core.transport.internet.websocket.Header.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        header_ = java.util.Collections.unmodifiableList(header_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.transport.internet.websocket.ConfigOuterClass.internal_static_v2ray_core_transport_internet_websocket_Config_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.transport.internet.websocket.ConfigOuterClass.internal_static_v2ray_core_transport_internet_websocket_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Config.class, Builder.class);
  }

  private int bitField0_;
  public static final int PATH_FIELD_NUMBER = 2;
  private volatile Object path_;
  /**
   * <pre>
   * URL path to the WebSocket service. Empty value means root(/).
   * </pre>
   *
   * <code>string path = 2;</code>
   */
  public String getPath() {
    Object ref = path_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * URL path to the WebSocket service. Empty value means root(/).
   * </pre>
   *
   * <code>string path = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPathBytes() {
    Object ref = path_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HEADER_FIELD_NUMBER = 3;
  private java.util.List<com.v2ray.core.transport.internet.websocket.Header> header_;
  /**
   * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
   */
  public java.util.List<com.v2ray.core.transport.internet.websocket.Header> getHeaderList() {
    return header_;
  }
  /**
   * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
   */
  public java.util.List<? extends com.v2ray.core.transport.internet.websocket.HeaderOrBuilder> 
      getHeaderOrBuilderList() {
    return header_;
  }
  /**
   * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
   */
  public int getHeaderCount() {
    return header_.size();
  }
  /**
   * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
   */
  public com.v2ray.core.transport.internet.websocket.Header getHeader(int index) {
    return header_.get(index);
  }
  /**
   * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
   */
  public com.v2ray.core.transport.internet.websocket.HeaderOrBuilder getHeaderOrBuilder(
      int index) {
    return header_.get(index);
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
    if (!getPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, path_);
    }
    for (int i = 0; i < header_.size(); i++) {
      output.writeMessage(3, header_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, path_);
    }
    for (int i = 0; i < header_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, header_.get(i));
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

    if (!getPath()
        .equals(other.getPath())) return false;
    if (!getHeaderList()
        .equals(other.getHeaderList())) return false;
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
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    if (getHeaderCount() > 0) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeaderList().hashCode();
    }
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
   * Protobuf type {@code v2ray.core.transport.internet.websocket.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.transport.internet.websocket.Config)
      com.v2ray.core.transport.internet.websocket.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.transport.internet.websocket.ConfigOuterClass.internal_static_v2ray_core_transport_internet_websocket_Config_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.transport.internet.websocket.ConfigOuterClass.internal_static_v2ray_core_transport_internet_websocket_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Config.class, Builder.class);
    }

    // Construct using com.v2ray.core.transport.internet.websocket.Config.newBuilder()
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
        getHeaderFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      path_ = "";

      if (headerBuilder_ == null) {
        header_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        headerBuilder_.clear();
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.transport.internet.websocket.ConfigOuterClass.internal_static_v2ray_core_transport_internet_websocket_Config_descriptor;
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
      result.path_ = path_;
      if (headerBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          header_ = java.util.Collections.unmodifiableList(header_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
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
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        onChanged();
      }
      if (headerBuilder_ == null) {
        if (!other.header_.isEmpty()) {
          if (header_.isEmpty()) {
            header_ = other.header_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureHeaderIsMutable();
            header_.addAll(other.header_);
          }
          onChanged();
        }
      } else {
        if (!other.header_.isEmpty()) {
          if (headerBuilder_.isEmpty()) {
            headerBuilder_.dispose();
            headerBuilder_ = null;
            header_ = other.header_;
            bitField0_ = (bitField0_ & ~0x00000002);
            headerBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getHeaderFieldBuilder() : null;
          } else {
            headerBuilder_.addAllMessages(other.header_);
          }
        }
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

    private Object path_ = "";
    /**
     * <pre>
     * URL path to the WebSocket service. Empty value means root(/).
     * </pre>
     *
     * <code>string path = 2;</code>
     */
    public String getPath() {
      Object ref = path_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * URL path to the WebSocket service. Empty value means root(/).
     * </pre>
     *
     * <code>string path = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * URL path to the WebSocket service. Empty value means root(/).
     * </pre>
     *
     * <code>string path = 2;</code>
     */
    public Builder setPath(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      path_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL path to the WebSocket service. Empty value means root(/).
     * </pre>
     *
     * <code>string path = 2;</code>
     */
    public Builder clearPath() {
      
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL path to the WebSocket service. Empty value means root(/).
     * </pre>
     *
     * <code>string path = 2;</code>
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      path_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.v2ray.core.transport.internet.websocket.Header> header_ =
      java.util.Collections.emptyList();
    private void ensureHeaderIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        header_ = new java.util.ArrayList<com.v2ray.core.transport.internet.websocket.Header>(header_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.transport.internet.websocket.Header, com.v2ray.core.transport.internet.websocket.Header.Builder, com.v2ray.core.transport.internet.websocket.HeaderOrBuilder> headerBuilder_;

    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public java.util.List<com.v2ray.core.transport.internet.websocket.Header> getHeaderList() {
      if (headerBuilder_ == null) {
        return java.util.Collections.unmodifiableList(header_);
      } else {
        return headerBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public int getHeaderCount() {
      if (headerBuilder_ == null) {
        return header_.size();
      } else {
        return headerBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public com.v2ray.core.transport.internet.websocket.Header getHeader(int index) {
      if (headerBuilder_ == null) {
        return header_.get(index);
      } else {
        return headerBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public Builder setHeader(
        int index, com.v2ray.core.transport.internet.websocket.Header value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHeaderIsMutable();
        header_.set(index, value);
        onChanged();
      } else {
        headerBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public Builder setHeader(
        int index, com.v2ray.core.transport.internet.websocket.Header.Builder builderForValue) {
      if (headerBuilder_ == null) {
        ensureHeaderIsMutable();
        header_.set(index, builderForValue.build());
        onChanged();
      } else {
        headerBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public Builder addHeader(com.v2ray.core.transport.internet.websocket.Header value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHeaderIsMutable();
        header_.add(value);
        onChanged();
      } else {
        headerBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public Builder addHeader(
        int index, com.v2ray.core.transport.internet.websocket.Header value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHeaderIsMutable();
        header_.add(index, value);
        onChanged();
      } else {
        headerBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public Builder addHeader(
        com.v2ray.core.transport.internet.websocket.Header.Builder builderForValue) {
      if (headerBuilder_ == null) {
        ensureHeaderIsMutable();
        header_.add(builderForValue.build());
        onChanged();
      } else {
        headerBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public Builder addHeader(
        int index, com.v2ray.core.transport.internet.websocket.Header.Builder builderForValue) {
      if (headerBuilder_ == null) {
        ensureHeaderIsMutable();
        header_.add(index, builderForValue.build());
        onChanged();
      } else {
        headerBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public Builder addAllHeader(
        Iterable<? extends com.v2ray.core.transport.internet.websocket.Header> values) {
      if (headerBuilder_ == null) {
        ensureHeaderIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, header_);
        onChanged();
      } else {
        headerBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        headerBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public Builder removeHeader(int index) {
      if (headerBuilder_ == null) {
        ensureHeaderIsMutable();
        header_.remove(index);
        onChanged();
      } else {
        headerBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public com.v2ray.core.transport.internet.websocket.Header.Builder getHeaderBuilder(
        int index) {
      return getHeaderFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public com.v2ray.core.transport.internet.websocket.HeaderOrBuilder getHeaderOrBuilder(
        int index) {
      if (headerBuilder_ == null) {
        return header_.get(index);  } else {
        return headerBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public java.util.List<? extends com.v2ray.core.transport.internet.websocket.HeaderOrBuilder> 
         getHeaderOrBuilderList() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(header_);
      }
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public com.v2ray.core.transport.internet.websocket.Header.Builder addHeaderBuilder() {
      return getHeaderFieldBuilder().addBuilder(
          com.v2ray.core.transport.internet.websocket.Header.getDefaultInstance());
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public com.v2ray.core.transport.internet.websocket.Header.Builder addHeaderBuilder(
        int index) {
      return getHeaderFieldBuilder().addBuilder(
          index, com.v2ray.core.transport.internet.websocket.Header.getDefaultInstance());
    }
    /**
     * <code>repeated .v2ray.core.transport.internet.websocket.Header header = 3;</code>
     */
    public java.util.List<com.v2ray.core.transport.internet.websocket.Header.Builder> 
         getHeaderBuilderList() {
      return getHeaderFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.v2ray.core.transport.internet.websocket.Header, com.v2ray.core.transport.internet.websocket.Header.Builder, com.v2ray.core.transport.internet.websocket.HeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.v2ray.core.transport.internet.websocket.Header, com.v2ray.core.transport.internet.websocket.Header.Builder, com.v2ray.core.transport.internet.websocket.HeaderOrBuilder>(
                header_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:v2ray.core.transport.internet.websocket.Config)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.transport.internet.websocket.Config)
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

