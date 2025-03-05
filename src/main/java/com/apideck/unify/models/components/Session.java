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

public class Session {

    /**
     * The metadata of the consumer. This is used to display the consumer in the sidebar. This is optional, but recommended.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("consumer_metadata")
    private Optional<? extends ConsumerMetadata> consumerMetadata;

    /**
     * The URL to redirect the user to after the session has been configured.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("redirect_uri")
    private Optional<String> redirectUri;

    /**
     * Settings to change the way the Vault is displayed.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("settings")
    private Optional<? extends SessionSettings> settings;

    /**
     * Theming options to change the look and feel of Vault.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("theme")
    private Optional<? extends Theme> theme;

    /**
     * Custom consumer settings that are passed as part of the session.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_consumer_settings")
    private Optional<? extends Map<String, Object>> customConsumerSettings;

    @JsonCreator
    public Session(
            @JsonProperty("consumer_metadata") Optional<? extends ConsumerMetadata> consumerMetadata,
            @JsonProperty("redirect_uri") Optional<String> redirectUri,
            @JsonProperty("settings") Optional<? extends SessionSettings> settings,
            @JsonProperty("theme") Optional<? extends Theme> theme,
            @JsonProperty("custom_consumer_settings") Optional<? extends Map<String, Object>> customConsumerSettings) {
        Utils.checkNotNull(consumerMetadata, "consumerMetadata");
        Utils.checkNotNull(redirectUri, "redirectUri");
        Utils.checkNotNull(settings, "settings");
        Utils.checkNotNull(theme, "theme");
        Utils.checkNotNull(customConsumerSettings, "customConsumerSettings");
        this.consumerMetadata = consumerMetadata;
        this.redirectUri = redirectUri;
        this.settings = settings;
        this.theme = theme;
        this.customConsumerSettings = customConsumerSettings;
    }
    
    public Session() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The metadata of the consumer. This is used to display the consumer in the sidebar. This is optional, but recommended.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ConsumerMetadata> consumerMetadata() {
        return (Optional<ConsumerMetadata>) consumerMetadata;
    }

    /**
     * The URL to redirect the user to after the session has been configured.
     */
    @JsonIgnore
    public Optional<String> redirectUri() {
        return redirectUri;
    }

    /**
     * Settings to change the way the Vault is displayed.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SessionSettings> settings() {
        return (Optional<SessionSettings>) settings;
    }

    /**
     * Theming options to change the look and feel of Vault.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Theme> theme() {
        return (Optional<Theme>) theme;
    }

    /**
     * Custom consumer settings that are passed as part of the session.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> customConsumerSettings() {
        return (Optional<Map<String, Object>>) customConsumerSettings;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The metadata of the consumer. This is used to display the consumer in the sidebar. This is optional, but recommended.
     */
    public Session withConsumerMetadata(ConsumerMetadata consumerMetadata) {
        Utils.checkNotNull(consumerMetadata, "consumerMetadata");
        this.consumerMetadata = Optional.ofNullable(consumerMetadata);
        return this;
    }

    /**
     * The metadata of the consumer. This is used to display the consumer in the sidebar. This is optional, but recommended.
     */
    public Session withConsumerMetadata(Optional<? extends ConsumerMetadata> consumerMetadata) {
        Utils.checkNotNull(consumerMetadata, "consumerMetadata");
        this.consumerMetadata = consumerMetadata;
        return this;
    }

    /**
     * The URL to redirect the user to after the session has been configured.
     */
    public Session withRedirectUri(String redirectUri) {
        Utils.checkNotNull(redirectUri, "redirectUri");
        this.redirectUri = Optional.ofNullable(redirectUri);
        return this;
    }

    /**
     * The URL to redirect the user to after the session has been configured.
     */
    public Session withRedirectUri(Optional<String> redirectUri) {
        Utils.checkNotNull(redirectUri, "redirectUri");
        this.redirectUri = redirectUri;
        return this;
    }

    /**
     * Settings to change the way the Vault is displayed.
     */
    public Session withSettings(SessionSettings settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = Optional.ofNullable(settings);
        return this;
    }

    /**
     * Settings to change the way the Vault is displayed.
     */
    public Session withSettings(Optional<? extends SessionSettings> settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = settings;
        return this;
    }

    /**
     * Theming options to change the look and feel of Vault.
     */
    public Session withTheme(Theme theme) {
        Utils.checkNotNull(theme, "theme");
        this.theme = Optional.ofNullable(theme);
        return this;
    }

    /**
     * Theming options to change the look and feel of Vault.
     */
    public Session withTheme(Optional<? extends Theme> theme) {
        Utils.checkNotNull(theme, "theme");
        this.theme = theme;
        return this;
    }

