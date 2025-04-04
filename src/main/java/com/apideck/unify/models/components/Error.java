/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * Error
 * 
 * <p>The error returned if your message status is failed or undelivered.
 */
public class Error {

    /**
     * The error_code provides more information about the failure. If the message was successful, this value is null
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private Optional<String> code;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    private Optional<String> message;

    @JsonCreator
    public Error(
            @JsonProperty("code") Optional<String> code,
            @JsonProperty("message") Optional<String> message) {
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(message, "message");
        this.code = code;
        this.message = message;
    }
    
    public Error() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The error_code provides more information about the failure. If the message was successful, this value is null
     */
    @JsonIgnore
    public Optional<String> code() {
        return code;
    }

    @JsonIgnore
    public Optional<String> message() {
        return message;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The error_code provides more information about the failure. If the message was successful, this value is null
     */
    public Error withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = Optional.ofNullable(code);
        return this;
    }

    /**
     * The error_code provides more information about the failure. If the message was successful, this value is null
     */
    public Error withCode(Optional<String> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    public Error withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }

    public Error withMessage(Optional<String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
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
        Error other = (Error) o;
        return 
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.message, other.message);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            code,
            message);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Error.class,
                "code", code,
                "message", message);
    }
    
    public final static class Builder {
 
        private Optional<String> code = Optional.empty();
 
        private Optional<String> message = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The error_code provides more information about the failure. If the message was successful, this value is null
         */
        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = Optional.ofNullable(code);
            return this;
        }

        /**
         * The error_code provides more information about the failure. If the message was successful, this value is null
         */
        public Builder code(Optional<String> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = Optional.ofNullable(message);
            return this;
        }

        public Builder message(Optional<String> message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }
        
        public Error build() {
            return new Error(
                code,
                message);
        }
    }
}
