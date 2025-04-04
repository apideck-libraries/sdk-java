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
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * DeprecatedLinkedTrackingCategory
 * 
 * @deprecated class: This will be removed in a future release, please migrate away from it as soon as possible.
 */
@Deprecated
public class DeprecatedLinkedTrackingCategory {

    /**
     * The unique identifier for the tracking category.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * The name of the tracking category.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    @JsonCreator
    public DeprecatedLinkedTrackingCategory(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") JsonNullable<String> name) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        this.id = id;
        this.name = name;
    }
    
    public DeprecatedLinkedTrackingCategory() {
        this(Optional.empty(), JsonNullable.undefined());
    }

    /**
     * The unique identifier for the tracking category.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * The name of the tracking category.
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The unique identifier for the tracking category.
     */
    public DeprecatedLinkedTrackingCategory withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * The unique identifier for the tracking category.
     */
    public DeprecatedLinkedTrackingCategory withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The name of the tracking category.
     */
    public DeprecatedLinkedTrackingCategory withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The name of the tracking category.
     */
    public DeprecatedLinkedTrackingCategory withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        DeprecatedLinkedTrackingCategory other = (DeprecatedLinkedTrackingCategory) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeprecatedLinkedTrackingCategory.class,
                "id", id,
                "name", name);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private JsonNullable<String> name = JsonNullable.undefined();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique identifier for the tracking category.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * The unique identifier for the tracking category.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The name of the tracking category.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * The name of the tracking category.
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public DeprecatedLinkedTrackingCategory build() {
            return new DeprecatedLinkedTrackingCategory(
                id,
                name);
        }
    }
}
