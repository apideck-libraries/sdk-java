/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * InvoiceItemType - The type of invoice item, indicating whether it is an inventory item, a service, or another type.
 */
public enum InvoiceItemType {
    INVENTORY("inventory"),
    SERVICE("service"),
    OTHER("other");

    @JsonValue
    private final String value;

    private InvoiceItemType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
