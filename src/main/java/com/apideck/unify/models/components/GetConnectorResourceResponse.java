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
import java.util.Objects;
import java.util.Optional;

/**
 * GetConnectorResourceResponse - ConnectorResources
 */

public class GetConnectorResourceResponse {

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

    @JsonProperty("data")
    private ConnectorResource data;

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
    public GetConnectorResourceResponse(
            @JsonProperty("status_code") long statusCode,
            @JsonProperty("status") String status,
            @JsonProperty("data") ConnectorResource data,
            @JsonProperty("meta") Optional<? extends Meta> meta,
            @JsonProperty("links") Optional<? extends Links> links) {
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(meta, "meta");
        Utils.checkNotNull(links, "links");
        this.statusCode = statusCode;
        this.status = status;
        this.data = data;
        this.meta = meta;
        this.links = links;
    }
    
    public GetConnectorResourceResponse(
            long statusCode,
            String status,
            ConnectorResource data) {
        this(statusCode, status, data, Optional.empty(), Optional.empty());
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

    @JsonIgnore
    public ConnectorResource data() {
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
    public GetConnectorResourceResponse withStatusCode(long statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * HTTP Response Status
     */
    public GetConnectorResourceResponse withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public GetConnectorResourceResponse withData(ConnectorResource data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    /**
     * Response metadata
     */
    public GetConnectorResourceResponse withMeta(Meta meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = Optional.ofNullable(meta);
        return this;
    }

    /**
     * Response metadata
     */
    public GetConnectorResourceResponse withMeta(Optional<? extends Meta> meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = meta;
        return this;
    }

    /**
     * Links to navigate to previous or next pages through the API
     */
    public GetConnectorResourceResponse withLinks(Links links) {
        Utils.checkNotNull(links, "links");
        this.links = Optional.ofNullable(links);
        return this;
    }

    /**
     * Links to navigate to previous or next pages through the API
     */
    public GetConnectorResourceResponse withLinks(Optional<? extends Links> links) {
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
        GetConnectorResourceResponse other = (GetConnectorResourceResponse) o;
        return 
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.meta, other.meta) &&
            Objects.deepEquals(this.links, other.links);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            statusCode,
            status,
            data,
            meta,
            links);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetConnectorResourceResponse.class,
                "statusCode", statusCode,
                "status", status,
                "data", data,
                "meta", meta,
                "links", links);
    }
    
    public final static class Builder {
 
        private Long statusCode;
 
        private String status;
 
        private ConnectorResource data;
 
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

        public Builder data(ConnectorResource data) {
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
        
        public GetConnectorResourceResponse build() {
            return new GetConnectorResourceResponse(
                statusCode,
                status,
                data,
                meta,
                links);
        }
    }
}
