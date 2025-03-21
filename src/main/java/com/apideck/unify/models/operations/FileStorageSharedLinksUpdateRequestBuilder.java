/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;

import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.lang.Exception;
import java.util.Optional;

public class FileStorageSharedLinksUpdateRequestBuilder {

    private FileStorageSharedLinksUpdateRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallFileStorageSharedLinksUpdate sdk;

    public FileStorageSharedLinksUpdateRequestBuilder(SDKMethodInterfaces.MethodCallFileStorageSharedLinksUpdate sdk) {
        this.sdk = sdk;
    }

    public FileStorageSharedLinksUpdateRequestBuilder request(FileStorageSharedLinksUpdateRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public FileStorageSharedLinksUpdateRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public FileStorageSharedLinksUpdateRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public FileStorageSharedLinksUpdateResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.update(
            request,
            options);
    }
}
