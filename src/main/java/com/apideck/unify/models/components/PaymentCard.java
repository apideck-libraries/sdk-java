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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * PaymentCard - A card's non-confidential details.
 */

public class PaymentCard {

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * The first six digits of the card number, known as the Bank Identification Number (BIN).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bin")
    private JsonNullable<String> bin;

    /**
     * The first six digits of the card number, known as the Bank Identification Number (BIN).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("card_brand")
    private JsonNullable<? extends CardBrand> cardBrand;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("card_type")
    private JsonNullable<? extends CardType> cardType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prepaid_type")
    private JsonNullable<? extends PrepaidType> prepaidType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cardholder_name")
    private JsonNullable<String> cardholderName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_id")
    private JsonNullable<String> customerId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("merchant_id")
    private Optional<String> merchantId;

    /**
     * The expiration month of the associated card as an integer between 1 and 12.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("exp_month")
    private JsonNullable<Long> expMonth;

    /**
     * The four-digit year of the card's expiration date.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("exp_year")
    private JsonNullable<Long> expYear;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fingerprint")
    private JsonNullable<String> fingerprint;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_4")
    private JsonNullable<String> last4;

    /**
     * Indicates whether or not a card can be used for payments.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enabled")
    private JsonNullable<Boolean> enabled;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("billing_address")
    private Optional<? extends Address> billingAddress;

    /**
     * An optional user-defined reference ID that associates this record with another entity in an external system. For example, a customer ID from an external customer management system.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference_id")
    private JsonNullable<String> referenceId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("version")
    private JsonNullable<String> version;

    @JsonCreator
    public PaymentCard(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("bin") JsonNullable<String> bin,
            @JsonProperty("card_brand") JsonNullable<? extends CardBrand> cardBrand,
            @JsonProperty("card_type") JsonNullable<? extends CardType> cardType,
            @JsonProperty("prepaid_type") JsonNullable<? extends PrepaidType> prepaidType,
            @JsonProperty("cardholder_name") JsonNullable<String> cardholderName,
            @JsonProperty("customer_id") JsonNullable<String> customerId,
            @JsonProperty("merchant_id") Optional<String> merchantId,
            @JsonProperty("exp_month") JsonNullable<Long> expMonth,
            @JsonProperty("exp_year") JsonNullable<Long> expYear,
            @JsonProperty("fingerprint") JsonNullable<String> fingerprint,
            @JsonProperty("last_4") JsonNullable<String> last4,
            @JsonProperty("enabled") JsonNullable<Boolean> enabled,
            @JsonProperty("billing_address") Optional<? extends Address> billingAddress,
            @JsonProperty("reference_id") JsonNullable<String> referenceId,
            @JsonProperty("version") JsonNullable<String> version) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(bin, "bin");
        Utils.checkNotNull(cardBrand, "cardBrand");
        Utils.checkNotNull(cardType, "cardType");
        Utils.checkNotNull(prepaidType, "prepaidType");
        Utils.checkNotNull(cardholderName, "cardholderName");
        Utils.checkNotNull(customerId, "customerId");
        Utils.checkNotNull(merchantId, "merchantId");
        Utils.checkNotNull(expMonth, "expMonth");
        Utils.checkNotNull(expYear, "expYear");
        Utils.checkNotNull(fingerprint, "fingerprint");
        Utils.checkNotNull(last4, "last4");
        Utils.checkNotNull(enabled, "enabled");
        Utils.checkNotNull(billingAddress, "billingAddress");
        Utils.checkNotNull(referenceId, "referenceId");
        Utils.checkNotNull(version, "version");
        this.id = id;
        this.bin = bin;
        this.cardBrand = cardBrand;
        this.cardType = cardType;
        this.prepaidType = prepaidType;
        this.cardholderName = cardholderName;
        this.customerId = customerId;
        this.merchantId = merchantId;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.fingerprint = fingerprint;
        this.last4 = last4;
        this.enabled = enabled;
        this.billingAddress = billingAddress;
        this.referenceId = referenceId;
        this.version = version;
    }
    
    public PaymentCard() {
        this(Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * The first six digits of the card number, known as the Bank Identification Number (BIN).
     */
    @JsonIgnore
    public JsonNullable<String> bin() {
        return bin;
    }

