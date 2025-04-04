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

public class BillLineItemInput {

    /**
     * Row ID
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("row_id")
    private Optional<String> rowId;

    /**
     * User defined item code
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private JsonNullable<String> code;

    /**
     * Line number in the invoice
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("line_number")
    private JsonNullable<Long> lineNumber;

    /**
     * User defined description
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * Bill Line Item type
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private JsonNullable<? extends BillLineItemType> type;

    /**
     * Tax amount
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tax_amount")
    private JsonNullable<Double> taxAmount;

    /**
     * Total amount of the line item
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_amount")
    private JsonNullable<Double> totalAmount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("quantity")
    private JsonNullable<Double> quantity;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unit_price")
    private JsonNullable<Double> unitPrice;

    /**
     * Description of the unit type the item is sold as, ie: kg, hour.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unit_of_measure")
    private JsonNullable<String> unitOfMeasure;

    /**
     * Discount percentage applied to the line item when supported downstream.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discount_percentage")
    private JsonNullable<Double> discountPercentage;

    /**
     * Discount amount applied to the line item when supported downstream.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discount_amount")
    private JsonNullable<Double> discountAmount;

    /**
     * The ID of the location
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location_id")
    private JsonNullable<String> locationId;

    /**
     * The ID of the department
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("department_id")
    private JsonNullable<String> departmentId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("item")
    private Optional<? extends LinkedInvoiceItem> item;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tax_rate")
    private Optional<? extends LinkedTaxRateInput> taxRate;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ledger_account")
    private JsonNullable<? extends LinkedLedgerAccountInput> ledgerAccount;

    /**
     * A list of linked tracking categories.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tracking_categories")
    private JsonNullable<? extends List<LinkedTrackingCategory>> trackingCategories;

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("row_version")
    private JsonNullable<String> rowVersion;

    @JsonCreator
    public BillLineItemInput(
            @JsonProperty("row_id") Optional<String> rowId,
            @JsonProperty("code") JsonNullable<String> code,
            @JsonProperty("line_number") JsonNullable<Long> lineNumber,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("type") JsonNullable<? extends BillLineItemType> type,
            @JsonProperty("tax_amount") JsonNullable<Double> taxAmount,
            @JsonProperty("total_amount") JsonNullable<Double> totalAmount,
            @JsonProperty("quantity") JsonNullable<Double> quantity,
            @JsonProperty("unit_price") JsonNullable<Double> unitPrice,
            @JsonProperty("unit_of_measure") JsonNullable<String> unitOfMeasure,
            @JsonProperty("discount_percentage") JsonNullable<Double> discountPercentage,
            @JsonProperty("discount_amount") JsonNullable<Double> discountAmount,
            @JsonProperty("location_id") JsonNullable<String> locationId,
            @JsonProperty("department_id") JsonNullable<String> departmentId,
            @JsonProperty("item") Optional<? extends LinkedInvoiceItem> item,
            @JsonProperty("tax_rate") Optional<? extends LinkedTaxRateInput> taxRate,
            @JsonProperty("ledger_account") JsonNullable<? extends LinkedLedgerAccountInput> ledgerAccount,
            @JsonProperty("tracking_categories") JsonNullable<? extends List<LinkedTrackingCategory>> trackingCategories,
            @JsonProperty("row_version") JsonNullable<String> rowVersion) {
        Utils.checkNotNull(rowId, "rowId");
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(lineNumber, "lineNumber");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(taxAmount, "taxAmount");
        Utils.checkNotNull(totalAmount, "totalAmount");
        Utils.checkNotNull(quantity, "quantity");
        Utils.checkNotNull(unitPrice, "unitPrice");
        Utils.checkNotNull(unitOfMeasure, "unitOfMeasure");
        Utils.checkNotNull(discountPercentage, "discountPercentage");
        Utils.checkNotNull(discountAmount, "discountAmount");
        Utils.checkNotNull(locationId, "locationId");
        Utils.checkNotNull(departmentId, "departmentId");
        Utils.checkNotNull(item, "item");
        Utils.checkNotNull(taxRate, "taxRate");
        Utils.checkNotNull(ledgerAccount, "ledgerAccount");
        Utils.checkNotNull(trackingCategories, "trackingCategories");
        Utils.checkNotNull(rowVersion, "rowVersion");
        this.rowId = rowId;
        this.code = code;
        this.lineNumber = lineNumber;
        this.description = description;
        this.type = type;
        this.taxAmount = taxAmount;
        this.totalAmount = totalAmount;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.unitOfMeasure = unitOfMeasure;
        this.discountPercentage = discountPercentage;
        this.discountAmount = discountAmount;
        this.locationId = locationId;
        this.departmentId = departmentId;
        this.item = item;
        this.taxRate = taxRate;
        this.ledgerAccount = ledgerAccount;
        this.trackingCategories = trackingCategories;
        this.rowVersion = rowVersion;
    }
    
    public BillLineItemInput() {
        this(Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Row ID
     */
    @JsonIgnore
    public Optional<String> rowId() {
        return rowId;
    }

