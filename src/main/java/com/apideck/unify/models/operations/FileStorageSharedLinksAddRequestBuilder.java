/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import static com.apideck.unify.operations.Operations.RequestOperation;

import com.apideck.unify.SDKConfiguration;
import com.apideck.unify.operations.FileStorageSharedLinksAddOperation;
import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.lang.Exception;
import java.util.Optional;

public class FileStorageSharedLinksAddRequestBuilder {

    private FileStorageSharedLinksAddRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public FileStorageSharedLinksAddRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public FileStorageSharedLinksAddRequestBuilder request(FileStorageSharedLinksAddRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public FileStorageSharedLinksAddRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public FileStorageSharedLinksAddRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public FileStorageSharedLinksAddResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<FileStorageSharedLinksAddRequest, FileStorageSharedLinksAddResponse> operation
              = new FileStorageSharedLinksAddOperation(sdkConfiguration, options);

        return operation.handleResponse(operation.doRequest(request));
    }
}
