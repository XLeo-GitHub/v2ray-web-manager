// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2ray.com/core/app/log/config.proto

package com.v2ray.core.app.log;

/**
 * Protobuf enum {@code v2ray.core.app.log.LogType}
 */
public enum LogType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>None = 0;</code>
   */
  None(0),
  /**
   * <code>Console = 1;</code>
   */
  Console(1),
  /**
   * <code>File = 2;</code>
   */
  File(2),
  /**
   * <code>Event = 3;</code>
   */
  Event(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>None = 0;</code>
   */
  public static final int None_VALUE = 0;
  /**
   * <code>Console = 1;</code>
   */
  public static final int Console_VALUE = 1;
  /**
   * <code>File = 2;</code>
   */
  public static final int File_VALUE = 2;
  /**
   * <code>Event = 3;</code>
   */
  public static final int Event_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static LogType valueOf(int value) {
    return forNumber(value);
  }

  public static LogType forNumber(int value) {
    switch (value) {
      case 0: return None;
      case 1: return Console;
      case 2: return File;
      case 3: return Event;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LogType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      LogType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LogType>() {
          public LogType findValueByNumber(int number) {
            return LogType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.v2ray.core.app.log.ConfigOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final LogType[] VALUES = values();

  public static LogType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private LogType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:v2ray.core.app.log.LogType)
}

