/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.models.components.DeleteCreditNoteResponse;
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


public class AccountingCreditNotesDeleteResponse implements Response {
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
     * Credit Note deleted
     */
    private Optional<? extends DeleteCreditNoteResponse> deleteCreditNoteResponse;

    /**
     * Unexpected error
     */
    private Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse;

    @JsonCreator
    public AccountingCreditNotesDeleteResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends DeleteCreditNoteResponse> deleteCreditNoteResponse,
            Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(deleteCreditNoteResponse, "deleteCreditNoteResponse");
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.deleteCreditNoteResponse = deleteCreditNoteResponse;
        this.unexpectedErrorResponse = unexpectedErrorResponse;
    }
    
    public AccountingCreditNotesDeleteResponse(
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
     * Credit Note deleted
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DeleteCreditNoteResponse> deleteCreditNoteResponse() {
        return (Optional<DeleteCreditNoteResponse>) deleteCreditNoteResponse;
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
    public AccountingCreditNotesDeleteResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public AccountingCreditNotesDeleteResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public AccountingCreditNotesDeleteResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Credit Note deleted
     */
    public AccountingCreditNotesDeleteResponse withDeleteCreditNoteResponse(DeleteCreditNoteResponse deleteCreditNoteResponse) {
        Utils.checkNotNull(deleteCreditNoteResponse, "deleteCreditNoteResponse");
        this.deleteCreditNoteResponse = Optional.ofNullable(deleteCreditNoteResponse);
        return this;
    }


    /**
     * Credit Note deleted
     */
    public AccountingCreditNotesDeleteResponse withDeleteCreditNoteResponse(Optional<? extends DeleteCreditNoteResponse> deleteCreditNoteResponse) {
        Utils.checkNotNull(deleteCreditNoteResponse, "deleteCreditNoteResponse");
        this.deleteCreditNoteResponse = deleteCreditNoteResponse;
        return this;
    }

    /**
     * Unexpected error
     */
    public AccountingCreditNotesDeleteResponse withUnexpectedErrorResponse(UnexpectedErrorResponse unexpectedErrorResponse) {
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.unexpectedErrorResponse = Optional.ofNullable(unexpectedErrorResponse);
        return this;
    }


    /**
     * Unexpected error
     */
    public AccountingCreditNotesDeleteResponse withUnexpectedErrorResponse(Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
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
        AccountingCreditNotesDeleteResponse other = (AccountingCreditNotesDeleteResponse) o;
        return 
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse) &&
            Utils.enhancedDeepEquals(this.deleteCreditNoteResponse, other.deleteCreditNoteResponse) &&
            Utils.enhancedDeepEquals(this.unexpectedErrorResponse, other.unexpectedErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            contentType, statusCode, rawResponse,
            deleteCreditNoteResponse, unexpectedErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingCreditNotesDeleteResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "deleteCreditNoteResponse", deleteCreditNoteResponse,
                "unexpectedErrorResponse", unexpectedErrorResponse);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Optional<? extends DeleteCreditNoteResponse> deleteCreditNoteResponse = Optional.empty();

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
         * Credit Note deleted
         */
        public Builder deleteCreditNoteResponse(DeleteCreditNoteResponse deleteCreditNoteResponse) {
            Utils.checkNotNull(deleteCreditNoteResponse, "deleteCreditNoteResponse");
            this.deleteCreditNoteResponse = Optional.ofNullable(deleteCreditNoteResponse);
            return this;
        }

        /**
         * Credit Note deleted
         */
        public Builder deleteCreditNoteResponse(Optional<? extends DeleteCreditNoteResponse> deleteCreditNoteResponse) {
            Utils.checkNotNull(deleteCreditNoteResponse, "deleteCreditNoteResponse");
            this.deleteCreditNoteResponse = deleteCreditNoteResponse;
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

        public AccountingCreditNotesDeleteResponse build() {

            return new AccountingCreditNotesDeleteResponse(
                contentType, statusCode, rawResponse,
                deleteCreditNoteResponse, unexpectedErrorResponse);
        }

    }
}
