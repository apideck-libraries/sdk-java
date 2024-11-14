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


public class LineItems {

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
    @JsonProperty("item")
    private Optional<? extends OrderItem> item;

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
    private Optional<? extends List<AppliedTaxes>> appliedTaxes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("applied_discounts")
    private Optional<? extends List<AppliedDiscounts>> appliedDiscounts;

    /**
     * Customizable options – toppings, add-ons, or special requests – create item modifiers. Modifiers that are applied to items will display on your customers’ digital receipts
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modifiers")
    private Optional<? extends List<OrderModifiers>> modifiers;

    @JsonCreator
    public LineItems(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("item") Optional<? extends OrderItem> item,
            @JsonProperty("total_tax") JsonNullable<Long> totalTax,
            @JsonProperty("total_discount") JsonNullable<Long> totalDiscount,
            @JsonProperty("total_amount") JsonNullable<Long> totalAmount,
            @JsonProperty("quantity") JsonNullable<Double> quantity,
            @JsonProperty("unit_price") JsonNullable<Double> unitPrice,
            @JsonProperty("applied_taxes") Optional<? extends List<AppliedTaxes>> appliedTaxes,
            @JsonProperty("applied_discounts") Optional<? extends List<AppliedDiscounts>> appliedDiscounts,
            @JsonProperty("modifiers") Optional<? extends List<OrderModifiers>> modifiers) {
        Utils.checkNotNull(id, "id");
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
        this.id = id;
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
    
    public LineItems() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty());
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
    public Optional<OrderItem> item() {
        return (Optional<OrderItem>) item;
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
    public Optional<List<AppliedTaxes>> appliedTaxes() {
        return (Optional<List<AppliedTaxes>>) appliedTaxes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<AppliedDiscounts>> appliedDiscounts() {
        return (Optional<List<AppliedDiscounts>>) appliedDiscounts;
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

    /**
     * A unique identifier for an object.
     */
    public LineItems withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public LineItems withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public LineItems withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public LineItems withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public LineItems withItem(OrderItem item) {
        Utils.checkNotNull(item, "item");
        this.item = Optional.ofNullable(item);
        return this;
    }

    public LineItems withItem(Optional<? extends OrderItem> item) {
        Utils.checkNotNull(item, "item");
        this.item = item;
        return this;
    }

    public LineItems withTotalTax(long totalTax) {
        Utils.checkNotNull(totalTax, "totalTax");
        this.totalTax = JsonNullable.of(totalTax);
        return this;
    }

    public LineItems withTotalTax(JsonNullable<Long> totalTax) {
        Utils.checkNotNull(totalTax, "totalTax");
        this.totalTax = totalTax;
        return this;
    }

    public LineItems withTotalDiscount(long totalDiscount) {
        Utils.checkNotNull(totalDiscount, "totalDiscount");
        this.totalDiscount = JsonNullable.of(totalDiscount);
        return this;
    }

    public LineItems withTotalDiscount(JsonNullable<Long> totalDiscount) {
        Utils.checkNotNull(totalDiscount, "totalDiscount");
        this.totalDiscount = totalDiscount;
        return this;
    }

    public LineItems withTotalAmount(long totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = JsonNullable.of(totalAmount);
        return this;
    }

    public LineItems withTotalAmount(JsonNullable<Long> totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = totalAmount;
        return this;
    }

    public LineItems withQuantity(double quantity) {
        Utils.checkNotNull(quantity, "quantity");
        this.quantity = JsonNullable.of(quantity);
        return this;
    }

    public LineItems withQuantity(JsonNullable<Double> quantity) {
        Utils.checkNotNull(quantity, "quantity");
        this.quantity = quantity;
        return this;
    }

    public LineItems withUnitPrice(double unitPrice) {
        Utils.checkNotNull(unitPrice, "unitPrice");
        this.unitPrice = JsonNullable.of(unitPrice);
        return this;
    }

