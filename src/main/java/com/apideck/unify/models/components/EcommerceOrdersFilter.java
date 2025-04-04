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
import java.util.Objects;
import java.util.Optional;

public class EcommerceOrdersFilter {

    /**
     * Customer email address to filter on
     */
    @SpeakeasyMetadata("queryParam:name=email")
    private Optional<String> email;

    /**
     * Customer id to filter on
     */
    @SpeakeasyMetadata("queryParam:name=customer_id")
    private Optional<String> customerId;

    /**
     * Minimum date the order was last modified
     */
    @SpeakeasyMetadata("queryParam:name=updated_since")
    private Optional<String> updatedSince;

    /**
     * Minimum date the order was created
     */
    @SpeakeasyMetadata("queryParam:name=created_since")
    private Optional<String> createdSince;

    @JsonCreator
    public EcommerceOrdersFilter(
            Optional<String> email,
            Optional<String> customerId,
            Optional<String> updatedSince,
            Optional<String> createdSince) {
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(customerId, "customerId");
        Utils.checkNotNull(updatedSince, "updatedSince");
        Utils.checkNotNull(createdSince, "createdSince");
        this.email = email;
        this.customerId = customerId;
        this.updatedSince = updatedSince;
        this.createdSince = createdSince;
    }
    
    public EcommerceOrdersFilter() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Customer email address to filter on
     */
    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    /**
     * Customer id to filter on
     */
    @JsonIgnore
    public Optional<String> customerId() {
        return customerId;
    }

    /**
     * Minimum date the order was last modified
     */
    @JsonIgnore
    public Optional<String> updatedSince() {
        return updatedSince;
    }

    /**
     * Minimum date the order was created
     */
    @JsonIgnore
    public Optional<String> createdSince() {
        return createdSince;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Customer email address to filter on
     */
    public EcommerceOrdersFilter withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    /**
     * Customer email address to filter on
     */
    public EcommerceOrdersFilter withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * Customer id to filter on
     */
    public EcommerceOrdersFilter withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = Optional.ofNullable(customerId);
        return this;
    }

    /**
     * Customer id to filter on
     */
    public EcommerceOrdersFilter withCustomerId(Optional<String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }

    /**
     * Minimum date the order was last modified
     */
    public EcommerceOrdersFilter withUpdatedSince(String updatedSince) {
        Utils.checkNotNull(updatedSince, "updatedSince");
        this.updatedSince = Optional.ofNullable(updatedSince);
        return this;
    }

    /**
     * Minimum date the order was last modified
     */
    public EcommerceOrdersFilter withUpdatedSince(Optional<String> updatedSince) {
        Utils.checkNotNull(updatedSince, "updatedSince");
        this.updatedSince = updatedSince;
        return this;
    }

    /**
     * Minimum date the order was created
     */
    public EcommerceOrdersFilter withCreatedSince(String createdSince) {
        Utils.checkNotNull(createdSince, "createdSince");
        this.createdSince = Optional.ofNullable(createdSince);
        return this;
    }

    /**
     * Minimum date the order was created
     */
    public EcommerceOrdersFilter withCreatedSince(Optional<String> createdSince) {
        Utils.checkNotNull(createdSince, "createdSince");
        this.createdSince = createdSince;
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
        EcommerceOrdersFilter other = (EcommerceOrdersFilter) o;
        return 
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.customerId, other.customerId) &&
            Objects.deepEquals(this.updatedSince, other.updatedSince) &&
            Objects.deepEquals(this.createdSince, other.createdSince);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            email,
            customerId,
            updatedSince,
            createdSince);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EcommerceOrdersFilter.class,
                "email", email,
                "customerId", customerId,
                "updatedSince", updatedSince,
                "createdSince", createdSince);
    }
    
    public final static class Builder {
 
        private Optional<String> email = Optional.empty();
 
        private Optional<String> customerId = Optional.empty();
 
        private Optional<String> updatedSince = Optional.empty();
 
        private Optional<String> createdSince = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Customer email address to filter on
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        /**
         * Customer email address to filter on
         */
        public Builder email(Optional<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        /**
         * Customer id to filter on
         */
        public Builder customerId(String customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = Optional.ofNullable(customerId);
            return this;
        }

        /**
         * Customer id to filter on
         */
        public Builder customerId(Optional<String> customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = customerId;
            return this;
        }

        /**
         * Minimum date the order was last modified
         */
        public Builder updatedSince(String updatedSince) {
            Utils.checkNotNull(updatedSince, "updatedSince");
            this.updatedSince = Optional.ofNullable(updatedSince);
            return this;
        }

        /**
         * Minimum date the order was last modified
         */
        public Builder updatedSince(Optional<String> updatedSince) {
            Utils.checkNotNull(updatedSince, "updatedSince");
            this.updatedSince = updatedSince;
            return this;
        }

        /**
         * Minimum date the order was created
         */
        public Builder createdSince(String createdSince) {
            Utils.checkNotNull(createdSince, "createdSince");
            this.createdSince = Optional.ofNullable(createdSince);
            return this;
        }

        /**
         * Minimum date the order was created
         */
        public Builder createdSince(Optional<String> createdSince) {
            Utils.checkNotNull(createdSince, "createdSince");
            this.createdSince = createdSince;
            return this;
        }
        
        public EcommerceOrdersFilter build() {
            return new EcommerceOrdersFilter(
                email,
                customerId,
                updatedSince,
                createdSince);
        }
    }
}
