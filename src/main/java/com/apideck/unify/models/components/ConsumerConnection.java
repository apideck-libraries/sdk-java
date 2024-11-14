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
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class ConsumerConnection {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("icon")
    private Optional<String> icon;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logo")
    private Optional<String> logo;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("website")
    private Optional<String> website;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag_line")
    private Optional<String> tagLine;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("service_id")
    private Optional<String> serviceId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unified_api")
    private Optional<String> unifiedApi;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("consumer_id")
    private Optional<String> consumerId;

    /**
     * Type of authorization used by the connector
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends AuthType> authType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enabled")
    private Optional<Boolean> enabled;

    /**
     * Connection settings. Values will persist to `form_fields` with corresponding id
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("settings")
    private JsonNullable<? extends Settings> settings;

    /**
     * Attach your own consumer specific metadata
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private JsonNullable<? extends Map<String, Object>> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private Optional<String> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private JsonNullable<String> updatedAt;

    /**
     * [Connection state flow](#section/Connection-state)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    private Optional<? extends ConnectionState> state;

    @JsonCreator
    public ConsumerConnection(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("icon") Optional<String> icon,
            @JsonProperty("logo") Optional<String> logo,
            @JsonProperty("website") Optional<String> website,
            @JsonProperty("tag_line") Optional<String> tagLine,
            @JsonProperty("service_id") Optional<String> serviceId,
            @JsonProperty("unified_api") Optional<String> unifiedApi,
            @JsonProperty("consumer_id") Optional<String> consumerId,
            @JsonProperty("auth_type") Optional<? extends AuthType> authType,
            @JsonProperty("enabled") Optional<Boolean> enabled,
            @JsonProperty("settings") JsonNullable<? extends Settings> settings,
            @JsonProperty("metadata") JsonNullable<? extends Map<String, Object>> metadata,
            @JsonProperty("created_at") Optional<String> createdAt,
            @JsonProperty("updated_at") JsonNullable<String> updatedAt,
            @JsonProperty("state") Optional<? extends ConnectionState> state) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(icon, "icon");
        Utils.checkNotNull(logo, "logo");
        Utils.checkNotNull(website, "website");
        Utils.checkNotNull(tagLine, "tagLine");
        Utils.checkNotNull(serviceId, "serviceId");
        Utils.checkNotNull(unifiedApi, "unifiedApi");
        Utils.checkNotNull(consumerId, "consumerId");
        Utils.checkNotNull(authType, "authType");
        Utils.checkNotNull(enabled, "enabled");
        Utils.checkNotNull(settings, "settings");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(state, "state");
        this.id = id;
        this.name = name;
        this.icon = icon;
        this.logo = logo;
        this.website = website;
        this.tagLine = tagLine;
        this.serviceId = serviceId;
        this.unifiedApi = unifiedApi;
        this.consumerId = consumerId;
        this.authType = authType;
        this.enabled = enabled;
        this.settings = settings;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.state = state;
    }
    
    public ConsumerConnection() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @JsonIgnore
    public Optional<String> icon() {
        return icon;
    }

    @JsonIgnore
    public Optional<String> logo() {
        return logo;
    }

    @JsonIgnore
    public Optional<String> website() {
        return website;
    }

    @JsonIgnore
    public Optional<String> tagLine() {
        return tagLine;
    }

    @JsonIgnore
    public Optional<String> serviceId() {
        return serviceId;
    }

    @JsonIgnore
    public Optional<String> unifiedApi() {
        return unifiedApi;
    }

    @JsonIgnore
    public Optional<String> consumerId() {
        return consumerId;
    }

    /**
     * Type of authorization used by the connector
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AuthType> authType() {
        return (Optional<AuthType>) authType;
    }

    @JsonIgnore
    public Optional<Boolean> enabled() {
        return enabled;
    }

    /**
     * Connection settings. Values will persist to `form_fields` with corresponding id
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Settings> settings() {
        return (JsonNullable<Settings>) settings;
    }

    /**
     * Attach your own consumer specific metadata
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, Object>> metadata() {
        return (JsonNullable<Map<String, Object>>) metadata;
    }

    @JsonIgnore
    public Optional<String> createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public JsonNullable<String> updatedAt() {
        return updatedAt;
    }

    /**
     * [Connection state flow](#section/Connection-state)
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ConnectionState> state() {
        return (Optional<ConnectionState>) state;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ConsumerConnection withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public ConsumerConnection withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public ConsumerConnection withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public ConsumerConnection withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public ConsumerConnection withIcon(String icon) {
        Utils.checkNotNull(icon, "icon");
        this.icon = Optional.ofNullable(icon);
        return this;
    }

    public ConsumerConnection withIcon(Optional<String> icon) {
        Utils.checkNotNull(icon, "icon");
        this.icon = icon;
        return this;
    }

    public ConsumerConnection withLogo(String logo) {
        Utils.checkNotNull(logo, "logo");
        this.logo = Optional.ofNullable(logo);
        return this;
    }

    public ConsumerConnection withLogo(Optional<String> logo) {
        Utils.checkNotNull(logo, "logo");
        this.logo = logo;
        return this;
    }

    public ConsumerConnection withWebsite(String website) {
        Utils.checkNotNull(website, "website");
        this.website = Optional.ofNullable(website);
        return this;
    }

    public ConsumerConnection withWebsite(Optional<String> website) {
        Utils.checkNotNull(website, "website");
        this.website = website;
        return this;
    }

    public ConsumerConnection withTagLine(String tagLine) {
        Utils.checkNotNull(tagLine, "tagLine");
        this.tagLine = Optional.ofNullable(tagLine);
        return this;
    }

    public ConsumerConnection withTagLine(Optional<String> tagLine) {
        Utils.checkNotNull(tagLine, "tagLine");
        this.tagLine = tagLine;
        return this;
    }

    public ConsumerConnection withServiceId(String serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = Optional.ofNullable(serviceId);
        return this;
    }

    public ConsumerConnection withServiceId(Optional<String> serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = serviceId;
        return this;
    }

    public ConsumerConnection withUnifiedApi(String unifiedApi) {
        Utils.checkNotNull(unifiedApi, "unifiedApi");
        this.unifiedApi = Optional.ofNullable(unifiedApi);
        return this;
    }

    public ConsumerConnection withUnifiedApi(Optional<String> unifiedApi) {
        Utils.checkNotNull(unifiedApi, "unifiedApi");
        this.unifiedApi = unifiedApi;
        return this;
    }

    public ConsumerConnection withConsumerId(String consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = Optional.ofNullable(consumerId);
        return this;
    }

    public ConsumerConnection withConsumerId(Optional<String> consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = consumerId;
        return this;
    }

    /**
     * Type of authorization used by the connector
     */
    public ConsumerConnection withAuthType(AuthType authType) {
        Utils.checkNotNull(authType, "authType");
        this.authType = Optional.ofNullable(authType);
        return this;
    }

    /**
     * Type of authorization used by the connector
     */
    public ConsumerConnection withAuthType(Optional<? extends AuthType> authType) {
        Utils.checkNotNull(authType, "authType");
        this.authType = authType;
        return this;
    }

    public ConsumerConnection withEnabled(boolean enabled) {
        Utils.checkNotNull(enabled, "enabled");
        this.enabled = Optional.ofNullable(enabled);
        return this;
    }

    public ConsumerConnection withEnabled(Optional<Boolean> enabled) {
        Utils.checkNotNull(enabled, "enabled");
        this.enabled = enabled;
        return this;
    }

    /**
     * Connection settings. Values will persist to `form_fields` with corresponding id
     */
    public ConsumerConnection withSettings(Settings settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = JsonNullable.of(settings);
        return this;
    }

    /**
     * Connection settings. Values will persist to `form_fields` with corresponding id
     */
    public ConsumerConnection withSettings(JsonNullable<? extends Settings> settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = settings;
        return this;
    }

    /**
     * Attach your own consumer specific metadata
     */
    public ConsumerConnection withMetadata(Map<String, Object> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = JsonNullable.of(metadata);
        return this;
    }

    /**
     * Attach your own consumer specific metadata
     */
    public ConsumerConnection withMetadata(JsonNullable<? extends Map<String, Object>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public ConsumerConnection withCreatedAt(String createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public ConsumerConnection withCreatedAt(Optional<String> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public ConsumerConnection withUpdatedAt(String updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    public ConsumerConnection withUpdatedAt(JsonNullable<String> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * [Connection state flow](#section/Connection-state)
     */
    public ConsumerConnection withState(ConnectionState state) {
        Utils.checkNotNull(state, "state");
        this.state = Optional.ofNullable(state);
        return this;
    }

    /**
     * [Connection state flow](#section/Connection-state)
     */
    public ConsumerConnection withState(Optional<? extends ConnectionState> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
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
        ConsumerConnection other = (ConsumerConnection) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.icon, other.icon) &&
            Objects.deepEquals(this.logo, other.logo) &&
            Objects.deepEquals(this.website, other.website) &&
            Objects.deepEquals(this.tagLine, other.tagLine) &&
            Objects.deepEquals(this.serviceId, other.serviceId) &&
            Objects.deepEquals(this.unifiedApi, other.unifiedApi) &&
            Objects.deepEquals(this.consumerId, other.consumerId) &&
            Objects.deepEquals(this.authType, other.authType) &&
            Objects.deepEquals(this.enabled, other.enabled) &&
            Objects.deepEquals(this.settings, other.settings) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.state, other.state);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            icon,
            logo,
            website,
            tagLine,
            serviceId,
            unifiedApi,
            consumerId,
            authType,
            enabled,
            settings,
            metadata,
            createdAt,
            updatedAt,
            state);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConsumerConnection.class,
                "id", id,
                "name", name,
                "icon", icon,
                "logo", logo,
                "website", website,
                "tagLine", tagLine,
                "serviceId", serviceId,
                "unifiedApi", unifiedApi,
                "consumerId", consumerId,
                "authType", authType,
                "enabled", enabled,
                "settings", settings,
                "metadata", metadata,
                "createdAt", createdAt,
                "updatedAt", updatedAt,
                "state", state);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<String> icon = Optional.empty();
 
        private Optional<String> logo = Optional.empty();
 
        private Optional<String> website = Optional.empty();
 
        private Optional<String> tagLine = Optional.empty();
 
        private Optional<String> serviceId = Optional.empty();
 
        private Optional<String> unifiedApi = Optional.empty();
 
        private Optional<String> consumerId = Optional.empty();
 
        private Optional<? extends AuthType> authType = Optional.empty();
 
        private Optional<Boolean> enabled = Optional.empty();
 
        private JsonNullable<? extends Settings> settings = JsonNullable.undefined();
 
        private JsonNullable<? extends Map<String, Object>> metadata = JsonNullable.undefined();
 
        private Optional<String> createdAt = Optional.empty();
 
        private JsonNullable<String> updatedAt = JsonNullable.undefined();
 
        private Optional<? extends ConnectionState> state = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder icon(String icon) {
            Utils.checkNotNull(icon, "icon");
            this.icon = Optional.ofNullable(icon);
            return this;
        }

        public Builder icon(Optional<String> icon) {
            Utils.checkNotNull(icon, "icon");
            this.icon = icon;
            return this;
        }

        public Builder logo(String logo) {
            Utils.checkNotNull(logo, "logo");
            this.logo = Optional.ofNullable(logo);
            return this;
        }

        public Builder logo(Optional<String> logo) {
            Utils.checkNotNull(logo, "logo");
            this.logo = logo;
            return this;
        }

        public Builder website(String website) {
            Utils.checkNotNull(website, "website");
            this.website = Optional.ofNullable(website);
            return this;
        }

        public Builder website(Optional<String> website) {
            Utils.checkNotNull(website, "website");
            this.website = website;
            return this;
        }

        public Builder tagLine(String tagLine) {
            Utils.checkNotNull(tagLine, "tagLine");
            this.tagLine = Optional.ofNullable(tagLine);
            return this;
        }

        public Builder tagLine(Optional<String> tagLine) {
            Utils.checkNotNull(tagLine, "tagLine");
            this.tagLine = tagLine;
            return this;
        }

        public Builder serviceId(String serviceId) {
            Utils.checkNotNull(serviceId, "serviceId");
            this.serviceId = Optional.ofNullable(serviceId);
            return this;
        }

        public Builder serviceId(Optional<String> serviceId) {
            Utils.checkNotNull(serviceId, "serviceId");
            this.serviceId = serviceId;
            return this;
        }

        public Builder unifiedApi(String unifiedApi) {
            Utils.checkNotNull(unifiedApi, "unifiedApi");
            this.unifiedApi = Optional.ofNullable(unifiedApi);
            return this;
        }

        public Builder unifiedApi(Optional<String> unifiedApi) {
            Utils.checkNotNull(unifiedApi, "unifiedApi");
            this.unifiedApi = unifiedApi;
            return this;
        }

        public Builder consumerId(String consumerId) {
            Utils.checkNotNull(consumerId, "consumerId");
            this.consumerId = Optional.ofNullable(consumerId);
            return this;
        }

        public Builder consumerId(Optional<String> consumerId) {
            Utils.checkNotNull(consumerId, "consumerId");
            this.consumerId = consumerId;
            return this;
        }

        /**
         * Type of authorization used by the connector
         */
        public Builder authType(AuthType authType) {
            Utils.checkNotNull(authType, "authType");
            this.authType = Optional.ofNullable(authType);
            return this;
        }

        /**
         * Type of authorization used by the connector
         */
        public Builder authType(Optional<? extends AuthType> authType) {
            Utils.checkNotNull(authType, "authType");
            this.authType = authType;
            return this;
        }

        public Builder enabled(boolean enabled) {
            Utils.checkNotNull(enabled, "enabled");
            this.enabled = Optional.ofNullable(enabled);
            return this;
        }

        public Builder enabled(Optional<Boolean> enabled) {
            Utils.checkNotNull(enabled, "enabled");
            this.enabled = enabled;
            return this;
        }

        /**
         * Connection settings. Values will persist to `form_fields` with corresponding id
         */
        public Builder settings(Settings settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = JsonNullable.of(settings);
            return this;
        }

        /**
         * Connection settings. Values will persist to `form_fields` with corresponding id
         */
        public Builder settings(JsonNullable<? extends Settings> settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = settings;
            return this;
        }

        /**
         * Attach your own consumer specific metadata
         */
        public Builder metadata(Map<String, Object> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = JsonNullable.of(metadata);
            return this;
        }

        /**
         * Attach your own consumer specific metadata
         */
        public Builder metadata(JsonNullable<? extends Map<String, Object>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder createdAt(String createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        public Builder createdAt(Optional<String> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = JsonNullable.of(updatedAt);
            return this;
        }

        public Builder updatedAt(JsonNullable<String> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * [Connection state flow](#section/Connection-state)
         */
        public Builder state(ConnectionState state) {
            Utils.checkNotNull(state, "state");
            this.state = Optional.ofNullable(state);
            return this;
        }

        /**
         * [Connection state flow](#section/Connection-state)
         */
        public Builder state(Optional<? extends ConnectionState> state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }
        
        public ConsumerConnection build() {
            return new ConsumerConnection(
                id,
                name,
                icon,
                logo,
                website,
                tagLine,
                serviceId,
                unifiedApi,
                consumerId,
                authType,
                enabled,
                settings,
                metadata,
                createdAt,
                updatedAt,
                state);
        }
    }
}
