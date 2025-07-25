/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.models.components.CustomObjectInput;
import com.apideck.unify.utils.LazySingletonValue;
import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Optional;


public class CrmCustomObjectsAddRequest {
    /**
     * Include raw response. Mostly used for debugging purposes
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=raw")
    private Optional<Boolean> raw;

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
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-service-id")
    private Optional<String> serviceId;

    /**
     * The id of the custom object to query
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=object_id")
    private String objectId;


    @SpeakeasyMetadata("request:mediaType=application/json")
    private CustomObjectInput customObject;

    @JsonCreator
    public CrmCustomObjectsAddRequest(
            Optional<Boolean> raw,
            Optional<String> consumerId,
            Optional<String> appId,
            Optional<String> serviceId,
            String objectId,
            CustomObjectInput customObject) {
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(consumerId, "consumerId");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(serviceId, "serviceId");
        Utils.checkNotNull(objectId, "objectId");
        Utils.checkNotNull(customObject, "customObject");
        this.raw = raw;
        this.consumerId = consumerId;
        this.appId = appId;
        this.serviceId = serviceId;
        this.objectId = objectId;
        this.customObject = customObject;
    }
    
    public CrmCustomObjectsAddRequest(
            String objectId,
            CustomObjectInput customObject) {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), objectId, customObject);
    }

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    @JsonIgnore
    public Optional<Boolean> raw() {
        return raw;
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
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    @JsonIgnore
    public Optional<String> serviceId() {
        return serviceId;
    }

    /**
     * The id of the custom object to query
     */
    @JsonIgnore
    public String objectId() {
        return objectId;
    }

    @JsonIgnore
    public CustomObjectInput customObject() {
        return customObject;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public CrmCustomObjectsAddRequest withRaw(boolean raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }


    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public CrmCustomObjectsAddRequest withRaw(Optional<Boolean> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public CrmCustomObjectsAddRequest withConsumerId(String consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = Optional.ofNullable(consumerId);
        return this;
    }


    /**
     * ID of the consumer which you want to get or push data from
     */
    public CrmCustomObjectsAddRequest withConsumerId(Optional<String> consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = consumerId;
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public CrmCustomObjectsAddRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }


    /**
     * The ID of your Unify application
     */
    public CrmCustomObjectsAddRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public CrmCustomObjectsAddRequest withServiceId(String serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = Optional.ofNullable(serviceId);
        return this;
    }


    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public CrmCustomObjectsAddRequest withServiceId(Optional<String> serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = serviceId;
        return this;
    }

    /**
     * The id of the custom object to query
     */
    public CrmCustomObjectsAddRequest withObjectId(String objectId) {
        Utils.checkNotNull(objectId, "objectId");
        this.objectId = objectId;
        return this;
    }

    public CrmCustomObjectsAddRequest withCustomObject(CustomObjectInput customObject) {
        Utils.checkNotNull(customObject, "customObject");
        this.customObject = customObject;
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
        CrmCustomObjectsAddRequest other = (CrmCustomObjectsAddRequest) o;
        return 
            Utils.enhancedDeepEquals(this.raw, other.raw) &&
            Utils.enhancedDeepEquals(this.consumerId, other.consumerId) &&
            Utils.enhancedDeepEquals(this.appId, other.appId) &&
            Utils.enhancedDeepEquals(this.serviceId, other.serviceId) &&
            Utils.enhancedDeepEquals(this.objectId, other.objectId) &&
            Utils.enhancedDeepEquals(this.customObject, other.customObject);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            raw, consumerId, appId,
            serviceId, objectId, customObject);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CrmCustomObjectsAddRequest.class,
                "raw", raw,
                "consumerId", consumerId,
                "appId", appId,
                "serviceId", serviceId,
                "objectId", objectId,
                "customObject", customObject);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<Boolean> raw;

        private Optional<String> consumerId = Optional.empty();

        private Optional<String> appId = Optional.empty();

        private Optional<String> serviceId = Optional.empty();

        private String objectId;

        private CustomObjectInput customObject;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Include raw response. Mostly used for debugging purposes
         */
        public Builder raw(boolean raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        /**
         * Include raw response. Mostly used for debugging purposes
         */
        public Builder raw(Optional<Boolean> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
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
         * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
         */
        public Builder serviceId(String serviceId) {
            Utils.checkNotNull(serviceId, "serviceId");
            this.serviceId = Optional.ofNullable(serviceId);
            return this;
        }

        /**
         * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
         */
        public Builder serviceId(Optional<String> serviceId) {
            Utils.checkNotNull(serviceId, "serviceId");
            this.serviceId = serviceId;
            return this;
        }


        /**
         * The id of the custom object to query
         */
        public Builder objectId(String objectId) {
            Utils.checkNotNull(objectId, "objectId");
            this.objectId = objectId;
            return this;
        }


        public Builder customObject(CustomObjectInput customObject) {
            Utils.checkNotNull(customObject, "customObject");
            this.customObject = customObject;
            return this;
        }

        public CrmCustomObjectsAddRequest build() {
            if (raw == null) {
                raw = _SINGLETON_VALUE_Raw.value();
            }

            return new CrmCustomObjectsAddRequest(
                raw, consumerId, appId,
                serviceId, objectId, customObject);
        }


        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_Raw =
                new LazySingletonValue<>(
                        "raw",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});
    }
}
