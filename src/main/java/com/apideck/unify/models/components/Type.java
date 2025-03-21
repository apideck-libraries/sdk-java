/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.apideck.unify.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * Type - The type of address.
 */
public enum Type {
    PRIMARY("primary"),
    SECONDARY("secondary"),
    HOME("home"),
    OFFICE("office"),
    SHIPPING("shipping"),
    BILLING("billing"),
    OTHER("other");

    @JsonValue
    private final String value;

    private Type(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Type> fromValue(String value) {
        for (Type o: Type.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
