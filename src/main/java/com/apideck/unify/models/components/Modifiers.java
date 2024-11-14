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
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class Modifiers {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("alternate_name")
    private Optional<String> alternateName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("price_amount")
    private Optional<Double> priceAmount;

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private JsonNullable<? extends Currency> currency;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("available")
    private JsonNullable<Boolean> available;

    @JsonCreator
    public Modifiers(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("alternate_name") Optional<String> alternateName,
            @JsonProperty("price_amount") Optional<Double> priceAmount,
            @JsonProperty("currency") JsonNullable<? extends Currency> currency,
            @JsonProperty("available") JsonNullable<Boolean> available) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(alternateName, "alternateName");
        Utils.checkNotNull(priceAmount, "priceAmount");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(available, "available");
        this.id = id;
        this.name = name;
        this.alternateName = alternateName;
        this.priceAmount = priceAmount;
        this.currency = currency;
        this.available = available;
    }
    
    public Modifiers() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @JsonIgnore
    public Optional<String> alternateName() {
        return alternateName;
    }

    @JsonIgnore
    public Optional<Double> priceAmount() {
        return priceAmount;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Currency> currency() {
        return (JsonNullable<Currency>) currency;
    }

    @JsonIgnore
    public JsonNullable<Boolean> available() {
        return available;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Modifiers withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public Modifiers withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Modifiers withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public Modifiers withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public Modifiers withAlternateName(String alternateName) {
        Utils.checkNotNull(alternateName, "alternateName");
        this.alternateName = Optional.ofNullable(alternateName);
        return this;
    }

    public Modifiers withAlternateName(Optional<String> alternateName) {
        Utils.checkNotNull(alternateName, "alternateName");
        this.alternateName = alternateName;
        return this;
    }

    public Modifiers withPriceAmount(double priceAmount) {
        Utils.checkNotNull(priceAmount, "priceAmount");
        this.priceAmount = Optional.ofNullable(priceAmount);
        return this;
    }

    public Modifiers withPriceAmount(Optional<Double> priceAmount) {
        Utils.checkNotNull(priceAmount, "priceAmount");
        this.priceAmount = priceAmount;
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public Modifiers withCurrency(Currency currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = JsonNullable.of(currency);
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public Modifiers withCurrency(JsonNullable<? extends Currency> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    public Modifiers withAvailable(boolean available) {
        Utils.checkNotNull(available, "available");
        this.available = JsonNullable.of(available);
        return this;
    }

    public Modifiers withAvailable(JsonNullable<Boolean> available) {
        Utils.checkNotNull(available, "available");
        this.available = available;
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
        Modifiers other = (Modifiers) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.alternateName, other.alternateName) &&
            Objects.deepEquals(this.priceAmount, other.priceAmount) &&
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.available, other.available);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            alternateName,
            priceAmount,
            currency,
            available);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Modifiers.class,
                "id", id,
                "name", name,
                "alternateName", alternateName,
                "priceAmount", priceAmount,
                "currency", currency,
                "available", available);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<String> alternateName = Optional.empty();
 
        private Optional<Double> priceAmount = Optional.empty();
 
        private JsonNullable<? extends Currency> currency = JsonNullable.undefined();
 
        private JsonNullable<Boolean> available = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder alternateName(String alternateName) {
            Utils.checkNotNull(alternateName, "alternateName");
            this.alternateName = Optional.ofNullable(alternateName);
            return this;
        }

        public Builder alternateName(Optional<String> alternateName) {
            Utils.checkNotNull(alternateName, "alternateName");
            this.alternateName = alternateName;
            return this;
        }

        public Builder priceAmount(double priceAmount) {
            Utils.checkNotNull(priceAmount, "priceAmount");
            this.priceAmount = Optional.ofNullable(priceAmount);
            return this;
        }

        public Builder priceAmount(Optional<Double> priceAmount) {
            Utils.checkNotNull(priceAmount, "priceAmount");
            this.priceAmount = priceAmount;
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

        public Builder available(boolean available) {
            Utils.checkNotNull(available, "available");
            this.available = JsonNullable.of(available);
            return this;
        }

        public Builder available(JsonNullable<Boolean> available) {
            Utils.checkNotNull(available, "available");
            this.available = available;
            return this;
        }
        
        public Modifiers build() {
            return new Modifiers(
                id,
                name,
                alternateName,
                priceAmount,
                currency,
                available);
        }
    }
}
