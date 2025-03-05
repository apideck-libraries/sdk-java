/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.apideck.unify.models.operations;
import com.apideck.unify.models.components.UnexpectedErrorResponse;
import com.apideck.unify.models.components.UpdatePurchaseOrderResponse;
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

public class AccountingPurchaseOrdersUpdateResponse implements Response {

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
     * PurchaseOrders
     */
    private Optional<? extends UpdatePurchaseOrderResponse> updatePurchaseOrderResponse;

    /**
     * Unexpected error
     */
    private Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse;

    @JsonCreator
    public AccountingPurchaseOrdersUpdateResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends UpdatePurchaseOrderResponse> updatePurchaseOrderResponse,
            Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(updatePurchaseOrderResponse, "updatePurchaseOrderResponse");
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.updatePurchaseOrderResponse = updatePurchaseOrderResponse;
        this.unexpectedErrorResponse = unexpectedErrorResponse;
    }
    
    public AccountingPurchaseOrdersUpdateResponse(
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
     * PurchaseOrders
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UpdatePurchaseOrderResponse> updatePurchaseOrderResponse() {
        return (Optional<UpdatePurchaseOrderResponse>) updatePurchaseOrderResponse;
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
    public AccountingPurchaseOrdersUpdateResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public AccountingPurchaseOrdersUpdateResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public AccountingPurchaseOrdersUpdateResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * PurchaseOrders
     */
    public AccountingPurchaseOrdersUpdateResponse withUpdatePurchaseOrderResponse(UpdatePurchaseOrderResponse updatePurchaseOrderResponse) {
        Utils.checkNotNull(updatePurchaseOrderResponse, "updatePurchaseOrderResponse");
        this.updatePurchaseOrderResponse = Optional.ofNullable(updatePurchaseOrderResponse);
        return this;
    }

    /**
     * PurchaseOrders
     */
    public AccountingPurchaseOrdersUpdateResponse withUpdatePurchaseOrderResponse(Optional<? extends UpdatePurchaseOrderResponse> updatePurchaseOrderResponse) {
        Utils.checkNotNull(updatePurchaseOrderResponse, "updatePurchaseOrderResponse");
        this.updatePurchaseOrderResponse = updatePurchaseOrderResponse;
        return this;
    }

    /**
     * Unexpected error
     */
    public AccountingPurchaseOrdersUpdateResponse withUnexpectedErrorResponse(UnexpectedErrorResponse unexpectedErrorResponse) {
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.unexpectedErrorResponse = Optional.ofNullable(unexpectedErrorResponse);
        return this;
    }

    /**
     * Unexpected error
     */
    public AccountingPurchaseOrdersUpdateResponse withUnexpectedErrorResponse(Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
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
        AccountingPurchaseOrdersUpdateResponse other = (AccountingPurchaseOrdersUpdateResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.updatePurchaseOrderResponse, other.updatePurchaseOrderResponse) &&
            Objects.deepEquals(this.unexpectedErrorResponse, other.unexpectedErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            updatePurchaseOrderResponse,
            unexpectedErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingPurchaseOrdersUpdateResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "updatePurchaseOrderResponse", updatePurchaseOrderResponse,
                "unexpectedErrorResponse", unexpectedErrorResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends UpdatePurchaseOrderResponse> updatePurchaseOrderResponse = Optional.empty();
 
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
         * PurchaseOrders
         */
        public Builder updatePurchaseOrderResponse(UpdatePurchaseOrderResponse updatePurchaseOrderResponse) {
            Utils.checkNotNull(updatePurchaseOrderResponse, "updatePurchaseOrderResponse");
            this.updatePurchaseOrderResponse = Optional.ofNullable(updatePurchaseOrderResponse);
            return this;
        }

        /**
         * PurchaseOrders
         */
        public Builder updatePurchaseOrderResponse(Optional<? extends UpdatePurchaseOrderResponse> updatePurchaseOrderResponse) {
            Utils.checkNotNull(updatePurchaseOrderResponse, "updatePurchaseOrderResponse");
            this.updatePurchaseOrderResponse = updatePurchaseOrderResponse;
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
        
        public AccountingPurchaseOrdersUpdateResponse build() {
            return new AccountingPurchaseOrdersUpdateResponse(
                contentType,
                statusCode,
                rawResponse,
                updatePurchaseOrderResponse,
                unexpectedErrorResponse);
        }
    }
}

