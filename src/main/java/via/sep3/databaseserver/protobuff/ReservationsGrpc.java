package via.sep3.databaseserver.protobuff;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Reservation.proto")
public final class ReservationsGrpc {

  private ReservationsGrpc() {}

  public static final String SERVICE_NAME = "Reservations";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.AcceptMessage,
      via.sep3.databaseserver.protobuff.ReservationMessage> getAcceptPassengerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "acceptPassenger",
      requestType = via.sep3.databaseserver.protobuff.AcceptMessage.class,
      responseType = via.sep3.databaseserver.protobuff.ReservationMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.AcceptMessage,
      via.sep3.databaseserver.protobuff.ReservationMessage> getAcceptPassengerMethod() {
    io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.AcceptMessage, via.sep3.databaseserver.protobuff.ReservationMessage> getAcceptPassengerMethod;
    if ((getAcceptPassengerMethod = ReservationsGrpc.getAcceptPassengerMethod) == null) {
      synchronized (ReservationsGrpc.class) {
        if ((getAcceptPassengerMethod = ReservationsGrpc.getAcceptPassengerMethod) == null) {
          ReservationsGrpc.getAcceptPassengerMethod = getAcceptPassengerMethod =
              io.grpc.MethodDescriptor.<via.sep3.databaseserver.protobuff.AcceptMessage, via.sep3.databaseserver.protobuff.ReservationMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "acceptPassenger"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.AcceptMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.ReservationMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationsMethodDescriptorSupplier("acceptPassenger"))
              .build();
        }
      }
    }
    return getAcceptPassengerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.IdMessage,
      via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection> getGetAllReservationsToAcceptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllReservationsToAccept",
      requestType = via.sep3.databaseserver.protobuff.IdMessage.class,
      responseType = via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.IdMessage,
      via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection> getGetAllReservationsToAcceptMethod() {
    io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.IdMessage, via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection> getGetAllReservationsToAcceptMethod;
    if ((getGetAllReservationsToAcceptMethod = ReservationsGrpc.getGetAllReservationsToAcceptMethod) == null) {
      synchronized (ReservationsGrpc.class) {
        if ((getGetAllReservationsToAcceptMethod = ReservationsGrpc.getGetAllReservationsToAcceptMethod) == null) {
          ReservationsGrpc.getGetAllReservationsToAcceptMethod = getGetAllReservationsToAcceptMethod =
              io.grpc.MethodDescriptor.<via.sep3.databaseserver.protobuff.IdMessage, via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllReservationsToAccept"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.IdMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationsMethodDescriptorSupplier("getAllReservationsToAccept"))
              .build();
        }
      }
    }
    return getGetAllReservationsToAcceptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.IdMessage,
      via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection> getGetAcceptedReservationsByRideIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAcceptedReservationsByRideId",
      requestType = via.sep3.databaseserver.protobuff.IdMessage.class,
      responseType = via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.IdMessage,
      via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection> getGetAcceptedReservationsByRideIdMethod() {
    io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.IdMessage, via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection> getGetAcceptedReservationsByRideIdMethod;
    if ((getGetAcceptedReservationsByRideIdMethod = ReservationsGrpc.getGetAcceptedReservationsByRideIdMethod) == null) {
      synchronized (ReservationsGrpc.class) {
        if ((getGetAcceptedReservationsByRideIdMethod = ReservationsGrpc.getGetAcceptedReservationsByRideIdMethod) == null) {
          ReservationsGrpc.getGetAcceptedReservationsByRideIdMethod = getGetAcceptedReservationsByRideIdMethod =
              io.grpc.MethodDescriptor.<via.sep3.databaseserver.protobuff.IdMessage, via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAcceptedReservationsByRideId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.IdMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationsMethodDescriptorSupplier("getAcceptedReservationsByRideId"))
              .build();
        }
      }
    }
    return getGetAcceptedReservationsByRideIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.IdMessage,
      via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection> getGetAllReservationsByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllReservationsByUserId",
      requestType = via.sep3.databaseserver.protobuff.IdMessage.class,
      responseType = via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.IdMessage,
      via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection> getGetAllReservationsByUserIdMethod() {
    io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.IdMessage, via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection> getGetAllReservationsByUserIdMethod;
    if ((getGetAllReservationsByUserIdMethod = ReservationsGrpc.getGetAllReservationsByUserIdMethod) == null) {
      synchronized (ReservationsGrpc.class) {
        if ((getGetAllReservationsByUserIdMethod = ReservationsGrpc.getGetAllReservationsByUserIdMethod) == null) {
          ReservationsGrpc.getGetAllReservationsByUserIdMethod = getGetAllReservationsByUserIdMethod =
              io.grpc.MethodDescriptor.<via.sep3.databaseserver.protobuff.IdMessage, via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllReservationsByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.IdMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationsMethodDescriptorSupplier("getAllReservationsByUserId"))
              .build();
        }
      }
    }
    return getGetAllReservationsByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.ChangeReservStatusMessage,
      via.sep3.databaseserver.protobuff.BoolValue> getChangeReservationStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeReservationStatus",
      requestType = via.sep3.databaseserver.protobuff.ChangeReservStatusMessage.class,
      responseType = via.sep3.databaseserver.protobuff.BoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.ChangeReservStatusMessage,
      via.sep3.databaseserver.protobuff.BoolValue> getChangeReservationStatusMethod() {
    io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.ChangeReservStatusMessage, via.sep3.databaseserver.protobuff.BoolValue> getChangeReservationStatusMethod;
    if ((getChangeReservationStatusMethod = ReservationsGrpc.getChangeReservationStatusMethod) == null) {
      synchronized (ReservationsGrpc.class) {
        if ((getChangeReservationStatusMethod = ReservationsGrpc.getChangeReservationStatusMethod) == null) {
          ReservationsGrpc.getChangeReservationStatusMethod = getChangeReservationStatusMethod =
              io.grpc.MethodDescriptor.<via.sep3.databaseserver.protobuff.ChangeReservStatusMessage, via.sep3.databaseserver.protobuff.BoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "changeReservationStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.ChangeReservStatusMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.BoolValue.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationsMethodDescriptorSupplier("changeReservationStatus"))
              .build();
        }
      }
    }
    return getChangeReservationStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationsStub>() {
        @java.lang.Override
        public ReservationsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationsStub(channel, callOptions);
        }
      };
    return ReservationsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationsBlockingStub>() {
        @java.lang.Override
        public ReservationsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationsBlockingStub(channel, callOptions);
        }
      };
    return ReservationsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationsFutureStub>() {
        @java.lang.Override
        public ReservationsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationsFutureStub(channel, callOptions);
        }
      };
    return ReservationsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ReservationsImplBase implements io.grpc.BindableService {

    /**
     */
    public void acceptPassenger(via.sep3.databaseserver.protobuff.AcceptMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.ReservationMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAcceptPassengerMethod(), responseObserver);
    }

    /**
     */
    public void getAllReservationsToAccept(via.sep3.databaseserver.protobuff.IdMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllReservationsToAcceptMethod(), responseObserver);
    }

    /**
     */
    public void getAcceptedReservationsByRideId(via.sep3.databaseserver.protobuff.IdMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAcceptedReservationsByRideIdMethod(), responseObserver);
    }

    /**
     */
    public void getAllReservationsByUserId(via.sep3.databaseserver.protobuff.IdMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllReservationsByUserIdMethod(), responseObserver);
    }

    /**
     */
    public void changeReservationStatus(via.sep3.databaseserver.protobuff.ChangeReservStatusMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.BoolValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeReservationStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAcceptPassengerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.databaseserver.protobuff.AcceptMessage,
                via.sep3.databaseserver.protobuff.ReservationMessage>(
                  this, METHODID_ACCEPT_PASSENGER)))
          .addMethod(
            getGetAllReservationsToAcceptMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.databaseserver.protobuff.IdMessage,
                via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection>(
                  this, METHODID_GET_ALL_RESERVATIONS_TO_ACCEPT)))
          .addMethod(
            getGetAcceptedReservationsByRideIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.databaseserver.protobuff.IdMessage,
                via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection>(
                  this, METHODID_GET_ACCEPTED_RESERVATIONS_BY_RIDE_ID)))
          .addMethod(
            getGetAllReservationsByUserIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.databaseserver.protobuff.IdMessage,
                via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection>(
                  this, METHODID_GET_ALL_RESERVATIONS_BY_USER_ID)))
          .addMethod(
            getChangeReservationStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.databaseserver.protobuff.ChangeReservStatusMessage,
                via.sep3.databaseserver.protobuff.BoolValue>(
                  this, METHODID_CHANGE_RESERVATION_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class ReservationsStub extends io.grpc.stub.AbstractAsyncStub<ReservationsStub> {
    private ReservationsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationsStub(channel, callOptions);
    }

    /**
     */
    public void acceptPassenger(via.sep3.databaseserver.protobuff.AcceptMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.ReservationMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAcceptPassengerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllReservationsToAccept(via.sep3.databaseserver.protobuff.IdMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllReservationsToAcceptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAcceptedReservationsByRideId(via.sep3.databaseserver.protobuff.IdMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAcceptedReservationsByRideIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllReservationsByUserId(via.sep3.databaseserver.protobuff.IdMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllReservationsByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeReservationStatus(via.sep3.databaseserver.protobuff.ChangeReservStatusMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.BoolValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeReservationStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReservationsBlockingStub extends io.grpc.stub.AbstractBlockingStub<ReservationsBlockingStub> {
    private ReservationsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationsBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sep3.databaseserver.protobuff.ReservationMessage acceptPassenger(via.sep3.databaseserver.protobuff.AcceptMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAcceptPassengerMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection getAllReservationsToAccept(via.sep3.databaseserver.protobuff.IdMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllReservationsToAcceptMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection getAcceptedReservationsByRideId(via.sep3.databaseserver.protobuff.IdMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAcceptedReservationsByRideIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection getAllReservationsByUserId(via.sep3.databaseserver.protobuff.IdMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllReservationsByUserIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.databaseserver.protobuff.BoolValue changeReservationStatus(via.sep3.databaseserver.protobuff.ChangeReservStatusMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeReservationStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReservationsFutureStub extends io.grpc.stub.AbstractFutureStub<ReservationsFutureStub> {
    private ReservationsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.databaseserver.protobuff.ReservationMessage> acceptPassenger(
        via.sep3.databaseserver.protobuff.AcceptMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAcceptPassengerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection> getAllReservationsToAccept(
        via.sep3.databaseserver.protobuff.IdMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllReservationsToAcceptMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection> getAcceptedReservationsByRideId(
        via.sep3.databaseserver.protobuff.IdMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAcceptedReservationsByRideIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection> getAllReservationsByUserId(
        via.sep3.databaseserver.protobuff.IdMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllReservationsByUserIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.databaseserver.protobuff.BoolValue> changeReservationStatus(
        via.sep3.databaseserver.protobuff.ChangeReservStatusMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeReservationStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACCEPT_PASSENGER = 0;
  private static final int METHODID_GET_ALL_RESERVATIONS_TO_ACCEPT = 1;
  private static final int METHODID_GET_ACCEPTED_RESERVATIONS_BY_RIDE_ID = 2;
  private static final int METHODID_GET_ALL_RESERVATIONS_BY_USER_ID = 3;
  private static final int METHODID_CHANGE_RESERVATION_STATUS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReservationsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReservationsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACCEPT_PASSENGER:
          serviceImpl.acceptPassenger((via.sep3.databaseserver.protobuff.AcceptMessage) request,
              (io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.ReservationMessage>) responseObserver);
          break;
        case METHODID_GET_ALL_RESERVATIONS_TO_ACCEPT:
          serviceImpl.getAllReservationsToAccept((via.sep3.databaseserver.protobuff.IdMessage) request,
              (io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection>) responseObserver);
          break;
        case METHODID_GET_ACCEPTED_RESERVATIONS_BY_RIDE_ID:
          serviceImpl.getAcceptedReservationsByRideId((via.sep3.databaseserver.protobuff.IdMessage) request,
              (io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection>) responseObserver);
          break;
        case METHODID_GET_ALL_RESERVATIONS_BY_USER_ID:
          serviceImpl.getAllReservationsByUserId((via.sep3.databaseserver.protobuff.IdMessage) request,
              (io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.ReservationsToAcceptCollection>) responseObserver);
          break;
        case METHODID_CHANGE_RESERVATION_STATUS:
          serviceImpl.changeReservationStatus((via.sep3.databaseserver.protobuff.ChangeReservStatusMessage) request,
              (io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.BoolValue>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ReservationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservationsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sep3.databaseserver.protobuff.Reservation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Reservations");
    }
  }

  private static final class ReservationsFileDescriptorSupplier
      extends ReservationsBaseDescriptorSupplier {
    ReservationsFileDescriptorSupplier() {}
  }

  private static final class ReservationsMethodDescriptorSupplier
      extends ReservationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReservationsMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ReservationsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationsFileDescriptorSupplier())
              .addMethod(getAcceptPassengerMethod())
              .addMethod(getGetAllReservationsToAcceptMethod())
              .addMethod(getGetAcceptedReservationsByRideIdMethod())
              .addMethod(getGetAllReservationsByUserIdMethod())
              .addMethod(getChangeReservationStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
