/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ManagedVia - How the subscription is managed in the downstream.
 */
public enum ManagedVia {
    MANUAL("manual"),
    API("api");

    @JsonValue
    private final String value;

    private ManagedVia(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
