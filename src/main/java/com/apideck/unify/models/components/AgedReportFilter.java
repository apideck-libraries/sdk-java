/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Optional;


public class AgedReportFilter {
    /**
     * Filter by customer id
     */
    @SpeakeasyMetadata("queryParam:name=customer_id")
    private Optional<String> customerId;

    /**
     * Filter by supplier id
     */
    @SpeakeasyMetadata("queryParam:name=supplier_id")
    private Optional<String> supplierId;

    /**
     * The cutoff date for considering transactions
     */
    @SpeakeasyMetadata("queryParam:name=report_as_of_date")
    private Optional<String> reportAsOfDate;

    /**
     * Number of periods to split the aged creditors report into
     */
    @SpeakeasyMetadata("queryParam:name=period_count")
    private Optional<Long> periodCount;

    /**
     * Length of each period in days
     */
    @SpeakeasyMetadata("queryParam:name=period_length")
    private Optional<Long> periodLength;

    @JsonCreator
    public AgedReportFilter(
            Optional<String> customerId,
            Optional<String> supplierId,
            Optional<String> reportAsOfDate,
            Optional<Long> periodCount,
            Optional<Long> periodLength) {
        Utils.checkNotNull(customerId, "customerId");
        Utils.checkNotNull(supplierId, "supplierId");
        Utils.checkNotNull(reportAsOfDate, "reportAsOfDate");
        Utils.checkNotNull(periodCount, "periodCount");
        Utils.checkNotNull(periodLength, "periodLength");
        this.customerId = customerId;
        this.supplierId = supplierId;
        this.reportAsOfDate = reportAsOfDate;
        this.periodCount = periodCount;
        this.periodLength = periodLength;
    }
    
