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


public class Configuration {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("resource")
    private Optional<String> resource;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaults")
    private Optional<? extends List<Defaults>> defaults;

    @JsonCreator
    public Configuration(
            @JsonProperty("resource") Optional<String> resource,
            @JsonProperty("defaults") Optional<? extends List<Defaults>> defaults) {
        Utils.checkNotNull(resource, "resource");
        Utils.checkNotNull(defaults, "defaults");
        this.resource = resource;
        this.defaults = defaults;
    }
    
    public Configuration() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> resource() {
        return resource;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Defaults>> defaults() {
        return (Optional<List<Defaults>>) defaults;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Configuration withResource(String resource) {
        Utils.checkNotNull(resource, "resource");
        this.resource = Optional.ofNullable(resource);
        return this;
    }

    public Configuration withResource(Optional<String> resource) {
        Utils.checkNotNull(resource, "resource");
        this.resource = resource;
        return this;
    }

    public Configuration withDefaults(List<Defaults> defaults) {
        Utils.checkNotNull(defaults, "defaults");
        this.defaults = Optional.ofNullable(defaults);
        return this;
    }

    public Configuration withDefaults(Optional<? extends List<Defaults>> defaults) {
        Utils.checkNotNull(defaults, "defaults");
        this.defaults = defaults;
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
        Configuration other = (Configuration) o;
        return 
            Objects.deepEquals(this.resource, other.resource) &&
            Objects.deepEquals(this.defaults, other.defaults);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            resource,
            defaults);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Configuration.class,
                "resource", resource,
                "defaults", defaults);
    }
    
    public final static class Builder {
 
        private Optional<String> resource = Optional.empty();
 
        private Optional<? extends List<Defaults>> defaults = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder resource(String resource) {
            Utils.checkNotNull(resource, "resource");
            this.resource = Optional.ofNullable(resource);
            return this;
        }

        public Builder resource(Optional<String> resource) {
            Utils.checkNotNull(resource, "resource");
            this.resource = resource;
            return this;
        }

        public Builder defaults(List<Defaults> defaults) {
            Utils.checkNotNull(defaults, "defaults");
            this.defaults = Optional.ofNullable(defaults);
            return this;
        }

        public Builder defaults(Optional<? extends List<Defaults>> defaults) {
            Utils.checkNotNull(defaults, "defaults");
            this.defaults = defaults;
            return this;
        }
        
        public Configuration build() {
            return new Configuration(
                resource,
                defaults);
        }
    }
}
