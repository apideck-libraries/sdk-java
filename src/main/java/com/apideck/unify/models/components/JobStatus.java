/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * JobStatus - The status of the job.
 */
public enum JobStatus {
    DRAFT("draft"),
    INTERNAL("internal"),
    PUBLISHED("published"),
    COMPLETED("completed"),
    ON_HOLD("on-hold"),
    PRIVATE("private");

    @JsonValue
    private final String value;

    private JobStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
