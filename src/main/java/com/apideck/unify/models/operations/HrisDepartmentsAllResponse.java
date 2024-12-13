/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;


import com.apideck.unify.models.components.GetDepartmentsResponse;
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


public class HrisDepartmentsAllResponse implements Response {

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
     * Departments
     */
    private Optional<? extends GetDepartmentsResponse> getDepartmentsResponse;

    /**
     * Unexpected error
     */
    private Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse;

    private Callable<Optional<HrisDepartmentsAllResponse>> next = () -> Optional.empty();

    @JsonCreator
    public HrisDepartmentsAllResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends GetDepartmentsResponse> getDepartmentsResponse,
            Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(getDepartmentsResponse, "getDepartmentsResponse");
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.getDepartmentsResponse = getDepartmentsResponse;
        this.unexpectedErrorResponse = unexpectedErrorResponse;
    }
    
    public HrisDepartmentsAllResponse(
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
     * Departments
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetDepartmentsResponse> getDepartmentsResponse() {
        return (Optional<GetDepartmentsResponse>) getDepartmentsResponse;
    }

    /**
     * Unexpected error
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UnexpectedErrorResponse> unexpectedErrorResponse() {
        return (Optional<UnexpectedErrorResponse>) unexpectedErrorResponse;
    }

    public Optional<HrisDepartmentsAllResponse> next() throws Exception {
        return this.next.call();
    }
    
    // internal use only
    private HrisDepartmentsAllResponse withNext(Callable<Optional<HrisDepartmentsAllResponse>> next) {
        this.next = next;
        return this;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public HrisDepartmentsAllResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public HrisDepartmentsAllResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HrisDepartmentsAllResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Departments
     */
    public HrisDepartmentsAllResponse withGetDepartmentsResponse(GetDepartmentsResponse getDepartmentsResponse) {
        Utils.checkNotNull(getDepartmentsResponse, "getDepartmentsResponse");
        this.getDepartmentsResponse = Optional.ofNullable(getDepartmentsResponse);
        return this;
    }

    /**
     * Departments
     */
    public HrisDepartmentsAllResponse withGetDepartmentsResponse(Optional<? extends GetDepartmentsResponse> getDepartmentsResponse) {
        Utils.checkNotNull(getDepartmentsResponse, "getDepartmentsResponse");
        this.getDepartmentsResponse = getDepartmentsResponse;
        return this;
    }

    /**
     * Unexpected error
     */
    public HrisDepartmentsAllResponse withUnexpectedErrorResponse(UnexpectedErrorResponse unexpectedErrorResponse) {
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.unexpectedErrorResponse = Optional.ofNullable(unexpectedErrorResponse);
        return this;
    }

    /**
     * Unexpected error
     */
    public HrisDepartmentsAllResponse withUnexpectedErrorResponse(Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
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
        HrisDepartmentsAllResponse other = (HrisDepartmentsAllResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.getDepartmentsResponse, other.getDepartmentsResponse) &&
            Objects.deepEquals(this.unexpectedErrorResponse, other.unexpectedErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            getDepartmentsResponse,
            unexpectedErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisDepartmentsAllResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "getDepartmentsResponse", getDepartmentsResponse,
                "unexpectedErrorResponse", unexpectedErrorResponse);
    }
    
    public final static class Builder {
        private Callable<Optional<HrisDepartmentsAllResponse>> next;
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends GetDepartmentsResponse> getDepartmentsResponse = Optional.empty();
 
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
         * Departments
         */
        public Builder getDepartmentsResponse(GetDepartmentsResponse getDepartmentsResponse) {
            Utils.checkNotNull(getDepartmentsResponse, "getDepartmentsResponse");
            this.getDepartmentsResponse = Optional.ofNullable(getDepartmentsResponse);
            return this;
        }

        /**
         * Departments
         */
        public Builder getDepartmentsResponse(Optional<? extends GetDepartmentsResponse> getDepartmentsResponse) {
            Utils.checkNotNull(getDepartmentsResponse, "getDepartmentsResponse");
            this.getDepartmentsResponse = getDepartmentsResponse;
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
        public Builder next(Callable<Optional<HrisDepartmentsAllResponse>> next) {
            Utils.checkNotNull(next, "next");
            this.next = next;
            return this;
        }
        
        public HrisDepartmentsAllResponse build() {
            return new HrisDepartmentsAllResponse(
                contentType,
                statusCode,
                rawResponse,
                getDepartmentsResponse,
                unexpectedErrorResponse)
                .withNext(next);
        }
    }
}

