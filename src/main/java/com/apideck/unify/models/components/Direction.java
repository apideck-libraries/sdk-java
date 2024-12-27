/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * Direction - The direction of the message.
 */
public enum Direction {
    INBOUND("inbound"),
    OUTBOUND_API("outbound-api"),
    OUTBOUND_CALL("outbound-call"),
    OUTBOUND_REPLY("outbound-reply"),
    UNKNOWN("unknown");

    @JsonValue
    private final String value;

    private Direction(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Direction> fromValue(String value) {
        for (Direction o: Direction.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
