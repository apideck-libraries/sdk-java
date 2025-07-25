/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * EcommerceOrderStatus
 * 
 * <p>Current status of the order.
 */
public enum EcommerceOrderStatus {
    ACTIVE("active"),
    COMPLETED("completed"),
    CANCELLED("cancelled"),
    ARCHIVED("archived"),
    UNKNOWN("unknown"),
    OTHER("other");

    @JsonValue
    private final String value;

    EcommerceOrderStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<EcommerceOrderStatus> fromValue(String value) {
        for (EcommerceOrderStatus o: EcommerceOrderStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

