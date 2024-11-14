/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;

import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.util.Optional;

public class CrmUsersUpdateRequestBuilder {

    private CrmUsersUpdateRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCrmUsersUpdate sdk;

    public CrmUsersUpdateRequestBuilder(SDKMethodInterfaces.MethodCallCrmUsersUpdate sdk) {
        this.sdk = sdk;
    }

    public CrmUsersUpdateRequestBuilder request(CrmUsersUpdateRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public CrmUsersUpdateRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public CrmUsersUpdateRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public CrmUsersUpdateResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.update(
            request,
            options);
    }
}