// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Rides.proto

package via.sep3.databaseserver.protobuff;

public interface DriverMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:DriverMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string phone = 2;</code>
   * @return The phone.
   */
  java.lang.String getPhone();
  /**
   * <code>string phone = 2;</code>
   * @return The bytes for phone.
   */
  com.google.protobuf.ByteString
      getPhoneBytes();

  /**
   * <pre>
   *imo that's needed although not included in uml
   * </pre>
   *
   * <code>int32 id = 3;</code>
   * @return The id.
   */
  int getId();
}
