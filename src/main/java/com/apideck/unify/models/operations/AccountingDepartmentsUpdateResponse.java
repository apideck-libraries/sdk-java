/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.models.components.UnexpectedErrorResponse;
import com.apideck.unify.models.components.UpdateAccountingDepartmentResponse;
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


public class AccountingDepartmentsUpdateResponse implements Response {
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
     * Department
     */
    private Optional<? extends UpdateAccountingDepartmentResponse> updateAccountingDepartmentResponse;

    /**
     * Unexpected error
     */
    private Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse;

    @JsonCreator
    public AccountingDepartmentsUpdateResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends UpdateAccountingDepartmentResponse> updateAccountingDepartmentResponse,
            Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(updateAccountingDepartmentResponse, "updateAccountingDepartmentResponse");
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.updateAccountingDepartmentResponse = updateAccountingDepartmentResponse;
        this.unexpectedErrorResponse = unexpectedErrorResponse;
    }
    
    public AccountingDepartmentsUpdateResponse(
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
     * Department
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UpdateAccountingDepartmentResponse> updateAccountingDepartmentResponse() {
        return (Optional<UpdateAccountingDepartmentResponse>) updateAccountingDepartmentResponse;
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
    public AccountingDepartmentsUpdateResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public AccountingDepartmentsUpdateResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public AccountingDepartmentsUpdateResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Department
     */
    public AccountingDepartmentsUpdateResponse withUpdateAccountingDepartmentResponse(UpdateAccountingDepartmentResponse updateAccountingDepartmentResponse) {
        Utils.checkNotNull(updateAccountingDepartmentResponse, "updateAccountingDepartmentResponse");
        this.updateAccountingDepartmentResponse = Optional.ofNullable(updateAccountingDepartmentResponse);
        return this;
    }


    /**
     * Department
     */
    public AccountingDepartmentsUpdateResponse withUpdateAccountingDepartmentResponse(Optional<? extends UpdateAccountingDepartmentResponse> updateAccountingDepartmentResponse) {
        Utils.checkNotNull(updateAccountingDepartmentResponse, "updateAccountingDepartmentResponse");
        this.updateAccountingDepartmentResponse = updateAccountingDepartmentResponse;
        return this;
    }

    /**
     * Unexpected error
     */
    public AccountingDepartmentsUpdateResponse withUnexpectedErrorResponse(UnexpectedErrorResponse unexpectedErrorResponse) {
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.unexpectedErrorResponse = Optional.ofNullable(unexpectedErrorResponse);
        return this;
    }


    /**
     * Unexpected error
     */
    public AccountingDepartmentsUpdateResponse withUnexpectedErrorResponse(Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
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
        AccountingDepartmentsUpdateResponse other = (AccountingDepartmentsUpdateResponse) o;
        return 
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse) &&
            Utils.enhancedDeepEquals(this.updateAccountingDepartmentResponse, other.updateAccountingDepartmentResponse) &&
            Utils.enhancedDeepEquals(this.unexpectedErrorResponse, other.unexpectedErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            contentType, statusCode, rawResponse,
            updateAccountingDepartmentResponse, unexpectedErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingDepartmentsUpdateResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "updateAccountingDepartmentResponse", updateAccountingDepartmentResponse,
                "unexpectedErrorResponse", unexpectedErrorResponse);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Optional<? extends UpdateAccountingDepartmentResponse> updateAccountingDepartmentResponse = Optional.empty();

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
         * Department
         */
        public Builder updateAccountingDepartmentResponse(UpdateAccountingDepartmentResponse updateAccountingDepartmentResponse) {
            Utils.checkNotNull(updateAccountingDepartmentResponse, "updateAccountingDepartmentResponse");
            this.updateAccountingDepartmentResponse = Optional.ofNullable(updateAccountingDepartmentResponse);
            return this;
        }

        /**
         * Department
         */
        public Builder updateAccountingDepartmentResponse(Optional<? extends UpdateAccountingDepartmentResponse> updateAccountingDepartmentResponse) {
            Utils.checkNotNull(updateAccountingDepartmentResponse, "updateAccountingDepartmentResponse");
            this.updateAccountingDepartmentResponse = updateAccountingDepartmentResponse;
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

        public AccountingDepartmentsUpdateResponse build() {

            return new AccountingDepartmentsUpdateResponse(
                contentType, statusCode, rawResponse,
                updateAccountingDepartmentResponse, unexpectedErrorResponse);
        }

    }
}
