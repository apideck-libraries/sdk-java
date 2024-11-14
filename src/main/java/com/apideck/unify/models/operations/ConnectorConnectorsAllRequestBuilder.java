/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;

import com.apideck.unify.models.components.ConnectorsFilter;
import com.apideck.unify.utils.LazySingletonValue;
import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Long;
import java.lang.String;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class ConnectorConnectorsAllRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private JsonNullable<String> cursor = JsonNullable.undefined();
    private Optional<Long> limit = Utils.readDefaultOrConstValue(
                            "limit",
                            "20",
                            new TypeReference<Optional<Long>>() {});
    private Optional<? extends ConnectorsFilter> filter = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallConnectorConnectorsAll sdk;

    public ConnectorConnectorsAllRequestBuilder(SDKMethodInterfaces.MethodCallConnectorConnectorsAll sdk) {
        this.sdk = sdk;
    }
                
    public ConnectorConnectorsAllRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public ConnectorConnectorsAllRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public ConnectorConnectorsAllRequestBuilder cursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = JsonNullable.of(cursor);
        return this;
    }

    public ConnectorConnectorsAllRequestBuilder cursor(JsonNullable<String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }
                
    public ConnectorConnectorsAllRequestBuilder limit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.of(limit);
        return this;
    }

    public ConnectorConnectorsAllRequestBuilder limit(Optional<Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }
                
    public ConnectorConnectorsAllRequestBuilder filter(ConnectorsFilter filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.of(filter);
        return this;
    }

    public ConnectorConnectorsAllRequestBuilder filter(Optional<? extends ConnectorsFilter> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }
                
    public ConnectorConnectorsAllRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ConnectorConnectorsAllRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public ConnectorConnectorsAllResponse call() throws Exception {
        if (limit == null) {
            limit = _SINGLETON_VALUE_Limit.value();
        }        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.list(
            appId,
            cursor,
            limit,
            filter,
            options);
    }

    private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_Limit =
            new LazySingletonValue<>(
                    "limit",
                    "20",
                    new TypeReference<Optional<Long>>() {});
}
