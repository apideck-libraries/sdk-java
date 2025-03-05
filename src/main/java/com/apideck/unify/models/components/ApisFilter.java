/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.apideck.unify.models.components;
import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class ApisFilter {

    /**
     * Status of the API. APIs with status live or beta are callable.
     */
    @SpeakeasyMetadata("queryParam:name=status")
    private Optional<? extends ApiStatus> status;

    @JsonCreator
    public ApisFilter(
            Optional<? extends ApiStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
    }
    
    public ApisFilter() {
        this(Optional.empty());
    }

    /**
     * Status of the API. APIs with status live or beta are callable.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ApiStatus> status() {
        return (Optional<ApiStatus>) status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Status of the API. APIs with status live or beta are callable.
     */
    public ApisFilter withStatus(ApiStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Status of the API. APIs with status live or beta are callable.
     */
    public ApisFilter withStatus(Optional<? extends ApiStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        ApisFilter other = (ApisFilter) o;
        return 
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApisFilter.class,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<? extends ApiStatus> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Status of the API. APIs with status live or beta are callable.
         */
        public Builder status(ApiStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Status of the API. APIs with status live or beta are callable.
         */
        public Builder status(Optional<? extends ApiStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public ApisFilter build() {
            return new ApisFilter(
                status);
        }
    }
}

