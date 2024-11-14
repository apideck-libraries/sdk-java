/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;


import com.apideck.unify.models.components.LogsFilter;
import com.apideck.unify.utils.LazySingletonValue;
import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class VaultLogsAllRequest {

    /**
     * The ID of your Unify application
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-app-id")
    private Optional<String> appId;

    /**
     * ID of the consumer which you want to get or push data from
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-consumer-id")
    private Optional<String> customerId;

    /**
     * Filter results
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=filter")
    private Optional<? extends LogsFilter> filter;

    /**
     * Cursor to start from. You can find cursors for next/previous pages in the meta.cursors property of the response.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    private JsonNullable<String> cursor;

    /**
     * Number of results to return. Minimum 1, Maximum 200, Default 20
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<Long> limit;

    @JsonCreator
    public VaultLogsAllRequest(
            Optional<String> appId,
            Optional<String> customerId,
            Optional<? extends LogsFilter> filter,
            JsonNullable<String> cursor,
            Optional<Long> limit) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(customerId, "customerId");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(limit, "limit");
        this.appId = appId;
        this.customerId = customerId;
        this.filter = filter;
        this.cursor = cursor;
        this.limit = limit;
    }
    
    public VaultLogsAllRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * The ID of your Unify application
     */
    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    @JsonIgnore
    public Optional<String> customerId() {
        return customerId;
    }

    /**
     * Filter results
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LogsFilter> filter() {
        return (Optional<LogsFilter>) filter;
    }

    /**
     * Cursor to start from. You can find cursors for next/previous pages in the meta.cursors property of the response.
     */
    @JsonIgnore
    public JsonNullable<String> cursor() {
        return cursor;
    }

    /**
     * Number of results to return. Minimum 1, Maximum 200, Default 20
     */
    @JsonIgnore
    public Optional<Long> limit() {
        return limit;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of your Unify application
     */
    public VaultLogsAllRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public VaultLogsAllRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public VaultLogsAllRequest withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = Optional.ofNullable(customerId);
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public VaultLogsAllRequest withCustomerId(Optional<String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }

    /**
     * Filter results
     */
    public VaultLogsAllRequest withFilter(LogsFilter filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    /**
     * Filter results
     */
    public VaultLogsAllRequest withFilter(Optional<? extends LogsFilter> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    /**
     * Cursor to start from. You can find cursors for next/previous pages in the meta.cursors property of the response.
     */
    public VaultLogsAllRequest withCursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = JsonNullable.of(cursor);
        return this;
    }

    /**
     * Cursor to start from. You can find cursors for next/previous pages in the meta.cursors property of the response.
     */
    public VaultLogsAllRequest withCursor(JsonNullable<String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * Number of results to return. Minimum 1, Maximum 200, Default 20
     */
    public VaultLogsAllRequest withLimit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    /**
     * Number of results to return. Minimum 1, Maximum 200, Default 20
     */
    public VaultLogsAllRequest withLimit(Optional<Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VaultLogsAllRequest other = (VaultLogsAllRequest) o;
        return 
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.customerId, other.customerId) &&
            Objects.deepEquals(this.filter, other.filter) &&
            Objects.deepEquals(this.cursor, other.cursor) &&
            Objects.deepEquals(this.limit, other.limit);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            appId,
            customerId,
            filter,
            cursor,
            limit);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VaultLogsAllRequest.class,
                "appId", appId,
                "customerId", customerId,
                "filter", filter,
                "cursor", cursor,
                "limit", limit);
    }
    
    public final static class Builder {
 
        private Optional<String> appId = Optional.empty();
 
        private Optional<String> customerId = Optional.empty();
 
        private Optional<? extends LogsFilter> filter = Optional.empty();
 
        private JsonNullable<String> cursor = JsonNullable.undefined();
 
        private Optional<Long> limit;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of your Unify application
         */
        public Builder appId(String appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = Optional.ofNullable(appId);
            return this;
        }

        /**
         * The ID of your Unify application
         */
        public Builder appId(Optional<String> appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = appId;
            return this;
        }

        /**
         * ID of the consumer which you want to get or push data from
         */
        public Builder customerId(String customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = Optional.ofNullable(customerId);
            return this;
        }

        /**
         * ID of the consumer which you want to get or push data from
         */
        public Builder customerId(Optional<String> customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = customerId;
            return this;
        }

        /**
         * Filter results
         */
        public Builder filter(LogsFilter filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        /**
         * Filter results
         */
        public Builder filter(Optional<? extends LogsFilter> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        /**
         * Cursor to start from. You can find cursors for next/previous pages in the meta.cursors property of the response.
         */
        public Builder cursor(String cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = JsonNullable.of(cursor);
            return this;
        }

        /**
         * Cursor to start from. You can find cursors for next/previous pages in the meta.cursors property of the response.
         */
        public Builder cursor(JsonNullable<String> cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
            return this;
        }

        /**
         * Number of results to return. Minimum 1, Maximum 200, Default 20
         */
        public Builder limit(long limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        /**
         * Number of results to return. Minimum 1, Maximum 200, Default 20
         */
        public Builder limit(Optional<Long> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }
        
        public VaultLogsAllRequest build() {
            if (limit == null) {
                limit = _SINGLETON_VALUE_Limit.value();
            }            return new VaultLogsAllRequest(
                appId,
                customerId,
                filter,
                cursor,
                limit);
        }

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_Limit =
                new LazySingletonValue<>(
                        "limit",
                        "20",
                        new TypeReference<Optional<Long>>() {});
    }
}

