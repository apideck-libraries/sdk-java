/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum PrepaidType {
    NON_PREPAID("non-prepaid"),
    PREPAID("prepaid"),
    UNKNOWN("unknown");

    @JsonValue
    private final String value;

    private PrepaidType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}