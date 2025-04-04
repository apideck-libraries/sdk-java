/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * ActivityType
 * 
 * <p>The type of the activity
 */
public enum ActivityType {
    CALL("call"),
    MEETING("meeting"),
    EMAIL("email"),
    NOTE("note"),
    TASK("task"),
    DEADLINE("deadline"),
    SEND_LETTER("send-letter"),
    SEND_QUOTE("send-quote"),
    OTHER("other");

    @JsonValue
    private final String value;

    private ActivityType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ActivityType> fromValue(String value) {
        for (ActivityType o: ActivityType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

