/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * PeriodType - The type of period to include in the resource: month, quarter, year.
 */
public enum PeriodType {
    MONTH("month"),
    QUARTER("quarter"),
    YEAR("year");

    @JsonValue
    private final String value;

    private PeriodType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PeriodType> fromValue(String value) {
        for (PeriodType o: PeriodType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
