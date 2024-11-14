/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;

import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class ConnectorApiResourceCoverageOneRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private String id;
    private String resourceId;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallConnectorApiResourceCoverageOne sdk;

    public ConnectorApiResourceCoverageOneRequestBuilder(SDKMethodInterfaces.MethodCallConnectorApiResourceCoverageOne sdk) {
        this.sdk = sdk;
    }
                
    public ConnectorApiResourceCoverageOneRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public ConnectorApiResourceCoverageOneRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public ConnectorApiResourceCoverageOneRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public ConnectorApiResourceCoverageOneRequestBuilder resourceId(String resourceId) {
        Utils.checkNotNull(resourceId, "resourceId");
        this.resourceId = resourceId;
        return this;
    }
                
    public ConnectorApiResourceCoverageOneRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ConnectorApiResourceCoverageOneRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public ConnectorApiResourceCoverageOneResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.get(
            appId,
            id,
            resourceId,
            options);
    }
}