    public LineItems withUnitPrice(JsonNullable<Double> unitPrice) {
        Utils.checkNotNull(unitPrice, "unitPrice");
        this.unitPrice = unitPrice;
        return this;
    }

    public LineItems withAppliedTaxes(List<AppliedTaxes> appliedTaxes) {
        Utils.checkNotNull(appliedTaxes, "appliedTaxes");
        this.appliedTaxes = Optional.ofNullable(appliedTaxes);
        return this;
    }

    public LineItems withAppliedTaxes(Optional<? extends List<AppliedTaxes>> appliedTaxes) {
        Utils.checkNotNull(appliedTaxes, "appliedTaxes");
        this.appliedTaxes = appliedTaxes;
        return this;
    }

    public LineItems withAppliedDiscounts(List<AppliedDiscounts> appliedDiscounts) {
        Utils.checkNotNull(appliedDiscounts, "appliedDiscounts");
        this.appliedDiscounts = Optional.ofNullable(appliedDiscounts);
        return this;
    }

    public LineItems withAppliedDiscounts(Optional<? extends List<AppliedDiscounts>> appliedDiscounts) {
        Utils.checkNotNull(appliedDiscounts, "appliedDiscounts");
        this.appliedDiscounts = appliedDiscounts;
        return this;
    }

    /**
     * Customizable options – toppings, add-ons, or special requests – create item modifiers. Modifiers that are applied to items will display on your customers’ digital receipts
     */
    public LineItems withModifiers(List<OrderModifiers> modifiers) {
        Utils.checkNotNull(modifiers, "modifiers");
        this.modifiers = Optional.ofNullable(modifiers);
        return this;
    }

    /**
     * Customizable options – toppings, add-ons, or special requests – create item modifiers. Modifiers that are applied to items will display on your customers’ digital receipts
     */
    public LineItems withModifiers(Optional<? extends List<OrderModifiers>> modifiers) {
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
        LineItems other = (LineItems) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
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
            id,
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
        return Utils.toString(LineItems.class,
                "id", id,
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
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<? extends OrderItem> item = Optional.empty();
 
        private JsonNullable<Long> totalTax = JsonNullable.undefined();
 
        private JsonNullable<Long> totalDiscount = JsonNullable.undefined();
 
        private JsonNullable<Long> totalAmount = JsonNullable.undefined();
 
        private JsonNullable<Double> quantity = JsonNullable.undefined();
 
        private JsonNullable<Double> unitPrice = JsonNullable.undefined();
 
        private Optional<? extends List<AppliedTaxes>> appliedTaxes = Optional.empty();
 
        private Optional<? extends List<AppliedDiscounts>> appliedDiscounts = Optional.empty();
 
        private Optional<? extends List<OrderModifiers>> modifiers = Optional.empty();  
        
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

        public Builder item(OrderItem item) {
            Utils.checkNotNull(item, "item");
            this.item = Optional.ofNullable(item);
            return this;
        }

        public Builder item(Optional<? extends OrderItem> item) {
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

        public Builder appliedTaxes(List<AppliedTaxes> appliedTaxes) {
            Utils.checkNotNull(appliedTaxes, "appliedTaxes");
            this.appliedTaxes = Optional.ofNullable(appliedTaxes);
            return this;
        }

        public Builder appliedTaxes(Optional<? extends List<AppliedTaxes>> appliedTaxes) {
            Utils.checkNotNull(appliedTaxes, "appliedTaxes");
            this.appliedTaxes = appliedTaxes;
            return this;
        }

        public Builder appliedDiscounts(List<AppliedDiscounts> appliedDiscounts) {
            Utils.checkNotNull(appliedDiscounts, "appliedDiscounts");
            this.appliedDiscounts = Optional.ofNullable(appliedDiscounts);
            return this;
        }

        public Builder appliedDiscounts(Optional<? extends List<AppliedDiscounts>> appliedDiscounts) {
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
        
        public LineItems build() {
            return new LineItems(
                id,
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

