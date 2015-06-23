// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ColumnValue.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class ColumnValueProtocol {
  private ColumnValueProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class ColumnValue extends
      com.google.protobuf.GeneratedMessage {
    // Use ColumnValue.newBuilder() to construct.
    private ColumnValue() {
      initFields();
    }
    private ColumnValue(boolean noInit) {}
    
    private static final ColumnValue defaultInstance;
    public static ColumnValue getDefaultInstance() {
      return defaultInstance;
    }
    
    public ColumnValue getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_ColumnValue_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_ColumnValue_fieldAccessorTable;
    }
    
    // optional string stringValue = 1;
    public static final int STRINGVALUE_FIELD_NUMBER = 1;
    private boolean hasStringValue;
    private java.lang.String stringValue_ = "";
    public boolean hasStringValue() { return hasStringValue; }
    public java.lang.String getStringValue() { return stringValue_; }
    
    // optional .com.alachisoft.tayzgrid.common.protobuf.AverageResult avgResult = 2;
    public static final int AVGRESULT_FIELD_NUMBER = 2;
    private boolean hasAvgResult;
    private com.alachisoft.tayzgrid.common.protobuf.AverageResultProtocol.AverageResult avgResult_;
    public boolean hasAvgResult() { return hasAvgResult; }
    public com.alachisoft.tayzgrid.common.protobuf.AverageResultProtocol.AverageResult getAvgResult() { return avgResult_; }
    
    private void initFields() {
      avgResult_ = com.alachisoft.tayzgrid.common.protobuf.AverageResultProtocol.AverageResult.getDefaultInstance();
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasStringValue()) {
        output.writeString(1, getStringValue());
      }
      if (hasAvgResult()) {
        output.writeMessage(2, getAvgResult());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasStringValue()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getStringValue());
      }
      if (hasAvgResult()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getAvgResult());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue.getDefaultInstance()) return this;
        if (other.hasStringValue()) {
          setStringValue(other.getStringValue());
        }
        if (other.hasAvgResult()) {
          mergeAvgResult(other.getAvgResult());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              setStringValue(input.readString());
              break;
            }
            case 18: {
              com.alachisoft.tayzgrid.common.protobuf.AverageResultProtocol.AverageResult.Builder subBuilder = com.alachisoft.tayzgrid.common.protobuf.AverageResultProtocol.AverageResult.newBuilder();
              if (hasAvgResult()) {
                subBuilder.mergeFrom(getAvgResult());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setAvgResult(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      
      // optional string stringValue = 1;
      public boolean hasStringValue() {
        return result.hasStringValue();
      }
      public java.lang.String getStringValue() {
        return result.getStringValue();
      }
      public Builder setStringValue(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasStringValue = true;
        result.stringValue_ = value;
        return this;
      }
      public Builder clearStringValue() {
        result.hasStringValue = false;
        result.stringValue_ = getDefaultInstance().getStringValue();
        return this;
      }
      
      // optional .com.alachisoft.tayzgrid.common.protobuf.AverageResult avgResult = 2;
      public boolean hasAvgResult() {
        return result.hasAvgResult();
      }
      public com.alachisoft.tayzgrid.common.protobuf.AverageResultProtocol.AverageResult getAvgResult() {
        return result.getAvgResult();
      }
      public Builder setAvgResult(com.alachisoft.tayzgrid.common.protobuf.AverageResultProtocol.AverageResult value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasAvgResult = true;
        result.avgResult_ = value;
        return this;
      }
      public Builder setAvgResult(com.alachisoft.tayzgrid.common.protobuf.AverageResultProtocol.AverageResult.Builder builderForValue) {
        result.hasAvgResult = true;
        result.avgResult_ = builderForValue.build();
        return this;
      }
      public Builder mergeAvgResult(com.alachisoft.tayzgrid.common.protobuf.AverageResultProtocol.AverageResult value) {
        if (result.hasAvgResult() &&
            result.avgResult_ != com.alachisoft.tayzgrid.common.protobuf.AverageResultProtocol.AverageResult.getDefaultInstance()) {
          result.avgResult_ =
            com.alachisoft.tayzgrid.common.protobuf.AverageResultProtocol.AverageResult.newBuilder(result.avgResult_).mergeFrom(value).buildPartial();
        } else {
          result.avgResult_ = value;
        }
        result.hasAvgResult = true;
        return this;
      }
      public Builder clearAvgResult() {
        result.hasAvgResult = false;
        result.avgResult_ = com.alachisoft.tayzgrid.common.protobuf.AverageResultProtocol.AverageResult.getDefaultInstance();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.ColumnValue)
    }
    
    static {
      defaultInstance = new ColumnValue(true);
      com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.ColumnValue)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_ColumnValue_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_ColumnValue_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ColumnValue.proto\022\'com.alachisoft.tayz" +
      "grid.common.protobuf\032\023AverageResult.prot" +
      "o\"m\n\013ColumnValue\022\023\n\013stringValue\030\001 \001(\t\022I\n" +
      "\tavgResult\030\002 \001(\01326.com.alachisoft.tayzgr" +
      "id.common.protobuf.AverageResultB\025B\023Colu" +
      "mnValueProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_ColumnValue_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_ColumnValue_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_ColumnValue_descriptor,
              new java.lang.String[] { "StringValue", "AvgResult", },
              com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue.class,
              com.alachisoft.tayzgrid.common.protobuf.ColumnValueProtocol.ColumnValue.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.alachisoft.tayzgrid.common.protobuf.AverageResultProtocol.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}