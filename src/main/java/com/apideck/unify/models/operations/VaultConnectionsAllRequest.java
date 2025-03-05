/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.apideck.unify.models.operations;
import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class VaultConnectionsAllRequest {

    /**
     * ID of the consumer which you want to get or push data from
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-consumer-id")
    private Optional<String> consumerId;

    /**
     * The ID of your Unify application
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-app-id")
    private Optional<String> appId;

    /**
     * Scope results to Unified API
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=api")
    private Optional<String> api;

    /**
     * Scopes results to connections that have been configured or not
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=configured")
    private Optional<Boolean> configured;

    @JsonCreator
    public VaultConnectionsAllRequest(
            Optional<String> consumerId,
            Optional<String> appId,
            Optional<String> api,
            Optional<Boolean> configured) {
        Utils.checkNotNull(consumerId, "consumerId");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(api, "api");
        Utils.checkNotNull(configured, "configured");
        this.consumerId = consumerId;
        this.appId = appId;
        this.api = api;
        this.configured = configured;
    }
    
    public VaultConnectionsAllRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    @JsonIgnore
    public Optional<String> consumerId() {
        return consumerId;
    }

    /**
     * The ID of your Unify application
     */
    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    /**
     * Scope results to Unified API
     */
    @JsonIgnore
    public Optional<String> api() {
        return api;
    }

    /**
     * Scopes results to connections that have been configured or not
     */
    @JsonIgnore
    public Optional<Boolean> configured() {
        return configured;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public VaultConnectionsAllRequest withConsumerId(String consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = Optional.ofNullable(consumerId);
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public VaultConnectionsAllRequest withConsumerId(Optional<String> consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = consumerId;
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public VaultConnectionsAllRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public VaultConnectionsAllRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * Scope results to Unified API
     */
    public VaultConnectionsAllRequest withApi(String api) {
        Utils.checkNotNull(api, "api");
        this.api = Optional.ofNullable(api);
        return this;
    }

    /**
     * Scope results to Unified API
     */
    public VaultConnectionsAllRequest withApi(Optional<String> api) {
        Utils.checkNotNull(api, "api");
        this.api = api;
        return this;
    }

    /**
     * Scopes results to connections that have been configured or not
     */
    public VaultConnectionsAllRequest withConfigured(boolean configured) {
        Utils.checkNotNull(configured, "configured");
        this.configured = Optional.ofNullable(configured);
        return this;
    }

    /**
     * Scopes results to connections that have been configured or not
     */
    public VaultConnectionsAllRequest withConfigured(Optional<Boolean> configured) {
        Utils.checkNotNull(configured, "configured");
        this.configured = configured;
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
        VaultConnectionsAllRequest other = (VaultConnectionsAllRequest) o;
        return 
            Objects.deepEquals(this.consumerId, other.consumerId) &&
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.api, other.api) &&
            Objects.deepEquals(this.configured, other.configured);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            consumerId,
            appId,
            api,
            configured);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VaultConnectionsAllRequest.class,
                "consumerId", consumerId,
                "appId", appId,
                "api", api,
                "configured", configured);
    }
    
    public final static class Builder {
 
        private Optional<String> consumerId = Optional.empty();
 
        private Optional<String> appId = Optional.empty();
 
        private Optional<String> api = Optional.empty();
 
        private Optional<Boolean> configured = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID of the consumer which you want to get or push data from
         */
        public Builder consumerId(String consumerId) {
            Utils.checkNotNull(consumerId, "consumerId");
            this.consumerId = Optional.ofNullable(consumerId);
            return this;
        }

        /**
         * ID of the consumer which you want to get or push data from
         */
        public Builder consumerId(Optional<String> consumerId) {
            Utils.checkNotNull(consumerId, "consumerId");
            this.consumerId = consumerId;
            return this;
        }

        /**
         * The ID of your Unify application
         */
        public Builder appId(String appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = Optional.ofNullable(appId);
            return this;
        }

        /**
         * The ID of your Unify application
         */
        public Builder appId(Optional<String> appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = appId;
            return this;
        }

        /**
         * Scope results to Unified API
         */
        public Builder api(String api) {
            Utils.checkNotNull(api, "api");
            this.api = Optional.ofNullable(api);
            return this;
        }

        /**
         * Scope results to Unified API
         */
        public Builder api(Optional<String> api) {
            Utils.checkNotNull(api, "api");
            this.api = api;
            return this;
        }

        /**
         * Scopes results to connections that have been configured or not
         */
        public Builder configured(boolean configured) {
            Utils.checkNotNull(configured, "configured");
            this.configured = Optional.ofNullable(configured);
            return this;
        }

        /**
         * Scopes results to connections that have been configured or not
         */
        public Builder configured(Optional<Boolean> configured) {
            Utils.checkNotNull(configured, "configured");
            this.configured = configured;
            return this;
        }
        
        public VaultConnectionsAllRequest build() {
            return new VaultConnectionsAllRequest(
                consumerId,
                appId,
                api,
                configured);
        }
    }
}

