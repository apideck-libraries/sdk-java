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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class CustomersFilter {

    /**
     * Company Name of customer to search for
     */
    @SpeakeasyMetadata("queryParam:name=company_name")
    private Optional<String> companyName;

    /**
     * Display Name of customer to search for
     */
    @SpeakeasyMetadata("queryParam:name=display_name")
    private Optional<String> displayName;

    /**
     * First name of customer to search for
     */
    @SpeakeasyMetadata("queryParam:name=first_name")
    private Optional<String> firstName;

    /**
     * Last name of customer to search for
     */
    @SpeakeasyMetadata("queryParam:name=last_name")
    private Optional<String> lastName;

    /**
     * Email of customer to search for
     */
    @SpeakeasyMetadata("queryParam:name=email")
    private Optional<String> email;

    /**
     * Status of customer to filter on
     */
    @SpeakeasyMetadata("queryParam:name=status")
    private JsonNullable<? extends CustomersFilterStatus> status;

    @SpeakeasyMetadata("queryParam:name=updated_since")
    private Optional<OffsetDateTime> updatedSince;

    @JsonCreator
    public CustomersFilter(
            Optional<String> companyName,
            Optional<String> displayName,
            Optional<String> firstName,
            Optional<String> lastName,
            Optional<String> email,
            JsonNullable<? extends CustomersFilterStatus> status,
            Optional<OffsetDateTime> updatedSince) {
        Utils.checkNotNull(companyName, "companyName");
        Utils.checkNotNull(displayName, "displayName");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(updatedSince, "updatedSince");
        this.companyName = companyName;
        this.displayName = displayName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.status = status;
        this.updatedSince = updatedSince;
    }
    
    public CustomersFilter() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * Company Name of customer to search for
     */
    @JsonIgnore
    public Optional<String> companyName() {
        return companyName;
    }

    /**
     * Display Name of customer to search for
     */
    @JsonIgnore
    public Optional<String> displayName() {
        return displayName;
    }

    /**
     * First name of customer to search for
     */
    @JsonIgnore
    public Optional<String> firstName() {
        return firstName;
    }

    /**
     * Last name of customer to search for
     */
    @JsonIgnore
    public Optional<String> lastName() {
        return lastName;
    }

    /**
     * Email of customer to search for
     */
    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    /**
     * Status of customer to filter on
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<CustomersFilterStatus> status() {
        return (JsonNullable<CustomersFilterStatus>) status;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedSince() {
        return updatedSince;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Company Name of customer to search for
     */
    public CustomersFilter withCompanyName(String companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = Optional.ofNullable(companyName);
        return this;
    }

    /**
     * Company Name of customer to search for
     */
    public CustomersFilter withCompanyName(Optional<String> companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = companyName;
        return this;
    }

    /**
     * Display Name of customer to search for
     */
    public CustomersFilter withDisplayName(String displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = Optional.ofNullable(displayName);
        return this;
    }

    /**
     * Display Name of customer to search for
     */
    public CustomersFilter withDisplayName(Optional<String> displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = displayName;
        return this;
    }

    /**
     * First name of customer to search for
     */
    public CustomersFilter withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = Optional.ofNullable(firstName);
        return this;
    }

    /**
     * First name of customer to search for
     */
    public CustomersFilter withFirstName(Optional<String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    /**
     * Last name of customer to search for
     */
    public CustomersFilter withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = Optional.ofNullable(lastName);
        return this;
    }

    /**
     * Last name of customer to search for
     */
    public CustomersFilter withLastName(Optional<String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    /**
     * Email of customer to search for
     */
    public CustomersFilter withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    /**
     * Email of customer to search for
     */
    public CustomersFilter withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * Status of customer to filter on
     */
    public CustomersFilter withStatus(CustomersFilterStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = JsonNullable.of(status);
        return this;
    }

    /**
     * Status of customer to filter on
     */
    public CustomersFilter withStatus(JsonNullable<? extends CustomersFilterStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public CustomersFilter withUpdatedSince(OffsetDateTime updatedSince) {
        Utils.checkNotNull(updatedSince, "updatedSince");
        this.updatedSince = Optional.ofNullable(updatedSince);
        return this;
    }

    public CustomersFilter withUpdatedSince(Optional<OffsetDateTime> updatedSince) {
        Utils.checkNotNull(updatedSince, "updatedSince");
        this.updatedSince = updatedSince;
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
        CustomersFilter other = (CustomersFilter) o;
        return 
            Objects.deepEquals(this.companyName, other.companyName) &&
            Objects.deepEquals(this.displayName, other.displayName) &&
            Objects.deepEquals(this.firstName, other.firstName) &&
            Objects.deepEquals(this.lastName, other.lastName) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.updatedSince, other.updatedSince);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyName,
            displayName,
            firstName,
            lastName,
            email,
            status,
            updatedSince);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CustomersFilter.class,
                "companyName", companyName,
                "displayName", displayName,
                "firstName", firstName,
                "lastName", lastName,
                "email", email,
                "status", status,
                "updatedSince", updatedSince);
    }
    
    public final static class Builder {
 
        private Optional<String> companyName = Optional.empty();
 
        private Optional<String> displayName = Optional.empty();
 
        private Optional<String> firstName = Optional.empty();
 
        private Optional<String> lastName = Optional.empty();
 
        private Optional<String> email = Optional.empty();
 
        private JsonNullable<? extends CustomersFilterStatus> status = JsonNullable.undefined();
 
        private Optional<OffsetDateTime> updatedSince = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Company Name of customer to search for
         */
        public Builder companyName(String companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = Optional.ofNullable(companyName);
            return this;
        }

        /**
         * Company Name of customer to search for
         */
        public Builder companyName(Optional<String> companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = companyName;
            return this;
        }

        /**
         * Display Name of customer to search for
         */
        public Builder displayName(String displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = Optional.ofNullable(displayName);
            return this;
        }

        /**
         * Display Name of customer to search for
         */
        public Builder displayName(Optional<String> displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = displayName;
            return this;
        }

        /**
         * First name of customer to search for
         */
        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = Optional.ofNullable(firstName);
            return this;
        }

        /**
         * First name of customer to search for
         */
        public Builder firstName(Optional<String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        /**
         * Last name of customer to search for
         */
        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = Optional.ofNullable(lastName);
            return this;
        }

        /**
         * Last name of customer to search for
         */
        public Builder lastName(Optional<String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        /**
         * Email of customer to search for
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        /**
         * Email of customer to search for
         */
        public Builder email(Optional<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        /**
         * Status of customer to filter on
         */
        public Builder status(CustomersFilterStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = JsonNullable.of(status);
            return this;
        }

        /**
         * Status of customer to filter on
         */
        public Builder status(JsonNullable<? extends CustomersFilterStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder updatedSince(OffsetDateTime updatedSince) {
            Utils.checkNotNull(updatedSince, "updatedSince");
            this.updatedSince = Optional.ofNullable(updatedSince);
            return this;
        }

        public Builder updatedSince(Optional<OffsetDateTime> updatedSince) {
            Utils.checkNotNull(updatedSince, "updatedSince");
            this.updatedSince = updatedSince;
            return this;
        }
        
        public CustomersFilter build() {
            return new CustomersFilter(
                companyName,
                displayName,
                firstName,
                lastName,
                email,
                status,
                updatedSince);
        }
    }
}
