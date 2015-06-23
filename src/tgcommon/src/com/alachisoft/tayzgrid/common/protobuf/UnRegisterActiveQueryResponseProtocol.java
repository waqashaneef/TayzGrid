/*
* Copyright (c) 2015, Alachisoft. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UnRegisterActiveQueryResponse.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class UnRegisterActiveQueryResponseProtocol {
  private UnRegisterActiveQueryResponseProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class UnRegisterActiveQueryResponse extends
      com.google.protobuf.GeneratedMessage {
    // Use UnRegisterActiveQueryResponse.newBuilder() to construct.
    private UnRegisterActiveQueryResponse() {
      initFields();
    }
    private UnRegisterActiveQueryResponse(boolean noInit) {}

    private static final UnRegisterActiveQueryResponse defaultInstance;
    public static UnRegisterActiveQueryResponse getDefaultInstance() {
      return defaultInstance;
    }

    public UnRegisterActiveQueryResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.internal_static_com_alachisoft_ncache_protobuf_UnRegisterActiveQueryResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.internal_static_com_alachisoft_ncache_protobuf_UnRegisterActiveQueryResponse_fieldAccessorTable;
    }

    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse result;

      // Construct using com.alachisoft.ncache.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse.newBuilder()
      private Builder() {}

      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse();
        return builder;
      }

      protected com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse internalGetResult() {
        return result;
      }

      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(result);
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return  com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse.getDescriptor();
      }

      public com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse getDefaultInstanceForType() {
        return  com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse.getDefaultInstance();
      }

      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }

      private com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }

      public com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
                com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse returnMe = result;
        result = null;
        return returnMe;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse.getDefaultInstance()) return this;
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
          }
        }
      }


      // @@protoc_insertion_point(builder_scope:com.alachisoft.ncache.protobuf.UnRegisterActiveQueryResponse)
    }

    static {
      defaultInstance = new UnRegisterActiveQueryResponse(true);
            com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.internalForceInit();
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.alachisoft.ncache.protobuf.UnRegisterActiveQueryResponse)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_ncache_protobuf_UnRegisterActiveQueryResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_ncache_protobuf_UnRegisterActiveQueryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#UnRegisterActiveQueryResponse.proto\022\036c" +
      "om.alachisoft.ncache.protobuf\"\037\n\035UnRegis" +
      "terActiveQueryResponseB\'B%UnRegisterActi" +
      "veQueryResponseProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_ncache_protobuf_UnRegisterActiveQueryResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_ncache_protobuf_UnRegisterActiveQueryResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_ncache_protobuf_UnRegisterActiveQueryResponse_descriptor,
              new java.lang.String[] { },
                com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse.class,
                com.alachisoft.tayzgrid.common.protobuf.UnRegisterActiveQueryResponseProtocol.UnRegisterActiveQueryResponse.Builder.class);
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