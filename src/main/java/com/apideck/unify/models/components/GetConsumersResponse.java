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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * GetConsumersResponse
 * 
 * <p>Consumers
 */
public class GetConsumersResponse {

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
    private List<Data> data;

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

    /**
     * Raw response from the integration when raw=true query param is provided
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_raw")
    private JsonNullable<? extends Map<String, Object>> raw;

    @JsonCreator
    public GetConsumersResponse(
            @JsonProperty("status_code") long statusCode,
            @JsonProperty("status") String status,
            @JsonProperty("data") List<Data> data,
            @JsonProperty("meta") Optional<? extends Meta> meta,
            @JsonProperty("links") Optional<? extends Links> links,
            @JsonProperty("_raw") JsonNullable<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(meta, "meta");
        Utils.checkNotNull(links, "links");
        Utils.checkNotNull(raw, "raw");
        this.statusCode = statusCode;
        this.status = status;
        this.data = data;
        this.meta = meta;
        this.links = links;
        this.raw = raw;
    }
    
    public GetConsumersResponse(
            long statusCode,
            String status,
            List<Data> data) {
        this(statusCode, status, data, Optional.empty(), Optional.empty(), JsonNullable.undefined());
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
    public List<Data> data() {
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
    public GetConsumersResponse withStatusCode(long statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * HTTP Response Status
     */
    public GetConsumersResponse withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public GetConsumersResponse withData(List<Data> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    /**
     * Response metadata
     */
    public GetConsumersResponse withMeta(Meta meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = Optional.ofNullable(meta);
        return this;
    }

    /**
     * Response metadata
     */
    public GetConsumersResponse withMeta(Optional<? extends Meta> meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = meta;
        return this;
    }

    /**
     * Links to navigate to previous or next pages through the API
     */
    public GetConsumersResponse withLinks(Links links) {
        Utils.checkNotNull(links, "links");
        this.links = Optional.ofNullable(links);
        return this;
    }

    /**
     * Links to navigate to previous or next pages through the API
     */
    public GetConsumersResponse withLinks(Optional<? extends Links> links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
        return this;
    }

    /**
     * Raw response from the integration when raw=true query param is provided
     */
    public GetConsumersResponse withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = JsonNullable.of(raw);
        return this;
    }

    /**
     * Raw response from the integration when raw=true query param is provided
     */
    public GetConsumersResponse withRaw(JsonNullable<? extends Map<String, Object>> raw) {
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
        GetConsumersResponse other = (GetConsumersResponse) o;
        return 
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.meta, other.meta) &&
            Objects.deepEquals(this.links, other.links) &&
            Objects.deepEquals(this.raw, other.raw);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            statusCode,
            status,
            data,
            meta,
            links,
            raw);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetConsumersResponse.class,
                "statusCode", statusCode,
                "status", status,
                "data", data,
                "meta", meta,
                "links", links,
                "raw", raw);
    }
    
    public final static class Builder {
 
        private Long statusCode;
 
        private String status;
 
        private List<Data> data;
 
        private Optional<? extends Meta> meta = Optional.empty();
 
        private Optional<? extends Links> links = Optional.empty();
 
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

        public Builder data(List<Data> data) {
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
        
        public GetConsumersResponse build() {
            return new GetConsumersResponse(
                statusCode,
                status,
                data,
                meta,
                links,
                raw);
        }
    }
}
