/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;


import com.apideck.unify.models.components.OrderInput;
import com.apideck.unify.utils.LazySingletonValue;
import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class PosOrdersPayRequest {

    /**
     * ID of the record you are acting upon.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=raw")
    private Optional<Boolean> raw;

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
     * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    private JsonNullable<String> fields;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private OrderInput order;

    @JsonCreator
    public PosOrdersPayRequest(
            String id,
            Optional<Boolean> raw,
            Optional<String> customerId,
            Optional<String> appId,
            Optional<String> serviceId,
            JsonNullable<String> fields,
            OrderInput order) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(customerId, "customerId");
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(serviceId, "serviceId");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(order, "order");
        this.id = id;
        this.raw = raw;
        this.customerId = customerId;
        this.appId = appId;
        this.serviceId = serviceId;
        this.fields = fields;
        this.order = order;
    }
    
    public PosOrdersPayRequest(
            String id,
            OrderInput order) {
        this(id, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), order);
    }

    /**
     * ID of the record you are acting upon.
     */
    @JsonIgnore
    public String id() {
        return id;
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
     * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
     */
    @JsonIgnore
    public JsonNullable<String> fields() {
        return fields;
    }

    @JsonIgnore
    public OrderInput order() {
        return order;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the record you are acting upon.
     */
    public PosOrdersPayRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public PosOrdersPayRequest withRaw(boolean raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public PosOrdersPayRequest withRaw(Optional<Boolean> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public PosOrdersPayRequest withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = Optional.ofNullable(customerId);
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public PosOrdersPayRequest withCustomerId(Optional<String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public PosOrdersPayRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public PosOrdersPayRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public PosOrdersPayRequest withServiceId(String serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = Optional.ofNullable(serviceId);
        return this;
    }

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public PosOrdersPayRequest withServiceId(Optional<String> serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = serviceId;
        return this;
    }

    /**
     * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
     */
    public PosOrdersPayRequest withFields(String fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = JsonNullable.of(fields);
        return this;
    }

    /**
     * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
     */
    public PosOrdersPayRequest withFields(JsonNullable<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    public PosOrdersPayRequest withOrder(OrderInput order) {
        Utils.checkNotNull(order, "order");
        this.order = order;
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
        PosOrdersPayRequest other = (PosOrdersPayRequest) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.customerId, other.customerId) &&
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.serviceId, other.serviceId) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.order, other.order);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            raw,
            customerId,
            appId,
            serviceId,
            fields,
            order);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PosOrdersPayRequest.class,
                "id", id,
                "raw", raw,
                "customerId", customerId,
                "appId", appId,
                "serviceId", serviceId,
                "fields", fields,
                "order", order);
    }
    
    public final static class Builder {
 
        private String id;
 
        private Optional<Boolean> raw;
 
        private Optional<String> customerId = Optional.empty();
 
        private Optional<String> appId = Optional.empty();
 
        private Optional<String> serviceId = Optional.empty();
 
        private JsonNullable<String> fields = JsonNullable.undefined();
 
        private OrderInput order;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID of the record you are acting upon.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
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

        public Builder order(OrderInput order) {
            Utils.checkNotNull(order, "order");
            this.order = order;
            return this;
        }
        
        public PosOrdersPayRequest build() {
            if (raw == null) {
                raw = _SINGLETON_VALUE_Raw.value();
            }            return new PosOrdersPayRequest(
                id,
                raw,
                customerId,
                appId,
                serviceId,
                fields,
                order);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_Raw =
                new LazySingletonValue<>(
                        "raw",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});
    }
}

