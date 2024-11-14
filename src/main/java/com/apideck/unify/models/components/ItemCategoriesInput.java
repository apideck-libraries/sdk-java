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


public class ItemCategoriesInput {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("image_ids")
    private Optional<? extends List<String>> imageIds;

    @JsonCreator
    public ItemCategoriesInput(
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("image_ids") Optional<? extends List<String>> imageIds) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(imageIds, "imageIds");
        this.name = name;
        this.imageIds = imageIds;
    }
    
    public ItemCategoriesInput() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> imageIds() {
        return (Optional<List<String>>) imageIds;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ItemCategoriesInput withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public ItemCategoriesInput withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public ItemCategoriesInput withImageIds(List<String> imageIds) {
        Utils.checkNotNull(imageIds, "imageIds");
        this.imageIds = Optional.ofNullable(imageIds);
        return this;
    }

    public ItemCategoriesInput withImageIds(Optional<? extends List<String>> imageIds) {
        Utils.checkNotNull(imageIds, "imageIds");
        this.imageIds = imageIds;
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
        ItemCategoriesInput other = (ItemCategoriesInput) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.imageIds, other.imageIds);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            imageIds);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ItemCategoriesInput.class,
                "name", name,
                "imageIds", imageIds);
    }
    
    public final static class Builder {
 
        private Optional<String> name = Optional.empty();
 
        private Optional<? extends List<String>> imageIds = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder imageIds(List<String> imageIds) {
            Utils.checkNotNull(imageIds, "imageIds");
            this.imageIds = Optional.ofNullable(imageIds);
            return this;
        }

        public Builder imageIds(Optional<? extends List<String>> imageIds) {
            Utils.checkNotNull(imageIds, "imageIds");
            this.imageIds = imageIds;
            return this;
        }
        
        public ItemCategoriesInput build() {
            return new ItemCategoriesInput(
                name,
                imageIds);
        }
    }
}
