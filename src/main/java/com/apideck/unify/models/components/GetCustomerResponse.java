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
 * GetCustomerResponse - Customer
 */

public class GetCustomerResponse {

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
    private Customer data;

    @JsonCreator
    public GetCustomerResponse(
            @JsonProperty("status_code") long statusCode,
            @JsonProperty("status") String status,
            @JsonProperty("service") String service,
            @JsonProperty("resource") String resource,
            @JsonProperty("operation") String operation,
            @JsonProperty("data") Customer data) {
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
    public Customer data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP Response Status Code
     */
    public GetCustomerResponse withStatusCode(long statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * HTTP Response Status
     */
    public GetCustomerResponse withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Apideck ID of service provider
     */
    public GetCustomerResponse withService(String service) {
        Utils.checkNotNull(service, "service");
        this.service = service;
        return this;
    }

    /**
     * Unified API resource name
     */
    public GetCustomerResponse withResource(String resource) {
        Utils.checkNotNull(resource, "resource");
        this.resource = resource;
        return this;
    }

    /**
     * Operation performed
     */
    public GetCustomerResponse withOperation(String operation) {
        Utils.checkNotNull(operation, "operation");
        this.operation = operation;
        return this;
    }

    public GetCustomerResponse withData(Customer data) {
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
        GetCustomerResponse other = (GetCustomerResponse) o;
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
        return Utils.toString(GetCustomerResponse.class,
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
 
        private Customer data;  
        
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

        public Builder data(Customer data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public GetCustomerResponse build() {
            return new GetCustomerResponse(
                statusCode,
                status,
                service,
                resource,
                operation,
                data);
        }
    }
}

