/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * LedgerAccountType
 * 
 * <p>The type of account.
 */
public enum LedgerAccountType {
    ACCOUNTS_RECEIVABLE("accounts_receivable"),
    REVENUE("revenue"),
    SALES("sales"),
    OTHER_INCOME("other_income"),
    BANK("bank"),
    CURRENT_ASSET("current_asset"),
    FIXED_ASSET("fixed_asset"),
    NON_CURRENT_ASSET("non_current_asset"),
    OTHER_ASSET("other_asset"),
    BALANCESHEET("balancesheet"),
    EQUITY("equity"),
    EXPENSE("expense"),
    OTHER_EXPENSE("other_expense"),
    COSTS_OF_SALES("costs_of_sales"),
    ACCOUNTS_PAYABLE("accounts_payable"),
    CREDIT_CARD("credit_card"),
    CURRENT_LIABILITY("current_liability"),
    NON_CURRENT_LIABILITY("non_current_liability"),
    OTHER_LIABILITY("other_liability"),
    OTHER("other");

    @JsonValue
    private final String value;

    LedgerAccountType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<LedgerAccountType> fromValue(String value) {
        for (LedgerAccountType o: LedgerAccountType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

