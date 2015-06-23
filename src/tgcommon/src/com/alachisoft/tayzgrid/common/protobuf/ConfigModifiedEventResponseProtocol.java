// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ConfigModifiedEventResponse.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class ConfigModifiedEventResponseProtocol {
  private ConfigModifiedEventResponseProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class ConfigModifiedEventResponse extends
      com.google.protobuf.GeneratedMessage {
    // Use ConfigModifiedEventResponse.newBuilder() to construct.
    private ConfigModifiedEventResponse() {
      initFields();
    }
    private ConfigModifiedEventResponse(boolean noInit) {}
    
    private static final ConfigModifiedEventResponse defaultInstance;
    public static ConfigModifiedEventResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public ConfigModifiedEventResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_ConfigModifiedEventResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_ConfigModifiedEventResponse_fieldAccessorTable;
    }
    
    // optional string hotConfig = 1;
    public static final int HOTCONFIG_FIELD_NUMBER = 1;
    private boolean hasHotConfig;
    private java.lang.String hotConfig_ = "";
    public boolean hasHotConfig() { return hasHotConfig; }
    public java.lang.String getHotConfig() { return hotConfig_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasHotConfig()) {
        output.writeString(1, getHotConfig());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasHotConfig()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getHotConfig());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse.getDefaultInstance()) return this;
        if (other.hasHotConfig()) {
          setHotConfig(other.getHotConfig());
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
              setHotConfig(input.readString());
              break;
            }
          }
        }
      }
      
      
      // optional string hotConfig = 1;
      public boolean hasHotConfig() {
        return result.hasHotConfig();
      }
      public java.lang.String getHotConfig() {
        return result.getHotConfig();
      }
      public Builder setHotConfig(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasHotConfig = true;
        result.hotConfig_ = value;
        return this;
      }
      public Builder clearHotConfig() {
        result.hasHotConfig = false;
        result.hotConfig_ = getDefaultInstance().getHotConfig();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponse)
    }
    
    static {
      defaultInstance = new ConfigModifiedEventResponse(true);
      com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_ConfigModifiedEventResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_ConfigModifiedEventResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!ConfigModifiedEventResponse.proto\022\'com" +
      ".alachisoft.tayzgrid.common.protobuf\"0\n\033" +
      "ConfigModifiedEventResponse\022\021\n\thotConfig" +
      "\030\001 \001(\tB%B#ConfigModifiedEventResponsePro" +
      "tocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_ConfigModifiedEventResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_ConfigModifiedEventResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_ConfigModifiedEventResponse_descriptor,
              new java.lang.String[] { "HotConfig", },
              com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse.class,
              com.alachisoft.tayzgrid.common.protobuf.ConfigModifiedEventResponseProtocol.ConfigModifiedEventResponse.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}