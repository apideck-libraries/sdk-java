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
import java.lang.Deprecated;
import java.lang.Double;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class JournalEntryLineItem {

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * User defined description
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * Tax amount
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tax_amount")
    private JsonNullable<Double> taxAmount;

    /**
     * Sub-total amount, normally before tax.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sub_total")
    private JsonNullable<Double> subTotal;

    /**
     * Debit entries are considered positive, and credit entries are considered negative.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_amount")
    private JsonNullable<Double> totalAmount;

    /**
     * Debit entries are considered positive, and credit entries are considered negative.
     */
    @JsonProperty("type")
    private JournalEntryLineItemType type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tax_rate")
    private Optional<? extends LinkedTaxRate> taxRate;

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tracking_category")
    @Deprecated
    private JsonNullable<? extends DeprecatedLinkedTrackingCategory> trackingCategory;

    /**
     * A list of linked tracking categories.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tracking_categories")
    private JsonNullable<? extends List<LinkedTrackingCategory>> trackingCategories;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("ledger_account")
    private Optional<? extends LinkedLedgerAccount> ledgerAccount;

    /**
     * The customer this entity is linked to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer")
    private JsonNullable<? extends LinkedCustomer> customer;

    /**
     * The supplier this entity is linked to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supplier")
    private JsonNullable<? extends LinkedSupplier> supplier;

    /**
     * The ID of the department
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("department_id")
    private JsonNullable<String> departmentId;

    /**
     * The ID of the location
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location_id")
    private JsonNullable<String> locationId;

    /**
     * Line number of the resource
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("line_number")
    private JsonNullable<Long> lineNumber;

    @JsonCreator
    public JournalEntryLineItem(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("tax_amount") JsonNullable<Double> taxAmount,
            @JsonProperty("sub_total") JsonNullable<Double> subTotal,
            @JsonProperty("total_amount") JsonNullable<Double> totalAmount,
            @JsonProperty("type") JournalEntryLineItemType type,
            @JsonProperty("tax_rate") Optional<? extends LinkedTaxRate> taxRate,
            @JsonProperty("tracking_category") JsonNullable<? extends DeprecatedLinkedTrackingCategory> trackingCategory,
            @JsonProperty("tracking_categories") JsonNullable<? extends List<LinkedTrackingCategory>> trackingCategories,
            @JsonProperty("ledger_account") Optional<? extends LinkedLedgerAccount> ledgerAccount,
            @JsonProperty("customer") JsonNullable<? extends LinkedCustomer> customer,
            @JsonProperty("supplier") JsonNullable<? extends LinkedSupplier> supplier,
            @JsonProperty("department_id") JsonNullable<String> departmentId,
            @JsonProperty("location_id") JsonNullable<String> locationId,
            @JsonProperty("line_number") JsonNullable<Long> lineNumber) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(taxAmount, "taxAmount");
        Utils.checkNotNull(subTotal, "subTotal");
        Utils.checkNotNull(totalAmount, "totalAmount");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(taxRate, "taxRate");
        Utils.checkNotNull(trackingCategory, "trackingCategory");
        Utils.checkNotNull(trackingCategories, "trackingCategories");
        Utils.checkNotNull(ledgerAccount, "ledgerAccount");
        Utils.checkNotNull(customer, "customer");
        Utils.checkNotNull(supplier, "supplier");
        Utils.checkNotNull(departmentId, "departmentId");
        Utils.checkNotNull(locationId, "locationId");
        Utils.checkNotNull(lineNumber, "lineNumber");
        this.id = id;
        this.description = description;
        this.taxAmount = taxAmount;
        this.subTotal = subTotal;
        this.totalAmount = totalAmount;
        this.type = type;
        this.taxRate = taxRate;
        this.trackingCategory = trackingCategory;
        this.trackingCategories = trackingCategories;
        this.ledgerAccount = ledgerAccount;
        this.customer = customer;
        this.supplier = supplier;
        this.departmentId = departmentId;
        this.locationId = locationId;
        this.lineNumber = lineNumber;
    }
    
    public JournalEntryLineItem(
            JournalEntryLineItemType type) {
        this(Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), type, Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * User defined description
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * Tax amount
     */
    @JsonIgnore
    public JsonNullable<Double> taxAmount() {
        return taxAmount;
    }

    /**
     * Sub-total amount, normally before tax.
     */
    @JsonIgnore
    public JsonNullable<Double> subTotal() {
        return subTotal;
    }

    /**
     * Debit entries are considered positive, and credit entries are considered negative.
     */
    @JsonIgnore
    public JsonNullable<Double> totalAmount() {
        return totalAmount;
    }

    /**
     * Debit entries are considered positive, and credit entries are considered negative.
     */
    @JsonIgnore
    public JournalEntryLineItemType type() {
        return type;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LinkedTaxRate> taxRate() {
        return (Optional<LinkedTaxRate>) taxRate;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<DeprecatedLinkedTrackingCategory> trackingCategory() {
        return (JsonNullable<DeprecatedLinkedTrackingCategory>) trackingCategory;
    }

    /**
     * A list of linked tracking categories.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<LinkedTrackingCategory>> trackingCategories() {
        return (JsonNullable<List<LinkedTrackingCategory>>) trackingCategories;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LinkedLedgerAccount> ledgerAccount() {
        return (Optional<LinkedLedgerAccount>) ledgerAccount;
    }

    /**
     * The customer this entity is linked to.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<LinkedCustomer> customer() {
        return (JsonNullable<LinkedCustomer>) customer;
    }

    /**
     * The supplier this entity is linked to.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<LinkedSupplier> supplier() {
        return (JsonNullable<LinkedSupplier>) supplier;
    }

    /**
     * The ID of the department
     */
    @JsonIgnore
    public JsonNullable<String> departmentId() {
        return departmentId;
    }

    /**
     * The ID of the location
     */
    @JsonIgnore
    public JsonNullable<String> locationId() {
        return locationId;
    }

    /**
     * Line number of the resource
     */
    @JsonIgnore
    public JsonNullable<Long> lineNumber() {
        return lineNumber;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * A unique identifier for an object.
     */
    public JournalEntryLineItem withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public JournalEntryLineItem withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * User defined description
     */
    public JournalEntryLineItem withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * User defined description
     */
    public JournalEntryLineItem withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Tax amount
     */
    public JournalEntryLineItem withTaxAmount(double taxAmount) {
        Utils.checkNotNull(taxAmount, "taxAmount");
        this.taxAmount = JsonNullable.of(taxAmount);
        return this;
    }

    /**
     * Tax amount
     */
    public JournalEntryLineItem withTaxAmount(JsonNullable<Double> taxAmount) {
        Utils.checkNotNull(taxAmount, "taxAmount");
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Sub-total amount, normally before tax.
     */
    public JournalEntryLineItem withSubTotal(double subTotal) {
        Utils.checkNotNull(subTotal, "subTotal");
        this.subTotal = JsonNullable.of(subTotal);
        return this;
    }

    /**
     * Sub-total amount, normally before tax.
     */
    public JournalEntryLineItem withSubTotal(JsonNullable<Double> subTotal) {
        Utils.checkNotNull(subTotal, "subTotal");
        this.subTotal = subTotal;
        return this;
    }

    /**
     * Debit entries are considered positive, and credit entries are considered negative.
     */
    public JournalEntryLineItem withTotalAmount(double totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = JsonNullable.of(totalAmount);
        return this;
    }

    /**
     * Debit entries are considered positive, and credit entries are considered negative.
     */
    public JournalEntryLineItem withTotalAmount(JsonNullable<Double> totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Debit entries are considered positive, and credit entries are considered negative.
     */
    public JournalEntryLineItem withType(JournalEntryLineItemType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public JournalEntryLineItem withTaxRate(LinkedTaxRate taxRate) {
        Utils.checkNotNull(taxRate, "taxRate");
        this.taxRate = Optional.ofNullable(taxRate);
        return this;
    }

    public JournalEntryLineItem withTaxRate(Optional<? extends LinkedTaxRate> taxRate) {
        Utils.checkNotNull(taxRate, "taxRate");
        this.taxRate = taxRate;
        return this;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public JournalEntryLineItem withTrackingCategory(DeprecatedLinkedTrackingCategory trackingCategory) {
        Utils.checkNotNull(trackingCategory, "trackingCategory");
        this.trackingCategory = JsonNullable.of(trackingCategory);
        return this;
    }

    /**
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public JournalEntryLineItem withTrackingCategory(JsonNullable<? extends DeprecatedLinkedTrackingCategory> trackingCategory) {
        Utils.checkNotNull(trackingCategory, "trackingCategory");
        this.trackingCategory = trackingCategory;
        return this;
    }

    /**
     * A list of linked tracking categories.
     */
    public JournalEntryLineItem withTrackingCategories(List<LinkedTrackingCategory> trackingCategories) {
        Utils.checkNotNull(trackingCategories, "trackingCategories");
        this.trackingCategories = JsonNullable.of(trackingCategories);
        return this;
    }

    /**
     * A list of linked tracking categories.
     */
    public JournalEntryLineItem withTrackingCategories(JsonNullable<? extends List<LinkedTrackingCategory>> trackingCategories) {
        Utils.checkNotNull(trackingCategories, "trackingCategories");
        this.trackingCategories = trackingCategories;
        return this;
    }

    public JournalEntryLineItem withLedgerAccount(LinkedLedgerAccount ledgerAccount) {
        Utils.checkNotNull(ledgerAccount, "ledgerAccount");
        this.ledgerAccount = Optional.ofNullable(ledgerAccount);
        return this;
    }

    public JournalEntryLineItem withLedgerAccount(Optional<? extends LinkedLedgerAccount> ledgerAccount) {
        Utils.checkNotNull(ledgerAccount, "ledgerAccount");
        this.ledgerAccount = ledgerAccount;
        return this;
    }

    /**
     * The customer this entity is linked to.
     */
    public JournalEntryLineItem withCustomer(LinkedCustomer customer) {
        Utils.checkNotNull(customer, "customer");
        this.customer = JsonNullable.of(customer);
        return this;
    }

    /**
     * The customer this entity is linked to.
     */
    public JournalEntryLineItem withCustomer(JsonNullable<? extends LinkedCustomer> customer) {
        Utils.checkNotNull(customer, "customer");
        this.customer = customer;
        return this;
    }

    /**
     * The supplier this entity is linked to.
     */
    public JournalEntryLineItem withSupplier(LinkedSupplier supplier) {
        Utils.checkNotNull(supplier, "supplier");
        this.supplier = JsonNullable.of(supplier);
        return this;
    }

    /**
     * The supplier this entity is linked to.
     */
    public JournalEntryLineItem withSupplier(JsonNullable<? extends LinkedSupplier> supplier) {
        Utils.checkNotNull(supplier, "supplier");
        this.supplier = supplier;
        return this;
    }

    /**
     * The ID of the department
     */
    public JournalEntryLineItem withDepartmentId(String departmentId) {
        Utils.checkNotNull(departmentId, "departmentId");
        this.departmentId = JsonNullable.of(departmentId);
        return this;
    }

    /**
     * The ID of the department
     */
    public JournalEntryLineItem withDepartmentId(JsonNullable<String> departmentId) {
        Utils.checkNotNull(departmentId, "departmentId");
        this.departmentId = departmentId;
        return this;
    }

    /**
     * The ID of the location
     */
    public JournalEntryLineItem withLocationId(String locationId) {
        Utils.checkNotNull(locationId, "locationId");
        this.locationId = JsonNullable.of(locationId);
        return this;
    }

    /**
     * The ID of the location
     */
    public JournalEntryLineItem withLocationId(JsonNullable<String> locationId) {
        Utils.checkNotNull(locationId, "locationId");
        this.locationId = locationId;
        return this;
    }

    /**
     * Line number of the resource
     */
    public JournalEntryLineItem withLineNumber(long lineNumber) {
        Utils.checkNotNull(lineNumber, "lineNumber");
        this.lineNumber = JsonNullable.of(lineNumber);
        return this;
    }

    /**
     * Line number of the resource
     */
    public JournalEntryLineItem withLineNumber(JsonNullable<Long> lineNumber) {
        Utils.checkNotNull(lineNumber, "lineNumber");
        this.lineNumber = lineNumber;
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
        JournalEntryLineItem other = (JournalEntryLineItem) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.taxAmount, other.taxAmount) &&
            Objects.deepEquals(this.subTotal, other.subTotal) &&
            Objects.deepEquals(this.totalAmount, other.totalAmount) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.taxRate, other.taxRate) &&
            Objects.deepEquals(this.trackingCategory, other.trackingCategory) &&
            Objects.deepEquals(this.trackingCategories, other.trackingCategories) &&
            Objects.deepEquals(this.ledgerAccount, other.ledgerAccount) &&
            Objects.deepEquals(this.customer, other.customer) &&
            Objects.deepEquals(this.supplier, other.supplier) &&
            Objects.deepEquals(this.departmentId, other.departmentId) &&
            Objects.deepEquals(this.locationId, other.locationId) &&
            Objects.deepEquals(this.lineNumber, other.lineNumber);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            description,
            taxAmount,
            subTotal,
            totalAmount,
            type,
            taxRate,
            trackingCategory,
            trackingCategories,
            ledgerAccount,
            customer,
            supplier,
            departmentId,
            locationId,
            lineNumber);
    }
    
    @Override
    public String toString() {
        return Utils.toString(JournalEntryLineItem.class,
                "id", id,
                "description", description,
                "taxAmount", taxAmount,
                "subTotal", subTotal,
                "totalAmount", totalAmount,
                "type", type,
                "taxRate", taxRate,
                "trackingCategory", trackingCategory,
                "trackingCategories", trackingCategories,
                "ledgerAccount", ledgerAccount,
                "customer", customer,
                "supplier", supplier,
                "departmentId", departmentId,
                "locationId", locationId,
                "lineNumber", lineNumber);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private JsonNullable<String> description = JsonNullable.undefined();
 
        private JsonNullable<Double> taxAmount = JsonNullable.undefined();
 
        private JsonNullable<Double> subTotal = JsonNullable.undefined();
 
        private JsonNullable<Double> totalAmount = JsonNullable.undefined();
 
        private JournalEntryLineItemType type;
 
        private Optional<? extends LinkedTaxRate> taxRate = Optional.empty();
 
        @Deprecated
        private JsonNullable<? extends DeprecatedLinkedTrackingCategory> trackingCategory = JsonNullable.undefined();
 
        private JsonNullable<? extends List<LinkedTrackingCategory>> trackingCategories = JsonNullable.undefined();
 
        private Optional<? extends LinkedLedgerAccount> ledgerAccount = Optional.empty();
 
        private JsonNullable<? extends LinkedCustomer> customer = JsonNullable.undefined();
 
        private JsonNullable<? extends LinkedSupplier> supplier = JsonNullable.undefined();
 
        private JsonNullable<String> departmentId = JsonNullable.undefined();
 
        private JsonNullable<String> locationId = JsonNullable.undefined();
 
        private JsonNullable<Long> lineNumber = JsonNullable.undefined();
        
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
         * User defined description
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * User defined description
         */
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * Tax amount
         */
        public Builder taxAmount(double taxAmount) {
            Utils.checkNotNull(taxAmount, "taxAmount");
            this.taxAmount = JsonNullable.of(taxAmount);
            return this;
        }

        /**
         * Tax amount
         */
        public Builder taxAmount(JsonNullable<Double> taxAmount) {
            Utils.checkNotNull(taxAmount, "taxAmount");
            this.taxAmount = taxAmount;
            return this;
        }

        /**
         * Sub-total amount, normally before tax.
         */
        public Builder subTotal(double subTotal) {
            Utils.checkNotNull(subTotal, "subTotal");
            this.subTotal = JsonNullable.of(subTotal);
            return this;
        }

        /**
         * Sub-total amount, normally before tax.
         */
        public Builder subTotal(JsonNullable<Double> subTotal) {
            Utils.checkNotNull(subTotal, "subTotal");
            this.subTotal = subTotal;
            return this;
        }

        /**
         * Debit entries are considered positive, and credit entries are considered negative.
         */
        public Builder totalAmount(double totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = JsonNullable.of(totalAmount);
            return this;
        }

        /**
         * Debit entries are considered positive, and credit entries are considered negative.
         */
        public Builder totalAmount(JsonNullable<Double> totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = totalAmount;
            return this;
        }

        /**
         * Debit entries are considered positive, and credit entries are considered negative.
         */
        public Builder type(JournalEntryLineItemType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder taxRate(LinkedTaxRate taxRate) {
            Utils.checkNotNull(taxRate, "taxRate");
            this.taxRate = Optional.ofNullable(taxRate);
            return this;
        }

        public Builder taxRate(Optional<? extends LinkedTaxRate> taxRate) {
            Utils.checkNotNull(taxRate, "taxRate");
            this.taxRate = taxRate;
            return this;
        }

        /**
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder trackingCategory(DeprecatedLinkedTrackingCategory trackingCategory) {
            Utils.checkNotNull(trackingCategory, "trackingCategory");
            this.trackingCategory = JsonNullable.of(trackingCategory);
            return this;
        }

        /**
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder trackingCategory(JsonNullable<? extends DeprecatedLinkedTrackingCategory> trackingCategory) {
            Utils.checkNotNull(trackingCategory, "trackingCategory");
            this.trackingCategory = trackingCategory;
            return this;
        }

        /**
         * A list of linked tracking categories.
         */
        public Builder trackingCategories(List<LinkedTrackingCategory> trackingCategories) {
            Utils.checkNotNull(trackingCategories, "trackingCategories");
            this.trackingCategories = JsonNullable.of(trackingCategories);
            return this;
        }

        /**
         * A list of linked tracking categories.
         */
        public Builder trackingCategories(JsonNullable<? extends List<LinkedTrackingCategory>> trackingCategories) {
            Utils.checkNotNull(trackingCategories, "trackingCategories");
            this.trackingCategories = trackingCategories;
            return this;
        }

        public Builder ledgerAccount(LinkedLedgerAccount ledgerAccount) {
            Utils.checkNotNull(ledgerAccount, "ledgerAccount");
            this.ledgerAccount = Optional.ofNullable(ledgerAccount);
            return this;
        }

        public Builder ledgerAccount(Optional<? extends LinkedLedgerAccount> ledgerAccount) {
            Utils.checkNotNull(ledgerAccount, "ledgerAccount");
            this.ledgerAccount = ledgerAccount;
            return this;
        }

        /**
         * The customer this entity is linked to.
         */
        public Builder customer(LinkedCustomer customer) {
            Utils.checkNotNull(customer, "customer");
            this.customer = JsonNullable.of(customer);
            return this;
        }

        /**
         * The customer this entity is linked to.
         */
        public Builder customer(JsonNullable<? extends LinkedCustomer> customer) {
            Utils.checkNotNull(customer, "customer");
            this.customer = customer;
            return this;
        }

        /**
         * The supplier this entity is linked to.
         */
        public Builder supplier(LinkedSupplier supplier) {
            Utils.checkNotNull(supplier, "supplier");
            this.supplier = JsonNullable.of(supplier);
            return this;
        }

        /**
         * The supplier this entity is linked to.
         */
        public Builder supplier(JsonNullable<? extends LinkedSupplier> supplier) {
            Utils.checkNotNull(supplier, "supplier");
            this.supplier = supplier;
            return this;
        }

        /**
         * The ID of the department
         */
        public Builder departmentId(String departmentId) {
            Utils.checkNotNull(departmentId, "departmentId");
            this.departmentId = JsonNullable.of(departmentId);
            return this;
        }

        /**
         * The ID of the department
         */
        public Builder departmentId(JsonNullable<String> departmentId) {
            Utils.checkNotNull(departmentId, "departmentId");
            this.departmentId = departmentId;
            return this;
        }

        /**
         * The ID of the location
         */
        public Builder locationId(String locationId) {
            Utils.checkNotNull(locationId, "locationId");
            this.locationId = JsonNullable.of(locationId);
            return this;
        }

        /**
         * The ID of the location
         */
        public Builder locationId(JsonNullable<String> locationId) {
            Utils.checkNotNull(locationId, "locationId");
            this.locationId = locationId;
            return this;
        }

        /**
         * Line number of the resource
         */
        public Builder lineNumber(long lineNumber) {
            Utils.checkNotNull(lineNumber, "lineNumber");
            this.lineNumber = JsonNullable.of(lineNumber);
            return this;
        }

        /**
         * Line number of the resource
         */
        public Builder lineNumber(JsonNullable<Long> lineNumber) {
            Utils.checkNotNull(lineNumber, "lineNumber");
            this.lineNumber = lineNumber;
            return this;
        }
        
        public JournalEntryLineItem build() {
            return new JournalEntryLineItem(
                id,
                description,
                taxAmount,
                subTotal,
                totalAmount,
                type,
                taxRate,
                trackingCategory,
                trackingCategories,
                ledgerAccount,
                customer,
                supplier,
                departmentId,
                locationId,
                lineNumber);
        }
    }
}
