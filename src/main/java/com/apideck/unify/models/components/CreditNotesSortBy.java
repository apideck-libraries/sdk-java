/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * CreditNotesSortBy - The field on which to sort the Customers
 */
public enum CreditNotesSortBy {
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at");

    @JsonValue
    private final String value;

    private CreditNotesSortBy(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<CreditNotesSortBy> fromValue(String value) {
        for (CreditNotesSortBy o: CreditNotesSortBy.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
