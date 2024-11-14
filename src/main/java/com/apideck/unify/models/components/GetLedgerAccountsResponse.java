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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * GetLedgerAccountsResponse - LedgerAccounts
 */

public class GetLedgerAccountsResponse {

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
    private List<LedgerAccount> data;

    /**
     * Response metadata
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta")
    private Optional<? extends Meta> meta;

    /**
     * Links to navigate to previous or next pages through the API
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("links")
    private Optional<? extends Links> links;

    @JsonCreator
    public GetLedgerAccountsResponse(
            @JsonProperty("status_code") long statusCode,
            @JsonProperty("status") String status,
            @JsonProperty("service") String service,
            @JsonProperty("resource") String resource,
            @JsonProperty("operation") String operation,
            @JsonProperty("data") List<LedgerAccount> data,
            @JsonProperty("meta") Optional<? extends Meta> meta,
            @JsonProperty("links") Optional<? extends Links> links) {
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(service, "service");
        Utils.checkNotNull(resource, "resource");
        Utils.checkNotNull(operation, "operation");
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(meta, "meta");
        Utils.checkNotNull(links, "links");
        this.statusCode = statusCode;
        this.status = status;
        this.service = service;
        this.resource = resource;
        this.operation = operation;
        this.data = data;
        this.meta = meta;
        this.links = links;
    }
    
    public GetLedgerAccountsResponse(
            long statusCode,
            String status,
            String service,
            String resource,
            String operation,
            List<LedgerAccount> data) {
        this(statusCode, status, service, resource, operation, data, Optional.empty(), Optional.empty());
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
    public List<LedgerAccount> data() {
        return data;
    }

    /**
     * Response metadata
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Meta> meta() {
        return (Optional<Meta>) meta;
    }

    /**
     * Links to navigate to previous or next pages through the API
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Links> links() {
        return (Optional<Links>) links;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP Response Status Code
     */
    public GetLedgerAccountsResponse withStatusCode(long statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * HTTP Response Status
     */
    public GetLedgerAccountsResponse withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Apideck ID of service provider
     */
    public GetLedgerAccountsResponse withService(String service) {
        Utils.checkNotNull(service, "service");
        this.service = service;
        return this;
    }

    /**
     * Unified API resource name
     */
    public GetLedgerAccountsResponse withResource(String resource) {
        Utils.checkNotNull(resource, "resource");
        this.resource = resource;
        return this;
    }

    /**
     * Operation performed
     */
    public GetLedgerAccountsResponse withOperation(String operation) {
        Utils.checkNotNull(operation, "operation");
        this.operation = operation;
        return this;
    }

    public GetLedgerAccountsResponse withData(List<LedgerAccount> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    /**
     * Response metadata
     */
    public GetLedgerAccountsResponse withMeta(Meta meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = Optional.ofNullable(meta);
        return this;
    }

    /**
     * Response metadata
     */
    public GetLedgerAccountsResponse withMeta(Optional<? extends Meta> meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = meta;
        return this;
    }

    /**
     * Links to navigate to previous or next pages through the API
     */
    public GetLedgerAccountsResponse withLinks(Links links) {
        Utils.checkNotNull(links, "links");
        this.links = Optional.ofNullable(links);
        return this;
    }

    /**
     * Links to navigate to previous or next pages through the API
     */
    public GetLedgerAccountsResponse withLinks(Optional<? extends Links> links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
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
        GetLedgerAccountsResponse other = (GetLedgerAccountsResponse) o;
        return 
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.service, other.service) &&
            Objects.deepEquals(this.resource, other.resource) &&
            Objects.deepEquals(this.operation, other.operation) &&
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.meta, other.meta) &&
            Objects.deepEquals(this.links, other.links);
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
            meta,
            links);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLedgerAccountsResponse.class,
                "statusCode", statusCode,
                "status", status,
                "service", service,
                "resource", resource,
                "operation", operation,
                "data", data,
                "meta", meta,
                "links", links);
    }
    
    public final static class Builder {
 
        private Long statusCode;
 
        private String status;
 
        private String service;
 
        private String resource;
 
        private String operation;
 
        private List<LedgerAccount> data;
 
        private Optional<? extends Meta> meta = Optional.empty();
 
        private Optional<? extends Links> links = Optional.empty();  
        
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

        public Builder data(List<LedgerAccount> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        /**
         * Response metadata
         */
        public Builder meta(Meta meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = Optional.ofNullable(meta);
            return this;
        }

        /**
         * Response metadata
         */
        public Builder meta(Optional<? extends Meta> meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = meta;
            return this;
        }

        /**
         * Links to navigate to previous or next pages through the API
         */
        public Builder links(Links links) {
            Utils.checkNotNull(links, "links");
            this.links = Optional.ofNullable(links);
            return this;
        }

        /**
         * Links to navigate to previous or next pages through the API
         */
        public Builder links(Optional<? extends Links> links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }
        
        public GetLedgerAccountsResponse build() {
            return new GetLedgerAccountsResponse(
                statusCode,
                status,
                service,
                resource,
                operation,
                data,
                meta,
                links);
        }
    }
}

