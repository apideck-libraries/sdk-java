/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ApiType - Indicates whether the API is a Unified API. If unified_api is false, the API is a Platform API.
 */
public enum ApiType {
    PLATFORM("platform"),
    UNIFIED("unified");

    @JsonValue
    private final String value;

    private ApiType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
