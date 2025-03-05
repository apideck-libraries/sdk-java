/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.apideck.unify.models.operations;
import com.apideck.unify.models.components.GetTimeOffRequestsResponse;
import com.apideck.unify.models.components.UnexpectedErrorResponse;
import com.apideck.unify.utils.Response;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.InputStream;
import java.lang.Deprecated;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;

public class HrisTimeOffRequestsAllResponse implements Response {

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
    private Optional<? extends GetTimeOffRequestsResponse> getTimeOffRequestsResponse;

    /**
     * Unexpected error
     */
    private Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse;

    private Callable<Optional<HrisTimeOffRequestsAllResponse>> next = () -> Optional.empty();

    @JsonCreator
    public HrisTimeOffRequestsAllResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends GetTimeOffRequestsResponse> getTimeOffRequestsResponse,
            Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(getTimeOffRequestsResponse, "getTimeOffRequestsResponse");
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.getTimeOffRequestsResponse = getTimeOffRequestsResponse;
        this.unexpectedErrorResponse = unexpectedErrorResponse;
    }
    
    public HrisTimeOffRequestsAllResponse(
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
    public Optional<GetTimeOffRequestsResponse> getTimeOffRequestsResponse() {
        return (Optional<GetTimeOffRequestsResponse>) getTimeOffRequestsResponse;
    }

    /**
     * Unexpected error
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UnexpectedErrorResponse> unexpectedErrorResponse() {
        return (Optional<UnexpectedErrorResponse>) unexpectedErrorResponse;
    }

    public Optional<HrisTimeOffRequestsAllResponse> next() throws Exception {
        return this.next.call();
    }
    
    // internal use only
    private HrisTimeOffRequestsAllResponse withNext(Callable<Optional<HrisTimeOffRequestsAllResponse>> next) {
        this.next = next;
        return this;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public HrisTimeOffRequestsAllResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public HrisTimeOffRequestsAllResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HrisTimeOffRequestsAllResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * TimeOffRequests
     */
    public HrisTimeOffRequestsAllResponse withGetTimeOffRequestsResponse(GetTimeOffRequestsResponse getTimeOffRequestsResponse) {
        Utils.checkNotNull(getTimeOffRequestsResponse, "getTimeOffRequestsResponse");
        this.getTimeOffRequestsResponse = Optional.ofNullable(getTimeOffRequestsResponse);
        return this;
    }

    /**
     * TimeOffRequests
     */
    public HrisTimeOffRequestsAllResponse withGetTimeOffRequestsResponse(Optional<? extends GetTimeOffRequestsResponse> getTimeOffRequestsResponse) {
        Utils.checkNotNull(getTimeOffRequestsResponse, "getTimeOffRequestsResponse");
        this.getTimeOffRequestsResponse = getTimeOffRequestsResponse;
        return this;
    }

    /**
     * Unexpected error
     */
    public HrisTimeOffRequestsAllResponse withUnexpectedErrorResponse(UnexpectedErrorResponse unexpectedErrorResponse) {
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.unexpectedErrorResponse = Optional.ofNullable(unexpectedErrorResponse);
        return this;
    }

    /**
     * Unexpected error
     */
    public HrisTimeOffRequestsAllResponse withUnexpectedErrorResponse(Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
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
        HrisTimeOffRequestsAllResponse other = (HrisTimeOffRequestsAllResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.getTimeOffRequestsResponse, other.getTimeOffRequestsResponse) &&
            Objects.deepEquals(this.unexpectedErrorResponse, other.unexpectedErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            getTimeOffRequestsResponse,
            unexpectedErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisTimeOffRequestsAllResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "getTimeOffRequestsResponse", getTimeOffRequestsResponse,
                "unexpectedErrorResponse", unexpectedErrorResponse);
    }
    
    public final static class Builder {
        private Callable<Optional<HrisTimeOffRequestsAllResponse>> next;
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends GetTimeOffRequestsResponse> getTimeOffRequestsResponse = Optional.empty();
 
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
        public Builder getTimeOffRequestsResponse(GetTimeOffRequestsResponse getTimeOffRequestsResponse) {
            Utils.checkNotNull(getTimeOffRequestsResponse, "getTimeOffRequestsResponse");
            this.getTimeOffRequestsResponse = Optional.ofNullable(getTimeOffRequestsResponse);
            return this;
        }

        /**
         * TimeOffRequests
         */
        public Builder getTimeOffRequestsResponse(Optional<? extends GetTimeOffRequestsResponse> getTimeOffRequestsResponse) {
            Utils.checkNotNull(getTimeOffRequestsResponse, "getTimeOffRequestsResponse");
            this.getTimeOffRequestsResponse = getTimeOffRequestsResponse;
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

        /**
         * Internal API. Not for public use. Sets the provider of the next page.
         *
         * @Deprecated not part of the public API, may be removed without notice
         */
        @Deprecated
        public Builder next(Callable<Optional<HrisTimeOffRequestsAllResponse>> next) {
            Utils.checkNotNull(next, "next");
            this.next = next;
            return this;
        }
        
        public HrisTimeOffRequestsAllResponse build() {
            return new HrisTimeOffRequestsAllResponse(
                contentType,
                statusCode,
                rawResponse,
                getTimeOffRequestsResponse,
                unexpectedErrorResponse)
                .withNext(next);
        }
    }
}

