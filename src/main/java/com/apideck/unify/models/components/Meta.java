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
import java.util.Objects;
import java.util.Optional;

/**
 * Meta
 * 
 * <p>Response metadata
 */
public class Meta {

    /**
     * Number of items returned in the data property of the response
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("items_on_page")
    private Optional<Long> itemsOnPage;

    /**
     * Cursors to navigate to previous or next pages through the API
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cursors")
    private Optional<? extends Cursors> cursors;

    @JsonCreator
    public Meta(
            @JsonProperty("items_on_page") Optional<Long> itemsOnPage,
            @JsonProperty("cursors") Optional<? extends Cursors> cursors) {
        Utils.checkNotNull(itemsOnPage, "itemsOnPage");
        Utils.checkNotNull(cursors, "cursors");
        this.itemsOnPage = itemsOnPage;
        this.cursors = cursors;
    }
    
    public Meta() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Number of items returned in the data property of the response
     */
    @JsonIgnore
    public Optional<Long> itemsOnPage() {
        return itemsOnPage;
    }

    /**
     * Cursors to navigate to previous or next pages through the API
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Cursors> cursors() {
        return (Optional<Cursors>) cursors;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Number of items returned in the data property of the response
     */
    public Meta withItemsOnPage(long itemsOnPage) {
        Utils.checkNotNull(itemsOnPage, "itemsOnPage");
        this.itemsOnPage = Optional.ofNullable(itemsOnPage);
        return this;
    }

    /**
     * Number of items returned in the data property of the response
     */
    public Meta withItemsOnPage(Optional<Long> itemsOnPage) {
        Utils.checkNotNull(itemsOnPage, "itemsOnPage");
        this.itemsOnPage = itemsOnPage;
        return this;
    }

    /**
     * Cursors to navigate to previous or next pages through the API
     */
    public Meta withCursors(Cursors cursors) {
        Utils.checkNotNull(cursors, "cursors");
        this.cursors = Optional.ofNullable(cursors);
        return this;
    }

    /**
     * Cursors to navigate to previous or next pages through the API
     */
    public Meta withCursors(Optional<? extends Cursors> cursors) {
        Utils.checkNotNull(cursors, "cursors");
        this.cursors = cursors;
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
        Meta other = (Meta) o;
        return 
            Objects.deepEquals(this.itemsOnPage, other.itemsOnPage) &&
            Objects.deepEquals(this.cursors, other.cursors);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            itemsOnPage,
            cursors);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Meta.class,
                "itemsOnPage", itemsOnPage,
                "cursors", cursors);
    }
    
    public final static class Builder {
 
        private Optional<Long> itemsOnPage = Optional.empty();
 
        private Optional<? extends Cursors> cursors = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Number of items returned in the data property of the response
         */
        public Builder itemsOnPage(long itemsOnPage) {
            Utils.checkNotNull(itemsOnPage, "itemsOnPage");
            this.itemsOnPage = Optional.ofNullable(itemsOnPage);
            return this;
        }

        /**
         * Number of items returned in the data property of the response
         */
        public Builder itemsOnPage(Optional<Long> itemsOnPage) {
            Utils.checkNotNull(itemsOnPage, "itemsOnPage");
            this.itemsOnPage = itemsOnPage;
            return this;
        }

        /**
         * Cursors to navigate to previous or next pages through the API
         */
        public Builder cursors(Cursors cursors) {
            Utils.checkNotNull(cursors, "cursors");
            this.cursors = Optional.ofNullable(cursors);
            return this;
        }

        /**
         * Cursors to navigate to previous or next pages through the API
         */
        public Builder cursors(Optional<? extends Cursors> cursors) {
            Utils.checkNotNull(cursors, "cursors");
            this.cursors = cursors;
            return this;
        }
        
        public Meta build() {
            return new Meta(
                itemsOnPage,
                cursors);
        }
    }
}
