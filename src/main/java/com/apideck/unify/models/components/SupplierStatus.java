/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * SupplierStatus
 * 
 * <p>Supplier status
 */
public enum SupplierStatus {
    ACTIVE("active"),
    INACTIVE("inactive"),
    ARCHIVED("archived"),
    GDPR_ERASURE_REQUEST("gdpr-erasure-request"),
    UNKNOWN("unknown");

    @JsonValue
    private final String value;

    SupplierStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SupplierStatus> fromValue(String value) {
        for (SupplierStatus o: SupplierStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

