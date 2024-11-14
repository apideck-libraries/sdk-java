/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;

import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.util.Optional;

public class CrmNotesDeleteRequestBuilder {

    private CrmNotesDeleteRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCrmNotesDelete sdk;

    public CrmNotesDeleteRequestBuilder(SDKMethodInterfaces.MethodCallCrmNotesDelete sdk) {
        this.sdk = sdk;
    }

    public CrmNotesDeleteRequestBuilder request(CrmNotesDeleteRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public CrmNotesDeleteRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public CrmNotesDeleteRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public CrmNotesDeleteResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.delete(
            request,
            options);
    }
}
