/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.models.components.ConsumerRequestCountsInDateRangeResponse;
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


public class VaultConsumerRequestCountsAllResponse implements Response {
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
     * Consumers Request Counts within Date Range
     */
    private Optional<? extends ConsumerRequestCountsInDateRangeResponse> consumerRequestCountsInDateRangeResponse;

    /**
     * Unexpected error
     */
    private Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse;

    @JsonCreator
    public VaultConsumerRequestCountsAllResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends ConsumerRequestCountsInDateRangeResponse> consumerRequestCountsInDateRangeResponse,
            Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(consumerRequestCountsInDateRangeResponse, "consumerRequestCountsInDateRangeResponse");
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.consumerRequestCountsInDateRangeResponse = consumerRequestCountsInDateRangeResponse;
        this.unexpectedErrorResponse = unexpectedErrorResponse;
    }
    
    public VaultConsumerRequestCountsAllResponse(
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
     * Consumers Request Counts within Date Range
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ConsumerRequestCountsInDateRangeResponse> consumerRequestCountsInDateRangeResponse() {
        return (Optional<ConsumerRequestCountsInDateRangeResponse>) consumerRequestCountsInDateRangeResponse;
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
    public VaultConsumerRequestCountsAllResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public VaultConsumerRequestCountsAllResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public VaultConsumerRequestCountsAllResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Consumers Request Counts within Date Range
     */
    public VaultConsumerRequestCountsAllResponse withConsumerRequestCountsInDateRangeResponse(ConsumerRequestCountsInDateRangeResponse consumerRequestCountsInDateRangeResponse) {
        Utils.checkNotNull(consumerRequestCountsInDateRangeResponse, "consumerRequestCountsInDateRangeResponse");
        this.consumerRequestCountsInDateRangeResponse = Optional.ofNullable(consumerRequestCountsInDateRangeResponse);
        return this;
    }


    /**
     * Consumers Request Counts within Date Range
     */
    public VaultConsumerRequestCountsAllResponse withConsumerRequestCountsInDateRangeResponse(Optional<? extends ConsumerRequestCountsInDateRangeResponse> consumerRequestCountsInDateRangeResponse) {
        Utils.checkNotNull(consumerRequestCountsInDateRangeResponse, "consumerRequestCountsInDateRangeResponse");
        this.consumerRequestCountsInDateRangeResponse = consumerRequestCountsInDateRangeResponse;
        return this;
    }

    /**
     * Unexpected error
     */
    public VaultConsumerRequestCountsAllResponse withUnexpectedErrorResponse(UnexpectedErrorResponse unexpectedErrorResponse) {
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.unexpectedErrorResponse = Optional.ofNullable(unexpectedErrorResponse);
        return this;
    }


    /**
     * Unexpected error
     */
    public VaultConsumerRequestCountsAllResponse withUnexpectedErrorResponse(Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
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
        VaultConsumerRequestCountsAllResponse other = (VaultConsumerRequestCountsAllResponse) o;
        return 
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse) &&
            Utils.enhancedDeepEquals(this.consumerRequestCountsInDateRangeResponse, other.consumerRequestCountsInDateRangeResponse) &&
            Utils.enhancedDeepEquals(this.unexpectedErrorResponse, other.unexpectedErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            contentType, statusCode, rawResponse,
            consumerRequestCountsInDateRangeResponse, unexpectedErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VaultConsumerRequestCountsAllResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "consumerRequestCountsInDateRangeResponse", consumerRequestCountsInDateRangeResponse,
                "unexpectedErrorResponse", unexpectedErrorResponse);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Optional<? extends ConsumerRequestCountsInDateRangeResponse> consumerRequestCountsInDateRangeResponse = Optional.empty();

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
         * Consumers Request Counts within Date Range
         */
        public Builder consumerRequestCountsInDateRangeResponse(ConsumerRequestCountsInDateRangeResponse consumerRequestCountsInDateRangeResponse) {
            Utils.checkNotNull(consumerRequestCountsInDateRangeResponse, "consumerRequestCountsInDateRangeResponse");
            this.consumerRequestCountsInDateRangeResponse = Optional.ofNullable(consumerRequestCountsInDateRangeResponse);
            return this;
        }

        /**
         * Consumers Request Counts within Date Range
         */
        public Builder consumerRequestCountsInDateRangeResponse(Optional<? extends ConsumerRequestCountsInDateRangeResponse> consumerRequestCountsInDateRangeResponse) {
            Utils.checkNotNull(consumerRequestCountsInDateRangeResponse, "consumerRequestCountsInDateRangeResponse");
            this.consumerRequestCountsInDateRangeResponse = consumerRequestCountsInDateRangeResponse;
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

        public VaultConsumerRequestCountsAllResponse build() {

            return new VaultConsumerRequestCountsAllResponse(
                contentType, statusCode, rawResponse,
                consumerRequestCountsInDateRangeResponse, unexpectedErrorResponse);
        }

    }
}
