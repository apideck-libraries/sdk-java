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
import java.util.Optional;

/**
 * ConnectorOauthScopes
 * 
 * <p>OAuth scopes required for the connector. Add these scopes to your OAuth app.
 */
public class ConnectorOauthScopes {
    /**
     * ID of the OAuth scope.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * Label of the OAuth scope.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("label")
    private Optional<String> label;

    @JsonCreator
    public ConnectorOauthScopes(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("label") Optional<String> label) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(label, "label");
        this.id = id;
        this.label = label;
    }
    
    public ConnectorOauthScopes() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * ID of the OAuth scope.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * Label of the OAuth scope.
     */
    @JsonIgnore
    public Optional<String> label() {
        return label;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * ID of the OAuth scope.
     */
    public ConnectorOauthScopes withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }


    /**
     * ID of the OAuth scope.
     */
    public ConnectorOauthScopes withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Label of the OAuth scope.
     */
    public ConnectorOauthScopes withLabel(String label) {
        Utils.checkNotNull(label, "label");
        this.label = Optional.ofNullable(label);
        return this;
    }


    /**
     * Label of the OAuth scope.
     */
    public ConnectorOauthScopes withLabel(Optional<String> label) {
        Utils.checkNotNull(label, "label");
        this.label = label;
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
        ConnectorOauthScopes other = (ConnectorOauthScopes) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.label, other.label);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, label);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConnectorOauthScopes.class,
                "id", id,
                "label", label);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> id = Optional.empty();

        private Optional<String> label = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * ID of the OAuth scope.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * ID of the OAuth scope.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }


        /**
         * Label of the OAuth scope.
         */
        public Builder label(String label) {
            Utils.checkNotNull(label, "label");
            this.label = Optional.ofNullable(label);
            return this;
        }

        /**
         * Label of the OAuth scope.
         */
        public Builder label(Optional<String> label) {
            Utils.checkNotNull(label, "label");
            this.label = label;
            return this;
        }

        public ConnectorOauthScopes build() {

            return new ConnectorOauthScopes(
                id, label);
        }

    }
}
