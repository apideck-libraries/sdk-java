/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.models.components.InvoiceItemsFilter;
import com.apideck.unify.models.components.InvoiceItemsSort;
import com.apideck.unify.utils.LazySingletonValue;
import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class AccountingInvoiceItemsAllRequest {
    /**
     * Include raw response. Mostly used for debugging purposes
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=raw")
    private Optional<Boolean> raw;

    /**
     * ID of the consumer which you want to get or push data from
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-consumer-id")
    private Optional<String> consumerId;

    /**
     * The ID of your Unify application
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-app-id")
    private Optional<String> appId;

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-service-id")
    private Optional<String> serviceId;

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

    /**
     * Apply filters
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=filter")
    private Optional<? extends InvoiceItemsFilter> filter;

    /**
     * Apply sorting
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=sort")
    private Optional<? extends InvoiceItemsSort> sort;

    /**
     * Optional unmapped key/values that will be passed through to downstream as query parameters. Ie: ?pass_through[search]=leads becomes ?search=leads
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=pass_through")
    private Optional<? extends Map<String, Object>> passThrough;

    /**
     * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    private JsonNullable<String> fields;

    @JsonCreator
    public AccountingInvoiceItemsAllRequest(
            Optional<Boolean> raw,
            Optional<String> consumerId,
            Optional<String> appId,
            Optional<String> serviceId,
            JsonNullable<String> cursor,
            Optional<Long> limit,
            Optional<? extends InvoiceItemsFilter> filter,
            Optional<? extends InvoiceItemsSort> sort,
            Optional<? extends Map<String, Object>> passThrough,
            JsonNullable<String> fields) {
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(consumerId, "consumerId");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(serviceId, "serviceId");
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(sort, "sort");
        Utils.checkNotNull(passThrough, "passThrough");
        Utils.checkNotNull(fields, "fields");
        this.raw = raw;
        this.consumerId = consumerId;
        this.appId = appId;
        this.serviceId = serviceId;
        this.cursor = cursor;
        this.limit = limit;
        this.filter = filter;
        this.sort = sort;
        this.passThrough = passThrough;
        this.fields = fields;
    }
    
    public AccountingInvoiceItemsAllRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), JsonNullable.undefined(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            JsonNullable.undefined());
    }

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    @JsonIgnore
    public Optional<Boolean> raw() {
        return raw;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    @JsonIgnore
    public Optional<String> consumerId() {
        return consumerId;
    }

    /**
     * The ID of your Unify application
     */
    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    @JsonIgnore
    public Optional<String> serviceId() {
        return serviceId;
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

    /**
     * Apply filters
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<InvoiceItemsFilter> filter() {
        return (Optional<InvoiceItemsFilter>) filter;
    }

    /**
     * Apply sorting
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<InvoiceItemsSort> sort() {
        return (Optional<InvoiceItemsSort>) sort;
    }

    /**
     * Optional unmapped key/values that will be passed through to downstream as query parameters. Ie: ?pass_through[search]=leads becomes ?search=leads
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> passThrough() {
        return (Optional<Map<String, Object>>) passThrough;
    }

    /**
     * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
     */
    @JsonIgnore
    public JsonNullable<String> fields() {
        return fields;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public AccountingInvoiceItemsAllRequest withRaw(boolean raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }


    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public AccountingInvoiceItemsAllRequest withRaw(Optional<Boolean> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public AccountingInvoiceItemsAllRequest withConsumerId(String consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = Optional.ofNullable(consumerId);
        return this;
    }


    /**
     * ID of the consumer which you want to get or push data from
     */
    public AccountingInvoiceItemsAllRequest withConsumerId(Optional<String> consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = consumerId;
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public AccountingInvoiceItemsAllRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }


    /**
     * The ID of your Unify application
     */
    public AccountingInvoiceItemsAllRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public AccountingInvoiceItemsAllRequest withServiceId(String serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = Optional.ofNullable(serviceId);
        return this;
    }


    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public AccountingInvoiceItemsAllRequest withServiceId(Optional<String> serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Cursor to start from. You can find cursors for next/previous pages in the meta.cursors property of the response.
     */
    public AccountingInvoiceItemsAllRequest withCursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = JsonNullable.of(cursor);
        return this;
    }

    /**
     * Cursor to start from. You can find cursors for next/previous pages in the meta.cursors property of the response.
     */
    public AccountingInvoiceItemsAllRequest withCursor(JsonNullable<String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * Number of results to return. Minimum 1, Maximum 200, Default 20
     */
    public AccountingInvoiceItemsAllRequest withLimit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }


    /**
     * Number of results to return. Minimum 1, Maximum 200, Default 20
     */
    public AccountingInvoiceItemsAllRequest withLimit(Optional<Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    /**
     * Apply filters
     */
    public AccountingInvoiceItemsAllRequest withFilter(InvoiceItemsFilter filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }


    /**
     * Apply filters
     */
    public AccountingInvoiceItemsAllRequest withFilter(Optional<? extends InvoiceItemsFilter> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    /**
     * Apply sorting
     */
    public AccountingInvoiceItemsAllRequest withSort(InvoiceItemsSort sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.ofNullable(sort);
        return this;
    }


    /**
     * Apply sorting
     */
    public AccountingInvoiceItemsAllRequest withSort(Optional<? extends InvoiceItemsSort> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
        return this;
    }

    /**
     * Optional unmapped key/values that will be passed through to downstream as query parameters. Ie: ?pass_through[search]=leads becomes ?search=leads
     */
    public AccountingInvoiceItemsAllRequest withPassThrough(Map<String, Object> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }


    /**
     * Optional unmapped key/values that will be passed through to downstream as query parameters. Ie: ?pass_through[search]=leads becomes ?search=leads
     */
    public AccountingInvoiceItemsAllRequest withPassThrough(Optional<? extends Map<String, Object>> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = passThrough;
        return this;
    }

    /**
     * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
     */
    public AccountingInvoiceItemsAllRequest withFields(String fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = JsonNullable.of(fields);
        return this;
    }

    /**
     * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
     */
    public AccountingInvoiceItemsAllRequest withFields(JsonNullable<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
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
        AccountingInvoiceItemsAllRequest other = (AccountingInvoiceItemsAllRequest) o;
        return 
            Utils.enhancedDeepEquals(this.raw, other.raw) &&
            Utils.enhancedDeepEquals(this.consumerId, other.consumerId) &&
            Utils.enhancedDeepEquals(this.appId, other.appId) &&
            Utils.enhancedDeepEquals(this.serviceId, other.serviceId) &&
            Utils.enhancedDeepEquals(this.cursor, other.cursor) &&
            Utils.enhancedDeepEquals(this.limit, other.limit) &&
            Utils.enhancedDeepEquals(this.filter, other.filter) &&
            Utils.enhancedDeepEquals(this.sort, other.sort) &&
            Utils.enhancedDeepEquals(this.passThrough, other.passThrough) &&
            Utils.enhancedDeepEquals(this.fields, other.fields);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            raw, consumerId, appId,
            serviceId, cursor, limit,
            filter, sort, passThrough,
            fields);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingInvoiceItemsAllRequest.class,
                "raw", raw,
                "consumerId", consumerId,
                "appId", appId,
                "serviceId", serviceId,
                "cursor", cursor,
                "limit", limit,
                "filter", filter,
                "sort", sort,
                "passThrough", passThrough,
                "fields", fields);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<Boolean> raw;

        private Optional<String> consumerId = Optional.empty();

        private Optional<String> appId = Optional.empty();

        private Optional<String> serviceId = Optional.empty();

        private JsonNullable<String> cursor = JsonNullable.undefined();

        private Optional<Long> limit;

        private Optional<? extends InvoiceItemsFilter> filter = Optional.empty();

        private Optional<? extends InvoiceItemsSort> sort = Optional.empty();

        private Optional<? extends Map<String, Object>> passThrough = Optional.empty();

        private JsonNullable<String> fields = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Include raw response. Mostly used for debugging purposes
         */
        public Builder raw(boolean raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        /**
         * Include raw response. Mostly used for debugging purposes
         */
        public Builder raw(Optional<Boolean> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }


        /**
         * ID of the consumer which you want to get or push data from
         */
        public Builder consumerId(String consumerId) {
            Utils.checkNotNull(consumerId, "consumerId");
            this.consumerId = Optional.ofNullable(consumerId);
            return this;
        }

        /**
         * ID of the consumer which you want to get or push data from
         */
        public Builder consumerId(Optional<String> consumerId) {
            Utils.checkNotNull(consumerId, "consumerId");
            this.consumerId = consumerId;
            return this;
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
         * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
         */
        public Builder serviceId(String serviceId) {
            Utils.checkNotNull(serviceId, "serviceId");
            this.serviceId = Optional.ofNullable(serviceId);
            return this;
        }

        /**
         * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
         */
        public Builder serviceId(Optional<String> serviceId) {
            Utils.checkNotNull(serviceId, "serviceId");
            this.serviceId = serviceId;
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


        /**
         * Apply filters
         */
        public Builder filter(InvoiceItemsFilter filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        /**
         * Apply filters
         */
        public Builder filter(Optional<? extends InvoiceItemsFilter> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }


        /**
         * Apply sorting
         */
        public Builder sort(InvoiceItemsSort sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = Optional.ofNullable(sort);
            return this;
        }

        /**
         * Apply sorting
         */
        public Builder sort(Optional<? extends InvoiceItemsSort> sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = sort;
            return this;
        }


        /**
         * Optional unmapped key/values that will be passed through to downstream as query parameters. Ie: ?pass_through[search]=leads becomes ?search=leads
         */
        public Builder passThrough(Map<String, Object> passThrough) {
            Utils.checkNotNull(passThrough, "passThrough");
            this.passThrough = Optional.ofNullable(passThrough);
            return this;
        }

        /**
         * Optional unmapped key/values that will be passed through to downstream as query parameters. Ie: ?pass_through[search]=leads becomes ?search=leads
         */
        public Builder passThrough(Optional<? extends Map<String, Object>> passThrough) {
            Utils.checkNotNull(passThrough, "passThrough");
            this.passThrough = passThrough;
            return this;
        }


        /**
         * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
         */
        public Builder fields(String fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = JsonNullable.of(fields);
            return this;
        }

        /**
         * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
         */
        public Builder fields(JsonNullable<String> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = fields;
            return this;
        }

        public AccountingInvoiceItemsAllRequest build() {
            if (raw == null) {
                raw = _SINGLETON_VALUE_Raw.value();
            }
            if (limit == null) {
                limit = _SINGLETON_VALUE_Limit.value();
            }

            return new AccountingInvoiceItemsAllRequest(
                raw, consumerId, appId,
                serviceId, cursor, limit,
                filter, sort, passThrough,
                fields);
        }


        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_Raw =
                new LazySingletonValue<>(
                        "raw",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_Limit =
                new LazySingletonValue<>(
                        "limit",
                        "20",
                        new TypeReference<Optional<Long>>() {});
    }
}
