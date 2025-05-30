/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.lang.Exception;
import java.util.Optional;

public class EcommerceStoresOneRequestBuilder {

    private EcommerceStoresOneRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallEcommerceStoresOne sdk;

    public EcommerceStoresOneRequestBuilder(SDKMethodInterfaces.MethodCallEcommerceStoresOne sdk) {
        this.sdk = sdk;
    }

    public EcommerceStoresOneRequestBuilder request(EcommerceStoresOneRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public EcommerceStoresOneRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public EcommerceStoresOneRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public EcommerceStoresOneResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.get(
            request,
            options);
    }
}
