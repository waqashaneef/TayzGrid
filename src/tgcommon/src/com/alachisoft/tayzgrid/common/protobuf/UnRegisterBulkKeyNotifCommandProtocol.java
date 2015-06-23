// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UnRegisterBulkKeyNotifCommand.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class UnRegisterBulkKeyNotifCommandProtocol {
  private UnRegisterBulkKeyNotifCommandProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class UnRegisterBulkKeyNotifCommand extends
      com.google.protobuf.GeneratedMessage {
    // Use UnRegisterBulkKeyNotifCommand.newBuilder() to construct.
    private UnRegisterBulkKeyNotifCommand() {
      initFields();
    }
    private UnRegisterBulkKeyNotifCommand(boolean noInit) {}
    
    private static final UnRegisterBulkKeyNotifCommand defaultInstance;
    public static UnRegisterBulkKeyNotifCommand getDefaultInstance() {
      return defaultInstance;
    }
    
    public UnRegisterBulkKeyNotifCommand getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_UnRegisterBulkKeyNotifCommand_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_UnRegisterBulkKeyNotifCommand_fieldAccessorTable;
    }
    
    // optional sint32 removeCallbackId = 1;
    public static final int REMOVECALLBACKID_FIELD_NUMBER = 1;
    private boolean hasRemoveCallbackId;
    private int removeCallbackId_ = 0;
    public boolean hasRemoveCallbackId() { return hasRemoveCallbackId; }
    public int getRemoveCallbackId() { return removeCallbackId_; }
    
    // optional sint32 updateCallbackId = 2;
    public static final int UPDATECALLBACKID_FIELD_NUMBER = 2;
    private boolean hasUpdateCallbackId;
    private int updateCallbackId_ = 0;
    public boolean hasUpdateCallbackId() { return hasUpdateCallbackId; }
    public int getUpdateCallbackId() { return updateCallbackId_; }
    
    // repeated bytes keys = 3;
    public static final int KEYS_FIELD_NUMBER = 3;
    private java.util.List<com.google.protobuf.ByteString> keys_ =
      java.util.Collections.emptyList();
    public java.util.List<com.google.protobuf.ByteString> getKeysList() {
      return keys_;
    }
    public int getKeysCount() { return keys_.size(); }
    public com.google.protobuf.ByteString getKeys(int index) {
      return keys_.get(index);
    }
    
    // optional int64 requestId = 4;
    public static final int REQUESTID_FIELD_NUMBER = 4;
    private boolean hasRequestId;
    private long requestId_ = 0L;
    public boolean hasRequestId() { return hasRequestId; }
    public long getRequestId() { return requestId_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasRemoveCallbackId()) {
        output.writeSInt32(1, getRemoveCallbackId());
      }
      if (hasUpdateCallbackId()) {
        output.writeSInt32(2, getUpdateCallbackId());
      }
      for (com.google.protobuf.ByteString element : getKeysList()) {
        output.writeBytes(3, element);
      }
      if (hasRequestId()) {
        output.writeInt64(4, getRequestId());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasRemoveCallbackId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(1, getRemoveCallbackId());
      }
      if (hasUpdateCallbackId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(2, getUpdateCallbackId());
      }
      {
        int dataSize = 0;
        for (com.google.protobuf.ByteString element : getKeysList()) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(element);
        }
        size += dataSize;
        size += 1 * getKeysList().size();
      }
      if (hasRequestId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, getRequestId());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.keys_ != java.util.Collections.EMPTY_LIST) {
          result.keys_ =
            java.util.Collections.unmodifiableList(result.keys_);
        }
        com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand.getDefaultInstance()) return this;
        if (other.hasRemoveCallbackId()) {
          setRemoveCallbackId(other.getRemoveCallbackId());
        }
        if (other.hasUpdateCallbackId()) {
          setUpdateCallbackId(other.getUpdateCallbackId());
        }
        if (!other.keys_.isEmpty()) {
          if (result.keys_.isEmpty()) {
            result.keys_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
          }
          result.keys_.addAll(other.keys_);
        }
        if (other.hasRequestId()) {
          setRequestId(other.getRequestId());
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
            case 8: {
              setRemoveCallbackId(input.readSInt32());
              break;
            }
            case 16: {
              setUpdateCallbackId(input.readSInt32());
              break;
            }
            case 26: {
              addKeys(input.readBytes());
              break;
            }
            case 32: {
              setRequestId(input.readInt64());
              break;
            }
          }
        }
      }
      
      
      // optional sint32 removeCallbackId = 1;
      public boolean hasRemoveCallbackId() {
        return result.hasRemoveCallbackId();
      }
      public int getRemoveCallbackId() {
        return result.getRemoveCallbackId();
      }
      public Builder setRemoveCallbackId(int value) {
        result.hasRemoveCallbackId = true;
        result.removeCallbackId_ = value;
        return this;
      }
      public Builder clearRemoveCallbackId() {
        result.hasRemoveCallbackId = false;
        result.removeCallbackId_ = 0;
        return this;
      }
      
      // optional sint32 updateCallbackId = 2;
      public boolean hasUpdateCallbackId() {
        return result.hasUpdateCallbackId();
      }
      public int getUpdateCallbackId() {
        return result.getUpdateCallbackId();
      }
      public Builder setUpdateCallbackId(int value) {
        result.hasUpdateCallbackId = true;
        result.updateCallbackId_ = value;
        return this;
      }
      public Builder clearUpdateCallbackId() {
        result.hasUpdateCallbackId = false;
        result.updateCallbackId_ = 0;
        return this;
      }
      
      // repeated bytes keys = 3;
      public java.util.List<com.google.protobuf.ByteString> getKeysList() {
        return java.util.Collections.unmodifiableList(result.keys_);
      }
      public int getKeysCount() {
        return result.getKeysCount();
      }
      public com.google.protobuf.ByteString getKeys(int index) {
        return result.getKeys(index);
      }
      public Builder setKeys(int index, com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.keys_.set(index, value);
        return this;
      }
      public Builder addKeys(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  if (result.keys_.isEmpty()) {
          result.keys_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
        }
        result.keys_.add(value);
        return this;
      }
      public Builder addAllKeys(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        if (result.keys_.isEmpty()) {
          result.keys_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
        }
        super.addAll(values, result.keys_);
        return this;
      }
      public Builder clearKeys() {
        result.keys_ = java.util.Collections.emptyList();
        return this;
      }
      
      // optional int64 requestId = 4;
      public boolean hasRequestId() {
        return result.hasRequestId();
      }
      public long getRequestId() {
        return result.getRequestId();
      }
      public Builder setRequestId(long value) {
        result.hasRequestId = true;
        result.requestId_ = value;
        return this;
      }
      public Builder clearRequestId() {
        result.hasRequestId = false;
        result.requestId_ = 0L;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommand)
    }
    
    static {
      defaultInstance = new UnRegisterBulkKeyNotifCommand(true);
      com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommand)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_UnRegisterBulkKeyNotifCommand_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_UnRegisterBulkKeyNotifCommand_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#UnRegisterBulkKeyNotifCommand.proto\022\'c" +
      "om.alachisoft.tayzgrid.common.protobuf\"t" +
      "\n\035UnRegisterBulkKeyNotifCommand\022\030\n\020remov" +
      "eCallbackId\030\001 \001(\021\022\030\n\020updateCallbackId\030\002 " +
      "\001(\021\022\014\n\004keys\030\003 \003(\014\022\021\n\trequestId\030\004 \001(\003B\'B%" +
      "UnRegisterBulkKeyNotifCommandProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_UnRegisterBulkKeyNotifCommand_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_UnRegisterBulkKeyNotifCommand_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_UnRegisterBulkKeyNotifCommand_descriptor,
              new java.lang.String[] { "RemoveCallbackId", "UpdateCallbackId", "Keys", "RequestId", },
              com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand.class,
              com.alachisoft.tayzgrid.common.protobuf.UnRegisterBulkKeyNotifCommandProtocol.UnRegisterBulkKeyNotifCommand.Builder.class);
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