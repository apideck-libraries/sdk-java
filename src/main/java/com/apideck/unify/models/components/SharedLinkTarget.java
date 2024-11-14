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
import org.openapitools.jackson.nullable.JsonNullable;


public class SharedLinkTarget {

    /**
     * A unique identifier for an object.
     */
    @JsonProperty("id")
    private String id;

    /**
     * The name of the file
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * The type of resource. Could be file, folder or url
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private JsonNullable<? extends FileType> type;

    @JsonCreator
    public SharedLinkTarget(
            @JsonProperty("id") String id,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("type") JsonNullable<? extends FileType> type) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(type, "type");
        this.id = id;
        this.name = name;
        this.type = type;
    }
    
    public SharedLinkTarget(
            String id) {
        this(id, JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * The name of the file
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * The type of resource. Could be file, folder or url
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<FileType> type() {
        return (JsonNullable<FileType>) type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique identifier for an object.
     */
    public SharedLinkTarget withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The name of the file
     */
    public SharedLinkTarget withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The name of the file
     */
    public SharedLinkTarget withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The type of resource. Could be file, folder or url
     */
    public SharedLinkTarget withType(FileType type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * The type of resource. Could be file, folder or url
     */
    public SharedLinkTarget withType(JsonNullable<? extends FileType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        SharedLinkTarget other = (SharedLinkTarget) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SharedLinkTarget.class,
                "id", id,
                "name", name,
                "type", type);
    }
    
    public final static class Builder {
 
        private String id;
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<? extends FileType> type = JsonNullable.undefined();  
        
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
         * The type of resource. Could be file, folder or url
         */
        public Builder type(FileType type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        /**
         * The type of resource. Could be file, folder or url
         */
        public Builder type(JsonNullable<? extends FileType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public SharedLinkTarget build() {
            return new SharedLinkTarget(
                id,
                name,
                type);
        }
    }
}

