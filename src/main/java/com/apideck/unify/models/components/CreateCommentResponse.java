/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;


import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * CreateCommentResponse - Create a Comment
 */

public class CreateCommentResponse {

    /**
     * HTTP Response Status Code
     */
    @JsonProperty("status_code")
    private long statusCode;

    /**
     * HTTP Response Status
     */
    @JsonProperty("status")
    private String status;

    /**
     * Apideck ID of service provider
     */
    @JsonProperty("service")
    private String service;

    /**
     * Unified API resource name
     */
    @JsonProperty("resource")
    private String resource;

    /**
     * Operation performed
     */
    @JsonProperty("operation")
    private String operation;

    @JsonProperty("data")
    private UnifiedId data;

    @JsonCreator
    public CreateCommentResponse(
            @JsonProperty("status_code") long statusCode,
            @JsonProperty("status") String status,
            @JsonProperty("service") String service,
            @JsonProperty("resource") String resource,
            @JsonProperty("operation") String operation,
            @JsonProperty("data") UnifiedId data) {
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(service, "service");
        Utils.checkNotNull(resource, "resource");
        Utils.checkNotNull(operation, "operation");
        Utils.checkNotNull(data, "data");
        this.statusCode = statusCode;
        this.status = status;
        this.service = service;
        this.resource = resource;
        this.operation = operation;
        this.data = data;
    }

    /**
     * HTTP Response Status Code
     */
    @JsonIgnore
    public long statusCode() {
        return statusCode;
    }

    /**
     * HTTP Response Status
     */
    @JsonIgnore
    public String status() {
        return status;
    }

    /**
     * Apideck ID of service provider
     */
    @JsonIgnore
    public String service() {
        return service;
    }

    /**
     * Unified API resource name
     */
    @JsonIgnore
    public String resource() {
        return resource;
    }

    /**
     * Operation performed
     */
    @JsonIgnore
    public String operation() {
        return operation;
    }

    @JsonIgnore
    public UnifiedId data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP Response Status Code
     */
    public CreateCommentResponse withStatusCode(long statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * HTTP Response Status
     */
    public CreateCommentResponse withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Apideck ID of service provider
     */
    public CreateCommentResponse withService(String service) {
        Utils.checkNotNull(service, "service");
        this.service = service;
        return this;
    }

    /**
     * Unified API resource name
     */
    public CreateCommentResponse withResource(String resource) {
        Utils.checkNotNull(resource, "resource");
        this.resource = resource;
        return this;
    }

    /**
     * Operation performed
     */
    public CreateCommentResponse withOperation(String operation) {
        Utils.checkNotNull(operation, "operation");
        this.operation = operation;
        return this;
    }

    public CreateCommentResponse withData(UnifiedId data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCommentResponse other = (CreateCommentResponse) o;
        return 
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.service, other.service) &&
            Objects.deepEquals(this.resource, other.resource) &&
            Objects.deepEquals(this.operation, other.operation) &&
            Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            statusCode,
            status,
            service,
            resource,
            operation,
            data);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateCommentResponse.class,
                "statusCode", statusCode,
                "status", status,
                "service", service,
                "resource", resource,
                "operation", operation,
                "data", data);
    }
    
    public final static class Builder {
 
        private Long statusCode;
 
        private String status;
 
        private String service;
 
        private String resource;
 
        private String operation;
 
        private UnifiedId data;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP Response Status Code
         */
        public Builder statusCode(long statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * HTTP Response Status
         */
        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Apideck ID of service provider
         */
        public Builder service(String service) {
            Utils.checkNotNull(service, "service");
            this.service = service;
            return this;
        }

        /**
         * Unified API resource name
         */
        public Builder resource(String resource) {
            Utils.checkNotNull(resource, "resource");
            this.resource = resource;
            return this;
        }

        /**
         * Operation performed
         */
        public Builder operation(String operation) {
            Utils.checkNotNull(operation, "operation");
            this.operation = operation;
            return this;
        }

        public Builder data(UnifiedId data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public CreateCommentResponse build() {
            return new CreateCommentResponse(
                statusCode,
                status,
                service,
                resource,
                operation,
                data);
        }
    }
}

