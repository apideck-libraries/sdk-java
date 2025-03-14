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
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * LinkedEcommerceCustomer - The customer this entity is linked to.
 */

public class LinkedEcommerceCustomer {

    /**
     * The ID of the customer this entity is linked to.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * Full name of the customer
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * First name of the customer
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("first_name")
    private JsonNullable<String> firstName;

    /**
     * Last name of the customer
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_name")
    private JsonNullable<String> lastName;

    /**
     * Company name of the customer
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_name")
    private JsonNullable<String> companyName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone_numbers")
    private Optional<? extends List<PhoneNumber>> phoneNumbers;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emails")
    private Optional<? extends List<Email>> emails;

    @JsonCreator
    public LinkedEcommerceCustomer(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("first_name") JsonNullable<String> firstName,
            @JsonProperty("last_name") JsonNullable<String> lastName,
            @JsonProperty("company_name") JsonNullable<String> companyName,
            @JsonProperty("phone_numbers") Optional<? extends List<PhoneNumber>> phoneNumbers,
            @JsonProperty("emails") Optional<? extends List<Email>> emails) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(companyName, "companyName");
        Utils.checkNotNull(phoneNumbers, "phoneNumbers");
        Utils.checkNotNull(emails, "emails");
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.phoneNumbers = phoneNumbers;
        this.emails = emails;
    }
    
    public LinkedEcommerceCustomer() {
        this(Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty());
    }

    /**
     * The ID of the customer this entity is linked to.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * Full name of the customer
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * First name of the customer
     */
    @JsonIgnore
    public JsonNullable<String> firstName() {
        return firstName;
    }

    /**
     * Last name of the customer
     */
    @JsonIgnore
    public JsonNullable<String> lastName() {
        return lastName;
    }

    /**
     * Company name of the customer
     */
    @JsonIgnore
    public JsonNullable<String> companyName() {
        return companyName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<PhoneNumber>> phoneNumbers() {
        return (Optional<List<PhoneNumber>>) phoneNumbers;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Email>> emails() {
        return (Optional<List<Email>>) emails;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the customer this entity is linked to.
     */
    public LinkedEcommerceCustomer withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * The ID of the customer this entity is linked to.
     */
    public LinkedEcommerceCustomer withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Full name of the customer
     */
    public LinkedEcommerceCustomer withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Full name of the customer
     */
    public LinkedEcommerceCustomer withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * First name of the customer
     */
    public LinkedEcommerceCustomer withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = JsonNullable.of(firstName);
        return this;
    }

    /**
     * First name of the customer
     */
    public LinkedEcommerceCustomer withFirstName(JsonNullable<String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    /**
     * Last name of the customer
     */
    public LinkedEcommerceCustomer withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = JsonNullable.of(lastName);
        return this;
    }

    /**
     * Last name of the customer
     */
    public LinkedEcommerceCustomer withLastName(JsonNullable<String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    /**
     * Company name of the customer
     */
    public LinkedEcommerceCustomer withCompanyName(String companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = JsonNullable.of(companyName);
        return this;
    }

    /**
     * Company name of the customer
     */
    public LinkedEcommerceCustomer withCompanyName(JsonNullable<String> companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = companyName;
        return this;
    }

    public LinkedEcommerceCustomer withPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        Utils.checkNotNull(phoneNumbers, "phoneNumbers");
        this.phoneNumbers = Optional.ofNullable(phoneNumbers);
        return this;
    }

    public LinkedEcommerceCustomer withPhoneNumbers(Optional<? extends List<PhoneNumber>> phoneNumbers) {
        Utils.checkNotNull(phoneNumbers, "phoneNumbers");
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    public LinkedEcommerceCustomer withEmails(List<Email> emails) {
        Utils.checkNotNull(emails, "emails");
        this.emails = Optional.ofNullable(emails);
        return this;
    }

    public LinkedEcommerceCustomer withEmails(Optional<? extends List<Email>> emails) {
        Utils.checkNotNull(emails, "emails");
        this.emails = emails;
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
        LinkedEcommerceCustomer other = (LinkedEcommerceCustomer) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.firstName, other.firstName) &&
            Objects.deepEquals(this.lastName, other.lastName) &&
            Objects.deepEquals(this.companyName, other.companyName) &&
            Objects.deepEquals(this.phoneNumbers, other.phoneNumbers) &&
            Objects.deepEquals(this.emails, other.emails);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            firstName,
            lastName,
            companyName,
            phoneNumbers,
            emails);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LinkedEcommerceCustomer.class,
                "id", id,
                "name", name,
                "firstName", firstName,
                "lastName", lastName,
                "companyName", companyName,
                "phoneNumbers", phoneNumbers,
                "emails", emails);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<String> firstName = JsonNullable.undefined();
 
        private JsonNullable<String> lastName = JsonNullable.undefined();
 
        private JsonNullable<String> companyName = JsonNullable.undefined();
 
        private Optional<? extends List<PhoneNumber>> phoneNumbers = Optional.empty();
 
        private Optional<? extends List<Email>> emails = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the customer this entity is linked to.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * The ID of the customer this entity is linked to.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Full name of the customer
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * Full name of the customer
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * First name of the customer
         */
        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = JsonNullable.of(firstName);
            return this;
        }

        /**
         * First name of the customer
         */
        public Builder firstName(JsonNullable<String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        /**
         * Last name of the customer
         */
        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = JsonNullable.of(lastName);
            return this;
        }

        /**
         * Last name of the customer
         */
        public Builder lastName(JsonNullable<String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        /**
         * Company name of the customer
         */
        public Builder companyName(String companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = JsonNullable.of(companyName);
            return this;
        }

        /**
         * Company name of the customer
         */
        public Builder companyName(JsonNullable<String> companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = companyName;
            return this;
        }

        public Builder phoneNumbers(List<PhoneNumber> phoneNumbers) {
            Utils.checkNotNull(phoneNumbers, "phoneNumbers");
            this.phoneNumbers = Optional.ofNullable(phoneNumbers);
            return this;
        }

        public Builder phoneNumbers(Optional<? extends List<PhoneNumber>> phoneNumbers) {
            Utils.checkNotNull(phoneNumbers, "phoneNumbers");
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        public Builder emails(List<Email> emails) {
            Utils.checkNotNull(emails, "emails");
            this.emails = Optional.ofNullable(emails);
            return this;
        }

        public Builder emails(Optional<? extends List<Email>> emails) {
            Utils.checkNotNull(emails, "emails");
            this.emails = emails;
            return this;
        }
        
        public LinkedEcommerceCustomer build() {
            return new LinkedEcommerceCustomer(
                id,
                name,
                firstName,
                lastName,
                companyName,
                phoneNumbers,
                emails);
        }
    }
}

