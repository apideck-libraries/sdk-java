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


public class EcommerceCustomersFilter {

    /**
     * Customer email address to filter on
     */
    @SpeakeasyMetadata("queryParam:name=email")
    private Optional<String> email;

    /**
     * Customer phone number to filter on
     */
    @SpeakeasyMetadata("queryParam:name=phone_number")
    private Optional<String> phoneNumber;

    @JsonCreator
    public EcommerceCustomersFilter(
            Optional<String> email,
            Optional<String> phoneNumber) {
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    public EcommerceCustomersFilter() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Customer email address to filter on
     */
    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    /**
     * Customer phone number to filter on
     */
    @JsonIgnore
    public Optional<String> phoneNumber() {
        return phoneNumber;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Customer email address to filter on
     */
    public EcommerceCustomersFilter withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    /**
     * Customer email address to filter on
     */
    public EcommerceCustomersFilter withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * Customer phone number to filter on
     */
    public EcommerceCustomersFilter withPhoneNumber(String phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = Optional.ofNullable(phoneNumber);
        return this;
    }

    /**
     * Customer phone number to filter on
     */
    public EcommerceCustomersFilter withPhoneNumber(Optional<String> phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
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
        EcommerceCustomersFilter other = (EcommerceCustomersFilter) o;
        return 
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.phoneNumber, other.phoneNumber);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            email,
            phoneNumber);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EcommerceCustomersFilter.class,
                "email", email,
                "phoneNumber", phoneNumber);
    }
    
    public final static class Builder {
 
        private Optional<String> email = Optional.empty();
 
        private Optional<String> phoneNumber = Optional.empty();  
        
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
         * Customer phone number to filter on
         */
        public Builder phoneNumber(String phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = Optional.ofNullable(phoneNumber);
            return this;
        }

        /**
         * Customer phone number to filter on
         */
        public Builder phoneNumber(Optional<String> phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = phoneNumber;
            return this;
        }
        
        public EcommerceCustomersFilter build() {
            return new EcommerceCustomersFilter(
                email,
                phoneNumber);
        }
    }
}

