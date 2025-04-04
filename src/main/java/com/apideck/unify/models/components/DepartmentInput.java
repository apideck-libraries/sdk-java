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
import org.openapitools.jackson.nullable.JsonNullable;

public class DepartmentInput {

    /**
     * Department name
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private JsonNullable<String> code;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pass_through")
    private Optional<? extends List<PassThroughBody>> passThrough;

    @JsonCreator
    public DepartmentInput(
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("code") JsonNullable<String> code,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("pass_through") Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(passThrough, "passThrough");
        this.name = name;
        this.code = code;
        this.description = description;
        this.passThrough = passThrough;
    }
    
    public DepartmentInput() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * Department name
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    @JsonIgnore
    public JsonNullable<String> code() {
        return code;
    }

    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<PassThroughBody>> passThrough() {
        return (Optional<List<PassThroughBody>>) passThrough;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Department name
     */
    public DepartmentInput withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Department name
     */
    public DepartmentInput withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public DepartmentInput withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = JsonNullable.of(code);
        return this;
    }

    public DepartmentInput withCode(JsonNullable<String> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    public DepartmentInput withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    public DepartmentInput withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public DepartmentInput withPassThrough(List<PassThroughBody> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public DepartmentInput withPassThrough(Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = passThrough;
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
        DepartmentInput other = (DepartmentInput) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.passThrough, other.passThrough);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            code,
            description,
            passThrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DepartmentInput.class,
                "name", name,
                "code", code,
                "description", description,
                "passThrough", passThrough);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<String> code = JsonNullable.undefined();
 
        private JsonNullable<String> description = JsonNullable.undefined();
 
        private Optional<? extends List<PassThroughBody>> passThrough = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Department name
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * Department name
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = JsonNullable.of(code);
            return this;
        }

        public Builder code(JsonNullable<String> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
         */
        public Builder passThrough(List<PassThroughBody> passThrough) {
            Utils.checkNotNull(passThrough, "passThrough");
            this.passThrough = Optional.ofNullable(passThrough);
            return this;
        }

        /**
         * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
         */
        public Builder passThrough(Optional<? extends List<PassThroughBody>> passThrough) {
            Utils.checkNotNull(passThrough, "passThrough");
            this.passThrough = passThrough;
            return this;
        }
        
        public DepartmentInput build() {
            return new DepartmentInput(
                name,
                code,
                description,
                passThrough);
        }
    }
}
