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
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class Recipient {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_id")
    private Optional<String> customerId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("display_name")
    private Optional<String> displayName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address")
    private Optional<? extends Address> address;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone_number")
    private Optional<? extends PhoneNumber> phoneNumber;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<? extends Email> email;

    @JsonCreator
    public Recipient(
            @JsonProperty("customer_id") Optional<String> customerId,
            @JsonProperty("display_name") Optional<String> displayName,
            @JsonProperty("address") Optional<? extends Address> address,
            @JsonProperty("phone_number") Optional<? extends PhoneNumber> phoneNumber,
            @JsonProperty("email") Optional<? extends Email> email) {
        Utils.checkNotNull(customerId, "customerId");
        Utils.checkNotNull(displayName, "displayName");
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        Utils.checkNotNull(email, "email");
        this.customerId = customerId;
        this.displayName = displayName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    public Recipient() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> customerId() {
        return customerId;
    }

    @JsonIgnore
    public Optional<String> displayName() {
        return displayName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Address> address() {
        return (Optional<Address>) address;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PhoneNumber> phoneNumber() {
        return (Optional<PhoneNumber>) phoneNumber;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Email> email() {
        return (Optional<Email>) email;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Recipient withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = Optional.ofNullable(customerId);
        return this;
    }

    public Recipient withCustomerId(Optional<String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }

    public Recipient withDisplayName(String displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = Optional.ofNullable(displayName);
        return this;
    }

    public Recipient withDisplayName(Optional<String> displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = displayName;
        return this;
    }

    public Recipient withAddress(Address address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    public Recipient withAddress(Optional<? extends Address> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    public Recipient withPhoneNumber(PhoneNumber phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = Optional.ofNullable(phoneNumber);
        return this;
    }

    public Recipient withPhoneNumber(Optional<? extends PhoneNumber> phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Recipient withEmail(Email email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    public Recipient withEmail(Optional<? extends Email> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
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
        Recipient other = (Recipient) o;
        return 
            Objects.deepEquals(this.customerId, other.customerId) &&
            Objects.deepEquals(this.displayName, other.displayName) &&
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.phoneNumber, other.phoneNumber) &&
            Objects.deepEquals(this.email, other.email);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            customerId,
            displayName,
            address,
            phoneNumber,
            email);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Recipient.class,
                "customerId", customerId,
                "displayName", displayName,
                "address", address,
                "phoneNumber", phoneNumber,
                "email", email);
    }
    
    public final static class Builder {
 
        private Optional<String> customerId = Optional.empty();
 
        private Optional<String> displayName = Optional.empty();
 
        private Optional<? extends Address> address = Optional.empty();
 
        private Optional<? extends PhoneNumber> phoneNumber = Optional.empty();
 
        private Optional<? extends Email> email = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder customerId(String customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = Optional.ofNullable(customerId);
            return this;
        }

        public Builder customerId(Optional<String> customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = customerId;
            return this;
        }

        public Builder displayName(String displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = Optional.ofNullable(displayName);
            return this;
        }

        public Builder displayName(Optional<String> displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = displayName;
            return this;
        }

        public Builder address(Address address) {
            Utils.checkNotNull(address, "address");
            this.address = Optional.ofNullable(address);
            return this;
        }

        public Builder address(Optional<? extends Address> address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }

        public Builder phoneNumber(PhoneNumber phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = Optional.ofNullable(phoneNumber);
            return this;
        }

        public Builder phoneNumber(Optional<? extends PhoneNumber> phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder email(Email email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        public Builder email(Optional<? extends Email> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }
        
        public Recipient build() {
            return new Recipient(
                customerId,
                displayName,
                address,
                phoneNumber,
                email);
        }
    }
}

