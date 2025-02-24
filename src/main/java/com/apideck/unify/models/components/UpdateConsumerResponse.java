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
 * UpdateConsumerResponse - Consumer updated
 */

public class UpdateConsumerResponse {

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
    private Consumer data;

    /**
     * Raw response from the integration when raw=true query param is provided
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("_raw")
    private JsonNullable<? extends Map<String, Object>> raw;

    @JsonCreator
    public UpdateConsumerResponse(
            @JsonProperty("status_code") long statusCode,
            @JsonProperty("status") String status,
            @JsonProperty("data") Consumer data,
            @JsonProperty("_raw") JsonNullable<? extends Map<String, Object>> raw) {
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(raw, "raw");
        this.statusCode = statusCode;
        this.status = status;
        this.data = data;
        this.raw = raw;
    }
    
    public UpdateConsumerResponse(
            long statusCode,
            String status,
            Consumer data) {
        this(statusCode, status, data, JsonNullable.undefined());
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
    public Consumer data() {
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
    public UpdateConsumerResponse withStatusCode(long statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * HTTP Response Status
     */
    public UpdateConsumerResponse withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public UpdateConsumerResponse withData(Consumer data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    /**
     * Raw response from the integration when raw=true query param is provided
     */
    public UpdateConsumerResponse withRaw(Map<String, Object> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = JsonNullable.of(raw);
        return this;
    }

    /**
     * Raw response from the integration when raw=true query param is provided
     */
    public UpdateConsumerResponse withRaw(JsonNullable<? extends Map<String, Object>> raw) {
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
        UpdateConsumerResponse other = (UpdateConsumerResponse) o;
        return 
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.raw, other.raw);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            statusCode,
            status,
            data,
            raw);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateConsumerResponse.class,
                "statusCode", statusCode,
                "status", status,
                "data", data,
                "raw", raw);
    }
    
    public final static class Builder {
 
        private Long statusCode;
 
        private String status;
 
        private Consumer data;
 
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

        public Builder data(Consumer data) {
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
        
        public UpdateConsumerResponse build() {
            return new UpdateConsumerResponse(
                statusCode,
                status,
                data,
                raw);
        }
    }
}

