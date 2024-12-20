/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * FlsaStatus - The FLSA status for this compensation.
 */
public enum FlsaStatus {
    EXEMPT("exempt"),
    SALARIED_NONEXEMPT("salaried-nonexempt"),
    NONEXEMPT("nonexempt"),
    OWNER("owner"),
    OTHER("other");

    @JsonValue
    private final String value;

    private FlsaStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
