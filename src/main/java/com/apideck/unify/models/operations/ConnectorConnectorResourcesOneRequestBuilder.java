/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.models.components.UnifiedApiId;
import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class ConnectorConnectorResourcesOneRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private String id;
    private String resourceId;
    private Optional<? extends UnifiedApiId> unifiedApi = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallConnectorConnectorResourcesOne sdk;

    public ConnectorConnectorResourcesOneRequestBuilder(SDKMethodInterfaces.MethodCallConnectorConnectorResourcesOne sdk) {
        this.sdk = sdk;
    }
                
    public ConnectorConnectorResourcesOneRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public ConnectorConnectorResourcesOneRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public ConnectorConnectorResourcesOneRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public ConnectorConnectorResourcesOneRequestBuilder resourceId(String resourceId) {
        Utils.checkNotNull(resourceId, "resourceId");
        this.resourceId = resourceId;
        return this;
    }
                
    public ConnectorConnectorResourcesOneRequestBuilder unifiedApi(UnifiedApiId unifiedApi) {
        Utils.checkNotNull(unifiedApi, "unifiedApi");
        this.unifiedApi = Optional.of(unifiedApi);
        return this;
    }

    public ConnectorConnectorResourcesOneRequestBuilder unifiedApi(Optional<? extends UnifiedApiId> unifiedApi) {
        Utils.checkNotNull(unifiedApi, "unifiedApi");
        this.unifiedApi = unifiedApi;
        return this;
    }
                
    public ConnectorConnectorResourcesOneRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ConnectorConnectorResourcesOneRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public ConnectorConnectorResourcesOneResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.get(
            appId,
            id,
            resourceId,
            unifiedApi,
            options);
    }
}
