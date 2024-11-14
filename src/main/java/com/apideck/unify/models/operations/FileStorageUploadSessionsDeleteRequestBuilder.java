/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;

import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.util.Optional;

public class FileStorageUploadSessionsDeleteRequestBuilder {

    private FileStorageUploadSessionsDeleteRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallFileStorageUploadSessionsDelete sdk;

    public FileStorageUploadSessionsDeleteRequestBuilder(SDKMethodInterfaces.MethodCallFileStorageUploadSessionsDelete sdk) {
        this.sdk = sdk;
    }

    public FileStorageUploadSessionsDeleteRequestBuilder request(FileStorageUploadSessionsDeleteRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public FileStorageUploadSessionsDeleteRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public FileStorageUploadSessionsDeleteRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public FileStorageUploadSessionsDeleteResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.delete(
            request,
            options);
    }
}
