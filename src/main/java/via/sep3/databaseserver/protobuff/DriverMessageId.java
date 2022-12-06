// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: User.proto

package via.sep3.databaseserver.protobuff;

/**
 * Protobuf type {@code DriverMessageId}
 */
public final class DriverMessageId extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:DriverMessageId)
    DriverMessageIdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DriverMessageId.newBuilder() to construct.
  private DriverMessageId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DriverMessageId() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DriverMessageId();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DriverMessageId(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            driverId_ = input.readInt32();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return via.sep3.databaseserver.protobuff.UserOuterClass.internal_static_DriverMessageId_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sep3.databaseserver.protobuff.UserOuterClass.internal_static_DriverMessageId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sep3.databaseserver.protobuff.DriverMessageId.class, via.sep3.databaseserver.protobuff.DriverMessageId.Builder.class);
  }

  public static final int DRIVERID_FIELD_NUMBER = 1;
  private int driverId_;
  /**
   * <code>int32 driverId = 1;</code>
   * @return The driverId.
   */
  @java.lang.Override
  public int getDriverId() {
    return driverId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (driverId_ != 0) {
      output.writeInt32(1, driverId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (driverId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, driverId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof via.sep3.databaseserver.protobuff.DriverMessageId)) {
      return super.equals(obj);
    }
    via.sep3.databaseserver.protobuff.DriverMessageId other = (via.sep3.databaseserver.protobuff.DriverMessageId) obj;

    if (getDriverId()
        != other.getDriverId()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DRIVERID_FIELD_NUMBER;
    hash = (53 * hash) + getDriverId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sep3.databaseserver.protobuff.DriverMessageId parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.databaseserver.protobuff.DriverMessageId parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.databaseserver.protobuff.DriverMessageId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.databaseserver.protobuff.DriverMessageId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.databaseserver.protobuff.DriverMessageId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.databaseserver.protobuff.DriverMessageId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.databaseserver.protobuff.DriverMessageId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.databaseserver.protobuff.DriverMessageId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.databaseserver.protobuff.DriverMessageId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sep3.databaseserver.protobuff.DriverMessageId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.databaseserver.protobuff.DriverMessageId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.databaseserver.protobuff.DriverMessageId parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(via.sep3.databaseserver.protobuff.DriverMessageId prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code DriverMessageId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:DriverMessageId)
      via.sep3.databaseserver.protobuff.DriverMessageIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sep3.databaseserver.protobuff.UserOuterClass.internal_static_DriverMessageId_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sep3.databaseserver.protobuff.UserOuterClass.internal_static_DriverMessageId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sep3.databaseserver.protobuff.DriverMessageId.class, via.sep3.databaseserver.protobuff.DriverMessageId.Builder.class);
    }

    // Construct using via.sep3.databaseserver.protobuff.DriverMessageId.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      driverId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sep3.databaseserver.protobuff.UserOuterClass.internal_static_DriverMessageId_descriptor;
    }

    @java.lang.Override
    public via.sep3.databaseserver.protobuff.DriverMessageId getDefaultInstanceForType() {
      return via.sep3.databaseserver.protobuff.DriverMessageId.getDefaultInstance();
    }

    @java.lang.Override
    public via.sep3.databaseserver.protobuff.DriverMessageId build() {
      via.sep3.databaseserver.protobuff.DriverMessageId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sep3.databaseserver.protobuff.DriverMessageId buildPartial() {
      via.sep3.databaseserver.protobuff.DriverMessageId result = new via.sep3.databaseserver.protobuff.DriverMessageId(this);
      result.driverId_ = driverId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof via.sep3.databaseserver.protobuff.DriverMessageId) {
        return mergeFrom((via.sep3.databaseserver.protobuff.DriverMessageId)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sep3.databaseserver.protobuff.DriverMessageId other) {
      if (other == via.sep3.databaseserver.protobuff.DriverMessageId.getDefaultInstance()) return this;
      if (other.getDriverId() != 0) {
        setDriverId(other.getDriverId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      via.sep3.databaseserver.protobuff.DriverMessageId parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sep3.databaseserver.protobuff.DriverMessageId) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int driverId_ ;
    /**
     * <code>int32 driverId = 1;</code>
     * @return The driverId.
     */
    @java.lang.Override
    public int getDriverId() {
      return driverId_;
    }
    /**
     * <code>int32 driverId = 1;</code>
     * @param value The driverId to set.
     * @return This builder for chaining.
     */
    public Builder setDriverId(int value) {
      
      driverId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 driverId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDriverId() {
      
      driverId_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:DriverMessageId)
  }

  // @@protoc_insertion_point(class_scope:DriverMessageId)
  private static final via.sep3.databaseserver.protobuff.DriverMessageId DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sep3.databaseserver.protobuff.DriverMessageId();
  }

  public static via.sep3.databaseserver.protobuff.DriverMessageId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DriverMessageId>
      PARSER = new com.google.protobuf.AbstractParser<DriverMessageId>() {
    @java.lang.Override
    public DriverMessageId parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DriverMessageId(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DriverMessageId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DriverMessageId> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sep3.databaseserver.protobuff.DriverMessageId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
