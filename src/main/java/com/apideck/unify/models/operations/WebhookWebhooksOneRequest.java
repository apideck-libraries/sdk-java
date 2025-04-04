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

public class WebhookWebhooksOneRequest {

    /**
     * JWT Webhook token that represents the unifiedApi and applicationId associated to the event source.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * The ID of your Unify application
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-app-id")
    private Optional<String> appId;

    @JsonCreator
    public WebhookWebhooksOneRequest(
            String id,
            Optional<String> appId) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(appId, "appId");
        this.id = id;
        this.appId = appId;
    }
    
    public WebhookWebhooksOneRequest(
            String id) {
        this(id, Optional.empty());
    }

    /**
     * JWT Webhook token that represents the unifiedApi and applicationId associated to the event source.
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * The ID of your Unify application
     */
    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * JWT Webhook token that represents the unifiedApi and applicationId associated to the event source.
     */
    public WebhookWebhooksOneRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public WebhookWebhooksOneRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public WebhookWebhooksOneRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
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
        WebhookWebhooksOneRequest other = (WebhookWebhooksOneRequest) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.appId, other.appId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            appId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WebhookWebhooksOneRequest.class,
                "id", id,
                "appId", appId);
    }
    
    public final static class Builder {
 
        private String id;
 
        private Optional<String> appId = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * JWT Webhook token that represents the unifiedApi and applicationId associated to the event source.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
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
        
        public WebhookWebhooksOneRequest build() {
            return new WebhookWebhooksOneRequest(
                id,
                appId);
        }
    }
}
