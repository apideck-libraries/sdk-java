/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;

import com.apideck.unify.models.components.CreateWebhookRequest;
import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class WebhookWebhooksAddRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private CreateWebhookRequest createWebhookRequest;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallWebhookWebhooksAdd sdk;

    public WebhookWebhooksAddRequestBuilder(SDKMethodInterfaces.MethodCallWebhookWebhooksAdd sdk) {
        this.sdk = sdk;
    }
                
    public WebhookWebhooksAddRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public WebhookWebhooksAddRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public WebhookWebhooksAddRequestBuilder createWebhookRequest(CreateWebhookRequest createWebhookRequest) {
        Utils.checkNotNull(createWebhookRequest, "createWebhookRequest");
        this.createWebhookRequest = createWebhookRequest;
        return this;
    }
                
    public WebhookWebhooksAddRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public WebhookWebhooksAddRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public WebhookWebhooksAddResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.create(
            appId,
            createWebhookRequest,
            options);
    }
}
