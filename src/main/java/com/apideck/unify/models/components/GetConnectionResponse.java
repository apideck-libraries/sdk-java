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
 * GetConnectionResponse - Connection
 */

public class GetConnectionResponse {

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
    private Connection data;

    @JsonCreator
    public GetConnectionResponse(
            @JsonProperty("status_code") long statusCode,
            @JsonProperty("status") String status,
            @JsonProperty("data") Connection data) {
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
    public Connection data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP Response Status Code
     */
    public GetConnectionResponse withStatusCode(long statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * HTTP Response Status
     */
    public GetConnectionResponse withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public GetConnectionResponse withData(Connection data) {
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
        GetConnectionResponse other = (GetConnectionResponse) o;
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
        return Utils.toString(GetConnectionResponse.class,
                "statusCode", statusCode,
                "status", status,
                "data", data);
    }
    
    public final static class Builder {
 
        private Long statusCode;
 
        private String status;
 
        private Connection data;  
        
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

        public Builder data(Connection data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public GetConnectionResponse build() {
            return new GetConnectionResponse(
                statusCode,
                status,
                data);
        }
    }
}

