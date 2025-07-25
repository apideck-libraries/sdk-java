/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import static com.apideck.unify.operations.Operations.RequestOperation;

import com.apideck.unify.SDKConfiguration;
import com.apideck.unify.operations.WebhookWebhooksOneOperation;
import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class WebhookWebhooksOneRequestBuilder {

    private String id;
    private Optional<String> appId = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public WebhookWebhooksOneRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public WebhookWebhooksOneRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }
                
    public WebhookWebhooksOneRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public WebhookWebhooksOneRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }
                
    public WebhookWebhooksOneRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public WebhookWebhooksOneRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }


    private WebhookWebhooksOneRequest buildRequest() {

        WebhookWebhooksOneRequest request = new WebhookWebhooksOneRequest(id,
            appId);

        return request;
    }

    public WebhookWebhooksOneResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<WebhookWebhooksOneRequest, WebhookWebhooksOneResponse> operation
              = new WebhookWebhooksOneOperation(sdkConfiguration, options);
        WebhookWebhooksOneRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
