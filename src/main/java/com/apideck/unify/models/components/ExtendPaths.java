/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.apideck.unify.models.components;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class ExtendPaths {

    /**
     * JSONPath string specifying where to apply the value.
     */
    @JsonProperty("path")
    private String path;

    /**
     * The value to set at the specified path, can be any type.
     */
    @JsonProperty("value")
    private Object value;

    @JsonCreator
    public ExtendPaths(
            @JsonProperty("path") String path,
            @JsonProperty("value") Object value) {
        Utils.checkNotNull(path, "path");
        Utils.checkNotNull(value, "value");
        this.path = path;
        this.value = value;
    }

    /**
     * JSONPath string specifying where to apply the value.
     */
    @JsonIgnore
    public String path() {
        return path;
    }

    /**
     * The value to set at the specified path, can be any type.
     */
    @JsonIgnore
    public Object value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * JSONPath string specifying where to apply the value.
     */
    public ExtendPaths withPath(String path) {
        Utils.checkNotNull(path, "path");
        this.path = path;
        return this;
    }

    /**
     * The value to set at the specified path, can be any type.
     */
    public ExtendPaths withValue(Object value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        ExtendPaths other = (ExtendPaths) o;
        return 
            Objects.deepEquals(this.path, other.path) &&
            Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            path,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ExtendPaths.class,
                "path", path,
                "value", value);
    }
    
    public final static class Builder {
 
        private String path;
 
        private Object value;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * JSONPath string specifying where to apply the value.
         */
        public Builder path(String path) {
            Utils.checkNotNull(path, "path");
            this.path = path;
            return this;
        }

        /**
         * The value to set at the specified path, can be any type.
         */
        public Builder value(Object value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public ExtendPaths build() {
            return new ExtendPaths(
                path,
                value);
        }
    }
}

