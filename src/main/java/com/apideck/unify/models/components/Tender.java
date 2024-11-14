/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;


import com.apideck.unify.utils.LazySingletonValue;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class Tender {

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private JsonNullable<String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("label")
    private JsonNullable<String> label;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("active")
    private JsonNullable<Boolean> active;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden")
    private JsonNullable<Boolean> hidden;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("editable")
    private JsonNullable<Boolean> editable;

    /**
     * If this tender opens the cash drawer
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("opens_cash_drawer")
    private Optional<Boolean> opensCashDrawer;

    /**
     * Allow tipping on payment from tender
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allows_tipping")
    private Optional<Boolean> allowsTipping;

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_mappings")
    private JsonNullable<? extends CustomMappings> customMappings;

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
    public Tender(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("key") JsonNullable<String> key,
            @JsonProperty("label") JsonNullable<String> label,
            @JsonProperty("active") JsonNullable<Boolean> active,
            @JsonProperty("hidden") JsonNullable<Boolean> hidden,
            @JsonProperty("editable") JsonNullable<Boolean> editable,
            @JsonProperty("opens_cash_drawer") Optional<Boolean> opensCashDrawer,
            @JsonProperty("allows_tipping") Optional<Boolean> allowsTipping,
            @JsonProperty("custom_mappings") JsonNullable<? extends CustomMappings> customMappings,
            @JsonProperty("updated_by") JsonNullable<String> updatedBy,
            @JsonProperty("created_by") JsonNullable<String> createdBy,
            @JsonProperty("updated_at") JsonNullable<OffsetDateTime> updatedAt,
            @JsonProperty("created_at") JsonNullable<OffsetDateTime> createdAt,
            @JsonProperty("pass_through") Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(label, "label");
        Utils.checkNotNull(active, "active");
        Utils.checkNotNull(hidden, "hidden");
        Utils.checkNotNull(editable, "editable");
        Utils.checkNotNull(opensCashDrawer, "opensCashDrawer");
        Utils.checkNotNull(allowsTipping, "allowsTipping");
        Utils.checkNotNull(customMappings, "customMappings");
        Utils.checkNotNull(updatedBy, "updatedBy");
        Utils.checkNotNull(createdBy, "createdBy");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(passThrough, "passThrough");
        this.id = id;
        this.key = key;
        this.label = label;
        this.active = active;
        this.hidden = hidden;
        this.editable = editable;
        this.opensCashDrawer = opensCashDrawer;
        this.allowsTipping = allowsTipping;
        this.customMappings = customMappings;
        this.updatedBy = updatedBy;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.passThrough = passThrough;
    }
    
    public Tender() {
        this(Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public JsonNullable<String> key() {
        return key;
    }

    @JsonIgnore
    public JsonNullable<String> label() {
        return label;
    }

    @JsonIgnore
    public JsonNullable<Boolean> active() {
        return active;
    }

    @JsonIgnore
    public JsonNullable<Boolean> hidden() {
        return hidden;
    }

    @JsonIgnore
    public JsonNullable<Boolean> editable() {
        return editable;
    }

    /**
     * If this tender opens the cash drawer
     */
    @JsonIgnore
    public Optional<Boolean> opensCashDrawer() {
        return opensCashDrawer;
    }

    /**
     * Allow tipping on payment from tender
     */
    @JsonIgnore
    public Optional<Boolean> allowsTipping() {
        return allowsTipping;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<CustomMappings> customMappings() {
        return (JsonNullable<CustomMappings>) customMappings;
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
    public Tender withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Tender withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Tender withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = JsonNullable.of(key);
        return this;
    }

    public Tender withKey(JsonNullable<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public Tender withLabel(String label) {
        Utils.checkNotNull(label, "label");
        this.label = JsonNullable.of(label);
        return this;
    }

    public Tender withLabel(JsonNullable<String> label) {
        Utils.checkNotNull(label, "label");
        this.label = label;
        return this;
    }

    public Tender withActive(boolean active) {
        Utils.checkNotNull(active, "active");
        this.active = JsonNullable.of(active);
        return this;
    }

    public Tender withActive(JsonNullable<Boolean> active) {
        Utils.checkNotNull(active, "active");
        this.active = active;
        return this;
    }

    public Tender withHidden(boolean hidden) {
        Utils.checkNotNull(hidden, "hidden");
        this.hidden = JsonNullable.of(hidden);
        return this;
    }

    public Tender withHidden(JsonNullable<Boolean> hidden) {
        Utils.checkNotNull(hidden, "hidden");
        this.hidden = hidden;
        return this;
    }

    public Tender withEditable(boolean editable) {
        Utils.checkNotNull(editable, "editable");
        this.editable = JsonNullable.of(editable);
        return this;
    }

    public Tender withEditable(JsonNullable<Boolean> editable) {
        Utils.checkNotNull(editable, "editable");
        this.editable = editable;
        return this;
    }

    /**
     * If this tender opens the cash drawer
     */
    public Tender withOpensCashDrawer(boolean opensCashDrawer) {
        Utils.checkNotNull(opensCashDrawer, "opensCashDrawer");
        this.opensCashDrawer = Optional.ofNullable(opensCashDrawer);
        return this;
    }

    /**
     * If this tender opens the cash drawer
     */
    public Tender withOpensCashDrawer(Optional<Boolean> opensCashDrawer) {
        Utils.checkNotNull(opensCashDrawer, "opensCashDrawer");
        this.opensCashDrawer = opensCashDrawer;
        return this;
    }

    /**
     * Allow tipping on payment from tender
     */
    public Tender withAllowsTipping(boolean allowsTipping) {
        Utils.checkNotNull(allowsTipping, "allowsTipping");
        this.allowsTipping = Optional.ofNullable(allowsTipping);
        return this;
    }

    /**
     * Allow tipping on payment from tender
     */
    public Tender withAllowsTipping(Optional<Boolean> allowsTipping) {
        Utils.checkNotNull(allowsTipping, "allowsTipping");
        this.allowsTipping = allowsTipping;
        return this;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    public Tender withCustomMappings(CustomMappings customMappings) {
        Utils.checkNotNull(customMappings, "customMappings");
        this.customMappings = JsonNullable.of(customMappings);
        return this;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    public Tender withCustomMappings(JsonNullable<? extends CustomMappings> customMappings) {
        Utils.checkNotNull(customMappings, "customMappings");
        this.customMappings = customMappings;
        return this;
    }

    /**
     * The user who last updated the object.
     */
    public Tender withUpdatedBy(String updatedBy) {
        Utils.checkNotNull(updatedBy, "updatedBy");
        this.updatedBy = JsonNullable.of(updatedBy);
        return this;
    }

    /**
     * The user who last updated the object.
     */
    public Tender withUpdatedBy(JsonNullable<String> updatedBy) {
        Utils.checkNotNull(updatedBy, "updatedBy");
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * The user who created the object.
     */
    public Tender withCreatedBy(String createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = JsonNullable.of(createdBy);
        return this;
    }

    /**
     * The user who created the object.
     */
    public Tender withCreatedBy(JsonNullable<String> createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    /**
     * The date and time when the object was last updated.
     */
    public Tender withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * The date and time when the object was last updated.
     */
    public Tender withUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The date and time when the object was created.
     */
    public Tender withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = JsonNullable.of(createdAt);
        return this;
    }

    /**
     * The date and time when the object was created.
     */
    public Tender withCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public Tender withPassThrough(List<PassThroughBody> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public Tender withPassThrough(Optional<? extends List<PassThroughBody>> passThrough) {
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
        Tender other = (Tender) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.label, other.label) &&
            Objects.deepEquals(this.active, other.active) &&
            Objects.deepEquals(this.hidden, other.hidden) &&
            Objects.deepEquals(this.editable, other.editable) &&
            Objects.deepEquals(this.opensCashDrawer, other.opensCashDrawer) &&
            Objects.deepEquals(this.allowsTipping, other.allowsTipping) &&
            Objects.deepEquals(this.customMappings, other.customMappings) &&
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
            key,
            label,
            active,
            hidden,
            editable,
            opensCashDrawer,
            allowsTipping,
            customMappings,
            updatedBy,
            createdBy,
            updatedAt,
            createdAt,
            passThrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Tender.class,
                "id", id,
                "key", key,
                "label", label,
                "active", active,
                "hidden", hidden,
                "editable", editable,
                "opensCashDrawer", opensCashDrawer,
                "allowsTipping", allowsTipping,
                "customMappings", customMappings,
                "updatedBy", updatedBy,
                "createdBy", createdBy,
                "updatedAt", updatedAt,
                "createdAt", createdAt,
                "passThrough", passThrough);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private JsonNullable<String> key = JsonNullable.undefined();
 
        private JsonNullable<String> label = JsonNullable.undefined();
 
        private JsonNullable<Boolean> active = JsonNullable.undefined();
 
        private JsonNullable<Boolean> hidden = JsonNullable.undefined();
 
        private JsonNullable<Boolean> editable = JsonNullable.undefined();
 
        private Optional<Boolean> opensCashDrawer;
 
        private Optional<Boolean> allowsTipping;
 
        private JsonNullable<? extends CustomMappings> customMappings = JsonNullable.undefined();
 
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

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = JsonNullable.of(key);
            return this;
        }

        public Builder key(JsonNullable<String> key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        public Builder label(String label) {
            Utils.checkNotNull(label, "label");
            this.label = JsonNullable.of(label);
            return this;
        }

        public Builder label(JsonNullable<String> label) {
            Utils.checkNotNull(label, "label");
            this.label = label;
            return this;
        }

        public Builder active(boolean active) {
            Utils.checkNotNull(active, "active");
            this.active = JsonNullable.of(active);
            return this;
        }

        public Builder active(JsonNullable<Boolean> active) {
            Utils.checkNotNull(active, "active");
            this.active = active;
            return this;
        }

        public Builder hidden(boolean hidden) {
            Utils.checkNotNull(hidden, "hidden");
            this.hidden = JsonNullable.of(hidden);
            return this;
        }

        public Builder hidden(JsonNullable<Boolean> hidden) {
            Utils.checkNotNull(hidden, "hidden");
            this.hidden = hidden;
            return this;
        }

        public Builder editable(boolean editable) {
            Utils.checkNotNull(editable, "editable");
            this.editable = JsonNullable.of(editable);
            return this;
        }

        public Builder editable(JsonNullable<Boolean> editable) {
            Utils.checkNotNull(editable, "editable");
            this.editable = editable;
            return this;
        }

        /**
         * If this tender opens the cash drawer
         */
        public Builder opensCashDrawer(boolean opensCashDrawer) {
            Utils.checkNotNull(opensCashDrawer, "opensCashDrawer");
            this.opensCashDrawer = Optional.ofNullable(opensCashDrawer);
            return this;
        }

        /**
         * If this tender opens the cash drawer
         */
        public Builder opensCashDrawer(Optional<Boolean> opensCashDrawer) {
            Utils.checkNotNull(opensCashDrawer, "opensCashDrawer");
            this.opensCashDrawer = opensCashDrawer;
            return this;
        }

        /**
         * Allow tipping on payment from tender
         */
        public Builder allowsTipping(boolean allowsTipping) {
            Utils.checkNotNull(allowsTipping, "allowsTipping");
            this.allowsTipping = Optional.ofNullable(allowsTipping);
            return this;
        }

        /**
         * Allow tipping on payment from tender
         */
        public Builder allowsTipping(Optional<Boolean> allowsTipping) {
            Utils.checkNotNull(allowsTipping, "allowsTipping");
            this.allowsTipping = allowsTipping;
            return this;
        }

        /**
         * When custom mappings are configured on the resource, the result is included here.
         */
        public Builder customMappings(CustomMappings customMappings) {
            Utils.checkNotNull(customMappings, "customMappings");
            this.customMappings = JsonNullable.of(customMappings);
            return this;
        }

        /**
         * When custom mappings are configured on the resource, the result is included here.
         */
        public Builder customMappings(JsonNullable<? extends CustomMappings> customMappings) {
            Utils.checkNotNull(customMappings, "customMappings");
            this.customMappings = customMappings;
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
        
        public Tender build() {
            if (opensCashDrawer == null) {
                opensCashDrawer = _SINGLETON_VALUE_OpensCashDrawer.value();
            }
            if (allowsTipping == null) {
                allowsTipping = _SINGLETON_VALUE_AllowsTipping.value();
            }            return new Tender(
                id,
                key,
                label,
                active,
                hidden,
                editable,
                opensCashDrawer,
                allowsTipping,
                customMappings,
                updatedBy,
                createdBy,
                updatedAt,
                createdAt,
                passThrough);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_OpensCashDrawer =
                new LazySingletonValue<>(
                        "opens_cash_drawer",
                        "true",
                        new TypeReference<Optional<Boolean>>() {});

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_AllowsTipping =
                new LazySingletonValue<>(
                        "allows_tipping",
                        "true",
                        new TypeReference<Optional<Boolean>>() {});
    }
}
