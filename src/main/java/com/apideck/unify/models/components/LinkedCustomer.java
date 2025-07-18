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
import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * LinkedCustomer
 * 
 * <p>The customer this entity is linked to.
 */
public class LinkedCustomer {
    /**
     * The ID of the customer this entity is linked to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * The display ID of the customer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("display_id")
    private JsonNullable<String> displayId;

    /**
     * The display name of the customer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("display_name")
    private JsonNullable<String> displayName;

    /**
     * The name of the customer. Deprecated, use display_name instead.
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    @Deprecated
    private Optional<String> name;

    /**
     * The company name of the customer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_name")
    private JsonNullable<String> companyName;

    /**
     * The email address of the customer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    @JsonCreator
    public LinkedCustomer(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("display_id") JsonNullable<String> displayId,
            @JsonProperty("display_name") JsonNullable<String> displayName,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("company_name") JsonNullable<String> companyName,
            @JsonProperty("email") Optional<String> email) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(displayId, "displayId");
        Utils.checkNotNull(displayName, "displayName");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(companyName, "companyName");
        Utils.checkNotNull(email, "email");
        this.id = id;
        this.displayId = displayId;
        this.displayName = displayName;
        this.name = name;
        this.companyName = companyName;
        this.email = email;
    }
    
    public LinkedCustomer() {
        this(Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(),
            Optional.empty(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * The ID of the customer this entity is linked to.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * The display ID of the customer.
     */
    @JsonIgnore
    public JsonNullable<String> displayId() {
        return displayId;
    }

    /**
     * The display name of the customer.
     */
    @JsonIgnore
    public JsonNullable<String> displayName() {
        return displayName;
    }

    /**
     * The name of the customer. Deprecated, use display_name instead.
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * The company name of the customer.
     */
    @JsonIgnore
    public JsonNullable<String> companyName() {
        return companyName;
    }

    /**
     * The email address of the customer.
     */
    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The ID of the customer this entity is linked to.
     */
    public LinkedCustomer withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }


    /**
     * The ID of the customer this entity is linked to.
     */
    public LinkedCustomer withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The display ID of the customer.
     */
    public LinkedCustomer withDisplayId(String displayId) {
        Utils.checkNotNull(displayId, "displayId");
        this.displayId = JsonNullable.of(displayId);
        return this;
    }

    /**
     * The display ID of the customer.
     */
    public LinkedCustomer withDisplayId(JsonNullable<String> displayId) {
        Utils.checkNotNull(displayId, "displayId");
        this.displayId = displayId;
        return this;
    }

    /**
     * The display name of the customer.
     */
    public LinkedCustomer withDisplayName(String displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = JsonNullable.of(displayName);
        return this;
    }

    /**
     * The display name of the customer.
     */
    public LinkedCustomer withDisplayName(JsonNullable<String> displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = displayName;
        return this;
    }

    /**
     * The name of the customer. Deprecated, use display_name instead.
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public LinkedCustomer withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }


    /**
     * The name of the customer. Deprecated, use display_name instead.
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public LinkedCustomer withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The company name of the customer.
     */
    public LinkedCustomer withCompanyName(String companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = JsonNullable.of(companyName);
        return this;
    }

    /**
     * The company name of the customer.
     */
    public LinkedCustomer withCompanyName(JsonNullable<String> companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = companyName;
        return this;
    }

    /**
     * The email address of the customer.
     */
    public LinkedCustomer withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }


    /**
     * The email address of the customer.
     */
    public LinkedCustomer withEmail(Optional<String> email) {
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
        LinkedCustomer other = (LinkedCustomer) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.displayId, other.displayId) &&
            Utils.enhancedDeepEquals(this.displayName, other.displayName) &&
            Utils.enhancedDeepEquals(this.name, other.name) &&
            Utils.enhancedDeepEquals(this.companyName, other.companyName) &&
            Utils.enhancedDeepEquals(this.email, other.email);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, displayId, displayName,
            name, companyName, email);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LinkedCustomer.class,
                "id", id,
                "displayId", displayId,
                "displayName", displayName,
                "name", name,
                "companyName", companyName,
                "email", email);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> id = Optional.empty();

        private JsonNullable<String> displayId = JsonNullable.undefined();

        private JsonNullable<String> displayName = JsonNullable.undefined();

        @Deprecated
        private Optional<String> name = Optional.empty();

        private JsonNullable<String> companyName = JsonNullable.undefined();

        private Optional<String> email = Optional.empty();

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
         * The display ID of the customer.
         */
        public Builder displayId(String displayId) {
            Utils.checkNotNull(displayId, "displayId");
            this.displayId = JsonNullable.of(displayId);
            return this;
        }

        /**
         * The display ID of the customer.
         */
        public Builder displayId(JsonNullable<String> displayId) {
            Utils.checkNotNull(displayId, "displayId");
            this.displayId = displayId;
            return this;
        }


        /**
         * The display name of the customer.
         */
        public Builder displayName(String displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = JsonNullable.of(displayName);
            return this;
        }

        /**
         * The display name of the customer.
         */
        public Builder displayName(JsonNullable<String> displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = displayName;
            return this;
        }


        /**
         * The name of the customer. Deprecated, use display_name instead.
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * The name of the customer. Deprecated, use display_name instead.
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }


        /**
         * The company name of the customer.
         */
        public Builder companyName(String companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = JsonNullable.of(companyName);
            return this;
        }

        /**
         * The company name of the customer.
         */
        public Builder companyName(JsonNullable<String> companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = companyName;
            return this;
        }


        /**
         * The email address of the customer.
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        /**
         * The email address of the customer.
         */
        public Builder email(Optional<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        public LinkedCustomer build() {

            return new LinkedCustomer(
                id, displayId, displayName,
                name, companyName, email);
        }

    }
}