    /**
     * User defined item code
     */
    @JsonIgnore
    public JsonNullable<String> code() {
        return code;
    }

    /**
     * Line number in the invoice
     */
    @JsonIgnore
    public JsonNullable<Long> lineNumber() {
        return lineNumber;
    }

    /**
     * User defined description
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * Bill Line Item type
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<BillLineItemType> type() {
        return (JsonNullable<BillLineItemType>) type;
    }

    /**
     * Tax amount
     */
    @JsonIgnore
    public JsonNullable<Double> taxAmount() {
        return taxAmount;
    }

    /**
     * Total amount of the line item
     */
    @JsonIgnore
    public JsonNullable<Double> totalAmount() {
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

    /**
     * Description of the unit type the item is sold as, ie: kg, hour.
     */
    @JsonIgnore
    public JsonNullable<String> unitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Discount percentage applied to the line item when supported downstream.
     */
    @JsonIgnore
    public JsonNullable<Double> discountPercentage() {
        return discountPercentage;
    }

    /**
     * Discount amount applied to the line item when supported downstream.
     */
    @JsonIgnore
    public JsonNullable<Double> discountAmount() {
        return discountAmount;
    }

    /**
     * The ID of the location
     */
    @JsonIgnore
    public JsonNullable<String> locationId() {
        return locationId;
    }

    /**
     * The ID of the department
     */
    @JsonIgnore
    public JsonNullable<String> departmentId() {
        return departmentId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LinkedInvoiceItem> item() {
        return (Optional<LinkedInvoiceItem>) item;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LinkedTaxRateInput> taxRate() {
        return (Optional<LinkedTaxRateInput>) taxRate;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<LinkedLedgerAccountInput> ledgerAccount() {
        return (JsonNullable<LinkedLedgerAccountInput>) ledgerAccount;
    }

    /**
     * A list of linked tracking categories.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<LinkedTrackingCategory>> trackingCategories() {
        return (JsonNullable<List<LinkedTrackingCategory>>) trackingCategories;
    }

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    @JsonIgnore
    public JsonNullable<String> rowVersion() {
        return rowVersion;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Row ID
     */
    public BillLineItemInput withRowId(String rowId) {
        Utils.checkNotNull(rowId, "rowId");
        this.rowId = Optional.ofNullable(rowId);
        return this;
    }

    /**
     * Row ID
     */
    public BillLineItemInput withRowId(Optional<String> rowId) {
        Utils.checkNotNull(rowId, "rowId");
        this.rowId = rowId;
        return this;
    }

    /**
     * User defined item code
     */
    public BillLineItemInput withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = JsonNullable.of(code);
        return this;
    }

    /**
     * User defined item code
     */
    public BillLineItemInput withCode(JsonNullable<String> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    /**
     * Line number in the invoice
     */
    public BillLineItemInput withLineNumber(long lineNumber) {
        Utils.checkNotNull(lineNumber, "lineNumber");
        this.lineNumber = JsonNullable.of(lineNumber);
        return this;
    }

    /**
     * Line number in the invoice
     */
    public BillLineItemInput withLineNumber(JsonNullable<Long> lineNumber) {
        Utils.checkNotNull(lineNumber, "lineNumber");
        this.lineNumber = lineNumber;
        return this;
    }

    /**
     * User defined description
     */
    public BillLineItemInput withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * User defined description
     */
    public BillLineItemInput withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Bill Line Item type
     */
    public BillLineItemInput withType(BillLineItemType type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * Bill Line Item type
     */
    public BillLineItemInput withType(JsonNullable<? extends BillLineItemType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Tax amount
     */
    public BillLineItemInput withTaxAmount(double taxAmount) {
        Utils.checkNotNull(taxAmount, "taxAmount");
        this.taxAmount = JsonNullable.of(taxAmount);
        return this;
    }

    /**
     * Tax amount
     */
    public BillLineItemInput withTaxAmount(JsonNullable<Double> taxAmount) {
        Utils.checkNotNull(taxAmount, "taxAmount");
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Total amount of the line item
     */
    public BillLineItemInput withTotalAmount(double totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = JsonNullable.of(totalAmount);
        return this;
    }

    /**
     * Total amount of the line item
     */
    public BillLineItemInput withTotalAmount(JsonNullable<Double> totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = totalAmount;
        return this;
    }

    public BillLineItemInput withQuantity(double quantity) {
        Utils.checkNotNull(quantity, "quantity");
        this.quantity = JsonNullable.of(quantity);
        return this;
    }

    public BillLineItemInput withQuantity(JsonNullable<Double> quantity) {
        Utils.checkNotNull(quantity, "quantity");
        this.quantity = quantity;
        return this;
    }

    public BillLineItemInput withUnitPrice(double unitPrice) {
        Utils.checkNotNull(unitPrice, "unitPrice");
        this.unitPrice = JsonNullable.of(unitPrice);
        return this;
    }

    public BillLineItemInput withUnitPrice(JsonNullable<Double> unitPrice) {
        Utils.checkNotNull(unitPrice, "unitPrice");
        this.unitPrice = unitPrice;
        return this;
    }

    /**
     * Description of the unit type the item is sold as, ie: kg, hour.
     */
    public BillLineItemInput withUnitOfMeasure(String unitOfMeasure) {
        Utils.checkNotNull(unitOfMeasure, "unitOfMeasure");
        this.unitOfMeasure = JsonNullable.of(unitOfMeasure);
        return this;
    }

    /**
     * Description of the unit type the item is sold as, ie: kg, hour.
     */
    public BillLineItemInput withUnitOfMeasure(JsonNullable<String> unitOfMeasure) {
        Utils.checkNotNull(unitOfMeasure, "unitOfMeasure");
        this.unitOfMeasure = unitOfMeasure;
        return this;
    }

    /**
     * Discount percentage applied to the line item when supported downstream.
     */
    public BillLineItemInput withDiscountPercentage(double discountPercentage) {
        Utils.checkNotNull(discountPercentage, "discountPercentage");
        this.discountPercentage = JsonNullable.of(discountPercentage);
        return this;
    }

    /**
     * Discount percentage applied to the line item when supported downstream.
     */
    public BillLineItemInput withDiscountPercentage(JsonNullable<Double> discountPercentage) {
        Utils.checkNotNull(discountPercentage, "discountPercentage");
        this.discountPercentage = discountPercentage;
        return this;
    }

    /**
     * Discount amount applied to the line item when supported downstream.
     */
    public BillLineItemInput withDiscountAmount(double discountAmount) {
        Utils.checkNotNull(discountAmount, "discountAmount");
        this.discountAmount = JsonNullable.of(discountAmount);
        return this;
    }

    /**
     * Discount amount applied to the line item when supported downstream.
     */
    public BillLineItemInput withDiscountAmount(JsonNullable<Double> discountAmount) {
        Utils.checkNotNull(discountAmount, "discountAmount");
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * The ID of the location
     */
    public BillLineItemInput withLocationId(String locationId) {
        Utils.checkNotNull(locationId, "locationId");
        this.locationId = JsonNullable.of(locationId);
        return this;
    }

    /**
     * The ID of the location
     */
    public BillLineItemInput withLocationId(JsonNullable<String> locationId) {
        Utils.checkNotNull(locationId, "locationId");
        this.locationId = locationId;
        return this;
    }

    /**
     * The ID of the department
     */
    public BillLineItemInput withDepartmentId(String departmentId) {
        Utils.checkNotNull(departmentId, "departmentId");
        this.departmentId = JsonNullable.of(departmentId);
        return this;
    }

    /**
     * The ID of the department
     */
    public BillLineItemInput withDepartmentId(JsonNullable<String> departmentId) {
        Utils.checkNotNull(departmentId, "departmentId");
        this.departmentId = departmentId;
        return this;
    }

    public BillLineItemInput withItem(LinkedInvoiceItem item) {
        Utils.checkNotNull(item, "item");
        this.item = Optional.ofNullable(item);
        return this;
    }

    public BillLineItemInput withItem(Optional<? extends LinkedInvoiceItem> item) {
        Utils.checkNotNull(item, "item");
        this.item = item;
        return this;
    }

    public BillLineItemInput withTaxRate(LinkedTaxRateInput taxRate) {
        Utils.checkNotNull(taxRate, "taxRate");
        this.taxRate = Optional.ofNullable(taxRate);
        return this;
    }

    public BillLineItemInput withTaxRate(Optional<? extends LinkedTaxRateInput> taxRate) {
        Utils.checkNotNull(taxRate, "taxRate");
        this.taxRate = taxRate;
        return this;
    }

    public BillLineItemInput withLedgerAccount(LinkedLedgerAccountInput ledgerAccount) {
        Utils.checkNotNull(ledgerAccount, "ledgerAccount");
        this.ledgerAccount = JsonNullable.of(ledgerAccount);
        return this;
    }

    public BillLineItemInput withLedgerAccount(JsonNullable<? extends LinkedLedgerAccountInput> ledgerAccount) {
        Utils.checkNotNull(ledgerAccount, "ledgerAccount");
        this.ledgerAccount = ledgerAccount;
        return this;
    }

    /**
     * A list of linked tracking categories.
     */
    public BillLineItemInput withTrackingCategories(List<LinkedTrackingCategory> trackingCategories) {
        Utils.checkNotNull(trackingCategories, "trackingCategories");
        this.trackingCategories = JsonNullable.of(trackingCategories);
        return this;
    }

    /**
     * A list of linked tracking categories.
     */
    public BillLineItemInput withTrackingCategories(JsonNullable<? extends List<LinkedTrackingCategory>> trackingCategories) {
        Utils.checkNotNull(trackingCategories, "trackingCategories");
        this.trackingCategories = trackingCategories;
        return this;
    }

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    public BillLineItemInput withRowVersion(String rowVersion) {
        Utils.checkNotNull(rowVersion, "rowVersion");
        this.rowVersion = JsonNullable.of(rowVersion);
        return this;
    }

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    public BillLineItemInput withRowVersion(JsonNullable<String> rowVersion) {
        Utils.checkNotNull(rowVersion, "rowVersion");
        this.rowVersion = rowVersion;
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
        BillLineItemInput other = (BillLineItemInput) o;
        return 
            Objects.deepEquals(this.rowId, other.rowId) &&
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.lineNumber, other.lineNumber) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.taxAmount, other.taxAmount) &&
            Objects.deepEquals(this.totalAmount, other.totalAmount) &&
            Objects.deepEquals(this.quantity, other.quantity) &&
            Objects.deepEquals(this.unitPrice, other.unitPrice) &&
            Objects.deepEquals(this.unitOfMeasure, other.unitOfMeasure) &&
            Objects.deepEquals(this.discountPercentage, other.discountPercentage) &&
            Objects.deepEquals(this.discountAmount, other.discountAmount) &&
            Objects.deepEquals(this.locationId, other.locationId) &&
            Objects.deepEquals(this.departmentId, other.departmentId) &&
            Objects.deepEquals(this.item, other.item) &&
            Objects.deepEquals(this.taxRate, other.taxRate) &&
            Objects.deepEquals(this.ledgerAccount, other.ledgerAccount) &&
            Objects.deepEquals(this.trackingCategories, other.trackingCategories) &&
            Objects.deepEquals(this.rowVersion, other.rowVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            rowId,
            code,
            lineNumber,
            description,
            type,
            taxAmount,
            totalAmount,
            quantity,
            unitPrice,
            unitOfMeasure,
            discountPercentage,
            discountAmount,
            locationId,
            departmentId,
            item,
            taxRate,
            ledgerAccount,
            trackingCategories,
            rowVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BillLineItemInput.class,
                "rowId", rowId,
                "code", code,
                "lineNumber", lineNumber,
                "description", description,
                "type", type,
                "taxAmount", taxAmount,
                "totalAmount", totalAmount,
                "quantity", quantity,
                "unitPrice", unitPrice,
                "unitOfMeasure", unitOfMeasure,
                "discountPercentage", discountPercentage,
                "discountAmount", discountAmount,
                "locationId", locationId,
                "departmentId", departmentId,
                "item", item,
                "taxRate", taxRate,
                "ledgerAccount", ledgerAccount,
                "trackingCategories", trackingCategories,
                "rowVersion", rowVersion);
    }
    
    public final static class Builder {
 
        private Optional<String> rowId = Optional.empty();
 
        private JsonNullable<String> code = JsonNullable.undefined();
 
        private JsonNullable<Long> lineNumber = JsonNullable.undefined();
 
        private JsonNullable<String> description = JsonNullable.undefined();
 
        private JsonNullable<? extends BillLineItemType> type = JsonNullable.undefined();
 
        private JsonNullable<Double> taxAmount = JsonNullable.undefined();
 
        private JsonNullable<Double> totalAmount = JsonNullable.undefined();
 
        private JsonNullable<Double> quantity = JsonNullable.undefined();
 
        private JsonNullable<Double> unitPrice = JsonNullable.undefined();
 
        private JsonNullable<String> unitOfMeasure = JsonNullable.undefined();
 
        private JsonNullable<Double> discountPercentage = JsonNullable.undefined();
 
        private JsonNullable<Double> discountAmount = JsonNullable.undefined();
 
        private JsonNullable<String> locationId = JsonNullable.undefined();
 
        private JsonNullable<String> departmentId = JsonNullable.undefined();
 
        private Optional<? extends LinkedInvoiceItem> item = Optional.empty();
 
        private Optional<? extends LinkedTaxRateInput> taxRate = Optional.empty();
 
        private JsonNullable<? extends LinkedLedgerAccountInput> ledgerAccount = JsonNullable.undefined();
 
        private JsonNullable<? extends List<LinkedTrackingCategory>> trackingCategories = JsonNullable.undefined();
 
        private JsonNullable<String> rowVersion = JsonNullable.undefined();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Row ID
         */
        public Builder rowId(String rowId) {
            Utils.checkNotNull(rowId, "rowId");
            this.rowId = Optional.ofNullable(rowId);
            return this;
        }

        /**
         * Row ID
         */
        public Builder rowId(Optional<String> rowId) {
            Utils.checkNotNull(rowId, "rowId");
            this.rowId = rowId;
            return this;
        }

        /**
         * User defined item code
         */
        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = JsonNullable.of(code);
            return this;
        }

        /**
         * User defined item code
         */
        public Builder code(JsonNullable<String> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        /**
         * Line number in the invoice
         */
        public Builder lineNumber(long lineNumber) {
            Utils.checkNotNull(lineNumber, "lineNumber");
            this.lineNumber = JsonNullable.of(lineNumber);
            return this;
        }

        /**
         * Line number in the invoice
         */
        public Builder lineNumber(JsonNullable<Long> lineNumber) {
            Utils.checkNotNull(lineNumber, "lineNumber");
            this.lineNumber = lineNumber;
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
         * Bill Line Item type
         */
        public Builder type(BillLineItemType type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        /**
         * Bill Line Item type
         */
        public Builder type(JsonNullable<? extends BillLineItemType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
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
         * Total amount of the line item
         */
        public Builder totalAmount(double totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = JsonNullable.of(totalAmount);
            return this;
        }

        /**
         * Total amount of the line item
         */
        public Builder totalAmount(JsonNullable<Double> totalAmount) {
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

        /**
         * Description of the unit type the item is sold as, ie: kg, hour.
         */
        public Builder unitOfMeasure(String unitOfMeasure) {
            Utils.checkNotNull(unitOfMeasure, "unitOfMeasure");
            this.unitOfMeasure = JsonNullable.of(unitOfMeasure);
            return this;
        }

        /**
         * Description of the unit type the item is sold as, ie: kg, hour.
         */
        public Builder unitOfMeasure(JsonNullable<String> unitOfMeasure) {
            Utils.checkNotNull(unitOfMeasure, "unitOfMeasure");
            this.unitOfMeasure = unitOfMeasure;
            return this;
        }

        /**
         * Discount percentage applied to the line item when supported downstream.
         */
        public Builder discountPercentage(double discountPercentage) {
            Utils.checkNotNull(discountPercentage, "discountPercentage");
            this.discountPercentage = JsonNullable.of(discountPercentage);
            return this;
        }

        /**
         * Discount percentage applied to the line item when supported downstream.
         */
        public Builder discountPercentage(JsonNullable<Double> discountPercentage) {
            Utils.checkNotNull(discountPercentage, "discountPercentage");
            this.discountPercentage = discountPercentage;
            return this;
        }

        /**
         * Discount amount applied to the line item when supported downstream.
         */
        public Builder discountAmount(double discountAmount) {
            Utils.checkNotNull(discountAmount, "discountAmount");
            this.discountAmount = JsonNullable.of(discountAmount);
            return this;
        }

        /**
         * Discount amount applied to the line item when supported downstream.
         */
        public Builder discountAmount(JsonNullable<Double> discountAmount) {
            Utils.checkNotNull(discountAmount, "discountAmount");
            this.discountAmount = discountAmount;
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

        public Builder item(LinkedInvoiceItem item) {
            Utils.checkNotNull(item, "item");
            this.item = Optional.ofNullable(item);
            return this;
        }

        public Builder item(Optional<? extends LinkedInvoiceItem> item) {
            Utils.checkNotNull(item, "item");
            this.item = item;
            return this;
        }

        public Builder taxRate(LinkedTaxRateInput taxRate) {
            Utils.checkNotNull(taxRate, "taxRate");
            this.taxRate = Optional.ofNullable(taxRate);
            return this;
        }

        public Builder taxRate(Optional<? extends LinkedTaxRateInput> taxRate) {
            Utils.checkNotNull(taxRate, "taxRate");
            this.taxRate = taxRate;
            return this;
        }

        public Builder ledgerAccount(LinkedLedgerAccountInput ledgerAccount) {
            Utils.checkNotNull(ledgerAccount, "ledgerAccount");
            this.ledgerAccount = JsonNullable.of(ledgerAccount);
            return this;
        }

        public Builder ledgerAccount(JsonNullable<? extends LinkedLedgerAccountInput> ledgerAccount) {
            Utils.checkNotNull(ledgerAccount, "ledgerAccount");
            this.ledgerAccount = ledgerAccount;
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

        /**
         * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
         */
        public Builder rowVersion(String rowVersion) {
            Utils.checkNotNull(rowVersion, "rowVersion");
            this.rowVersion = JsonNullable.of(rowVersion);
            return this;
        }

        /**
         * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
         */
        public Builder rowVersion(JsonNullable<String> rowVersion) {
            Utils.checkNotNull(rowVersion, "rowVersion");
            this.rowVersion = rowVersion;
            return this;
        }
        
        public BillLineItemInput build() {
            return new BillLineItemInput(
                rowId,
                code,
                lineNumber,
                description,
                type,
                taxAmount,
                totalAmount,
                quantity,
                unitPrice,
                unitOfMeasure,
                discountPercentage,
                discountAmount,
                locationId,
                departmentId,
                item,
                taxRate,
                ledgerAccount,
                trackingCategories,
                rowVersion);
        }
    }
}
