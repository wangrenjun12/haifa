// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Greeter.proto

package org.wrj.haifa.grpc;

public final class GrpcTestServiceProto {
  private GrpcTestServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GrpcJavaDemo_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GrpcJavaDemo_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GrpcJavaDemo_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GrpcJavaDemo_HelloReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rGreeter.proto\022\014GrpcJavaDemo\"\034\n\014HelloRe" +
      "quest\022\014\n\004name\030\001 \001(\t\"\035\n\nHelloReply\022\017\n\007mes" +
      "sage\030\001 \001(\t2M\n\007Greeter\022B\n\010SayHello\022\032.Grpc" +
      "JavaDemo.HelloRequest\032\030.GrpcJavaDemo.Hel" +
      "loReply\"\000B,\n\022org.wrj.haifa.grpcB\024GrpcTes" +
      "tServiceProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_GrpcJavaDemo_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GrpcJavaDemo_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GrpcJavaDemo_HelloRequest_descriptor,
        new String[] { "Name", });
    internal_static_GrpcJavaDemo_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GrpcJavaDemo_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GrpcJavaDemo_HelloReply_descriptor,
        new String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}