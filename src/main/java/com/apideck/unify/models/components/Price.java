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
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Price
 * 
 * <p>Price of the message.
 */
public class Price {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("per_unit")
    private Optional<String> perUnit;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_amount")
    private Optional<String> totalAmount;

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private JsonNullable<? extends Currency> currency;

    @JsonCreator
    public Price(
            @JsonProperty("per_unit") Optional<String> perUnit,
            @JsonProperty("total_amount") Optional<String> totalAmount,
            @JsonProperty("currency") JsonNullable<? extends Currency> currency) {
        Utils.checkNotNull(perUnit, "perUnit");
        Utils.checkNotNull(totalAmount, "totalAmount");
        Utils.checkNotNull(currency, "currency");
        this.perUnit = perUnit;
        this.totalAmount = totalAmount;
        this.currency = currency;
    }
    
    public Price() {
        this(Optional.empty(), Optional.empty(), JsonNullable.undefined());
    }

    @JsonIgnore
    public Optional<String> perUnit() {
        return perUnit;
    }

    @JsonIgnore
    public Optional<String> totalAmount() {
        return totalAmount;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Currency> currency() {
        return (JsonNullable<Currency>) currency;
    }

    public static Builder builder() {
        return new Builder();
    }


    public Price withPerUnit(String perUnit) {
        Utils.checkNotNull(perUnit, "perUnit");
        this.perUnit = Optional.ofNullable(perUnit);
        return this;
    }


    public Price withPerUnit(Optional<String> perUnit) {
        Utils.checkNotNull(perUnit, "perUnit");
        this.perUnit = perUnit;
        return this;
    }

    public Price withTotalAmount(String totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = Optional.ofNullable(totalAmount);
        return this;
    }


    public Price withTotalAmount(Optional<String> totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public Price withCurrency(Currency currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = JsonNullable.of(currency);
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public Price withCurrency(JsonNullable<? extends Currency> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
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
        Price other = (Price) o;
        return 
            Utils.enhancedDeepEquals(this.perUnit, other.perUnit) &&
            Utils.enhancedDeepEquals(this.totalAmount, other.totalAmount) &&
            Utils.enhancedDeepEquals(this.currency, other.currency);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            perUnit, totalAmount, currency);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Price.class,
                "perUnit", perUnit,
                "totalAmount", totalAmount,
                "currency", currency);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> perUnit = Optional.empty();

        private Optional<String> totalAmount = Optional.empty();

        private JsonNullable<? extends Currency> currency = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        public Builder perUnit(String perUnit) {
            Utils.checkNotNull(perUnit, "perUnit");
            this.perUnit = Optional.ofNullable(perUnit);
            return this;
        }

        public Builder perUnit(Optional<String> perUnit) {
            Utils.checkNotNull(perUnit, "perUnit");
            this.perUnit = perUnit;
            return this;
        }


        public Builder totalAmount(String totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = Optional.ofNullable(totalAmount);
            return this;
        }

        public Builder totalAmount(Optional<String> totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = totalAmount;
            return this;
        }


        /**
         * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
         */
        public Builder currency(Currency currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = JsonNullable.of(currency);
            return this;
        }

        /**
         * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
         */
        public Builder currency(JsonNullable<? extends Currency> currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
            return this;
        }

        public Price build() {

            return new Price(
                perUnit, totalAmount, currency);
        }

    }
}
