/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ActivityAttendeeStatus - Status of the attendee
 */
public enum ActivityAttendeeStatus {
    ACCEPTED("accepted"),
    TENTATIVE("tentative"),
    DECLINED("declined");

    @JsonValue
    private final String value;

    private ActivityAttendeeStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
