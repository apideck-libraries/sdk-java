/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.utils.LazySingletonValue;
import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Optional;


public class FileStorageUploadSessionsUploadRequest {
    /**
     * ID of the record you are acting upon.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

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
     * Part number of the file part being uploaded.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=part_number")
    private double partNumber;

    /**
     * The RFC3230 message digest of the uploaded part. Only required for the Box connector. More information on the Box API docs [here](https://developer.box.com/reference/put-files-upload-sessions-id/#param-digest)
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=digest")
    private Optional<String> digest;

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=raw")
    private Optional<Boolean> raw;


    @SpeakeasyMetadata("request:mediaType=*/*")
    private byte[] requestBody;

    @JsonCreator
    public FileStorageUploadSessionsUploadRequest(
            String id,
            Optional<String> consumerId,
            Optional<String> appId,
            Optional<String> serviceId,
            double partNumber,
            Optional<String> digest,
            Optional<Boolean> raw,
            byte[] requestBody) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(consumerId, "consumerId");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(serviceId, "serviceId");
        Utils.checkNotNull(partNumber, "partNumber");
        Utils.checkNotNull(digest, "digest");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(requestBody, "requestBody");
        this.id = id;
        this.consumerId = consumerId;
        this.appId = appId;
        this.serviceId = serviceId;
        this.partNumber = partNumber;
        this.digest = digest;
        this.raw = raw;
        this.requestBody = requestBody;
    }
    
    public FileStorageUploadSessionsUploadRequest(
            String id,
            double partNumber,
            byte[] requestBody) {
        this(id, Optional.empty(), Optional.empty(),
            Optional.empty(), partNumber, Optional.empty(),
            Optional.empty(), requestBody);
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
     * Part number of the file part being uploaded.
     */
    @JsonIgnore
    public double partNumber() {
        return partNumber;
    }

    /**
     * The RFC3230 message digest of the uploaded part. Only required for the Box connector. More information on the Box API docs [here](https://developer.box.com/reference/put-files-upload-sessions-id/#param-digest)
     */
    @JsonIgnore
    public Optional<String> digest() {
        return digest;
    }

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    @JsonIgnore
    public Optional<Boolean> raw() {
        return raw;
    }

    @JsonIgnore
    public byte[] requestBody() {
        return requestBody;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * ID of the record you are acting upon.
     */
    public FileStorageUploadSessionsUploadRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public FileStorageUploadSessionsUploadRequest withConsumerId(String consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = Optional.ofNullable(consumerId);
        return this;
    }


    /**
     * ID of the consumer which you want to get or push data from
     */
    public FileStorageUploadSessionsUploadRequest withConsumerId(Optional<String> consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = consumerId;
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public FileStorageUploadSessionsUploadRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }


    /**
     * The ID of your Unify application
     */
    public FileStorageUploadSessionsUploadRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public FileStorageUploadSessionsUploadRequest withServiceId(String serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = Optional.ofNullable(serviceId);
        return this;
    }


    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public FileStorageUploadSessionsUploadRequest withServiceId(Optional<String> serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Part number of the file part being uploaded.
     */
    public FileStorageUploadSessionsUploadRequest withPartNumber(double partNumber) {
        Utils.checkNotNull(partNumber, "partNumber");
        this.partNumber = partNumber;
        return this;
    }

    /**
     * The RFC3230 message digest of the uploaded part. Only required for the Box connector. More information on the Box API docs [here](https://developer.box.com/reference/put-files-upload-sessions-id/#param-digest)
     */
    public FileStorageUploadSessionsUploadRequest withDigest(String digest) {
        Utils.checkNotNull(digest, "digest");
        this.digest = Optional.ofNullable(digest);
        return this;
    }


    /**
     * The RFC3230 message digest of the uploaded part. Only required for the Box connector. More information on the Box API docs [here](https://developer.box.com/reference/put-files-upload-sessions-id/#param-digest)
     */
    public FileStorageUploadSessionsUploadRequest withDigest(Optional<String> digest) {
        Utils.checkNotNull(digest, "digest");
        this.digest = digest;
        return this;
    }

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public FileStorageUploadSessionsUploadRequest withRaw(boolean raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }


    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public FileStorageUploadSessionsUploadRequest withRaw(Optional<Boolean> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public FileStorageUploadSessionsUploadRequest withRequestBody(byte[] requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
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
        FileStorageUploadSessionsUploadRequest other = (FileStorageUploadSessionsUploadRequest) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.consumerId, other.consumerId) &&
            Utils.enhancedDeepEquals(this.appId, other.appId) &&
            Utils.enhancedDeepEquals(this.serviceId, other.serviceId) &&
            Utils.enhancedDeepEquals(this.partNumber, other.partNumber) &&
            Utils.enhancedDeepEquals(this.digest, other.digest) &&
            Utils.enhancedDeepEquals(this.raw, other.raw) &&
            Utils.enhancedDeepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, consumerId, appId,
            serviceId, partNumber, digest,
            raw, requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FileStorageUploadSessionsUploadRequest.class,
                "id", id,
                "consumerId", consumerId,
                "appId", appId,
                "serviceId", serviceId,
                "partNumber", partNumber,
                "digest", digest,
                "raw", raw,
                "requestBody", requestBody);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String id;

        private Optional<String> consumerId = Optional.empty();

        private Optional<String> appId = Optional.empty();

        private Optional<String> serviceId = Optional.empty();

        private Double partNumber;

        private Optional<String> digest = Optional.empty();

        private Optional<Boolean> raw;

        private byte[] requestBody;

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
         * Part number of the file part being uploaded.
         */
        public Builder partNumber(double partNumber) {
            Utils.checkNotNull(partNumber, "partNumber");
            this.partNumber = partNumber;
            return this;
        }


        /**
         * The RFC3230 message digest of the uploaded part. Only required for the Box connector. More information on the Box API docs [here](https://developer.box.com/reference/put-files-upload-sessions-id/#param-digest)
         */
        public Builder digest(String digest) {
            Utils.checkNotNull(digest, "digest");
            this.digest = Optional.ofNullable(digest);
            return this;
        }

        /**
         * The RFC3230 message digest of the uploaded part. Only required for the Box connector. More information on the Box API docs [here](https://developer.box.com/reference/put-files-upload-sessions-id/#param-digest)
         */
        public Builder digest(Optional<String> digest) {
            Utils.checkNotNull(digest, "digest");
            this.digest = digest;
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


        public Builder requestBody(byte[] requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }

        public FileStorageUploadSessionsUploadRequest build() {
            if (raw == null) {
                raw = _SINGLETON_VALUE_Raw.value();
            }

            return new FileStorageUploadSessionsUploadRequest(
                id, consumerId, appId,
                serviceId, partNumber, digest,
                raw, requestBody);
        }


        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_Raw =
                new LazySingletonValue<>(
                        "raw",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});
    }
}
