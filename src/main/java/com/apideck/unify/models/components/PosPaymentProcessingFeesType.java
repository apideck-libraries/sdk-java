/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum PosPaymentProcessingFeesType {
    INITIAL("initial"),
    ADJUSTMENT("adjustment");

    @JsonValue
    private final String value;

    private PosPaymentProcessingFeesType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
