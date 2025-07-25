/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class Api {
    /**
     * ID of the API.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * Indicates whether the API is a Unified API. If unified_api is false, the API is a Platform API.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends ApiType> type;

    /**
     * Name of the API.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * Description of the API.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * Status of the API. APIs with status live or beta are callable.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends ApiStatus> status;

    /**
     * Link to the latest OpenAPI specification of the API.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("spec_url")
    private Optional<String> specUrl;

    /**
     * Link to the API reference of the API.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("api_reference_url")
    private Optional<String> apiReferenceUrl;

    /**
     * ID of the Postman collection of the API.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postman_collection_id")
    private JsonNullable<String> postmanCollectionId;

    /**
     * List of categories the API belongs to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("categories")
    private Optional<? extends List<String>> categories;

    /**
     * List of resources supported in this API.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("resources")
    private Optional<? extends List<Resources>> resources;

    /**
     * List of event types this API supports.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("events")
    private Optional<? extends List<String>> events;

    @JsonCreator
    public Api(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("type") Optional<? extends ApiType> type,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("status") Optional<? extends ApiStatus> status,
            @JsonProperty("spec_url") Optional<String> specUrl,
            @JsonProperty("api_reference_url") Optional<String> apiReferenceUrl,
            @JsonProperty("postman_collection_id") JsonNullable<String> postmanCollectionId,
            @JsonProperty("categories") Optional<? extends List<String>> categories,
            @JsonProperty("resources") Optional<? extends List<Resources>> resources,
            @JsonProperty("events") Optional<? extends List<String>> events) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(specUrl, "specUrl");
        Utils.checkNotNull(apiReferenceUrl, "apiReferenceUrl");
        Utils.checkNotNull(postmanCollectionId, "postmanCollectionId");
        Utils.checkNotNull(categories, "categories");
        Utils.checkNotNull(resources, "resources");
        Utils.checkNotNull(events, "events");
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
        this.status = status;
        this.specUrl = specUrl;
        this.apiReferenceUrl = apiReferenceUrl;
        this.postmanCollectionId = postmanCollectionId;
        this.categories = categories;
        this.resources = resources;
        this.events = events;
    }
    
    public Api() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            JsonNullable.undefined(), Optional.empty(), Optional.empty(),
            Optional.empty(), JsonNullable.undefined(), Optional.empty(),
            Optional.empty(), Optional.empty());
    }

    /**
     * ID of the API.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * Indicates whether the API is a Unified API. If unified_api is false, the API is a Platform API.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ApiType> type() {
        return (Optional<ApiType>) type;
    }

    /**
     * Name of the API.
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * Description of the API.
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * Status of the API. APIs with status live or beta are callable.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ApiStatus> status() {
        return (Optional<ApiStatus>) status;
    }

    /**
     * Link to the latest OpenAPI specification of the API.
     */
    @JsonIgnore
    public Optional<String> specUrl() {
        return specUrl;
    }

    /**
     * Link to the API reference of the API.
     */
    @JsonIgnore
    public Optional<String> apiReferenceUrl() {
        return apiReferenceUrl;
    }

    /**
     * ID of the Postman collection of the API.
     */
    @JsonIgnore
    public JsonNullable<String> postmanCollectionId() {
        return postmanCollectionId;
    }

    /**
     * List of categories the API belongs to.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> categories() {
        return (Optional<List<String>>) categories;
    }

    /**
     * List of resources supported in this API.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Resources>> resources() {
        return (Optional<List<Resources>>) resources;
    }

    /**
     * List of event types this API supports.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> events() {
        return (Optional<List<String>>) events;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * ID of the API.
     */
    public Api withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }


    /**
     * ID of the API.
     */
    public Api withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Indicates whether the API is a Unified API. If unified_api is false, the API is a Platform API.
     */
    public Api withType(ApiType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }


    /**
     * Indicates whether the API is a Unified API. If unified_api is false, the API is a Platform API.
     */
    public Api withType(Optional<? extends ApiType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Name of the API.
     */
    public Api withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }


    /**
     * Name of the API.
     */
    public Api withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Description of the API.
     */
    public Api withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Description of the API.
     */
    public Api withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Status of the API. APIs with status live or beta are callable.
     */
    public Api withStatus(ApiStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }


    /**
     * Status of the API. APIs with status live or beta are callable.
     */
    public Api withStatus(Optional<? extends ApiStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Link to the latest OpenAPI specification of the API.
     */
    public Api withSpecUrl(String specUrl) {
        Utils.checkNotNull(specUrl, "specUrl");
        this.specUrl = Optional.ofNullable(specUrl);
        return this;
    }


    /**
     * Link to the latest OpenAPI specification of the API.
     */
    public Api withSpecUrl(Optional<String> specUrl) {
        Utils.checkNotNull(specUrl, "specUrl");
        this.specUrl = specUrl;
        return this;
    }

    /**
     * Link to the API reference of the API.
     */
    public Api withApiReferenceUrl(String apiReferenceUrl) {
        Utils.checkNotNull(apiReferenceUrl, "apiReferenceUrl");
        this.apiReferenceUrl = Optional.ofNullable(apiReferenceUrl);
        return this;
    }


    /**
     * Link to the API reference of the API.
     */
    public Api withApiReferenceUrl(Optional<String> apiReferenceUrl) {
        Utils.checkNotNull(apiReferenceUrl, "apiReferenceUrl");
        this.apiReferenceUrl = apiReferenceUrl;
        return this;
    }

    /**
     * ID of the Postman collection of the API.
     */
    public Api withPostmanCollectionId(String postmanCollectionId) {
        Utils.checkNotNull(postmanCollectionId, "postmanCollectionId");
        this.postmanCollectionId = JsonNullable.of(postmanCollectionId);
        return this;
    }

    /**
     * ID of the Postman collection of the API.
     */
    public Api withPostmanCollectionId(JsonNullable<String> postmanCollectionId) {
        Utils.checkNotNull(postmanCollectionId, "postmanCollectionId");
        this.postmanCollectionId = postmanCollectionId;
        return this;
    }

    /**
     * List of categories the API belongs to.
     */
    public Api withCategories(List<String> categories) {
        Utils.checkNotNull(categories, "categories");
        this.categories = Optional.ofNullable(categories);
        return this;
    }


    /**
     * List of categories the API belongs to.
     */
    public Api withCategories(Optional<? extends List<String>> categories) {
        Utils.checkNotNull(categories, "categories");
        this.categories = categories;
        return this;
    }

    /**
     * List of resources supported in this API.
     */
    public Api withResources(List<Resources> resources) {
        Utils.checkNotNull(resources, "resources");
        this.resources = Optional.ofNullable(resources);
        return this;
    }


    /**
     * List of resources supported in this API.
     */
    public Api withResources(Optional<? extends List<Resources>> resources) {
        Utils.checkNotNull(resources, "resources");
        this.resources = resources;
        return this;
    }

    /**
     * List of event types this API supports.
     */
    public Api withEvents(List<String> events) {
        Utils.checkNotNull(events, "events");
        this.events = Optional.ofNullable(events);
        return this;
    }


    /**
     * List of event types this API supports.
     */
    public Api withEvents(Optional<? extends List<String>> events) {
        Utils.checkNotNull(events, "events");
        this.events = events;
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
        Api other = (Api) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.type, other.type) &&
            Utils.enhancedDeepEquals(this.name, other.name) &&
            Utils.enhancedDeepEquals(this.description, other.description) &&
            Utils.enhancedDeepEquals(this.status, other.status) &&
            Utils.enhancedDeepEquals(this.specUrl, other.specUrl) &&
            Utils.enhancedDeepEquals(this.apiReferenceUrl, other.apiReferenceUrl) &&
            Utils.enhancedDeepEquals(this.postmanCollectionId, other.postmanCollectionId) &&
            Utils.enhancedDeepEquals(this.categories, other.categories) &&
            Utils.enhancedDeepEquals(this.resources, other.resources) &&
            Utils.enhancedDeepEquals(this.events, other.events);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, type, name,
            description, status, specUrl,
            apiReferenceUrl, postmanCollectionId, categories,
            resources, events);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Api.class,
                "id", id,
                "type", type,
                "name", name,
                "description", description,
                "status", status,
                "specUrl", specUrl,
                "apiReferenceUrl", apiReferenceUrl,
                "postmanCollectionId", postmanCollectionId,
                "categories", categories,
                "resources", resources,
                "events", events);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> id = Optional.empty();

        private Optional<? extends ApiType> type = Optional.empty();

        private Optional<String> name = Optional.empty();

        private JsonNullable<String> description = JsonNullable.undefined();

        private Optional<? extends ApiStatus> status = Optional.empty();

        private Optional<String> specUrl = Optional.empty();

        private Optional<String> apiReferenceUrl = Optional.empty();

        private JsonNullable<String> postmanCollectionId = JsonNullable.undefined();

        private Optional<? extends List<String>> categories = Optional.empty();

        private Optional<? extends List<Resources>> resources = Optional.empty();

        private Optional<? extends List<String>> events = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * ID of the API.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * ID of the API.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }


        /**
         * Indicates whether the API is a Unified API. If unified_api is false, the API is a Platform API.
         */
        public Builder type(ApiType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * Indicates whether the API is a Unified API. If unified_api is false, the API is a Platform API.
         */
        public Builder type(Optional<? extends ApiType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }


        /**
         * Name of the API.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * Name of the API.
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }


        /**
         * Description of the API.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * Description of the API.
         */
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }


        /**
         * Status of the API. APIs with status live or beta are callable.
         */
        public Builder status(ApiStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Status of the API. APIs with status live or beta are callable.
         */
        public Builder status(Optional<? extends ApiStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }


        /**
         * Link to the latest OpenAPI specification of the API.
         */
        public Builder specUrl(String specUrl) {
            Utils.checkNotNull(specUrl, "specUrl");
            this.specUrl = Optional.ofNullable(specUrl);
            return this;
        }

        /**
         * Link to the latest OpenAPI specification of the API.
         */
        public Builder specUrl(Optional<String> specUrl) {
            Utils.checkNotNull(specUrl, "specUrl");
            this.specUrl = specUrl;
            return this;
        }


        /**
         * Link to the API reference of the API.
         */
        public Builder apiReferenceUrl(String apiReferenceUrl) {
            Utils.checkNotNull(apiReferenceUrl, "apiReferenceUrl");
            this.apiReferenceUrl = Optional.ofNullable(apiReferenceUrl);
            return this;
        }

        /**
         * Link to the API reference of the API.
         */
        public Builder apiReferenceUrl(Optional<String> apiReferenceUrl) {
            Utils.checkNotNull(apiReferenceUrl, "apiReferenceUrl");
            this.apiReferenceUrl = apiReferenceUrl;
            return this;
        }


        /**
         * ID of the Postman collection of the API.
         */
        public Builder postmanCollectionId(String postmanCollectionId) {
            Utils.checkNotNull(postmanCollectionId, "postmanCollectionId");
            this.postmanCollectionId = JsonNullable.of(postmanCollectionId);
            return this;
        }

        /**
         * ID of the Postman collection of the API.
         */
        public Builder postmanCollectionId(JsonNullable<String> postmanCollectionId) {
            Utils.checkNotNull(postmanCollectionId, "postmanCollectionId");
            this.postmanCollectionId = postmanCollectionId;
            return this;
        }


        /**
         * List of categories the API belongs to.
         */
        public Builder categories(List<String> categories) {
            Utils.checkNotNull(categories, "categories");
            this.categories = Optional.ofNullable(categories);
            return this;
        }

        /**
         * List of categories the API belongs to.
         */
        public Builder categories(Optional<? extends List<String>> categories) {
            Utils.checkNotNull(categories, "categories");
            this.categories = categories;
            return this;
        }


        /**
         * List of resources supported in this API.
         */
        public Builder resources(List<Resources> resources) {
            Utils.checkNotNull(resources, "resources");
            this.resources = Optional.ofNullable(resources);
            return this;
        }

        /**
         * List of resources supported in this API.
         */
        public Builder resources(Optional<? extends List<Resources>> resources) {
            Utils.checkNotNull(resources, "resources");
            this.resources = resources;
            return this;
        }


        /**
         * List of event types this API supports.
         */
        public Builder events(List<String> events) {
            Utils.checkNotNull(events, "events");
            this.events = Optional.ofNullable(events);
            return this;
        }

        /**
         * List of event types this API supports.
         */
        public Builder events(Optional<? extends List<String>> events) {
            Utils.checkNotNull(events, "events");
            this.events = events;
            return this;
        }

        public Api build() {

            return new Api(
                id, type, name,
                description, status, specUrl,
                apiReferenceUrl, postmanCollectionId, categories,
                resources, events);
        }

    }
}
