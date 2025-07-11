/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.models.components.DeleteLedgerAccountResponse;
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


public class AccountingLedgerAccountsDeleteResponse implements Response {
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
     * LedgerAccount deleted
     */
    private Optional<? extends DeleteLedgerAccountResponse> deleteLedgerAccountResponse;

    /**
     * Unexpected error
     */
    private Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse;

    @JsonCreator
    public AccountingLedgerAccountsDeleteResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends DeleteLedgerAccountResponse> deleteLedgerAccountResponse,
            Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(deleteLedgerAccountResponse, "deleteLedgerAccountResponse");
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.deleteLedgerAccountResponse = deleteLedgerAccountResponse;
        this.unexpectedErrorResponse = unexpectedErrorResponse;
    }
    
    public AccountingLedgerAccountsDeleteResponse(
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
     * LedgerAccount deleted
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DeleteLedgerAccountResponse> deleteLedgerAccountResponse() {
        return (Optional<DeleteLedgerAccountResponse>) deleteLedgerAccountResponse;
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
    public AccountingLedgerAccountsDeleteResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public AccountingLedgerAccountsDeleteResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public AccountingLedgerAccountsDeleteResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * LedgerAccount deleted
     */
    public AccountingLedgerAccountsDeleteResponse withDeleteLedgerAccountResponse(DeleteLedgerAccountResponse deleteLedgerAccountResponse) {
        Utils.checkNotNull(deleteLedgerAccountResponse, "deleteLedgerAccountResponse");
        this.deleteLedgerAccountResponse = Optional.ofNullable(deleteLedgerAccountResponse);
        return this;
    }


    /**
     * LedgerAccount deleted
     */
    public AccountingLedgerAccountsDeleteResponse withDeleteLedgerAccountResponse(Optional<? extends DeleteLedgerAccountResponse> deleteLedgerAccountResponse) {
        Utils.checkNotNull(deleteLedgerAccountResponse, "deleteLedgerAccountResponse");
        this.deleteLedgerAccountResponse = deleteLedgerAccountResponse;
        return this;
    }

    /**
     * Unexpected error
     */
    public AccountingLedgerAccountsDeleteResponse withUnexpectedErrorResponse(UnexpectedErrorResponse unexpectedErrorResponse) {
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.unexpectedErrorResponse = Optional.ofNullable(unexpectedErrorResponse);
        return this;
    }


    /**
     * Unexpected error
     */
    public AccountingLedgerAccountsDeleteResponse withUnexpectedErrorResponse(Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
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
        AccountingLedgerAccountsDeleteResponse other = (AccountingLedgerAccountsDeleteResponse) o;
        return 
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse) &&
            Utils.enhancedDeepEquals(this.deleteLedgerAccountResponse, other.deleteLedgerAccountResponse) &&
            Utils.enhancedDeepEquals(this.unexpectedErrorResponse, other.unexpectedErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            contentType, statusCode, rawResponse,
            deleteLedgerAccountResponse, unexpectedErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingLedgerAccountsDeleteResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "deleteLedgerAccountResponse", deleteLedgerAccountResponse,
                "unexpectedErrorResponse", unexpectedErrorResponse);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Optional<? extends DeleteLedgerAccountResponse> deleteLedgerAccountResponse = Optional.empty();

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
         * LedgerAccount deleted
         */
        public Builder deleteLedgerAccountResponse(DeleteLedgerAccountResponse deleteLedgerAccountResponse) {
            Utils.checkNotNull(deleteLedgerAccountResponse, "deleteLedgerAccountResponse");
            this.deleteLedgerAccountResponse = Optional.ofNullable(deleteLedgerAccountResponse);
            return this;
        }

        /**
         * LedgerAccount deleted
         */
        public Builder deleteLedgerAccountResponse(Optional<? extends DeleteLedgerAccountResponse> deleteLedgerAccountResponse) {
            Utils.checkNotNull(deleteLedgerAccountResponse, "deleteLedgerAccountResponse");
            this.deleteLedgerAccountResponse = deleteLedgerAccountResponse;
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

        public AccountingLedgerAccountsDeleteResponse build() {

            return new AccountingLedgerAccountsDeleteResponse(
                contentType, statusCode, rawResponse,
                deleteLedgerAccountResponse, unexpectedErrorResponse);
        }

    }
}
