package via.sep3.databaseserver.protobuff;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Users.proto")
public final class UsersGrpc {

  private UsersGrpc() {}

  public static final String SERVICE_NAME = "Users";

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
    if ((getCreateAccountMethod = UsersGrpc.getCreateAccountMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getCreateAccountMethod = UsersGrpc.getCreateAccountMethod) == null) {
          UsersGrpc.getCreateAccountMethod = getCreateAccountMethod =
              io.grpc.MethodDescriptor.<via.sep3.databaseserver.protobuff.CreateAccountMessage, via.sep3.databaseserver.protobuff.UserMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.CreateAccountMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.UserMessage.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("createAccount"))
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
    if ((getLoginMethod = UsersGrpc.getLoginMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getLoginMethod = UsersGrpc.getLoginMethod) == null) {
          UsersGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<via.sep3.databaseserver.protobuff.LoginMessage, via.sep3.databaseserver.protobuff.BoolMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.LoginMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.BoolMessage.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.UsersMessageId,
      via.sep3.databaseserver.protobuff.UserMessage> getGetDriverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDriver",
      requestType = via.sep3.databaseserver.protobuff.UsersMessageId.class,
      responseType = via.sep3.databaseserver.protobuff.UserMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.UsersMessageId,
      via.sep3.databaseserver.protobuff.UserMessage> getGetDriverMethod() {
    io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.UsersMessageId, via.sep3.databaseserver.protobuff.UserMessage> getGetDriverMethod;
    if ((getGetDriverMethod = UsersGrpc.getGetDriverMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGetDriverMethod = UsersGrpc.getGetDriverMethod) == null) {
          UsersGrpc.getGetDriverMethod = getGetDriverMethod =
              io.grpc.MethodDescriptor.<via.sep3.databaseserver.protobuff.UsersMessageId, via.sep3.databaseserver.protobuff.UserMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDriver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.UsersMessageId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.UserMessage.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("getDriver"))
              .build();
        }
      }
    }
    return getGetDriverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.LicenseMessage,
      via.sep3.databaseserver.protobuff.StatusMessage> getUpdateLicenseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateLicense",
      requestType = via.sep3.databaseserver.protobuff.LicenseMessage.class,
      responseType = via.sep3.databaseserver.protobuff.StatusMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.LicenseMessage,
      via.sep3.databaseserver.protobuff.StatusMessage> getUpdateLicenseMethod() {
    io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.LicenseMessage, via.sep3.databaseserver.protobuff.StatusMessage> getUpdateLicenseMethod;
    if ((getUpdateLicenseMethod = UsersGrpc.getUpdateLicenseMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getUpdateLicenseMethod = UsersGrpc.getUpdateLicenseMethod) == null) {
          UsersGrpc.getUpdateLicenseMethod = getUpdateLicenseMethod =
              io.grpc.MethodDescriptor.<via.sep3.databaseserver.protobuff.LicenseMessage, via.sep3.databaseserver.protobuff.StatusMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateLicense"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.LicenseMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.StatusMessage.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("updateLicense"))
              .build();
        }
      }
    }
    return getUpdateLicenseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UsersStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersStub>() {
        @java.lang.Override
        public UsersStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersStub(channel, callOptions);
        }
      };
    return UsersStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UsersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersBlockingStub>() {
        @java.lang.Override
        public UsersBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersBlockingStub(channel, callOptions);
        }
      };
    return UsersBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UsersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersFutureStub>() {
        @java.lang.Override
        public UsersFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersFutureStub(channel, callOptions);
        }
      };
    return UsersFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UsersImplBase implements io.grpc.BindableService {

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
    public void getDriver(via.sep3.databaseserver.protobuff.UsersMessageId request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.UserMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDriverMethod(), responseObserver);
    }

    /**
     */
    public void updateLicense(via.sep3.databaseserver.protobuff.LicenseMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.StatusMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateLicenseMethod(), responseObserver);
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
                via.sep3.databaseserver.protobuff.UsersMessageId,
                via.sep3.databaseserver.protobuff.UserMessage>(
                  this, METHODID_GET_DRIVER)))
          .addMethod(
            getUpdateLicenseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.databaseserver.protobuff.LicenseMessage,
                via.sep3.databaseserver.protobuff.StatusMessage>(
                  this, METHODID_UPDATE_LICENSE)))
          .build();
    }
  }

  /**
   */
  public static final class UsersStub extends io.grpc.stub.AbstractAsyncStub<UsersStub> {
    private UsersStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersStub(channel, callOptions);
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
    public void getDriver(via.sep3.databaseserver.protobuff.UsersMessageId request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.UserMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDriverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateLicense(via.sep3.databaseserver.protobuff.LicenseMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.StatusMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateLicenseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UsersBlockingStub extends io.grpc.stub.AbstractBlockingStub<UsersBlockingStub> {
    private UsersBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersBlockingStub(channel, callOptions);
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
    public via.sep3.databaseserver.protobuff.UserMessage getDriver(via.sep3.databaseserver.protobuff.UsersMessageId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDriverMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.databaseserver.protobuff.StatusMessage updateLicense(via.sep3.databaseserver.protobuff.LicenseMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateLicenseMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UsersFutureStub extends io.grpc.stub.AbstractFutureStub<UsersFutureStub> {
    private UsersFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersFutureStub(channel, callOptions);
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
        via.sep3.databaseserver.protobuff.UsersMessageId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDriverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.databaseserver.protobuff.StatusMessage> updateLicense(
        via.sep3.databaseserver.protobuff.LicenseMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateLicenseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ACCOUNT = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_GET_DRIVER = 2;
  private static final int METHODID_UPDATE_LICENSE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UsersImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UsersImplBase serviceImpl, int methodId) {
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
          serviceImpl.getDriver((via.sep3.databaseserver.protobuff.UsersMessageId) request,
              (io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.UserMessage>) responseObserver);
          break;
        case METHODID_UPDATE_LICENSE:
          serviceImpl.updateLicense((via.sep3.databaseserver.protobuff.LicenseMessage) request,
              (io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.StatusMessage>) responseObserver);
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

  private static abstract class UsersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UsersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sep3.databaseserver.protobuff.UsersOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Users");
    }
  }

  private static final class UsersFileDescriptorSupplier
      extends UsersBaseDescriptorSupplier {
    UsersFileDescriptorSupplier() {}
  }

  private static final class UsersMethodDescriptorSupplier
      extends UsersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UsersMethodDescriptorSupplier(String methodName) {
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
      synchronized (UsersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UsersFileDescriptorSupplier())
              .addMethod(getCreateAccountMethod())
              .addMethod(getLoginMethod())
              .addMethod(getGetDriverMethod())
              .addMethod(getUpdateLicenseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
