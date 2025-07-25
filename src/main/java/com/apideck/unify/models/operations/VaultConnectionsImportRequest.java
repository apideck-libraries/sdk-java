/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.models.components.ConnectionImportData;
import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.util.Optional;


public class VaultConnectionsImportRequest {
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
     * Fields that need to be persisted on the resource
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private ConnectionImportData connectionImportData;

    @JsonCreator
    public VaultConnectionsImportRequest(
            Optional<String> consumerId,
            Optional<String> appId,
            String serviceId,
            String unifiedApi,
            ConnectionImportData connectionImportData) {
        Utils.checkNotNull(consumerId, "consumerId");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(serviceId, "serviceId");
        Utils.checkNotNull(unifiedApi, "unifiedApi");
        Utils.checkNotNull(connectionImportData, "connectionImportData");
        this.consumerId = consumerId;
        this.appId = appId;
        this.serviceId = serviceId;
        this.unifiedApi = unifiedApi;
        this.connectionImportData = connectionImportData;
    }
    
    public VaultConnectionsImportRequest(
            String serviceId,
            String unifiedApi,
            ConnectionImportData connectionImportData) {
        this(Optional.empty(), Optional.empty(), serviceId,
            unifiedApi, connectionImportData);
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
     * Fields that need to be persisted on the resource
     */
    @JsonIgnore
    public ConnectionImportData connectionImportData() {
        return connectionImportData;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * ID of the consumer which you want to get or push data from
     */
    public VaultConnectionsImportRequest withConsumerId(String consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = Optional.ofNullable(consumerId);
        return this;
    }


    /**
     * ID of the consumer which you want to get or push data from
     */
    public VaultConnectionsImportRequest withConsumerId(Optional<String> consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = consumerId;
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public VaultConnectionsImportRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }


    /**
     * The ID of your Unify application
     */
    public VaultConnectionsImportRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * Service ID of the resource to return
     */
    public VaultConnectionsImportRequest withServiceId(String serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Unified API
     */
    public VaultConnectionsImportRequest withUnifiedApi(String unifiedApi) {
        Utils.checkNotNull(unifiedApi, "unifiedApi");
        this.unifiedApi = unifiedApi;
        return this;
    }

    /**
     * Fields that need to be persisted on the resource
     */
    public VaultConnectionsImportRequest withConnectionImportData(ConnectionImportData connectionImportData) {
        Utils.checkNotNull(connectionImportData, "connectionImportData");
        this.connectionImportData = connectionImportData;
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
        VaultConnectionsImportRequest other = (VaultConnectionsImportRequest) o;
        return 
            Utils.enhancedDeepEquals(this.consumerId, other.consumerId) &&
            Utils.enhancedDeepEquals(this.appId, other.appId) &&
            Utils.enhancedDeepEquals(this.serviceId, other.serviceId) &&
            Utils.enhancedDeepEquals(this.unifiedApi, other.unifiedApi) &&
            Utils.enhancedDeepEquals(this.connectionImportData, other.connectionImportData);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            consumerId, appId, serviceId,
            unifiedApi, connectionImportData);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VaultConnectionsImportRequest.class,
                "consumerId", consumerId,
                "appId", appId,
                "serviceId", serviceId,
                "unifiedApi", unifiedApi,
                "connectionImportData", connectionImportData);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> consumerId = Optional.empty();

        private Optional<String> appId = Optional.empty();

        private String serviceId;

        private String unifiedApi;

        private ConnectionImportData connectionImportData;

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
         * Fields that need to be persisted on the resource
         */
        public Builder connectionImportData(ConnectionImportData connectionImportData) {
            Utils.checkNotNull(connectionImportData, "connectionImportData");
            this.connectionImportData = connectionImportData;
            return this;
        }

        public VaultConnectionsImportRequest build() {

            return new VaultConnectionsImportRequest(
                consumerId, appId, serviceId,
                unifiedApi, connectionImportData);
        }

    }
}
