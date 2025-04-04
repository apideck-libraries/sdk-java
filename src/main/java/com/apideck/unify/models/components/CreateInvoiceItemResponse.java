/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CreateInvoiceItemResponse
 * 
 * <p>InvoiceItems
 */
public class CreateInvoiceItemResponse {

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

    /**
     * A object containing a unique identifier for the resource that was created, updated, or deleted.
     */
    @JsonProperty("data")
    private UnifiedId data;

    /**
     * Raw response from the integration when raw=true query param is provided
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_raw")
    private JsonNullable<? extends Map<String, Object>> raw;

    @JsonCreator
    public CreateInvoiceItemResponse(
            @JsonProperty("status_code") long statusCode,
            @JsonProperty("status") String status,
            @JsonProperty("service") String service,
            @JsonProperty("resource") String resource,
            @JsonProperty("operation") String operation,
            @JsonProperty("data") UnifiedId data,
            @JsonProperty("_raw") JsonNullable<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(service, "service");
        Utils.checkNotNull(resource, "resource");
        Utils.checkNotNull(operation, "operation");
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(raw, "raw");
        this.statusCode = statusCode;
        this.status = status;
        this.service = service;
        this.resource = resource;
        this.operation = operation;
        this.data = data;
        this.raw = raw;
    }
    
    public CreateInvoiceItemResponse(
            long statusCode,
            String status,
            String service,
            String resource,
            String operation,
            UnifiedId data) {
        this(statusCode, status, service, resource, operation, data, JsonNullable.undefined());
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

    /**
     * A object containing a unique identifier for the resource that was created, updated, or deleted.
     */
    @JsonIgnore
    public UnifiedId data() {
        return data;
    }

    /**
     * Raw response from the integration when raw=true query param is provided
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, Object>> raw() {
        return (JsonNullable<Map<String, Object>>) raw;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * HTTP Response Status Code
     */
    public CreateInvoiceItemResponse withStatusCode(long statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * HTTP Response Status
     */
    public CreateInvoiceItemResponse withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Apideck ID of service provider
     */
    public CreateInvoiceItemResponse withService(String service) {
        Utils.checkNotNull(service, "service");
        this.service = service;
        return this;
    }

    /**
     * Unified API resource name
     */
    public CreateInvoiceItemResponse withResource(String resource) {
        Utils.checkNotNull(resource, "resource");
        this.resource = resource;
        return this;
    }

    /**
     * Operation performed
     */
    public CreateInvoiceItemResponse withOperation(String operation) {
        Utils.checkNotNull(operation, "operation");
        this.operation = operation;
        return this;
    }

    /**
     * A object containing a unique identifier for the resource that was created, updated, or deleted.
     */
    public CreateInvoiceItemResponse withData(UnifiedId data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    /**
     * Raw response from the integration when raw=true query param is provided
     */
    public CreateInvoiceItemResponse withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = JsonNullable.of(raw);
        return this;
    }

    /**
     * Raw response from the integration when raw=true query param is provided
     */
    public CreateInvoiceItemResponse withRaw(JsonNullable<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
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
        CreateInvoiceItemResponse other = (CreateInvoiceItemResponse) o;
        return 
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.service, other.service) &&
            Objects.deepEquals(this.resource, other.resource) &&
            Objects.deepEquals(this.operation, other.operation) &&
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.raw, other.raw);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            statusCode,
            status,
            service,
            resource,
            operation,
            data,
            raw);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateInvoiceItemResponse.class,
                "statusCode", statusCode,
                "status", status,
                "service", service,
                "resource", resource,
                "operation", operation,
                "data", data,
                "raw", raw);
    }
    
    public final static class Builder {
 
        private Long statusCode;
 
        private String status;
 
        private String service;
 
        private String resource;
 
        private String operation;
 
        private UnifiedId data;
 
        private JsonNullable<? extends Map<String, Object>> raw = JsonNullable.undefined();
        
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

        /**
         * A object containing a unique identifier for the resource that was created, updated, or deleted.
         */
        public Builder data(UnifiedId data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        /**
         * Raw response from the integration when raw=true query param is provided
         */
        public Builder raw(Map<String, Object> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = JsonNullable.of(raw);
            return this;
        }

        /**
         * Raw response from the integration when raw=true query param is provided
         */
        public Builder raw(JsonNullable<? extends Map<String, Object>> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }
        
        public CreateInvoiceItemResponse build() {
            return new CreateInvoiceItemResponse(
                statusCode,
                status,
                service,
                resource,
                operation,
                data,
                raw);
        }
    }
}
