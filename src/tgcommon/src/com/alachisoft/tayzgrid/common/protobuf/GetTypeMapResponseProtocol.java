// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetTypeMapResponse.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class GetTypeMapResponseProtocol {
  private GetTypeMapResponseProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class GetTypeMapResponse extends
      com.google.protobuf.GeneratedMessage {
    // Use GetTypeMapResponse.newBuilder() to construct.
    private GetTypeMapResponse() {
      initFields();
    }
    private GetTypeMapResponse(boolean noInit) {}
    
    private static final GetTypeMapResponse defaultInstance;
    public static GetTypeMapResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public GetTypeMapResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_GetTypeMapResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_GetTypeMapResponse_fieldAccessorTable;
    }
    
    // optional string map = 1;
    public static final int MAP_FIELD_NUMBER = 1;
    private boolean hasMap;
    private java.lang.String map_ = "";
    public boolean hasMap() { return hasMap; }
    public java.lang.String getMap() { return map_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasMap()) {
        output.writeString(1, getMap());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasMap()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getMap());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse.getDefaultInstance()) return this;
        if (other.hasMap()) {
          setMap(other.getMap());
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
              setMap(input.readString());
              break;
            }
          }
        }
      }
      
      
      // optional string map = 1;
      public boolean hasMap() {
        return result.hasMap();
      }
      public java.lang.String getMap() {
        return result.getMap();
      }
      public Builder setMap(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasMap = true;
        result.map_ = value;
        return this;
      }
      public Builder clearMap() {
        result.hasMap = false;
        result.map_ = getDefaultInstance().getMap();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponse)
    }
    
    static {
      defaultInstance = new GetTypeMapResponse(true);
      com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_GetTypeMapResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_GetTypeMapResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GetTypeMapResponse.proto\022\'com.alachiso" +
      "ft.tayzgrid.common.protobuf\"!\n\022GetTypeMa" +
      "pResponse\022\013\n\003map\030\001 \001(\tB\034B\032GetTypeMapResp" +
      "onseProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_GetTypeMapResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_GetTypeMapResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_GetTypeMapResponse_descriptor,
              new java.lang.String[] { "Map", },
              com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse.class,
              com.alachisoft.tayzgrid.common.protobuf.GetTypeMapResponseProtocol.GetTypeMapResponse.Builder.class);
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
