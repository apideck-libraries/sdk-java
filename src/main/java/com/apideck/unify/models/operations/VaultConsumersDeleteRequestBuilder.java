/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import static com.apideck.unify.operations.Operations.RequestOperation;

import com.apideck.unify.SDKConfiguration;
import com.apideck.unify.operations.VaultConsumersDeleteOperation;
import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class VaultConsumersDeleteRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private String consumerId;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public VaultConsumersDeleteRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }
                
    public VaultConsumersDeleteRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public VaultConsumersDeleteRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public VaultConsumersDeleteRequestBuilder consumerId(String consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = consumerId;
        return this;
    }
                
    public VaultConsumersDeleteRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public VaultConsumersDeleteRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }


    private VaultConsumersDeleteRequest buildRequest() {

        VaultConsumersDeleteRequest request = new VaultConsumersDeleteRequest(appId,
            consumerId);

        return request;
    }

    public VaultConsumersDeleteResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<VaultConsumersDeleteRequest, VaultConsumersDeleteResponse> operation
              = new VaultConsumersDeleteOperation(sdkConfiguration, options);
        VaultConsumersDeleteRequest request = buildRequest();

        return operation.handleResponse(operation.doRequest(request));
    }
}
