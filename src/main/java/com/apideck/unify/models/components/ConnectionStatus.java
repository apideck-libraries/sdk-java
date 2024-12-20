/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ConnectionStatus - Status of the connection.
 */
public enum ConnectionStatus {
    LIVE("live"),
    UPCOMING("upcoming"),
    REQUESTED("requested");

    @JsonValue
    private final String value;

    private ConnectionStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
