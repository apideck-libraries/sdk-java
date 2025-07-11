/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * PaymentFrequency
 * 
 * <p>Frequency of employee compensation.
 */
public enum PaymentFrequency {
    WEEKLY("weekly"),
    BIWEEKLY("biweekly"),
    MONTHLY("monthly"),
    PRO_RATA("pro-rata"),
    OTHER("other");

    @JsonValue
    private final String value;

    PaymentFrequency(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PaymentFrequency> fromValue(String value) {
        for (PaymentFrequency o: PaymentFrequency.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

