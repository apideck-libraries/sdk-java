/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * RequestType - The type of request
 */
public enum RequestType {
    VACATION("vacation"),
    SICK("sick"),
    PERSONAL("personal"),
    JURY_DUTY("jury_duty"),
    VOLUNTEER("volunteer"),
    BEREAVEMENT("bereavement"),
    OTHER("other");

    @JsonValue
    private final String value;

    private RequestType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}