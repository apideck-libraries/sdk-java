/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;

import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.lang.Exception;
import java.util.Optional;

public class IssueTrackingCollectionTicketCommentsDeleteRequestBuilder {

    private IssueTrackingCollectionTicketCommentsDeleteRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallIssueTrackingCollectionTicketCommentsDelete sdk;

    public IssueTrackingCollectionTicketCommentsDeleteRequestBuilder(SDKMethodInterfaces.MethodCallIssueTrackingCollectionTicketCommentsDelete sdk) {
        this.sdk = sdk;
    }

    public IssueTrackingCollectionTicketCommentsDeleteRequestBuilder request(IssueTrackingCollectionTicketCommentsDeleteRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public IssueTrackingCollectionTicketCommentsDeleteRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public IssueTrackingCollectionTicketCommentsDeleteRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public IssueTrackingCollectionTicketCommentsDeleteResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.delete(
            request,
            options);
    }
}
