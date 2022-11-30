package via.sep3.databaseserver.protobuff;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: User.proto")
public final class UserGrpc {

  private UserGrpc() {}

  public static final String SERVICE_NAME = "User";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.CreateAccountMessage,
      via.sep3.databaseserver.protobuff.UserMessage> getCreateAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createAccount",
      requestType = via.sep3.databaseserver.protobuff.CreateAccountMessage.class,
      responseType = via.sep3.databaseserver.protobuff.UserMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.CreateAccountMessage,
      via.sep3.databaseserver.protobuff.UserMessage> getCreateAccountMethod() {
    io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.CreateAccountMessage, via.sep3.databaseserver.protobuff.UserMessage> getCreateAccountMethod;
    if ((getCreateAccountMethod = UserGrpc.getCreateAccountMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getCreateAccountMethod = UserGrpc.getCreateAccountMethod) == null) {
          UserGrpc.getCreateAccountMethod = getCreateAccountMethod =
              io.grpc.MethodDescriptor.<via.sep3.databaseserver.protobuff.CreateAccountMessage, via.sep3.databaseserver.protobuff.UserMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.CreateAccountMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.UserMessage.getDefaultInstance()))
              .setSchemaDescriptor(new UserMethodDescriptorSupplier("createAccount"))
              .build();
        }
      }
    }
    return getCreateAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.LoginMessage,
      via.sep3.databaseserver.protobuff.BoolMessage> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = via.sep3.databaseserver.protobuff.LoginMessage.class,
      responseType = via.sep3.databaseserver.protobuff.BoolMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.LoginMessage,
      via.sep3.databaseserver.protobuff.BoolMessage> getLoginMethod() {
    io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.LoginMessage, via.sep3.databaseserver.protobuff.BoolMessage> getLoginMethod;
    if ((getLoginMethod = UserGrpc.getLoginMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getLoginMethod = UserGrpc.getLoginMethod) == null) {
          UserGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<via.sep3.databaseserver.protobuff.LoginMessage, via.sep3.databaseserver.protobuff.BoolMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.LoginMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.BoolMessage.getDefaultInstance()))
              .setSchemaDescriptor(new UserMethodDescriptorSupplier("login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.GetDriverMessage,
      via.sep3.databaseserver.protobuff.UserMessage> getGetDriverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDriver",
      requestType = via.sep3.databaseserver.protobuff.GetDriverMessage.class,
      responseType = via.sep3.databaseserver.protobuff.UserMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.GetDriverMessage,
      via.sep3.databaseserver.protobuff.UserMessage> getGetDriverMethod() {
    io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.GetDriverMessage, via.sep3.databaseserver.protobuff.UserMessage> getGetDriverMethod;
    if ((getGetDriverMethod = UserGrpc.getGetDriverMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getGetDriverMethod = UserGrpc.getGetDriverMethod) == null) {
          UserGrpc.getGetDriverMethod = getGetDriverMethod =
              io.grpc.MethodDescriptor.<via.sep3.databaseserver.protobuff.GetDriverMessage, via.sep3.databaseserver.protobuff.UserMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDriver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.GetDriverMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.UserMessage.getDefaultInstance()))
              .setSchemaDescriptor(new UserMethodDescriptorSupplier("getDriver"))
              .build();
        }
      }
    }
    return getGetDriverMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserStub>() {
        @java.lang.Override
        public UserStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserStub(channel, callOptions);
        }
      };
    return UserStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserBlockingStub>() {
        @java.lang.Override
        public UserBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserBlockingStub(channel, callOptions);
        }
      };
    return UserBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserFutureStub>() {
        @java.lang.Override
        public UserFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserFutureStub(channel, callOptions);
        }
      };
    return UserFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserImplBase implements io.grpc.BindableService {

    /**
     */
    public void createAccount(via.sep3.databaseserver.protobuff.CreateAccountMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.UserMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAccountMethod(), responseObserver);
    }

    /**
     */
    public void login(via.sep3.databaseserver.protobuff.LoginMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.BoolMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void getDriver(via.sep3.databaseserver.protobuff.GetDriverMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.UserMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDriverMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateAccountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.databaseserver.protobuff.CreateAccountMessage,
                via.sep3.databaseserver.protobuff.UserMessage>(
                  this, METHODID_CREATE_ACCOUNT)))
          .addMethod(
            getLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.databaseserver.protobuff.LoginMessage,
                via.sep3.databaseserver.protobuff.BoolMessage>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getGetDriverMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.databaseserver.protobuff.GetDriverMessage,
                via.sep3.databaseserver.protobuff.UserMessage>(
                  this, METHODID_GET_DRIVER)))
          .build();
    }
  }

  /**
   */
  public static final class UserStub extends io.grpc.stub.AbstractAsyncStub<UserStub> {
    private UserStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserStub(channel, callOptions);
    }

    /**
     */
    public void createAccount(via.sep3.databaseserver.protobuff.CreateAccountMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.UserMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(via.sep3.databaseserver.protobuff.LoginMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.BoolMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDriver(via.sep3.databaseserver.protobuff.GetDriverMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.UserMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDriverMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserBlockingStub> {
    private UserBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sep3.databaseserver.protobuff.UserMessage createAccount(via.sep3.databaseserver.protobuff.CreateAccountMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.databaseserver.protobuff.BoolMessage login(via.sep3.databaseserver.protobuff.LoginMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.databaseserver.protobuff.UserMessage getDriver(via.sep3.databaseserver.protobuff.GetDriverMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDriverMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserFutureStub extends io.grpc.stub.AbstractFutureStub<UserFutureStub> {
    private UserFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.databaseserver.protobuff.UserMessage> createAccount(
        via.sep3.databaseserver.protobuff.CreateAccountMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.databaseserver.protobuff.BoolMessage> login(
        via.sep3.databaseserver.protobuff.LoginMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.databaseserver.protobuff.UserMessage> getDriver(
        via.sep3.databaseserver.protobuff.GetDriverMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDriverMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ACCOUNT = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_GET_DRIVER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ACCOUNT:
          serviceImpl.createAccount((via.sep3.databaseserver.protobuff.CreateAccountMessage) request,
              (io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.UserMessage>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((via.sep3.databaseserver.protobuff.LoginMessage) request,
              (io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.BoolMessage>) responseObserver);
          break;
        case METHODID_GET_DRIVER:
          serviceImpl.getDriver((via.sep3.databaseserver.protobuff.GetDriverMessage) request,
              (io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.UserMessage>) responseObserver);
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

  private static abstract class UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sep3.databaseserver.protobuff.UserOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("User");
    }
  }

  private static final class UserFileDescriptorSupplier
      extends UserBaseDescriptorSupplier {
    UserFileDescriptorSupplier() {}
  }

  private static final class UserMethodDescriptorSupplier
      extends UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserFileDescriptorSupplier())
              .addMethod(getCreateAccountMethod())
              .addMethod(getLoginMethod())
              .addMethod(getGetDriverMethod())
              .build();
        }
      }
    }
    return result;
  }
}
