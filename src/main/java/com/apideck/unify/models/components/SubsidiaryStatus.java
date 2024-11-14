/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * SubsidiaryStatus - Based on the status some functionality is enabled or disabled.
 */
public enum SubsidiaryStatus {
    ACTIVE("active"),
    INACTIVE("inactive");

    @JsonValue
    private final String value;

    private SubsidiaryStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
