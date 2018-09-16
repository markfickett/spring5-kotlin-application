package app.grpc.server.gen.task;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.1)",
    comments = "Source: task.proto")
public final class TaskServiceGrpc {

  private TaskServiceGrpc() {}

  public static final String SERVICE_NAME = "messages.TaskService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<app.grpc.server.gen.task.GetTaskInbound,
      app.grpc.server.gen.task.TaskOutbound> METHOD_GET_TASK_SERVICE =
      io.grpc.MethodDescriptor.<app.grpc.server.gen.task.GetTaskInbound, app.grpc.server.gen.task.TaskOutbound>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "messages.TaskService", "GetTaskService"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              app.grpc.server.gen.task.GetTaskInbound.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              app.grpc.server.gen.task.TaskOutbound.getDefaultInstance()))
          .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("GetTaskService"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<app.grpc.server.gen.task.FindTaskInbound,
      app.grpc.server.gen.task.TaskOutbound> METHOD_FIND_TASK_SERVICE =
      io.grpc.MethodDescriptor.<app.grpc.server.gen.task.FindTaskInbound, app.grpc.server.gen.task.TaskOutbound>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "messages.TaskService", "FindTaskService"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              app.grpc.server.gen.task.FindTaskInbound.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              app.grpc.server.gen.task.TaskOutbound.getDefaultInstance()))
          .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("FindTaskService"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<app.grpc.server.gen.task.CreateTaskInbound,
      app.grpc.server.gen.task.TaskOutbound> METHOD_CREATE_TASK_SERVICE =
      io.grpc.MethodDescriptor.<app.grpc.server.gen.task.CreateTaskInbound, app.grpc.server.gen.task.TaskOutbound>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "messages.TaskService", "CreateTaskService"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              app.grpc.server.gen.task.CreateTaskInbound.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              app.grpc.server.gen.task.TaskOutbound.getDefaultInstance()))
          .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("CreateTaskService"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<app.grpc.server.gen.task.UpdateTaskInbound,
      app.grpc.server.gen.task.TaskOutbound> METHOD_UPDATE_TASK_SERVICE =
      io.grpc.MethodDescriptor.<app.grpc.server.gen.task.UpdateTaskInbound, app.grpc.server.gen.task.TaskOutbound>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "messages.TaskService", "UpdateTaskService"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              app.grpc.server.gen.task.UpdateTaskInbound.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              app.grpc.server.gen.task.TaskOutbound.getDefaultInstance()))
          .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("UpdateTaskService"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<app.grpc.server.gen.task.GetTaskInbound,
      app.grpc.server.gen.task.TaskOutbound> METHOD_DELETE_TASK_SERVICE =
      io.grpc.MethodDescriptor.<app.grpc.server.gen.task.GetTaskInbound, app.grpc.server.gen.task.TaskOutbound>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "messages.TaskService", "DeleteTaskService"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              app.grpc.server.gen.task.GetTaskInbound.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              app.grpc.server.gen.task.TaskOutbound.getDefaultInstance()))
          .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("DeleteTaskService"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<app.grpc.server.gen.task.GetTaskInbound,
      app.grpc.server.gen.task.TaskOutbound> METHOD_FINISH_TASK_SERVICE =
      io.grpc.MethodDescriptor.<app.grpc.server.gen.task.GetTaskInbound, app.grpc.server.gen.task.TaskOutbound>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "messages.TaskService", "FinishTaskService"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              app.grpc.server.gen.task.GetTaskInbound.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              app.grpc.server.gen.task.TaskOutbound.getDefaultInstance()))
          .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("FinishTaskService"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      app.grpc.server.gen.task.TaskCountOutbound> METHOD_GET_TASK_COUNT =
      io.grpc.MethodDescriptor.<com.google.protobuf.Empty, app.grpc.server.gen.task.TaskCountOutbound>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "messages.TaskService", "GetTaskCount"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              app.grpc.server.gen.task.TaskCountOutbound.getDefaultInstance()))
          .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("GetTaskCount"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TaskServiceStub newStub(io.grpc.Channel channel) {
    return new TaskServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TaskServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TaskServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TaskServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TaskServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TaskServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTaskService(app.grpc.server.gen.task.GetTaskInbound request,
        io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskOutbound> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TASK_SERVICE, responseObserver);
    }

    /**
     */
    public void findTaskService(app.grpc.server.gen.task.FindTaskInbound request,
        io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskOutbound> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_TASK_SERVICE, responseObserver);
    }

    /**
     */
    public void createTaskService(app.grpc.server.gen.task.CreateTaskInbound request,
        io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskOutbound> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_TASK_SERVICE, responseObserver);
    }

    /**
     */
    public void updateTaskService(app.grpc.server.gen.task.UpdateTaskInbound request,
        io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskOutbound> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_TASK_SERVICE, responseObserver);
    }

    /**
     */
    public void deleteTaskService(app.grpc.server.gen.task.GetTaskInbound request,
        io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskOutbound> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_TASK_SERVICE, responseObserver);
    }

    /**
     */
    public void finishTaskService(app.grpc.server.gen.task.GetTaskInbound request,
        io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskOutbound> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FINISH_TASK_SERVICE, responseObserver);
    }

    /**
     */
    public void getTaskCount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskCountOutbound> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TASK_COUNT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_TASK_SERVICE,
            asyncUnaryCall(
              new MethodHandlers<
                app.grpc.server.gen.task.GetTaskInbound,
                app.grpc.server.gen.task.TaskOutbound>(
                  this, METHODID_GET_TASK_SERVICE)))
          .addMethod(
            METHOD_FIND_TASK_SERVICE,
            asyncServerStreamingCall(
              new MethodHandlers<
                app.grpc.server.gen.task.FindTaskInbound,
                app.grpc.server.gen.task.TaskOutbound>(
                  this, METHODID_FIND_TASK_SERVICE)))
          .addMethod(
            METHOD_CREATE_TASK_SERVICE,
            asyncUnaryCall(
              new MethodHandlers<
                app.grpc.server.gen.task.CreateTaskInbound,
                app.grpc.server.gen.task.TaskOutbound>(
                  this, METHODID_CREATE_TASK_SERVICE)))
          .addMethod(
            METHOD_UPDATE_TASK_SERVICE,
            asyncUnaryCall(
              new MethodHandlers<
                app.grpc.server.gen.task.UpdateTaskInbound,
                app.grpc.server.gen.task.TaskOutbound>(
                  this, METHODID_UPDATE_TASK_SERVICE)))
          .addMethod(
            METHOD_DELETE_TASK_SERVICE,
            asyncUnaryCall(
              new MethodHandlers<
                app.grpc.server.gen.task.GetTaskInbound,
                app.grpc.server.gen.task.TaskOutbound>(
                  this, METHODID_DELETE_TASK_SERVICE)))
          .addMethod(
            METHOD_FINISH_TASK_SERVICE,
            asyncUnaryCall(
              new MethodHandlers<
                app.grpc.server.gen.task.GetTaskInbound,
                app.grpc.server.gen.task.TaskOutbound>(
                  this, METHODID_FINISH_TASK_SERVICE)))
          .addMethod(
            METHOD_GET_TASK_COUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                app.grpc.server.gen.task.TaskCountOutbound>(
                  this, METHODID_GET_TASK_COUNT)))
          .build();
    }
  }

  /**
   */
  public static final class TaskServiceStub extends io.grpc.stub.AbstractStub<TaskServiceStub> {
    private TaskServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskServiceStub(channel, callOptions);
    }

    /**
     */
    public void getTaskService(app.grpc.server.gen.task.GetTaskInbound request,
        io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskOutbound> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TASK_SERVICE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findTaskService(app.grpc.server.gen.task.FindTaskInbound request,
        io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskOutbound> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_FIND_TASK_SERVICE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTaskService(app.grpc.server.gen.task.CreateTaskInbound request,
        io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskOutbound> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_TASK_SERVICE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTaskService(app.grpc.server.gen.task.UpdateTaskInbound request,
        io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskOutbound> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_TASK_SERVICE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTaskService(app.grpc.server.gen.task.GetTaskInbound request,
        io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskOutbound> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_TASK_SERVICE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void finishTaskService(app.grpc.server.gen.task.GetTaskInbound request,
        io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskOutbound> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FINISH_TASK_SERVICE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTaskCount(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskCountOutbound> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TASK_COUNT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TaskServiceBlockingStub extends io.grpc.stub.AbstractStub<TaskServiceBlockingStub> {
    private TaskServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public app.grpc.server.gen.task.TaskOutbound getTaskService(app.grpc.server.gen.task.GetTaskInbound request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TASK_SERVICE, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<app.grpc.server.gen.task.TaskOutbound> findTaskService(
        app.grpc.server.gen.task.FindTaskInbound request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_FIND_TASK_SERVICE, getCallOptions(), request);
    }

    /**
     */
    public app.grpc.server.gen.task.TaskOutbound createTaskService(app.grpc.server.gen.task.CreateTaskInbound request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_TASK_SERVICE, getCallOptions(), request);
    }

    /**
     */
    public app.grpc.server.gen.task.TaskOutbound updateTaskService(app.grpc.server.gen.task.UpdateTaskInbound request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_TASK_SERVICE, getCallOptions(), request);
    }

    /**
     */
    public app.grpc.server.gen.task.TaskOutbound deleteTaskService(app.grpc.server.gen.task.GetTaskInbound request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_TASK_SERVICE, getCallOptions(), request);
    }

    /**
     */
    public app.grpc.server.gen.task.TaskOutbound finishTaskService(app.grpc.server.gen.task.GetTaskInbound request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FINISH_TASK_SERVICE, getCallOptions(), request);
    }

    /**
     */
    public app.grpc.server.gen.task.TaskCountOutbound getTaskCount(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TASK_COUNT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TaskServiceFutureStub extends io.grpc.stub.AbstractStub<TaskServiceFutureStub> {
    private TaskServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.grpc.server.gen.task.TaskOutbound> getTaskService(
        app.grpc.server.gen.task.GetTaskInbound request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TASK_SERVICE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.grpc.server.gen.task.TaskOutbound> createTaskService(
        app.grpc.server.gen.task.CreateTaskInbound request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_TASK_SERVICE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.grpc.server.gen.task.TaskOutbound> updateTaskService(
        app.grpc.server.gen.task.UpdateTaskInbound request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_TASK_SERVICE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.grpc.server.gen.task.TaskOutbound> deleteTaskService(
        app.grpc.server.gen.task.GetTaskInbound request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_TASK_SERVICE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.grpc.server.gen.task.TaskOutbound> finishTaskService(
        app.grpc.server.gen.task.GetTaskInbound request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FINISH_TASK_SERVICE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<app.grpc.server.gen.task.TaskCountOutbound> getTaskCount(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TASK_COUNT, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TASK_SERVICE = 0;
  private static final int METHODID_FIND_TASK_SERVICE = 1;
  private static final int METHODID_CREATE_TASK_SERVICE = 2;
  private static final int METHODID_UPDATE_TASK_SERVICE = 3;
  private static final int METHODID_DELETE_TASK_SERVICE = 4;
  private static final int METHODID_FINISH_TASK_SERVICE = 5;
  private static final int METHODID_GET_TASK_COUNT = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TaskServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TaskServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TASK_SERVICE:
          serviceImpl.getTaskService((app.grpc.server.gen.task.GetTaskInbound) request,
              (io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskOutbound>) responseObserver);
          break;
        case METHODID_FIND_TASK_SERVICE:
          serviceImpl.findTaskService((app.grpc.server.gen.task.FindTaskInbound) request,
              (io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskOutbound>) responseObserver);
          break;
        case METHODID_CREATE_TASK_SERVICE:
          serviceImpl.createTaskService((app.grpc.server.gen.task.CreateTaskInbound) request,
              (io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskOutbound>) responseObserver);
          break;
        case METHODID_UPDATE_TASK_SERVICE:
          serviceImpl.updateTaskService((app.grpc.server.gen.task.UpdateTaskInbound) request,
              (io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskOutbound>) responseObserver);
          break;
        case METHODID_DELETE_TASK_SERVICE:
          serviceImpl.deleteTaskService((app.grpc.server.gen.task.GetTaskInbound) request,
              (io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskOutbound>) responseObserver);
          break;
        case METHODID_FINISH_TASK_SERVICE:
          serviceImpl.finishTaskService((app.grpc.server.gen.task.GetTaskInbound) request,
              (io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskOutbound>) responseObserver);
          break;
        case METHODID_GET_TASK_COUNT:
          serviceImpl.getTaskCount((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<app.grpc.server.gen.task.TaskCountOutbound>) responseObserver);
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

  private static abstract class TaskServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TaskServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return app.grpc.server.gen.task.TaskServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TaskService");
    }
  }

  private static final class TaskServiceFileDescriptorSupplier
      extends TaskServiceBaseDescriptorSupplier {
    TaskServiceFileDescriptorSupplier() {}
  }

  private static final class TaskServiceMethodDescriptorSupplier
      extends TaskServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TaskServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TaskServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TaskServiceFileDescriptorSupplier())
              .addMethod(METHOD_GET_TASK_SERVICE)
              .addMethod(METHOD_FIND_TASK_SERVICE)
              .addMethod(METHOD_CREATE_TASK_SERVICE)
              .addMethod(METHOD_UPDATE_TASK_SERVICE)
              .addMethod(METHOD_DELETE_TASK_SERVICE)
              .addMethod(METHOD_FINISH_TASK_SERVICE)
              .addMethod(METHOD_GET_TASK_COUNT)
              .build();
        }
      }
    }
    return result;
  }
}
