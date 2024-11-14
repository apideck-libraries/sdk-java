/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * LocationStatusStatus - Status of this location.
 */
public enum LocationStatusStatus {
    ACTIVE("active"),
    INACTIVE("inactive"),
    OTHER("other");

    @JsonValue
    private final String value;

    private LocationStatusStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}