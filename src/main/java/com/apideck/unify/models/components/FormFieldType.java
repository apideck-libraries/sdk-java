/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.apideck.unify.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum FormFieldType {
    TEXT("text"),
    CHECKBOX("checkbox"),
    TEL("tel"),
    EMAIL("email"),
    URL("url"),
    TEXTAREA("textarea"),
    SELECT("select"),
    FILTERED_SELECT("filtered-select"),
    MULTI_SELECT("multi-select"),
    DATETIME("datetime"),
    DATE("date"),
    TIME("time"),
    NUMBER("number");

    @JsonValue
    private final String value;

    private FormFieldType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<FormFieldType> fromValue(String value) {
        for (FormFieldType o: FormFieldType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
