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
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class ModifierInput {

    /**
     * A value you specify that uniquely identifies this request among requests you have sent.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("idempotency_key")
    private Optional<String> idempotencyKey;

    @JsonProperty("name")
    private String name;

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

    @JsonProperty("modifier_group_id")
    private String modifierGroupId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("available")
    private JsonNullable<Boolean> available;

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pass_through")
    private Optional<? extends List<PassThroughBody>> passThrough;

    @JsonCreator
    public ModifierInput(
            @JsonProperty("idempotency_key") Optional<String> idempotencyKey,
            @JsonProperty("name") String name,
            @JsonProperty("alternate_name") Optional<String> alternateName,
            @JsonProperty("price_amount") Optional<Double> priceAmount,
            @JsonProperty("currency") JsonNullable<? extends Currency> currency,
            @JsonProperty("modifier_group_id") String modifierGroupId,
            @JsonProperty("available") JsonNullable<Boolean> available,
            @JsonProperty("pass_through") Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(alternateName, "alternateName");
        Utils.checkNotNull(priceAmount, "priceAmount");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(modifierGroupId, "modifierGroupId");
        Utils.checkNotNull(available, "available");
        Utils.checkNotNull(passThrough, "passThrough");
        this.idempotencyKey = idempotencyKey;
        this.name = name;
        this.alternateName = alternateName;
        this.priceAmount = priceAmount;
        this.currency = currency;
        this.modifierGroupId = modifierGroupId;
        this.available = available;
        this.passThrough = passThrough;
    }
    
    public ModifierInput(
            String name,
            String modifierGroupId) {
        this(Optional.empty(), name, Optional.empty(), Optional.empty(), JsonNullable.undefined(), modifierGroupId, JsonNullable.undefined(), Optional.empty());
    }

    /**
     * A value you specify that uniquely identifies this request among requests you have sent.
     */
    @JsonIgnore
    public Optional<String> idempotencyKey() {
        return idempotencyKey;
    }

    @JsonIgnore
    public String name() {
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
    public String modifierGroupId() {
        return modifierGroupId;
    }

    @JsonIgnore
    public JsonNullable<Boolean> available() {
        return available;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<PassThroughBody>> passThrough() {
        return (Optional<List<PassThroughBody>>) passThrough;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A value you specify that uniquely identifies this request among requests you have sent.
     */
    public ModifierInput withIdempotencyKey(String idempotencyKey) {
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        this.idempotencyKey = Optional.ofNullable(idempotencyKey);
        return this;
    }

    /**
     * A value you specify that uniquely identifies this request among requests you have sent.
     */
    public ModifierInput withIdempotencyKey(Optional<String> idempotencyKey) {
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        this.idempotencyKey = idempotencyKey;
        return this;
    }

    public ModifierInput withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public ModifierInput withAlternateName(String alternateName) {
        Utils.checkNotNull(alternateName, "alternateName");
        this.alternateName = Optional.ofNullable(alternateName);
        return this;
    }

    public ModifierInput withAlternateName(Optional<String> alternateName) {
        Utils.checkNotNull(alternateName, "alternateName");
        this.alternateName = alternateName;
        return this;
    }

    public ModifierInput withPriceAmount(double priceAmount) {
        Utils.checkNotNull(priceAmount, "priceAmount");
        this.priceAmount = Optional.ofNullable(priceAmount);
        return this;
    }

    public ModifierInput withPriceAmount(Optional<Double> priceAmount) {
        Utils.checkNotNull(priceAmount, "priceAmount");
        this.priceAmount = priceAmount;
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public ModifierInput withCurrency(Currency currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = JsonNullable.of(currency);
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public ModifierInput withCurrency(JsonNullable<? extends Currency> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    public ModifierInput withModifierGroupId(String modifierGroupId) {
        Utils.checkNotNull(modifierGroupId, "modifierGroupId");
        this.modifierGroupId = modifierGroupId;
        return this;
    }

    public ModifierInput withAvailable(boolean available) {
        Utils.checkNotNull(available, "available");
        this.available = JsonNullable.of(available);
        return this;
    }

    public ModifierInput withAvailable(JsonNullable<Boolean> available) {
        Utils.checkNotNull(available, "available");
        this.available = available;
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public ModifierInput withPassThrough(List<PassThroughBody> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public ModifierInput withPassThrough(Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = passThrough;
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
        ModifierInput other = (ModifierInput) o;
        return 
            Objects.deepEquals(this.idempotencyKey, other.idempotencyKey) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.alternateName, other.alternateName) &&
            Objects.deepEquals(this.priceAmount, other.priceAmount) &&
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.modifierGroupId, other.modifierGroupId) &&
            Objects.deepEquals(this.available, other.available) &&
            Objects.deepEquals(this.passThrough, other.passThrough);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            idempotencyKey,
            name,
            alternateName,
            priceAmount,
            currency,
            modifierGroupId,
            available,
            passThrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ModifierInput.class,
                "idempotencyKey", idempotencyKey,
                "name", name,
                "alternateName", alternateName,
                "priceAmount", priceAmount,
                "currency", currency,
                "modifierGroupId", modifierGroupId,
                "available", available,
                "passThrough", passThrough);
    }
    
    public final static class Builder {
 
        private Optional<String> idempotencyKey = Optional.empty();
 
        private String name;
 
        private Optional<String> alternateName = Optional.empty();
 
        private Optional<Double> priceAmount = Optional.empty();
 
        private JsonNullable<? extends Currency> currency = JsonNullable.undefined();
 
        private String modifierGroupId;
 
        private JsonNullable<Boolean> available = JsonNullable.undefined();
 
        private Optional<? extends List<PassThroughBody>> passThrough = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A value you specify that uniquely identifies this request among requests you have sent.
         */
        public Builder idempotencyKey(String idempotencyKey) {
            Utils.checkNotNull(idempotencyKey, "idempotencyKey");
            this.idempotencyKey = Optional.ofNullable(idempotencyKey);
            return this;
        }

        /**
         * A value you specify that uniquely identifies this request among requests you have sent.
         */
        public Builder idempotencyKey(Optional<String> idempotencyKey) {
            Utils.checkNotNull(idempotencyKey, "idempotencyKey");
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        public Builder name(String name) {
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

        public Builder modifierGroupId(String modifierGroupId) {
            Utils.checkNotNull(modifierGroupId, "modifierGroupId");
            this.modifierGroupId = modifierGroupId;
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

        /**
         * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
         */
        public Builder passThrough(List<PassThroughBody> passThrough) {
            Utils.checkNotNull(passThrough, "passThrough");
            this.passThrough = Optional.ofNullable(passThrough);
            return this;
        }

        /**
         * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
         */
        public Builder passThrough(Optional<? extends List<PassThroughBody>> passThrough) {
            Utils.checkNotNull(passThrough, "passThrough");
            this.passThrough = passThrough;
            return this;
        }
        
        public ModifierInput build() {
            return new ModifierInput(
                idempotencyKey,
                name,
                alternateName,
                priceAmount,
                currency,
                modifierGroupId,
                available,
                passThrough);
        }
    }
}
