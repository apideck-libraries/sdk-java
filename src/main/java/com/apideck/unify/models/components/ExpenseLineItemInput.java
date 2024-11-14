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


public class ExpenseLineItemInput {

    /**
     * A list of linked tracking categories.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tracking_categories")
    private JsonNullable<? extends List<LinkedTrackingCategory>> trackingCategories;

    /**
     * The unique identifier for the ledger account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_id")
    private Optional<String> accountId;

    /**
     * The ID of the customer this expense item is linked to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_id")
    private Optional<String> customerId;

    /**
     * The ID of the department this expense item is linked to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("department_id")
    private Optional<String> departmentId;

    /**
     * The ID of the location this expense item is linked to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location_id")
    private Optional<String> locationId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tax_rate")
    private Optional<? extends LinkedTaxRateInput> taxRate;

    /**
     * The expense line item description
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * The total amount of the expense line item.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("total_amount")
    private Optional<Double> totalAmount;

    /**
     * Boolean that indicates if the line item is billable or not.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("billable")
    private Optional<Boolean> billable;

    @JsonCreator
    public ExpenseLineItemInput(
            @JsonProperty("tracking_categories") JsonNullable<? extends List<LinkedTrackingCategory>> trackingCategories,
            @JsonProperty("account_id") Optional<String> accountId,
            @JsonProperty("customer_id") Optional<String> customerId,
            @JsonProperty("department_id") Optional<String> departmentId,
            @JsonProperty("location_id") Optional<String> locationId,
            @JsonProperty("tax_rate") Optional<? extends LinkedTaxRateInput> taxRate,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("total_amount") Optional<Double> totalAmount,
            @JsonProperty("billable") Optional<Boolean> billable) {
        Utils.checkNotNull(trackingCategories, "trackingCategories");
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(customerId, "customerId");
        Utils.checkNotNull(departmentId, "departmentId");
        Utils.checkNotNull(locationId, "locationId");
        Utils.checkNotNull(taxRate, "taxRate");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(totalAmount, "totalAmount");
        Utils.checkNotNull(billable, "billable");
        this.trackingCategories = trackingCategories;
        this.accountId = accountId;
        this.customerId = customerId;
        this.departmentId = departmentId;
        this.locationId = locationId;
        this.taxRate = taxRate;
        this.description = description;
        this.totalAmount = totalAmount;
        this.billable = billable;
    }
    
    public ExpenseLineItemInput() {
        this(JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty());
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
     * The unique identifier for the ledger account.
     */
    @JsonIgnore
    public Optional<String> accountId() {
        return accountId;
    }

    /**
     * The ID of the customer this expense item is linked to.
     */
    @JsonIgnore
    public Optional<String> customerId() {
        return customerId;
    }

    /**
     * The ID of the department this expense item is linked to.
     */
    @JsonIgnore
    public Optional<String> departmentId() {
        return departmentId;
    }

    /**
     * The ID of the location this expense item is linked to.
     */
    @JsonIgnore
    public Optional<String> locationId() {
        return locationId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LinkedTaxRateInput> taxRate() {
        return (Optional<LinkedTaxRateInput>) taxRate;
    }

    /**
     * The expense line item description
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * The total amount of the expense line item.
     */
    @JsonIgnore
    public Optional<Double> totalAmount() {
        return totalAmount;
    }

    /**
     * Boolean that indicates if the line item is billable or not.
     */
    @JsonIgnore
    public Optional<Boolean> billable() {
        return billable;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A list of linked tracking categories.
     */
    public ExpenseLineItemInput withTrackingCategories(List<LinkedTrackingCategory> trackingCategories) {
        Utils.checkNotNull(trackingCategories, "trackingCategories");
        this.trackingCategories = JsonNullable.of(trackingCategories);
        return this;
    }

    /**
     * A list of linked tracking categories.
     */
    public ExpenseLineItemInput withTrackingCategories(JsonNullable<? extends List<LinkedTrackingCategory>> trackingCategories) {
        Utils.checkNotNull(trackingCategories, "trackingCategories");
        this.trackingCategories = trackingCategories;
        return this;
    }

    /**
     * The unique identifier for the ledger account.
     */
    public ExpenseLineItemInput withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = Optional.ofNullable(accountId);
        return this;
    }

    /**
     * The unique identifier for the ledger account.
     */
    public ExpenseLineItemInput withAccountId(Optional<String> accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    /**
     * The ID of the customer this expense item is linked to.
     */
    public ExpenseLineItemInput withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = Optional.ofNullable(customerId);
        return this;
    }

    /**
     * The ID of the customer this expense item is linked to.
     */
    public ExpenseLineItemInput withCustomerId(Optional<String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }

    /**
     * The ID of the department this expense item is linked to.
     */
    public ExpenseLineItemInput withDepartmentId(String departmentId) {
        Utils.checkNotNull(departmentId, "departmentId");
        this.departmentId = Optional.ofNullable(departmentId);
        return this;
    }

    /**
     * The ID of the department this expense item is linked to.
     */
    public ExpenseLineItemInput withDepartmentId(Optional<String> departmentId) {
        Utils.checkNotNull(departmentId, "departmentId");
        this.departmentId = departmentId;
        return this;
    }

    /**
     * The ID of the location this expense item is linked to.
     */
    public ExpenseLineItemInput withLocationId(String locationId) {
        Utils.checkNotNull(locationId, "locationId");
        this.locationId = Optional.ofNullable(locationId);
        return this;
    }

    /**
     * The ID of the location this expense item is linked to.
     */
    public ExpenseLineItemInput withLocationId(Optional<String> locationId) {
        Utils.checkNotNull(locationId, "locationId");
        this.locationId = locationId;
        return this;
    }

    public ExpenseLineItemInput withTaxRate(LinkedTaxRateInput taxRate) {
        Utils.checkNotNull(taxRate, "taxRate");
        this.taxRate = Optional.ofNullable(taxRate);
        return this;
    }

    public ExpenseLineItemInput withTaxRate(Optional<? extends LinkedTaxRateInput> taxRate) {
        Utils.checkNotNull(taxRate, "taxRate");
        this.taxRate = taxRate;
        return this;
    }

    /**
     * The expense line item description
     */
    public ExpenseLineItemInput withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * The expense line item description
     */
    public ExpenseLineItemInput withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * The total amount of the expense line item.
     */
    public ExpenseLineItemInput withTotalAmount(double totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = Optional.ofNullable(totalAmount);
        return this;
    }

    /**
     * The total amount of the expense line item.
     */
    public ExpenseLineItemInput withTotalAmount(Optional<Double> totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Boolean that indicates if the line item is billable or not.
     */
    public ExpenseLineItemInput withBillable(boolean billable) {
        Utils.checkNotNull(billable, "billable");
        this.billable = Optional.ofNullable(billable);
        return this;
    }

    /**
     * Boolean that indicates if the line item is billable or not.
     */
    public ExpenseLineItemInput withBillable(Optional<Boolean> billable) {
        Utils.checkNotNull(billable, "billable");
        this.billable = billable;
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
        ExpenseLineItemInput other = (ExpenseLineItemInput) o;
        return 
            Objects.deepEquals(this.trackingCategories, other.trackingCategories) &&
            Objects.deepEquals(this.accountId, other.accountId) &&
            Objects.deepEquals(this.customerId, other.customerId) &&
            Objects.deepEquals(this.departmentId, other.departmentId) &&
            Objects.deepEquals(this.locationId, other.locationId) &&
            Objects.deepEquals(this.taxRate, other.taxRate) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.totalAmount, other.totalAmount) &&
            Objects.deepEquals(this.billable, other.billable);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            trackingCategories,
            accountId,
            customerId,
            departmentId,
            locationId,
            taxRate,
            description,
            totalAmount,
            billable);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ExpenseLineItemInput.class,
                "trackingCategories", trackingCategories,
                "accountId", accountId,
                "customerId", customerId,
                "departmentId", departmentId,
                "locationId", locationId,
                "taxRate", taxRate,
                "description", description,
                "totalAmount", totalAmount,
                "billable", billable);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends List<LinkedTrackingCategory>> trackingCategories = JsonNullable.undefined();
 
