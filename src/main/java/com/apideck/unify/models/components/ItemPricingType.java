/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum ItemPricingType {
    FIXED("fixed"),
    VARIABLE("variable"),
    OTHER("other");

    @JsonValue
    private final String value;

    private ItemPricingType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}