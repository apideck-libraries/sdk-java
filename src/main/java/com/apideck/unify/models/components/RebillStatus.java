/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * RebillStatus
 * 
 * <p>Status of the rebilling process for this line item.
 */
public enum RebillStatus {
    PENDING("pending"),
    BILLED("billed"),
    VOIDED("voided");

    @JsonValue
    private final String value;

    RebillStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<RebillStatus> fromValue(String value) {
        for (RebillStatus o: RebillStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

