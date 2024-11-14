/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ConnectorAuthType - Type of authorization used by the connector
 */
public enum ConnectorAuthType {
    OAUTH2("oauth2"),
    API_KEY("apiKey"),
    BASIC("basic"),
    CUSTOM("custom"),
    NONE("none");

    @JsonValue
    private final String value;

    private ConnectorAuthType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}