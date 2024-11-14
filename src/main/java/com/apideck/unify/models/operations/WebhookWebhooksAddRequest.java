/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;


import com.apideck.unify.models.components.CreateWebhookRequest;
import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class WebhookWebhooksAddRequest {

    /**
     * The ID of your Unify application
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-app-id")
    private Optional<String> appId;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private CreateWebhookRequest createWebhookRequest;

    @JsonCreator
    public WebhookWebhooksAddRequest(
            Optional<String> appId,
            CreateWebhookRequest createWebhookRequest) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(createWebhookRequest, "createWebhookRequest");
        this.appId = appId;
        this.createWebhookRequest = createWebhookRequest;
    }
    
    public WebhookWebhooksAddRequest(
            CreateWebhookRequest createWebhookRequest) {
        this(Optional.empty(), createWebhookRequest);
    }

    /**
     * The ID of your Unify application
     */
    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    @JsonIgnore
    public CreateWebhookRequest createWebhookRequest() {
        return createWebhookRequest;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of your Unify application
     */
    public WebhookWebhooksAddRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public WebhookWebhooksAddRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public WebhookWebhooksAddRequest withCreateWebhookRequest(CreateWebhookRequest createWebhookRequest) {
        Utils.checkNotNull(createWebhookRequest, "createWebhookRequest");
        this.createWebhookRequest = createWebhookRequest;
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
        WebhookWebhooksAddRequest other = (WebhookWebhooksAddRequest) o;
        return 
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.createWebhookRequest, other.createWebhookRequest);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            appId,
            createWebhookRequest);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WebhookWebhooksAddRequest.class,
                "appId", appId,
                "createWebhookRequest", createWebhookRequest);
    }
    
    public final static class Builder {
 
        private Optional<String> appId = Optional.empty();
 
        private CreateWebhookRequest createWebhookRequest;  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder createWebhookRequest(CreateWebhookRequest createWebhookRequest) {
            Utils.checkNotNull(createWebhookRequest, "createWebhookRequest");
            this.createWebhookRequest = createWebhookRequest;
            return this;
        }
        
        public WebhookWebhooksAddRequest build() {
            return new WebhookWebhooksAddRequest(
                appId,
                createWebhookRequest);
        }
    }
}

