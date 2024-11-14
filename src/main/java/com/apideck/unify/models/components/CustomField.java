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
import org.openapitools.jackson.nullable.JsonNullable;


public class CustomField {

    /**
     * Unique identifier for the custom field.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * Name of the custom field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * More information about the custom field
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends Value> value;

    @JsonCreator
    public CustomField(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("value") JsonNullable<? extends Value> value) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(value, "value");
        this.id = id;
        this.name = name;
        this.description = description;
        this.value = value;
    }
    
    public CustomField() {
        this(Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Unique identifier for the custom field.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * Name of the custom field.
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * More information about the custom field
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Value> value() {
        return (JsonNullable<Value>) value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for the custom field.
     */
    public CustomField withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Unique identifier for the custom field.
     */
    public CustomField withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Name of the custom field.
     */
    public CustomField withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Name of the custom field.
     */
    public CustomField withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * More information about the custom field
     */
    public CustomField withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * More information about the custom field
     */
    public CustomField withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public CustomField withValue(Value value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public CustomField withValue(JsonNullable<? extends Value> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        CustomField other = (CustomField) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            description,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CustomField.class,
                "id", id,
                "name", name,
                "description", description,
                "value", value);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<String> description = JsonNullable.undefined();
 
        private JsonNullable<? extends Value> value = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for the custom field.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Unique identifier for the custom field.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Name of the custom field.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * Name of the custom field.
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * More information about the custom field
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * More information about the custom field
         */
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        public Builder value(Value value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<? extends Value> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public CustomField build() {
            return new CustomField(
                id,
                name,
                description,
                value);
        }
    }
}

