/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;


import com.apideck.unify.models.components.CollectionTicketCommentInput;
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


public class IssueTrackingCollectionTicketCommentsAddRequest {

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
     * The collection ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=collection_id")
    private String collectionId;

    /**
     * ID of the ticket you are acting upon.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ticket_id")
    private String ticketId;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private CollectionTicketCommentInput collectionTicketComment;

    @JsonCreator
    public IssueTrackingCollectionTicketCommentsAddRequest(
            Optional<Boolean> raw,
            Optional<String> consumerId,
            Optional<String> appId,
            Optional<String> serviceId,
            String collectionId,
            String ticketId,
            CollectionTicketCommentInput collectionTicketComment) {
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(consumerId, "consumerId");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(serviceId, "serviceId");
        Utils.checkNotNull(collectionId, "collectionId");
        Utils.checkNotNull(ticketId, "ticketId");
        Utils.checkNotNull(collectionTicketComment, "collectionTicketComment");
        this.raw = raw;
        this.consumerId = consumerId;
        this.appId = appId;
        this.serviceId = serviceId;
        this.collectionId = collectionId;
        this.ticketId = ticketId;
        this.collectionTicketComment = collectionTicketComment;
    }
    
    public IssueTrackingCollectionTicketCommentsAddRequest(
            String collectionId,
            String ticketId,
            CollectionTicketCommentInput collectionTicketComment) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), collectionId, ticketId, collectionTicketComment);
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
     * The collection ID
     */
    @JsonIgnore
    public String collectionId() {
        return collectionId;
    }

    /**
     * ID of the ticket you are acting upon.
     */
    @JsonIgnore
    public String ticketId() {
        return ticketId;
    }

    @JsonIgnore
    public CollectionTicketCommentInput collectionTicketComment() {
        return collectionTicketComment;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public IssueTrackingCollectionTicketCommentsAddRequest withRaw(boolean raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public IssueTrackingCollectionTicketCommentsAddRequest withRaw(Optional<Boolean> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public IssueTrackingCollectionTicketCommentsAddRequest withConsumerId(String consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = Optional.ofNullable(consumerId);
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public IssueTrackingCollectionTicketCommentsAddRequest withConsumerId(Optional<String> consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = consumerId;
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public IssueTrackingCollectionTicketCommentsAddRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public IssueTrackingCollectionTicketCommentsAddRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public IssueTrackingCollectionTicketCommentsAddRequest withServiceId(String serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = Optional.ofNullable(serviceId);
        return this;
    }

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public IssueTrackingCollectionTicketCommentsAddRequest withServiceId(Optional<String> serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = serviceId;
        return this;
    }

    /**
     * The collection ID
     */
    public IssueTrackingCollectionTicketCommentsAddRequest withCollectionId(String collectionId) {
        Utils.checkNotNull(collectionId, "collectionId");
        this.collectionId = collectionId;
        return this;
    }

    /**
     * ID of the ticket you are acting upon.
     */
    public IssueTrackingCollectionTicketCommentsAddRequest withTicketId(String ticketId) {
        Utils.checkNotNull(ticketId, "ticketId");
        this.ticketId = ticketId;
        return this;
    }

    public IssueTrackingCollectionTicketCommentsAddRequest withCollectionTicketComment(CollectionTicketCommentInput collectionTicketComment) {
        Utils.checkNotNull(collectionTicketComment, "collectionTicketComment");
        this.collectionTicketComment = collectionTicketComment;
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
        IssueTrackingCollectionTicketCommentsAddRequest other = (IssueTrackingCollectionTicketCommentsAddRequest) o;
        return 
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.consumerId, other.consumerId) &&
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.serviceId, other.serviceId) &&
            Objects.deepEquals(this.collectionId, other.collectionId) &&
            Objects.deepEquals(this.ticketId, other.ticketId) &&
            Objects.deepEquals(this.collectionTicketComment, other.collectionTicketComment);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            raw,
            consumerId,
            appId,
            serviceId,
            collectionId,
            ticketId,
            collectionTicketComment);
    }
    
    @Override
    public String toString() {
        return Utils.toString(IssueTrackingCollectionTicketCommentsAddRequest.class,
                "raw", raw,
                "consumerId", consumerId,
                "appId", appId,
                "serviceId", serviceId,
                "collectionId", collectionId,
                "ticketId", ticketId,
                "collectionTicketComment", collectionTicketComment);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> raw;
 
        private Optional<String> consumerId = Optional.empty();
 
        private Optional<String> appId = Optional.empty();
 
        private Optional<String> serviceId = Optional.empty();
 
        private String collectionId;
 
        private String ticketId;
 
        private CollectionTicketCommentInput collectionTicketComment;  
        
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
         * The collection ID
         */
        public Builder collectionId(String collectionId) {
            Utils.checkNotNull(collectionId, "collectionId");
            this.collectionId = collectionId;
            return this;
        }

        /**
         * ID of the ticket you are acting upon.
         */
        public Builder ticketId(String ticketId) {
            Utils.checkNotNull(ticketId, "ticketId");
            this.ticketId = ticketId;
            return this;
        }

        public Builder collectionTicketComment(CollectionTicketCommentInput collectionTicketComment) {
            Utils.checkNotNull(collectionTicketComment, "collectionTicketComment");
            this.collectionTicketComment = collectionTicketComment;
            return this;
        }
        
        public IssueTrackingCollectionTicketCommentsAddRequest build() {
            if (raw == null) {
                raw = _SINGLETON_VALUE_Raw.value();
            }            return new IssueTrackingCollectionTicketCommentsAddRequest(
                raw,
                consumerId,
                appId,
                serviceId,
                collectionId,
                ticketId,
                collectionTicketComment);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_Raw =
                new LazySingletonValue<>(
                        "raw",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});
    }
}

