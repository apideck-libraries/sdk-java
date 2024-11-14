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
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class TrackingCategoryInput {

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent_id")
    private JsonNullable<String> parentId;

    /**
     * The name of the tracking category.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * The code of the tracking category.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private JsonNullable<String> code;

    /**
     * Based on the status some functionality is enabled or disabled.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends TrackingCategoryStatus> status;

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("row_version")
    private JsonNullable<String> rowVersion;

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pass_through")
    private Optional<? extends List<PassThroughBody>> passThrough;

    @JsonCreator
    public TrackingCategoryInput(
            @JsonProperty("parent_id") JsonNullable<String> parentId,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("code") JsonNullable<String> code,
            @JsonProperty("status") Optional<? extends TrackingCategoryStatus> status,
            @JsonProperty("row_version") JsonNullable<String> rowVersion,
            @JsonProperty("pass_through") Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(parentId, "parentId");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(rowVersion, "rowVersion");
        Utils.checkNotNull(passThrough, "passThrough");
        this.parentId = parentId;
        this.name = name;
        this.code = code;
        this.status = status;
        this.rowVersion = rowVersion;
        this.passThrough = passThrough;
    }
    
    public TrackingCategoryInput() {
        this(JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public JsonNullable<String> parentId() {
        return parentId;
    }

    /**
     * The name of the tracking category.
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * The code of the tracking category.
     */
    @JsonIgnore
    public JsonNullable<String> code() {
        return code;
    }

    /**
     * Based on the status some functionality is enabled or disabled.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TrackingCategoryStatus> status() {
        return (Optional<TrackingCategoryStatus>) status;
    }

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    @JsonIgnore
    public JsonNullable<String> rowVersion() {
        return rowVersion;
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
    public TrackingCategoryInput withParentId(String parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = JsonNullable.of(parentId);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public TrackingCategoryInput withParentId(JsonNullable<String> parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = parentId;
        return this;
    }

    /**
     * The name of the tracking category.
     */
    public TrackingCategoryInput withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The name of the tracking category.
     */
    public TrackingCategoryInput withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The code of the tracking category.
     */
    public TrackingCategoryInput withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = JsonNullable.of(code);
        return this;
    }

    /**
     * The code of the tracking category.
     */
    public TrackingCategoryInput withCode(JsonNullable<String> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    /**
     * Based on the status some functionality is enabled or disabled.
     */
    public TrackingCategoryInput withStatus(TrackingCategoryStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Based on the status some functionality is enabled or disabled.
     */
    public TrackingCategoryInput withStatus(Optional<? extends TrackingCategoryStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    public TrackingCategoryInput withRowVersion(String rowVersion) {
        Utils.checkNotNull(rowVersion, "rowVersion");
        this.rowVersion = JsonNullable.of(rowVersion);
        return this;
    }

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    public TrackingCategoryInput withRowVersion(JsonNullable<String> rowVersion) {
        Utils.checkNotNull(rowVersion, "rowVersion");
        this.rowVersion = rowVersion;
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public TrackingCategoryInput withPassThrough(List<PassThroughBody> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public TrackingCategoryInput withPassThrough(Optional<? extends List<PassThroughBody>> passThrough) {
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
        TrackingCategoryInput other = (TrackingCategoryInput) o;
        return 
            Objects.deepEquals(this.parentId, other.parentId) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.rowVersion, other.rowVersion) &&
            Objects.deepEquals(this.passThrough, other.passThrough);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            parentId,
            name,
            code,
            status,
            rowVersion,
            passThrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TrackingCategoryInput.class,
                "parentId", parentId,
                "name", name,
                "code", code,
                "status", status,
                "rowVersion", rowVersion,
                "passThrough", passThrough);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> parentId = JsonNullable.undefined();
 
        private Optional<String> name = Optional.empty();
 
        private JsonNullable<String> code = JsonNullable.undefined();
 
        private Optional<? extends TrackingCategoryStatus> status = Optional.empty();
 
        private JsonNullable<String> rowVersion = JsonNullable.undefined();
 
        private Optional<? extends List<PassThroughBody>> passThrough = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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
         * The name of the tracking category.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * The name of the tracking category.
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The code of the tracking category.
         */
        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = JsonNullable.of(code);
            return this;
        }

        /**
         * The code of the tracking category.
         */
        public Builder code(JsonNullable<String> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        /**
         * Based on the status some functionality is enabled or disabled.
         */
        public Builder status(TrackingCategoryStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Based on the status some functionality is enabled or disabled.
         */
        public Builder status(Optional<? extends TrackingCategoryStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
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
        
        public TrackingCategoryInput build() {
            return new TrackingCategoryInput(
                parentId,
                name,
                code,
                status,
                rowVersion,
                passThrough);
        }
    }
}

