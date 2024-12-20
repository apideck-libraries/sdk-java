/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * Scope - The scope of the shared link.
 */
public enum Scope {
    PUBLIC("public"),
    COMPANY("company");

    @JsonValue
    private final String value;

    private Scope(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
