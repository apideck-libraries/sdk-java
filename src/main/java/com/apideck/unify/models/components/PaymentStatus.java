/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * PaymentStatus - Status of payment
 */
public enum PaymentStatus {
    AUTHORISED("authorised"),
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
}