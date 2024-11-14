/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.errors;

import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * PaymentRequiredResponse - Payment Required
 */
@SuppressWarnings("serial")
public class PaymentRequiredResponse extends RuntimeException {

    /**
     * HTTP status code
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status_code")
    private Optional<Double> statusCode;

    /**
     * Contains an explanation of the status_code as defined in HTTP/1.1 standard (RFC 7231)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private Optional<String> error;

    /**
     * The type of error returned
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type_name")
    private Optional<String> typeName;

    /**
     * A human-readable message providing more details about the error.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    private Optional<String> message;

    /**
     * Contains parameter or domain specific information related to the error and why it occurred.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("detail")
    private Optional<String> detail;

    /**
     * Link to documentation of error type
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ref")
    private Optional<String> ref;

    @JsonCreator
    public PaymentRequiredResponse(
            @JsonProperty("status_code") Optional<Double> statusCode,
            @JsonProperty("error") Optional<String> error,
            @JsonProperty("type_name") Optional<String> typeName,
            @JsonProperty("message") Optional<String> message,
            @JsonProperty("detail") Optional<String> detail,
            @JsonProperty("ref") Optional<String> ref) {
        super(message.orElse(null));
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(typeName, "typeName");
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(detail, "detail");
        Utils.checkNotNull(ref, "ref");
        this.statusCode = statusCode;
        this.error = error;
        this.typeName = typeName;
        this.message = message;
        this.detail = detail;
        this.ref = ref;
    }
    
    public PaymentRequiredResponse() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * HTTP status code
     */
    public Optional<Double> statusCode(){
        return statusCode;
    }

    /**
     * Contains an explanation of the status_code as defined in HTTP/1.1 standard (RFC 7231)
     */
    public Optional<String> error(){
        return error;
    }

    /**
     * The type of error returned
     */
    public Optional<String> typeName(){
        return typeName;
    }

    /**
     * A human-readable message providing more details about the error.
     */
    public Optional<String> message(){
        return message;
    }

    /**
     * Contains parameter or domain specific information related to the error and why it occurred.
     */
    public Optional<String> detail(){
        return detail;
    }

    /**
     * Link to documentation of error type
     */
    public Optional<String> ref(){
        return ref;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP status code
     */
    public PaymentRequiredResponse withStatusCode(double statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = Optional.ofNullable(statusCode);
        return this;
    }
    
    /**
     * HTTP status code
     */
    public PaymentRequiredResponse withStatusCode(Optional<Double> statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Contains an explanation of the status_code as defined in HTTP/1.1 standard (RFC 7231)
     */
    public PaymentRequiredResponse withError(String error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }
    
    /**
     * Contains an explanation of the status_code as defined in HTTP/1.1 standard (RFC 7231)
     */
    public PaymentRequiredResponse withError(Optional<String> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    /**
     * The type of error returned
     */
    public PaymentRequiredResponse withTypeName(String typeName) {
        Utils.checkNotNull(typeName, "typeName");
        this.typeName = Optional.ofNullable(typeName);
        return this;
    }
    
    /**
     * The type of error returned
     */
    public PaymentRequiredResponse withTypeName(Optional<String> typeName) {
        Utils.checkNotNull(typeName, "typeName");
        this.typeName = typeName;
        return this;
    }

    /**
     * A human-readable message providing more details about the error.
     */
    public PaymentRequiredResponse withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }
    
    /**
     * A human-readable message providing more details about the error.
     */
    public PaymentRequiredResponse withMessage(Optional<String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    /**
     * Contains parameter or domain specific information related to the error and why it occurred.
     */
    public PaymentRequiredResponse withDetail(String detail) {
        Utils.checkNotNull(detail, "detail");
        this.detail = Optional.ofNullable(detail);
        return this;
    }
    
    /**
     * Contains parameter or domain specific information related to the error and why it occurred.
     */
    public PaymentRequiredResponse withDetail(Optional<String> detail) {
        Utils.checkNotNull(detail, "detail");
        this.detail = detail;
        return this;
    }

    /**
     * Link to documentation of error type
     */
    public PaymentRequiredResponse withRef(String ref) {
        Utils.checkNotNull(ref, "ref");
        this.ref = Optional.ofNullable(ref);
        return this;
    }
    
    /**
     * Link to documentation of error type
     */
    public PaymentRequiredResponse withRef(Optional<String> ref) {
        Utils.checkNotNull(ref, "ref");
        this.ref = ref;
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
        PaymentRequiredResponse other = (PaymentRequiredResponse) o;
        return
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.error, other.error) &&
            Objects.deepEquals(this.typeName, other.typeName) &&
            Objects.deepEquals(this.message, other.message) &&
            Objects.deepEquals(this.detail, other.detail) &&
            Objects.deepEquals(this.ref, other.ref);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            statusCode,
            error,
            typeName,
            message,
            detail,
            ref);
    }

    @Override
    public String toString() {
        return Utils.toString(PaymentRequiredResponse.class,
                "statusCode", statusCode,
                "error", error,
                "typeName", typeName,
                "message", message,
                "detail", detail,
                "ref", ref);
    }

    public final static class Builder {

        private Optional<Double> statusCode = Optional.empty();

        private Optional<String> error = Optional.empty();

        private Optional<String> typeName = Optional.empty();

        private Optional<String> message = Optional.empty();

        private Optional<String> detail = Optional.empty();

        private Optional<String> ref = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP status code
         */
        public Builder statusCode(double statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = Optional.ofNullable(statusCode);
            return this;
        }
        
        /**
         * HTTP status code
         */
        public Builder statusCode(Optional<Double> statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Contains an explanation of the status_code as defined in HTTP/1.1 standard (RFC 7231)
         */
        public Builder error(String error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }
        
        /**
         * Contains an explanation of the status_code as defined in HTTP/1.1 standard (RFC 7231)
         */
        public Builder error(Optional<String> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        /**
         * The type of error returned
         */
        public Builder typeName(String typeName) {
            Utils.checkNotNull(typeName, "typeName");
            this.typeName = Optional.ofNullable(typeName);
            return this;
        }
        
        /**
         * The type of error returned
         */
        public Builder typeName(Optional<String> typeName) {
            Utils.checkNotNull(typeName, "typeName");
            this.typeName = typeName;
            return this;
        }

        /**
         * A human-readable message providing more details about the error.
         */
        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = Optional.ofNullable(message);
            return this;
        }
        
        /**
         * A human-readable message providing more details about the error.
         */
        public Builder message(Optional<String> message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }

        /**
         * Contains parameter or domain specific information related to the error and why it occurred.
         */
        public Builder detail(String detail) {
            Utils.checkNotNull(detail, "detail");
            this.detail = Optional.ofNullable(detail);
            return this;
        }
        
        /**
         * Contains parameter or domain specific information related to the error and why it occurred.
         */
        public Builder detail(Optional<String> detail) {
            Utils.checkNotNull(detail, "detail");
            this.detail = detail;
            return this;
        }

        /**
         * Link to documentation of error type
         */
        public Builder ref(String ref) {
            Utils.checkNotNull(ref, "ref");
            this.ref = Optional.ofNullable(ref);
            return this;
        }
        
        /**
         * Link to documentation of error type
         */
        public Builder ref(Optional<String> ref) {
            Utils.checkNotNull(ref, "ref");
            this.ref = ref;
            return this;
        }

        public PaymentRequiredResponse build() {
            return new PaymentRequiredResponse(
                statusCode,
                error,
                typeName,
                message,
                detail,
                ref);
        }
    }
}
