/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * InvoicesSortBy - The field on which to sort the Invoices
 */
public enum InvoicesSortBy {
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at");

    @JsonValue
    private final String value;

    private InvoicesSortBy(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<InvoicesSortBy> fromValue(String value) {
        for (InvoicesSortBy o: InvoicesSortBy.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
