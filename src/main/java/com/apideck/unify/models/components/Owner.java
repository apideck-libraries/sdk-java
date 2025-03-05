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
import org.openapitools.jackson.nullable.JsonNullable;

public class Owner {

    /**
     * ID of the owner
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * Email of the owner
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private JsonNullable<String> email;

    /**
     * Name of the owner
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    @JsonCreator
    public Owner(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("email") JsonNullable<String> email,
            @JsonProperty("name") JsonNullable<String> name) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(name, "name");
        this.id = id;
        this.email = email;
        this.name = name;
    }
    
    public Owner() {
        this(Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * ID of the owner
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * Email of the owner
     */
    @JsonIgnore
    public JsonNullable<String> email() {
        return email;
    }

    /**
     * Name of the owner
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the owner
     */
    public Owner withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * ID of the owner
     */
    public Owner withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Email of the owner
     */
    public Owner withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = JsonNullable.of(email);
        return this;
    }

    /**
     * Email of the owner
     */
    public Owner withEmail(JsonNullable<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * Name of the owner
     */
    public Owner withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Name of the owner
     */
    public Owner withName(JsonNullable<String> name) {
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
        Owner other = (Owner) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            email,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Owner.class,
                "id", id,
                "email", email,
                "name", name);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private JsonNullable<String> email = JsonNullable.undefined();
 
        private JsonNullable<String> name = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID of the owner
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * ID of the owner
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Email of the owner
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = JsonNullable.of(email);
            return this;
        }

        /**
         * Email of the owner
         */
        public Builder email(JsonNullable<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        /**
         * Name of the owner
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * Name of the owner
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public Owner build() {
            return new Owner(
                id,
                email,
                name);
        }
    }
}

