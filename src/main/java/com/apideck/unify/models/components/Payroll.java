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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class Payroll {

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * The unique identifier of the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_id")
    private JsonNullable<String> companyId;

    /**
     * Whether or not the payroll has been successfully processed. Note that processed payrolls cannot be updated.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("processed")
    private Optional<Boolean> processed;

    /**
     * The date the payroll was processed.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("processed_date")
    private JsonNullable<String> processedDate;

    /**
     * The date on which employees will be paid for the payroll.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("check_date")
    private Optional<String> checkDate;

    /**
     * The start date, inclusive, of the pay period.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("start_date")
    private Optional<String> startDate;

    /**
     * The end date, inclusive, of the pay period.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("end_date")
    private Optional<String> endDate;

    /**
     * The overview of the payroll totals.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("totals")
    private Optional<? extends PayrollTotals> totals;

    /**
     * An array of compensations for the payroll.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compensations")
    private Optional<? extends List<Compensation>> compensations;

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_mappings")
    private JsonNullable<? extends CustomMappings> customMappings;

    @JsonCreator
    public Payroll(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("company_id") JsonNullable<String> companyId,
            @JsonProperty("processed") Optional<Boolean> processed,
            @JsonProperty("processed_date") JsonNullable<String> processedDate,
            @JsonProperty("check_date") Optional<String> checkDate,
            @JsonProperty("start_date") Optional<String> startDate,
            @JsonProperty("end_date") Optional<String> endDate,
            @JsonProperty("totals") Optional<? extends PayrollTotals> totals,
            @JsonProperty("compensations") Optional<? extends List<Compensation>> compensations,
            @JsonProperty("custom_mappings") JsonNullable<? extends CustomMappings> customMappings) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(processed, "processed");
        Utils.checkNotNull(processedDate, "processedDate");
        Utils.checkNotNull(checkDate, "checkDate");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(totals, "totals");
        Utils.checkNotNull(compensations, "compensations");
        Utils.checkNotNull(customMappings, "customMappings");
        this.id = id;
        this.companyId = companyId;
        this.processed = processed;
        this.processedDate = processedDate;
        this.checkDate = checkDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totals = totals;
        this.compensations = compensations;
        this.customMappings = customMappings;
    }
    
    public Payroll() {
        this(Optional.empty(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * The unique identifier of the company.
     */
    @JsonIgnore
    public JsonNullable<String> companyId() {
        return companyId;
    }

    /**
     * Whether or not the payroll has been successfully processed. Note that processed payrolls cannot be updated.
     */
    @JsonIgnore
    public Optional<Boolean> processed() {
        return processed;
    }

    /**
     * The date the payroll was processed.
     */
    @JsonIgnore
    public JsonNullable<String> processedDate() {
        return processedDate;
    }

    /**
     * The date on which employees will be paid for the payroll.
     */
    @JsonIgnore
    public Optional<String> checkDate() {
        return checkDate;
    }

    /**
     * The start date, inclusive, of the pay period.
     */
    @JsonIgnore
    public Optional<String> startDate() {
        return startDate;
    }

    /**
     * The end date, inclusive, of the pay period.
     */
    @JsonIgnore
    public Optional<String> endDate() {
        return endDate;
    }

    /**
     * The overview of the payroll totals.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PayrollTotals> totals() {
        return (Optional<PayrollTotals>) totals;
    }

    /**
     * An array of compensations for the payroll.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Compensation>> compensations() {
        return (Optional<List<Compensation>>) compensations;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<CustomMappings> customMappings() {
        return (JsonNullable<CustomMappings>) customMappings;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * A unique identifier for an object.
     */
    public Payroll withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Payroll withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the company.
     */
    public Payroll withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = JsonNullable.of(companyId);
        return this;
    }

    /**
     * The unique identifier of the company.
     */
    public Payroll withCompanyId(JsonNullable<String> companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Whether or not the payroll has been successfully processed. Note that processed payrolls cannot be updated.
     */
    public Payroll withProcessed(boolean processed) {
        Utils.checkNotNull(processed, "processed");
        this.processed = Optional.ofNullable(processed);
        return this;
    }

    /**
     * Whether or not the payroll has been successfully processed. Note that processed payrolls cannot be updated.
     */
    public Payroll withProcessed(Optional<Boolean> processed) {
        Utils.checkNotNull(processed, "processed");
        this.processed = processed;
        return this;
    }

    /**
     * The date the payroll was processed.
     */
    public Payroll withProcessedDate(String processedDate) {
        Utils.checkNotNull(processedDate, "processedDate");
        this.processedDate = JsonNullable.of(processedDate);
        return this;
    }

    /**
     * The date the payroll was processed.
     */
    public Payroll withProcessedDate(JsonNullable<String> processedDate) {
        Utils.checkNotNull(processedDate, "processedDate");
        this.processedDate = processedDate;
        return this;
    }

    /**
     * The date on which employees will be paid for the payroll.
     */
    public Payroll withCheckDate(String checkDate) {
        Utils.checkNotNull(checkDate, "checkDate");
        this.checkDate = Optional.ofNullable(checkDate);
        return this;
    }

    /**
     * The date on which employees will be paid for the payroll.
     */
    public Payroll withCheckDate(Optional<String> checkDate) {
        Utils.checkNotNull(checkDate, "checkDate");
        this.checkDate = checkDate;
        return this;
    }

    /**
     * The start date, inclusive, of the pay period.
     */
    public Payroll withStartDate(String startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * The start date, inclusive, of the pay period.
     */
    public Payroll withStartDate(Optional<String> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * The end date, inclusive, of the pay period.
     */
    public Payroll withEndDate(String endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = Optional.ofNullable(endDate);
        return this;
    }

    /**
     * The end date, inclusive, of the pay period.
     */
    public Payroll withEndDate(Optional<String> endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    /**
     * The overview of the payroll totals.
     */
    public Payroll withTotals(PayrollTotals totals) {
        Utils.checkNotNull(totals, "totals");
        this.totals = Optional.ofNullable(totals);
        return this;
    }

    /**
     * The overview of the payroll totals.
     */
    public Payroll withTotals(Optional<? extends PayrollTotals> totals) {
        Utils.checkNotNull(totals, "totals");
        this.totals = totals;
        return this;
    }

    /**
     * An array of compensations for the payroll.
     */
    public Payroll withCompensations(List<Compensation> compensations) {
        Utils.checkNotNull(compensations, "compensations");
        this.compensations = Optional.ofNullable(compensations);
        return this;
    }

    /**
     * An array of compensations for the payroll.
     */
    public Payroll withCompensations(Optional<? extends List<Compensation>> compensations) {
        Utils.checkNotNull(compensations, "compensations");
        this.compensations = compensations;
        return this;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    public Payroll withCustomMappings(CustomMappings customMappings) {
        Utils.checkNotNull(customMappings, "customMappings");
        this.customMappings = JsonNullable.of(customMappings);
        return this;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    public Payroll withCustomMappings(JsonNullable<? extends CustomMappings> customMappings) {
        Utils.checkNotNull(customMappings, "customMappings");
        this.customMappings = customMappings;
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
        Payroll other = (Payroll) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.processed, other.processed) &&
            Objects.deepEquals(this.processedDate, other.processedDate) &&
            Objects.deepEquals(this.checkDate, other.checkDate) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.endDate, other.endDate) &&
            Objects.deepEquals(this.totals, other.totals) &&
            Objects.deepEquals(this.compensations, other.compensations) &&
            Objects.deepEquals(this.customMappings, other.customMappings);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            companyId,
            processed,
            processedDate,
            checkDate,
            startDate,
            endDate,
            totals,
            compensations,
            customMappings);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Payroll.class,
                "id", id,
                "companyId", companyId,
                "processed", processed,
                "processedDate", processedDate,
                "checkDate", checkDate,
                "startDate", startDate,
                "endDate", endDate,
                "totals", totals,
                "compensations", compensations,
                "customMappings", customMappings);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private JsonNullable<String> companyId = JsonNullable.undefined();
 
        private Optional<Boolean> processed = Optional.empty();
 
        private JsonNullable<String> processedDate = JsonNullable.undefined();
 
        private Optional<String> checkDate = Optional.empty();
 
        private Optional<String> startDate = Optional.empty();
 
        private Optional<String> endDate = Optional.empty();
 
        private Optional<? extends PayrollTotals> totals = Optional.empty();
 
        private Optional<? extends List<Compensation>> compensations = Optional.empty();
 
        private JsonNullable<? extends CustomMappings> customMappings = JsonNullable.undefined();
        
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
         * The unique identifier of the company.
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = JsonNullable.of(companyId);
            return this;
        }

        /**
         * The unique identifier of the company.
         */
        public Builder companyId(JsonNullable<String> companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }

        /**
         * Whether or not the payroll has been successfully processed. Note that processed payrolls cannot be updated.
         */
        public Builder processed(boolean processed) {
            Utils.checkNotNull(processed, "processed");
            this.processed = Optional.ofNullable(processed);
            return this;
        }

        /**
         * Whether or not the payroll has been successfully processed. Note that processed payrolls cannot be updated.
         */
        public Builder processed(Optional<Boolean> processed) {
            Utils.checkNotNull(processed, "processed");
            this.processed = processed;
            return this;
        }

        /**
         * The date the payroll was processed.
         */
        public Builder processedDate(String processedDate) {
            Utils.checkNotNull(processedDate, "processedDate");
            this.processedDate = JsonNullable.of(processedDate);
            return this;
        }

        /**
         * The date the payroll was processed.
         */
        public Builder processedDate(JsonNullable<String> processedDate) {
            Utils.checkNotNull(processedDate, "processedDate");
            this.processedDate = processedDate;
            return this;
        }

        /**
         * The date on which employees will be paid for the payroll.
         */
        public Builder checkDate(String checkDate) {
            Utils.checkNotNull(checkDate, "checkDate");
            this.checkDate = Optional.ofNullable(checkDate);
            return this;
        }

        /**
         * The date on which employees will be paid for the payroll.
         */
        public Builder checkDate(Optional<String> checkDate) {
            Utils.checkNotNull(checkDate, "checkDate");
            this.checkDate = checkDate;
            return this;
        }

        /**
         * The start date, inclusive, of the pay period.
         */
        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * The start date, inclusive, of the pay period.
         */
        public Builder startDate(Optional<String> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * The end date, inclusive, of the pay period.
         */
        public Builder endDate(String endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = Optional.ofNullable(endDate);
            return this;
        }

        /**
         * The end date, inclusive, of the pay period.
         */
        public Builder endDate(Optional<String> endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }

        /**
         * The overview of the payroll totals.
         */
        public Builder totals(PayrollTotals totals) {
            Utils.checkNotNull(totals, "totals");
            this.totals = Optional.ofNullable(totals);
            return this;
        }

        /**
         * The overview of the payroll totals.
         */
        public Builder totals(Optional<? extends PayrollTotals> totals) {
            Utils.checkNotNull(totals, "totals");
            this.totals = totals;
            return this;
        }

        /**
         * An array of compensations for the payroll.
         */
        public Builder compensations(List<Compensation> compensations) {
            Utils.checkNotNull(compensations, "compensations");
            this.compensations = Optional.ofNullable(compensations);
            return this;
        }

        /**
         * An array of compensations for the payroll.
         */
        public Builder compensations(Optional<? extends List<Compensation>> compensations) {
            Utils.checkNotNull(compensations, "compensations");
            this.compensations = compensations;
            return this;
        }

        /**
         * When custom mappings are configured on the resource, the result is included here.
         */
        public Builder customMappings(CustomMappings customMappings) {
            Utils.checkNotNull(customMappings, "customMappings");
            this.customMappings = JsonNullable.of(customMappings);
            return this;
        }

        /**
         * When custom mappings are configured on the resource, the result is included here.
         */
        public Builder customMappings(JsonNullable<? extends CustomMappings> customMappings) {
            Utils.checkNotNull(customMappings, "customMappings");
            this.customMappings = customMappings;
            return this;
        }
        
        public Payroll build() {
            return new Payroll(
                id,
                companyId,
                processed,
                processedDate,
                checkDate,
                startDate,
                endDate,
                totals,
                compensations,
                customMappings);
        }
    }
}
