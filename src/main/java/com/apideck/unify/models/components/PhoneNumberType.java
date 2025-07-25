/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * PhoneNumberType
 * 
 * <p>The type of phone number
 */
public enum PhoneNumberType {
    PRIMARY("primary"),
    SECONDARY("secondary"),
    HOME("home"),
    WORK("work"),
    OFFICE("office"),
    MOBILE("mobile"),
    ASSISTANT("assistant"),
    FAX("fax"),
    DIRECT_DIAL_IN("direct-dial-in"),
    PERSONAL("personal"),
    OTHER("other");

    @JsonValue
    private final String value;

    PhoneNumberType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PhoneNumberType> fromValue(String value) {
        for (PhoneNumberType o: PhoneNumberType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

