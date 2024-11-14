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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class OrderType {

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default")
    private Optional<Boolean> default_;

    /**
     * The user who last updated the object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_by")
    private JsonNullable<String> updatedBy;

    /**
     * The user who created the object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    private JsonNullable<String> createdBy;

    /**
     * The date and time when the object was last updated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private JsonNullable<OffsetDateTime> updatedAt;

    /**
     * The date and time when the object was created.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private JsonNullable<OffsetDateTime> createdAt;

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pass_through")
    private Optional<? extends List<PassThroughBody>> passThrough;

    @JsonCreator
    public OrderType(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("default") Optional<Boolean> default_,
            @JsonProperty("updated_by") JsonNullable<String> updatedBy,
            @JsonProperty("created_by") JsonNullable<String> createdBy,
            @JsonProperty("updated_at") JsonNullable<OffsetDateTime> updatedAt,
            @JsonProperty("created_at") JsonNullable<OffsetDateTime> createdAt,
            @JsonProperty("pass_through") Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(default_, "default_");
        Utils.checkNotNull(updatedBy, "updatedBy");
        Utils.checkNotNull(createdBy, "createdBy");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(passThrough, "passThrough");
        this.id = id;
        this.name = name;
        this.default_ = default_;
        this.updatedBy = updatedBy;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.passThrough = passThrough;
    }
    
    public OrderType() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @JsonIgnore
    public Optional<Boolean> default_() {
        return default_;
    }

    /**
     * The user who last updated the object.
     */
    @JsonIgnore
    public JsonNullable<String> updatedBy() {
        return updatedBy;
    }

    /**
     * The user who created the object.
     */
    @JsonIgnore
    public JsonNullable<String> createdBy() {
        return createdBy;
    }

    /**
     * The date and time when the object was last updated.
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    /**
     * The date and time when the object was created.
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> createdAt() {
        return createdAt;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<PassThroughBody>> passThrough() {
        return (Optional<List<PassThroughBody>>) passThrough;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique identifier for an object.
     */
    public OrderType withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public OrderType withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public OrderType withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public OrderType withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public OrderType withDefault(boolean default_) {
        Utils.checkNotNull(default_, "default_");
        this.default_ = Optional.ofNullable(default_);
        return this;
    }

    public OrderType withDefault(Optional<Boolean> default_) {
        Utils.checkNotNull(default_, "default_");
        this.default_ = default_;
        return this;
    }

    /**
     * The user who last updated the object.
     */
    public OrderType withUpdatedBy(String updatedBy) {
        Utils.checkNotNull(updatedBy, "updatedBy");
        this.updatedBy = JsonNullable.of(updatedBy);
        return this;
    }

    /**
     * The user who last updated the object.
     */
    public OrderType withUpdatedBy(JsonNullable<String> updatedBy) {
        Utils.checkNotNull(updatedBy, "updatedBy");
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * The user who created the object.
     */
    public OrderType withCreatedBy(String createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = JsonNullable.of(createdBy);
        return this;
    }

    /**
     * The user who created the object.
     */
    public OrderType withCreatedBy(JsonNullable<String> createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    /**
     * The date and time when the object was last updated.
     */
    public OrderType withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * The date and time when the object was last updated.
     */
    public OrderType withUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The date and time when the object was created.
     */
    public OrderType withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = JsonNullable.of(createdAt);
        return this;
    }

    /**
     * The date and time when the object was created.
     */
    public OrderType withCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public OrderType withPassThrough(List<PassThroughBody> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public OrderType withPassThrough(Optional<? extends List<PassThroughBody>> passThrough) {
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
        OrderType other = (OrderType) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.default_, other.default_) &&
            Objects.deepEquals(this.updatedBy, other.updatedBy) &&
            Objects.deepEquals(this.createdBy, other.createdBy) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.passThrough, other.passThrough);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            default_,
            updatedBy,
            createdBy,
            updatedAt,
            createdAt,
            passThrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OrderType.class,
                "id", id,
                "name", name,
                "default_", default_,
                "updatedBy", updatedBy,
                "createdBy", createdBy,
                "updatedAt", updatedAt,
                "createdAt", createdAt,
                "passThrough", passThrough);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<Boolean> default_ = Optional.empty();
 
        private JsonNullable<String> updatedBy = JsonNullable.undefined();
 
        private JsonNullable<String> createdBy = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> createdAt = JsonNullable.undefined();
 
        private Optional<? extends List<PassThroughBody>> passThrough = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A unique identifier for an object.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder default_(boolean default_) {
            Utils.checkNotNull(default_, "default_");
            this.default_ = Optional.ofNullable(default_);
            return this;
        }

        public Builder default_(Optional<Boolean> default_) {
            Utils.checkNotNull(default_, "default_");
            this.default_ = default_;
            return this;
        }

        /**
         * The user who last updated the object.
         */
        public Builder updatedBy(String updatedBy) {
            Utils.checkNotNull(updatedBy, "updatedBy");
            this.updatedBy = JsonNullable.of(updatedBy);
            return this;
        }

        /**
         * The user who last updated the object.
         */
        public Builder updatedBy(JsonNullable<String> updatedBy) {
            Utils.checkNotNull(updatedBy, "updatedBy");
            this.updatedBy = updatedBy;
            return this;
        }

        /**
         * The user who created the object.
         */
        public Builder createdBy(String createdBy) {
            Utils.checkNotNull(createdBy, "createdBy");
            this.createdBy = JsonNullable.of(createdBy);
            return this;
        }

        /**
         * The user who created the object.
         */
        public Builder createdBy(JsonNullable<String> createdBy) {
            Utils.checkNotNull(createdBy, "createdBy");
            this.createdBy = createdBy;
            return this;
        }

        /**
         * The date and time when the object was last updated.
         */
        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = JsonNullable.of(updatedAt);
            return this;
        }

        /**
         * The date and time when the object was last updated.
         */
        public Builder updatedAt(JsonNullable<OffsetDateTime> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * The date and time when the object was created.
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = JsonNullable.of(createdAt);
            return this;
        }

        /**
         * The date and time when the object was created.
         */
        public Builder createdAt(JsonNullable<OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
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
        
        public OrderType build() {
            return new OrderType(
                id,
                name,
                default_,
                updatedBy,
                createdBy,
                updatedAt,
                createdAt,
                passThrough);
        }
    }
}
