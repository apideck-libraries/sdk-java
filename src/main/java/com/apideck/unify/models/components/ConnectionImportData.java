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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class ConnectionImportData {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends Credentials> credentials;

    /**
     * Connection settings. Values will persist to `form_fields` with corresponding id
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("settings")
    private JsonNullable<? extends ConnectionImportDataSettings> settings;

    /**
     * Attach your own consumer specific metadata
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private JsonNullable<? extends Map<String, Object>> metadata;

    @JsonCreator
    public ConnectionImportData(
            @JsonProperty("credentials") Optional<? extends Credentials> credentials,
            @JsonProperty("settings") JsonNullable<? extends ConnectionImportDataSettings> settings,
            @JsonProperty("metadata") JsonNullable<? extends Map<String, Object>> metadata) {
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(settings, "settings");
        Utils.checkNotNull(metadata, "metadata");
        this.credentials = credentials;
        this.settings = settings;
        this.metadata = metadata;
    }
    
    public ConnectionImportData() {
        this(Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Credentials> credentials() {
        return (Optional<Credentials>) credentials;
    }

    /**
     * Connection settings. Values will persist to `form_fields` with corresponding id
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<ConnectionImportDataSettings> settings() {
        return (JsonNullable<ConnectionImportDataSettings>) settings;
    }

    /**
     * Attach your own consumer specific metadata
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, Object>> metadata() {
        return (JsonNullable<Map<String, Object>>) metadata;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ConnectionImportData withCredentials(Credentials credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    public ConnectionImportData withCredentials(Optional<? extends Credentials> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * Connection settings. Values will persist to `form_fields` with corresponding id
     */
    public ConnectionImportData withSettings(ConnectionImportDataSettings settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = JsonNullable.of(settings);
        return this;
    }

    /**
     * Connection settings. Values will persist to `form_fields` with corresponding id
     */
    public ConnectionImportData withSettings(JsonNullable<? extends ConnectionImportDataSettings> settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = settings;
        return this;
    }

    /**
     * Attach your own consumer specific metadata
     */
    public ConnectionImportData withMetadata(Map<String, Object> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = JsonNullable.of(metadata);
        return this;
    }

    /**
     * Attach your own consumer specific metadata
     */
    public ConnectionImportData withMetadata(JsonNullable<? extends Map<String, Object>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
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
        ConnectionImportData other = (ConnectionImportData) o;
        return 
            Objects.deepEquals(this.credentials, other.credentials) &&
            Objects.deepEquals(this.settings, other.settings) &&
            Objects.deepEquals(this.metadata, other.metadata);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            credentials,
            settings,
            metadata);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConnectionImportData.class,
                "credentials", credentials,
                "settings", settings,
                "metadata", metadata);
    }
    
    public final static class Builder {
 
        private Optional<? extends Credentials> credentials = Optional.empty();
 
        private JsonNullable<? extends ConnectionImportDataSettings> settings = JsonNullable.undefined();
 
        private JsonNullable<? extends Map<String, Object>> metadata = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder credentials(Credentials credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        public Builder credentials(Optional<? extends Credentials> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * Connection settings. Values will persist to `form_fields` with corresponding id
         */
        public Builder settings(ConnectionImportDataSettings settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = JsonNullable.of(settings);
            return this;
        }

        /**
         * Connection settings. Values will persist to `form_fields` with corresponding id
         */
        public Builder settings(JsonNullable<? extends ConnectionImportDataSettings> settings) {
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
        
        public ConnectionImportData build() {
            return new ConnectionImportData(
                credentials,
                settings,
                metadata);
        }
    }
}

