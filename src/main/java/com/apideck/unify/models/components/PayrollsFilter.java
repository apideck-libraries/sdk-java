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

public class PayrollsFilter {

    /**
     * Return payrolls whose pay period is after the start date
     */
    @SpeakeasyMetadata("queryParam:name=start_date")
    private Optional<String> startDate;

    /**
     * Return payrolls whose pay period is before the end date
     */
    @SpeakeasyMetadata("queryParam:name=end_date")
    private Optional<String> endDate;

    @JsonCreator
    public PayrollsFilter(
            Optional<String> startDate,
            Optional<String> endDate) {
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(endDate, "endDate");
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public PayrollsFilter() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Return payrolls whose pay period is after the start date
     */
    @JsonIgnore
    public Optional<String> startDate() {
        return startDate;
    }

    /**
     * Return payrolls whose pay period is before the end date
     */
    @JsonIgnore
    public Optional<String> endDate() {
        return endDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Return payrolls whose pay period is after the start date
     */
    public PayrollsFilter withStartDate(String startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * Return payrolls whose pay period is after the start date
     */
    public PayrollsFilter withStartDate(Optional<String> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * Return payrolls whose pay period is before the end date
     */
    public PayrollsFilter withEndDate(String endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = Optional.ofNullable(endDate);
        return this;
    }

    /**
     * Return payrolls whose pay period is before the end date
     */
    public PayrollsFilter withEndDate(Optional<String> endDate) {
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
        PayrollsFilter other = (PayrollsFilter) o;
        return 
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.endDate, other.endDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            startDate,
            endDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PayrollsFilter.class,
                "startDate", startDate,
                "endDate", endDate);
    }
    
    public final static class Builder {
 
        private Optional<String> startDate = Optional.empty();
 
        private Optional<String> endDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Return payrolls whose pay period is after the start date
         */
        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * Return payrolls whose pay period is after the start date
         */
        public Builder startDate(Optional<String> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * Return payrolls whose pay period is before the end date
         */
        public Builder endDate(String endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = Optional.ofNullable(endDate);
            return this;
        }

        /**
         * Return payrolls whose pay period is before the end date
         */
        public Builder endDate(Optional<String> endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }
        
        public PayrollsFilter build() {
            return new PayrollsFilter(
                startDate,
                endDate);
        }
    }
}

