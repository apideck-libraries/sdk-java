/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * OpportunitiesSortBy - The field on which to sort the Opportunities
 */
public enum OpportunitiesSortBy {
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at"),
    TITLE("title"),
    WIN_PROBABILITY("win_probability"),
    MONETARY_AMOUNT("monetary_amount"),
    STATUS("status");

    @JsonValue
    private final String value;

    private OpportunitiesSortBy(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}