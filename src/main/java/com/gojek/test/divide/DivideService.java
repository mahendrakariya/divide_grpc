// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: divide.proto

package com.gojek.test.divide;

public final class DivideService {
  private DivideService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_divide_Numbers_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_divide_Numbers_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_divide_Resp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_divide_Resp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014divide.proto\022\006divide\"\037\n\007Numbers\022\t\n\001a\030\001" +
      " \001(\005\022\t\n\001b\030\002 \001(\005\"\021\n\004Resp\022\t\n\001q\030\001 \001(\00525\n\006Di" +
      "vide\022+\n\010DoDivide\022\017.divide.Numbers\032\014.divi" +
      "de.Resp\"\000B(\n\025com.gojek.test.divideB\rDivi" +
      "deServiceP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_divide_Numbers_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_divide_Numbers_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_divide_Numbers_descriptor,
        new java.lang.String[] { "A", "B", });
    internal_static_divide_Resp_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_divide_Resp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_divide_Resp_descriptor,
        new java.lang.String[] { "Q", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}