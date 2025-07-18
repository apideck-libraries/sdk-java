/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * TransactionType
 * 
 * <p>Type of the transaction.
 */
public enum TransactionType {
    INVOICE("invoice"),
    CREDIT_NOTE("credit_note"),
    BILL("bill"),
    PAYMENT("payment"),
    BILL_PAYMENT("bill_payment");

    @JsonValue
    private final String value;

    TransactionType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<TransactionType> fromValue(String value) {
        for (TransactionType o: TransactionType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

