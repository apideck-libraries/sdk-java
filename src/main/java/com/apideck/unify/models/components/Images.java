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
import org.openapitools.jackson.nullable.JsonNullable;


public class Images {

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<String> id;

    /**
     * The URL of an image of the product.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    private JsonNullable<String> url;

    @JsonCreator
    public Images(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("url") JsonNullable<String> url) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(url, "url");
        this.id = id;
        this.url = url;
    }
    
    public Images() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public JsonNullable<String> id() {
        return id;
    }

    /**
     * The URL of an image of the product.
     */
    @JsonIgnore
    public JsonNullable<String> url() {
        return url;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique identifier for an object.
     */
    public Images withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Images withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The URL of an image of the product.
     */
    public Images withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = JsonNullable.of(url);
        return this;
    }

    /**
     * The URL of an image of the product.
     */
    public Images withUrl(JsonNullable<String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
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
        Images other = (Images) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Images.class,
                "id", id,
                "url", url);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private JsonNullable<String> url = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A unique identifier for an object.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder id(JsonNullable<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The URL of an image of the product.
         */
        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = JsonNullable.of(url);
            return this;
        }

        /**
         * The URL of an image of the product.
         */
        public Builder url(JsonNullable<String> url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public Images build() {
            return new Images(
                id,
                url);
        }
    }
}

