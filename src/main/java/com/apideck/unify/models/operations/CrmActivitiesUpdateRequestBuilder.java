/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.lang.Exception;
import java.util.Optional;

public class CrmActivitiesUpdateRequestBuilder {

    private CrmActivitiesUpdateRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCrmActivitiesUpdate sdk;

    public CrmActivitiesUpdateRequestBuilder(SDKMethodInterfaces.MethodCallCrmActivitiesUpdate sdk) {
        this.sdk = sdk;
    }

    public CrmActivitiesUpdateRequestBuilder request(CrmActivitiesUpdateRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public CrmActivitiesUpdateRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public CrmActivitiesUpdateRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public CrmActivitiesUpdateResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.update(
            request,
            options);
    }
}
