/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * Priority - Priority of the ticket
 */
public enum Priority {
    LOW("low"),
    NORMAL("normal"),
    HIGH("high"),
    URGENT("urgent");

    @JsonValue
    private final String value;

    private Priority(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}