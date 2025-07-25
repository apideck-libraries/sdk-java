/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * ConnectionState
 * 
 * <p>[Connection state flow](#section/Connection-state)
 */
public enum ConnectionState {
    AVAILABLE("available"),
    CALLABLE("callable"),
    ADDED("added"),
    AUTHORIZED("authorized"),
    INVALID("invalid");

    @JsonValue
    private final String value;

    ConnectionState(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ConnectionState> fromValue(String value) {
        for (ConnectionState o: ConnectionState.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

