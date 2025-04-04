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

public class ContactsFilter {

    /**
     * Name of the contact to filter on
     */
    @SpeakeasyMetadata("queryParam:name=name")
    private Optional<String> name;

    /**
     * First name of the contact to filter on
     */
    @SpeakeasyMetadata("queryParam:name=first_name")
    private Optional<String> firstName;

    /**
     * Last name of the contact to filter on
     */
    @SpeakeasyMetadata("queryParam:name=last_name")
    private Optional<String> lastName;

    /**
     * Email of the contact to filter on
     */
    @SpeakeasyMetadata("queryParam:name=email")
    private Optional<String> email;

    /**
     * Phone number of the contact to filter on
     */
    @SpeakeasyMetadata("queryParam:name=phone_number")
    private Optional<String> phoneNumber;

    /**
     * Unique identifier for the associated company of the contact to filter on
     */
    @SpeakeasyMetadata("queryParam:name=company_id")
    private Optional<String> companyId;

    /**
     * Unique identifier for the owner of the contact to filter on
     */
    @SpeakeasyMetadata("queryParam:name=owner_id")
    private Optional<String> ownerId;

    @JsonCreator
    public ContactsFilter(
            Optional<String> name,
            Optional<String> firstName,
            Optional<String> lastName,
            Optional<String> email,
            Optional<String> phoneNumber,
            Optional<String> companyId,
            Optional<String> ownerId) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(ownerId, "ownerId");
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.companyId = companyId;
        this.ownerId = ownerId;
    }
    
    public ContactsFilter() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Name of the contact to filter on
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * First name of the contact to filter on
     */
    @JsonIgnore
    public Optional<String> firstName() {
        return firstName;
    }

    /**
     * Last name of the contact to filter on
     */
    @JsonIgnore
    public Optional<String> lastName() {
        return lastName;
    }

    /**
     * Email of the contact to filter on
     */
    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    /**
     * Phone number of the contact to filter on
     */
    @JsonIgnore
    public Optional<String> phoneNumber() {
        return phoneNumber;
    }

    /**
     * Unique identifier for the associated company of the contact to filter on
     */
    @JsonIgnore
    public Optional<String> companyId() {
        return companyId;
    }

    /**
     * Unique identifier for the owner of the contact to filter on
     */
    @JsonIgnore
    public Optional<String> ownerId() {
        return ownerId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Name of the contact to filter on
     */
    public ContactsFilter withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Name of the contact to filter on
     */
    public ContactsFilter withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * First name of the contact to filter on
     */
    public ContactsFilter withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = Optional.ofNullable(firstName);
        return this;
    }

    /**
     * First name of the contact to filter on
     */
    public ContactsFilter withFirstName(Optional<String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    /**
     * Last name of the contact to filter on
     */
    public ContactsFilter withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = Optional.ofNullable(lastName);
        return this;
    }

    /**
     * Last name of the contact to filter on
     */
    public ContactsFilter withLastName(Optional<String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    /**
     * Email of the contact to filter on
     */
    public ContactsFilter withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    /**
     * Email of the contact to filter on
     */
    public ContactsFilter withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * Phone number of the contact to filter on
     */
    public ContactsFilter withPhoneNumber(String phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = Optional.ofNullable(phoneNumber);
        return this;
    }

    /**
     * Phone number of the contact to filter on
     */
    public ContactsFilter withPhoneNumber(Optional<String> phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Unique identifier for the associated company of the contact to filter on
     */
    public ContactsFilter withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = Optional.ofNullable(companyId);
        return this;
    }

    /**
     * Unique identifier for the associated company of the contact to filter on
     */
    public ContactsFilter withCompanyId(Optional<String> companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Unique identifier for the owner of the contact to filter on
     */
    public ContactsFilter withOwnerId(String ownerId) {
        Utils.checkNotNull(ownerId, "ownerId");
        this.ownerId = Optional.ofNullable(ownerId);
        return this;
    }

    /**
     * Unique identifier for the owner of the contact to filter on
     */
    public ContactsFilter withOwnerId(Optional<String> ownerId) {
        Utils.checkNotNull(ownerId, "ownerId");
        this.ownerId = ownerId;
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
        ContactsFilter other = (ContactsFilter) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.firstName, other.firstName) &&
            Objects.deepEquals(this.lastName, other.lastName) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.phoneNumber, other.phoneNumber) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.ownerId, other.ownerId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            firstName,
            lastName,
            email,
            phoneNumber,
            companyId,
            ownerId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ContactsFilter.class,
                "name", name,
                "firstName", firstName,
                "lastName", lastName,
                "email", email,
                "phoneNumber", phoneNumber,
                "companyId", companyId,
                "ownerId", ownerId);
    }
    
    public final static class Builder {
 
        private Optional<String> name = Optional.empty();
 
        private Optional<String> firstName = Optional.empty();
 
        private Optional<String> lastName = Optional.empty();
 
        private Optional<String> email = Optional.empty();
 
        private Optional<String> phoneNumber = Optional.empty();
 
        private Optional<String> companyId = Optional.empty();
 
        private Optional<String> ownerId = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Name of the contact to filter on
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * Name of the contact to filter on
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * First name of the contact to filter on
         */
        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = Optional.ofNullable(firstName);
            return this;
        }

        /**
         * First name of the contact to filter on
         */
        public Builder firstName(Optional<String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        /**
         * Last name of the contact to filter on
         */
        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = Optional.ofNullable(lastName);
            return this;
        }

        /**
         * Last name of the contact to filter on
         */
        public Builder lastName(Optional<String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        /**
         * Email of the contact to filter on
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        /**
         * Email of the contact to filter on
         */
        public Builder email(Optional<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        /**
         * Phone number of the contact to filter on
         */
        public Builder phoneNumber(String phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = Optional.ofNullable(phoneNumber);
            return this;
        }

        /**
         * Phone number of the contact to filter on
         */
        public Builder phoneNumber(Optional<String> phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * Unique identifier for the associated company of the contact to filter on
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = Optional.ofNullable(companyId);
            return this;
        }

        /**
         * Unique identifier for the associated company of the contact to filter on
         */
        public Builder companyId(Optional<String> companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }

        /**
         * Unique identifier for the owner of the contact to filter on
         */
        public Builder ownerId(String ownerId) {
            Utils.checkNotNull(ownerId, "ownerId");
            this.ownerId = Optional.ofNullable(ownerId);
            return this;
        }

        /**
         * Unique identifier for the owner of the contact to filter on
         */
        public Builder ownerId(Optional<String> ownerId) {
            Utils.checkNotNull(ownerId, "ownerId");
            this.ownerId = ownerId;
            return this;
        }
        
        public ContactsFilter build() {
            return new ContactsFilter(
                name,
                firstName,
                lastName,
                email,
                phoneNumber,
                companyId,
                ownerId);
        }
    }
}
