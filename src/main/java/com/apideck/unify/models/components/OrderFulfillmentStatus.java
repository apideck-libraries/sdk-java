/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * OrderFulfillmentStatus - The state of the fulfillment.
 */
public enum OrderFulfillmentStatus {
    PROPOSED("proposed"),
    RESERVED("reserved"),
    PREPARED("prepared"),
    COMPLETED("completed"),
    CANCELLED("cancelled"),
    FAILED("failed"),
    OTHER("other");

    @JsonValue
    private final String value;

    private OrderFulfillmentStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}