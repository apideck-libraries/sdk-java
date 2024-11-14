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
 * GetConsumerResponse - Consumer
 */

public class GetConsumerResponse {

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

    @JsonCreator
    public GetConsumerResponse(
            @JsonProperty("status_code") long statusCode,
            @JsonProperty("status") String status,
            @JsonProperty("data") Consumer data) {
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(data, "data");
        this.statusCode = statusCode;
        this.status = status;
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

    @JsonIgnore
    public Consumer data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP Response Status Code
     */
    public GetConsumerResponse withStatusCode(long statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * HTTP Response Status
     */
    public GetConsumerResponse withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public GetConsumerResponse withData(Consumer data) {
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
        GetConsumerResponse other = (GetConsumerResponse) o;
        return 
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            statusCode,
            status,
            data);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetConsumerResponse.class,
                "statusCode", statusCode,
                "status", status,
                "data", data);
    }
    
    public final static class Builder {
 
        private Long statusCode;
 
        private String status;
 
        private Consumer data;  
        
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
        
        public GetConsumerResponse build() {
            return new GetConsumerResponse(
                statusCode,
                status,
                data);
        }
    }
}

