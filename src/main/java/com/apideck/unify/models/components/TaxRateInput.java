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
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class TaxRateInput {

    /**
     * ID assigned to identify this tax rate.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<String> id;

    /**
     * Name assigned to identify this tax rate.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * Tax code assigned to identify this tax rate.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private JsonNullable<String> code;

    /**
     * Description of tax rate
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * Effective tax rate
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("effective_tax_rate")
    private JsonNullable<Double> effectiveTaxRate;

    /**
     * Not compounded sum of the components of a tax rate
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_tax_rate")
    private JsonNullable<Double> totalTaxRate;

    /**
     * Unique identifier for the account for tax collected.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tax_payable_account_id")
    private JsonNullable<String> taxPayableAccountId;

    /**
     * Unique identifier for the account for tax remitted.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tax_remitted_account_id")
    private JsonNullable<String> taxRemittedAccountId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("components")
    private JsonNullable<? extends List<Components>> components;

    /**
     * Tax type used to indicate the source of tax collected or paid
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private JsonNullable<String> type;

    /**
     * Report Tax type to aggregate tax collected or paid for reporting purposes
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("report_tax_type")
    private JsonNullable<String> reportTaxType;

    /**
     * ID of the original tax rate from which the new tax rate is derived. Helps to understand the relationship between corresponding tax rate entities.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("original_tax_rate_id")
    private JsonNullable<String> originalTaxRateId;

    /**
     * Tax rate status
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private JsonNullable<? extends TaxRateStatus> status;

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

    /**
     * The subsidiaries this belongs to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subsidiaries")
    private Optional<? extends List<Subsidiaries>> subsidiaries;

    @JsonCreator
    public TaxRateInput(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("code") JsonNullable<String> code,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("effective_tax_rate") JsonNullable<Double> effectiveTaxRate,
            @JsonProperty("total_tax_rate") JsonNullable<Double> totalTaxRate,
            @JsonProperty("tax_payable_account_id") JsonNullable<String> taxPayableAccountId,
            @JsonProperty("tax_remitted_account_id") JsonNullable<String> taxRemittedAccountId,
            @JsonProperty("components") JsonNullable<? extends List<Components>> components,
            @JsonProperty("type") JsonNullable<String> type,
            @JsonProperty("report_tax_type") JsonNullable<String> reportTaxType,
            @JsonProperty("original_tax_rate_id") JsonNullable<String> originalTaxRateId,
            @JsonProperty("status") JsonNullable<? extends TaxRateStatus> status,
            @JsonProperty("row_version") JsonNullable<String> rowVersion,
            @JsonProperty("pass_through") Optional<? extends List<PassThroughBody>> passThrough,
            @JsonProperty("subsidiaries") Optional<? extends List<Subsidiaries>> subsidiaries) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(effectiveTaxRate, "effectiveTaxRate");
        Utils.checkNotNull(totalTaxRate, "totalTaxRate");
        Utils.checkNotNull(taxPayableAccountId, "taxPayableAccountId");
        Utils.checkNotNull(taxRemittedAccountId, "taxRemittedAccountId");
        Utils.checkNotNull(components, "components");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(reportTaxType, "reportTaxType");
        Utils.checkNotNull(originalTaxRateId, "originalTaxRateId");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(rowVersion, "rowVersion");
        Utils.checkNotNull(passThrough, "passThrough");
        Utils.checkNotNull(subsidiaries, "subsidiaries");
        this.id = id;
        this.name = name;
        this.code = code;
        this.description = description;
        this.effectiveTaxRate = effectiveTaxRate;
        this.totalTaxRate = totalTaxRate;
        this.taxPayableAccountId = taxPayableAccountId;
        this.taxRemittedAccountId = taxRemittedAccountId;
        this.components = components;
        this.type = type;
        this.reportTaxType = reportTaxType;
        this.originalTaxRateId = originalTaxRateId;
        this.status = status;
        this.rowVersion = rowVersion;
        this.passThrough = passThrough;
        this.subsidiaries = subsidiaries;
    }
    
    public TaxRateInput() {
        this(JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty());
    }

    /**
     * ID assigned to identify this tax rate.
     */
    @JsonIgnore
    public JsonNullable<String> id() {
        return id;
    }

    /**
     * Name assigned to identify this tax rate.
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * Tax code assigned to identify this tax rate.
     */
    @JsonIgnore
    public JsonNullable<String> code() {
        return code;
    }

    /**
     * Description of tax rate
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * Effective tax rate
     */
    @JsonIgnore
    public JsonNullable<Double> effectiveTaxRate() {
        return effectiveTaxRate;
    }

    /**
     * Not compounded sum of the components of a tax rate
     */
    @JsonIgnore
    public JsonNullable<Double> totalTaxRate() {
        return totalTaxRate;
    }

    /**
     * Unique identifier for the account for tax collected.
     */
    @JsonIgnore
    public JsonNullable<String> taxPayableAccountId() {
        return taxPayableAccountId;
    }

    /**
     * Unique identifier for the account for tax remitted.
     */
    @JsonIgnore
    public JsonNullable<String> taxRemittedAccountId() {
        return taxRemittedAccountId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<Components>> components() {
        return (JsonNullable<List<Components>>) components;
    }

    /**
     * Tax type used to indicate the source of tax collected or paid
     */
    @JsonIgnore
    public JsonNullable<String> type() {
        return type;
    }

    /**
     * Report Tax type to aggregate tax collected or paid for reporting purposes
     */
    @JsonIgnore
    public JsonNullable<String> reportTaxType() {
        return reportTaxType;
    }

    /**
     * ID of the original tax rate from which the new tax rate is derived. Helps to understand the relationship between corresponding tax rate entities.
     */
    @JsonIgnore
    public JsonNullable<String> originalTaxRateId() {
        return originalTaxRateId;
    }

    /**
     * Tax rate status
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<TaxRateStatus> status() {
        return (JsonNullable<TaxRateStatus>) status;
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

    /**
     * The subsidiaries this belongs to.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Subsidiaries>> subsidiaries() {
        return (Optional<List<Subsidiaries>>) subsidiaries;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID assigned to identify this tax rate.
     */
    public TaxRateInput withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * ID assigned to identify this tax rate.
     */
    public TaxRateInput withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Name assigned to identify this tax rate.
     */
    public TaxRateInput withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Name assigned to identify this tax rate.
     */
    public TaxRateInput withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Tax code assigned to identify this tax rate.
     */
    public TaxRateInput withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = JsonNullable.of(code);
        return this;
    }

    /**
     * Tax code assigned to identify this tax rate.
     */
    public TaxRateInput withCode(JsonNullable<String> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    /**
     * Description of tax rate
     */
    public TaxRateInput withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Description of tax rate
     */
    public TaxRateInput withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Effective tax rate
     */
    public TaxRateInput withEffectiveTaxRate(double effectiveTaxRate) {
        Utils.checkNotNull(effectiveTaxRate, "effectiveTaxRate");
        this.effectiveTaxRate = JsonNullable.of(effectiveTaxRate);
        return this;
    }

    /**
     * Effective tax rate
     */
    public TaxRateInput withEffectiveTaxRate(JsonNullable<Double> effectiveTaxRate) {
        Utils.checkNotNull(effectiveTaxRate, "effectiveTaxRate");
        this.effectiveTaxRate = effectiveTaxRate;
        return this;
    }

    /**
     * Not compounded sum of the components of a tax rate
     */
    public TaxRateInput withTotalTaxRate(double totalTaxRate) {
        Utils.checkNotNull(totalTaxRate, "totalTaxRate");
        this.totalTaxRate = JsonNullable.of(totalTaxRate);
        return this;
    }

    /**
     * Not compounded sum of the components of a tax rate
     */
    public TaxRateInput withTotalTaxRate(JsonNullable<Double> totalTaxRate) {
        Utils.checkNotNull(totalTaxRate, "totalTaxRate");
        this.totalTaxRate = totalTaxRate;
        return this;
    }

    /**
     * Unique identifier for the account for tax collected.
     */
    public TaxRateInput withTaxPayableAccountId(String taxPayableAccountId) {
        Utils.checkNotNull(taxPayableAccountId, "taxPayableAccountId");
        this.taxPayableAccountId = JsonNullable.of(taxPayableAccountId);
        return this;
    }

    /**
     * Unique identifier for the account for tax collected.
     */
    public TaxRateInput withTaxPayableAccountId(JsonNullable<String> taxPayableAccountId) {
        Utils.checkNotNull(taxPayableAccountId, "taxPayableAccountId");
        this.taxPayableAccountId = taxPayableAccountId;
        return this;
    }

    /**
     * Unique identifier for the account for tax remitted.
     */
    public TaxRateInput withTaxRemittedAccountId(String taxRemittedAccountId) {
        Utils.checkNotNull(taxRemittedAccountId, "taxRemittedAccountId");
        this.taxRemittedAccountId = JsonNullable.of(taxRemittedAccountId);
        return this;
    }

    /**
     * Unique identifier for the account for tax remitted.
     */
    public TaxRateInput withTaxRemittedAccountId(JsonNullable<String> taxRemittedAccountId) {
        Utils.checkNotNull(taxRemittedAccountId, "taxRemittedAccountId");
        this.taxRemittedAccountId = taxRemittedAccountId;
        return this;
    }

    public TaxRateInput withComponents(List<Components> components) {
        Utils.checkNotNull(components, "components");
        this.components = JsonNullable.of(components);
        return this;
    }

    public TaxRateInput withComponents(JsonNullable<? extends List<Components>> components) {
        Utils.checkNotNull(components, "components");
        this.components = components;
        return this;
    }

    /**
     * Tax type used to indicate the source of tax collected or paid
     */
    public TaxRateInput withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * Tax type used to indicate the source of tax collected or paid
     */
    public TaxRateInput withType(JsonNullable<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Report Tax type to aggregate tax collected or paid for reporting purposes
     */
    public TaxRateInput withReportTaxType(String reportTaxType) {
        Utils.checkNotNull(reportTaxType, "reportTaxType");
        this.reportTaxType = JsonNullable.of(reportTaxType);
        return this;
    }

    /**
     * Report Tax type to aggregate tax collected or paid for reporting purposes
     */
    public TaxRateInput withReportTaxType(JsonNullable<String> reportTaxType) {
        Utils.checkNotNull(reportTaxType, "reportTaxType");
        this.reportTaxType = reportTaxType;
        return this;
    }

    /**
     * ID of the original tax rate from which the new tax rate is derived. Helps to understand the relationship between corresponding tax rate entities.
     */
    public TaxRateInput withOriginalTaxRateId(String originalTaxRateId) {
        Utils.checkNotNull(originalTaxRateId, "originalTaxRateId");
        this.originalTaxRateId = JsonNullable.of(originalTaxRateId);
        return this;
    }

    /**
     * ID of the original tax rate from which the new tax rate is derived. Helps to understand the relationship between corresponding tax rate entities.
     */
    public TaxRateInput withOriginalTaxRateId(JsonNullable<String> originalTaxRateId) {
        Utils.checkNotNull(originalTaxRateId, "originalTaxRateId");
        this.originalTaxRateId = originalTaxRateId;
        return this;
    }

    /**
     * Tax rate status
     */
    public TaxRateInput withStatus(TaxRateStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = JsonNullable.of(status);
        return this;
    }

    /**
     * Tax rate status
     */
    public TaxRateInput withStatus(JsonNullable<? extends TaxRateStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    public TaxRateInput withRowVersion(String rowVersion) {
        Utils.checkNotNull(rowVersion, "rowVersion");
        this.rowVersion = JsonNullable.of(rowVersion);
        return this;
    }

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    public TaxRateInput withRowVersion(JsonNullable<String> rowVersion) {
        Utils.checkNotNull(rowVersion, "rowVersion");
        this.rowVersion = rowVersion;
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public TaxRateInput withPassThrough(List<PassThroughBody> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public TaxRateInput withPassThrough(Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = passThrough;
        return this;
    }

    /**
     * The subsidiaries this belongs to.
     */
    public TaxRateInput withSubsidiaries(List<Subsidiaries> subsidiaries) {
        Utils.checkNotNull(subsidiaries, "subsidiaries");
        this.subsidiaries = Optional.ofNullable(subsidiaries);
        return this;
    }

    /**
     * The subsidiaries this belongs to.
     */
    public TaxRateInput withSubsidiaries(Optional<? extends List<Subsidiaries>> subsidiaries) {
        Utils.checkNotNull(subsidiaries, "subsidiaries");
        this.subsidiaries = subsidiaries;
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
        TaxRateInput other = (TaxRateInput) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.effectiveTaxRate, other.effectiveTaxRate) &&
            Objects.deepEquals(this.totalTaxRate, other.totalTaxRate) &&
            Objects.deepEquals(this.taxPayableAccountId, other.taxPayableAccountId) &&
            Objects.deepEquals(this.taxRemittedAccountId, other.taxRemittedAccountId) &&
            Objects.deepEquals(this.components, other.components) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.reportTaxType, other.reportTaxType) &&
            Objects.deepEquals(this.originalTaxRateId, other.originalTaxRateId) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.rowVersion, other.rowVersion) &&
            Objects.deepEquals(this.passThrough, other.passThrough) &&
            Objects.deepEquals(this.subsidiaries, other.subsidiaries);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            code,
            description,
            effectiveTaxRate,
            totalTaxRate,
            taxPayableAccountId,
            taxRemittedAccountId,
            components,
            type,
            reportTaxType,
            originalTaxRateId,
            status,
            rowVersion,
            passThrough,
            subsidiaries);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaxRateInput.class,
                "id", id,
                "name", name,
                "code", code,
                "description", description,
                "effectiveTaxRate", effectiveTaxRate,
                "totalTaxRate", totalTaxRate,
                "taxPayableAccountId", taxPayableAccountId,
                "taxRemittedAccountId", taxRemittedAccountId,
                "components", components,
                "type", type,
                "reportTaxType", reportTaxType,
                "originalTaxRateId", originalTaxRateId,
                "status", status,
                "rowVersion", rowVersion,
                "passThrough", passThrough,
                "subsidiaries", subsidiaries);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private Optional<String> name = Optional.empty();
 
        private JsonNullable<String> code = JsonNullable.undefined();
 
        private JsonNullable<String> description = JsonNullable.undefined();
 
        private JsonNullable<Double> effectiveTaxRate = JsonNullable.undefined();
 
        private JsonNullable<Double> totalTaxRate = JsonNullable.undefined();
 
        private JsonNullable<String> taxPayableAccountId = JsonNullable.undefined();
 
        private JsonNullable<String> taxRemittedAccountId = JsonNullable.undefined();
 
        private JsonNullable<? extends List<Components>> components = JsonNullable.undefined();
 
        private JsonNullable<String> type = JsonNullable.undefined();
 
        private JsonNullable<String> reportTaxType = JsonNullable.undefined();
 
        private JsonNullable<String> originalTaxRateId = JsonNullable.undefined();
 
        private JsonNullable<? extends TaxRateStatus> status = JsonNullable.undefined();
 
        private JsonNullable<String> rowVersion = JsonNullable.undefined();
 
        private Optional<? extends List<PassThroughBody>> passThrough = Optional.empty();
 
        private Optional<? extends List<Subsidiaries>> subsidiaries = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID assigned to identify this tax rate.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * ID assigned to identify this tax rate.
         */
        public Builder id(JsonNullable<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Name assigned to identify this tax rate.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * Name assigned to identify this tax rate.
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Tax code assigned to identify this tax rate.
         */
        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = JsonNullable.of(code);
            return this;
        }

        /**
         * Tax code assigned to identify this tax rate.
         */
        public Builder code(JsonNullable<String> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        /**
         * Description of tax rate
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * Description of tax rate
         */
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * Effective tax rate
         */
        public Builder effectiveTaxRate(double effectiveTaxRate) {
            Utils.checkNotNull(effectiveTaxRate, "effectiveTaxRate");
            this.effectiveTaxRate = JsonNullable.of(effectiveTaxRate);
            return this;
        }

        /**
         * Effective tax rate
         */
        public Builder effectiveTaxRate(JsonNullable<Double> effectiveTaxRate) {
            Utils.checkNotNull(effectiveTaxRate, "effectiveTaxRate");
            this.effectiveTaxRate = effectiveTaxRate;
            return this;
        }

        /**
         * Not compounded sum of the components of a tax rate
         */
        public Builder totalTaxRate(double totalTaxRate) {
            Utils.checkNotNull(totalTaxRate, "totalTaxRate");
            this.totalTaxRate = JsonNullable.of(totalTaxRate);
            return this;
        }

        /**
         * Not compounded sum of the components of a tax rate
         */
        public Builder totalTaxRate(JsonNullable<Double> totalTaxRate) {
            Utils.checkNotNull(totalTaxRate, "totalTaxRate");
            this.totalTaxRate = totalTaxRate;
            return this;
        }

        /**
         * Unique identifier for the account for tax collected.
         */
        public Builder taxPayableAccountId(String taxPayableAccountId) {
            Utils.checkNotNull(taxPayableAccountId, "taxPayableAccountId");
            this.taxPayableAccountId = JsonNullable.of(taxPayableAccountId);
            return this;
        }

        /**
         * Unique identifier for the account for tax collected.
         */
        public Builder taxPayableAccountId(JsonNullable<String> taxPayableAccountId) {
            Utils.checkNotNull(taxPayableAccountId, "taxPayableAccountId");
            this.taxPayableAccountId = taxPayableAccountId;
            return this;
        }

        /**
         * Unique identifier for the account for tax remitted.
         */
        public Builder taxRemittedAccountId(String taxRemittedAccountId) {
            Utils.checkNotNull(taxRemittedAccountId, "taxRemittedAccountId");
            this.taxRemittedAccountId = JsonNullable.of(taxRemittedAccountId);
            return this;
        }

        /**
         * Unique identifier for the account for tax remitted.
         */
        public Builder taxRemittedAccountId(JsonNullable<String> taxRemittedAccountId) {
            Utils.checkNotNull(taxRemittedAccountId, "taxRemittedAccountId");
            this.taxRemittedAccountId = taxRemittedAccountId;
            return this;
        }

        public Builder components(List<Components> components) {
            Utils.checkNotNull(components, "components");
            this.components = JsonNullable.of(components);
            return this;
        }

        public Builder components(JsonNullable<? extends List<Components>> components) {
            Utils.checkNotNull(components, "components");
            this.components = components;
            return this;
        }

        /**
         * Tax type used to indicate the source of tax collected or paid
         */
        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        /**
         * Tax type used to indicate the source of tax collected or paid
         */
        public Builder type(JsonNullable<String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Report Tax type to aggregate tax collected or paid for reporting purposes
         */
        public Builder reportTaxType(String reportTaxType) {
            Utils.checkNotNull(reportTaxType, "reportTaxType");
            this.reportTaxType = JsonNullable.of(reportTaxType);
            return this;
        }

        /**
         * Report Tax type to aggregate tax collected or paid for reporting purposes
         */
        public Builder reportTaxType(JsonNullable<String> reportTaxType) {
            Utils.checkNotNull(reportTaxType, "reportTaxType");
            this.reportTaxType = reportTaxType;
            return this;
        }

        /**
         * ID of the original tax rate from which the new tax rate is derived. Helps to understand the relationship between corresponding tax rate entities.
         */
        public Builder originalTaxRateId(String originalTaxRateId) {
            Utils.checkNotNull(originalTaxRateId, "originalTaxRateId");
            this.originalTaxRateId = JsonNullable.of(originalTaxRateId);
            return this;
        }

        /**
         * ID of the original tax rate from which the new tax rate is derived. Helps to understand the relationship between corresponding tax rate entities.
         */
        public Builder originalTaxRateId(JsonNullable<String> originalTaxRateId) {
            Utils.checkNotNull(originalTaxRateId, "originalTaxRateId");
            this.originalTaxRateId = originalTaxRateId;
            return this;
        }

        /**
         * Tax rate status
         */
        public Builder status(TaxRateStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = JsonNullable.of(status);
            return this;
        }

        /**
         * Tax rate status
         */
        public Builder status(JsonNullable<? extends TaxRateStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
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

        /**
         * The subsidiaries this belongs to.
         */
        public Builder subsidiaries(List<Subsidiaries> subsidiaries) {
            Utils.checkNotNull(subsidiaries, "subsidiaries");
            this.subsidiaries = Optional.ofNullable(subsidiaries);
            return this;
        }

        /**
         * The subsidiaries this belongs to.
         */
        public Builder subsidiaries(Optional<? extends List<Subsidiaries>> subsidiaries) {
            Utils.checkNotNull(subsidiaries, "subsidiaries");
            this.subsidiaries = subsidiaries;
            return this;
        }
        
        public TaxRateInput build() {
            return new TaxRateInput(
                id,
                name,
                code,
                description,
                effectiveTaxRate,
                totalTaxRate,
                taxPayableAccountId,
                taxRemittedAccountId,
                components,
                type,
                reportTaxType,
                originalTaxRateId,
                status,
                rowVersion,
                passThrough,
                subsidiaries);
        }
    }
}

