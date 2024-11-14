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


public class VaultConnectionCustomMappingsAllRequest {

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
     * Unified API
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=unified_api")
    private String unifiedApi;

    /**
     * Service ID of the resource to return
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=service_id")
    private String serviceId;

    /**
     * Name of the resource (plural)
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=resource")
    private String resource;

    /**
     * This is the id of the resource you want to fetch when listing custom fields. For example, if you want to fetch custom fields for a specific contact, you would use the contact id.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=resource_id")
    private Optional<String> resourceId;

    @JsonCreator
    public VaultConnectionCustomMappingsAllRequest(
            Optional<String> customerId,
            Optional<String> appId,
            String unifiedApi,
            String serviceId,
            String resource,
            Optional<String> resourceId) {
        Utils.checkNotNull(customerId, "customerId");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(unifiedApi, "unifiedApi");
        Utils.checkNotNull(serviceId, "serviceId");
        Utils.checkNotNull(resource, "resource");
        Utils.checkNotNull(resourceId, "resourceId");
        this.customerId = customerId;
        this.appId = appId;
        this.unifiedApi = unifiedApi;
        this.serviceId = serviceId;
        this.resource = resource;
        this.resourceId = resourceId;
    }
    
    public VaultConnectionCustomMappingsAllRequest(
            String unifiedApi,
            String serviceId,
            String resource) {
        this(Optional.empty(), Optional.empty(), unifiedApi, serviceId, resource, Optional.empty());
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

    /**
     * Name of the resource (plural)
     */
    @JsonIgnore
    public String resource() {
        return resource;
    }

    /**
     * This is the id of the resource you want to fetch when listing custom fields. For example, if you want to fetch custom fields for a specific contact, you would use the contact id.
     */
    @JsonIgnore
    public Optional<String> resourceId() {
        return resourceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public VaultConnectionCustomMappingsAllRequest withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = Optional.ofNullable(customerId);
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public VaultConnectionCustomMappingsAllRequest withCustomerId(Optional<String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public VaultConnectionCustomMappingsAllRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public VaultConnectionCustomMappingsAllRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * Unified API
     */
    public VaultConnectionCustomMappingsAllRequest withUnifiedApi(String unifiedApi) {
        Utils.checkNotNull(unifiedApi, "unifiedApi");
        this.unifiedApi = unifiedApi;
        return this;
    }

    /**
     * Service ID of the resource to return
     */
    public VaultConnectionCustomMappingsAllRequest withServiceId(String serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Name of the resource (plural)
     */
    public VaultConnectionCustomMappingsAllRequest withResource(String resource) {
        Utils.checkNotNull(resource, "resource");
        this.resource = resource;
        return this;
    }

    /**
     * This is the id of the resource you want to fetch when listing custom fields. For example, if you want to fetch custom fields for a specific contact, you would use the contact id.
     */
    public VaultConnectionCustomMappingsAllRequest withResourceId(String resourceId) {
        Utils.checkNotNull(resourceId, "resourceId");
        this.resourceId = Optional.ofNullable(resourceId);
        return this;
    }

    /**
     * This is the id of the resource you want to fetch when listing custom fields. For example, if you want to fetch custom fields for a specific contact, you would use the contact id.
     */
    public VaultConnectionCustomMappingsAllRequest withResourceId(Optional<String> resourceId) {
        Utils.checkNotNull(resourceId, "resourceId");
        this.resourceId = resourceId;
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
        VaultConnectionCustomMappingsAllRequest other = (VaultConnectionCustomMappingsAllRequest) o;
        return 
            Objects.deepEquals(this.customerId, other.customerId) &&
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.unifiedApi, other.unifiedApi) &&
            Objects.deepEquals(this.serviceId, other.serviceId) &&
            Objects.deepEquals(this.resource, other.resource) &&
            Objects.deepEquals(this.resourceId, other.resourceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            customerId,
            appId,
            unifiedApi,
            serviceId,
            resource,
            resourceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VaultConnectionCustomMappingsAllRequest.class,
                "customerId", customerId,
                "appId", appId,
                "unifiedApi", unifiedApi,
                "serviceId", serviceId,
                "resource", resource,
                "resourceId", resourceId);
    }
    
    public final static class Builder {
 
        private Optional<String> customerId = Optional.empty();
 
        private Optional<String> appId = Optional.empty();
 
        private String unifiedApi;
 
        private String serviceId;
 
        private String resource;
 
        private Optional<String> resourceId = Optional.empty();  
        
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

        /**
         * Name of the resource (plural)
         */
        public Builder resource(String resource) {
            Utils.checkNotNull(resource, "resource");
            this.resource = resource;
            return this;
        }

        /**
         * This is the id of the resource you want to fetch when listing custom fields. For example, if you want to fetch custom fields for a specific contact, you would use the contact id.
         */
        public Builder resourceId(String resourceId) {
            Utils.checkNotNull(resourceId, "resourceId");
            this.resourceId = Optional.ofNullable(resourceId);
            return this;
        }

        /**
         * This is the id of the resource you want to fetch when listing custom fields. For example, if you want to fetch custom fields for a specific contact, you would use the contact id.
         */
        public Builder resourceId(Optional<String> resourceId) {
            Utils.checkNotNull(resourceId, "resourceId");
            this.resourceId = resourceId;
            return this;
        }
        
        public VaultConnectionCustomMappingsAllRequest build() {
            return new VaultConnectionCustomMappingsAllRequest(
                customerId,
                appId,
                unifiedApi,
                serviceId,
                resource,
                resourceId);
        }
    }
}

