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

/**
 * LinkedParentCustomer
 * 
 * <p>The parent customer this entity is linked to.
 */
public class LinkedParentCustomer {

    /**
     * The parent ID of the customer this entity is linked to.
     */
    @JsonProperty("id")
    private String id;

    /**
     * The name of the parent customer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonCreator
    public LinkedParentCustomer(
            @JsonProperty("id") String id,
            @JsonProperty("name") Optional<String> name) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        this.id = id;
        this.name = name;
    }
    
    public LinkedParentCustomer(
            String id) {
        this(id, Optional.empty());
    }

    /**
     * The parent ID of the customer this entity is linked to.
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * The name of the parent customer.
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The parent ID of the customer this entity is linked to.
     */
    public LinkedParentCustomer withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The name of the parent customer.
     */
    public LinkedParentCustomer withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The name of the parent customer.
     */
    public LinkedParentCustomer withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        LinkedParentCustomer other = (LinkedParentCustomer) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LinkedParentCustomer.class,
                "id", id,
                "name", name);
    }
    
    public final static class Builder {
 
        private String id;
 
        private Optional<String> name = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The parent ID of the customer this entity is linked to.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The name of the parent customer.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * The name of the parent customer.
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public LinkedParentCustomer build() {
            return new LinkedParentCustomer(
                id,
                name);
        }
    }
}
