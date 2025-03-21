/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.apideck.unify.models.operations;
import com.apideck.unify.models.components.GetUsersResponse;
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

public class CrmUsersAllResponse implements Response {

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
     * Users
     */
    private Optional<? extends GetUsersResponse> getUsersResponse;

    /**
     * Unexpected error
     */
    private Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse;

    private Callable<Optional<CrmUsersAllResponse>> next = () -> Optional.empty();

    @JsonCreator
    public CrmUsersAllResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends GetUsersResponse> getUsersResponse,
            Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(getUsersResponse, "getUsersResponse");
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.getUsersResponse = getUsersResponse;
        this.unexpectedErrorResponse = unexpectedErrorResponse;
    }
    
    public CrmUsersAllResponse(
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
     * Users
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetUsersResponse> getUsersResponse() {
        return (Optional<GetUsersResponse>) getUsersResponse;
    }

    /**
     * Unexpected error
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UnexpectedErrorResponse> unexpectedErrorResponse() {
        return (Optional<UnexpectedErrorResponse>) unexpectedErrorResponse;
    }

    public Optional<CrmUsersAllResponse> next() throws Exception {
        return this.next.call();
    }
    
    // internal use only
    private CrmUsersAllResponse withNext(Callable<Optional<CrmUsersAllResponse>> next) {
        this.next = next;
        return this;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public CrmUsersAllResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CrmUsersAllResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CrmUsersAllResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Users
     */
    public CrmUsersAllResponse withGetUsersResponse(GetUsersResponse getUsersResponse) {
        Utils.checkNotNull(getUsersResponse, "getUsersResponse");
        this.getUsersResponse = Optional.ofNullable(getUsersResponse);
        return this;
    }

    /**
     * Users
     */
    public CrmUsersAllResponse withGetUsersResponse(Optional<? extends GetUsersResponse> getUsersResponse) {
        Utils.checkNotNull(getUsersResponse, "getUsersResponse");
        this.getUsersResponse = getUsersResponse;
        return this;
    }

    /**
     * Unexpected error
     */
    public CrmUsersAllResponse withUnexpectedErrorResponse(UnexpectedErrorResponse unexpectedErrorResponse) {
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.unexpectedErrorResponse = Optional.ofNullable(unexpectedErrorResponse);
        return this;
    }

    /**
     * Unexpected error
     */
    public CrmUsersAllResponse withUnexpectedErrorResponse(Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
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
        CrmUsersAllResponse other = (CrmUsersAllResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.getUsersResponse, other.getUsersResponse) &&
            Objects.deepEquals(this.unexpectedErrorResponse, other.unexpectedErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            getUsersResponse,
            unexpectedErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CrmUsersAllResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "getUsersResponse", getUsersResponse,
                "unexpectedErrorResponse", unexpectedErrorResponse);
    }
    
    public final static class Builder {
        private Callable<Optional<CrmUsersAllResponse>> next;
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends GetUsersResponse> getUsersResponse = Optional.empty();
 
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
         * Users
         */
        public Builder getUsersResponse(GetUsersResponse getUsersResponse) {
            Utils.checkNotNull(getUsersResponse, "getUsersResponse");
            this.getUsersResponse = Optional.ofNullable(getUsersResponse);
            return this;
        }

        /**
         * Users
         */
        public Builder getUsersResponse(Optional<? extends GetUsersResponse> getUsersResponse) {
            Utils.checkNotNull(getUsersResponse, "getUsersResponse");
            this.getUsersResponse = getUsersResponse;
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
         * @deprecated not part of the public API, may be removed without notice
         */
        @Deprecated
        public Builder next(Callable<Optional<CrmUsersAllResponse>> next) {
            Utils.checkNotNull(next, "next");
            this.next = next;
            return this;
        }
        
        public CrmUsersAllResponse build() {
            return new CrmUsersAllResponse(
                contentType,
                statusCode,
                rawResponse,
                getUsersResponse,
                unexpectedErrorResponse)
                .withNext(next);
        }
    }
}

