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

public class ParentAccount {

    /**
     * The ID of the parent account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * The name of the parent account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * The human readable display ID used when displaying the parent account
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("display_id")
    private Optional<String> displayId;

    @JsonCreator
    public ParentAccount(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("display_id") Optional<String> displayId) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(displayId, "displayId");
        this.id = id;
        this.name = name;
        this.displayId = displayId;
    }
    
    public ParentAccount() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The ID of the parent account.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * The name of the parent account.
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * The human readable display ID used when displaying the parent account
     */
    @JsonIgnore
    public Optional<String> displayId() {
        return displayId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the parent account.
     */
    public ParentAccount withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * The ID of the parent account.
     */
    public ParentAccount withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The name of the parent account.
     */
    public ParentAccount withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The name of the parent account.
     */
    public ParentAccount withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The human readable display ID used when displaying the parent account
     */
    public ParentAccount withDisplayId(String displayId) {
        Utils.checkNotNull(displayId, "displayId");
        this.displayId = Optional.ofNullable(displayId);
        return this;
    }

    /**
     * The human readable display ID used when displaying the parent account
     */
    public ParentAccount withDisplayId(Optional<String> displayId) {
        Utils.checkNotNull(displayId, "displayId");
        this.displayId = displayId;
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
        ParentAccount other = (ParentAccount) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.displayId, other.displayId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            displayId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ParentAccount.class,
                "id", id,
                "name", name,
                "displayId", displayId);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<String> displayId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the parent account.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * The ID of the parent account.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The name of the parent account.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * The name of the parent account.
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The human readable display ID used when displaying the parent account
         */
        public Builder displayId(String displayId) {
            Utils.checkNotNull(displayId, "displayId");
            this.displayId = Optional.ofNullable(displayId);
            return this;
        }

        /**
         * The human readable display ID used when displaying the parent account
         */
        public Builder displayId(Optional<String> displayId) {
            Utils.checkNotNull(displayId, "displayId");
            this.displayId = displayId;
            return this;
        }
        
        public ParentAccount build() {
            return new ParentAccount(
                id,
                name,
                displayId);
        }
    }
}

