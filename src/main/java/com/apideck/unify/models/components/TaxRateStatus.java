/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * TaxRateStatus - Tax rate status
 */
public enum TaxRateStatus {
    ACTIVE("active"),
    INACTIVE("inactive"),
    ARCHIVED("archived");

    @JsonValue
    private final String value;

    private TaxRateStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<TaxRateStatus> fromValue(String value) {
        for (TaxRateStatus o: TaxRateStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
