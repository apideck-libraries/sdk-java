/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * Audience - Audience for the doc.
 */
public enum Audience {
    APPLICATION_OWNER("application_owner"),
    CONSUMER("consumer");

    @JsonValue
    private final String value;

    private Audience(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Audience> fromValue(String value) {
        for (Audience o: Audience.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
