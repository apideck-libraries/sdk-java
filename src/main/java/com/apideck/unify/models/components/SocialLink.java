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

public class SocialLink {

    /**
     * Unique identifier of the social link
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<String> id;

    /**
     * URL of the social link, e.g. https://www.twitter.com/apideck
     */
    @JsonProperty("url")
    private String url;

    /**
     * Type of the social link, e.g. twitter
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private JsonNullable<String> type;

    @JsonCreator
    public SocialLink(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("url") String url,
            @JsonProperty("type") JsonNullable<String> type) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(url, "url");
        Utils.checkNotNull(type, "type");
        this.id = id;
        this.url = url;
        this.type = type;
    }
    
    public SocialLink(
            String url) {
        this(JsonNullable.undefined(), url, JsonNullable.undefined());
    }

    /**
     * Unique identifier of the social link
     */
    @JsonIgnore
    public JsonNullable<String> id() {
        return id;
    }

    /**
     * URL of the social link, e.g. https://www.twitter.com/apideck
     */
    @JsonIgnore
    public String url() {
        return url;
    }

    /**
     * Type of the social link, e.g. twitter
     */
    @JsonIgnore
    public JsonNullable<String> type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Unique identifier of the social link
     */
    public SocialLink withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier of the social link
     */
    public SocialLink withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * URL of the social link, e.g. https://www.twitter.com/apideck
     */
    public SocialLink withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
        return this;
    }

    /**
     * Type of the social link, e.g. twitter
     */
    public SocialLink withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * Type of the social link, e.g. twitter
     */
    public SocialLink withType(JsonNullable<String> type) {
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
        SocialLink other = (SocialLink) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.url, other.url) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            url,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SocialLink.class,
                "id", id,
                "url", url,
                "type", type);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private String url;
 
        private JsonNullable<String> type = JsonNullable.undefined();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier of the social link
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * Unique identifier of the social link
         */
        public Builder id(JsonNullable<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * URL of the social link, e.g. https://www.twitter.com/apideck
         */
        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }

        /**
         * Type of the social link, e.g. twitter
         */
        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        /**
         * Type of the social link, e.g. twitter
         */
        public Builder type(JsonNullable<String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public SocialLink build() {
            return new SocialLink(
                id,
                url,
                type);
        }
    }
}
