/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * InvoiceItemTypeType - Item type
 */
public enum InvoiceItemTypeType {
    INVENTORY("inventory"),
    SERVICE("service"),
    OTHER("other");

    @JsonValue
    private final String value;

    private InvoiceItemTypeType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
