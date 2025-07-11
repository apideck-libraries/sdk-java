/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * InvoiceLineItemType
 * 
 * <p>Item type
 */
public enum InvoiceLineItemType {
    SALES_ITEM("sales_item"),
    DISCOUNT("discount"),
    INFO("info"),
    SUB_TOTAL("sub_total"),
    SERVICE("service"),
    OTHER("other");

    @JsonValue
    private final String value;

    InvoiceLineItemType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<InvoiceLineItemType> fromValue(String value) {
        for (InvoiceLineItemType o: InvoiceLineItemType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

