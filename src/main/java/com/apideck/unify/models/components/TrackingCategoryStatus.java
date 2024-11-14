/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * TrackingCategoryStatus - Based on the status some functionality is enabled or disabled.
 */
public enum TrackingCategoryStatus {
    ACTIVE("active"),
    INACTIVE("inactive");

    @JsonValue
    private final String value;

    private TrackingCategoryStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
