/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;

import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class VaultConsumerRequestCountsAllRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private String consumerId;
    private String startDatetime;
    private String endDatetime;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallVaultConsumerRequestCountsAll sdk;

    public VaultConsumerRequestCountsAllRequestBuilder(SDKMethodInterfaces.MethodCallVaultConsumerRequestCountsAll sdk) {
        this.sdk = sdk;
    }
                
    public VaultConsumerRequestCountsAllRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public VaultConsumerRequestCountsAllRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public VaultConsumerRequestCountsAllRequestBuilder consumerId(String consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = consumerId;
        return this;
    }

    public VaultConsumerRequestCountsAllRequestBuilder startDatetime(String startDatetime) {
        Utils.checkNotNull(startDatetime, "startDatetime");
        this.startDatetime = startDatetime;
        return this;
    }

    public VaultConsumerRequestCountsAllRequestBuilder endDatetime(String endDatetime) {
        Utils.checkNotNull(endDatetime, "endDatetime");
        this.endDatetime = endDatetime;
        return this;
    }
                
    public VaultConsumerRequestCountsAllRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public VaultConsumerRequestCountsAllRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public VaultConsumerRequestCountsAllResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.list(
            appId,
            consumerId,
            startDatetime,
            endDatetime,
            options);
    }
}
