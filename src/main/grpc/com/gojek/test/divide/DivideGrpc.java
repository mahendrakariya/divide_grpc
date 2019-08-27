package com.gojek.test.divide;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: divide.proto")
public final class DivideGrpc {

  private DivideGrpc() {}

  public static final String SERVICE_NAME = "divide.Divide";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.gojek.test.divide.Numbers,
      com.gojek.test.divide.Resp> getDoDivideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DoDivide",
      requestType = com.gojek.test.divide.Numbers.class,
      responseType = com.gojek.test.divide.Resp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gojek.test.divide.Numbers,
      com.gojek.test.divide.Resp> getDoDivideMethod() {
    io.grpc.MethodDescriptor<com.gojek.test.divide.Numbers, com.gojek.test.divide.Resp> getDoDivideMethod;
    if ((getDoDivideMethod = DivideGrpc.getDoDivideMethod) == null) {
      synchronized (DivideGrpc.class) {
        if ((getDoDivideMethod = DivideGrpc.getDoDivideMethod) == null) {
          DivideGrpc.getDoDivideMethod = getDoDivideMethod =
              io.grpc.MethodDescriptor.<com.gojek.test.divide.Numbers, com.gojek.test.divide.Resp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoDivide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gojek.test.divide.Numbers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gojek.test.divide.Resp.getDefaultInstance()))
              .setSchemaDescriptor(new DivideMethodDescriptorSupplier("DoDivide"))
              .build();
        }
      }
    }
    return getDoDivideMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DivideStub newStub(io.grpc.Channel channel) {
    return new DivideStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DivideBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DivideBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DivideFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DivideFutureStub(channel);
  }

  /**
   */
  public static abstract class DivideImplBase implements io.grpc.BindableService {

    /**
     */
    public void doDivide(com.gojek.test.divide.Numbers request,
        io.grpc.stub.StreamObserver<com.gojek.test.divide.Resp> responseObserver) {
      asyncUnimplementedUnaryCall(getDoDivideMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDoDivideMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.gojek.test.divide.Numbers,
                com.gojek.test.divide.Resp>(
                  this, METHODID_DO_DIVIDE)))
          .build();
    }
  }

  /**
   */
  public static final class DivideStub extends io.grpc.stub.AbstractStub<DivideStub> {
    private DivideStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DivideStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DivideStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DivideStub(channel, callOptions);
    }

    /**
     */
    public void doDivide(com.gojek.test.divide.Numbers request,
        io.grpc.stub.StreamObserver<com.gojek.test.divide.Resp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDoDivideMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DivideBlockingStub extends io.grpc.stub.AbstractStub<DivideBlockingStub> {
    private DivideBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DivideBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DivideBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DivideBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.gojek.test.divide.Resp doDivide(com.gojek.test.divide.Numbers request) {
      return blockingUnaryCall(
          getChannel(), getDoDivideMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DivideFutureStub extends io.grpc.stub.AbstractStub<DivideFutureStub> {
    private DivideFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DivideFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DivideFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DivideFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gojek.test.divide.Resp> doDivide(
        com.gojek.test.divide.Numbers request) {
      return futureUnaryCall(
          getChannel().newCall(getDoDivideMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DO_DIVIDE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DivideImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DivideImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DO_DIVIDE:
          serviceImpl.doDivide((com.gojek.test.divide.Numbers) request,
              (io.grpc.stub.StreamObserver<com.gojek.test.divide.Resp>) responseObserver);
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

  private static abstract class DivideBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DivideBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.gojek.test.divide.DivideService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Divide");
    }
  }

  private static final class DivideFileDescriptorSupplier
      extends DivideBaseDescriptorSupplier {
    DivideFileDescriptorSupplier() {}
  }

  private static final class DivideMethodDescriptorSupplier
      extends DivideBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DivideMethodDescriptorSupplier(String methodName) {
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
      synchronized (DivideGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DivideFileDescriptorSupplier())
              .addMethod(getDoDivideMethod())
              .build();
        }
      }
    }
    return result;
  }
}
