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
 * GetApisResponse
 * 
 * <p>Apis
 */
public class GetApisResponse {

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
    private List<Api> data;

    /**
     * Raw response from the integration when raw=true query param is provided
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_raw")
    private JsonNullable<? extends Map<String, Object>> raw;

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
    public GetApisResponse(
            @JsonProperty("status_code") long statusCode,
            @JsonProperty("status") String status,
            @JsonProperty("data") List<Api> data,
            @JsonProperty("_raw") JsonNullable<? extends Map<String, Object>> raw,
            @JsonProperty("meta") Optional<? extends Meta> meta,
            @JsonProperty("links") Optional<? extends Links> links) {
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(meta, "meta");
        Utils.checkNotNull(links, "links");
        this.statusCode = statusCode;
        this.status = status;
        this.data = data;
        this.raw = raw;
        this.meta = meta;
        this.links = links;
    }
    
    public GetApisResponse(
            long statusCode,
            String status,
            List<Api> data) {
        this(statusCode, status, data, JsonNullable.undefined(), Optional.empty(), Optional.empty());
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
    public List<Api> data() {
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
    public GetApisResponse withStatusCode(long statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * HTTP Response Status
     */
    public GetApisResponse withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public GetApisResponse withData(List<Api> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    /**
     * Raw response from the integration when raw=true query param is provided
     */
    public GetApisResponse withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = JsonNullable.of(raw);
        return this;
    }

    /**
     * Raw response from the integration when raw=true query param is provided
     */
    public GetApisResponse withRaw(JsonNullable<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    /**
     * Response metadata
     */
    public GetApisResponse withMeta(Meta meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = Optional.ofNullable(meta);
        return this;
    }

    /**
     * Response metadata
     */
    public GetApisResponse withMeta(Optional<? extends Meta> meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = meta;
        return this;
    }

    /**
     * Links to navigate to previous or next pages through the API
     */
    public GetApisResponse withLinks(Links links) {
        Utils.checkNotNull(links, "links");
        this.links = Optional.ofNullable(links);
        return this;
    }

    /**
     * Links to navigate to previous or next pages through the API
     */
    public GetApisResponse withLinks(Optional<? extends Links> links) {
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
        GetApisResponse other = (GetApisResponse) o;
        return 
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.meta, other.meta) &&
            Objects.deepEquals(this.links, other.links);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            statusCode,
            status,
            data,
            raw,
            meta,
            links);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetApisResponse.class,
                "statusCode", statusCode,
                "status", status,
                "data", data,
                "raw", raw,
                "meta", meta,
                "links", links);
    }
    
    public final static class Builder {
 
        private Long statusCode;
 
        private String status;
 
        private List<Api> data;
 
        private JsonNullable<? extends Map<String, Object>> raw = JsonNullable.undefined();
 
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

        public Builder data(List<Api> data) {
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
        
        public GetApisResponse build() {
            return new GetApisResponse(
                statusCode,
                status,
                data,
                raw,
                meta,
                links);
        }
    }
}
