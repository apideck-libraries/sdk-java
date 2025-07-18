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
 * LinkedCustomerInput
 * 
 * <p>The customer this entity is linked to.
 */
public class LinkedCustomerInput {
    /**
     * The ID of the customer this entity is linked to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

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
     * The email address of the customer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    @JsonCreator
    public LinkedCustomerInput(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("display_name") JsonNullable<String> displayName,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("email") Optional<String> email) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(displayName, "displayName");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(email, "email");
        this.id = id;
        this.displayName = displayName;
        this.name = name;
        this.email = email;
    }
    
    public LinkedCustomerInput() {
        this(Optional.empty(), JsonNullable.undefined(), Optional.empty(),
            Optional.empty());
    }

    /**
     * The ID of the customer this entity is linked to.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
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
    public LinkedCustomerInput withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }


    /**
     * The ID of the customer this entity is linked to.
     */
    public LinkedCustomerInput withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The display name of the customer.
     */
    public LinkedCustomerInput withDisplayName(String displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = JsonNullable.of(displayName);
        return this;
    }

    /**
     * The display name of the customer.
     */
    public LinkedCustomerInput withDisplayName(JsonNullable<String> displayName) {
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
    public LinkedCustomerInput withName(String name) {
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
    public LinkedCustomerInput withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The email address of the customer.
     */
    public LinkedCustomerInput withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }


    /**
     * The email address of the customer.
     */
    public LinkedCustomerInput withEmail(Optional<String> email) {
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
        LinkedCustomerInput other = (LinkedCustomerInput) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.displayName, other.displayName) &&
            Utils.enhancedDeepEquals(this.name, other.name) &&
            Utils.enhancedDeepEquals(this.email, other.email);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, displayName, name,
            email);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LinkedCustomerInput.class,
                "id", id,
                "displayName", displayName,
                "name", name,
                "email", email);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> id = Optional.empty();

        private JsonNullable<String> displayName = JsonNullable.undefined();

        @Deprecated
        private Optional<String> name = Optional.empty();

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

        public LinkedCustomerInput build() {

            return new LinkedCustomerInput(
                id, displayName, name,
                email);
        }

    }
}
