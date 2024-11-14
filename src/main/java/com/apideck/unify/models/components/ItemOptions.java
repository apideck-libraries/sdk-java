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
import java.util.Objects;
import java.util.Optional;


public class ItemOptions {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attribute_id")
    private Optional<String> attributeId;

    @JsonCreator
    public ItemOptions(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("attribute_id") Optional<String> attributeId) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(attributeId, "attributeId");
        this.id = id;
        this.name = name;
        this.attributeId = attributeId;
    }
    
    public ItemOptions() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @JsonIgnore
    public Optional<String> attributeId() {
        return attributeId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ItemOptions withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public ItemOptions withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public ItemOptions withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public ItemOptions withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public ItemOptions withAttributeId(String attributeId) {
        Utils.checkNotNull(attributeId, "attributeId");
        this.attributeId = Optional.ofNullable(attributeId);
        return this;
    }

    public ItemOptions withAttributeId(Optional<String> attributeId) {
        Utils.checkNotNull(attributeId, "attributeId");
        this.attributeId = attributeId;
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
        ItemOptions other = (ItemOptions) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.attributeId, other.attributeId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            attributeId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ItemOptions.class,
                "id", id,
                "name", name,
                "attributeId", attributeId);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<String> attributeId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

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

        public Builder attributeId(String attributeId) {
            Utils.checkNotNull(attributeId, "attributeId");
            this.attributeId = Optional.ofNullable(attributeId);
            return this;
        }

        public Builder attributeId(Optional<String> attributeId) {
            Utils.checkNotNull(attributeId, "attributeId");
            this.attributeId = attributeId;
            return this;
        }
        
        public ItemOptions build() {
            return new ItemOptions(
                id,
                name,
                attributeId);
        }
    }
}
