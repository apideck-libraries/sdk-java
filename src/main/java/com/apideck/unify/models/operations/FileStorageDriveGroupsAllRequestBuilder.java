/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;

import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.util.Optional;

public class FileStorageDriveGroupsAllRequestBuilder {

    private FileStorageDriveGroupsAllRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallFileStorageDriveGroupsAll sdk;

    public FileStorageDriveGroupsAllRequestBuilder(SDKMethodInterfaces.MethodCallFileStorageDriveGroupsAll sdk) {
        this.sdk = sdk;
    }

    public FileStorageDriveGroupsAllRequestBuilder request(FileStorageDriveGroupsAllRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public FileStorageDriveGroupsAllRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public FileStorageDriveGroupsAllRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public FileStorageDriveGroupsAllResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.list(
            request,
            options);
    }
}