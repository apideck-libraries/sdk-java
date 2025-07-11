/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum EmploymentTerms {
    FULL_TIME("full-time"),
    PART_TIME("part-time"),
    INTERNSHIP("internship"),
    CONTRACTOR("contractor"),
    EMPLOYEE("employee"),
    FREELANCE("freelance"),
    TEMP("temp"),
    SEASONAL("seasonal"),
    VOLUNTEER("volunteer"),
    OTHER("other");

    @JsonValue
    private final String value;

    EmploymentTerms(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<EmploymentTerms> fromValue(String value) {
        for (EmploymentTerms o: EmploymentTerms.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

