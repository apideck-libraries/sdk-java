/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;


import com.apideck.unify.models.components.FilesFilter;
import com.apideck.unify.models.components.FilesSearch;
import com.apideck.unify.utils.LazySingletonValue;
import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class FileStorageFilesSearchRequest {

    /**
     * ID of the consumer which you want to get or push data from
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-consumer-id")
    private Optional<String> customerId;

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
     * Optional unmapped key/values that will be passed through to downstream as query parameters. Ie: ?pass_through[search]=leads becomes ?search=leads
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=pass_through")
    private Optional<? extends Map<String, Object>> passThrough;

    /**
     * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    private JsonNullable<String> fields;

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
    private Optional<? extends FilesFilter> filter;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private FilesSearch filesSearch;

    @JsonCreator
    public FileStorageFilesSearchRequest(
            Optional<String> customerId,
            Optional<String> appId,
            Optional<String> serviceId,
            Optional<? extends Map<String, Object>> passThrough,
            JsonNullable<String> fields,
            JsonNullable<String> cursor,
            Optional<Long> limit,
            Optional<? extends FilesFilter> filter,
            FilesSearch filesSearch) {
        Utils.checkNotNull(customerId, "customerId");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(serviceId, "serviceId");
        Utils.checkNotNull(passThrough, "passThrough");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(filesSearch, "filesSearch");
        this.customerId = customerId;
        this.appId = appId;
        this.serviceId = serviceId;
        this.passThrough = passThrough;
        this.fields = fields;
        this.cursor = cursor;
        this.limit = limit;
        this.filter = filter;
        this.filesSearch = filesSearch;
    }
    
    public FileStorageFilesSearchRequest(
            FilesSearch filesSearch) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), filesSearch);
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    @JsonIgnore
    public Optional<String> customerId() {
        return customerId;
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
    public Optional<FilesFilter> filter() {
        return (Optional<FilesFilter>) filter;
    }

    @JsonIgnore
    public FilesSearch filesSearch() {
        return filesSearch;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public FileStorageFilesSearchRequest withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = Optional.ofNullable(customerId);
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public FileStorageFilesSearchRequest withCustomerId(Optional<String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public FileStorageFilesSearchRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public FileStorageFilesSearchRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public FileStorageFilesSearchRequest withServiceId(String serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = Optional.ofNullable(serviceId);
        return this;
    }

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public FileStorageFilesSearchRequest withServiceId(Optional<String> serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Optional unmapped key/values that will be passed through to downstream as query parameters. Ie: ?pass_through[search]=leads becomes ?search=leads
     */
    public FileStorageFilesSearchRequest withPassThrough(Map<String, Object> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }

    /**
     * Optional unmapped key/values that will be passed through to downstream as query parameters. Ie: ?pass_through[search]=leads becomes ?search=leads
     */
    public FileStorageFilesSearchRequest withPassThrough(Optional<? extends Map<String, Object>> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = passThrough;
        return this;
    }

    /**
     * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
     */
    public FileStorageFilesSearchRequest withFields(String fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = JsonNullable.of(fields);
        return this;
    }

    /**
     * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
     */
    public FileStorageFilesSearchRequest withFields(JsonNullable<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * Cursor to start from. You can find cursors for next/previous pages in the meta.cursors property of the response.
     */
    public FileStorageFilesSearchRequest withCursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = JsonNullable.of(cursor);
        return this;
    }

    /**
     * Cursor to start from. You can find cursors for next/previous pages in the meta.cursors property of the response.
     */
    public FileStorageFilesSearchRequest withCursor(JsonNullable<String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * Number of results to return. Minimum 1, Maximum 200, Default 20
     */
    public FileStorageFilesSearchRequest withLimit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    /**
     * Number of results to return. Minimum 1, Maximum 200, Default 20
     */
    public FileStorageFilesSearchRequest withLimit(Optional<Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    /**
     * Apply filters
     */
    public FileStorageFilesSearchRequest withFilter(FilesFilter filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    /**
     * Apply filters
     */
    public FileStorageFilesSearchRequest withFilter(Optional<? extends FilesFilter> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    public FileStorageFilesSearchRequest withFilesSearch(FilesSearch filesSearch) {
        Utils.checkNotNull(filesSearch, "filesSearch");
        this.filesSearch = filesSearch;
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
        FileStorageFilesSearchRequest other = (FileStorageFilesSearchRequest) o;
        return 
            Objects.deepEquals(this.customerId, other.customerId) &&
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.serviceId, other.serviceId) &&
            Objects.deepEquals(this.passThrough, other.passThrough) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.cursor, other.cursor) &&
            Objects.deepEquals(this.limit, other.limit) &&
            Objects.deepEquals(this.filter, other.filter) &&
            Objects.deepEquals(this.filesSearch, other.filesSearch);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            customerId,
            appId,
            serviceId,
            passThrough,
            fields,
            cursor,
            limit,
            filter,
            filesSearch);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FileStorageFilesSearchRequest.class,
                "customerId", customerId,
                "appId", appId,
                "serviceId", serviceId,
                "passThrough", passThrough,
                "fields", fields,
                "cursor", cursor,
                "limit", limit,
                "filter", filter,
                "filesSearch", filesSearch);
    }
    
    public final static class Builder {
 
        private Optional<String> customerId = Optional.empty();
 
        private Optional<String> appId = Optional.empty();
 
        private Optional<String> serviceId = Optional.empty();
 
        private Optional<? extends Map<String, Object>> passThrough = Optional.empty();
 
        private JsonNullable<String> fields = JsonNullable.undefined();
 
        private JsonNullable<String> cursor = JsonNullable.undefined();
 
        private Optional<Long> limit;
 
        private Optional<? extends FilesFilter> filter = Optional.empty();
 
        private FilesSearch filesSearch;  
        
        private Builder() {
          // force use of static builder() method
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
        public Builder filter(FilesFilter filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        /**
         * Apply filters
         */
        public Builder filter(Optional<? extends FilesFilter> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        public Builder filesSearch(FilesSearch filesSearch) {
            Utils.checkNotNull(filesSearch, "filesSearch");
            this.filesSearch = filesSearch;
            return this;
        }
        
        public FileStorageFilesSearchRequest build() {
            if (limit == null) {
                limit = _SINGLETON_VALUE_Limit.value();
            }            return new FileStorageFilesSearchRequest(
                customerId,
                appId,
                serviceId,
                passThrough,
                fields,
                cursor,
                limit,
                filter,
                filesSearch);
        }

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_Limit =
                new LazySingletonValue<>(
                        "limit",
                        "20",
                        new TypeReference<Optional<Long>>() {});
    }
}

