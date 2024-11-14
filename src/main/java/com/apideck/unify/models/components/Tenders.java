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
import java.lang.Double;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class Tenders {

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends OrderTendersType> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("note")
    private Optional<String> note;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<Double> amount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("percentage")
    private Optional<Double> percentage;

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private JsonNullable<? extends Currency> currency;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_amount")
    private JsonNullable<Long> totalAmount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_tip")
    private JsonNullable<Long> totalTip;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_processing_fee")
    private JsonNullable<Long> totalProcessingFee;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_tax")
    private JsonNullable<Long> totalTax;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_discount")
    private JsonNullable<Long> totalDiscount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_refund")
    private JsonNullable<Long> totalRefund;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_service_charge")
    private JsonNullable<Long> totalServiceCharge;

    /**
     * The amount (in cents) of cash tendered by the buyer. Only applicable when the tender type is cash.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("buyer_tendered_cash_amount")
    private JsonNullable<Long> buyerTenderedCashAmount;

    /**
     * The amount (in cents) of cash returned to the buyer. Only applicable when the tender type is cash.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("change_back_cash_amount")
    private JsonNullable<Long> changeBackCashAmount;

    /**
     * A card's non-confidential details.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("card")
    private JsonNullable<? extends PaymentCard> card;

    /**
     * The status of the card. Only applicable when the tender type is card.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("card_status")
    private JsonNullable<? extends CardStatus> cardStatus;

    /**
     * The entry method of the card. Only applicable when the tender type is card.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("card_entry_method")
    private JsonNullable<? extends CardEntryMethod> cardEntryMethod;

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_id")
    private Optional<String> paymentId;

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location_id")
    private Optional<String> locationId;

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transaction_id")
    private Optional<String> transactionId;

    @JsonCreator
    public Tenders(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("type") Optional<? extends OrderTendersType> type,
            @JsonProperty("note") Optional<String> note,
            @JsonProperty("amount") Optional<Double> amount,
            @JsonProperty("percentage") Optional<Double> percentage,
            @JsonProperty("currency") JsonNullable<? extends Currency> currency,
            @JsonProperty("total_amount") JsonNullable<Long> totalAmount,
            @JsonProperty("total_tip") JsonNullable<Long> totalTip,
            @JsonProperty("total_processing_fee") JsonNullable<Long> totalProcessingFee,
            @JsonProperty("total_tax") JsonNullable<Long> totalTax,
            @JsonProperty("total_discount") JsonNullable<Long> totalDiscount,
            @JsonProperty("total_refund") JsonNullable<Long> totalRefund,
            @JsonProperty("total_service_charge") JsonNullable<Long> totalServiceCharge,
            @JsonProperty("buyer_tendered_cash_amount") JsonNullable<Long> buyerTenderedCashAmount,
            @JsonProperty("change_back_cash_amount") JsonNullable<Long> changeBackCashAmount,
            @JsonProperty("card") JsonNullable<? extends PaymentCard> card,
            @JsonProperty("card_status") JsonNullable<? extends CardStatus> cardStatus,
            @JsonProperty("card_entry_method") JsonNullable<? extends CardEntryMethod> cardEntryMethod,
            @JsonProperty("payment_id") Optional<String> paymentId,
            @JsonProperty("location_id") Optional<String> locationId,
            @JsonProperty("transaction_id") Optional<String> transactionId) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(note, "note");
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(percentage, "percentage");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(totalAmount, "totalAmount");
        Utils.checkNotNull(totalTip, "totalTip");
        Utils.checkNotNull(totalProcessingFee, "totalProcessingFee");
        Utils.checkNotNull(totalTax, "totalTax");
        Utils.checkNotNull(totalDiscount, "totalDiscount");
        Utils.checkNotNull(totalRefund, "totalRefund");
        Utils.checkNotNull(totalServiceCharge, "totalServiceCharge");
        Utils.checkNotNull(buyerTenderedCashAmount, "buyerTenderedCashAmount");
        Utils.checkNotNull(changeBackCashAmount, "changeBackCashAmount");
        Utils.checkNotNull(card, "card");
        Utils.checkNotNull(cardStatus, "cardStatus");
        Utils.checkNotNull(cardEntryMethod, "cardEntryMethod");
        Utils.checkNotNull(paymentId, "paymentId");
        Utils.checkNotNull(locationId, "locationId");
        Utils.checkNotNull(transactionId, "transactionId");
        this.id = id;
        this.name = name;
        this.type = type;
        this.note = note;
        this.amount = amount;
        this.percentage = percentage;
        this.currency = currency;
        this.totalAmount = totalAmount;
        this.totalTip = totalTip;
        this.totalProcessingFee = totalProcessingFee;
        this.totalTax = totalTax;
        this.totalDiscount = totalDiscount;
        this.totalRefund = totalRefund;
        this.totalServiceCharge = totalServiceCharge;
        this.buyerTenderedCashAmount = buyerTenderedCashAmount;
        this.changeBackCashAmount = changeBackCashAmount;
        this.card = card;
        this.cardStatus = cardStatus;
        this.cardEntryMethod = cardEntryMethod;
        this.paymentId = paymentId;
        this.locationId = locationId;
        this.transactionId = transactionId;
    }
    
    public Tenders() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OrderTendersType> type() {
        return (Optional<OrderTendersType>) type;
    }

    @JsonIgnore
    public Optional<String> note() {
        return note;
    }

    @JsonIgnore
    public Optional<Double> amount() {
        return amount;
    }

    @JsonIgnore
    public Optional<Double> percentage() {
        return percentage;
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
    public JsonNullable<Long> totalAmount() {
        return totalAmount;
    }

    @JsonIgnore
    public JsonNullable<Long> totalTip() {
        return totalTip;
    }

    @JsonIgnore
    public JsonNullable<Long> totalProcessingFee() {
        return totalProcessingFee;
    }

    @JsonIgnore
    public JsonNullable<Long> totalTax() {
        return totalTax;
    }

    @JsonIgnore
    public JsonNullable<Long> totalDiscount() {
        return totalDiscount;
    }

    @JsonIgnore
    public JsonNullable<Long> totalRefund() {
        return totalRefund;
    }

    @JsonIgnore
    public JsonNullable<Long> totalServiceCharge() {
        return totalServiceCharge;
    }

    /**
     * The amount (in cents) of cash tendered by the buyer. Only applicable when the tender type is cash.
     */
    @JsonIgnore
    public JsonNullable<Long> buyerTenderedCashAmount() {
        return buyerTenderedCashAmount;
    }

    /**
     * The amount (in cents) of cash returned to the buyer. Only applicable when the tender type is cash.
     */
    @JsonIgnore
    public JsonNullable<Long> changeBackCashAmount() {
        return changeBackCashAmount;
    }

    /**
     * A card's non-confidential details.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<PaymentCard> card() {
        return (JsonNullable<PaymentCard>) card;
    }

    /**
     * The status of the card. Only applicable when the tender type is card.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<CardStatus> cardStatus() {
        return (JsonNullable<CardStatus>) cardStatus;
    }

    /**
     * The entry method of the card. Only applicable when the tender type is card.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<CardEntryMethod> cardEntryMethod() {
        return (JsonNullable<CardEntryMethod>) cardEntryMethod;
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public Optional<String> paymentId() {
        return paymentId;
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public Optional<String> locationId() {
        return locationId;
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public Optional<String> transactionId() {
        return transactionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique identifier for an object.
     */
    public Tenders withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Tenders withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Tenders withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public Tenders withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public Tenders withType(OrderTendersType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public Tenders withType(Optional<? extends OrderTendersType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public Tenders withNote(String note) {
        Utils.checkNotNull(note, "note");
        this.note = Optional.ofNullable(note);
        return this;
    }

    public Tenders withNote(Optional<String> note) {
        Utils.checkNotNull(note, "note");
        this.note = note;
        return this;
    }

    public Tenders withAmount(double amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }

    public Tenders withAmount(Optional<Double> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    public Tenders withPercentage(double percentage) {
        Utils.checkNotNull(percentage, "percentage");
        this.percentage = Optional.ofNullable(percentage);
        return this;
    }

    public Tenders withPercentage(Optional<Double> percentage) {
        Utils.checkNotNull(percentage, "percentage");
        this.percentage = percentage;
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public Tenders withCurrency(Currency currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = JsonNullable.of(currency);
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public Tenders withCurrency(JsonNullable<? extends Currency> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    public Tenders withTotalAmount(long totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = JsonNullable.of(totalAmount);
        return this;
    }

    public Tenders withTotalAmount(JsonNullable<Long> totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = totalAmount;
        return this;
    }

    public Tenders withTotalTip(long totalTip) {
        Utils.checkNotNull(totalTip, "totalTip");
        this.totalTip = JsonNullable.of(totalTip);
        return this;
    }

    public Tenders withTotalTip(JsonNullable<Long> totalTip) {
        Utils.checkNotNull(totalTip, "totalTip");
        this.totalTip = totalTip;
        return this;
    }

    public Tenders withTotalProcessingFee(long totalProcessingFee) {
        Utils.checkNotNull(totalProcessingFee, "totalProcessingFee");
        this.totalProcessingFee = JsonNullable.of(totalProcessingFee);
        return this;
    }

    public Tenders withTotalProcessingFee(JsonNullable<Long> totalProcessingFee) {
        Utils.checkNotNull(totalProcessingFee, "totalProcessingFee");
        this.totalProcessingFee = totalProcessingFee;
        return this;
    }

    public Tenders withTotalTax(long totalTax) {
        Utils.checkNotNull(totalTax, "totalTax");
        this.totalTax = JsonNullable.of(totalTax);
        return this;
    }

    public Tenders withTotalTax(JsonNullable<Long> totalTax) {
        Utils.checkNotNull(totalTax, "totalTax");
        this.totalTax = totalTax;
        return this;
    }

    public Tenders withTotalDiscount(long totalDiscount) {
        Utils.checkNotNull(totalDiscount, "totalDiscount");
        this.totalDiscount = JsonNullable.of(totalDiscount);
        return this;
    }

    public Tenders withTotalDiscount(JsonNullable<Long> totalDiscount) {
        Utils.checkNotNull(totalDiscount, "totalDiscount");
        this.totalDiscount = totalDiscount;
        return this;
    }

    public Tenders withTotalRefund(long totalRefund) {
        Utils.checkNotNull(totalRefund, "totalRefund");
        this.totalRefund = JsonNullable.of(totalRefund);
        return this;
    }

    public Tenders withTotalRefund(JsonNullable<Long> totalRefund) {
        Utils.checkNotNull(totalRefund, "totalRefund");
        this.totalRefund = totalRefund;
        return this;
    }

    public Tenders withTotalServiceCharge(long totalServiceCharge) {
        Utils.checkNotNull(totalServiceCharge, "totalServiceCharge");
        this.totalServiceCharge = JsonNullable.of(totalServiceCharge);
        return this;
    }

    public Tenders withTotalServiceCharge(JsonNullable<Long> totalServiceCharge) {
        Utils.checkNotNull(totalServiceCharge, "totalServiceCharge");
        this.totalServiceCharge = totalServiceCharge;
        return this;
    }

    /**
     * The amount (in cents) of cash tendered by the buyer. Only applicable when the tender type is cash.
     */
    public Tenders withBuyerTenderedCashAmount(long buyerTenderedCashAmount) {
        Utils.checkNotNull(buyerTenderedCashAmount, "buyerTenderedCashAmount");
        this.buyerTenderedCashAmount = JsonNullable.of(buyerTenderedCashAmount);
        return this;
    }

    /**
     * The amount (in cents) of cash tendered by the buyer. Only applicable when the tender type is cash.
     */
    public Tenders withBuyerTenderedCashAmount(JsonNullable<Long> buyerTenderedCashAmount) {
        Utils.checkNotNull(buyerTenderedCashAmount, "buyerTenderedCashAmount");
        this.buyerTenderedCashAmount = buyerTenderedCashAmount;
        return this;
    }

    /**
     * The amount (in cents) of cash returned to the buyer. Only applicable when the tender type is cash.
     */
    public Tenders withChangeBackCashAmount(long changeBackCashAmount) {
        Utils.checkNotNull(changeBackCashAmount, "changeBackCashAmount");
        this.changeBackCashAmount = JsonNullable.of(changeBackCashAmount);
        return this;
    }

    /**
     * The amount (in cents) of cash returned to the buyer. Only applicable when the tender type is cash.
     */
    public Tenders withChangeBackCashAmount(JsonNullable<Long> changeBackCashAmount) {
        Utils.checkNotNull(changeBackCashAmount, "changeBackCashAmount");
        this.changeBackCashAmount = changeBackCashAmount;
        return this;
    }

    /**
     * A card's non-confidential details.
     */
    public Tenders withCard(PaymentCard card) {
        Utils.checkNotNull(card, "card");
        this.card = JsonNullable.of(card);
        return this;
    }

    /**
     * A card's non-confidential details.
     */
    public Tenders withCard(JsonNullable<? extends PaymentCard> card) {
        Utils.checkNotNull(card, "card");
        this.card = card;
        return this;
    }

    /**
     * The status of the card. Only applicable when the tender type is card.
     */
    public Tenders withCardStatus(CardStatus cardStatus) {
        Utils.checkNotNull(cardStatus, "cardStatus");
        this.cardStatus = JsonNullable.of(cardStatus);
        return this;
    }

    /**
     * The status of the card. Only applicable when the tender type is card.
     */
    public Tenders withCardStatus(JsonNullable<? extends CardStatus> cardStatus) {
        Utils.checkNotNull(cardStatus, "cardStatus");
        this.cardStatus = cardStatus;
        return this;
    }

    /**
     * The entry method of the card. Only applicable when the tender type is card.
     */
    public Tenders withCardEntryMethod(CardEntryMethod cardEntryMethod) {
        Utils.checkNotNull(cardEntryMethod, "cardEntryMethod");
        this.cardEntryMethod = JsonNullable.of(cardEntryMethod);
        return this;
    }

    /**
     * The entry method of the card. Only applicable when the tender type is card.
     */
    public Tenders withCardEntryMethod(JsonNullable<? extends CardEntryMethod> cardEntryMethod) {
        Utils.checkNotNull(cardEntryMethod, "cardEntryMethod");
        this.cardEntryMethod = cardEntryMethod;
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Tenders withPaymentId(String paymentId) {
        Utils.checkNotNull(paymentId, "paymentId");
        this.paymentId = Optional.ofNullable(paymentId);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Tenders withPaymentId(Optional<String> paymentId) {
        Utils.checkNotNull(paymentId, "paymentId");
        this.paymentId = paymentId;
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Tenders withLocationId(String locationId) {
        Utils.checkNotNull(locationId, "locationId");
        this.locationId = Optional.ofNullable(locationId);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Tenders withLocationId(Optional<String> locationId) {
        Utils.checkNotNull(locationId, "locationId");
        this.locationId = locationId;
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Tenders withTransactionId(String transactionId) {
        Utils.checkNotNull(transactionId, "transactionId");
        this.transactionId = Optional.ofNullable(transactionId);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Tenders withTransactionId(Optional<String> transactionId) {
        Utils.checkNotNull(transactionId, "transactionId");
        this.transactionId = transactionId;
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
        Tenders other = (Tenders) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.note, other.note) &&
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.percentage, other.percentage) &&
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.totalAmount, other.totalAmount) &&
            Objects.deepEquals(this.totalTip, other.totalTip) &&
            Objects.deepEquals(this.totalProcessingFee, other.totalProcessingFee) &&
            Objects.deepEquals(this.totalTax, other.totalTax) &&
            Objects.deepEquals(this.totalDiscount, other.totalDiscount) &&
            Objects.deepEquals(this.totalRefund, other.totalRefund) &&
            Objects.deepEquals(this.totalServiceCharge, other.totalServiceCharge) &&
            Objects.deepEquals(this.buyerTenderedCashAmount, other.buyerTenderedCashAmount) &&
            Objects.deepEquals(this.changeBackCashAmount, other.changeBackCashAmount) &&
            Objects.deepEquals(this.card, other.card) &&
            Objects.deepEquals(this.cardStatus, other.cardStatus) &&
            Objects.deepEquals(this.cardEntryMethod, other.cardEntryMethod) &&
            Objects.deepEquals(this.paymentId, other.paymentId) &&
            Objects.deepEquals(this.locationId, other.locationId) &&
            Objects.deepEquals(this.transactionId, other.transactionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            type,
            note,
            amount,
            percentage,
            currency,
            totalAmount,
            totalTip,
            totalProcessingFee,
            totalTax,
            totalDiscount,
            totalRefund,
            totalServiceCharge,
            buyerTenderedCashAmount,
            changeBackCashAmount,
            card,
            cardStatus,
            cardEntryMethod,
            paymentId,
            locationId,
            transactionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Tenders.class,
                "id", id,
                "name", name,
                "type", type,
                "note", note,
                "amount", amount,
                "percentage", percentage,
                "currency", currency,
                "totalAmount", totalAmount,
                "totalTip", totalTip,
                "totalProcessingFee", totalProcessingFee,
                "totalTax", totalTax,
                "totalDiscount", totalDiscount,
                "totalRefund", totalRefund,
                "totalServiceCharge", totalServiceCharge,
                "buyerTenderedCashAmount", buyerTenderedCashAmount,
                "changeBackCashAmount", changeBackCashAmount,
                "card", card,
                "cardStatus", cardStatus,
                "cardEntryMethod", cardEntryMethod,
                "paymentId", paymentId,
                "locationId", locationId,
                "transactionId", transactionId);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<? extends OrderTendersType> type = Optional.empty();
 
        private Optional<String> note = Optional.empty();
 
        private Optional<Double> amount = Optional.empty();
 
        private Optional<Double> percentage = Optional.empty();
 
        private JsonNullable<? extends Currency> currency = JsonNullable.undefined();
 
        private JsonNullable<Long> totalAmount = JsonNullable.undefined();
 
        private JsonNullable<Long> totalTip = JsonNullable.undefined();
 
        private JsonNullable<Long> totalProcessingFee = JsonNullable.undefined();
 
        private JsonNullable<Long> totalTax = JsonNullable.undefined();
 
        private JsonNullable<Long> totalDiscount = JsonNullable.undefined();
 
        private JsonNullable<Long> totalRefund = JsonNullable.undefined();
 
        private JsonNullable<Long> totalServiceCharge = JsonNullable.undefined();
 
        private JsonNullable<Long> buyerTenderedCashAmount = JsonNullable.undefined();
 
        private JsonNullable<Long> changeBackCashAmount = JsonNullable.undefined();
 
        private JsonNullable<? extends PaymentCard> card = JsonNullable.undefined();
 
        private JsonNullable<? extends CardStatus> cardStatus = JsonNullable.undefined();
 
        private JsonNullable<? extends CardEntryMethod> cardEntryMethod = JsonNullable.undefined();
 
        private Optional<String> paymentId = Optional.empty();
 
        private Optional<String> locationId = Optional.empty();
 
        private Optional<String> transactionId = Optional.empty();  
        
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

        public Builder type(OrderTendersType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends OrderTendersType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder note(String note) {
            Utils.checkNotNull(note, "note");
            this.note = Optional.ofNullable(note);
            return this;
        }

        public Builder note(Optional<String> note) {
            Utils.checkNotNull(note, "note");
            this.note = note;
            return this;
        }

        public Builder amount(double amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }

        public Builder amount(Optional<Double> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
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

        public Builder totalAmount(long totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = JsonNullable.of(totalAmount);
            return this;
        }

        public Builder totalAmount(JsonNullable<Long> totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder totalTip(long totalTip) {
            Utils.checkNotNull(totalTip, "totalTip");
            this.totalTip = JsonNullable.of(totalTip);
            return this;
        }

        public Builder totalTip(JsonNullable<Long> totalTip) {
            Utils.checkNotNull(totalTip, "totalTip");
            this.totalTip = totalTip;
            return this;
        }

        public Builder totalProcessingFee(long totalProcessingFee) {
            Utils.checkNotNull(totalProcessingFee, "totalProcessingFee");
            this.totalProcessingFee = JsonNullable.of(totalProcessingFee);
            return this;
        }

        public Builder totalProcessingFee(JsonNullable<Long> totalProcessingFee) {
            Utils.checkNotNull(totalProcessingFee, "totalProcessingFee");
            this.totalProcessingFee = totalProcessingFee;
            return this;
        }

        public Builder totalTax(long totalTax) {
            Utils.checkNotNull(totalTax, "totalTax");
            this.totalTax = JsonNullable.of(totalTax);
            return this;
        }

        public Builder totalTax(JsonNullable<Long> totalTax) {
            Utils.checkNotNull(totalTax, "totalTax");
            this.totalTax = totalTax;
            return this;
        }

        public Builder totalDiscount(long totalDiscount) {
            Utils.checkNotNull(totalDiscount, "totalDiscount");
            this.totalDiscount = JsonNullable.of(totalDiscount);
            return this;
        }

        public Builder totalDiscount(JsonNullable<Long> totalDiscount) {
            Utils.checkNotNull(totalDiscount, "totalDiscount");
            this.totalDiscount = totalDiscount;
            return this;
        }

        public Builder totalRefund(long totalRefund) {
            Utils.checkNotNull(totalRefund, "totalRefund");
            this.totalRefund = JsonNullable.of(totalRefund);
            return this;
        }

        public Builder totalRefund(JsonNullable<Long> totalRefund) {
            Utils.checkNotNull(totalRefund, "totalRefund");
            this.totalRefund = totalRefund;
            return this;
        }

        public Builder totalServiceCharge(long totalServiceCharge) {
            Utils.checkNotNull(totalServiceCharge, "totalServiceCharge");
            this.totalServiceCharge = JsonNullable.of(totalServiceCharge);
            return this;
        }

        public Builder totalServiceCharge(JsonNullable<Long> totalServiceCharge) {
            Utils.checkNotNull(totalServiceCharge, "totalServiceCharge");
            this.totalServiceCharge = totalServiceCharge;
            return this;
        }

        /**
         * The amount (in cents) of cash tendered by the buyer. Only applicable when the tender type is cash.
         */
        public Builder buyerTenderedCashAmount(long buyerTenderedCashAmount) {
            Utils.checkNotNull(buyerTenderedCashAmount, "buyerTenderedCashAmount");
            this.buyerTenderedCashAmount = JsonNullable.of(buyerTenderedCashAmount);
            return this;
        }

        /**
         * The amount (in cents) of cash tendered by the buyer. Only applicable when the tender type is cash.
         */
        public Builder buyerTenderedCashAmount(JsonNullable<Long> buyerTenderedCashAmount) {
            Utils.checkNotNull(buyerTenderedCashAmount, "buyerTenderedCashAmount");
            this.buyerTenderedCashAmount = buyerTenderedCashAmount;
            return this;
        }

        /**
         * The amount (in cents) of cash returned to the buyer. Only applicable when the tender type is cash.
         */
        public Builder changeBackCashAmount(long changeBackCashAmount) {
            Utils.checkNotNull(changeBackCashAmount, "changeBackCashAmount");
            this.changeBackCashAmount = JsonNullable.of(changeBackCashAmount);
            return this;
        }

        /**
         * The amount (in cents) of cash returned to the buyer. Only applicable when the tender type is cash.
         */
        public Builder changeBackCashAmount(JsonNullable<Long> changeBackCashAmount) {
            Utils.checkNotNull(changeBackCashAmount, "changeBackCashAmount");
            this.changeBackCashAmount = changeBackCashAmount;
            return this;
        }

        /**
         * A card's non-confidential details.
         */
        public Builder card(PaymentCard card) {
            Utils.checkNotNull(card, "card");
            this.card = JsonNullable.of(card);
            return this;
        }

        /**
         * A card's non-confidential details.
         */
        public Builder card(JsonNullable<? extends PaymentCard> card) {
            Utils.checkNotNull(card, "card");
            this.card = card;
            return this;
        }

        /**
         * The status of the card. Only applicable when the tender type is card.
         */
        public Builder cardStatus(CardStatus cardStatus) {
            Utils.checkNotNull(cardStatus, "cardStatus");
            this.cardStatus = JsonNullable.of(cardStatus);
            return this;
        }

        /**
         * The status of the card. Only applicable when the tender type is card.
         */
        public Builder cardStatus(JsonNullable<? extends CardStatus> cardStatus) {
            Utils.checkNotNull(cardStatus, "cardStatus");
            this.cardStatus = cardStatus;
            return this;
        }

        /**
         * The entry method of the card. Only applicable when the tender type is card.
         */
        public Builder cardEntryMethod(CardEntryMethod cardEntryMethod) {
            Utils.checkNotNull(cardEntryMethod, "cardEntryMethod");
            this.cardEntryMethod = JsonNullable.of(cardEntryMethod);
            return this;
        }

        /**
         * The entry method of the card. Only applicable when the tender type is card.
         */
        public Builder cardEntryMethod(JsonNullable<? extends CardEntryMethod> cardEntryMethod) {
            Utils.checkNotNull(cardEntryMethod, "cardEntryMethod");
            this.cardEntryMethod = cardEntryMethod;
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder paymentId(String paymentId) {
            Utils.checkNotNull(paymentId, "paymentId");
            this.paymentId = Optional.ofNullable(paymentId);
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder paymentId(Optional<String> paymentId) {
            Utils.checkNotNull(paymentId, "paymentId");
            this.paymentId = paymentId;
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder locationId(String locationId) {
            Utils.checkNotNull(locationId, "locationId");
            this.locationId = Optional.ofNullable(locationId);
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder locationId(Optional<String> locationId) {
            Utils.checkNotNull(locationId, "locationId");
            this.locationId = locationId;
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder transactionId(String transactionId) {
            Utils.checkNotNull(transactionId, "transactionId");
            this.transactionId = Optional.ofNullable(transactionId);
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder transactionId(Optional<String> transactionId) {
            Utils.checkNotNull(transactionId, "transactionId");
            this.transactionId = transactionId;
            return this;
        }
        
        public Tenders build() {
            return new Tenders(
                id,
                name,
                type,
                note,
                amount,
                percentage,
                currency,
                totalAmount,
                totalTip,
                totalProcessingFee,
                totalTax,
                totalDiscount,
                totalRefund,
                totalServiceCharge,
                buyerTenderedCashAmount,
                changeBackCashAmount,
                card,
                cardStatus,
                cardEntryMethod,
                paymentId,
                locationId,
                transactionId);
        }
    }
}

