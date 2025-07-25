/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.models.components.UpdateWebhookRequest;
import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.util.Optional;


public class WebhookWebhooksUpdateRequest {
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


    @SpeakeasyMetadata("request:mediaType=application/json")
    private UpdateWebhookRequest updateWebhookRequest;

    @JsonCreator
    public WebhookWebhooksUpdateRequest(
            String id,
            Optional<String> appId,
            UpdateWebhookRequest updateWebhookRequest) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(updateWebhookRequest, "updateWebhookRequest");
        this.id = id;
        this.appId = appId;
        this.updateWebhookRequest = updateWebhookRequest;
    }
    
    public WebhookWebhooksUpdateRequest(
            String id,
            UpdateWebhookRequest updateWebhookRequest) {
        this(id, Optional.empty(), updateWebhookRequest);
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

    @JsonIgnore
    public UpdateWebhookRequest updateWebhookRequest() {
        return updateWebhookRequest;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * JWT Webhook token that represents the unifiedApi and applicationId associated to the event source.
     */
    public WebhookWebhooksUpdateRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public WebhookWebhooksUpdateRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }


    /**
     * The ID of your Unify application
     */
    public WebhookWebhooksUpdateRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public WebhookWebhooksUpdateRequest withUpdateWebhookRequest(UpdateWebhookRequest updateWebhookRequest) {
        Utils.checkNotNull(updateWebhookRequest, "updateWebhookRequest");
        this.updateWebhookRequest = updateWebhookRequest;
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
        WebhookWebhooksUpdateRequest other = (WebhookWebhooksUpdateRequest) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.appId, other.appId) &&
            Utils.enhancedDeepEquals(this.updateWebhookRequest, other.updateWebhookRequest);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, appId, updateWebhookRequest);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WebhookWebhooksUpdateRequest.class,
                "id", id,
                "appId", appId,
                "updateWebhookRequest", updateWebhookRequest);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String id;

        private Optional<String> appId = Optional.empty();

        private UpdateWebhookRequest updateWebhookRequest;

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


        public Builder updateWebhookRequest(UpdateWebhookRequest updateWebhookRequest) {
            Utils.checkNotNull(updateWebhookRequest, "updateWebhookRequest");
            this.updateWebhookRequest = updateWebhookRequest;
            return this;
        }

        public WebhookWebhooksUpdateRequest build() {

            return new WebhookWebhooksUpdateRequest(
                id, appId, updateWebhookRequest);
        }

    }
}
