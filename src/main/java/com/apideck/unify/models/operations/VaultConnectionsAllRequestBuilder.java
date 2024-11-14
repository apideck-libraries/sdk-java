/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;

import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;

public class VaultConnectionsAllRequestBuilder {

    private Optional<String> customerId = Optional.empty();
    private Optional<String> appId = Optional.empty();
    private Optional<String> api = Optional.empty();
    private Optional<Boolean> configured = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallVaultConnectionsAll sdk;

    public VaultConnectionsAllRequestBuilder(SDKMethodInterfaces.MethodCallVaultConnectionsAll sdk) {
        this.sdk = sdk;
    }
                
    public VaultConnectionsAllRequestBuilder customerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = Optional.of(customerId);
        return this;
    }

    public VaultConnectionsAllRequestBuilder customerId(Optional<String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }
                
    public VaultConnectionsAllRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public VaultConnectionsAllRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }
                
    public VaultConnectionsAllRequestBuilder api(String api) {
        Utils.checkNotNull(api, "api");
        this.api = Optional.of(api);
        return this;
    }

    public VaultConnectionsAllRequestBuilder api(Optional<String> api) {
        Utils.checkNotNull(api, "api");
        this.api = api;
        return this;
    }
                
    public VaultConnectionsAllRequestBuilder configured(boolean configured) {
        Utils.checkNotNull(configured, "configured");
        this.configured = Optional.of(configured);
        return this;
    }

    public VaultConnectionsAllRequestBuilder configured(Optional<Boolean> configured) {
        Utils.checkNotNull(configured, "configured");
        this.configured = configured;
        return this;
    }
                
    public VaultConnectionsAllRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public VaultConnectionsAllRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public VaultConnectionsAllResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.list(
            customerId,
            appId,
            api,
            configured,
            options);
    }
}