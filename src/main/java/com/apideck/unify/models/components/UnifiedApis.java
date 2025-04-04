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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UnifiedApis {

    /**
     * Name of Apideck Unified API
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends UnifiedApiId> id;

    /**
     * Name of the API.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * Indicates whether a connector only supports authentication. In this case the connector is not mapped to a Unified API, but can be used with the Proxy API
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_only")
    private Optional<Boolean> authOnly;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("oauth_scopes")
    private Optional<? extends List<ConnectorOauthScopes>> oauthScopes;

    /**
     * List of resources that are supported on the connector.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supported_resources")
    private Optional<? extends List<LinkedConnectorResource>> supportedResources;

    /**
     * List of resources that are not supported on the downstream.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("downstream_unsupported_resources")
    private Optional<? extends List<String>> downstreamUnsupportedResources;

    /**
     * List of events that are supported on the connector for this Unified API.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supported_events")
    private Optional<? extends List<ConnectorEvent>> supportedEvents;

    @JsonCreator
    public UnifiedApis(
            @JsonProperty("id") Optional<? extends UnifiedApiId> id,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("auth_only") Optional<Boolean> authOnly,
            @JsonProperty("oauth_scopes") Optional<? extends List<ConnectorOauthScopes>> oauthScopes,
            @JsonProperty("supported_resources") Optional<? extends List<LinkedConnectorResource>> supportedResources,
            @JsonProperty("downstream_unsupported_resources") Optional<? extends List<String>> downstreamUnsupportedResources,
            @JsonProperty("supported_events") Optional<? extends List<ConnectorEvent>> supportedEvents) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(authOnly, "authOnly");
        Utils.checkNotNull(oauthScopes, "oauthScopes");
        Utils.checkNotNull(supportedResources, "supportedResources");
        Utils.checkNotNull(downstreamUnsupportedResources, "downstreamUnsupportedResources");
        Utils.checkNotNull(supportedEvents, "supportedEvents");
        this.id = id;
        this.name = name;
        this.authOnly = authOnly;
        this.oauthScopes = oauthScopes;
        this.supportedResources = supportedResources;
        this.downstreamUnsupportedResources = downstreamUnsupportedResources;
        this.supportedEvents = supportedEvents;
    }
    
    public UnifiedApis() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Name of Apideck Unified API
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UnifiedApiId> id() {
        return (Optional<UnifiedApiId>) id;
    }

    /**
     * Name of the API.
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * Indicates whether a connector only supports authentication. In this case the connector is not mapped to a Unified API, but can be used with the Proxy API
     */
    @JsonIgnore
    public Optional<Boolean> authOnly() {
        return authOnly;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ConnectorOauthScopes>> oauthScopes() {
        return (Optional<List<ConnectorOauthScopes>>) oauthScopes;
    }

    /**
     * List of resources that are supported on the connector.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<LinkedConnectorResource>> supportedResources() {
        return (Optional<List<LinkedConnectorResource>>) supportedResources;
    }

    /**
     * List of resources that are not supported on the downstream.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> downstreamUnsupportedResources() {
        return (Optional<List<String>>) downstreamUnsupportedResources;
    }

    /**
     * List of events that are supported on the connector for this Unified API.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ConnectorEvent>> supportedEvents() {
        return (Optional<List<ConnectorEvent>>) supportedEvents;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Name of Apideck Unified API
     */
    public UnifiedApis withId(UnifiedApiId id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Name of Apideck Unified API
     */
    public UnifiedApis withId(Optional<? extends UnifiedApiId> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Name of the API.
     */
    public UnifiedApis withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Name of the API.
     */
    public UnifiedApis withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Indicates whether a connector only supports authentication. In this case the connector is not mapped to a Unified API, but can be used with the Proxy API
     */
    public UnifiedApis withAuthOnly(boolean authOnly) {
        Utils.checkNotNull(authOnly, "authOnly");
        this.authOnly = Optional.ofNullable(authOnly);
        return this;
    }

    /**
     * Indicates whether a connector only supports authentication. In this case the connector is not mapped to a Unified API, but can be used with the Proxy API
     */
    public UnifiedApis withAuthOnly(Optional<Boolean> authOnly) {
        Utils.checkNotNull(authOnly, "authOnly");
        this.authOnly = authOnly;
        return this;
    }

    public UnifiedApis withOauthScopes(List<ConnectorOauthScopes> oauthScopes) {
        Utils.checkNotNull(oauthScopes, "oauthScopes");
        this.oauthScopes = Optional.ofNullable(oauthScopes);
        return this;
    }

    public UnifiedApis withOauthScopes(Optional<? extends List<ConnectorOauthScopes>> oauthScopes) {
        Utils.checkNotNull(oauthScopes, "oauthScopes");
        this.oauthScopes = oauthScopes;
        return this;
    }

    /**
     * List of resources that are supported on the connector.
     */
    public UnifiedApis withSupportedResources(List<LinkedConnectorResource> supportedResources) {
        Utils.checkNotNull(supportedResources, "supportedResources");
        this.supportedResources = Optional.ofNullable(supportedResources);
        return this;
    }

    /**
     * List of resources that are supported on the connector.
     */
    public UnifiedApis withSupportedResources(Optional<? extends List<LinkedConnectorResource>> supportedResources) {
        Utils.checkNotNull(supportedResources, "supportedResources");
        this.supportedResources = supportedResources;
        return this;
    }

    /**
     * List of resources that are not supported on the downstream.
     */
    public UnifiedApis withDownstreamUnsupportedResources(List<String> downstreamUnsupportedResources) {
        Utils.checkNotNull(downstreamUnsupportedResources, "downstreamUnsupportedResources");
        this.downstreamUnsupportedResources = Optional.ofNullable(downstreamUnsupportedResources);
        return this;
    }

    /**
     * List of resources that are not supported on the downstream.
     */
    public UnifiedApis withDownstreamUnsupportedResources(Optional<? extends List<String>> downstreamUnsupportedResources) {
        Utils.checkNotNull(downstreamUnsupportedResources, "downstreamUnsupportedResources");
        this.downstreamUnsupportedResources = downstreamUnsupportedResources;
        return this;
    }

    /**
     * List of events that are supported on the connector for this Unified API.
     */
    public UnifiedApis withSupportedEvents(List<ConnectorEvent> supportedEvents) {
        Utils.checkNotNull(supportedEvents, "supportedEvents");
        this.supportedEvents = Optional.ofNullable(supportedEvents);
        return this;
    }

    /**
     * List of events that are supported on the connector for this Unified API.
     */
    public UnifiedApis withSupportedEvents(Optional<? extends List<ConnectorEvent>> supportedEvents) {
        Utils.checkNotNull(supportedEvents, "supportedEvents");
        this.supportedEvents = supportedEvents;
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
        UnifiedApis other = (UnifiedApis) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.authOnly, other.authOnly) &&
            Objects.deepEquals(this.oauthScopes, other.oauthScopes) &&
            Objects.deepEquals(this.supportedResources, other.supportedResources) &&
            Objects.deepEquals(this.downstreamUnsupportedResources, other.downstreamUnsupportedResources) &&
            Objects.deepEquals(this.supportedEvents, other.supportedEvents);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            authOnly,
            oauthScopes,
            supportedResources,
            downstreamUnsupportedResources,
            supportedEvents);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UnifiedApis.class,
                "id", id,
                "name", name,
                "authOnly", authOnly,
                "oauthScopes", oauthScopes,
                "supportedResources", supportedResources,
                "downstreamUnsupportedResources", downstreamUnsupportedResources,
                "supportedEvents", supportedEvents);
    }
    
    public final static class Builder {
 
        private Optional<? extends UnifiedApiId> id = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<Boolean> authOnly = Optional.empty();
 
        private Optional<? extends List<ConnectorOauthScopes>> oauthScopes = Optional.empty();
 
        private Optional<? extends List<LinkedConnectorResource>> supportedResources = Optional.empty();
 
        private Optional<? extends List<String>> downstreamUnsupportedResources = Optional.empty();
 
        private Optional<? extends List<ConnectorEvent>> supportedEvents = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Name of Apideck Unified API
         */
        public Builder id(UnifiedApiId id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Name of Apideck Unified API
         */
        public Builder id(Optional<? extends UnifiedApiId> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Name of the API.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * Name of the API.
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Indicates whether a connector only supports authentication. In this case the connector is not mapped to a Unified API, but can be used with the Proxy API
         */
        public Builder authOnly(boolean authOnly) {
            Utils.checkNotNull(authOnly, "authOnly");
            this.authOnly = Optional.ofNullable(authOnly);
            return this;
        }

        /**
         * Indicates whether a connector only supports authentication. In this case the connector is not mapped to a Unified API, but can be used with the Proxy API
         */
        public Builder authOnly(Optional<Boolean> authOnly) {
            Utils.checkNotNull(authOnly, "authOnly");
            this.authOnly = authOnly;
            return this;
        }

        public Builder oauthScopes(List<ConnectorOauthScopes> oauthScopes) {
            Utils.checkNotNull(oauthScopes, "oauthScopes");
            this.oauthScopes = Optional.ofNullable(oauthScopes);
            return this;
        }

        public Builder oauthScopes(Optional<? extends List<ConnectorOauthScopes>> oauthScopes) {
            Utils.checkNotNull(oauthScopes, "oauthScopes");
            this.oauthScopes = oauthScopes;
            return this;
        }

        /**
         * List of resources that are supported on the connector.
         */
        public Builder supportedResources(List<LinkedConnectorResource> supportedResources) {
            Utils.checkNotNull(supportedResources, "supportedResources");
            this.supportedResources = Optional.ofNullable(supportedResources);
            return this;
        }

        /**
         * List of resources that are supported on the connector.
         */
        public Builder supportedResources(Optional<? extends List<LinkedConnectorResource>> supportedResources) {
            Utils.checkNotNull(supportedResources, "supportedResources");
            this.supportedResources = supportedResources;
            return this;
        }

        /**
         * List of resources that are not supported on the downstream.
         */
        public Builder downstreamUnsupportedResources(List<String> downstreamUnsupportedResources) {
            Utils.checkNotNull(downstreamUnsupportedResources, "downstreamUnsupportedResources");
            this.downstreamUnsupportedResources = Optional.ofNullable(downstreamUnsupportedResources);
            return this;
        }

        /**
         * List of resources that are not supported on the downstream.
         */
        public Builder downstreamUnsupportedResources(Optional<? extends List<String>> downstreamUnsupportedResources) {
            Utils.checkNotNull(downstreamUnsupportedResources, "downstreamUnsupportedResources");
            this.downstreamUnsupportedResources = downstreamUnsupportedResources;
            return this;
        }

        /**
         * List of events that are supported on the connector for this Unified API.
         */
        public Builder supportedEvents(List<ConnectorEvent> supportedEvents) {
            Utils.checkNotNull(supportedEvents, "supportedEvents");
            this.supportedEvents = Optional.ofNullable(supportedEvents);
            return this;
        }

        /**
         * List of events that are supported on the connector for this Unified API.
         */
        public Builder supportedEvents(Optional<? extends List<ConnectorEvent>> supportedEvents) {
            Utils.checkNotNull(supportedEvents, "supportedEvents");
            this.supportedEvents = supportedEvents;
            return this;
        }
        
        public UnifiedApis build() {
            return new UnifiedApis(
                id,
                name,
                authOnly,
                oauthScopes,
                supportedResources,
                downstreamUnsupportedResources,
                supportedEvents);
        }
    }
}
