/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum CardType {
    CREDIT("credit"),
    DEBIT("debit"),
    PREPAID("prepaid"),
    OTHER("other");

    @JsonValue
    private final String value;

    private CardType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}