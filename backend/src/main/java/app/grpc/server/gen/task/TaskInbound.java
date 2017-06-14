// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: task.proto

package app.grpc.server.gen.task;

/**
 * Protobuf type {@code messages.TaskInbound}
 */
public  final class TaskInbound extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:messages.TaskInbound)
    TaskInboundOrBuilder {
  // Use TaskInbound.newBuilder() to construct.
  private TaskInbound(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskInbound() {
    taskId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TaskInbound(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            taskId_ = input.readUInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return app.grpc.server.gen.task.TaskServiceProto.internal_static_messages_TaskInbound_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return app.grpc.server.gen.task.TaskServiceProto.internal_static_messages_TaskInbound_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            app.grpc.server.gen.task.TaskInbound.class, app.grpc.server.gen.task.TaskInbound.Builder.class);
  }

  public static final int TASK_ID_FIELD_NUMBER = 1;
  private int taskId_;
  /**
   * <code>uint32 task_id = 1;</code>
   */
  public int getTaskId() {
    return taskId_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (taskId_ != 0) {
      output.writeUInt32(1, taskId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (taskId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, taskId_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof app.grpc.server.gen.task.TaskInbound)) {
      return super.equals(obj);
    }
    app.grpc.server.gen.task.TaskInbound other = (app.grpc.server.gen.task.TaskInbound) obj;

    boolean result = true;
    result = result && (getTaskId()
        == other.getTaskId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TASK_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTaskId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static app.grpc.server.gen.task.TaskInbound parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.grpc.server.gen.task.TaskInbound parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.grpc.server.gen.task.TaskInbound parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static app.grpc.server.gen.task.TaskInbound parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static app.grpc.server.gen.task.TaskInbound parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.grpc.server.gen.task.TaskInbound parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.grpc.server.gen.task.TaskInbound parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static app.grpc.server.gen.task.TaskInbound parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static app.grpc.server.gen.task.TaskInbound parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static app.grpc.server.gen.task.TaskInbound parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(app.grpc.server.gen.task.TaskInbound prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code messages.TaskInbound}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:messages.TaskInbound)
      app.grpc.server.gen.task.TaskInboundOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return app.grpc.server.gen.task.TaskServiceProto.internal_static_messages_TaskInbound_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return app.grpc.server.gen.task.TaskServiceProto.internal_static_messages_TaskInbound_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              app.grpc.server.gen.task.TaskInbound.class, app.grpc.server.gen.task.TaskInbound.Builder.class);
    }

    // Construct using app.grpc.server.gen.task.TaskInbound.newBuilder()
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
    public Builder clear() {
      super.clear();
      taskId_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return app.grpc.server.gen.task.TaskServiceProto.internal_static_messages_TaskInbound_descriptor;
    }

    public app.grpc.server.gen.task.TaskInbound getDefaultInstanceForType() {
      return app.grpc.server.gen.task.TaskInbound.getDefaultInstance();
    }

    public app.grpc.server.gen.task.TaskInbound build() {
      app.grpc.server.gen.task.TaskInbound result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public app.grpc.server.gen.task.TaskInbound buildPartial() {
      app.grpc.server.gen.task.TaskInbound result = new app.grpc.server.gen.task.TaskInbound(this);
      result.taskId_ = taskId_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof app.grpc.server.gen.task.TaskInbound) {
        return mergeFrom((app.grpc.server.gen.task.TaskInbound)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(app.grpc.server.gen.task.TaskInbound other) {
      if (other == app.grpc.server.gen.task.TaskInbound.getDefaultInstance()) return this;
      if (other.getTaskId() != 0) {
        setTaskId(other.getTaskId());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      app.grpc.server.gen.task.TaskInbound parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (app.grpc.server.gen.task.TaskInbound) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int taskId_ ;
    /**
     * <code>uint32 task_id = 1;</code>
     */
    public int getTaskId() {
      return taskId_;
    }
    /**
     * <code>uint32 task_id = 1;</code>
     */
    public Builder setTaskId(int value) {
      
      taskId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 task_id = 1;</code>
     */
    public Builder clearTaskId() {
      
      taskId_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:messages.TaskInbound)
  }

  // @@protoc_insertion_point(class_scope:messages.TaskInbound)
  private static final app.grpc.server.gen.task.TaskInbound DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new app.grpc.server.gen.task.TaskInbound();
  }

  public static app.grpc.server.gen.task.TaskInbound getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskInbound>
      PARSER = new com.google.protobuf.AbstractParser<TaskInbound>() {
    public TaskInbound parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TaskInbound(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TaskInbound> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskInbound> getParserForType() {
    return PARSER;
  }

  public app.grpc.server.gen.task.TaskInbound getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
