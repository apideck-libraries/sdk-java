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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class AppliedTaxes {

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tax_id")
    private Optional<String> taxId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<Long> amount;

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private JsonNullable<? extends Currency> currency;

    @JsonCreator
    public AppliedTaxes(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("tax_id") Optional<String> taxId,
            @JsonProperty("amount") Optional<Long> amount,
            @JsonProperty("currency") JsonNullable<? extends Currency> currency) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(taxId, "taxId");
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(currency, "currency");
        this.id = id;
        this.taxId = taxId;
        this.amount = amount;
        this.currency = currency;
    }
    
    public AppliedTaxes() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> taxId() {
        return taxId;
    }

    @JsonIgnore
    public Optional<Long> amount() {
        return amount;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Currency> currency() {
        return (JsonNullable<Currency>) currency;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique identifier for an object.
     */
    public AppliedTaxes withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public AppliedTaxes withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AppliedTaxes withTaxId(String taxId) {
        Utils.checkNotNull(taxId, "taxId");
        this.taxId = Optional.ofNullable(taxId);
        return this;
    }

    public AppliedTaxes withTaxId(Optional<String> taxId) {
        Utils.checkNotNull(taxId, "taxId");
        this.taxId = taxId;
        return this;
    }

    public AppliedTaxes withAmount(long amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }

    public AppliedTaxes withAmount(Optional<Long> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public AppliedTaxes withCurrency(Currency currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = JsonNullable.of(currency);
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public AppliedTaxes withCurrency(JsonNullable<? extends Currency> currency) {
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
        AppliedTaxes other = (AppliedTaxes) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.taxId, other.taxId) &&
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.currency, other.currency);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            taxId,
            amount,
            currency);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AppliedTaxes.class,
                "id", id,
                "taxId", taxId,
                "amount", amount,
                "currency", currency);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> taxId = Optional.empty();
 
        private Optional<Long> amount = Optional.empty();
 
        private JsonNullable<? extends Currency> currency = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A unique identifier for an object.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder taxId(String taxId) {
            Utils.checkNotNull(taxId, "taxId");
            this.taxId = Optional.ofNullable(taxId);
            return this;
        }

        public Builder taxId(Optional<String> taxId) {
            Utils.checkNotNull(taxId, "taxId");
            this.taxId = taxId;
            return this;
        }

        public Builder amount(long amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }

        public Builder amount(Optional<Long> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
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
        
        public AppliedTaxes build() {
            return new AppliedTaxes(
                id,
                taxId,
                amount,
                currency);
        }
    }
}

