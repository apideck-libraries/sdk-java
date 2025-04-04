/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * PurchaseOrdersSortBy
 * 
 * <p>The field on which to sort the Purchase Orders
 */
public enum PurchaseOrdersSortBy {
    UPDATED_AT("updated_at"),
    CREATED_AT("created_at");

    @JsonValue
    private final String value;

    private PurchaseOrdersSortBy(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PurchaseOrdersSortBy> fromValue(String value) {
        for (PurchaseOrdersSortBy o: PurchaseOrdersSortBy.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

