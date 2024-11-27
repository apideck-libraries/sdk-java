/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;


import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class VaultCustomMappingsAllRequest {

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
     * Unified API
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=unified_api")
    private String unifiedApi;

    /**
     * Service ID of the resource to return
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=service_id")
    private String serviceId;

    @JsonCreator
    public VaultCustomMappingsAllRequest(
            Optional<String> consumerId,
            Optional<String> appId,
            String unifiedApi,
            String serviceId) {
        Utils.checkNotNull(consumerId, "consumerId");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(unifiedApi, "unifiedApi");
        Utils.checkNotNull(serviceId, "serviceId");
        this.consumerId = consumerId;
        this.appId = appId;
        this.unifiedApi = unifiedApi;
        this.serviceId = serviceId;
    }
    
    public VaultCustomMappingsAllRequest(
            String unifiedApi,
            String serviceId) {
        this(Optional.empty(), Optional.empty(), unifiedApi, serviceId);
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
     * Unified API
     */
    @JsonIgnore
    public String unifiedApi() {
        return unifiedApi;
    }

    /**
     * Service ID of the resource to return
     */
    @JsonIgnore
    public String serviceId() {
        return serviceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public VaultCustomMappingsAllRequest withConsumerId(String consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = Optional.ofNullable(consumerId);
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public VaultCustomMappingsAllRequest withConsumerId(Optional<String> consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = consumerId;
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public VaultCustomMappingsAllRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public VaultCustomMappingsAllRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * Unified API
     */
    public VaultCustomMappingsAllRequest withUnifiedApi(String unifiedApi) {
        Utils.checkNotNull(unifiedApi, "unifiedApi");
        this.unifiedApi = unifiedApi;
        return this;
    }

    /**
     * Service ID of the resource to return
     */
    public VaultCustomMappingsAllRequest withServiceId(String serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = serviceId;
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
        VaultCustomMappingsAllRequest other = (VaultCustomMappingsAllRequest) o;
        return 
            Objects.deepEquals(this.consumerId, other.consumerId) &&
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.unifiedApi, other.unifiedApi) &&
            Objects.deepEquals(this.serviceId, other.serviceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            consumerId,
            appId,
            unifiedApi,
            serviceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VaultCustomMappingsAllRequest.class,
                "consumerId", consumerId,
                "appId", appId,
                "unifiedApi", unifiedApi,
                "serviceId", serviceId);
    }
    
    public final static class Builder {
 
        private Optional<String> consumerId = Optional.empty();
 
        private Optional<String> appId = Optional.empty();
 
        private String unifiedApi;
 
        private String serviceId;  
        
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
         * Unified API
         */
        public Builder unifiedApi(String unifiedApi) {
            Utils.checkNotNull(unifiedApi, "unifiedApi");
            this.unifiedApi = unifiedApi;
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
        
        public VaultCustomMappingsAllRequest build() {
            return new VaultCustomMappingsAllRequest(
                consumerId,
                appId,
                unifiedApi,
                serviceId);
        }
    }
}

