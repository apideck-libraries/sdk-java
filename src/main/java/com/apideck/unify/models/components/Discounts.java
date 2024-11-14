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


public class Discounts {

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("product_id")
    private Optional<String> productId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonProperty("type")
    private OrderDiscountsType type;

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
    @JsonProperty("scope")
    private Optional<? extends OrderDiscountsScope> scope;

    @JsonCreator
    public Discounts(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("product_id") Optional<String> productId,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("type") OrderDiscountsType type,
            @JsonProperty("amount") Optional<Long> amount,
            @JsonProperty("currency") JsonNullable<? extends Currency> currency,
            @JsonProperty("scope") Optional<? extends OrderDiscountsScope> scope) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(productId, "productId");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(scope, "scope");
        this.id = id;
        this.productId = productId;
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.currency = currency;
        this.scope = scope;
    }
    
    public Discounts(
            OrderDiscountsType type) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), type, Optional.empty(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public Optional<String> productId() {
        return productId;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @JsonIgnore
    public OrderDiscountsType type() {
        return type;
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

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OrderDiscountsScope> scope() {
        return (Optional<OrderDiscountsScope>) scope;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique identifier for an object.
     */
    public Discounts withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Discounts withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Discounts withProductId(String productId) {
        Utils.checkNotNull(productId, "productId");
        this.productId = Optional.ofNullable(productId);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Discounts withProductId(Optional<String> productId) {
        Utils.checkNotNull(productId, "productId");
        this.productId = productId;
        return this;
    }

    public Discounts withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public Discounts withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public Discounts withType(OrderDiscountsType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public Discounts withAmount(long amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }

    public Discounts withAmount(Optional<Long> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public Discounts withCurrency(Currency currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = JsonNullable.of(currency);
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public Discounts withCurrency(JsonNullable<? extends Currency> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    public Discounts withScope(OrderDiscountsScope scope) {
        Utils.checkNotNull(scope, "scope");
        this.scope = Optional.ofNullable(scope);
        return this;
    }

    public Discounts withScope(Optional<? extends OrderDiscountsScope> scope) {
        Utils.checkNotNull(scope, "scope");
        this.scope = scope;
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
        Discounts other = (Discounts) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.productId, other.productId) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.scope, other.scope);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            productId,
            name,
            type,
            amount,
            currency,
            scope);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Discounts.class,
                "id", id,
                "productId", productId,
                "name", name,
                "type", type,
                "amount", amount,
                "currency", currency,
                "scope", scope);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> productId = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private OrderDiscountsType type;
 
        private Optional<Long> amount = Optional.empty();
 
        private JsonNullable<? extends Currency> currency = JsonNullable.undefined();
 
        private Optional<? extends OrderDiscountsScope> scope = Optional.empty();  
        
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

        /**
         * A unique identifier for an object.
         */
        public Builder productId(String productId) {
            Utils.checkNotNull(productId, "productId");
            this.productId = Optional.ofNullable(productId);
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder productId(Optional<String> productId) {
            Utils.checkNotNull(productId, "productId");
            this.productId = productId;
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

        public Builder type(OrderDiscountsType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
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

        public Builder scope(OrderDiscountsScope scope) {
            Utils.checkNotNull(scope, "scope");
            this.scope = Optional.ofNullable(scope);
            return this;
        }

        public Builder scope(Optional<? extends OrderDiscountsScope> scope) {
            Utils.checkNotNull(scope, "scope");
            this.scope = scope;
            return this;
        }
        
        public Discounts build() {
            return new Discounts(
                id,
                productId,
                name,
                type,
                amount,
                currency,
                scope);
        }
    }
}
