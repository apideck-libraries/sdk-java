/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;

import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.util.Optional;

public class IssueTrackingCollectionsOneRequestBuilder {

    private IssueTrackingCollectionsOneRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallIssueTrackingCollectionsOne sdk;

    public IssueTrackingCollectionsOneRequestBuilder(SDKMethodInterfaces.MethodCallIssueTrackingCollectionsOne sdk) {
        this.sdk = sdk;
    }

    public IssueTrackingCollectionsOneRequestBuilder request(IssueTrackingCollectionsOneRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public IssueTrackingCollectionsOneRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public IssueTrackingCollectionsOneRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public IssueTrackingCollectionsOneResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.get(
            request,
            options);
    }
}