    /**
     * Custom consumer settings that are passed as part of the session.
     */
    public Session withCustomConsumerSettings(Map<String, Object> customConsumerSettings) {
        Utils.checkNotNull(customConsumerSettings, "customConsumerSettings");
        this.customConsumerSettings = Optional.ofNullable(customConsumerSettings);
        return this;
    }

    /**
     * Custom consumer settings that are passed as part of the session.
     */
    public Session withCustomConsumerSettings(Optional<? extends Map<String, Object>> customConsumerSettings) {
        Utils.checkNotNull(customConsumerSettings, "customConsumerSettings");
        this.customConsumerSettings = customConsumerSettings;
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
        Session other = (Session) o;
        return 
            Objects.deepEquals(this.consumerMetadata, other.consumerMetadata) &&
            Objects.deepEquals(this.redirectUri, other.redirectUri) &&
            Objects.deepEquals(this.settings, other.settings) &&
            Objects.deepEquals(this.theme, other.theme) &&
            Objects.deepEquals(this.customConsumerSettings, other.customConsumerSettings);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            consumerMetadata,
            redirectUri,
            settings,
            theme,
            customConsumerSettings);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Session.class,
                "consumerMetadata", consumerMetadata,
                "redirectUri", redirectUri,
                "settings", settings,
                "theme", theme,
                "customConsumerSettings", customConsumerSettings);
    }
    
    public final static class Builder {
 
        private Optional<? extends ConsumerMetadata> consumerMetadata = Optional.empty();
 
        private Optional<String> redirectUri = Optional.empty();
 
        private Optional<? extends SessionSettings> settings = Optional.empty();
 
        private Optional<? extends Theme> theme = Optional.empty();
 
        private Optional<? extends Map<String, Object>> customConsumerSettings = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The metadata of the consumer. This is used to display the consumer in the sidebar. This is optional, but recommended.
         */
        public Builder consumerMetadata(ConsumerMetadata consumerMetadata) {
            Utils.checkNotNull(consumerMetadata, "consumerMetadata");
            this.consumerMetadata = Optional.ofNullable(consumerMetadata);
            return this;
        }

        /**
         * The metadata of the consumer. This is used to display the consumer in the sidebar. This is optional, but recommended.
         */
        public Builder consumerMetadata(Optional<? extends ConsumerMetadata> consumerMetadata) {
            Utils.checkNotNull(consumerMetadata, "consumerMetadata");
            this.consumerMetadata = consumerMetadata;
            return this;
        }

        /**
         * The URL to redirect the user to after the session has been configured.
         */
        public Builder redirectUri(String redirectUri) {
            Utils.checkNotNull(redirectUri, "redirectUri");
            this.redirectUri = Optional.ofNullable(redirectUri);
            return this;
        }

        /**
         * The URL to redirect the user to after the session has been configured.
         */
        public Builder redirectUri(Optional<String> redirectUri) {
            Utils.checkNotNull(redirectUri, "redirectUri");
            this.redirectUri = redirectUri;
            return this;
        }

        /**
         * Settings to change the way the Vault is displayed.
         */
        public Builder settings(SessionSettings settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = Optional.ofNullable(settings);
            return this;
        }

        /**
         * Settings to change the way the Vault is displayed.
         */
        public Builder settings(Optional<? extends SessionSettings> settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = settings;
            return this;
        }

        /**
         * Theming options to change the look and feel of Vault.
         */
        public Builder theme(Theme theme) {
            Utils.checkNotNull(theme, "theme");
            this.theme = Optional.ofNullable(theme);
            return this;
        }

        /**
         * Theming options to change the look and feel of Vault.
         */
        public Builder theme(Optional<? extends Theme> theme) {
            Utils.checkNotNull(theme, "theme");
            this.theme = theme;
            return this;
        }

        /**
         * Custom consumer settings that are passed as part of the session.
         */
        public Builder customConsumerSettings(Map<String, Object> customConsumerSettings) {
            Utils.checkNotNull(customConsumerSettings, "customConsumerSettings");
            this.customConsumerSettings = Optional.ofNullable(customConsumerSettings);
            return this;
        }

        /**
         * Custom consumer settings that are passed as part of the session.
         */
        public Builder customConsumerSettings(Optional<? extends Map<String, Object>> customConsumerSettings) {
            Utils.checkNotNull(customConsumerSettings, "customConsumerSettings");
            this.customConsumerSettings = customConsumerSettings;
            return this;
        }
        
        public Session build() {
            return new Session(
                consumerMetadata,
                redirectUri,
                settings,
                theme,
                customConsumerSettings);
        }
    }
}

