// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Rides.proto

package via.sep3.databaseserver.protobuff;

public final class RidesOuterClass {
  private RidesOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserIdMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserIdMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EpochTimelineMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EpochTimelineMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateRideMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateRideMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RideMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RideMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RidesCollection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RidesCollection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LocationMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LocationMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DriverMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DriverMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JoinRideMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JoinRideMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ConfirmationMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ConfirmationMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Rides.proto\"\037\n\rUserIdMessage\022\016\n\006userId" +
      "\030\001 \001(\005\"z\n\024EpochTimelineMessage\022\034\n\017epochL" +
      "owerBound\030\001 \001(\003H\000\210\001\001\022\034\n\017epochUpperBound\030" +
      "\002 \001(\003H\001\210\001\001B\022\n\020_epochLowerBoundB\022\n\020_epoch" +
      "UpperBound\"\232\001\n\021CreateRideMessage\022\'\n\rstar" +
      "tLocation\030\001 \001(\0132\020.LocationMessage\022%\n\013des" +
      "tination\030\002 \001(\0132\020.LocationMessage\022\021\n\tstar" +
      "tDate\030\003 \001(\003\022\020\n\010driverId\030\004 \001(\005\022\020\n\010capacit" +
      "y\030\005 \001(\005\"\256\001\n\013RideMessage\022\n\n\002id\030\001 \001(\005\022\'\n\rs" +
      "tartLocation\030\002 \001(\0132\020.LocationMessage\022%\n\013" +
      "destination\030\003 \001(\0132\020.LocationMessage\022\021\n\ts" +
      "tartDate\030\004 \001(\003\022\036\n\006driver\030\005 \001(\0132\016.DriverM" +
      "essage\022\020\n\010capacity\030\006 \001(\005\".\n\017RidesCollect" +
      "ion\022\033\n\005rides\030\001 \003(\0132\014.RideMessage\"{\n\017Loca" +
      "tionMessage\022\017\n\007country\030\001 \001(\t\022\014\n\004city\030\002 \001" +
      "(\t\022\016\n\006street\030\003 \001(\t\022\017\n\007zipcode\030\004 \001(\t\022\023\n\013c" +
      "oordinateX\030\005 \001(\003\022\023\n\013coordinateY\030\006 \001(\003\"8\n" +
      "\rDriverMessage\022\014\n\004name\030\001 \001(\t\022\r\n\005phone\030\002 " +
      "\001(\t\022\n\n\002id\030\003 \001(\005\"1\n\017JoinRideMessage\022\016\n\006ri" +
      "deId\030\001 \001(\005\022\016\n\006userId\030\002 \001(\005\"2\n\023Confirmati" +
      "onMessage\022\033\n\023confirmationMessage\030\001 \001(\t2\330" +
      "\001\n\005Rides\0223\n\010getRides\022\025.EpochTimelineMess" +
      "age\032\020.RidesCollection\0222\n\010joinRide\022\020.Join" +
      "RideMessage\032\024.ConfirmationMessage\022.\n\ncre" +
      "ateRide\022\022.CreateRideMessage\032\014.RideMessag" +
      "e\0226\n\022getRidesByDriverId\022\016.UserIdMessage\032" +
      "\020.RidesCollectionB%\n!via.sep3.databasese" +
      "rver.protobuffP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UserIdMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UserIdMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserIdMessage_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_EpochTimelineMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_EpochTimelineMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EpochTimelineMessage_descriptor,
        new java.lang.String[] { "EpochLowerBound", "EpochUpperBound", "EpochLowerBound", "EpochUpperBound", });
    internal_static_CreateRideMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_CreateRideMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateRideMessage_descriptor,
        new java.lang.String[] { "StartLocation", "Destination", "StartDate", "DriverId", "Capacity", });
    internal_static_RideMessage_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_RideMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RideMessage_descriptor,
        new java.lang.String[] { "Id", "StartLocation", "Destination", "StartDate", "Driver", "Capacity", });
    internal_static_RidesCollection_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_RidesCollection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RidesCollection_descriptor,
        new java.lang.String[] { "Rides", });
    internal_static_LocationMessage_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_LocationMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LocationMessage_descriptor,
        new java.lang.String[] { "Country", "City", "Street", "Zipcode", "CoordinateX", "CoordinateY", });
    internal_static_DriverMessage_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_DriverMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DriverMessage_descriptor,
        new java.lang.String[] { "Name", "Phone", "Id", });
    internal_static_JoinRideMessage_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_JoinRideMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JoinRideMessage_descriptor,
        new java.lang.String[] { "RideId", "UserId", });
    internal_static_ConfirmationMessage_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_ConfirmationMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ConfirmationMessage_descriptor,
        new java.lang.String[] { "ConfirmationMessage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
