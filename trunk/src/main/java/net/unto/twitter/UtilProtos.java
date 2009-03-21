// Generated by the protocol buffer compiler.  DO NOT EDIT!

package net.unto.twitter;

public final class UtilProtos {
  private UtilProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class Url extends
      com.google.protobuf.GeneratedMessage {
    // Use Url.newBuilder() to construct.
    private Url() {}
    
    private static final Url defaultInstance = new Url();
    public static Url getDefaultInstance() {
      return defaultInstance;
    }
    
    public Url getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.unto.twitter.UtilProtos.internal_static_twitter_Url_descriptor;
    }
    
    @Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.unto.twitter.UtilProtos.internal_static_twitter_Url_fieldAccessorTable;
    }
    
    public static enum Scheme {
      HTTP(0, 0),
      HTTPS(1, 1),
      ;
      
      
      public final int getNumber() { return value; }
      
      public static Scheme valueOf(int value) {
        switch (value) {
          case 0: return HTTP;
          case 1: return HTTPS;
          default: return null;
        }
      }
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return net.unto.twitter.UtilProtos.Url.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final Scheme[] VALUES = {
        HTTP, HTTPS, 
      };
      public static Scheme valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      private final int index;
      private final int value;
      private Scheme(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      static {
        net.unto.twitter.UtilProtos.getDescriptor();
      }
    }
    
    public static final class Parameter extends
        com.google.protobuf.GeneratedMessage {
      // Use Parameter.newBuilder() to construct.
      private Parameter() {}
      
      private static final Parameter defaultInstance = new Parameter();
      public static Parameter getDefaultInstance() {
        return defaultInstance;
      }
      
      public Parameter getDefaultInstanceForType() {
        return defaultInstance;
      }
      
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.unto.twitter.UtilProtos.internal_static_twitter_Url_Parameter_descriptor;
      }
      
      @Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.unto.twitter.UtilProtos.internal_static_twitter_Url_Parameter_fieldAccessorTable;
      }
      
      // required string name = 1;
      private boolean hasName;
      private java.lang.String name_ = "";
      public boolean hasName() { return hasName; }
      public java.lang.String getName() { return name_; }
      
      // optional string value = 2;
      private boolean hasValue;
      private java.lang.String value_ = "";
      public boolean hasValue() { return hasValue; }
      public java.lang.String getValue() { return value_; }
      
      public static net.unto.twitter.UtilProtos.Url.Parameter parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data).buildParsed();
      }
      public static net.unto.twitter.UtilProtos.Url.Parameter parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistry extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data, extensionRegistry)
                 .buildParsed();
      }
      public static net.unto.twitter.UtilProtos.Url.Parameter parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data).buildParsed();
      }
      public static net.unto.twitter.UtilProtos.Url.Parameter parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistry extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data, extensionRegistry)
                 .buildParsed();
      }
      public static net.unto.twitter.UtilProtos.Url.Parameter parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input).buildParsed();
      }
      public static net.unto.twitter.UtilProtos.Url.Parameter parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistry extensionRegistry)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input, extensionRegistry)
                 .buildParsed();
      }
      public static net.unto.twitter.UtilProtos.Url.Parameter parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input).buildParsed();
      }
      public static net.unto.twitter.UtilProtos.Url.Parameter parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistry extensionRegistry)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input, extensionRegistry)
                 .buildParsed();
      }
      
      public static Builder newBuilder() { return new Builder(); }
      public Builder newBuilderForType() { return new Builder(); }
      public static Builder newBuilder(net.unto.twitter.UtilProtos.Url.Parameter prototype) {
        return new Builder().mergeFrom(prototype);
      }
      
      public static final class Builder extends
          com.google.protobuf.GeneratedMessage.Builder<Builder> {
        // Construct using net.unto.twitter.UtilProtos.Url.Parameter.newBuilder()
        private Builder() {}
        
        net.unto.twitter.UtilProtos.Url.Parameter result = new net.unto.twitter.UtilProtos.Url.Parameter();
        
        @Override
        protected net.unto.twitter.UtilProtos.Url.Parameter internalGetResult() {
          return result;
        }
        
        @Override
        public Builder clear() {
          result = new net.unto.twitter.UtilProtos.Url.Parameter();
          return this;
        }
        
        @Override
        public Builder clone() {
          return new Builder().mergeFrom(result);
        }
        
        @Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return net.unto.twitter.UtilProtos.Url.Parameter.getDescriptor();
        }
        
        public net.unto.twitter.UtilProtos.Url.Parameter getDefaultInstanceForType() {
          return net.unto.twitter.UtilProtos.Url.Parameter.getDefaultInstance();
        }
        
        public net.unto.twitter.UtilProtos.Url.Parameter build() {
          if (!isInitialized()) {
            throw new com.google.protobuf.UninitializedMessageException(
              result);
          }
          return buildPartial();
        }
        
        private net.unto.twitter.UtilProtos.Url.Parameter buildParsed()
            throws com.google.protobuf.InvalidProtocolBufferException {
          if (!isInitialized()) {
            throw new com.google.protobuf.UninitializedMessageException(
              result).asInvalidProtocolBufferException();
          }
          return buildPartial();
        }
        
        public net.unto.twitter.UtilProtos.Url.Parameter buildPartial() {
          net.unto.twitter.UtilProtos.Url.Parameter returnMe = result;
          result = null;
          return returnMe;
        }
        
        
        // required string name = 1;
        public boolean hasName() {
          return result.hasName();
        }
        public java.lang.String getName() {
          return result.getName();
        }
        public Builder setName(java.lang.String value) {
          result.hasName = true;
          result.name_ = value;
          return this;
        }
        public Builder clearName() {
          result.hasName = false;
          result.name_ = "";
          return this;
        }
        
        // optional string value = 2;
        public boolean hasValue() {
          return result.hasValue();
        }
        public java.lang.String getValue() {
          return result.getValue();
        }
        public Builder setValue(java.lang.String value) {
          result.hasValue = true;
          result.value_ = value;
          return this;
        }
        public Builder clearValue() {
          result.hasValue = false;
          result.value_ = "";
          return this;
        }
      }
      
      static {
        net.unto.twitter.UtilProtos.getDescriptor();
      }
    }
    
    // required .twitter.Url.Scheme scheme = 1;
    private boolean hasScheme;
    private net.unto.twitter.UtilProtos.Url.Scheme scheme_ = net.unto.twitter.UtilProtos.Url.Scheme.HTTP;
    public boolean hasScheme() { return hasScheme; }
    public net.unto.twitter.UtilProtos.Url.Scheme getScheme() { return scheme_; }
    
    // required string host = 2;
    private boolean hasHost;
    private java.lang.String host_ = "";
    public boolean hasHost() { return hasHost; }
    public java.lang.String getHost() { return host_; }
    
    // required int32 port = 3;
    private boolean hasPort;
    private int port_ = 0;
    public boolean hasPort() { return hasPort; }
    public int getPort() { return port_; }
    
    // required string path = 4;
    private boolean hasPath;
    private java.lang.String path_ = "";
    public boolean hasPath() { return hasPath; }
    public java.lang.String getPath() { return path_; }
    
    // repeated .twitter.Url.Parameter parameters = 5;
    private java.util.List<net.unto.twitter.UtilProtos.Url.Parameter> parameters_ =
      java.util.Collections.emptyList();
    public java.util.List<net.unto.twitter.UtilProtos.Url.Parameter> getParametersList() {
      return parameters_;
    }
    public int getParametersCount() { return parameters_.size(); }
    public net.unto.twitter.UtilProtos.Url.Parameter getParameters(int index) {
      return parameters_.get(index);
    }
    
    public static net.unto.twitter.UtilProtos.Url parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.unto.twitter.UtilProtos.Url parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.unto.twitter.UtilProtos.Url parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.unto.twitter.UtilProtos.Url parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.unto.twitter.UtilProtos.Url parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.unto.twitter.UtilProtos.Url parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.unto.twitter.UtilProtos.Url parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.unto.twitter.UtilProtos.Url parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return new Builder(); }
    public Builder newBuilderForType() { return new Builder(); }
    public static Builder newBuilder(net.unto.twitter.UtilProtos.Url prototype) {
      return new Builder().mergeFrom(prototype);
    }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      // Construct using net.unto.twitter.UtilProtos.Url.newBuilder()
      private Builder() {}
      
      net.unto.twitter.UtilProtos.Url result = new net.unto.twitter.UtilProtos.Url();
      
      @Override
      protected net.unto.twitter.UtilProtos.Url internalGetResult() {
        return result;
      }
      
      @Override
      public Builder clear() {
        result = new net.unto.twitter.UtilProtos.Url();
        return this;
      }
      
      @Override
      public Builder clone() {
        return new Builder().mergeFrom(result);
      }
      
      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.unto.twitter.UtilProtos.Url.getDescriptor();
      }
      
      public net.unto.twitter.UtilProtos.Url getDefaultInstanceForType() {
        return net.unto.twitter.UtilProtos.Url.getDefaultInstance();
      }
      
      public net.unto.twitter.UtilProtos.Url build() {
        if (!isInitialized()) {
          throw new com.google.protobuf.UninitializedMessageException(
            result);
        }
        return buildPartial();
      }
      
      private net.unto.twitter.UtilProtos.Url buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw new com.google.protobuf.UninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public net.unto.twitter.UtilProtos.Url buildPartial() {
        if (result.parameters_ != java.util.Collections.EMPTY_LIST) {
          result.parameters_ =
            java.util.Collections.unmodifiableList(result.parameters_);
        }
        net.unto.twitter.UtilProtos.Url returnMe = result;
        result = null;
        return returnMe;
      }
      
      
      // required .twitter.Url.Scheme scheme = 1;
      public boolean hasScheme() {
        return result.hasScheme();
      }
      public net.unto.twitter.UtilProtos.Url.Scheme getScheme() {
        return result.getScheme();
      }
      public Builder setScheme(net.unto.twitter.UtilProtos.Url.Scheme value) {
        result.hasScheme = true;
        result.scheme_ = value;
        return this;
      }
      public Builder clearScheme() {
        result.hasScheme = false;
        result.scheme_ = net.unto.twitter.UtilProtos.Url.Scheme.HTTP;
        return this;
      }
      
      // required string host = 2;
      public boolean hasHost() {
        return result.hasHost();
      }
      public java.lang.String getHost() {
        return result.getHost();
      }
      public Builder setHost(java.lang.String value) {
        result.hasHost = true;
        result.host_ = value;
        return this;
      }
      public Builder clearHost() {
        result.hasHost = false;
        result.host_ = "";
        return this;
      }
      
      // required int32 port = 3;
      public boolean hasPort() {
        return result.hasPort();
      }
      public int getPort() {
        return result.getPort();
      }
      public Builder setPort(int value) {
        result.hasPort = true;
        result.port_ = value;
        return this;
      }
      public Builder clearPort() {
        result.hasPort = false;
        result.port_ = 0;
        return this;
      }
      
      // required string path = 4;
      public boolean hasPath() {
        return result.hasPath();
      }
      public java.lang.String getPath() {
        return result.getPath();
      }
      public Builder setPath(java.lang.String value) {
        result.hasPath = true;
        result.path_ = value;
        return this;
      }
      public Builder clearPath() {
        result.hasPath = false;
        result.path_ = "";
        return this;
      }
      
      // repeated .twitter.Url.Parameter parameters = 5;
      public java.util.List<net.unto.twitter.UtilProtos.Url.Parameter> getParametersList() {
        return java.util.Collections.unmodifiableList(result.parameters_);
      }
      public int getParametersCount() {
        return result.getParametersCount();
      }
      public net.unto.twitter.UtilProtos.Url.Parameter getParameters(int index) {
        return result.getParameters(index);
      }
      public Builder setParameters(int index, net.unto.twitter.UtilProtos.Url.Parameter value) {
        result.parameters_.set(index, value);
        return this;
      }
      public Builder setParameters(int index, net.unto.twitter.UtilProtos.Url.Parameter.Builder builderForValue) {
        result.parameters_.set(index, builderForValue.build());
        return this;
      }
      public Builder addParameters(net.unto.twitter.UtilProtos.Url.Parameter value) {
        if (result.parameters_.isEmpty()) {
          result.parameters_ = new java.util.ArrayList<net.unto.twitter.UtilProtos.Url.Parameter>();
        }
        result.parameters_.add(value);
        return this;
      }
      public Builder addParameters(net.unto.twitter.UtilProtos.Url.Parameter.Builder builderForValue) {
        if (result.parameters_.isEmpty()) {
          result.parameters_ = new java.util.ArrayList<net.unto.twitter.UtilProtos.Url.Parameter>();
        }
        result.parameters_.add(builderForValue.build());
        return this;
      }
      public Builder addAllParameters(
          java.lang.Iterable<? extends net.unto.twitter.UtilProtos.Url.Parameter> values) {
        if (result.parameters_.isEmpty()) {
          result.parameters_ = new java.util.ArrayList<net.unto.twitter.UtilProtos.Url.Parameter>();
        }
        super.addAll(values, result.parameters_);
        return this;
      }
      public Builder clearParameters() {
        result.parameters_ = java.util.Collections.emptyList();
        return this;
      }
    }
    
    static {
      net.unto.twitter.UtilProtos.getDescriptor();
    }
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_twitter_Url_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_twitter_Url_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_twitter_Url_Parameter_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_twitter_Url_Parameter_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String descriptorData =
      "\n\nutil.proto\022\007twitter\"\311\001\n\003Url\022#\n\006scheme\030" +
      "\001 \002(\0162\023.twitter.Url.Scheme\022\014\n\004host\030\002 \002(\t" +
      "\022\014\n\004port\030\003 \002(\005\022\014\n\004path\030\004 \002(\t\022*\n\nparamete" +
      "rs\030\005 \003(\0132\026.twitter.Url.Parameter\032(\n\tPara" +
      "meter\022\014\n\004name\030\001 \002(\t\022\r\n\005value\030\002 \001(\t\"\035\n\006Sc" +
      "heme\022\010\n\004HTTP\020\000\022\t\n\005HTTPS\020\001B\036\n\020net.unto.tw" +
      "itterB\nUtilProtos";
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_twitter_Url_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_twitter_Url_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_twitter_Url_descriptor,
              new java.lang.String[] { "Scheme", "Host", "Port", "Path", "Parameters", },
              net.unto.twitter.UtilProtos.Url.class,
              net.unto.twitter.UtilProtos.Url.Builder.class);
          internal_static_twitter_Url_Parameter_descriptor =
            internal_static_twitter_Url_descriptor.getNestedTypes().get(0);
          internal_static_twitter_Url_Parameter_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_twitter_Url_Parameter_descriptor,
              new java.lang.String[] { "Name", "Value", },
              net.unto.twitter.UtilProtos.Url.Parameter.class,
              net.unto.twitter.UtilProtos.Url.Parameter.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
}