// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Rides.proto

package via.sep3.databaseserver.protobuff;

/**
 * Protobuf type {@code RideMessage}
 */
public final class RideMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RideMessage)
    RideMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RideMessage.newBuilder() to construct.
  private RideMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RideMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RideMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RideMessage(
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

            id_ = input.readInt32();
            break;
          }
          case 18: {
            via.sep3.databaseserver.protobuff.LocationMessage.Builder subBuilder = null;
            if (startLocation_ != null) {
              subBuilder = startLocation_.toBuilder();
            }
            startLocation_ = input.readMessage(via.sep3.databaseserver.protobuff.LocationMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(startLocation_);
              startLocation_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            via.sep3.databaseserver.protobuff.LocationMessage.Builder subBuilder = null;
            if (destination_ != null) {
              subBuilder = destination_.toBuilder();
            }
            destination_ = input.readMessage(via.sep3.databaseserver.protobuff.LocationMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(destination_);
              destination_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            startDate_ = input.readInt64();
            break;
          }
          case 42: {
            via.sep3.databaseserver.protobuff.DriverMessage.Builder subBuilder = null;
            if (driver_ != null) {
              subBuilder = driver_.toBuilder();
            }
            driver_ = input.readMessage(via.sep3.databaseserver.protobuff.DriverMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(driver_);
              driver_ = subBuilder.buildPartial();
            }

            break;
          }
          case 48: {

            capacity_ = input.readInt32();
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
    return via.sep3.databaseserver.protobuff.RidesOuterClass.internal_static_RideMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sep3.databaseserver.protobuff.RidesOuterClass.internal_static_RideMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sep3.databaseserver.protobuff.RideMessage.class, via.sep3.databaseserver.protobuff.RideMessage.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int STARTLOCATION_FIELD_NUMBER = 2;
  private via.sep3.databaseserver.protobuff.LocationMessage startLocation_;
  /**
   * <code>.LocationMessage startLocation = 2;</code>
   * @return Whether the startLocation field is set.
   */
  @java.lang.Override
  public boolean hasStartLocation() {
    return startLocation_ != null;
  }
  /**
   * <code>.LocationMessage startLocation = 2;</code>
   * @return The startLocation.
   */
  @java.lang.Override
  public via.sep3.databaseserver.protobuff.LocationMessage getStartLocation() {
    return startLocation_ == null ? via.sep3.databaseserver.protobuff.LocationMessage.getDefaultInstance() : startLocation_;
  }
  /**
   * <code>.LocationMessage startLocation = 2;</code>
   */
  @java.lang.Override
  public via.sep3.databaseserver.protobuff.LocationMessageOrBuilder getStartLocationOrBuilder() {
    return getStartLocation();
  }

  public static final int DESTINATION_FIELD_NUMBER = 3;
  private via.sep3.databaseserver.protobuff.LocationMessage destination_;
  /**
   * <code>.LocationMessage destination = 3;</code>
   * @return Whether the destination field is set.
   */
  @java.lang.Override
  public boolean hasDestination() {
    return destination_ != null;
  }
  /**
   * <code>.LocationMessage destination = 3;</code>
   * @return The destination.
   */
  @java.lang.Override
  public via.sep3.databaseserver.protobuff.LocationMessage getDestination() {
    return destination_ == null ? via.sep3.databaseserver.protobuff.LocationMessage.getDefaultInstance() : destination_;
  }
  /**
   * <code>.LocationMessage destination = 3;</code>
   */
  @java.lang.Override
  public via.sep3.databaseserver.protobuff.LocationMessageOrBuilder getDestinationOrBuilder() {
    return getDestination();
  }

  public static final int STARTDATE_FIELD_NUMBER = 4;
  private long startDate_;
  /**
   * <code>int64 startDate = 4;</code>
   * @return The startDate.
   */
  @java.lang.Override
  public long getStartDate() {
    return startDate_;
  }

  public static final int DRIVER_FIELD_NUMBER = 5;
  private via.sep3.databaseserver.protobuff.DriverMessage driver_;
  /**
   * <code>.DriverMessage driver = 5;</code>
   * @return Whether the driver field is set.
   */
  @java.lang.Override
  public boolean hasDriver() {
    return driver_ != null;
  }
  /**
   * <code>.DriverMessage driver = 5;</code>
   * @return The driver.
   */
  @java.lang.Override
  public via.sep3.databaseserver.protobuff.DriverMessage getDriver() {
    return driver_ == null ? via.sep3.databaseserver.protobuff.DriverMessage.getDefaultInstance() : driver_;
  }
  /**
   * <code>.DriverMessage driver = 5;</code>
   */
  @java.lang.Override
  public via.sep3.databaseserver.protobuff.DriverMessageOrBuilder getDriverOrBuilder() {
    return getDriver();
  }

  public static final int CAPACITY_FIELD_NUMBER = 6;
  private int capacity_;
  /**
   * <code>int32 capacity = 6;</code>
   * @return The capacity.
   */
  @java.lang.Override
  public int getCapacity() {
    return capacity_;
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (startLocation_ != null) {
      output.writeMessage(2, getStartLocation());
    }
    if (destination_ != null) {
      output.writeMessage(3, getDestination());
    }
    if (startDate_ != 0L) {
      output.writeInt64(4, startDate_);
    }
    if (driver_ != null) {
      output.writeMessage(5, getDriver());
    }
    if (capacity_ != 0) {
      output.writeInt32(6, capacity_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (startLocation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStartLocation());
    }
    if (destination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDestination());
    }
    if (startDate_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, startDate_);
    }
    if (driver_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getDriver());
    }
    if (capacity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, capacity_);
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
    if (!(obj instanceof via.sep3.databaseserver.protobuff.RideMessage)) {
      return super.equals(obj);
    }
    via.sep3.databaseserver.protobuff.RideMessage other = (via.sep3.databaseserver.protobuff.RideMessage) obj;

    if (getId()
        != other.getId()) return false;
    if (hasStartLocation() != other.hasStartLocation()) return false;
    if (hasStartLocation()) {
      if (!getStartLocation()
          .equals(other.getStartLocation())) return false;
    }
    if (hasDestination() != other.hasDestination()) return false;
    if (hasDestination()) {
      if (!getDestination()
          .equals(other.getDestination())) return false;
    }
    if (getStartDate()
        != other.getStartDate()) return false;
    if (hasDriver() != other.hasDriver()) return false;
    if (hasDriver()) {
      if (!getDriver()
          .equals(other.getDriver())) return false;
    }
    if (getCapacity()
        != other.getCapacity()) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    if (hasStartLocation()) {
      hash = (37 * hash) + STARTLOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getStartLocation().hashCode();
    }
    if (hasDestination()) {
      hash = (37 * hash) + DESTINATION_FIELD_NUMBER;
      hash = (53 * hash) + getDestination().hashCode();
    }
    hash = (37 * hash) + STARTDATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartDate());
    if (hasDriver()) {
      hash = (37 * hash) + DRIVER_FIELD_NUMBER;
      hash = (53 * hash) + getDriver().hashCode();
    }
    hash = (37 * hash) + CAPACITY_FIELD_NUMBER;
    hash = (53 * hash) + getCapacity();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sep3.databaseserver.protobuff.RideMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.databaseserver.protobuff.RideMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.databaseserver.protobuff.RideMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.databaseserver.protobuff.RideMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.databaseserver.protobuff.RideMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.databaseserver.protobuff.RideMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.databaseserver.protobuff.RideMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.databaseserver.protobuff.RideMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.databaseserver.protobuff.RideMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sep3.databaseserver.protobuff.RideMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.databaseserver.protobuff.RideMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.databaseserver.protobuff.RideMessage parseFrom(
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
  public static Builder newBuilder(via.sep3.databaseserver.protobuff.RideMessage prototype) {
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
   * Protobuf type {@code RideMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RideMessage)
      via.sep3.databaseserver.protobuff.RideMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sep3.databaseserver.protobuff.RidesOuterClass.internal_static_RideMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sep3.databaseserver.protobuff.RidesOuterClass.internal_static_RideMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sep3.databaseserver.protobuff.RideMessage.class, via.sep3.databaseserver.protobuff.RideMessage.Builder.class);
    }

    // Construct using via.sep3.databaseserver.protobuff.RideMessage.newBuilder()
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
      id_ = 0;

      if (startLocationBuilder_ == null) {
        startLocation_ = null;
      } else {
        startLocation_ = null;
        startLocationBuilder_ = null;
      }
      if (destinationBuilder_ == null) {
        destination_ = null;
      } else {
        destination_ = null;
        destinationBuilder_ = null;
      }
      startDate_ = 0L;

      if (driverBuilder_ == null) {
        driver_ = null;
      } else {
        driver_ = null;
        driverBuilder_ = null;
      }
      capacity_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sep3.databaseserver.protobuff.RidesOuterClass.internal_static_RideMessage_descriptor;
    }

    @java.lang.Override
    public via.sep3.databaseserver.protobuff.RideMessage getDefaultInstanceForType() {
      return via.sep3.databaseserver.protobuff.RideMessage.getDefaultInstance();
    }

    @java.lang.Override
    public via.sep3.databaseserver.protobuff.RideMessage build() {
      via.sep3.databaseserver.protobuff.RideMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sep3.databaseserver.protobuff.RideMessage buildPartial() {
      via.sep3.databaseserver.protobuff.RideMessage result = new via.sep3.databaseserver.protobuff.RideMessage(this);
      result.id_ = id_;
      if (startLocationBuilder_ == null) {
        result.startLocation_ = startLocation_;
      } else {
        result.startLocation_ = startLocationBuilder_.build();
      }
      if (destinationBuilder_ == null) {
        result.destination_ = destination_;
      } else {
        result.destination_ = destinationBuilder_.build();
      }
      result.startDate_ = startDate_;
      if (driverBuilder_ == null) {
        result.driver_ = driver_;
      } else {
        result.driver_ = driverBuilder_.build();
      }
      result.capacity_ = capacity_;
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
      if (other instanceof via.sep3.databaseserver.protobuff.RideMessage) {
        return mergeFrom((via.sep3.databaseserver.protobuff.RideMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sep3.databaseserver.protobuff.RideMessage other) {
      if (other == via.sep3.databaseserver.protobuff.RideMessage.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.hasStartLocation()) {
        mergeStartLocation(other.getStartLocation());
      }
      if (other.hasDestination()) {
        mergeDestination(other.getDestination());
      }
      if (other.getStartDate() != 0L) {
        setStartDate(other.getStartDate());
      }
      if (other.hasDriver()) {
        mergeDriver(other.getDriver());
      }
      if (other.getCapacity() != 0) {
        setCapacity(other.getCapacity());
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
      via.sep3.databaseserver.protobuff.RideMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sep3.databaseserver.protobuff.RideMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private via.sep3.databaseserver.protobuff.LocationMessage startLocation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        via.sep3.databaseserver.protobuff.LocationMessage, via.sep3.databaseserver.protobuff.LocationMessage.Builder, via.sep3.databaseserver.protobuff.LocationMessageOrBuilder> startLocationBuilder_;
    /**
     * <code>.LocationMessage startLocation = 2;</code>
     * @return Whether the startLocation field is set.
     */
    public boolean hasStartLocation() {
      return startLocationBuilder_ != null || startLocation_ != null;
    }
    /**
     * <code>.LocationMessage startLocation = 2;</code>
     * @return The startLocation.
     */
    public via.sep3.databaseserver.protobuff.LocationMessage getStartLocation() {
      if (startLocationBuilder_ == null) {
        return startLocation_ == null ? via.sep3.databaseserver.protobuff.LocationMessage.getDefaultInstance() : startLocation_;
      } else {
        return startLocationBuilder_.getMessage();
      }
    }
    /**
     * <code>.LocationMessage startLocation = 2;</code>
     */
    public Builder setStartLocation(via.sep3.databaseserver.protobuff.LocationMessage value) {
      if (startLocationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startLocation_ = value;
        onChanged();
      } else {
        startLocationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.LocationMessage startLocation = 2;</code>
     */
    public Builder setStartLocation(
        via.sep3.databaseserver.protobuff.LocationMessage.Builder builderForValue) {
      if (startLocationBuilder_ == null) {
        startLocation_ = builderForValue.build();
        onChanged();
      } else {
        startLocationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.LocationMessage startLocation = 2;</code>
     */
    public Builder mergeStartLocation(via.sep3.databaseserver.protobuff.LocationMessage value) {
      if (startLocationBuilder_ == null) {
        if (startLocation_ != null) {
          startLocation_ =
            via.sep3.databaseserver.protobuff.LocationMessage.newBuilder(startLocation_).mergeFrom(value).buildPartial();
        } else {
          startLocation_ = value;
        }
        onChanged();
      } else {
        startLocationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.LocationMessage startLocation = 2;</code>
     */
    public Builder clearStartLocation() {
      if (startLocationBuilder_ == null) {
        startLocation_ = null;
        onChanged();
      } else {
        startLocation_ = null;
        startLocationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.LocationMessage startLocation = 2;</code>
     */
    public via.sep3.databaseserver.protobuff.LocationMessage.Builder getStartLocationBuilder() {
      
      onChanged();
      return getStartLocationFieldBuilder().getBuilder();
    }
    /**
     * <code>.LocationMessage startLocation = 2;</code>
     */
    public via.sep3.databaseserver.protobuff.LocationMessageOrBuilder getStartLocationOrBuilder() {
      if (startLocationBuilder_ != null) {
        return startLocationBuilder_.getMessageOrBuilder();
      } else {
        return startLocation_ == null ?
            via.sep3.databaseserver.protobuff.LocationMessage.getDefaultInstance() : startLocation_;
      }
    }
    /**
     * <code>.LocationMessage startLocation = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        via.sep3.databaseserver.protobuff.LocationMessage, via.sep3.databaseserver.protobuff.LocationMessage.Builder, via.sep3.databaseserver.protobuff.LocationMessageOrBuilder> 
        getStartLocationFieldBuilder() {
      if (startLocationBuilder_ == null) {
        startLocationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            via.sep3.databaseserver.protobuff.LocationMessage, via.sep3.databaseserver.protobuff.LocationMessage.Builder, via.sep3.databaseserver.protobuff.LocationMessageOrBuilder>(
                getStartLocation(),
                getParentForChildren(),
                isClean());
        startLocation_ = null;
      }
      return startLocationBuilder_;
    }

    private via.sep3.databaseserver.protobuff.LocationMessage destination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        via.sep3.databaseserver.protobuff.LocationMessage, via.sep3.databaseserver.protobuff.LocationMessage.Builder, via.sep3.databaseserver.protobuff.LocationMessageOrBuilder> destinationBuilder_;
    /**
     * <code>.LocationMessage destination = 3;</code>
     * @return Whether the destination field is set.
     */
    public boolean hasDestination() {
      return destinationBuilder_ != null || destination_ != null;
    }
    /**
     * <code>.LocationMessage destination = 3;</code>
     * @return The destination.
     */
    public via.sep3.databaseserver.protobuff.LocationMessage getDestination() {
      if (destinationBuilder_ == null) {
        return destination_ == null ? via.sep3.databaseserver.protobuff.LocationMessage.getDefaultInstance() : destination_;
      } else {
        return destinationBuilder_.getMessage();
      }
    }
    /**
     * <code>.LocationMessage destination = 3;</code>
     */
    public Builder setDestination(via.sep3.databaseserver.protobuff.LocationMessage value) {
      if (destinationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        destination_ = value;
        onChanged();
      } else {
        destinationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.LocationMessage destination = 3;</code>
     */
    public Builder setDestination(
        via.sep3.databaseserver.protobuff.LocationMessage.Builder builderForValue) {
      if (destinationBuilder_ == null) {
        destination_ = builderForValue.build();
        onChanged();
      } else {
        destinationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.LocationMessage destination = 3;</code>
     */
    public Builder mergeDestination(via.sep3.databaseserver.protobuff.LocationMessage value) {
      if (destinationBuilder_ == null) {
        if (destination_ != null) {
          destination_ =
            via.sep3.databaseserver.protobuff.LocationMessage.newBuilder(destination_).mergeFrom(value).buildPartial();
        } else {
          destination_ = value;
        }
        onChanged();
      } else {
        destinationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.LocationMessage destination = 3;</code>
     */
    public Builder clearDestination() {
      if (destinationBuilder_ == null) {
        destination_ = null;
        onChanged();
      } else {
        destination_ = null;
        destinationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.LocationMessage destination = 3;</code>
     */
    public via.sep3.databaseserver.protobuff.LocationMessage.Builder getDestinationBuilder() {
      
      onChanged();
      return getDestinationFieldBuilder().getBuilder();
    }
    /**
     * <code>.LocationMessage destination = 3;</code>
     */
    public via.sep3.databaseserver.protobuff.LocationMessageOrBuilder getDestinationOrBuilder() {
      if (destinationBuilder_ != null) {
        return destinationBuilder_.getMessageOrBuilder();
      } else {
        return destination_ == null ?
            via.sep3.databaseserver.protobuff.LocationMessage.getDefaultInstance() : destination_;
      }
    }
    /**
     * <code>.LocationMessage destination = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        via.sep3.databaseserver.protobuff.LocationMessage, via.sep3.databaseserver.protobuff.LocationMessage.Builder, via.sep3.databaseserver.protobuff.LocationMessageOrBuilder> 
        getDestinationFieldBuilder() {
      if (destinationBuilder_ == null) {
        destinationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            via.sep3.databaseserver.protobuff.LocationMessage, via.sep3.databaseserver.protobuff.LocationMessage.Builder, via.sep3.databaseserver.protobuff.LocationMessageOrBuilder>(
                getDestination(),
                getParentForChildren(),
                isClean());
        destination_ = null;
      }
      return destinationBuilder_;
    }

    private long startDate_ ;
    /**
     * <code>int64 startDate = 4;</code>
     * @return The startDate.
     */
    @java.lang.Override
    public long getStartDate() {
      return startDate_;
    }
    /**
     * <code>int64 startDate = 4;</code>
     * @param value The startDate to set.
     * @return This builder for chaining.
     */
    public Builder setStartDate(long value) {
      
      startDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 startDate = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartDate() {
      
      startDate_ = 0L;
      onChanged();
      return this;
    }

    private via.sep3.databaseserver.protobuff.DriverMessage driver_;
    private com.google.protobuf.SingleFieldBuilderV3<
        via.sep3.databaseserver.protobuff.DriverMessage, via.sep3.databaseserver.protobuff.DriverMessage.Builder, via.sep3.databaseserver.protobuff.DriverMessageOrBuilder> driverBuilder_;
    /**
     * <code>.DriverMessage driver = 5;</code>
     * @return Whether the driver field is set.
     */
    public boolean hasDriver() {
      return driverBuilder_ != null || driver_ != null;
    }
    /**
     * <code>.DriverMessage driver = 5;</code>
     * @return The driver.
     */
    public via.sep3.databaseserver.protobuff.DriverMessage getDriver() {
      if (driverBuilder_ == null) {
        return driver_ == null ? via.sep3.databaseserver.protobuff.DriverMessage.getDefaultInstance() : driver_;
      } else {
        return driverBuilder_.getMessage();
      }
    }
    /**
     * <code>.DriverMessage driver = 5;</code>
     */
    public Builder setDriver(via.sep3.databaseserver.protobuff.DriverMessage value) {
      if (driverBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        driver_ = value;
        onChanged();
      } else {
        driverBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.DriverMessage driver = 5;</code>
     */
    public Builder setDriver(
        via.sep3.databaseserver.protobuff.DriverMessage.Builder builderForValue) {
      if (driverBuilder_ == null) {
        driver_ = builderForValue.build();
        onChanged();
      } else {
        driverBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.DriverMessage driver = 5;</code>
     */
    public Builder mergeDriver(via.sep3.databaseserver.protobuff.DriverMessage value) {
      if (driverBuilder_ == null) {
        if (driver_ != null) {
          driver_ =
            via.sep3.databaseserver.protobuff.DriverMessage.newBuilder(driver_).mergeFrom(value).buildPartial();
        } else {
          driver_ = value;
        }
        onChanged();
      } else {
        driverBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.DriverMessage driver = 5;</code>
     */
    public Builder clearDriver() {
      if (driverBuilder_ == null) {
        driver_ = null;
        onChanged();
      } else {
        driver_ = null;
        driverBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.DriverMessage driver = 5;</code>
     */
    public via.sep3.databaseserver.protobuff.DriverMessage.Builder getDriverBuilder() {
      
      onChanged();
      return getDriverFieldBuilder().getBuilder();
    }
    /**
     * <code>.DriverMessage driver = 5;</code>
     */
    public via.sep3.databaseserver.protobuff.DriverMessageOrBuilder getDriverOrBuilder() {
      if (driverBuilder_ != null) {
        return driverBuilder_.getMessageOrBuilder();
      } else {
        return driver_ == null ?
            via.sep3.databaseserver.protobuff.DriverMessage.getDefaultInstance() : driver_;
      }
    }
    /**
     * <code>.DriverMessage driver = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        via.sep3.databaseserver.protobuff.DriverMessage, via.sep3.databaseserver.protobuff.DriverMessage.Builder, via.sep3.databaseserver.protobuff.DriverMessageOrBuilder> 
        getDriverFieldBuilder() {
      if (driverBuilder_ == null) {
        driverBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            via.sep3.databaseserver.protobuff.DriverMessage, via.sep3.databaseserver.protobuff.DriverMessage.Builder, via.sep3.databaseserver.protobuff.DriverMessageOrBuilder>(
                getDriver(),
                getParentForChildren(),
                isClean());
        driver_ = null;
      }
      return driverBuilder_;
    }

    private int capacity_ ;
    /**
     * <code>int32 capacity = 6;</code>
     * @return The capacity.
     */
    @java.lang.Override
    public int getCapacity() {
      return capacity_;
    }
    /**
     * <code>int32 capacity = 6;</code>
     * @param value The capacity to set.
     * @return This builder for chaining.
     */
    public Builder setCapacity(int value) {
      
      capacity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 capacity = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearCapacity() {
      
      capacity_ = 0;
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


    // @@protoc_insertion_point(builder_scope:RideMessage)
  }

  // @@protoc_insertion_point(class_scope:RideMessage)
  private static final via.sep3.databaseserver.protobuff.RideMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sep3.databaseserver.protobuff.RideMessage();
  }

  public static via.sep3.databaseserver.protobuff.RideMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RideMessage>
      PARSER = new com.google.protobuf.AbstractParser<RideMessage>() {
    @java.lang.Override
    public RideMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RideMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RideMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RideMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sep3.databaseserver.protobuff.RideMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

