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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;


public class Collection {
    /**
     * A unique identifier for an object.
     */
    @JsonProperty("id")
    private String id;

    /**
     * The collections's parent ID
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent_id")
    private JsonNullable<String> parentId;

    /**
     * The collections's type
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private JsonNullable<String> type;

    /**
     * Name of the collection
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * Description of the collection
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_mappings")
    private JsonNullable<? extends Map<String, Object>> customMappings;

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

    @JsonCreator
    public Collection(
            @JsonProperty("id") String id,
            @JsonProperty("parent_id") JsonNullable<String> parentId,
            @JsonProperty("type") JsonNullable<String> type,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("custom_mappings") JsonNullable<? extends Map<String, Object>> customMappings,
            @JsonProperty("updated_at") JsonNullable<OffsetDateTime> updatedAt,
            @JsonProperty("created_at") JsonNullable<OffsetDateTime> createdAt) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(parentId, "parentId");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(customMappings, "customMappings");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(createdAt, "createdAt");
        this.id = id;
        this.parentId = parentId;
        this.type = type;
        this.name = name;
        this.description = description;
        this.customMappings = customMappings;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }
    
    public Collection(
            String id) {
        this(id, JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * The collections's parent ID
     */
    @JsonIgnore
    public JsonNullable<String> parentId() {
        return parentId;
    }

    /**
     * The collections's type
     */
    @JsonIgnore
    public JsonNullable<String> type() {
        return type;
    }

    /**
     * Name of the collection
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * Description of the collection
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, Object>> customMappings() {
        return (JsonNullable<Map<String, Object>>) customMappings;
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

    public static Builder builder() {
        return new Builder();
    }


    /**
     * A unique identifier for an object.
     */
    public Collection withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The collections's parent ID
     */
    public Collection withParentId(String parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = JsonNullable.of(parentId);
        return this;
    }

    /**
     * The collections's parent ID
     */
    public Collection withParentId(JsonNullable<String> parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = parentId;
        return this;
    }

    /**
     * The collections's type
     */
    public Collection withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * The collections's type
     */
    public Collection withType(JsonNullable<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Name of the collection
     */
    public Collection withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Name of the collection
     */
    public Collection withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Description of the collection
     */
    public Collection withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Description of the collection
     */
    public Collection withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    public Collection withCustomMappings(Map<String, Object> customMappings) {
        Utils.checkNotNull(customMappings, "customMappings");
        this.customMappings = JsonNullable.of(customMappings);
        return this;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    public Collection withCustomMappings(JsonNullable<? extends Map<String, Object>> customMappings) {
        Utils.checkNotNull(customMappings, "customMappings");
        this.customMappings = customMappings;
        return this;
    }

    /**
     * The date and time when the object was last updated.
     */
    public Collection withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * The date and time when the object was last updated.
     */
    public Collection withUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The date and time when the object was created.
     */
    public Collection withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = JsonNullable.of(createdAt);
        return this;
    }

    /**
     * The date and time when the object was created.
     */
    public Collection withCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
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
        Collection other = (Collection) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.parentId, other.parentId) &&
            Utils.enhancedDeepEquals(this.type, other.type) &&
            Utils.enhancedDeepEquals(this.name, other.name) &&
            Utils.enhancedDeepEquals(this.description, other.description) &&
            Utils.enhancedDeepEquals(this.customMappings, other.customMappings) &&
            Utils.enhancedDeepEquals(this.updatedAt, other.updatedAt) &&
            Utils.enhancedDeepEquals(this.createdAt, other.createdAt);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, parentId, type,
            name, description, customMappings,
            updatedAt, createdAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Collection.class,
                "id", id,
                "parentId", parentId,
                "type", type,
                "name", name,
                "description", description,
                "customMappings", customMappings,
                "updatedAt", updatedAt,
                "createdAt", createdAt);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String id;

        private JsonNullable<String> parentId = JsonNullable.undefined();

        private JsonNullable<String> type = JsonNullable.undefined();

        private JsonNullable<String> name = JsonNullable.undefined();

        private JsonNullable<String> description = JsonNullable.undefined();

        private JsonNullable<? extends Map<String, Object>> customMappings = JsonNullable.undefined();

        private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.undefined();

        private JsonNullable<OffsetDateTime> createdAt = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * A unique identifier for an object.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }


        /**
         * The collections's parent ID
         */
        public Builder parentId(String parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = JsonNullable.of(parentId);
            return this;
        }

        /**
         * The collections's parent ID
         */
        public Builder parentId(JsonNullable<String> parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = parentId;
            return this;
        }


        /**
         * The collections's type
         */
        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        /**
         * The collections's type
         */
        public Builder type(JsonNullable<String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }


        /**
         * Name of the collection
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * Name of the collection
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }


        /**
         * Description of the collection
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * Description of the collection
         */
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }


        /**
         * When custom mappings are configured on the resource, the result is included here.
         */
        public Builder customMappings(Map<String, Object> customMappings) {
            Utils.checkNotNull(customMappings, "customMappings");
            this.customMappings = JsonNullable.of(customMappings);
            return this;
        }

        /**
         * When custom mappings are configured on the resource, the result is included here.
         */
        public Builder customMappings(JsonNullable<? extends Map<String, Object>> customMappings) {
            Utils.checkNotNull(customMappings, "customMappings");
            this.customMappings = customMappings;
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

        public Collection build() {

            return new Collection(
                id, parentId, type,
                name, description, customMappings,
                updatedAt, createdAt);
        }

    }
}
