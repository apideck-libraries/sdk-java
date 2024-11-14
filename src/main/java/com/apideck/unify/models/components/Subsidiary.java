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
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class Subsidiary {

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent_id")
    private JsonNullable<String> parentId;

    /**
     * The name of the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * Based on the status some functionality is enabled or disabled.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends SubsidiaryStatus> status;

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_mappings")
    private JsonNullable<? extends CustomMappings> customMappings;

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("row_version")
    private JsonNullable<String> rowVersion;

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
    public Subsidiary(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("parent_id") JsonNullable<String> parentId,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("status") Optional<? extends SubsidiaryStatus> status,
            @JsonProperty("custom_mappings") JsonNullable<? extends CustomMappings> customMappings,
            @JsonProperty("row_version") JsonNullable<String> rowVersion,
            @JsonProperty("updated_by") JsonNullable<String> updatedBy,
            @JsonProperty("created_by") JsonNullable<String> createdBy,
            @JsonProperty("updated_at") JsonNullable<OffsetDateTime> updatedAt,
            @JsonProperty("created_at") JsonNullable<OffsetDateTime> createdAt,
            @JsonProperty("pass_through") Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(parentId, "parentId");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(customMappings, "customMappings");
        Utils.checkNotNull(rowVersion, "rowVersion");
        Utils.checkNotNull(updatedBy, "updatedBy");
        Utils.checkNotNull(createdBy, "createdBy");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(passThrough, "passThrough");
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.status = status;
        this.customMappings = customMappings;
        this.rowVersion = rowVersion;
        this.updatedBy = updatedBy;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.passThrough = passThrough;
    }
    
    public Subsidiary() {
        this(Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public JsonNullable<String> parentId() {
        return parentId;
    }

    /**
     * The name of the company.
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * Based on the status some functionality is enabled or disabled.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SubsidiaryStatus> status() {
        return (Optional<SubsidiaryStatus>) status;
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
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    @JsonIgnore
    public JsonNullable<String> rowVersion() {
        return rowVersion;
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
    public Subsidiary withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Subsidiary withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Subsidiary withParentId(String parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = JsonNullable.of(parentId);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Subsidiary withParentId(JsonNullable<String> parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = parentId;
        return this;
    }

    /**
     * The name of the company.
     */
    public Subsidiary withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The name of the company.
     */
    public Subsidiary withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Based on the status some functionality is enabled or disabled.
     */
    public Subsidiary withStatus(SubsidiaryStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Based on the status some functionality is enabled or disabled.
     */
    public Subsidiary withStatus(Optional<? extends SubsidiaryStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    public Subsidiary withCustomMappings(CustomMappings customMappings) {
        Utils.checkNotNull(customMappings, "customMappings");
        this.customMappings = JsonNullable.of(customMappings);
        return this;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    public Subsidiary withCustomMappings(JsonNullable<? extends CustomMappings> customMappings) {
        Utils.checkNotNull(customMappings, "customMappings");
        this.customMappings = customMappings;
        return this;
    }

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    public Subsidiary withRowVersion(String rowVersion) {
        Utils.checkNotNull(rowVersion, "rowVersion");
        this.rowVersion = JsonNullable.of(rowVersion);
        return this;
    }

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    public Subsidiary withRowVersion(JsonNullable<String> rowVersion) {
        Utils.checkNotNull(rowVersion, "rowVersion");
        this.rowVersion = rowVersion;
        return this;
    }

    /**
     * The user who last updated the object.
     */
    public Subsidiary withUpdatedBy(String updatedBy) {
        Utils.checkNotNull(updatedBy, "updatedBy");
        this.updatedBy = JsonNullable.of(updatedBy);
        return this;
    }

    /**
     * The user who last updated the object.
     */
    public Subsidiary withUpdatedBy(JsonNullable<String> updatedBy) {
        Utils.checkNotNull(updatedBy, "updatedBy");
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * The user who created the object.
     */
    public Subsidiary withCreatedBy(String createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = JsonNullable.of(createdBy);
        return this;
    }

    /**
     * The user who created the object.
     */
    public Subsidiary withCreatedBy(JsonNullable<String> createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    /**
     * The date and time when the object was last updated.
     */
    public Subsidiary withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * The date and time when the object was last updated.
     */
    public Subsidiary withUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The date and time when the object was created.
     */
    public Subsidiary withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = JsonNullable.of(createdAt);
        return this;
    }

    /**
     * The date and time when the object was created.
     */
    public Subsidiary withCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public Subsidiary withPassThrough(List<PassThroughBody> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public Subsidiary withPassThrough(Optional<? extends List<PassThroughBody>> passThrough) {
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
        Subsidiary other = (Subsidiary) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.parentId, other.parentId) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.customMappings, other.customMappings) &&
            Objects.deepEquals(this.rowVersion, other.rowVersion) &&
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
            parentId,
            name,
            status,
            customMappings,
            rowVersion,
            updatedBy,
            createdBy,
            updatedAt,
            createdAt,
            passThrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Subsidiary.class,
                "id", id,
                "parentId", parentId,
                "name", name,
                "status", status,
                "customMappings", customMappings,
                "rowVersion", rowVersion,
                "updatedBy", updatedBy,
                "createdBy", createdBy,
                "updatedAt", updatedAt,
                "createdAt", createdAt,
                "passThrough", passThrough);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private JsonNullable<String> parentId = JsonNullable.undefined();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private Optional<? extends SubsidiaryStatus> status = Optional.empty();
 
        private JsonNullable<? extends CustomMappings> customMappings = JsonNullable.undefined();
 
        private JsonNullable<String> rowVersion = JsonNullable.undefined();
 
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

        /**
         * A unique identifier for an object.
         */
        public Builder parentId(String parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = JsonNullable.of(parentId);
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder parentId(JsonNullable<String> parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = parentId;
            return this;
        }

        /**
         * The name of the company.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * The name of the company.
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Based on the status some functionality is enabled or disabled.
         */
        public Builder status(SubsidiaryStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Based on the status some functionality is enabled or disabled.
         */
        public Builder status(Optional<? extends SubsidiaryStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
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
         * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
         */
        public Builder rowVersion(String rowVersion) {
            Utils.checkNotNull(rowVersion, "rowVersion");
            this.rowVersion = JsonNullable.of(rowVersion);
            return this;
        }

        /**
         * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
         */
        public Builder rowVersion(JsonNullable<String> rowVersion) {
            Utils.checkNotNull(rowVersion, "rowVersion");
            this.rowVersion = rowVersion;
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
        
        public Subsidiary build() {
            return new Subsidiary(
                id,
                parentId,
                name,
                status,
                customMappings,
                rowVersion,
                updatedBy,
                createdBy,
                updatedAt,
                createdAt,
                passThrough);
        }
    }
}