    /**
     * The first six digits of the card number, known as the Bank Identification Number (BIN).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<CardBrand> cardBrand() {
        return (JsonNullable<CardBrand>) cardBrand;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<CardType> cardType() {
        return (JsonNullable<CardType>) cardType;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<PrepaidType> prepaidType() {
        return (JsonNullable<PrepaidType>) prepaidType;
    }

    @JsonIgnore
    public JsonNullable<String> cardholderName() {
        return cardholderName;
    }

    @JsonIgnore
    public JsonNullable<String> customerId() {
        return customerId;
    }

    @JsonIgnore
    public Optional<String> merchantId() {
        return merchantId;
    }

    /**
     * The expiration month of the associated card as an integer between 1 and 12.
     */
    @JsonIgnore
    public JsonNullable<Long> expMonth() {
        return expMonth;
    }

    /**
     * The four-digit year of the card's expiration date.
     */
    @JsonIgnore
    public JsonNullable<Long> expYear() {
        return expYear;
    }

    @JsonIgnore
    public JsonNullable<String> fingerprint() {
        return fingerprint;
    }

    @JsonIgnore
    public JsonNullable<String> last4() {
        return last4;
    }

    /**
     * Indicates whether or not a card can be used for payments.
     */
    @JsonIgnore
    public JsonNullable<Boolean> enabled() {
        return enabled;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Address> billingAddress() {
        return (Optional<Address>) billingAddress;
    }

    /**
     * An optional user-defined reference ID that associates this record with another entity in an external system. For example, a customer ID from an external customer management system.
     */
    @JsonIgnore
    public JsonNullable<String> referenceId() {
        return referenceId;
    }

    @JsonIgnore
    public JsonNullable<String> version() {
        return version;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique identifier for an object.
     */
    public PaymentCard withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public PaymentCard withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The first six digits of the card number, known as the Bank Identification Number (BIN).
     */
    public PaymentCard withBin(String bin) {
        Utils.checkNotNull(bin, "bin");
        this.bin = JsonNullable.of(bin);
        return this;
    }

    /**
     * The first six digits of the card number, known as the Bank Identification Number (BIN).
     */
    public PaymentCard withBin(JsonNullable<String> bin) {
        Utils.checkNotNull(bin, "bin");
        this.bin = bin;
        return this;
    }

    /**
     * The first six digits of the card number, known as the Bank Identification Number (BIN).
     */
    public PaymentCard withCardBrand(CardBrand cardBrand) {
        Utils.checkNotNull(cardBrand, "cardBrand");
        this.cardBrand = JsonNullable.of(cardBrand);
        return this;
    }

    /**
     * The first six digits of the card number, known as the Bank Identification Number (BIN).
     */
    public PaymentCard withCardBrand(JsonNullable<? extends CardBrand> cardBrand) {
        Utils.checkNotNull(cardBrand, "cardBrand");
        this.cardBrand = cardBrand;
        return this;
    }

    public PaymentCard withCardType(CardType cardType) {
        Utils.checkNotNull(cardType, "cardType");
        this.cardType = JsonNullable.of(cardType);
        return this;
    }

    public PaymentCard withCardType(JsonNullable<? extends CardType> cardType) {
        Utils.checkNotNull(cardType, "cardType");
        this.cardType = cardType;
        return this;
    }

    public PaymentCard withPrepaidType(PrepaidType prepaidType) {
        Utils.checkNotNull(prepaidType, "prepaidType");
        this.prepaidType = JsonNullable.of(prepaidType);
        return this;
    }

    public PaymentCard withPrepaidType(JsonNullable<? extends PrepaidType> prepaidType) {
        Utils.checkNotNull(prepaidType, "prepaidType");
        this.prepaidType = prepaidType;
        return this;
    }

    public PaymentCard withCardholderName(String cardholderName) {
        Utils.checkNotNull(cardholderName, "cardholderName");
        this.cardholderName = JsonNullable.of(cardholderName);
        return this;
    }

    public PaymentCard withCardholderName(JsonNullable<String> cardholderName) {
        Utils.checkNotNull(cardholderName, "cardholderName");
        this.cardholderName = cardholderName;
        return this;
    }

    public PaymentCard withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = JsonNullable.of(customerId);
        return this;
    }

    public PaymentCard withCustomerId(JsonNullable<String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }

    public PaymentCard withMerchantId(String merchantId) {
        Utils.checkNotNull(merchantId, "merchantId");
        this.merchantId = Optional.ofNullable(merchantId);
        return this;
    }

    public PaymentCard withMerchantId(Optional<String> merchantId) {
        Utils.checkNotNull(merchantId, "merchantId");
        this.merchantId = merchantId;
        return this;
    }

    /**
     * The expiration month of the associated card as an integer between 1 and 12.
     */
    public PaymentCard withExpMonth(long expMonth) {
        Utils.checkNotNull(expMonth, "expMonth");
        this.expMonth = JsonNullable.of(expMonth);
        return this;
    }

    /**
     * The expiration month of the associated card as an integer between 1 and 12.
     */
    public PaymentCard withExpMonth(JsonNullable<Long> expMonth) {
        Utils.checkNotNull(expMonth, "expMonth");
        this.expMonth = expMonth;
        return this;
    }

    /**
     * The four-digit year of the card's expiration date.
     */
    public PaymentCard withExpYear(long expYear) {
        Utils.checkNotNull(expYear, "expYear");
        this.expYear = JsonNullable.of(expYear);
        return this;
    }

    /**
     * The four-digit year of the card's expiration date.
     */
    public PaymentCard withExpYear(JsonNullable<Long> expYear) {
        Utils.checkNotNull(expYear, "expYear");
        this.expYear = expYear;
        return this;
    }

    public PaymentCard withFingerprint(String fingerprint) {
        Utils.checkNotNull(fingerprint, "fingerprint");
        this.fingerprint = JsonNullable.of(fingerprint);
        return this;
    }

    public PaymentCard withFingerprint(JsonNullable<String> fingerprint) {
        Utils.checkNotNull(fingerprint, "fingerprint");
        this.fingerprint = fingerprint;
        return this;
    }

    public PaymentCard withLast4(String last4) {
        Utils.checkNotNull(last4, "last4");
        this.last4 = JsonNullable.of(last4);
        return this;
    }

    public PaymentCard withLast4(JsonNullable<String> last4) {
        Utils.checkNotNull(last4, "last4");
        this.last4 = last4;
        return this;
    }

    /**
     * Indicates whether or not a card can be used for payments.
     */
    public PaymentCard withEnabled(boolean enabled) {
        Utils.checkNotNull(enabled, "enabled");
        this.enabled = JsonNullable.of(enabled);
        return this;
    }

    /**
     * Indicates whether or not a card can be used for payments.
     */
    public PaymentCard withEnabled(JsonNullable<Boolean> enabled) {
        Utils.checkNotNull(enabled, "enabled");
        this.enabled = enabled;
        return this;
    }

    public PaymentCard withBillingAddress(Address billingAddress) {
        Utils.checkNotNull(billingAddress, "billingAddress");
        this.billingAddress = Optional.ofNullable(billingAddress);
        return this;
    }

    public PaymentCard withBillingAddress(Optional<? extends Address> billingAddress) {
        Utils.checkNotNull(billingAddress, "billingAddress");
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     * An optional user-defined reference ID that associates this record with another entity in an external system. For example, a customer ID from an external customer management system.
     */
    public PaymentCard withReferenceId(String referenceId) {
        Utils.checkNotNull(referenceId, "referenceId");
        this.referenceId = JsonNullable.of(referenceId);
        return this;
    }

    /**
     * An optional user-defined reference ID that associates this record with another entity in an external system. For example, a customer ID from an external customer management system.
     */
    public PaymentCard withReferenceId(JsonNullable<String> referenceId) {
        Utils.checkNotNull(referenceId, "referenceId");
        this.referenceId = referenceId;
        return this;
    }

    public PaymentCard withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = JsonNullable.of(version);
        return this;
    }

    public PaymentCard withVersion(JsonNullable<String> version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
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
        PaymentCard other = (PaymentCard) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.bin, other.bin) &&
            Objects.deepEquals(this.cardBrand, other.cardBrand) &&
            Objects.deepEquals(this.cardType, other.cardType) &&
            Objects.deepEquals(this.prepaidType, other.prepaidType) &&
            Objects.deepEquals(this.cardholderName, other.cardholderName) &&
            Objects.deepEquals(this.customerId, other.customerId) &&
            Objects.deepEquals(this.merchantId, other.merchantId) &&
            Objects.deepEquals(this.expMonth, other.expMonth) &&
            Objects.deepEquals(this.expYear, other.expYear) &&
            Objects.deepEquals(this.fingerprint, other.fingerprint) &&
            Objects.deepEquals(this.last4, other.last4) &&
            Objects.deepEquals(this.enabled, other.enabled) &&
            Objects.deepEquals(this.billingAddress, other.billingAddress) &&
            Objects.deepEquals(this.referenceId, other.referenceId) &&
            Objects.deepEquals(this.version, other.version);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            bin,
            cardBrand,
            cardType,
            prepaidType,
            cardholderName,
            customerId,
            merchantId,
            expMonth,
            expYear,
            fingerprint,
            last4,
            enabled,
            billingAddress,
            referenceId,
            version);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaymentCard.class,
                "id", id,
                "bin", bin,
                "cardBrand", cardBrand,
                "cardType", cardType,
                "prepaidType", prepaidType,
                "cardholderName", cardholderName,
                "customerId", customerId,
                "merchantId", merchantId,
                "expMonth", expMonth,
                "expYear", expYear,
                "fingerprint", fingerprint,
                "last4", last4,
                "enabled", enabled,
                "billingAddress", billingAddress,
                "referenceId", referenceId,
                "version", version);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private JsonNullable<String> bin = JsonNullable.undefined();
 
        private JsonNullable<? extends CardBrand> cardBrand = JsonNullable.undefined();
 
        private JsonNullable<? extends CardType> cardType = JsonNullable.undefined();
 
        private JsonNullable<? extends PrepaidType> prepaidType = JsonNullable.undefined();
 
        private JsonNullable<String> cardholderName = JsonNullable.undefined();
 
        private JsonNullable<String> customerId = JsonNullable.undefined();
 
        private Optional<String> merchantId = Optional.empty();
 
        private JsonNullable<Long> expMonth = JsonNullable.undefined();
 
        private JsonNullable<Long> expYear = JsonNullable.undefined();
 
        private JsonNullable<String> fingerprint = JsonNullable.undefined();
 
        private JsonNullable<String> last4 = JsonNullable.undefined();
 
        private JsonNullable<Boolean> enabled = JsonNullable.undefined();
 
        private Optional<? extends Address> billingAddress = Optional.empty();
 
        private JsonNullable<String> referenceId = JsonNullable.undefined();
 
        private JsonNullable<String> version = JsonNullable.undefined();  
        
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
         * The first six digits of the card number, known as the Bank Identification Number (BIN).
         */
        public Builder bin(String bin) {
            Utils.checkNotNull(bin, "bin");
            this.bin = JsonNullable.of(bin);
            return this;
        }

        /**
         * The first six digits of the card number, known as the Bank Identification Number (BIN).
         */
        public Builder bin(JsonNullable<String> bin) {
            Utils.checkNotNull(bin, "bin");
            this.bin = bin;
            return this;
        }

        /**
         * The first six digits of the card number, known as the Bank Identification Number (BIN).
         */
        public Builder cardBrand(CardBrand cardBrand) {
            Utils.checkNotNull(cardBrand, "cardBrand");
            this.cardBrand = JsonNullable.of(cardBrand);
            return this;
        }

        /**
         * The first six digits of the card number, known as the Bank Identification Number (BIN).
         */
        public Builder cardBrand(JsonNullable<? extends CardBrand> cardBrand) {
            Utils.checkNotNull(cardBrand, "cardBrand");
            this.cardBrand = cardBrand;
            return this;
        }

        public Builder cardType(CardType cardType) {
            Utils.checkNotNull(cardType, "cardType");
            this.cardType = JsonNullable.of(cardType);
            return this;
        }

        public Builder cardType(JsonNullable<? extends CardType> cardType) {
            Utils.checkNotNull(cardType, "cardType");
            this.cardType = cardType;
            return this;
        }

        public Builder prepaidType(PrepaidType prepaidType) {
            Utils.checkNotNull(prepaidType, "prepaidType");
            this.prepaidType = JsonNullable.of(prepaidType);
            return this;
        }

        public Builder prepaidType(JsonNullable<? extends PrepaidType> prepaidType) {
            Utils.checkNotNull(prepaidType, "prepaidType");
            this.prepaidType = prepaidType;
            return this;
        }

        public Builder cardholderName(String cardholderName) {
            Utils.checkNotNull(cardholderName, "cardholderName");
            this.cardholderName = JsonNullable.of(cardholderName);
            return this;
        }

        public Builder cardholderName(JsonNullable<String> cardholderName) {
            Utils.checkNotNull(cardholderName, "cardholderName");
            this.cardholderName = cardholderName;
            return this;
        }

        public Builder customerId(String customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = JsonNullable.of(customerId);
            return this;
        }

        public Builder customerId(JsonNullable<String> customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = customerId;
            return this;
        }

        public Builder merchantId(String merchantId) {
            Utils.checkNotNull(merchantId, "merchantId");
            this.merchantId = Optional.ofNullable(merchantId);
            return this;
        }

        public Builder merchantId(Optional<String> merchantId) {
            Utils.checkNotNull(merchantId, "merchantId");
            this.merchantId = merchantId;
            return this;
        }

        /**
         * The expiration month of the associated card as an integer between 1 and 12.
         */
        public Builder expMonth(long expMonth) {
            Utils.checkNotNull(expMonth, "expMonth");
            this.expMonth = JsonNullable.of(expMonth);
            return this;
        }

        /**
         * The expiration month of the associated card as an integer between 1 and 12.
         */
        public Builder expMonth(JsonNullable<Long> expMonth) {
            Utils.checkNotNull(expMonth, "expMonth");
            this.expMonth = expMonth;
            return this;
        }

        /**
         * The four-digit year of the card's expiration date.
         */
        public Builder expYear(long expYear) {
            Utils.checkNotNull(expYear, "expYear");
            this.expYear = JsonNullable.of(expYear);
            return this;
        }

        /**
         * The four-digit year of the card's expiration date.
         */
        public Builder expYear(JsonNullable<Long> expYear) {
            Utils.checkNotNull(expYear, "expYear");
            this.expYear = expYear;
            return this;
        }

        public Builder fingerprint(String fingerprint) {
            Utils.checkNotNull(fingerprint, "fingerprint");
            this.fingerprint = JsonNullable.of(fingerprint);
            return this;
        }

        public Builder fingerprint(JsonNullable<String> fingerprint) {
            Utils.checkNotNull(fingerprint, "fingerprint");
            this.fingerprint = fingerprint;
            return this;
        }

        public Builder last4(String last4) {
            Utils.checkNotNull(last4, "last4");
            this.last4 = JsonNullable.of(last4);
            return this;
        }

        public Builder last4(JsonNullable<String> last4) {
            Utils.checkNotNull(last4, "last4");
            this.last4 = last4;
            return this;
        }

        /**
         * Indicates whether or not a card can be used for payments.
         */
        public Builder enabled(boolean enabled) {
            Utils.checkNotNull(enabled, "enabled");
            this.enabled = JsonNullable.of(enabled);
            return this;
        }

        /**
         * Indicates whether or not a card can be used for payments.
         */
        public Builder enabled(JsonNullable<Boolean> enabled) {
            Utils.checkNotNull(enabled, "enabled");
            this.enabled = enabled;
            return this;
        }

        public Builder billingAddress(Address billingAddress) {
            Utils.checkNotNull(billingAddress, "billingAddress");
            this.billingAddress = Optional.ofNullable(billingAddress);
            return this;
        }

        public Builder billingAddress(Optional<? extends Address> billingAddress) {
            Utils.checkNotNull(billingAddress, "billingAddress");
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * An optional user-defined reference ID that associates this record with another entity in an external system. For example, a customer ID from an external customer management system.
         */
        public Builder referenceId(String referenceId) {
            Utils.checkNotNull(referenceId, "referenceId");
            this.referenceId = JsonNullable.of(referenceId);
            return this;
        }

        /**
         * An optional user-defined reference ID that associates this record with another entity in an external system. For example, a customer ID from an external customer management system.
         */
        public Builder referenceId(JsonNullable<String> referenceId) {
            Utils.checkNotNull(referenceId, "referenceId");
            this.referenceId = referenceId;
            return this;
        }

        public Builder version(String version) {
            Utils.checkNotNull(version, "version");
            this.version = JsonNullable.of(version);
            return this;
        }

        public Builder version(JsonNullable<String> version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
        }
        
        public PaymentCard build() {
            return new PaymentCard(
                id,
                bin,
                cardBrand,
                cardType,
                prepaidType,
                cardholderName,
                customerId,
                merchantId,
                expMonth,
                expYear,
                fingerprint,
                last4,
                enabled,
                billingAddress,
                referenceId,
                version);
        }
    }
}
