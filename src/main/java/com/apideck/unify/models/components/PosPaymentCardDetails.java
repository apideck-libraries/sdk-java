/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;


import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class PosPaymentCardDetails {

    /**
     * A card's non-confidential details.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("card")
    private JsonNullable<? extends PaymentCardInput> card;

    @JsonCreator
    public PosPaymentCardDetails(
            @JsonProperty("card") JsonNullable<? extends PaymentCardInput> card) {
        Utils.checkNotNull(card, "card");
        this.card = card;
    }
    
    public PosPaymentCardDetails() {
        this(JsonNullable.undefined());
    }

    /**
     * A card's non-confidential details.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<PaymentCardInput> card() {
        return (JsonNullable<PaymentCardInput>) card;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A card's non-confidential details.
     */
    public PosPaymentCardDetails withCard(PaymentCardInput card) {
        Utils.checkNotNull(card, "card");
        this.card = JsonNullable.of(card);
        return this;
    }

    /**
     * A card's non-confidential details.
     */
    public PosPaymentCardDetails withCard(JsonNullable<? extends PaymentCardInput> card) {
        Utils.checkNotNull(card, "card");
        this.card = card;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PosPaymentCardDetails other = (PosPaymentCardDetails) o;
        return 
            Objects.deepEquals(this.card, other.card);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            card);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PosPaymentCardDetails.class,
                "card", card);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends PaymentCardInput> card = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A card's non-confidential details.
         */
        public Builder card(PaymentCardInput card) {
            Utils.checkNotNull(card, "card");
            this.card = JsonNullable.of(card);
            return this;
        }

        /**
         * A card's non-confidential details.
         */
        public Builder card(JsonNullable<? extends PaymentCardInput> card) {
            Utils.checkNotNull(card, "card");
            this.card = card;
            return this;
        }
        
        public PosPaymentCardDetails build() {
            return new PosPaymentCardDetails(
                card);
        }
    }
}
