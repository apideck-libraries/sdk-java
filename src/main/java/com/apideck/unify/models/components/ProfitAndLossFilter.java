/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;


import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class ProfitAndLossFilter {

    /**
     * Filter by customer id
     */
    @SpeakeasyMetadata("queryParam:name=customer_id")
    private Optional<String> customerId;

    /**
     * Filter by start date. If start date is given, end date is required.
     */
    @SpeakeasyMetadata("queryParam:name=start_date")
    private Optional<String> startDate;

    /**
     * Filter by end date. If end date is given, start date is required.
     */
    @SpeakeasyMetadata("queryParam:name=end_date")
    private Optional<String> endDate;

    @JsonCreator
    public ProfitAndLossFilter(
            Optional<String> customerId,
            Optional<String> startDate,
            Optional<String> endDate) {
        Utils.checkNotNull(customerId, "customerId");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(endDate, "endDate");
        this.customerId = customerId;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public ProfitAndLossFilter() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Filter by customer id
     */
    @JsonIgnore
    public Optional<String> customerId() {
        return customerId;
    }

    /**
     * Filter by start date. If start date is given, end date is required.
     */
    @JsonIgnore
    public Optional<String> startDate() {
        return startDate;
    }

    /**
     * Filter by end date. If end date is given, start date is required.
     */
    @JsonIgnore
    public Optional<String> endDate() {
        return endDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Filter by customer id
     */
    public ProfitAndLossFilter withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = Optional.ofNullable(customerId);
        return this;
    }

    /**
     * Filter by customer id
     */
    public ProfitAndLossFilter withCustomerId(Optional<String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }

    /**
     * Filter by start date. If start date is given, end date is required.
     */
    public ProfitAndLossFilter withStartDate(String startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * Filter by start date. If start date is given, end date is required.
     */
    public ProfitAndLossFilter withStartDate(Optional<String> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * Filter by end date. If end date is given, start date is required.
     */
    public ProfitAndLossFilter withEndDate(String endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = Optional.ofNullable(endDate);
        return this;
    }

    /**
     * Filter by end date. If end date is given, start date is required.
     */
    public ProfitAndLossFilter withEndDate(Optional<String> endDate) {
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
        ProfitAndLossFilter other = (ProfitAndLossFilter) o;
        return 
            Objects.deepEquals(this.customerId, other.customerId) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.endDate, other.endDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            customerId,
            startDate,
            endDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ProfitAndLossFilter.class,
                "customerId", customerId,
                "startDate", startDate,
                "endDate", endDate);
    }
    
    public final static class Builder {
 
        private Optional<String> customerId = Optional.empty();
 
        private Optional<String> startDate = Optional.empty();
 
        private Optional<String> endDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Filter by customer id
         */
        public Builder customerId(String customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = Optional.ofNullable(customerId);
            return this;
        }

        /**
         * Filter by customer id
         */
        public Builder customerId(Optional<String> customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = customerId;
            return this;
        }

        /**
         * Filter by start date. If start date is given, end date is required.
         */
        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * Filter by start date. If start date is given, end date is required.
         */
        public Builder startDate(Optional<String> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * Filter by end date. If end date is given, start date is required.
         */
        public Builder endDate(String endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = Optional.ofNullable(endDate);
            return this;
        }

        /**
         * Filter by end date. If end date is given, start date is required.
         */
        public Builder endDate(Optional<String> endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }
        
        public ProfitAndLossFilter build() {
            return new ProfitAndLossFilter(
                customerId,
                startDate,
                endDate);
        }
    }
}

