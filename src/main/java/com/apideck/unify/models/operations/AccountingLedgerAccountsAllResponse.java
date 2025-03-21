/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.apideck.unify.models.operations;
import com.apideck.unify.models.components.GetLedgerAccountsResponse;
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

public class AccountingLedgerAccountsAllResponse implements Response {

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
     * LedgerAccounts
     */
    private Optional<? extends GetLedgerAccountsResponse> getLedgerAccountsResponse;

    /**
     * Unexpected error
     */
    private Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse;

    private Callable<Optional<AccountingLedgerAccountsAllResponse>> next = () -> Optional.empty();

    @JsonCreator
    public AccountingLedgerAccountsAllResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends GetLedgerAccountsResponse> getLedgerAccountsResponse,
            Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(getLedgerAccountsResponse, "getLedgerAccountsResponse");
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.getLedgerAccountsResponse = getLedgerAccountsResponse;
        this.unexpectedErrorResponse = unexpectedErrorResponse;
    }
    
    public AccountingLedgerAccountsAllResponse(
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
     * LedgerAccounts
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetLedgerAccountsResponse> getLedgerAccountsResponse() {
        return (Optional<GetLedgerAccountsResponse>) getLedgerAccountsResponse;
    }

    /**
     * Unexpected error
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UnexpectedErrorResponse> unexpectedErrorResponse() {
        return (Optional<UnexpectedErrorResponse>) unexpectedErrorResponse;
    }

    public Optional<AccountingLedgerAccountsAllResponse> next() throws Exception {
        return this.next.call();
    }
    
    // internal use only
    private AccountingLedgerAccountsAllResponse withNext(Callable<Optional<AccountingLedgerAccountsAllResponse>> next) {
        this.next = next;
        return this;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public AccountingLedgerAccountsAllResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public AccountingLedgerAccountsAllResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public AccountingLedgerAccountsAllResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * LedgerAccounts
     */
    public AccountingLedgerAccountsAllResponse withGetLedgerAccountsResponse(GetLedgerAccountsResponse getLedgerAccountsResponse) {
        Utils.checkNotNull(getLedgerAccountsResponse, "getLedgerAccountsResponse");
        this.getLedgerAccountsResponse = Optional.ofNullable(getLedgerAccountsResponse);
        return this;
    }

    /**
     * LedgerAccounts
     */
    public AccountingLedgerAccountsAllResponse withGetLedgerAccountsResponse(Optional<? extends GetLedgerAccountsResponse> getLedgerAccountsResponse) {
        Utils.checkNotNull(getLedgerAccountsResponse, "getLedgerAccountsResponse");
        this.getLedgerAccountsResponse = getLedgerAccountsResponse;
        return this;
    }

    /**
     * Unexpected error
     */
    public AccountingLedgerAccountsAllResponse withUnexpectedErrorResponse(UnexpectedErrorResponse unexpectedErrorResponse) {
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.unexpectedErrorResponse = Optional.ofNullable(unexpectedErrorResponse);
        return this;
    }

    /**
     * Unexpected error
     */
    public AccountingLedgerAccountsAllResponse withUnexpectedErrorResponse(Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
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
        AccountingLedgerAccountsAllResponse other = (AccountingLedgerAccountsAllResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.getLedgerAccountsResponse, other.getLedgerAccountsResponse) &&
            Objects.deepEquals(this.unexpectedErrorResponse, other.unexpectedErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            getLedgerAccountsResponse,
            unexpectedErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingLedgerAccountsAllResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "getLedgerAccountsResponse", getLedgerAccountsResponse,
                "unexpectedErrorResponse", unexpectedErrorResponse);
    }
    
    public final static class Builder {
        private Callable<Optional<AccountingLedgerAccountsAllResponse>> next;
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends GetLedgerAccountsResponse> getLedgerAccountsResponse = Optional.empty();
 
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
         * LedgerAccounts
         */
        public Builder getLedgerAccountsResponse(GetLedgerAccountsResponse getLedgerAccountsResponse) {
            Utils.checkNotNull(getLedgerAccountsResponse, "getLedgerAccountsResponse");
            this.getLedgerAccountsResponse = Optional.ofNullable(getLedgerAccountsResponse);
            return this;
        }

        /**
         * LedgerAccounts
         */
        public Builder getLedgerAccountsResponse(Optional<? extends GetLedgerAccountsResponse> getLedgerAccountsResponse) {
            Utils.checkNotNull(getLedgerAccountsResponse, "getLedgerAccountsResponse");
            this.getLedgerAccountsResponse = getLedgerAccountsResponse;
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
        public Builder next(Callable<Optional<AccountingLedgerAccountsAllResponse>> next) {
            Utils.checkNotNull(next, "next");
            this.next = next;
            return this;
        }
        
        public AccountingLedgerAccountsAllResponse build() {
            return new AccountingLedgerAccountsAllResponse(
                contentType,
                statusCode,
                rawResponse,
                getLedgerAccountsResponse,
                unexpectedErrorResponse)
                .withNext(next);
        }
    }
}

