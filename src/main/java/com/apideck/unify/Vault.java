/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify;

public class Vault {
    private final SDKConfiguration sdkConfiguration;
    private final Consumers consumers;
    private final ConsumerRequestCounts consumerRequestCounts;
    private final Connections connections;
    private final ValidateConnection validateConnection;
    private final CreateCallback createCallback;
    private final ConnectionSettings connectionSettings;
    private final CustomFields customFields;
    private final ConnectionCustomMappings connectionCustomMappings;
    private final CustomMappings customMappings;
    private final Sessions sessions;
    private final Logs logs;

    Vault(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.consumers = new Consumers(this.sdkConfiguration);
        this.consumerRequestCounts = new ConsumerRequestCounts(this.sdkConfiguration);
        this.connections = new Connections(this.sdkConfiguration);
        this.validateConnection = new ValidateConnection(this.sdkConfiguration);
        this.createCallback = new CreateCallback(this.sdkConfiguration);
        this.connectionSettings = new ConnectionSettings(this.sdkConfiguration);
        this.customFields = new CustomFields(this.sdkConfiguration);
        this.connectionCustomMappings = new ConnectionCustomMappings(this.sdkConfiguration);
        this.customMappings = new CustomMappings(this.sdkConfiguration);
        this.sessions = new Sessions(this.sdkConfiguration);
        this.logs = new Logs(this.sdkConfiguration);
    }

    public final Consumers consumers() {
        return consumers;
    }

    public final ConsumerRequestCounts consumerRequestCounts() {
        return consumerRequestCounts;
    }

    public final Connections connections() {
        return connections;
    }

    public final ValidateConnection validateConnection() {
        return validateConnection;
    }

    public final CreateCallback createCallback() {
        return createCallback;
    }

    public final ConnectionSettings connectionSettings() {
        return connectionSettings;
    }

    public final CustomFields customFields() {
        return customFields;
    }

    public final ConnectionCustomMappings connectionCustomMappings() {
        return connectionCustomMappings;
    }

    public final CustomMappings customMappings() {
        return customMappings;
    }

    public final Sessions sessions() {
        return sessions;
    }

    public final Logs logs() {
        return logs;
    }

}