        private Optional<String> accountId = Optional.empty();
 
        private Optional<String> customerId = Optional.empty();
 
        private Optional<String> departmentId = Optional.empty();
 
        private Optional<String> locationId = Optional.empty();
 
        private Optional<? extends LinkedTaxRateInput> taxRate = Optional.empty();
 
        private JsonNullable<String> description = JsonNullable.undefined();
 
        private Optional<Double> totalAmount = Optional.empty();
 
        private Optional<Boolean> billable = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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
         * The unique identifier for the ledger account.
         */
        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = Optional.ofNullable(accountId);
            return this;
        }

        /**
         * The unique identifier for the ledger account.
         */
        public Builder accountId(Optional<String> accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        /**
         * The ID of the customer this expense item is linked to.
         */
        public Builder customerId(String customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = Optional.ofNullable(customerId);
            return this;
        }

        /**
         * The ID of the customer this expense item is linked to.
         */
        public Builder customerId(Optional<String> customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = customerId;
            return this;
        }

        /**
         * The ID of the department this expense item is linked to.
         */
        public Builder departmentId(String departmentId) {
            Utils.checkNotNull(departmentId, "departmentId");
            this.departmentId = Optional.ofNullable(departmentId);
            return this;
        }

        /**
         * The ID of the department this expense item is linked to.
         */
        public Builder departmentId(Optional<String> departmentId) {
            Utils.checkNotNull(departmentId, "departmentId");
            this.departmentId = departmentId;
            return this;
        }

        /**
         * The ID of the location this expense item is linked to.
         */
        public Builder locationId(String locationId) {
            Utils.checkNotNull(locationId, "locationId");
            this.locationId = Optional.ofNullable(locationId);
            return this;
        }

        /**
         * The ID of the location this expense item is linked to.
         */
        public Builder locationId(Optional<String> locationId) {
            Utils.checkNotNull(locationId, "locationId");
            this.locationId = locationId;
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

        /**
         * The expense line item description
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * The expense line item description
         */
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * The total amount of the expense line item.
         */
        public Builder totalAmount(double totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = Optional.ofNullable(totalAmount);
            return this;
        }

        /**
         * The total amount of the expense line item.
         */
        public Builder totalAmount(Optional<Double> totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = totalAmount;
            return this;
        }

        /**
         * Boolean that indicates if the line item is billable or not.
         */
        public Builder billable(boolean billable) {
            Utils.checkNotNull(billable, "billable");
            this.billable = Optional.ofNullable(billable);
            return this;
        }

        /**
         * Boolean that indicates if the line item is billable or not.
         */
        public Builder billable(Optional<Boolean> billable) {
            Utils.checkNotNull(billable, "billable");
            this.billable = billable;
            return this;
        }
        
        public ExpenseLineItemInput build() {
            return new ExpenseLineItemInput(
                trackingCategories,
                accountId,
                customerId,
                departmentId,
                locationId,
                taxRate,
                description,
                totalAmount,
                billable);
        }
    }
}
