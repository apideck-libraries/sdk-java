/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * EcommerceOrderStatus - Current status of the order.
 */
public enum EcommerceOrderStatus {
    ACTIVE("active"),
    COMPLETED("completed"),
    CANCELLED("cancelled"),
    ARCHIVED("archived"),
    UNKNOWN("unknown"),
    OTHER("other");

    @JsonValue
    private final String value;

    private EcommerceOrderStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}