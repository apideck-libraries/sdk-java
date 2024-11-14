/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify;

import com.apideck.unify.models.operations.SDKMethodInterfaces.*;
import com.apideck.unify.utils.HTTPClient;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.SpeakeasyHTTPClient;
import com.apideck.unify.utils.Utils;
import java.lang.String;
import java.util.Map;
import java.util.Optional;

/**
 * Apideck: The Apideck OpenAPI Spec: SDK Optimized
 * https://developers.apideck.com - Apideck Developer Docs
 */
public class Apideck {


    /**
     * SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] SERVERS = {
        "https://unify.apideck.com",
    };

    private final Accounting accounting;

    private final Ats ats;

    private final Crm crm;

    private final Ecommerce ecommerce;

    private final FileStorage fileStorage;

    private final Hris hris;

    private final Lead lead;

    private final Pos pos;

    private final Sms sms;

    private final IssueTracking issueTracking;

    private final Connector connector;

    private final Vault vault;

    private final Webhook webhook;

    public Accounting accounting() {
        return accounting;
    }

    public Ats ats() {
        return ats;
    }

    public Crm crm() {
        return crm;
    }

    public Ecommerce ecommerce() {
        return ecommerce;
    }

    public FileStorage fileStorage() {
        return fileStorage;
    }

    public Hris hris() {
        return hris;
    }

    public Lead lead() {
        return lead;
    }

    public Pos pos() {
        return pos;
    }

    public Sms sms() {
        return sms;
    }

    public IssueTracking issueTracking() {
        return issueTracking;
    }

    public Connector connector() {
        return connector;
    }

    public Vault vault() {
        return vault;
    }

    public Webhook webhook() {
        return webhook;
    }

    private final SDKConfiguration sdkConfiguration;

    /**
     * The Builder class allows the configuration of a new instance of the SDK.
     */
    public static class Builder {

        private final SDKConfiguration sdkConfiguration = new SDKConfiguration();

        private Builder() {
        }

        /**
         * Allows the default HTTP client to be overridden with a custom implementation.
         *
         * @param client The HTTP client to use for all requests.
         * @return The builder instance.
         */
        public Builder client(HTTPClient client) {
            this.sdkConfiguration.defaultClient = client;
            return this;
        }
        /**
         * Configures the SDK security to use the provided secret.
         *
         * @param apiKey The secret to use for all requests.
         * @return The builder instance.
         */
        public Builder apiKey(String apiKey) {
            this.sdkConfiguration.securitySource = SecuritySource.of(com.apideck.unify.models.components.Security.builder()
              .apiKey(apiKey)
              .build());
            return this;
        }

        /**
         * Configures the SDK to use a custom security source.
         * @param securitySource The security source to use for all requests.
         * @return The builder instance.
         */
        public Builder securitySource(SecuritySource securitySource) {
            this.sdkConfiguration.securitySource = securitySource;
            return this;
        }
        
        /**
         * Overrides the default server URL.
         *
         * @param serverUrl The server URL to use for all requests.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl) {
            this.sdkConfiguration.serverUrl = serverUrl;
            return this;
        }

        /**
         * Overrides the default server URL  with a templated URL populated with the provided parameters.
         *
         * @param serverUrl The server URL to use for all requests.
         * @param params The parameters to use when templating the URL.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl, Map<String, String> params) {
            this.sdkConfiguration.serverUrl = Utils.templateUrl(serverUrl, params);
            return this;
        }
        
        /**
         * Overrides the default server by index.
         *
         * @param serverIdx The server to use for all requests.
         * @return The builder instance.
         */
        public Builder serverIndex(int serverIdx) {
            this.sdkConfiguration.serverIdx = serverIdx;
            this.sdkConfiguration.serverUrl = SERVERS[serverIdx];
            return this;
        }
        
        /**
         * Overrides the default configuration for retries
         *
         * @param retryConfig The retry configuration to use for all requests.
         * @return The builder instance.
         */
        public Builder retryConfig(RetryConfig retryConfig) {
            this.sdkConfiguration.retryConfig = Optional.of(retryConfig);
            return this;
        }
        /**
         * Allows setting the customerId parameter for all supported operations.
         *
         * @param customerId The value to set.
         * @return The builder instance.
         */
        public Builder customerId(String customerId) {
            if (!this.sdkConfiguration.globals.get("parameters").containsKey("header")) {
                this.sdkConfiguration.globals.get("parameters").put("header", new java.util.HashMap<>());
            }

            this.sdkConfiguration.globals.get("parameters").get("header").put("customerId", customerId);

            return this;
        }
        
        /**
         * Allows setting the appId parameter for all supported operations.
         *
         * @param appId The value to set.
         * @return The builder instance.
         */
        public Builder appId(String appId) {
            if (!this.sdkConfiguration.globals.get("parameters").containsKey("header")) {
                this.sdkConfiguration.globals.get("parameters").put("header", new java.util.HashMap<>());
            }

            this.sdkConfiguration.globals.get("parameters").get("header").put("appId", appId);

            return this;
        }
        
        // Visible for testing, will be accessed via reflection
        void _hooks(com.apideck.unify.utils.Hooks hooks) {
            sdkConfiguration.setHooks(hooks);    
        }
        
        /**
         * Builds a new instance of the SDK.
         * @return The SDK instance.
         */
        public Apideck build() {
            if (sdkConfiguration.defaultClient == null) {
                sdkConfiguration.defaultClient = new SpeakeasyHTTPClient();
            }
	        if (sdkConfiguration.securitySource == null) {
	    	    sdkConfiguration.securitySource = SecuritySource.of(null);
	        }
            if (sdkConfiguration.serverUrl == null || sdkConfiguration.serverUrl.isBlank()) {
                sdkConfiguration.serverUrl = SERVERS[0];
                sdkConfiguration.serverIdx = 0;
            }
            if (sdkConfiguration.serverUrl.endsWith("/")) {
                sdkConfiguration.serverUrl = sdkConfiguration.serverUrl.substring(0, sdkConfiguration.serverUrl.length() - 1);
            }
            return new Apideck(sdkConfiguration);
        }
    }
    
    /**
     * Get a new instance of the SDK builder to configure a new instance of the SDK.
     * @return The SDK builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    private Apideck(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.accounting = new Accounting(sdkConfiguration);
        this.ats = new Ats(sdkConfiguration);
        this.crm = new Crm(sdkConfiguration);
        this.ecommerce = new Ecommerce(sdkConfiguration);
        this.fileStorage = new FileStorage(sdkConfiguration);
        this.hris = new Hris(sdkConfiguration);
        this.lead = new Lead(sdkConfiguration);
        this.pos = new Pos(sdkConfiguration);
        this.sms = new Sms(sdkConfiguration);
        this.issueTracking = new IssueTracking(sdkConfiguration);
        this.connector = new Connector(sdkConfiguration);
        this.vault = new Vault(sdkConfiguration);
        this.webhook = new Webhook(sdkConfiguration);
        this.sdkConfiguration.initialize();
    }}