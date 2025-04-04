/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.models.components.UnexpectedErrorResponse;
import com.apideck.unify.models.components.UpdateTimeOffRequestResponse;
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
import java.util.Objects;
import java.util.Optional;

public class HrisTimeOffRequestsUpdateResponse implements Response {

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
     * TimeOffRequests
     */
    private Optional<? extends UpdateTimeOffRequestResponse> updateTimeOffRequestResponse;

    /**
     * Unexpected error
     */
    private Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse;

    @JsonCreator
    public HrisTimeOffRequestsUpdateResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends UpdateTimeOffRequestResponse> updateTimeOffRequestResponse,
            Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(updateTimeOffRequestResponse, "updateTimeOffRequestResponse");
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.updateTimeOffRequestResponse = updateTimeOffRequestResponse;
        this.unexpectedErrorResponse = unexpectedErrorResponse;
    }
    
    public HrisTimeOffRequestsUpdateResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty(), Optional.empty());
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
     * TimeOffRequests
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UpdateTimeOffRequestResponse> updateTimeOffRequestResponse() {
        return (Optional<UpdateTimeOffRequestResponse>) updateTimeOffRequestResponse;
    }

    /**
     * Unexpected error
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UnexpectedErrorResponse> unexpectedErrorResponse() {
        return (Optional<UnexpectedErrorResponse>) unexpectedErrorResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * HTTP response content type for this operation
     */
    public HrisTimeOffRequestsUpdateResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public HrisTimeOffRequestsUpdateResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HrisTimeOffRequestsUpdateResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * TimeOffRequests
     */
    public HrisTimeOffRequestsUpdateResponse withUpdateTimeOffRequestResponse(UpdateTimeOffRequestResponse updateTimeOffRequestResponse) {
        Utils.checkNotNull(updateTimeOffRequestResponse, "updateTimeOffRequestResponse");
        this.updateTimeOffRequestResponse = Optional.ofNullable(updateTimeOffRequestResponse);
        return this;
    }

    /**
     * TimeOffRequests
     */
    public HrisTimeOffRequestsUpdateResponse withUpdateTimeOffRequestResponse(Optional<? extends UpdateTimeOffRequestResponse> updateTimeOffRequestResponse) {
        Utils.checkNotNull(updateTimeOffRequestResponse, "updateTimeOffRequestResponse");
        this.updateTimeOffRequestResponse = updateTimeOffRequestResponse;
        return this;
    }

    /**
     * Unexpected error
     */
    public HrisTimeOffRequestsUpdateResponse withUnexpectedErrorResponse(UnexpectedErrorResponse unexpectedErrorResponse) {
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.unexpectedErrorResponse = Optional.ofNullable(unexpectedErrorResponse);
        return this;
    }

    /**
     * Unexpected error
     */
    public HrisTimeOffRequestsUpdateResponse withUnexpectedErrorResponse(Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
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
        HrisTimeOffRequestsUpdateResponse other = (HrisTimeOffRequestsUpdateResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.updateTimeOffRequestResponse, other.updateTimeOffRequestResponse) &&
            Objects.deepEquals(this.unexpectedErrorResponse, other.unexpectedErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            updateTimeOffRequestResponse,
            unexpectedErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisTimeOffRequestsUpdateResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "updateTimeOffRequestResponse", updateTimeOffRequestResponse,
                "unexpectedErrorResponse", unexpectedErrorResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends UpdateTimeOffRequestResponse> updateTimeOffRequestResponse = Optional.empty();
 
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
         * TimeOffRequests
         */
        public Builder updateTimeOffRequestResponse(UpdateTimeOffRequestResponse updateTimeOffRequestResponse) {
            Utils.checkNotNull(updateTimeOffRequestResponse, "updateTimeOffRequestResponse");
            this.updateTimeOffRequestResponse = Optional.ofNullable(updateTimeOffRequestResponse);
            return this;
        }

        /**
         * TimeOffRequests
         */
        public Builder updateTimeOffRequestResponse(Optional<? extends UpdateTimeOffRequestResponse> updateTimeOffRequestResponse) {
            Utils.checkNotNull(updateTimeOffRequestResponse, "updateTimeOffRequestResponse");
            this.updateTimeOffRequestResponse = updateTimeOffRequestResponse;
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
        
        public HrisTimeOffRequestsUpdateResponse build() {
            return new HrisTimeOffRequestsUpdateResponse(
                contentType,
                statusCode,
                rawResponse,
                updateTimeOffRequestResponse,
                unexpectedErrorResponse);
        }
    }
}
