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
import java.util.Optional;


public class LinkedResources {
    /**
     * ID of the resource, typically a lowercased version of name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * Name of the property in our Unified API.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unified_property")
    private Optional<String> unifiedProperty;

    @JsonCreator
    public LinkedResources(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("unified_property") Optional<String> unifiedProperty) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(unifiedProperty, "unifiedProperty");
        this.id = id;
        this.unifiedProperty = unifiedProperty;
    }
    
    public LinkedResources() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * ID of the resource, typically a lowercased version of name.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * Name of the property in our Unified API.
     */
    @JsonIgnore
    public Optional<String> unifiedProperty() {
        return unifiedProperty;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * ID of the resource, typically a lowercased version of name.
     */
    public LinkedResources withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }


    /**
     * ID of the resource, typically a lowercased version of name.
     */
    public LinkedResources withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Name of the property in our Unified API.
     */
    public LinkedResources withUnifiedProperty(String unifiedProperty) {
        Utils.checkNotNull(unifiedProperty, "unifiedProperty");
        this.unifiedProperty = Optional.ofNullable(unifiedProperty);
        return this;
    }


    /**
     * Name of the property in our Unified API.
     */
    public LinkedResources withUnifiedProperty(Optional<String> unifiedProperty) {
        Utils.checkNotNull(unifiedProperty, "unifiedProperty");
        this.unifiedProperty = unifiedProperty;
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
        LinkedResources other = (LinkedResources) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.unifiedProperty, other.unifiedProperty);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, unifiedProperty);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LinkedResources.class,
                "id", id,
                "unifiedProperty", unifiedProperty);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> id = Optional.empty();

        private Optional<String> unifiedProperty = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * ID of the resource, typically a lowercased version of name.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * ID of the resource, typically a lowercased version of name.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }


        /**
         * Name of the property in our Unified API.
         */
        public Builder unifiedProperty(String unifiedProperty) {
            Utils.checkNotNull(unifiedProperty, "unifiedProperty");
            this.unifiedProperty = Optional.ofNullable(unifiedProperty);
            return this;
        }

        /**
         * Name of the property in our Unified API.
         */
        public Builder unifiedProperty(Optional<String> unifiedProperty) {
            Utils.checkNotNull(unifiedProperty, "unifiedProperty");
            this.unifiedProperty = unifiedProperty;
            return this;
        }

        public LinkedResources build() {

            return new LinkedResources(
                id, unifiedProperty);
        }

    }
}
