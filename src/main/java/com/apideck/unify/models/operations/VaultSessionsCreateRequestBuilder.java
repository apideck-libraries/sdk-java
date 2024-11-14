/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;

import com.apideck.unify.models.components.Session;
import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class VaultSessionsCreateRequestBuilder {

    private Optional<String> customerId = Optional.empty();
    private Optional<String> appId = Optional.empty();
    private Optional<? extends Session> session = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallVaultSessionsCreate sdk;

    public VaultSessionsCreateRequestBuilder(SDKMethodInterfaces.MethodCallVaultSessionsCreate sdk) {
        this.sdk = sdk;
    }
                
    public VaultSessionsCreateRequestBuilder customerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = Optional.of(customerId);
        return this;
    }

    public VaultSessionsCreateRequestBuilder customerId(Optional<String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }
                
    public VaultSessionsCreateRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public VaultSessionsCreateRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }
                
    public VaultSessionsCreateRequestBuilder session(Session session) {
        Utils.checkNotNull(session, "session");
        this.session = Optional.of(session);
        return this;
    }

    public VaultSessionsCreateRequestBuilder session(Optional<? extends Session> session) {
        Utils.checkNotNull(session, "session");
        this.session = session;
        return this;
    }
                
    public VaultSessionsCreateRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public VaultSessionsCreateRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public VaultSessionsCreateResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.create(
            customerId,
            appId,
            session,
            options);
    }
}