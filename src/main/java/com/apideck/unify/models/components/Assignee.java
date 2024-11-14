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


public class Assignee {

    /**
     * A unique identifier for an object.
     */
    @JsonProperty("id")
    private String id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("username")
    private JsonNullable<String> username;

    @JsonCreator
    public Assignee(
            @JsonProperty("id") String id,
            @JsonProperty("username") JsonNullable<String> username) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(username, "username");
        this.id = id;
        this.username = username;
    }
    
    public Assignee(
            String id) {
        this(id, JsonNullable.undefined());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public JsonNullable<String> username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique identifier for an object.
     */
    public Assignee withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Assignee withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = JsonNullable.of(username);
        return this;
    }

    public Assignee withUsername(JsonNullable<String> username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
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
        Assignee other = (Assignee) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Assignee.class,
                "id", id,
                "username", username);
    }
    
    public final static class Builder {
 
        private String id;
 
        private JsonNullable<String> username = JsonNullable.undefined();  
        
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

        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = JsonNullable.of(username);
            return this;
        }

        public Builder username(JsonNullable<String> username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public Assignee build() {
            return new Assignee(
                id,
                username);
        }
    }
}
