/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class AssigneeInput {

    /**
     * A unique identifier for an object.
     */
    @JsonProperty("id")
    private String id;

    @JsonCreator
    public AssigneeInput(
            @JsonProperty("id") String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * A unique identifier for an object.
     */
    public AssigneeInput withId(String id) {
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
        AssigneeInput other = (AssigneeInput) o;
        return 
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AssigneeInput.class,
                "id", id);
    }
    
    public final static class Builder {
 
        private String id;
        
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
        
        public AssigneeInput build() {
            return new AssigneeInput(
                id);
        }
    }
}
