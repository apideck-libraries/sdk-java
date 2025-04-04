/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * Gender
 * 
 * <p>The gender represents the gender identity of a person.
 */
public enum Gender {
    MALE("male"),
    FEMALE("female"),
    UNISEX("unisex"),
    OTHER("other"),
    NOT_SPECIFIED("not_specified");

    @JsonValue
    private final String value;

    private Gender(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Gender> fromValue(String value) {
        for (Gender o: Gender.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

