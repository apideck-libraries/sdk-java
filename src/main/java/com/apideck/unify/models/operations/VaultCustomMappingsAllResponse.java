/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.models.components.GetCustomMappingsResponse;
import com.apideck.unify.models.components.UnexpectedErrorResponse;
import com.apideck.unify.utils.Response;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Optional;


public class VaultCustomMappingsAllResponse implements Response {
    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Custom mapping
     */
    private Optional<? extends GetCustomMappingsResponse> getCustomMappingsResponse;

    /**
     * Unexpected error
     */
    private Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse;

    @JsonCreator
    public VaultCustomMappingsAllResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends GetCustomMappingsResponse> getCustomMappingsResponse,
            Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(getCustomMappingsResponse, "getCustomMappingsResponse");
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.getCustomMappingsResponse = getCustomMappingsResponse;
        this.unexpectedErrorResponse = unexpectedErrorResponse;
    }
    
    public VaultCustomMappingsAllResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse,
            Optional.empty(), Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * Custom mapping
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetCustomMappingsResponse> getCustomMappingsResponse() {
        return (Optional<GetCustomMappingsResponse>) getCustomMappingsResponse;
    }

    /**
     * Unexpected error
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UnexpectedErrorResponse> unexpectedErrorResponse() {
        return (Optional<UnexpectedErrorResponse>) unexpectedErrorResponse;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * HTTP response content type for this operation
     */
    public VaultCustomMappingsAllResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public VaultCustomMappingsAllResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public VaultCustomMappingsAllResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Custom mapping
     */
    public VaultCustomMappingsAllResponse withGetCustomMappingsResponse(GetCustomMappingsResponse getCustomMappingsResponse) {
        Utils.checkNotNull(getCustomMappingsResponse, "getCustomMappingsResponse");
        this.getCustomMappingsResponse = Optional.ofNullable(getCustomMappingsResponse);
        return this;
    }


    /**
     * Custom mapping
     */
    public VaultCustomMappingsAllResponse withGetCustomMappingsResponse(Optional<? extends GetCustomMappingsResponse> getCustomMappingsResponse) {
        Utils.checkNotNull(getCustomMappingsResponse, "getCustomMappingsResponse");
        this.getCustomMappingsResponse = getCustomMappingsResponse;
        return this;
    }

    /**
     * Unexpected error
     */
    public VaultCustomMappingsAllResponse withUnexpectedErrorResponse(UnexpectedErrorResponse unexpectedErrorResponse) {
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.unexpectedErrorResponse = Optional.ofNullable(unexpectedErrorResponse);
        return this;
    }


    /**
     * Unexpected error
     */
    public VaultCustomMappingsAllResponse withUnexpectedErrorResponse(Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.unexpectedErrorResponse = unexpectedErrorResponse;
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
        VaultCustomMappingsAllResponse other = (VaultCustomMappingsAllResponse) o;
        return 
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse) &&
            Utils.enhancedDeepEquals(this.getCustomMappingsResponse, other.getCustomMappingsResponse) &&
            Utils.enhancedDeepEquals(this.unexpectedErrorResponse, other.unexpectedErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            contentType, statusCode, rawResponse,
            getCustomMappingsResponse, unexpectedErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VaultCustomMappingsAllResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "getCustomMappingsResponse", getCustomMappingsResponse,
                "unexpectedErrorResponse", unexpectedErrorResponse);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Optional<? extends GetCustomMappingsResponse> getCustomMappingsResponse = Optional.empty();

        private Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }


        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }


        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }


        /**
         * Custom mapping
         */
        public Builder getCustomMappingsResponse(GetCustomMappingsResponse getCustomMappingsResponse) {
            Utils.checkNotNull(getCustomMappingsResponse, "getCustomMappingsResponse");
            this.getCustomMappingsResponse = Optional.ofNullable(getCustomMappingsResponse);
            return this;
        }

        /**
         * Custom mapping
         */
        public Builder getCustomMappingsResponse(Optional<? extends GetCustomMappingsResponse> getCustomMappingsResponse) {
            Utils.checkNotNull(getCustomMappingsResponse, "getCustomMappingsResponse");
            this.getCustomMappingsResponse = getCustomMappingsResponse;
            return this;
        }


        /**
         * Unexpected error
         */
        public Builder unexpectedErrorResponse(UnexpectedErrorResponse unexpectedErrorResponse) {
            Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
            this.unexpectedErrorResponse = Optional.ofNullable(unexpectedErrorResponse);
            return this;
        }

        /**
         * Unexpected error
         */
        public Builder unexpectedErrorResponse(Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
            Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
            this.unexpectedErrorResponse = unexpectedErrorResponse;
            return this;
        }

        public VaultCustomMappingsAllResponse build() {

            return new VaultCustomMappingsAllResponse(
                contentType, statusCode, rawResponse,
                getCustomMappingsResponse, unexpectedErrorResponse);
        }

    }
}
