/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;


import com.apideck.unify.models.components.LocationInput;
import com.apideck.unify.utils.LazySingletonValue;
import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class PosLocationsUpdateRequest {

    /**
     * ID of the record you are acting upon.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

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
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-service-id")
    private Optional<String> serviceId;

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=raw")
    private Optional<Boolean> raw;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private LocationInput location;

    @JsonCreator
    public PosLocationsUpdateRequest(
            String id,
            Optional<String> customerId,
            Optional<String> appId,
            Optional<String> serviceId,
            Optional<Boolean> raw,
            LocationInput location) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(customerId, "customerId");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(serviceId, "serviceId");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(location, "location");
        this.id = id;
        this.customerId = customerId;
        this.appId = appId;
        this.serviceId = serviceId;
        this.raw = raw;
        this.location = location;
    }
    
    public PosLocationsUpdateRequest(
            String id,
            LocationInput location) {
        this(id, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), location);
    }

    /**
     * ID of the record you are acting upon.
     */
    @JsonIgnore
    public String id() {
        return id;
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
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    @JsonIgnore
    public Optional<String> serviceId() {
        return serviceId;
    }

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    @JsonIgnore
    public Optional<Boolean> raw() {
        return raw;
    }

    @JsonIgnore
    public LocationInput location() {
        return location;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the record you are acting upon.
     */
    public PosLocationsUpdateRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public PosLocationsUpdateRequest withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = Optional.ofNullable(customerId);
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public PosLocationsUpdateRequest withCustomerId(Optional<String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public PosLocationsUpdateRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public PosLocationsUpdateRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public PosLocationsUpdateRequest withServiceId(String serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = Optional.ofNullable(serviceId);
        return this;
    }

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public PosLocationsUpdateRequest withServiceId(Optional<String> serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public PosLocationsUpdateRequest withRaw(boolean raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public PosLocationsUpdateRequest withRaw(Optional<Boolean> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public PosLocationsUpdateRequest withLocation(LocationInput location) {
        Utils.checkNotNull(location, "location");
        this.location = location;
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
        PosLocationsUpdateRequest other = (PosLocationsUpdateRequest) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.customerId, other.customerId) &&
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.serviceId, other.serviceId) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.location, other.location);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            customerId,
            appId,
            serviceId,
            raw,
            location);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PosLocationsUpdateRequest.class,
                "id", id,
                "customerId", customerId,
                "appId", appId,
                "serviceId", serviceId,
                "raw", raw,
                "location", location);
    }
    
    public final static class Builder {
 
        private String id;
 
        private Optional<String> customerId = Optional.empty();
 
        private Optional<String> appId = Optional.empty();
 
        private Optional<String> serviceId = Optional.empty();
 
        private Optional<Boolean> raw;
 
        private LocationInput location;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID of the record you are acting upon.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
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

        public Builder location(LocationInput location) {
            Utils.checkNotNull(location, "location");
            this.location = location;
            return this;
        }
        
        public PosLocationsUpdateRequest build() {
            if (raw == null) {
                raw = _SINGLETON_VALUE_Raw.value();
            }            return new PosLocationsUpdateRequest(
                id,
                customerId,
                appId,
                serviceId,
                raw,
                location);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_Raw =
                new LazySingletonValue<>(
                        "raw",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});
    }
}
