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
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;


public class ProbationPeriod {
    /**
     * The date that the employee started their probation period at the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private JsonNullable<LocalDate> startDate;

    /**
     * The date that the employee ended their probation period at the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    private JsonNullable<LocalDate> endDate;

    @JsonCreator
    public ProbationPeriod(
            @JsonProperty("start_date") JsonNullable<LocalDate> startDate,
            @JsonProperty("end_date") JsonNullable<LocalDate> endDate) {
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(endDate, "endDate");
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public ProbationPeriod() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The date that the employee started their probation period at the company.
     */
    @JsonIgnore
    public JsonNullable<LocalDate> startDate() {
        return startDate;
    }

    /**
     * The date that the employee ended their probation period at the company.
     */
    @JsonIgnore
    public JsonNullable<LocalDate> endDate() {
        return endDate;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The date that the employee started their probation period at the company.
     */
    public ProbationPeriod withStartDate(LocalDate startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = JsonNullable.of(startDate);
        return this;
    }

    /**
     * The date that the employee started their probation period at the company.
     */
    public ProbationPeriod withStartDate(JsonNullable<LocalDate> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * The date that the employee ended their probation period at the company.
     */
    public ProbationPeriod withEndDate(LocalDate endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = JsonNullable.of(endDate);
        return this;
    }

    /**
     * The date that the employee ended their probation period at the company.
     */
    public ProbationPeriod withEndDate(JsonNullable<LocalDate> endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
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
        ProbationPeriod other = (ProbationPeriod) o;
        return 
            Utils.enhancedDeepEquals(this.startDate, other.startDate) &&
            Utils.enhancedDeepEquals(this.endDate, other.endDate);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            startDate, endDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ProbationPeriod.class,
                "startDate", startDate,
                "endDate", endDate);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<LocalDate> startDate = JsonNullable.undefined();

        private JsonNullable<LocalDate> endDate = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The date that the employee started their probation period at the company.
         */
        public Builder startDate(LocalDate startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = JsonNullable.of(startDate);
            return this;
        }

        /**
         * The date that the employee started their probation period at the company.
         */
        public Builder startDate(JsonNullable<LocalDate> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }


        /**
         * The date that the employee ended their probation period at the company.
         */
        public Builder endDate(LocalDate endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = JsonNullable.of(endDate);
            return this;
        }

        /**
         * The date that the employee ended their probation period at the company.
         */
        public Builder endDate(JsonNullable<LocalDate> endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }

        public ProbationPeriod build() {

            return new ProbationPeriod(
                startDate, endDate);
        }

    }
}
