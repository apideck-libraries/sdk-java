/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * TheStartMonthOfFiscalYear - The start month of fiscal year.
 */
public enum TheStartMonthOfFiscalYear {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    @JsonValue
    private final String value;

    private TheStartMonthOfFiscalYear(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}