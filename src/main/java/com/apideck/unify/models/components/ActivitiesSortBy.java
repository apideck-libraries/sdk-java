/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ActivitiesSortBy - The field on which to sort the Activities
 */
public enum ActivitiesSortBy {
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at");

    @JsonValue
    private final String value;

    private ActivitiesSortBy(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}