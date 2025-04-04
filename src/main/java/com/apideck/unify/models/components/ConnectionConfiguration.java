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

public class ConnectionConfiguration {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("resource")
    private Optional<String> resource;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaults")
    private Optional<? extends List<ConnectionDefaults>> defaults;

    @JsonCreator
    public ConnectionConfiguration(
            @JsonProperty("resource") Optional<String> resource,
            @JsonProperty("defaults") Optional<? extends List<ConnectionDefaults>> defaults) {
        Utils.checkNotNull(resource, "resource");
        Utils.checkNotNull(defaults, "defaults");
        this.resource = resource;
        this.defaults = defaults;
    }
    
    public ConnectionConfiguration() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> resource() {
        return resource;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ConnectionDefaults>> defaults() {
        return (Optional<List<ConnectionDefaults>>) defaults;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public ConnectionConfiguration withResource(String resource) {
        Utils.checkNotNull(resource, "resource");
        this.resource = Optional.ofNullable(resource);
        return this;
    }

    public ConnectionConfiguration withResource(Optional<String> resource) {
        Utils.checkNotNull(resource, "resource");
        this.resource = resource;
        return this;
    }

    public ConnectionConfiguration withDefaults(List<ConnectionDefaults> defaults) {
        Utils.checkNotNull(defaults, "defaults");
        this.defaults = Optional.ofNullable(defaults);
        return this;
    }

    public ConnectionConfiguration withDefaults(Optional<? extends List<ConnectionDefaults>> defaults) {
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
        ConnectionConfiguration other = (ConnectionConfiguration) o;
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
        return Utils.toString(ConnectionConfiguration.class,
                "resource", resource,
                "defaults", defaults);
    }
    
    public final static class Builder {
 
        private Optional<String> resource = Optional.empty();
 
        private Optional<? extends List<ConnectionDefaults>> defaults = Optional.empty();
        
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

        public Builder defaults(List<ConnectionDefaults> defaults) {
            Utils.checkNotNull(defaults, "defaults");
            this.defaults = Optional.ofNullable(defaults);
            return this;
        }

        public Builder defaults(Optional<? extends List<ConnectionDefaults>> defaults) {
            Utils.checkNotNull(defaults, "defaults");
            this.defaults = defaults;
            return this;
        }
        
        public ConnectionConfiguration build() {
            return new ConnectionConfiguration(
                resource,
                defaults);
        }
    }
}
