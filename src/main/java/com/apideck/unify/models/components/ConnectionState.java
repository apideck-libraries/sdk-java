/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ConnectionState - [Connection state flow](#section/Connection-state)
 */
public enum ConnectionState {
    AVAILABLE("available"),
    CALLABLE("callable"),
    ADDED("added"),
    AUTHORIZED("authorized"),
    INVALID("invalid");

    @JsonValue
    private final String value;

    private ConnectionState(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}