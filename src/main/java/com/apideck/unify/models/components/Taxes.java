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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class Taxes {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * The tax's name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<Long> amount;

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private JsonNullable<? extends Currency> currency;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("percentage")
    private Optional<Double> percentage;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scope")
    private Optional<? extends OrderScope> scope;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends OrderTaxesType> type;

    /**
     * Square-only: Determines whether the tax was automatically applied to the order based on the catalog configuration. For an example, see Automatically Apply Taxes to an Order. [https://developer.squareup.com/docs/orders-api/apply-taxes-and-discounts/auto-apply-taxes]()
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auto_applied")
    private Optional<Boolean> autoApplied;

    @JsonCreator
    public Taxes(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("amount") Optional<Long> amount,
            @JsonProperty("currency") JsonNullable<? extends Currency> currency,
            @JsonProperty("percentage") Optional<Double> percentage,
            @JsonProperty("scope") Optional<? extends OrderScope> scope,
            @JsonProperty("type") Optional<? extends OrderTaxesType> type,
            @JsonProperty("auto_applied") Optional<Boolean> autoApplied) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(percentage, "percentage");
        Utils.checkNotNull(scope, "scope");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(autoApplied, "autoApplied");
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.currency = currency;
        this.percentage = percentage;
        this.scope = scope;
        this.type = type;
        this.autoApplied = autoApplied;
    }
    
    public Taxes() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * The tax's name.
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
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

    @JsonIgnore
    public Optional<Double> percentage() {
        return percentage;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OrderScope> scope() {
        return (Optional<OrderScope>) scope;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OrderTaxesType> type() {
        return (Optional<OrderTaxesType>) type;
    }

    /**
     * Square-only: Determines whether the tax was automatically applied to the order based on the catalog configuration. For an example, see Automatically Apply Taxes to an Order. [https://developer.squareup.com/docs/orders-api/apply-taxes-and-discounts/auto-apply-taxes]()
     */
    @JsonIgnore
    public Optional<Boolean> autoApplied() {
        return autoApplied;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Taxes withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public Taxes withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The tax's name.
     */
    public Taxes withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The tax's name.
     */
    public Taxes withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public Taxes withAmount(long amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }

    public Taxes withAmount(Optional<Long> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public Taxes withCurrency(Currency currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = JsonNullable.of(currency);
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public Taxes withCurrency(JsonNullable<? extends Currency> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    public Taxes withPercentage(double percentage) {
        Utils.checkNotNull(percentage, "percentage");
        this.percentage = Optional.ofNullable(percentage);
        return this;
    }

    public Taxes withPercentage(Optional<Double> percentage) {
        Utils.checkNotNull(percentage, "percentage");
        this.percentage = percentage;
        return this;
    }

    public Taxes withScope(OrderScope scope) {
        Utils.checkNotNull(scope, "scope");
        this.scope = Optional.ofNullable(scope);
        return this;
    }

    public Taxes withScope(Optional<? extends OrderScope> scope) {
        Utils.checkNotNull(scope, "scope");
        this.scope = scope;
        return this;
    }

    public Taxes withType(OrderTaxesType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public Taxes withType(Optional<? extends OrderTaxesType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Square-only: Determines whether the tax was automatically applied to the order based on the catalog configuration. For an example, see Automatically Apply Taxes to an Order. [https://developer.squareup.com/docs/orders-api/apply-taxes-and-discounts/auto-apply-taxes]()
     */
    public Taxes withAutoApplied(boolean autoApplied) {
        Utils.checkNotNull(autoApplied, "autoApplied");
        this.autoApplied = Optional.ofNullable(autoApplied);
        return this;
    }

    /**
     * Square-only: Determines whether the tax was automatically applied to the order based on the catalog configuration. For an example, see Automatically Apply Taxes to an Order. [https://developer.squareup.com/docs/orders-api/apply-taxes-and-discounts/auto-apply-taxes]()
     */
    public Taxes withAutoApplied(Optional<Boolean> autoApplied) {
        Utils.checkNotNull(autoApplied, "autoApplied");
        this.autoApplied = autoApplied;
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
        Taxes other = (Taxes) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.percentage, other.percentage) &&
            Objects.deepEquals(this.scope, other.scope) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.autoApplied, other.autoApplied);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            amount,
            currency,
            percentage,
            scope,
            type,
            autoApplied);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Taxes.class,
                "id", id,
                "name", name,
                "amount", amount,
                "currency", currency,
                "percentage", percentage,
                "scope", scope,
                "type", type,
                "autoApplied", autoApplied);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<Long> amount = Optional.empty();
 
        private JsonNullable<? extends Currency> currency = JsonNullable.undefined();
 
        private Optional<Double> percentage = Optional.empty();
 
        private Optional<? extends OrderScope> scope = Optional.empty();
 
        private Optional<? extends OrderTaxesType> type = Optional.empty();
 
        private Optional<Boolean> autoApplied = Optional.empty();  
        
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

        /**
         * The tax's name.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * The tax's name.
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
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

        public Builder percentage(double percentage) {
            Utils.checkNotNull(percentage, "percentage");
            this.percentage = Optional.ofNullable(percentage);
            return this;
        }

        public Builder percentage(Optional<Double> percentage) {
            Utils.checkNotNull(percentage, "percentage");
            this.percentage = percentage;
            return this;
        }

        public Builder scope(OrderScope scope) {
            Utils.checkNotNull(scope, "scope");
            this.scope = Optional.ofNullable(scope);
            return this;
        }

        public Builder scope(Optional<? extends OrderScope> scope) {
            Utils.checkNotNull(scope, "scope");
            this.scope = scope;
            return this;
        }

        public Builder type(OrderTaxesType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends OrderTaxesType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Square-only: Determines whether the tax was automatically applied to the order based on the catalog configuration. For an example, see Automatically Apply Taxes to an Order. [https://developer.squareup.com/docs/orders-api/apply-taxes-and-discounts/auto-apply-taxes]()
         */
        public Builder autoApplied(boolean autoApplied) {
            Utils.checkNotNull(autoApplied, "autoApplied");
            this.autoApplied = Optional.ofNullable(autoApplied);
            return this;
        }

        /**
         * Square-only: Determines whether the tax was automatically applied to the order based on the catalog configuration. For an example, see Automatically Apply Taxes to an Order. [https://developer.squareup.com/docs/orders-api/apply-taxes-and-discounts/auto-apply-taxes]()
         */
        public Builder autoApplied(Optional<Boolean> autoApplied) {
            Utils.checkNotNull(autoApplied, "autoApplied");
            this.autoApplied = autoApplied;
            return this;
        }
        
        public Taxes build() {
            return new Taxes(
                id,
                name,
                amount,
                currency,
                percentage,
                scope,
                type,
                autoApplied);
        }
    }
}

