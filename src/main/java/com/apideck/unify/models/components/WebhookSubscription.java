/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;


import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class WebhookSubscription {

    /**
     * The ID of the downstream service
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("downstream_id")
    private Optional<String> downstreamId;

    /**
     * The list of Unify Events this connection is subscribed to
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unify_event_types")
    private Optional<? extends List<String>> unifyEventTypes;

    /**
     * The list of downstream Events this connection is subscribed to
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("downstream_event_types")
    private Optional<? extends List<String>> downstreamEventTypes;

    /**
     * The URL the downstream is sending to when the event is triggered
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("execute_url")
    private Optional<String> executeUrl;

    /**
     * The date and time the webhook subscription was created downstream
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<String> createdAt;

    @JsonCreator
    public WebhookSubscription(
            @JsonProperty("downstream_id") Optional<String> downstreamId,
            @JsonProperty("unify_event_types") Optional<? extends List<String>> unifyEventTypes,
            @JsonProperty("downstream_event_types") Optional<? extends List<String>> downstreamEventTypes,
            @JsonProperty("execute_url") Optional<String> executeUrl,
            @JsonProperty("created_at") Optional<String> createdAt) {
        Utils.checkNotNull(downstreamId, "downstreamId");
        Utils.checkNotNull(unifyEventTypes, "unifyEventTypes");
        Utils.checkNotNull(downstreamEventTypes, "downstreamEventTypes");
        Utils.checkNotNull(executeUrl, "executeUrl");
        Utils.checkNotNull(createdAt, "createdAt");
        this.downstreamId = downstreamId;
        this.unifyEventTypes = unifyEventTypes;
        this.downstreamEventTypes = downstreamEventTypes;
        this.executeUrl = executeUrl;
        this.createdAt = createdAt;
    }
    
    public WebhookSubscription() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The ID of the downstream service
     */
    @JsonIgnore
    public Optional<String> downstreamId() {
        return downstreamId;
    }

    /**
     * The list of Unify Events this connection is subscribed to
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> unifyEventTypes() {
        return (Optional<List<String>>) unifyEventTypes;
    }

    /**
     * The list of downstream Events this connection is subscribed to
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> downstreamEventTypes() {
        return (Optional<List<String>>) downstreamEventTypes;
    }

    /**
     * The URL the downstream is sending to when the event is triggered
     */
    @JsonIgnore
    public Optional<String> executeUrl() {
        return executeUrl;
    }

    /**
     * The date and time the webhook subscription was created downstream
     */
    @JsonIgnore
    public Optional<String> createdAt() {
        return createdAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the downstream service
     */
    public WebhookSubscription withDownstreamId(String downstreamId) {
        Utils.checkNotNull(downstreamId, "downstreamId");
        this.downstreamId = Optional.ofNullable(downstreamId);
        return this;
    }

    /**
     * The ID of the downstream service
     */
    public WebhookSubscription withDownstreamId(Optional<String> downstreamId) {
        Utils.checkNotNull(downstreamId, "downstreamId");
        this.downstreamId = downstreamId;
        return this;
    }

    /**
     * The list of Unify Events this connection is subscribed to
     */
    public WebhookSubscription withUnifyEventTypes(List<String> unifyEventTypes) {
        Utils.checkNotNull(unifyEventTypes, "unifyEventTypes");
        this.unifyEventTypes = Optional.ofNullable(unifyEventTypes);
        return this;
    }

    /**
     * The list of Unify Events this connection is subscribed to
     */
    public WebhookSubscription withUnifyEventTypes(Optional<? extends List<String>> unifyEventTypes) {
        Utils.checkNotNull(unifyEventTypes, "unifyEventTypes");
        this.unifyEventTypes = unifyEventTypes;
        return this;
    }

    /**
     * The list of downstream Events this connection is subscribed to
     */
    public WebhookSubscription withDownstreamEventTypes(List<String> downstreamEventTypes) {
        Utils.checkNotNull(downstreamEventTypes, "downstreamEventTypes");
        this.downstreamEventTypes = Optional.ofNullable(downstreamEventTypes);
        return this;
    }

    /**
     * The list of downstream Events this connection is subscribed to
     */
    public WebhookSubscription withDownstreamEventTypes(Optional<? extends List<String>> downstreamEventTypes) {
        Utils.checkNotNull(downstreamEventTypes, "downstreamEventTypes");
        this.downstreamEventTypes = downstreamEventTypes;
        return this;
    }

    /**
     * The URL the downstream is sending to when the event is triggered
     */
    public WebhookSubscription withExecuteUrl(String executeUrl) {
        Utils.checkNotNull(executeUrl, "executeUrl");
        this.executeUrl = Optional.ofNullable(executeUrl);
        return this;
    }

    /**
     * The URL the downstream is sending to when the event is triggered
     */
    public WebhookSubscription withExecuteUrl(Optional<String> executeUrl) {
        Utils.checkNotNull(executeUrl, "executeUrl");
        this.executeUrl = executeUrl;
        return this;
    }

    /**
     * The date and time the webhook subscription was created downstream
     */
    public WebhookSubscription withCreatedAt(String createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * The date and time the webhook subscription was created downstream
     */
    public WebhookSubscription withCreatedAt(Optional<String> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
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
        WebhookSubscription other = (WebhookSubscription) o;
        return 
            Objects.deepEquals(this.downstreamId, other.downstreamId) &&
            Objects.deepEquals(this.unifyEventTypes, other.unifyEventTypes) &&
            Objects.deepEquals(this.downstreamEventTypes, other.downstreamEventTypes) &&
            Objects.deepEquals(this.executeUrl, other.executeUrl) &&
            Objects.deepEquals(this.createdAt, other.createdAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            downstreamId,
            unifyEventTypes,
            downstreamEventTypes,
            executeUrl,
            createdAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WebhookSubscription.class,
                "downstreamId", downstreamId,
                "unifyEventTypes", unifyEventTypes,
                "downstreamEventTypes", downstreamEventTypes,
                "executeUrl", executeUrl,
                "createdAt", createdAt);
    }
    
    public final static class Builder {
 
        private Optional<String> downstreamId = Optional.empty();
 
        private Optional<? extends List<String>> unifyEventTypes = Optional.empty();
 
        private Optional<? extends List<String>> downstreamEventTypes = Optional.empty();
 
        private Optional<String> executeUrl = Optional.empty();
 
        private Optional<String> createdAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the downstream service
         */
        public Builder downstreamId(String downstreamId) {
            Utils.checkNotNull(downstreamId, "downstreamId");
            this.downstreamId = Optional.ofNullable(downstreamId);
            return this;
        }

        /**
         * The ID of the downstream service
         */
        public Builder downstreamId(Optional<String> downstreamId) {
            Utils.checkNotNull(downstreamId, "downstreamId");
            this.downstreamId = downstreamId;
            return this;
        }

        /**
         * The list of Unify Events this connection is subscribed to
         */
        public Builder unifyEventTypes(List<String> unifyEventTypes) {
            Utils.checkNotNull(unifyEventTypes, "unifyEventTypes");
            this.unifyEventTypes = Optional.ofNullable(unifyEventTypes);
            return this;
        }

        /**
         * The list of Unify Events this connection is subscribed to
         */
        public Builder unifyEventTypes(Optional<? extends List<String>> unifyEventTypes) {
            Utils.checkNotNull(unifyEventTypes, "unifyEventTypes");
            this.unifyEventTypes = unifyEventTypes;
            return this;
        }

        /**
         * The list of downstream Events this connection is subscribed to
         */
        public Builder downstreamEventTypes(List<String> downstreamEventTypes) {
            Utils.checkNotNull(downstreamEventTypes, "downstreamEventTypes");
            this.downstreamEventTypes = Optional.ofNullable(downstreamEventTypes);
            return this;
        }

        /**
         * The list of downstream Events this connection is subscribed to
         */
        public Builder downstreamEventTypes(Optional<? extends List<String>> downstreamEventTypes) {
            Utils.checkNotNull(downstreamEventTypes, "downstreamEventTypes");
            this.downstreamEventTypes = downstreamEventTypes;
            return this;
        }

        /**
         * The URL the downstream is sending to when the event is triggered
         */
        public Builder executeUrl(String executeUrl) {
            Utils.checkNotNull(executeUrl, "executeUrl");
            this.executeUrl = Optional.ofNullable(executeUrl);
            return this;
        }

        /**
         * The URL the downstream is sending to when the event is triggered
         */
        public Builder executeUrl(Optional<String> executeUrl) {
            Utils.checkNotNull(executeUrl, "executeUrl");
            this.executeUrl = executeUrl;
            return this;
        }

        /**
         * The date and time the webhook subscription was created downstream
         */
        public Builder createdAt(String createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        /**
         * The date and time the webhook subscription was created downstream
         */
        public Builder createdAt(Optional<String> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }
        
        public WebhookSubscription build() {
            return new WebhookSubscription(
                downstreamId,
                unifyEventTypes,
                downstreamEventTypes,
                executeUrl,
                createdAt);
        }
    }
}

