// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/router/config.proto

package com.v2ray.core.app.router;

/**
 * Protobuf type {@code v2ray.core.app.router.GeoSiteList}
 */
public  final class GeoSiteList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:v2ray.core.app.router.GeoSiteList)
    GeoSiteListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GeoSiteList.newBuilder() to construct.
  private GeoSiteList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GeoSiteList() {
    entry_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GeoSiteList(
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
              entry_ = new java.util.ArrayList<GeoSite>();
              mutable_bitField0_ |= 0x00000001;
            }
            entry_.add(
                input.readMessage(GeoSite.parser(), extensionRegistry));
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
        entry_ = java.util.Collections.unmodifiableList(entry_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.v2ray.core.app.router.ConfigOuterClass.internal_static_v2ray_core_app_router_GeoSiteList_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.v2ray.core.app.router.ConfigOuterClass.internal_static_v2ray_core_app_router_GeoSiteList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GeoSiteList.class, Builder.class);
  }

  public static final int ENTRY_FIELD_NUMBER = 1;
  private java.util.List<GeoSite> entry_;
  /**
   * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
   */
  public java.util.List<GeoSite> getEntryList() {
    return entry_;
  }
  /**
   * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
   */
  public java.util.List<? extends com.v2ray.core.app.router.GeoSiteOrBuilder> 
      getEntryOrBuilderList() {
    return entry_;
  }
  /**
   * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
   */
  public int getEntryCount() {
    return entry_.size();
  }
  /**
   * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
   */
  public GeoSite getEntry(int index) {
    return entry_.get(index);
  }
  /**
   * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
   */
  public com.v2ray.core.app.router.GeoSiteOrBuilder getEntryOrBuilder(
      int index) {
    return entry_.get(index);
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
    for (int i = 0; i < entry_.size(); i++) {
      output.writeMessage(1, entry_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < entry_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, entry_.get(i));
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
    if (!(obj instanceof GeoSiteList)) {
      return super.equals(obj);
    }
    GeoSiteList other = (GeoSiteList) obj;

    if (!getEntryList()
        .equals(other.getEntryList())) return false;
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
    if (getEntryCount() > 0) {
      hash = (37 * hash) + ENTRY_FIELD_NUMBER;
      hash = (53 * hash) + getEntryList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static GeoSiteList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GeoSiteList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GeoSiteList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GeoSiteList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GeoSiteList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GeoSiteList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GeoSiteList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GeoSiteList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static GeoSiteList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static GeoSiteList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static GeoSiteList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GeoSiteList parseFrom(
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
  public static Builder newBuilder(GeoSiteList prototype) {
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
   * Protobuf type {@code v2ray.core.app.router.GeoSiteList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:v2ray.core.app.router.GeoSiteList)
      com.v2ray.core.app.router.GeoSiteListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.v2ray.core.app.router.ConfigOuterClass.internal_static_v2ray_core_app_router_GeoSiteList_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.v2ray.core.app.router.ConfigOuterClass.internal_static_v2ray_core_app_router_GeoSiteList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GeoSiteList.class, Builder.class);
    }

    // Construct using com.v2ray.core.app.router.GeoSiteList.newBuilder()
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
        getEntryFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      if (entryBuilder_ == null) {
        entry_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        entryBuilder_.clear();
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.v2ray.core.app.router.ConfigOuterClass.internal_static_v2ray_core_app_router_GeoSiteList_descriptor;
    }

    @Override
    public GeoSiteList getDefaultInstanceForType() {
      return GeoSiteList.getDefaultInstance();
    }

    @Override
    public GeoSiteList build() {
      GeoSiteList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public GeoSiteList buildPartial() {
      GeoSiteList result = new GeoSiteList(this);
      int from_bitField0_ = bitField0_;
      if (entryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          entry_ = java.util.Collections.unmodifiableList(entry_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entry_ = entry_;
      } else {
        result.entry_ = entryBuilder_.build();
      }
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
      if (other instanceof GeoSiteList) {
        return mergeFrom((GeoSiteList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GeoSiteList other) {
      if (other == GeoSiteList.getDefaultInstance()) return this;
      if (entryBuilder_ == null) {
        if (!other.entry_.isEmpty()) {
          if (entry_.isEmpty()) {
            entry_ = other.entry_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntryIsMutable();
            entry_.addAll(other.entry_);
          }
          onChanged();
        }
      } else {
        if (!other.entry_.isEmpty()) {
          if (entryBuilder_.isEmpty()) {
            entryBuilder_.dispose();
            entryBuilder_ = null;
            entry_ = other.entry_;
            bitField0_ = (bitField0_ & ~0x00000001);
            entryBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEntryFieldBuilder() : null;
          } else {
            entryBuilder_.addAllMessages(other.entry_);
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
      GeoSiteList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (GeoSiteList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<GeoSite> entry_ =
      java.util.Collections.emptyList();
    private void ensureEntryIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        entry_ = new java.util.ArrayList<GeoSite>(entry_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        GeoSite, GeoSite.Builder, com.v2ray.core.app.router.GeoSiteOrBuilder> entryBuilder_;

    /**
     * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
     */
    public java.util.List<GeoSite> getEntryList() {
      if (entryBuilder_ == null) {
        return java.util.Collections.unmodifiableList(entry_);
      } else {
        return entryBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
     */
    public int getEntryCount() {
      if (entryBuilder_ == null) {
        return entry_.size();
      } else {
        return entryBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
     */
    public GeoSite getEntry(int index) {
      if (entryBuilder_ == null) {
        return entry_.get(index);
      } else {
        return entryBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
     */
    public Builder setEntry(
        int index, GeoSite value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntryIsMutable();
        entry_.set(index, value);
        onChanged();
      } else {
        entryBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
     */
    public Builder setEntry(
        int index, GeoSite.Builder builderForValue) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        entry_.set(index, builderForValue.build());
        onChanged();
      } else {
        entryBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
     */
    public Builder addEntry(GeoSite value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntryIsMutable();
        entry_.add(value);
        onChanged();
      } else {
        entryBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
     */
    public Builder addEntry(
        int index, GeoSite value) {
      if (entryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntryIsMutable();
        entry_.add(index, value);
        onChanged();
      } else {
        entryBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
     */
    public Builder addEntry(
        GeoSite.Builder builderForValue) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        entry_.add(builderForValue.build());
        onChanged();
      } else {
        entryBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
     */
    public Builder addEntry(
        int index, GeoSite.Builder builderForValue) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        entry_.add(index, builderForValue.build());
        onChanged();
      } else {
        entryBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
     */
    public Builder addAllEntry(
        Iterable<? extends GeoSite> values) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, entry_);
        onChanged();
      } else {
        entryBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
     */
    public Builder clearEntry() {
      if (entryBuilder_ == null) {
        entry_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        entryBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
     */
    public Builder removeEntry(int index) {
      if (entryBuilder_ == null) {
        ensureEntryIsMutable();
        entry_.remove(index);
        onChanged();
      } else {
        entryBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
     */
    public GeoSite.Builder getEntryBuilder(
        int index) {
      return getEntryFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
     */
    public com.v2ray.core.app.router.GeoSiteOrBuilder getEntryOrBuilder(
        int index) {
      if (entryBuilder_ == null) {
        return entry_.get(index);  } else {
        return entryBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
     */
    public java.util.List<? extends com.v2ray.core.app.router.GeoSiteOrBuilder> 
         getEntryOrBuilderList() {
      if (entryBuilder_ != null) {
        return entryBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(entry_);
      }
    }
    /**
     * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
     */
    public GeoSite.Builder addEntryBuilder() {
      return getEntryFieldBuilder().addBuilder(
          GeoSite.getDefaultInstance());
    }
    /**
     * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
     */
    public GeoSite.Builder addEntryBuilder(
        int index) {
      return getEntryFieldBuilder().addBuilder(
          index, GeoSite.getDefaultInstance());
    }
    /**
     * <code>repeated .v2ray.core.app.router.GeoSite entry = 1;</code>
     */
    public java.util.List<GeoSite.Builder>
         getEntryBuilderList() {
      return getEntryFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        GeoSite, GeoSite.Builder, com.v2ray.core.app.router.GeoSiteOrBuilder>
        getEntryFieldBuilder() {
      if (entryBuilder_ == null) {
        entryBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            GeoSite, GeoSite.Builder, com.v2ray.core.app.router.GeoSiteOrBuilder>(
                entry_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        entry_ = null;
      }
      return entryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:v2ray.core.app.router.GeoSiteList)
  }

  // @@protoc_insertion_point(class_scope:v2ray.core.app.router.GeoSiteList)
  private static final GeoSiteList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GeoSiteList();
  }

  public static GeoSiteList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GeoSiteList>
      PARSER = new com.google.protobuf.AbstractParser<GeoSiteList>() {
    @Override
    public GeoSiteList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GeoSiteList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GeoSiteList> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GeoSiteList> getParserForType() {
    return PARSER;
  }

  @Override
  public GeoSiteList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

