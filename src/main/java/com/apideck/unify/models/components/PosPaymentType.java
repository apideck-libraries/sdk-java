/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * PosPaymentType - The type of external payment the seller received. It can be one of the following:
 * - CHECK - Paid using a physical check.
 * - BANK_TRANSFER - Paid using external bank transfer.
 * - OTHER\_GIFT\_CARD - Paid using a non-Square gift card.
 * - CRYPTO - Paid using a crypto currency.
 * - SQUARE_CASH - Paid using Square Cash App.
 * - SOCIAL - Paid using peer-to-peer payment applications.
 * - EXTERNAL - A third-party application gathered this payment outside of Square.
 * - EMONEY - Paid using an E-money provider.
 * - CARD - A credit or debit card that Square does not support.
 * - STORED_BALANCE - Use for house accounts, store credit, and so forth.
 * - FOOD_VOUCHER - Restaurant voucher provided by employers to employees to pay for meals
 * - OTHER - A type not listed here.
 */
public enum PosPaymentType {
    CHECK("check"),
    BANK_TRANSFER("bank_transfer"),
    OTHER_GIFT_CARD("other_gift_card"),
    CRYPTO("crypto"),
    SQUARE_CASH("square_cash"),
    SOCIAL("social"),
    EXTERNAL("external"),
    EMONEY("emoney"),
    CARD("card"),
    STORED_BALANCE("stored_balance"),
    FOOD_VOUCHER("food_voucher"),
    OTHER("other");

    @JsonValue
    private final String value;

    private PosPaymentType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}