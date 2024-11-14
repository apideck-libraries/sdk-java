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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class Attachment {

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * The display id of the file
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("display_id")
    private JsonNullable<String> displayId;

    /**
     * The name of the file
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * The MIME type of the file.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mime_type")
    private JsonNullable<String> mimeType;

    /**
     * The size of the file in bytes
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private JsonNullable<Long> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    private Optional<? extends AttachmentReference> reference;

    /**
     * Optional description of the file
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * The folder id where this attachment belong to
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent_folder_id")
    private JsonNullable<String> parentFolderId;

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
    public Attachment(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("display_id") JsonNullable<String> displayId,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("mime_type") JsonNullable<String> mimeType,
            @JsonProperty("size") JsonNullable<Long> size,
            @JsonProperty("reference") Optional<? extends AttachmentReference> reference,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("parent_folder_id") JsonNullable<String> parentFolderId,
            @JsonProperty("updated_by") JsonNullable<String> updatedBy,
            @JsonProperty("created_by") JsonNullable<String> createdBy,
            @JsonProperty("updated_at") JsonNullable<OffsetDateTime> updatedAt,
            @JsonProperty("created_at") JsonNullable<OffsetDateTime> createdAt,
            @JsonProperty("pass_through") Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(displayId, "displayId");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(mimeType, "mimeType");
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(parentFolderId, "parentFolderId");
        Utils.checkNotNull(updatedBy, "updatedBy");
        Utils.checkNotNull(createdBy, "createdBy");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(passThrough, "passThrough");
        this.id = id;
        this.displayId = displayId;
        this.name = name;
        this.mimeType = mimeType;
        this.size = size;
        this.reference = reference;
        this.description = description;
        this.parentFolderId = parentFolderId;
        this.updatedBy = updatedBy;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.passThrough = passThrough;
    }
    
    public Attachment() {
        this(Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * The display id of the file
     */
    @JsonIgnore
    public JsonNullable<String> displayId() {
        return displayId;
    }

    /**
     * The name of the file
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * The MIME type of the file.
     */
    @JsonIgnore
    public JsonNullable<String> mimeType() {
        return mimeType;
    }

    /**
     * The size of the file in bytes
     */
    @JsonIgnore
    public JsonNullable<Long> size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AttachmentReference> reference() {
        return (Optional<AttachmentReference>) reference;
    }

    /**
     * Optional description of the file
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * The folder id where this attachment belong to
     */
    @JsonIgnore
    public JsonNullable<String> parentFolderId() {
        return parentFolderId;
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
    public Attachment withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Attachment withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The display id of the file
     */
    public Attachment withDisplayId(String displayId) {
        Utils.checkNotNull(displayId, "displayId");
        this.displayId = JsonNullable.of(displayId);
        return this;
    }

    /**
     * The display id of the file
     */
    public Attachment withDisplayId(JsonNullable<String> displayId) {
        Utils.checkNotNull(displayId, "displayId");
        this.displayId = displayId;
        return this;
    }

    /**
     * The name of the file
     */
    public Attachment withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The name of the file
     */
    public Attachment withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The MIME type of the file.
     */
    public Attachment withMimeType(String mimeType) {
        Utils.checkNotNull(mimeType, "mimeType");
        this.mimeType = JsonNullable.of(mimeType);
        return this;
    }

    /**
     * The MIME type of the file.
     */
    public Attachment withMimeType(JsonNullable<String> mimeType) {
        Utils.checkNotNull(mimeType, "mimeType");
        this.mimeType = mimeType;
        return this;
    }

    /**
     * The size of the file in bytes
     */
    public Attachment withSize(long size) {
        Utils.checkNotNull(size, "size");
        this.size = JsonNullable.of(size);
        return this;
    }

    /**
     * The size of the file in bytes
     */
    public Attachment withSize(JsonNullable<Long> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public Attachment withReference(AttachmentReference reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = Optional.ofNullable(reference);
        return this;
    }

    public Attachment withReference(Optional<? extends AttachmentReference> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    /**
     * Optional description of the file
     */
    public Attachment withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Optional description of the file
     */
    public Attachment withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * The folder id where this attachment belong to
     */
    public Attachment withParentFolderId(String parentFolderId) {
        Utils.checkNotNull(parentFolderId, "parentFolderId");
        this.parentFolderId = JsonNullable.of(parentFolderId);
        return this;
    }

    /**
     * The folder id where this attachment belong to
     */
    public Attachment withParentFolderId(JsonNullable<String> parentFolderId) {
        Utils.checkNotNull(parentFolderId, "parentFolderId");
        this.parentFolderId = parentFolderId;
        return this;
    }

    /**
     * The user who last updated the object.
     */
    public Attachment withUpdatedBy(String updatedBy) {
        Utils.checkNotNull(updatedBy, "updatedBy");
        this.updatedBy = JsonNullable.of(updatedBy);
        return this;
    }

    /**
     * The user who last updated the object.
     */
    public Attachment withUpdatedBy(JsonNullable<String> updatedBy) {
        Utils.checkNotNull(updatedBy, "updatedBy");
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * The user who created the object.
     */
    public Attachment withCreatedBy(String createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = JsonNullable.of(createdBy);
        return this;
    }

    /**
     * The user who created the object.
     */
    public Attachment withCreatedBy(JsonNullable<String> createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    /**
     * The date and time when the object was last updated.
     */
    public Attachment withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * The date and time when the object was last updated.
     */
    public Attachment withUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The date and time when the object was created.
     */
    public Attachment withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = JsonNullable.of(createdAt);
        return this;
    }

    /**
     * The date and time when the object was created.
     */
    public Attachment withCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public Attachment withPassThrough(List<PassThroughBody> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public Attachment withPassThrough(Optional<? extends List<PassThroughBody>> passThrough) {
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
        Attachment other = (Attachment) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.displayId, other.displayId) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.mimeType, other.mimeType) &&
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.reference, other.reference) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.parentFolderId, other.parentFolderId) &&
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
            displayId,
            name,
            mimeType,
            size,
            reference,
            description,
            parentFolderId,
            updatedBy,
            createdBy,
            updatedAt,
            createdAt,
            passThrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Attachment.class,
                "id", id,
                "displayId", displayId,
                "name", name,
                "mimeType", mimeType,
                "size", size,
                "reference", reference,
                "description", description,
                "parentFolderId", parentFolderId,
                "updatedBy", updatedBy,
                "createdBy", createdBy,
                "updatedAt", updatedAt,
                "createdAt", createdAt,
                "passThrough", passThrough);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private JsonNullable<String> displayId = JsonNullable.undefined();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<String> mimeType = JsonNullable.undefined();
 
        private JsonNullable<Long> size = JsonNullable.undefined();
 
        private Optional<? extends AttachmentReference> reference = Optional.empty();
 
        private JsonNullable<String> description = JsonNullable.undefined();
 
        private JsonNullable<String> parentFolderId = JsonNullable.undefined();
 
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
         * The display id of the file
         */
        public Builder displayId(String displayId) {
            Utils.checkNotNull(displayId, "displayId");
            this.displayId = JsonNullable.of(displayId);
            return this;
        }

        /**
         * The display id of the file
         */
        public Builder displayId(JsonNullable<String> displayId) {
            Utils.checkNotNull(displayId, "displayId");
            this.displayId = displayId;
            return this;
        }

        /**
         * The name of the file
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * The name of the file
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The MIME type of the file.
         */
        public Builder mimeType(String mimeType) {
            Utils.checkNotNull(mimeType, "mimeType");
            this.mimeType = JsonNullable.of(mimeType);
            return this;
        }

        /**
         * The MIME type of the file.
         */
        public Builder mimeType(JsonNullable<String> mimeType) {
            Utils.checkNotNull(mimeType, "mimeType");
            this.mimeType = mimeType;
            return this;
        }

        /**
         * The size of the file in bytes
         */
        public Builder size(long size) {
            Utils.checkNotNull(size, "size");
            this.size = JsonNullable.of(size);
            return this;
        }

        /**
         * The size of the file in bytes
         */
        public Builder size(JsonNullable<Long> size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }

        public Builder reference(AttachmentReference reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = Optional.ofNullable(reference);
            return this;
        }

        public Builder reference(Optional<? extends AttachmentReference> reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }

        /**
         * Optional description of the file
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * Optional description of the file
         */
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * The folder id where this attachment belong to
         */
        public Builder parentFolderId(String parentFolderId) {
            Utils.checkNotNull(parentFolderId, "parentFolderId");
            this.parentFolderId = JsonNullable.of(parentFolderId);
            return this;
        }

        /**
         * The folder id where this attachment belong to
         */
        public Builder parentFolderId(JsonNullable<String> parentFolderId) {
            Utils.checkNotNull(parentFolderId, "parentFolderId");
            this.parentFolderId = parentFolderId;
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
        
        public Attachment build() {
            return new Attachment(
                id,
                displayId,
                name,
                mimeType,
                size,
                reference,
                description,
                parentFolderId,
                updatedBy,
                createdBy,
                updatedAt,
                createdAt,
                passThrough);
        }
    }
}
