/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * EmployeeJobStatus - Indicates the status of the job.
 */
public enum EmployeeJobStatus {
    ACTIVE("active"),
    INACTIVE("inactive"),
    OTHER("other");

    @JsonValue
    private final String value;

    private EmployeeJobStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<EmployeeJobStatus> fromValue(String value) {
        for (EmployeeJobStatus o: EmployeeJobStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
