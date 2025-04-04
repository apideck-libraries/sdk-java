/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.lang.Exception;
import java.util.Optional;

public class FileStorageFilesExportRequestBuilder {

    private FileStorageFilesExportRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallFileStorageFilesExport sdk;

    public FileStorageFilesExportRequestBuilder(SDKMethodInterfaces.MethodCallFileStorageFilesExport sdk) {
        this.sdk = sdk;
    }

    public FileStorageFilesExportRequestBuilder request(FileStorageFilesExportRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public FileStorageFilesExportRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public FileStorageFilesExportRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public FileStorageFilesExportResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.export(
            request,
            options);
    }
}
