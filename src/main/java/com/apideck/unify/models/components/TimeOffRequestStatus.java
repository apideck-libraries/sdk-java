/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * TimeOffRequestStatus - Time off request status to filter on
 */
public enum TimeOffRequestStatus {
    REQUESTED("requested"),
    APPROVED("approved"),
    DECLINED("declined"),
    CANCELLED("cancelled"),
    DELETED("deleted"),
    OTHER("other");

    @JsonValue
    private final String value;

    private TimeOffRequestStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}