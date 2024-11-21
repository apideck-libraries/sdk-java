/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;


import com.apideck.unify.models.components.CreateCallbackState;
import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class VaultCreateCallbackStateRequest {

    /**
     * ID of the consumer which you want to get or push data from
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-consumer-id")
    private Optional<String> customerId;

    /**
     * The ID of your Unify application
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-app-id")
    private Optional<String> appId;

    /**
     * Service ID of the resource to return
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=service_id")
    private String serviceId;

    /**
     * Unified API
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=unified_api")
    private String unifiedApi;

    /**
     * Callback state data
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private CreateCallbackState createCallbackState;

    @JsonCreator
    public VaultCreateCallbackStateRequest(
            Optional<String> customerId,
            Optional<String> appId,
            String serviceId,
            String unifiedApi,
            CreateCallbackState createCallbackState) {
        Utils.checkNotNull(customerId, "customerId");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(serviceId, "serviceId");
        Utils.checkNotNull(unifiedApi, "unifiedApi");
        Utils.checkNotNull(createCallbackState, "createCallbackState");
        this.customerId = customerId;
        this.appId = appId;
        this.serviceId = serviceId;
        this.unifiedApi = unifiedApi;
        this.createCallbackState = createCallbackState;
    }
    
    public VaultCreateCallbackStateRequest(
            String serviceId,
            String unifiedApi,
            CreateCallbackState createCallbackState) {
        this(Optional.empty(), Optional.empty(), serviceId, unifiedApi, createCallbackState);
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    @JsonIgnore
    public Optional<String> customerId() {
        return customerId;
    }

    /**
     * The ID of your Unify application
     */
    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    /**
     * Service ID of the resource to return
     */
    @JsonIgnore
    public String serviceId() {
        return serviceId;
    }

    /**
     * Unified API
     */
    @JsonIgnore
    public String unifiedApi() {
        return unifiedApi;
    }

    /**
     * Callback state data
     */
    @JsonIgnore
    public CreateCallbackState createCallbackState() {
        return createCallbackState;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public VaultCreateCallbackStateRequest withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = Optional.ofNullable(customerId);
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public VaultCreateCallbackStateRequest withCustomerId(Optional<String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public VaultCreateCallbackStateRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public VaultCreateCallbackStateRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * Service ID of the resource to return
     */
    public VaultCreateCallbackStateRequest withServiceId(String serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Unified API
     */
    public VaultCreateCallbackStateRequest withUnifiedApi(String unifiedApi) {
        Utils.checkNotNull(unifiedApi, "unifiedApi");
        this.unifiedApi = unifiedApi;
        return this;
    }

    /**
     * Callback state data
     */
    public VaultCreateCallbackStateRequest withCreateCallbackState(CreateCallbackState createCallbackState) {
        Utils.checkNotNull(createCallbackState, "createCallbackState");
        this.createCallbackState = createCallbackState;
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
        VaultCreateCallbackStateRequest other = (VaultCreateCallbackStateRequest) o;
        return 
            Objects.deepEquals(this.customerId, other.customerId) &&
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.serviceId, other.serviceId) &&
            Objects.deepEquals(this.unifiedApi, other.unifiedApi) &&
            Objects.deepEquals(this.createCallbackState, other.createCallbackState);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            customerId,
            appId,
            serviceId,
            unifiedApi,
            createCallbackState);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VaultCreateCallbackStateRequest.class,
                "customerId", customerId,
                "appId", appId,
                "serviceId", serviceId,
                "unifiedApi", unifiedApi,
                "createCallbackState", createCallbackState);
    }
    
    public final static class Builder {
 
        private Optional<String> customerId = Optional.empty();
 
        private Optional<String> appId = Optional.empty();
 
        private String serviceId;
 
        private String unifiedApi;
 
        private CreateCallbackState createCallbackState;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID of the consumer which you want to get or push data from
         */
        public Builder customerId(String customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = Optional.ofNullable(customerId);
            return this;
        }

        /**
         * ID of the consumer which you want to get or push data from
         */
        public Builder customerId(Optional<String> customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = customerId;
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
         * Service ID of the resource to return
         */
        public Builder serviceId(String serviceId) {
            Utils.checkNotNull(serviceId, "serviceId");
            this.serviceId = serviceId;
            return this;
        }

        /**
         * Unified API
         */
        public Builder unifiedApi(String unifiedApi) {
            Utils.checkNotNull(unifiedApi, "unifiedApi");
            this.unifiedApi = unifiedApi;
            return this;
        }

        /**
         * Callback state data
         */
        public Builder createCallbackState(CreateCallbackState createCallbackState) {
            Utils.checkNotNull(createCallbackState, "createCallbackState");
            this.createCallbackState = createCallbackState;
            return this;
        }
        
        public VaultCreateCallbackStateRequest build() {
            return new VaultCreateCallbackStateRequest(
                customerId,
                appId,
                serviceId,
                unifiedApi,
                createCallbackState);
        }
    }
}

