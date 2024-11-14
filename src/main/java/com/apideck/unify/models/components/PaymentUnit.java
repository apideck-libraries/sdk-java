/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * PaymentUnit - Unit of measurement for employee compensation.
 */
public enum PaymentUnit {
    HOUR("hour"),
    WEEK("week"),
    MONTH("month"),
    YEAR("year"),
    PAYCHECK("paycheck"),
    OTHER("other");

    @JsonValue
    private final String value;

    private PaymentUnit(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
