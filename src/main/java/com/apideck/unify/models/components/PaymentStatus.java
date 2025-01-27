/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * PaymentStatus - Status of payment
 */
public enum PaymentStatus {
    DRAFT("draft"),
    AUTHORISED("authorised"),
    REJECTED("rejected"),
    PAID("paid"),
    VOIDED("voided"),
    DELETED("deleted");

    @JsonValue
    private final String value;

    private PaymentStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PaymentStatus> fromValue(String value) {
        for (PaymentStatus o: PaymentStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
