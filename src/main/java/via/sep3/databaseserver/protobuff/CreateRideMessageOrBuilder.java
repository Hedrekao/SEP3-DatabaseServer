// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Rides.proto

package via.sep3.databaseserver.protobuff;

public interface CreateRideMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CreateRideMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.LocationMessage startLocation = 1;</code>
   * @return Whether the startLocation field is set.
   */
  boolean hasStartLocation();
  /**
   * <code>.LocationMessage startLocation = 1;</code>
   * @return The startLocation.
   */
  via.sep3.databaseserver.protobuff.LocationMessage getStartLocation();
  /**
   * <code>.LocationMessage startLocation = 1;</code>
   */
  via.sep3.databaseserver.protobuff.LocationMessageOrBuilder getStartLocationOrBuilder();

  /**
   * <code>.LocationMessage destination = 2;</code>
   * @return Whether the destination field is set.
   */
  boolean hasDestination();
  /**
   * <code>.LocationMessage destination = 2;</code>
   * @return The destination.
   */
  via.sep3.databaseserver.protobuff.LocationMessage getDestination();
  /**
   * <code>.LocationMessage destination = 2;</code>
   */
  via.sep3.databaseserver.protobuff.LocationMessageOrBuilder getDestinationOrBuilder();

  /**
   * <code>int64 startDate = 3;</code>
   * @return The startDate.
   */
  long getStartDate();

  /**
   * <code>string driver = 4;</code>
   * @return The driver.
   */
  java.lang.String getDriver();
  /**
   * <code>string driver = 4;</code>
   * @return The bytes for driver.
   */
  com.google.protobuf.ByteString
      getDriverBytes();

  /**
   * <code>int32 capacity = 5;</code>
   * @return The capacity.
   */
  int getCapacity();
}
