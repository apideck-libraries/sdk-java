/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.models.components.CreateUploadSessionRequest;
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


public class FileStorageUploadSessionsAddRequest {
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


    @SpeakeasyMetadata("request:mediaType=application/json")
    private CreateUploadSessionRequest createUploadSessionRequest;

    @JsonCreator
    public FileStorageUploadSessionsAddRequest(
            Optional<Boolean> raw,
            Optional<String> consumerId,
            Optional<String> appId,
            Optional<String> serviceId,
            CreateUploadSessionRequest createUploadSessionRequest) {
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(consumerId, "consumerId");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(serviceId, "serviceId");
        Utils.checkNotNull(createUploadSessionRequest, "createUploadSessionRequest");
        this.raw = raw;
        this.consumerId = consumerId;
        this.appId = appId;
        this.serviceId = serviceId;
        this.createUploadSessionRequest = createUploadSessionRequest;
    }
    
    public FileStorageUploadSessionsAddRequest(
            CreateUploadSessionRequest createUploadSessionRequest) {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), createUploadSessionRequest);
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

    @JsonIgnore
    public CreateUploadSessionRequest createUploadSessionRequest() {
        return createUploadSessionRequest;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public FileStorageUploadSessionsAddRequest withRaw(boolean raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }


    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public FileStorageUploadSessionsAddRequest withRaw(Optional<Boolean> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public FileStorageUploadSessionsAddRequest withConsumerId(String consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = Optional.ofNullable(consumerId);
        return this;
    }


    /**
     * ID of the consumer which you want to get or push data from
     */
    public FileStorageUploadSessionsAddRequest withConsumerId(Optional<String> consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = consumerId;
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public FileStorageUploadSessionsAddRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }


    /**
     * The ID of your Unify application
     */
    public FileStorageUploadSessionsAddRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public FileStorageUploadSessionsAddRequest withServiceId(String serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = Optional.ofNullable(serviceId);
        return this;
    }


    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public FileStorageUploadSessionsAddRequest withServiceId(Optional<String> serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = serviceId;
        return this;
    }

    public FileStorageUploadSessionsAddRequest withCreateUploadSessionRequest(CreateUploadSessionRequest createUploadSessionRequest) {
        Utils.checkNotNull(createUploadSessionRequest, "createUploadSessionRequest");
        this.createUploadSessionRequest = createUploadSessionRequest;
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
        FileStorageUploadSessionsAddRequest other = (FileStorageUploadSessionsAddRequest) o;
        return 
            Utils.enhancedDeepEquals(this.raw, other.raw) &&
            Utils.enhancedDeepEquals(this.consumerId, other.consumerId) &&
            Utils.enhancedDeepEquals(this.appId, other.appId) &&
            Utils.enhancedDeepEquals(this.serviceId, other.serviceId) &&
            Utils.enhancedDeepEquals(this.createUploadSessionRequest, other.createUploadSessionRequest);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            raw, consumerId, appId,
            serviceId, createUploadSessionRequest);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FileStorageUploadSessionsAddRequest.class,
                "raw", raw,
                "consumerId", consumerId,
                "appId", appId,
                "serviceId", serviceId,
                "createUploadSessionRequest", createUploadSessionRequest);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<Boolean> raw;

        private Optional<String> consumerId = Optional.empty();

        private Optional<String> appId = Optional.empty();

        private Optional<String> serviceId = Optional.empty();

        private CreateUploadSessionRequest createUploadSessionRequest;

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


        public Builder createUploadSessionRequest(CreateUploadSessionRequest createUploadSessionRequest) {
            Utils.checkNotNull(createUploadSessionRequest, "createUploadSessionRequest");
            this.createUploadSessionRequest = createUploadSessionRequest;
            return this;
        }

        public FileStorageUploadSessionsAddRequest build() {
            if (raw == null) {
                raw = _SINGLETON_VALUE_Raw.value();
            }

            return new FileStorageUploadSessionsAddRequest(
                raw, consumerId, appId,
                serviceId, createUploadSessionRequest);
        }


        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_Raw =
                new LazySingletonValue<>(
                        "raw",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});
    }
}
