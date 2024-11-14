/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * SortDirection - The direction in which to sort the results
 */
public enum SortDirection {
    ASC("asc"),
    DESC("desc");

    @JsonValue
    private final String value;

    private SortDirection(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}