/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * JournalEntryLineItemType
 * 
 * <p>Debit entries are considered positive, and credit entries are considered negative.
 */
public enum JournalEntryLineItemType {
    DEBIT("debit"),
    CREDIT("credit");

    @JsonValue
    private final String value;

    JournalEntryLineItemType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<JournalEntryLineItemType> fromValue(String value) {
        for (JournalEntryLineItemType o: JournalEntryLineItemType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

