/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import static com.apideck.unify.operations.Operations.RequestOperation;

import com.apideck.unify.SDKConfiguration;
import com.apideck.unify.operations.FileStorageUploadSessionsOneOperation;
import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class FileStorageUploadSessionsOneRequestBuilder {

    private FileStorageUploadSessionsOneRequest request;
    private Optional<String> serverURL = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public FileStorageUploadSessionsOneRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public FileStorageUploadSessionsOneRequestBuilder request(FileStorageUploadSessionsOneRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public FileStorageUploadSessionsOneRequestBuilder serverURL(String serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = Optional.of(serverURL);
        return this;
    }

    public FileStorageUploadSessionsOneRequestBuilder serverURL(Optional<String> serverURL) {
        Utils.checkNotNull(serverURL, "serverURL");
        this.serverURL = serverURL;
        return this;
    }
                
    public FileStorageUploadSessionsOneRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public FileStorageUploadSessionsOneRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public FileStorageUploadSessionsOneResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<FileStorageUploadSessionsOneRequest, FileStorageUploadSessionsOneResponse> operation
              = new FileStorageUploadSessionsOneOperation(sdkConfiguration, serverURL, options);

        return operation.handleResponse(operation.doRequest(request));
    }
}
