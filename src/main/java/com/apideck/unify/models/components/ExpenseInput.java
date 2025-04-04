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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class ExpenseInput {

    /**
     * Number.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("number")
    private JsonNullable<String> number;

    /**
     * The date of the transaction - YYYY:MM::DDThh:mm:ss.sTZD
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("transaction_date")
    private Optional<OffsetDateTime> transactionDate;

    /**
     * The unique identifier for the ledger account that this expense should be credited to.
     */
    @JsonProperty("account_id")
    private String accountId;

    /**
     * The ID of the customer this entity is linked to. Used for expenses that should be marked as billable to customers.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_id")
    private Optional<String> customerId;

    /**
     * The ID of the supplier this entity is linked to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supplier_id")
    private Optional<String> supplierId;

    /**
     * The company or subsidiary id the transaction belongs to
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_id")
    private JsonNullable<String> companyId;

    /**
     * The ID of the department
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("department_id")
    private JsonNullable<String> departmentId;

    /**
     * The type of payment for the expense.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_type")
    private JsonNullable<? extends ExpensePaymentType> paymentType;

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private JsonNullable<? extends Currency> currency;

    /**
     * Currency Exchange Rate at the time entity was recorded/generated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency_rate")
    private JsonNullable<Double> currencyRate;

    /**
     * The type of expense.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private JsonNullable<? extends ExpenseType> type;

    /**
     * The memo of the expense.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("memo")
    private JsonNullable<String> memo;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tax_rate")
    private Optional<? extends LinkedTaxRateInput> taxRate;

    /**
     * The total amount of the expense line item.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_amount")
    private JsonNullable<Double> totalAmount;

    /**
     * Expense line items linked to this expense.
     */
    @JsonProperty("line_items")
    private List<ExpenseLineItemInput> lineItems;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_fields")
    private Optional<? extends List<CustomField>> customFields;

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("row_version")
    private JsonNullable<String> rowVersion;

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pass_through")
    private Optional<? extends List<PassThroughBody>> passThrough;

    @JsonCreator
    public ExpenseInput(
            @JsonProperty("number") JsonNullable<String> number,
            @JsonProperty("transaction_date") Optional<OffsetDateTime> transactionDate,
            @JsonProperty("account_id") String accountId,
            @JsonProperty("customer_id") Optional<String> customerId,
            @JsonProperty("supplier_id") Optional<String> supplierId,
            @JsonProperty("company_id") JsonNullable<String> companyId,
            @JsonProperty("department_id") JsonNullable<String> departmentId,
            @JsonProperty("payment_type") JsonNullable<? extends ExpensePaymentType> paymentType,
            @JsonProperty("currency") JsonNullable<? extends Currency> currency,
            @JsonProperty("currency_rate") JsonNullable<Double> currencyRate,
            @JsonProperty("type") JsonNullable<? extends ExpenseType> type,
            @JsonProperty("memo") JsonNullable<String> memo,
            @JsonProperty("tax_rate") Optional<? extends LinkedTaxRateInput> taxRate,
            @JsonProperty("total_amount") JsonNullable<Double> totalAmount,
            @JsonProperty("line_items") List<ExpenseLineItemInput> lineItems,
            @JsonProperty("custom_fields") Optional<? extends List<CustomField>> customFields,
            @JsonProperty("row_version") JsonNullable<String> rowVersion,
            @JsonProperty("pass_through") Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(number, "number");
        Utils.checkNotNull(transactionDate, "transactionDate");
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(customerId, "customerId");
        Utils.checkNotNull(supplierId, "supplierId");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(departmentId, "departmentId");
        Utils.checkNotNull(paymentType, "paymentType");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(currencyRate, "currencyRate");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(memo, "memo");
        Utils.checkNotNull(taxRate, "taxRate");
        Utils.checkNotNull(totalAmount, "totalAmount");
        Utils.checkNotNull(lineItems, "lineItems");
        Utils.checkNotNull(customFields, "customFields");
        Utils.checkNotNull(rowVersion, "rowVersion");
        Utils.checkNotNull(passThrough, "passThrough");
        this.number = number;
        this.transactionDate = transactionDate;
        this.accountId = accountId;
        this.customerId = customerId;
        this.supplierId = supplierId;
        this.companyId = companyId;
        this.departmentId = departmentId;
        this.paymentType = paymentType;
        this.currency = currency;
        this.currencyRate = currencyRate;
        this.type = type;
        this.memo = memo;
        this.taxRate = taxRate;
        this.totalAmount = totalAmount;
        this.lineItems = lineItems;
        this.customFields = customFields;
        this.rowVersion = rowVersion;
        this.passThrough = passThrough;
    }
    
    public ExpenseInput(
            String accountId,
            List<ExpenseLineItemInput> lineItems) {
        this(JsonNullable.undefined(), Optional.empty(), accountId, Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), lineItems, Optional.empty(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * Number.
     */
    @JsonIgnore
    public JsonNullable<String> number() {
        return number;
    }

    /**
     * The date of the transaction - YYYY:MM::DDThh:mm:ss.sTZD
     */
    @JsonIgnore
    public Optional<OffsetDateTime> transactionDate() {
        return transactionDate;
    }

    /**
     * The unique identifier for the ledger account that this expense should be credited to.
     */
    @JsonIgnore
    public String accountId() {
        return accountId;
    }

    /**
     * The ID of the customer this entity is linked to. Used for expenses that should be marked as billable to customers.
     */
    @JsonIgnore
    public Optional<String> customerId() {
        return customerId;
    }

    /**
     * The ID of the supplier this entity is linked to.
     */
    @JsonIgnore
    public Optional<String> supplierId() {
        return supplierId;
    }

    /**
     * The company or subsidiary id the transaction belongs to
     */
    @JsonIgnore
    public JsonNullable<String> companyId() {
        return companyId;
    }

    /**
     * The ID of the department
     */
    @JsonIgnore
    public JsonNullable<String> departmentId() {
        return departmentId;
    }

    /**
     * The type of payment for the expense.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<ExpensePaymentType> paymentType() {
        return (JsonNullable<ExpensePaymentType>) paymentType;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Currency> currency() {
        return (JsonNullable<Currency>) currency;
    }

    /**
     * Currency Exchange Rate at the time entity was recorded/generated.
     */
    @JsonIgnore
    public JsonNullable<Double> currencyRate() {
        return currencyRate;
    }

    /**
     * The type of expense.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<ExpenseType> type() {
        return (JsonNullable<ExpenseType>) type;
    }

    /**
     * The memo of the expense.
     */
    @JsonIgnore
    public JsonNullable<String> memo() {
        return memo;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LinkedTaxRateInput> taxRate() {
        return (Optional<LinkedTaxRateInput>) taxRate;
    }

    /**
     * The total amount of the expense line item.
     */
    @JsonIgnore
    public JsonNullable<Double> totalAmount() {
        return totalAmount;
    }

    /**
     * Expense line items linked to this expense.
     */
    @JsonIgnore
    public List<ExpenseLineItemInput> lineItems() {
        return lineItems;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<CustomField>> customFields() {
        return (Optional<List<CustomField>>) customFields;
    }

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    @JsonIgnore
    public JsonNullable<String> rowVersion() {
        return rowVersion;
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
     * Number.
     */
    public ExpenseInput withNumber(String number) {
        Utils.checkNotNull(number, "number");
        this.number = JsonNullable.of(number);
        return this;
    }

    /**
     * Number.
     */
    public ExpenseInput withNumber(JsonNullable<String> number) {
        Utils.checkNotNull(number, "number");
        this.number = number;
        return this;
    }

    /**
     * The date of the transaction - YYYY:MM::DDThh:mm:ss.sTZD
     */
    public ExpenseInput withTransactionDate(OffsetDateTime transactionDate) {
        Utils.checkNotNull(transactionDate, "transactionDate");
        this.transactionDate = Optional.ofNullable(transactionDate);
        return this;
    }

    /**
     * The date of the transaction - YYYY:MM::DDThh:mm:ss.sTZD
     */
    public ExpenseInput withTransactionDate(Optional<OffsetDateTime> transactionDate) {
        Utils.checkNotNull(transactionDate, "transactionDate");
        this.transactionDate = transactionDate;
        return this;
    }

    /**
     * The unique identifier for the ledger account that this expense should be credited to.
     */
    public ExpenseInput withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    /**
     * The ID of the customer this entity is linked to. Used for expenses that should be marked as billable to customers.
     */
    public ExpenseInput withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = Optional.ofNullable(customerId);
        return this;
    }

    /**
     * The ID of the customer this entity is linked to. Used for expenses that should be marked as billable to customers.
     */
    public ExpenseInput withCustomerId(Optional<String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }

    /**
     * The ID of the supplier this entity is linked to.
     */
    public ExpenseInput withSupplierId(String supplierId) {
        Utils.checkNotNull(supplierId, "supplierId");
        this.supplierId = Optional.ofNullable(supplierId);
        return this;
    }

    /**
     * The ID of the supplier this entity is linked to.
     */
    public ExpenseInput withSupplierId(Optional<String> supplierId) {
        Utils.checkNotNull(supplierId, "supplierId");
        this.supplierId = supplierId;
        return this;
    }

    /**
     * The company or subsidiary id the transaction belongs to
     */
    public ExpenseInput withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = JsonNullable.of(companyId);
        return this;
    }

    /**
     * The company or subsidiary id the transaction belongs to
     */
    public ExpenseInput withCompanyId(JsonNullable<String> companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * The ID of the department
     */
    public ExpenseInput withDepartmentId(String departmentId) {
        Utils.checkNotNull(departmentId, "departmentId");
        this.departmentId = JsonNullable.of(departmentId);
        return this;
    }

    /**
     * The ID of the department
     */
    public ExpenseInput withDepartmentId(JsonNullable<String> departmentId) {
        Utils.checkNotNull(departmentId, "departmentId");
        this.departmentId = departmentId;
        return this;
    }

    /**
     * The type of payment for the expense.
     */
    public ExpenseInput withPaymentType(ExpensePaymentType paymentType) {
        Utils.checkNotNull(paymentType, "paymentType");
        this.paymentType = JsonNullable.of(paymentType);
        return this;
    }

    /**
     * The type of payment for the expense.
     */
    public ExpenseInput withPaymentType(JsonNullable<? extends ExpensePaymentType> paymentType) {
        Utils.checkNotNull(paymentType, "paymentType");
        this.paymentType = paymentType;
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public ExpenseInput withCurrency(Currency currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = JsonNullable.of(currency);
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public ExpenseInput withCurrency(JsonNullable<? extends Currency> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * Currency Exchange Rate at the time entity was recorded/generated.
     */
    public ExpenseInput withCurrencyRate(double currencyRate) {
        Utils.checkNotNull(currencyRate, "currencyRate");
        this.currencyRate = JsonNullable.of(currencyRate);
        return this;
    }

    /**
     * Currency Exchange Rate at the time entity was recorded/generated.
     */
    public ExpenseInput withCurrencyRate(JsonNullable<Double> currencyRate) {
        Utils.checkNotNull(currencyRate, "currencyRate");
        this.currencyRate = currencyRate;
        return this;
    }

    /**
     * The type of expense.
     */
    public ExpenseInput withType(ExpenseType type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * The type of expense.
     */
    public ExpenseInput withType(JsonNullable<? extends ExpenseType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The memo of the expense.
     */
    public ExpenseInput withMemo(String memo) {
        Utils.checkNotNull(memo, "memo");
        this.memo = JsonNullable.of(memo);
        return this;
    }

    /**
     * The memo of the expense.
     */
    public ExpenseInput withMemo(JsonNullable<String> memo) {
        Utils.checkNotNull(memo, "memo");
        this.memo = memo;
        return this;
    }

    public ExpenseInput withTaxRate(LinkedTaxRateInput taxRate) {
        Utils.checkNotNull(taxRate, "taxRate");
        this.taxRate = Optional.ofNullable(taxRate);
        return this;
    }

    public ExpenseInput withTaxRate(Optional<? extends LinkedTaxRateInput> taxRate) {
        Utils.checkNotNull(taxRate, "taxRate");
        this.taxRate = taxRate;
        return this;
    }

    /**
     * The total amount of the expense line item.
     */
    public ExpenseInput withTotalAmount(double totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = JsonNullable.of(totalAmount);
        return this;
    }

    /**
     * The total amount of the expense line item.
     */
    public ExpenseInput withTotalAmount(JsonNullable<Double> totalAmount) {
        Utils.checkNotNull(totalAmount, "totalAmount");
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Expense line items linked to this expense.
     */
    public ExpenseInput withLineItems(List<ExpenseLineItemInput> lineItems) {
        Utils.checkNotNull(lineItems, "lineItems");
        this.lineItems = lineItems;
        return this;
    }

    public ExpenseInput withCustomFields(List<CustomField> customFields) {
        Utils.checkNotNull(customFields, "customFields");
        this.customFields = Optional.ofNullable(customFields);
        return this;
    }

    public ExpenseInput withCustomFields(Optional<? extends List<CustomField>> customFields) {
        Utils.checkNotNull(customFields, "customFields");
        this.customFields = customFields;
        return this;
    }

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    public ExpenseInput withRowVersion(String rowVersion) {
        Utils.checkNotNull(rowVersion, "rowVersion");
        this.rowVersion = JsonNullable.of(rowVersion);
        return this;
    }

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    public ExpenseInput withRowVersion(JsonNullable<String> rowVersion) {
        Utils.checkNotNull(rowVersion, "rowVersion");
        this.rowVersion = rowVersion;
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public ExpenseInput withPassThrough(List<PassThroughBody> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public ExpenseInput withPassThrough(Optional<? extends List<PassThroughBody>> passThrough) {
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
        ExpenseInput other = (ExpenseInput) o;
        return 
            Objects.deepEquals(this.number, other.number) &&
            Objects.deepEquals(this.transactionDate, other.transactionDate) &&
            Objects.deepEquals(this.accountId, other.accountId) &&
            Objects.deepEquals(this.customerId, other.customerId) &&
            Objects.deepEquals(this.supplierId, other.supplierId) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.departmentId, other.departmentId) &&
            Objects.deepEquals(this.paymentType, other.paymentType) &&
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.currencyRate, other.currencyRate) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.memo, other.memo) &&
            Objects.deepEquals(this.taxRate, other.taxRate) &&
            Objects.deepEquals(this.totalAmount, other.totalAmount) &&
            Objects.deepEquals(this.lineItems, other.lineItems) &&
            Objects.deepEquals(this.customFields, other.customFields) &&
            Objects.deepEquals(this.rowVersion, other.rowVersion) &&
            Objects.deepEquals(this.passThrough, other.passThrough);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            number,
            transactionDate,
            accountId,
            customerId,
            supplierId,
            companyId,
            departmentId,
            paymentType,
            currency,
            currencyRate,
            type,
            memo,
            taxRate,
            totalAmount,
            lineItems,
            customFields,
            rowVersion,
            passThrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ExpenseInput.class,
                "number", number,
                "transactionDate", transactionDate,
                "accountId", accountId,
                "customerId", customerId,
                "supplierId", supplierId,
                "companyId", companyId,
                "departmentId", departmentId,
                "paymentType", paymentType,
                "currency", currency,
                "currencyRate", currencyRate,
                "type", type,
                "memo", memo,
                "taxRate", taxRate,
                "totalAmount", totalAmount,
                "lineItems", lineItems,
                "customFields", customFields,
                "rowVersion", rowVersion,
                "passThrough", passThrough);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> number = JsonNullable.undefined();
 
        private Optional<OffsetDateTime> transactionDate = Optional.empty();
 
        private String accountId;
 
        private Optional<String> customerId = Optional.empty();
 
        private Optional<String> supplierId = Optional.empty();
 
        private JsonNullable<String> companyId = JsonNullable.undefined();
 
        private JsonNullable<String> departmentId = JsonNullable.undefined();
 
        private JsonNullable<? extends ExpensePaymentType> paymentType = JsonNullable.undefined();
 
        private JsonNullable<? extends Currency> currency = JsonNullable.undefined();
 
        private JsonNullable<Double> currencyRate = JsonNullable.undefined();
 
        private JsonNullable<? extends ExpenseType> type = JsonNullable.undefined();
 
        private JsonNullable<String> memo = JsonNullable.undefined();
 
        private Optional<? extends LinkedTaxRateInput> taxRate = Optional.empty();
 
        private JsonNullable<Double> totalAmount = JsonNullable.undefined();
 
        private List<ExpenseLineItemInput> lineItems;
 
        private Optional<? extends List<CustomField>> customFields = Optional.empty();
 
        private JsonNullable<String> rowVersion = JsonNullable.undefined();
 
        private Optional<? extends List<PassThroughBody>> passThrough = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Number.
         */
        public Builder number(String number) {
            Utils.checkNotNull(number, "number");
            this.number = JsonNullable.of(number);
            return this;
        }

        /**
         * Number.
         */
        public Builder number(JsonNullable<String> number) {
            Utils.checkNotNull(number, "number");
            this.number = number;
            return this;
        }

        /**
         * The date of the transaction - YYYY:MM::DDThh:mm:ss.sTZD
         */
        public Builder transactionDate(OffsetDateTime transactionDate) {
            Utils.checkNotNull(transactionDate, "transactionDate");
            this.transactionDate = Optional.ofNullable(transactionDate);
            return this;
        }

        /**
         * The date of the transaction - YYYY:MM::DDThh:mm:ss.sTZD
         */
        public Builder transactionDate(Optional<OffsetDateTime> transactionDate) {
            Utils.checkNotNull(transactionDate, "transactionDate");
            this.transactionDate = transactionDate;
            return this;
        }

        /**
         * The unique identifier for the ledger account that this expense should be credited to.
         */
        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        /**
         * The ID of the customer this entity is linked to. Used for expenses that should be marked as billable to customers.
         */
        public Builder customerId(String customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = Optional.ofNullable(customerId);
            return this;
        }

        /**
         * The ID of the customer this entity is linked to. Used for expenses that should be marked as billable to customers.
         */
        public Builder customerId(Optional<String> customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = customerId;
            return this;
        }

        /**
         * The ID of the supplier this entity is linked to.
         */
        public Builder supplierId(String supplierId) {
            Utils.checkNotNull(supplierId, "supplierId");
            this.supplierId = Optional.ofNullable(supplierId);
            return this;
        }

        /**
         * The ID of the supplier this entity is linked to.
         */
        public Builder supplierId(Optional<String> supplierId) {
            Utils.checkNotNull(supplierId, "supplierId");
            this.supplierId = supplierId;
            return this;
        }

        /**
         * The company or subsidiary id the transaction belongs to
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = JsonNullable.of(companyId);
            return this;
        }

        /**
         * The company or subsidiary id the transaction belongs to
         */
        public Builder companyId(JsonNullable<String> companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
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
         * The type of payment for the expense.
         */
        public Builder paymentType(ExpensePaymentType paymentType) {
            Utils.checkNotNull(paymentType, "paymentType");
            this.paymentType = JsonNullable.of(paymentType);
            return this;
        }

        /**
         * The type of payment for the expense.
         */
        public Builder paymentType(JsonNullable<? extends ExpensePaymentType> paymentType) {
            Utils.checkNotNull(paymentType, "paymentType");
            this.paymentType = paymentType;
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

        /**
         * Currency Exchange Rate at the time entity was recorded/generated.
         */
        public Builder currencyRate(double currencyRate) {
            Utils.checkNotNull(currencyRate, "currencyRate");
            this.currencyRate = JsonNullable.of(currencyRate);
            return this;
        }

        /**
         * Currency Exchange Rate at the time entity was recorded/generated.
         */
        public Builder currencyRate(JsonNullable<Double> currencyRate) {
            Utils.checkNotNull(currencyRate, "currencyRate");
            this.currencyRate = currencyRate;
            return this;
        }

        /**
         * The type of expense.
         */
        public Builder type(ExpenseType type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        /**
         * The type of expense.
         */
        public Builder type(JsonNullable<? extends ExpenseType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The memo of the expense.
         */
        public Builder memo(String memo) {
            Utils.checkNotNull(memo, "memo");
            this.memo = JsonNullable.of(memo);
            return this;
        }

        /**
         * The memo of the expense.
         */
        public Builder memo(JsonNullable<String> memo) {
            Utils.checkNotNull(memo, "memo");
            this.memo = memo;
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
         * The total amount of the expense line item.
         */
        public Builder totalAmount(double totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = JsonNullable.of(totalAmount);
            return this;
        }

        /**
         * The total amount of the expense line item.
         */
        public Builder totalAmount(JsonNullable<Double> totalAmount) {
            Utils.checkNotNull(totalAmount, "totalAmount");
            this.totalAmount = totalAmount;
            return this;
        }

        /**
         * Expense line items linked to this expense.
         */
        public Builder lineItems(List<ExpenseLineItemInput> lineItems) {
            Utils.checkNotNull(lineItems, "lineItems");
            this.lineItems = lineItems;
            return this;
        }

        public Builder customFields(List<CustomField> customFields) {
            Utils.checkNotNull(customFields, "customFields");
            this.customFields = Optional.ofNullable(customFields);
            return this;
        }

        public Builder customFields(Optional<? extends List<CustomField>> customFields) {
            Utils.checkNotNull(customFields, "customFields");
            this.customFields = customFields;
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
        
        public ExpenseInput build() {
            return new ExpenseInput(
                number,
                transactionDate,
                accountId,
                customerId,
                supplierId,
                companyId,
                departmentId,
                paymentType,
                currency,
                currencyRate,
                type,
                memo,
                taxRate,
                totalAmount,
                lineItems,
                customFields,
                rowVersion,
                passThrough);
        }
    }
}
