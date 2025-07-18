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
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class CustomObjectInput {
    /**
     * The name of the custom object
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fields")
    private Optional<? extends List<CustomObjectFields>> fields;

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pass_through")
    private Optional<? extends List<PassThroughBody>> passThrough;

    @JsonCreator
    public CustomObjectInput(
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("fields") Optional<? extends List<CustomObjectFields>> fields,
            @JsonProperty("pass_through") Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(passThrough, "passThrough");
        this.name = name;
        this.fields = fields;
        this.passThrough = passThrough;
    }
    
    public CustomObjectInput() {
        this(JsonNullable.undefined(), Optional.empty(), Optional.empty());
    }

    /**
     * The name of the custom object
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<CustomObjectFields>> fields() {
        return (Optional<List<CustomObjectFields>>) fields;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<PassThroughBody>> passThrough() {
        return (Optional<List<PassThroughBody>>) passThrough;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The name of the custom object
     */
    public CustomObjectInput withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The name of the custom object
     */
    public CustomObjectInput withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public CustomObjectInput withFields(List<CustomObjectFields> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }


    public CustomObjectInput withFields(Optional<? extends List<CustomObjectFields>> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public CustomObjectInput withPassThrough(List<PassThroughBody> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }


    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public CustomObjectInput withPassThrough(Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = passThrough;
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
        CustomObjectInput other = (CustomObjectInput) o;
        return 
            Utils.enhancedDeepEquals(this.name, other.name) &&
            Utils.enhancedDeepEquals(this.fields, other.fields) &&
            Utils.enhancedDeepEquals(this.passThrough, other.passThrough);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            name, fields, passThrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CustomObjectInput.class,
                "name", name,
                "fields", fields,
                "passThrough", passThrough);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<String> name = JsonNullable.undefined();

        private Optional<? extends List<CustomObjectFields>> fields = Optional.empty();

        private Optional<? extends List<PassThroughBody>> passThrough = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The name of the custom object
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * The name of the custom object
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }


        public Builder fields(List<CustomObjectFields> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = Optional.ofNullable(fields);
            return this;
        }

        public Builder fields(Optional<? extends List<CustomObjectFields>> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = fields;
            return this;
        }


        /**
         * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
         */
        public Builder passThrough(List<PassThroughBody> passThrough) {
            Utils.checkNotNull(passThrough, "passThrough");
            this.passThrough = Optional.ofNullable(passThrough);
            return this;
        }

        /**
         * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
         */
        public Builder passThrough(Optional<? extends List<PassThroughBody>> passThrough) {
            Utils.checkNotNull(passThrough, "passThrough");
            this.passThrough = passThrough;
            return this;
        }

        public CustomObjectInput build() {

            return new CustomObjectInput(
                name, fields, passThrough);
        }

    }
}
