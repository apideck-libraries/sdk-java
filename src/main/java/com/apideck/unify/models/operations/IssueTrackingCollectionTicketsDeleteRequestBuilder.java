/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;

import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.util.Optional;

public class IssueTrackingCollectionTicketsDeleteRequestBuilder {

    private IssueTrackingCollectionTicketsDeleteRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallIssueTrackingCollectionTicketsDelete sdk;

    public IssueTrackingCollectionTicketsDeleteRequestBuilder(SDKMethodInterfaces.MethodCallIssueTrackingCollectionTicketsDelete sdk) {
        this.sdk = sdk;
    }

    public IssueTrackingCollectionTicketsDeleteRequestBuilder request(IssueTrackingCollectionTicketsDeleteRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public IssueTrackingCollectionTicketsDeleteRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public IssueTrackingCollectionTicketsDeleteRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public IssueTrackingCollectionTicketsDeleteResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.delete(
            request,
            options);
    }
}
