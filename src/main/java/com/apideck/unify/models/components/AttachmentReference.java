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

public class AttachmentReference {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends AttachmentReferenceType> type;

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonCreator
    public AttachmentReference(
            @JsonProperty("type") Optional<? extends AttachmentReferenceType> type,
            @JsonProperty("id") Optional<String> id) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(id, "id");
        this.type = type;
        this.id = id;
    }
    
    public AttachmentReference() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AttachmentReferenceType> type() {
        return (Optional<AttachmentReferenceType>) type;
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public AttachmentReference withType(AttachmentReferenceType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public AttachmentReference withType(Optional<? extends AttachmentReferenceType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public AttachmentReference withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public AttachmentReference withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        AttachmentReference other = (AttachmentReference) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AttachmentReference.class,
                "type", type,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends AttachmentReferenceType> type = Optional.empty();
 
        private Optional<String> id = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(AttachmentReferenceType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends AttachmentReferenceType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
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
        
        public AttachmentReference build() {
            return new AttachmentReference(
                type,
                id);
        }
    }
}
