/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * BillLineItemType
 * 
 * <p>Bill Line Item type
 */
public enum BillLineItemType {
    EXPENSE_ITEM("expense_item"),
    EXPENSE_ACCOUNT("expense_account"),
    OTHER("other");

    @JsonValue
    private final String value;

    BillLineItemType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<BillLineItemType> fromValue(String value) {
        for (BillLineItemType o: BillLineItemType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

