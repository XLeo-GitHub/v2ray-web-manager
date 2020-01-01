// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/common/net/network.proto

package com.v2ray.core.common.net;

/**
 * <pre>
 * NetworkList is a list of Networks.
 * </pre>
 *
 * Protobuf type {@code v2ray.core.common.net.NetworkList}
 */
public  final class NetworkList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.common.net.NetworkList)
    NetworkListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NetworkList.newBuilder() to construct.
  private NetworkList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NetworkList() {
    network_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NetworkList(
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
          case 8: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              network_ = new java.util.ArrayList<Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            network_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                network_ = new java.util.ArrayList<Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              network_.add(rawValue);
            }
            input.popLimit(oldLimit);
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
        network_ = java.util.Collections.unmodifiableList(network_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.common.net.NetworkOuterClass.internal_static_v2ray_core_common_net_NetworkList_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.common.net.NetworkOuterClass.internal_static_v2ray_core_common_net_NetworkList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            NetworkList.class, Builder.class);
  }

  public static final int NETWORK_FIELD_NUMBER = 1;
  private java.util.List<Integer> network_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      Integer, Network> network_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              Integer, Network>() {
            public Network convert(Integer from) {
              @SuppressWarnings("deprecation")
              Network result = Network.valueOf(from);
              return result == null ? Network.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
   */
  public java.util.List<Network> getNetworkList() {
    return new com.google.protobuf.Internal.ListAdapter<
        Integer, Network>(network_, network_converter_);
  }
  /**
   * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
   */
  public int getNetworkCount() {
    return network_.size();
  }
  /**
   * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
   */
  public Network getNetwork(int index) {
    return network_converter_.convert(network_.get(index));
  }
  /**
   * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
   */
  public java.util.List<Integer>
  getNetworkValueList() {
    return network_;
  }
  /**
   * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
   */
  public int getNetworkValue(int index) {
    return network_.get(index);
  }
  private int networkMemoizedSerializedSize;

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
    getSerializedSize();
    if (getNetworkList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(networkMemoizedSerializedSize);
    }
    for (int i = 0; i < network_.size(); i++) {
      output.writeEnumNoTag(network_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < network_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(network_.get(i));
      }
      size += dataSize;
      if (!getNetworkList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }networkMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof NetworkList)) {
      return super.equals(obj);
    }
    NetworkList other = (NetworkList) obj;

    if (!network_.equals(other.network_)) return false;
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
    if (getNetworkCount() > 0) {
      hash = (37 * hash) + NETWORK_FIELD_NUMBER;
      hash = (53 * hash) + network_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static NetworkList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static NetworkList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static NetworkList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static NetworkList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static NetworkList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static NetworkList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static NetworkList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static NetworkList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static NetworkList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static NetworkList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static NetworkList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static NetworkList parseFrom(
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
  public static Builder newBuilder(NetworkList prototype) {
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
   * <pre>
   * NetworkList is a list of Networks.
   * </pre>
   *
   * Protobuf type {@code v2ray.core.common.net.NetworkList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.common.net.NetworkList)
      com.v2ray.core.common.net.NetworkListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.common.net.NetworkOuterClass.internal_static_v2ray_core_common_net_NetworkList_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.common.net.NetworkOuterClass.internal_static_v2ray_core_common_net_NetworkList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NetworkList.class, Builder.class);
    }

    // Construct using com.v2ray.core.common.net.NetworkList.newBuilder()
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
      network_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.common.net.NetworkOuterClass.internal_static_v2ray_core_common_net_NetworkList_descriptor;
    }

    @Override
    public NetworkList getDefaultInstanceForType() {
      return NetworkList.getDefaultInstance();
    }

    @Override
    public NetworkList build() {
      NetworkList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public NetworkList buildPartial() {
      NetworkList result = new NetworkList(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        network_ = java.util.Collections.unmodifiableList(network_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.network_ = network_;
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
      if (other instanceof NetworkList) {
        return mergeFrom((NetworkList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(NetworkList other) {
      if (other == NetworkList.getDefaultInstance()) return this;
      if (!other.network_.isEmpty()) {
        if (network_.isEmpty()) {
          network_ = other.network_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureNetworkIsMutable();
          network_.addAll(other.network_);
        }
        onChanged();
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
      NetworkList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (NetworkList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<Integer> network_ =
      java.util.Collections.emptyList();
    private void ensureNetworkIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        network_ = new java.util.ArrayList<Integer>(network_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public java.util.List<Network> getNetworkList() {
      return new com.google.protobuf.Internal.ListAdapter<
          Integer, Network>(network_, network_converter_);
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public int getNetworkCount() {
      return network_.size();
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public Network getNetwork(int index) {
      return network_converter_.convert(network_.get(index));
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public Builder setNetwork(
        int index, Network value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNetworkIsMutable();
      network_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public Builder addNetwork(Network value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNetworkIsMutable();
      network_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public Builder addAllNetwork(
        Iterable<? extends Network> values) {
      ensureNetworkIsMutable();
      for (Network value : values) {
        network_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public Builder clearNetwork() {
      network_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public java.util.List<Integer>
    getNetworkValueList() {
      return java.util.Collections.unmodifiableList(network_);
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public int getNetworkValue(int index) {
      return network_.get(index);
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public Builder setNetworkValue(
        int index, int value) {
      ensureNetworkIsMutable();
      network_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public Builder addNetworkValue(int value) {
      ensureNetworkIsMutable();
      network_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .v2ray.core.common.net.Network network = 1;</code>
     */
    public Builder addAllNetworkValue(
        Iterable<Integer> values) {
      ensureNetworkIsMutable();
      for (int value : values) {
        network_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:v2ray.core.common.net.NetworkList)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.common.net.NetworkList)
  private static final NetworkList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new NetworkList();
  }

  public static NetworkList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkList>
      PARSER = new com.google.protobuf.AbstractParser<NetworkList>() {
    @Override
    public NetworkList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NetworkList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NetworkList> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<NetworkList> getParserForType() {
    return PARSER;
  }

  @Override
  public NetworkList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

