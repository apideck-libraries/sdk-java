/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;

import com.apideck.unify.models.components.ApisFilter;
import com.apideck.unify.utils.LazySingletonValue;
import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Long;
import java.lang.String;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class ConnectorApisAllRequestBuilder {

    private Optional<String> appId = Optional.empty();
    private JsonNullable<String> cursor = JsonNullable.undefined();
    private Optional<Long> limit = Utils.readDefaultOrConstValue(
                            "limit",
                            "20",
                            new TypeReference<Optional<Long>>() {});
    private Optional<? extends ApisFilter> filter = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallConnectorApisAll sdk;

    public ConnectorApisAllRequestBuilder(SDKMethodInterfaces.MethodCallConnectorApisAll sdk) {
        this.sdk = sdk;
    }
                
    public ConnectorApisAllRequestBuilder appId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.of(appId);
        return this;
    }

    public ConnectorApisAllRequestBuilder appId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public ConnectorApisAllRequestBuilder cursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = JsonNullable.of(cursor);
        return this;
    }

    public ConnectorApisAllRequestBuilder cursor(JsonNullable<String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }
                
    public ConnectorApisAllRequestBuilder limit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.of(limit);
        return this;
    }

    public ConnectorApisAllRequestBuilder limit(Optional<Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }
                
    public ConnectorApisAllRequestBuilder filter(ApisFilter filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.of(filter);
        return this;
    }

    public ConnectorApisAllRequestBuilder filter(Optional<? extends ApisFilter> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }
                
    public ConnectorApisAllRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public ConnectorApisAllRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public ConnectorApisAllResponse call() throws Exception {
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