    public AgedReportFilter() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty());
    }

    /**
     * Filter by customer id
     */
    @JsonIgnore
    public Optional<String> customerId() {
        return customerId;
    }

    /**
     * Filter by supplier id
     */
    @JsonIgnore
    public Optional<String> supplierId() {
        return supplierId;
    }

    /**
     * The cutoff date for considering transactions
     */
    @JsonIgnore
    public Optional<String> reportAsOfDate() {
        return reportAsOfDate;
    }

    /**
     * Number of periods to split the aged creditors report into
     */
    @JsonIgnore
    public Optional<Long> periodCount() {
        return periodCount;
    }

    /**
     * Length of each period in days
     */
    @JsonIgnore
    public Optional<Long> periodLength() {
        return periodLength;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Filter by customer id
     */
    public AgedReportFilter withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = Optional.ofNullable(customerId);
        return this;
    }


    /**
     * Filter by customer id
     */
    public AgedReportFilter withCustomerId(Optional<String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }

    /**
     * Filter by supplier id
     */
    public AgedReportFilter withSupplierId(String supplierId) {
        Utils.checkNotNull(supplierId, "supplierId");
        this.supplierId = Optional.ofNullable(supplierId);
        return this;
    }


    /**
     * Filter by supplier id
     */
    public AgedReportFilter withSupplierId(Optional<String> supplierId) {
        Utils.checkNotNull(supplierId, "supplierId");
        this.supplierId = supplierId;
        return this;
    }

    /**
     * The cutoff date for considering transactions
     */
    public AgedReportFilter withReportAsOfDate(String reportAsOfDate) {
        Utils.checkNotNull(reportAsOfDate, "reportAsOfDate");
        this.reportAsOfDate = Optional.ofNullable(reportAsOfDate);
        return this;
    }


    /**
     * The cutoff date for considering transactions
     */
    public AgedReportFilter withReportAsOfDate(Optional<String> reportAsOfDate) {
        Utils.checkNotNull(reportAsOfDate, "reportAsOfDate");
        this.reportAsOfDate = reportAsOfDate;
        return this;
    }

    /**
     * Number of periods to split the aged creditors report into
     */
    public AgedReportFilter withPeriodCount(long periodCount) {
        Utils.checkNotNull(periodCount, "periodCount");
        this.periodCount = Optional.ofNullable(periodCount);
        return this;
    }


    /**
     * Number of periods to split the aged creditors report into
     */
    public AgedReportFilter withPeriodCount(Optional<Long> periodCount) {
        Utils.checkNotNull(periodCount, "periodCount");
        this.periodCount = periodCount;
        return this;
    }

    /**
     * Length of each period in days
     */
    public AgedReportFilter withPeriodLength(long periodLength) {
        Utils.checkNotNull(periodLength, "periodLength");
        this.periodLength = Optional.ofNullable(periodLength);
        return this;
    }


    /**
     * Length of each period in days
     */
    public AgedReportFilter withPeriodLength(Optional<Long> periodLength) {
        Utils.checkNotNull(periodLength, "periodLength");
        this.periodLength = periodLength;
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
        AgedReportFilter other = (AgedReportFilter) o;
        return 
            Utils.enhancedDeepEquals(this.customerId, other.customerId) &&
            Utils.enhancedDeepEquals(this.supplierId, other.supplierId) &&
            Utils.enhancedDeepEquals(this.reportAsOfDate, other.reportAsOfDate) &&
            Utils.enhancedDeepEquals(this.periodCount, other.periodCount) &&
            Utils.enhancedDeepEquals(this.periodLength, other.periodLength);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            customerId, supplierId, reportAsOfDate,
            periodCount, periodLength);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AgedReportFilter.class,
                "customerId", customerId,
                "supplierId", supplierId,
                "reportAsOfDate", reportAsOfDate,
                "periodCount", periodCount,
                "periodLength", periodLength);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> customerId = Optional.empty();

        private Optional<String> supplierId = Optional.empty();

        private Optional<String> reportAsOfDate = Optional.empty();

        private Optional<Long> periodCount = Optional.empty();

        private Optional<Long> periodLength = Optional.empty();

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
         * Filter by supplier id
         */
        public Builder supplierId(String supplierId) {
            Utils.checkNotNull(supplierId, "supplierId");
            this.supplierId = Optional.ofNullable(supplierId);
            return this;
        }

        /**
         * Filter by supplier id
         */
        public Builder supplierId(Optional<String> supplierId) {
            Utils.checkNotNull(supplierId, "supplierId");
            this.supplierId = supplierId;
            return this;
        }


        /**
         * The cutoff date for considering transactions
         */
        public Builder reportAsOfDate(String reportAsOfDate) {
            Utils.checkNotNull(reportAsOfDate, "reportAsOfDate");
            this.reportAsOfDate = Optional.ofNullable(reportAsOfDate);
            return this;
        }

        /**
         * The cutoff date for considering transactions
         */
        public Builder reportAsOfDate(Optional<String> reportAsOfDate) {
            Utils.checkNotNull(reportAsOfDate, "reportAsOfDate");
            this.reportAsOfDate = reportAsOfDate;
            return this;
        }


        /**
         * Number of periods to split the aged creditors report into
         */
        public Builder periodCount(long periodCount) {
            Utils.checkNotNull(periodCount, "periodCount");
            this.periodCount = Optional.ofNullable(periodCount);
            return this;
        }

        /**
         * Number of periods to split the aged creditors report into
         */
        public Builder periodCount(Optional<Long> periodCount) {
            Utils.checkNotNull(periodCount, "periodCount");
            this.periodCount = periodCount;
            return this;
        }


        /**
         * Length of each period in days
         */
        public Builder periodLength(long periodLength) {
            Utils.checkNotNull(periodLength, "periodLength");
            this.periodLength = Optional.ofNullable(periodLength);
            return this;
        }

        /**
         * Length of each period in days
         */
        public Builder periodLength(Optional<Long> periodLength) {
            Utils.checkNotNull(periodLength, "periodLength");
            this.periodLength = periodLength;
            return this;
        }

        public AgedReportFilter build() {

            return new AgedReportFilter(
                customerId, supplierId, reportAsOfDate,
                periodCount, periodLength);
        }

    }
}
