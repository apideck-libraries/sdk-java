/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * Units - The unit of time off requested. Possible values include: `hours`, `days`, or `other`.
 */
public enum Units {
    DAYS("days"),
    HOURS("hours"),
    OTHER("other");

    @JsonValue
    private final String value;

    private Units(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
