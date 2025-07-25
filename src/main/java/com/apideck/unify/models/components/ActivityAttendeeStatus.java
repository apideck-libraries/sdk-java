/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * ActivityAttendeeStatus
 * 
 * <p>Status of the attendee
 */
public enum ActivityAttendeeStatus {
    ACCEPTED("accepted"),
    TENTATIVE("tentative"),
    DECLINED("declined");

    @JsonValue
    private final String value;

    ActivityAttendeeStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ActivityAttendeeStatus> fromValue(String value) {
        for (ActivityAttendeeStatus o: ActivityAttendeeStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

