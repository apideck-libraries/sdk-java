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
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class OrderLineItems {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item")
    private Optional<? extends OrderItemInput> item;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_tax")
    private JsonNullable<Long> totalTax;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_discount")
    private JsonNullable<Long> totalDiscount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_amount")
    private JsonNullable<Long> totalAmount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("quantity")
    private JsonNullable<Double> quantity;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unit_price")
    private JsonNullable<Double> unitPrice;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("applied_taxes")
    private Optional<? extends List<OrderAppliedTaxes>> appliedTaxes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("applied_discounts")
    private Optional<? extends List<OrderAppliedDiscounts>> appliedDiscounts;

    /**
     * Customizable options – toppings, add-ons, or special requests – create item modifiers. Modifiers that are applied to items will display on your customers’ digital receipts
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modifiers")
    private Optional<? extends List<OrderModifiers>> modifiers;

    @JsonCreator
    public OrderLineItems(
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("item") Optional<? extends OrderItemInput> item,
            @JsonProperty("total_tax") JsonNullable<Long> totalTax,
            @JsonProperty("total_discount") JsonNullable<Long> totalDiscount,
            @JsonProperty("total_amount") JsonNullable<Long> totalAmount,
            @JsonProperty("quantity") JsonNullable<Double> quantity,
            @JsonProperty("unit_price") JsonNullable<Double> unitPrice,
            @JsonProperty("applied_taxes") Optional<? extends List<OrderAppliedTaxes>> appliedTaxes,
            @JsonProperty("applied_discounts") Optional<? extends List<OrderAppliedDiscounts>> appliedDiscounts,
            @JsonProperty("modifiers") Optional<? extends List<OrderModifiers>> modifiers) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(item, "item");
        Utils.checkNotNull(totalTax, "totalTax");
        Utils.checkNotNull(totalDiscount, "totalDiscount");
        Utils.checkNotNull(totalAmount, "totalAmount");
        Utils.checkNotNull(quantity, "quantity");
        Utils.checkNotNull(unitPrice, "unitPrice");
        Utils.checkNotNull(appliedTaxes, "appliedTaxes");
        Utils.checkNotNull(appliedDiscounts, "appliedDiscounts");
        Utils.checkNotNull(modifiers, "modifiers");
        this.name = name;
        this.item = item;
        this.totalTax = totalTax;
        this.totalDiscount = totalDiscount;
        this.totalAmount = totalAmount;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.appliedTaxes = appliedTaxes;
        this.appliedDiscounts = appliedDiscounts;
        this.modifiers = modifiers;
    }
    
    public OrderLineItems() {
        this(Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OrderItemInput> item() {
        return (Optional<OrderItemInput>) item;
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
    public JsonNullable<Long> totalAmount() {
        return totalAmount;
    }

    @JsonIgnore
    public JsonNullable<Double> quantity() {
        return quantity;
    }

    @JsonIgnore
    public JsonNullable<Double> unitPrice() {
        return unitPrice;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<OrderAppliedTaxes>> appliedTaxes() {
        return (Optional<List<OrderAppliedTaxes>>) appliedTaxes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<OrderAppliedDiscounts>> appliedDiscounts() {
        return (Optional<List<OrderAppliedDiscounts>>) appliedDiscounts;
    }

    /**
     * Customizable options – toppings, add-ons, or special requests – create item modifiers. Modifiers that are applied to items will display on your customers’ digital receipts
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<OrderModifiers>> modifiers() {
        return (Optional<List<OrderModifiers>>) modifiers;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OrderLineItems withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public OrderLineItems withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public OrderLineItems withItem(OrderItemInput item) {
        Utils.checkNotNull(item, "item");
        this.item = Optional.ofNullable(item);
        return this;
    }

    public OrderLineItems withItem(Optional<? extends OrderItemInput> item) {
        Utils.checkNotNull(item, "item");
        this.item = item;
        return this;
    }

    public OrderLineItems withTotalTax(long totalTax) {
        Utils.checkNotNull(totalTax, "totalTax");
        this.totalTax = JsonNullable.of(totalTax);
        return this;
    }

    public OrderLineItems withTotalTax(JsonNullable<Long> totalTax) {
        Utils.checkNotNull(totalTax, "totalTax");
        this.totalTax = totalTax;
        return this;
    }

    public OrderLineItems withTotalDiscount(long totalDiscount) {
        Utils.checkNotNull(totalDiscount, "totalDiscount");
        this.totalDiscount = JsonNullable.of(totalDiscount);
        return this;
    }

    public OrderLineItems withTotalDiscount(JsonNullable<Long> totalDiscount) {
        Utils.checkNotNull(totalDiscount, "totalDiscount");
        this.totalDiscount = totalDiscount;
        return this;
    }

    public OrderLineItems withTotalAmount(long totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = JsonNullable.of(totalAmount);
        return this;
    }

    public OrderLineItems withTotalAmount(JsonNullable<Long> totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = totalAmount;
        return this;
    }

    public OrderLineItems withQuantity(double quantity) {
        Utils.checkNotNull(quantity, "quantity");
        this.quantity = JsonNullable.of(quantity);
        return this;
    }

    public OrderLineItems withQuantity(JsonNullable<Double> quantity) {
        Utils.checkNotNull(quantity, "quantity");
        this.quantity = quantity;
        return this;
    }

    public OrderLineItems withUnitPrice(double unitPrice) {
        Utils.checkNotNull(unitPrice, "unitPrice");
        this.unitPrice = JsonNullable.of(unitPrice);
        return this;
    }

    public OrderLineItems withUnitPrice(JsonNullable<Double> unitPrice) {
        Utils.checkNotNull(unitPrice, "unitPrice");
        this.unitPrice = unitPrice;
        return this;
    }

    public OrderLineItems withAppliedTaxes(List<OrderAppliedTaxes> appliedTaxes) {
        Utils.checkNotNull(appliedTaxes, "appliedTaxes");
        this.appliedTaxes = Optional.ofNullable(appliedTaxes);
        return this;
    }

    public OrderLineItems withAppliedTaxes(Optional<? extends List<OrderAppliedTaxes>> appliedTaxes) {
        Utils.checkNotNull(appliedTaxes, "appliedTaxes");
        this.appliedTaxes = appliedTaxes;
        return this;
    }

    public OrderLineItems withAppliedDiscounts(List<OrderAppliedDiscounts> appliedDiscounts) {
        Utils.checkNotNull(appliedDiscounts, "appliedDiscounts");
        this.appliedDiscounts = Optional.ofNullable(appliedDiscounts);
        return this;
    }

    public OrderLineItems withAppliedDiscounts(Optional<? extends List<OrderAppliedDiscounts>> appliedDiscounts) {
        Utils.checkNotNull(appliedDiscounts, "appliedDiscounts");
        this.appliedDiscounts = appliedDiscounts;
        return this;
    }

    /**
     * Customizable options – toppings, add-ons, or special requests – create item modifiers. Modifiers that are applied to items will display on your customers’ digital receipts
     */
    public OrderLineItems withModifiers(List<OrderModifiers> modifiers) {
        Utils.checkNotNull(modifiers, "modifiers");
        this.modifiers = Optional.ofNullable(modifiers);
        return this;
    }

    /**
     * Customizable options – toppings, add-ons, or special requests – create item modifiers. Modifiers that are applied to items will display on your customers’ digital receipts
     */
    public OrderLineItems withModifiers(Optional<? extends List<OrderModifiers>> modifiers) {
        Utils.checkNotNull(modifiers, "modifiers");
        this.modifiers = modifiers;
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
        OrderLineItems other = (OrderLineItems) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.item, other.item) &&
            Objects.deepEquals(this.totalTax, other.totalTax) &&
            Objects.deepEquals(this.totalDiscount, other.totalDiscount) &&
            Objects.deepEquals(this.totalAmount, other.totalAmount) &&
            Objects.deepEquals(this.quantity, other.quantity) &&
            Objects.deepEquals(this.unitPrice, other.unitPrice) &&
            Objects.deepEquals(this.appliedTaxes, other.appliedTaxes) &&
            Objects.deepEquals(this.appliedDiscounts, other.appliedDiscounts) &&
            Objects.deepEquals(this.modifiers, other.modifiers);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            item,
            totalTax,
            totalDiscount,
            totalAmount,
            quantity,
            unitPrice,
            appliedTaxes,
            appliedDiscounts,
            modifiers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OrderLineItems.class,
                "name", name,
                "item", item,
                "totalTax", totalTax,
                "totalDiscount", totalDiscount,
                "totalAmount", totalAmount,
                "quantity", quantity,
                "unitPrice", unitPrice,
                "appliedTaxes", appliedTaxes,
                "appliedDiscounts", appliedDiscounts,
                "modifiers", modifiers);
    }
    
    public final static class Builder {
 
        private Optional<String> name = Optional.empty();
 
        private Optional<? extends OrderItemInput> item = Optional.empty();
 
        private JsonNullable<Long> totalTax = JsonNullable.undefined();
 
        private JsonNullable<Long> totalDiscount = JsonNullable.undefined();
 
        private JsonNullable<Long> totalAmount = JsonNullable.undefined();
 
        private JsonNullable<Double> quantity = JsonNullable.undefined();
 
        private JsonNullable<Double> unitPrice = JsonNullable.undefined();
 
        private Optional<? extends List<OrderAppliedTaxes>> appliedTaxes = Optional.empty();
 
        private Optional<? extends List<OrderAppliedDiscounts>> appliedDiscounts = Optional.empty();
 
        private Optional<? extends List<OrderModifiers>> modifiers = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder item(OrderItemInput item) {
            Utils.checkNotNull(item, "item");
            this.item = Optional.ofNullable(item);
            return this;
        }

        public Builder item(Optional<? extends OrderItemInput> item) {
            Utils.checkNotNull(item, "item");
            this.item = item;
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

        public Builder quantity(double quantity) {
            Utils.checkNotNull(quantity, "quantity");
            this.quantity = JsonNullable.of(quantity);
            return this;
        }

        public Builder quantity(JsonNullable<Double> quantity) {
            Utils.checkNotNull(quantity, "quantity");
            this.quantity = quantity;
            return this;
        }

        public Builder unitPrice(double unitPrice) {
            Utils.checkNotNull(unitPrice, "unitPrice");
            this.unitPrice = JsonNullable.of(unitPrice);
            return this;
        }

        public Builder unitPrice(JsonNullable<Double> unitPrice) {
            Utils.checkNotNull(unitPrice, "unitPrice");
            this.unitPrice = unitPrice;
            return this;
        }

        public Builder appliedTaxes(List<OrderAppliedTaxes> appliedTaxes) {
            Utils.checkNotNull(appliedTaxes, "appliedTaxes");
            this.appliedTaxes = Optional.ofNullable(appliedTaxes);
            return this;
        }

        public Builder appliedTaxes(Optional<? extends List<OrderAppliedTaxes>> appliedTaxes) {
            Utils.checkNotNull(appliedTaxes, "appliedTaxes");
            this.appliedTaxes = appliedTaxes;
            return this;
        }

        public Builder appliedDiscounts(List<OrderAppliedDiscounts> appliedDiscounts) {
            Utils.checkNotNull(appliedDiscounts, "appliedDiscounts");
            this.appliedDiscounts = Optional.ofNullable(appliedDiscounts);
            return this;
        }

        public Builder appliedDiscounts(Optional<? extends List<OrderAppliedDiscounts>> appliedDiscounts) {
            Utils.checkNotNull(appliedDiscounts, "appliedDiscounts");
            this.appliedDiscounts = appliedDiscounts;
            return this;
        }

        /**
         * Customizable options – toppings, add-ons, or special requests – create item modifiers. Modifiers that are applied to items will display on your customers’ digital receipts
         */
        public Builder modifiers(List<OrderModifiers> modifiers) {
            Utils.checkNotNull(modifiers, "modifiers");
            this.modifiers = Optional.ofNullable(modifiers);
            return this;
        }

        /**
         * Customizable options – toppings, add-ons, or special requests – create item modifiers. Modifiers that are applied to items will display on your customers’ digital receipts
         */
        public Builder modifiers(Optional<? extends List<OrderModifiers>> modifiers) {
            Utils.checkNotNull(modifiers, "modifiers");
            this.modifiers = modifiers;
            return this;
        }
        
        public OrderLineItems build() {
            return new OrderLineItems(
                name,
                item,
                totalTax,
                totalDiscount,
                totalAmount,
                quantity,
                unitPrice,
                appliedTaxes,
                appliedDiscounts,
                modifiers);
        }
    }
}
