/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import static com.apideck.unify.operations.Operations.RequestOperation;

import com.apideck.unify.SDKConfiguration;
import com.apideck.unify.models.components.UpdateWebhookRequest;
import com.apideck.unify.operations.WebhookWebhooksUpdateOperation;
import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class WebhookWebhooksUpdateRequestBuilder {

    private String id;
    private Optional<String> appId = Optional.empty();
    private UpdateWebhookRequest updateWebhookRequest;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public WebhookWebhooksUpdateRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public WebhookWebhooksUpdateRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }
                
    public WebhookWebhooksUpdateRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public WebhookWebhooksUpdateRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public WebhookWebhooksUpdateRequestBuilder updateWebhookRequest(UpdateWebhookRequest updateWebhookRequest) {
        Utils.checkNotNull(updateWebhookRequest, "updateWebhookRequest");
        this.updateWebhookRequest = updateWebhookRequest;
        return this;
    }
                
    public WebhookWebhooksUpdateRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public WebhookWebhooksUpdateRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }


    private WebhookWebhooksUpdateRequest buildRequest() {

        WebhookWebhooksUpdateRequest request = new WebhookWebhooksUpdateRequest(id,
            appId,
            updateWebhookRequest);

        return request;
    }

    public WebhookWebhooksUpdateResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<WebhookWebhooksUpdateRequest, WebhookWebhooksUpdateResponse> operation
              = new WebhookWebhooksUpdateOperation(sdkConfiguration, options);
        WebhookWebhooksUpdateRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
