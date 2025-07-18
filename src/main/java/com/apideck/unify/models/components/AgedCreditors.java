/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.apideck.unify.utils.LazySingletonValue;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;


public class AgedCreditors {
    /**
     * The exact date and time the report was generated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("report_generated_at")
    private Optional<OffsetDateTime> reportGeneratedAt;

    /**
     * The cutoff date for transactions included in the report.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("report_as_of_date")
    private Optional<LocalDate> reportAsOfDate;

    /**
     * Number of aging periods shown in the report.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("period_count")
    private Optional<Long> periodCount;

    /**
     * Length of each aging period in days.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("period_length")
    private Optional<Long> periodLength;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("outstanding_balances")
    private Optional<? extends List<OutstandingBalanceBySupplier>> outstandingBalances;

    @JsonCreator
    public AgedCreditors(
            @JsonProperty("report_generated_at") Optional<OffsetDateTime> reportGeneratedAt,
            @JsonProperty("report_as_of_date") Optional<LocalDate> reportAsOfDate,
            @JsonProperty("period_count") Optional<Long> periodCount,
            @JsonProperty("period_length") Optional<Long> periodLength,
            @JsonProperty("outstanding_balances") Optional<? extends List<OutstandingBalanceBySupplier>> outstandingBalances) {
        Utils.checkNotNull(reportGeneratedAt, "reportGeneratedAt");
        Utils.checkNotNull(reportAsOfDate, "reportAsOfDate");
        Utils.checkNotNull(periodCount, "periodCount");
        Utils.checkNotNull(periodLength, "periodLength");
        Utils.checkNotNull(outstandingBalances, "outstandingBalances");
        this.reportGeneratedAt = reportGeneratedAt;
        this.reportAsOfDate = reportAsOfDate;
        this.periodCount = periodCount;
        this.periodLength = periodLength;
        this.outstandingBalances = outstandingBalances;
    }
    
    public AgedCreditors() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty());
    }

    /**
     * The exact date and time the report was generated.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> reportGeneratedAt() {
        return reportGeneratedAt;
    }

    /**
     * The cutoff date for transactions included in the report.
     */
    @JsonIgnore
    public Optional<LocalDate> reportAsOfDate() {
        return reportAsOfDate;
    }

    /**
     * Number of aging periods shown in the report.
     */
    @JsonIgnore
    public Optional<Long> periodCount() {
        return periodCount;
    }

    /**
     * Length of each aging period in days.
     */
    @JsonIgnore
    public Optional<Long> periodLength() {
        return periodLength;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<OutstandingBalanceBySupplier>> outstandingBalances() {
        return (Optional<List<OutstandingBalanceBySupplier>>) outstandingBalances;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The exact date and time the report was generated.
     */
    public AgedCreditors withReportGeneratedAt(OffsetDateTime reportGeneratedAt) {
        Utils.checkNotNull(reportGeneratedAt, "reportGeneratedAt");
        this.reportGeneratedAt = Optional.ofNullable(reportGeneratedAt);
        return this;
    }


    /**
     * The exact date and time the report was generated.
     */
    public AgedCreditors withReportGeneratedAt(Optional<OffsetDateTime> reportGeneratedAt) {
        Utils.checkNotNull(reportGeneratedAt, "reportGeneratedAt");
        this.reportGeneratedAt = reportGeneratedAt;
        return this;
    }

    /**
     * The cutoff date for transactions included in the report.
     */
    public AgedCreditors withReportAsOfDate(LocalDate reportAsOfDate) {
        Utils.checkNotNull(reportAsOfDate, "reportAsOfDate");
        this.reportAsOfDate = Optional.ofNullable(reportAsOfDate);
        return this;
    }


    /**
     * The cutoff date for transactions included in the report.
     */
    public AgedCreditors withReportAsOfDate(Optional<LocalDate> reportAsOfDate) {
        Utils.checkNotNull(reportAsOfDate, "reportAsOfDate");
        this.reportAsOfDate = reportAsOfDate;
        return this;
    }

    /**
     * Number of aging periods shown in the report.
     */
    public AgedCreditors withPeriodCount(long periodCount) {
        Utils.checkNotNull(periodCount, "periodCount");
        this.periodCount = Optional.ofNullable(periodCount);
        return this;
    }


    /**
     * Number of aging periods shown in the report.
     */
    public AgedCreditors withPeriodCount(Optional<Long> periodCount) {
        Utils.checkNotNull(periodCount, "periodCount");
        this.periodCount = periodCount;
        return this;
    }

    /**
     * Length of each aging period in days.
     */
    public AgedCreditors withPeriodLength(long periodLength) {
        Utils.checkNotNull(periodLength, "periodLength");
        this.periodLength = Optional.ofNullable(periodLength);
        return this;
    }


    /**
     * Length of each aging period in days.
     */
    public AgedCreditors withPeriodLength(Optional<Long> periodLength) {
        Utils.checkNotNull(periodLength, "periodLength");
        this.periodLength = periodLength;
        return this;
    }

    public AgedCreditors withOutstandingBalances(List<OutstandingBalanceBySupplier> outstandingBalances) {
        Utils.checkNotNull(outstandingBalances, "outstandingBalances");
        this.outstandingBalances = Optional.ofNullable(outstandingBalances);
        return this;
    }


    public AgedCreditors withOutstandingBalances(Optional<? extends List<OutstandingBalanceBySupplier>> outstandingBalances) {
        Utils.checkNotNull(outstandingBalances, "outstandingBalances");
        this.outstandingBalances = outstandingBalances;
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
        AgedCreditors other = (AgedCreditors) o;
        return 
            Utils.enhancedDeepEquals(this.reportGeneratedAt, other.reportGeneratedAt) &&
            Utils.enhancedDeepEquals(this.reportAsOfDate, other.reportAsOfDate) &&
            Utils.enhancedDeepEquals(this.periodCount, other.periodCount) &&
            Utils.enhancedDeepEquals(this.periodLength, other.periodLength) &&
            Utils.enhancedDeepEquals(this.outstandingBalances, other.outstandingBalances);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            reportGeneratedAt, reportAsOfDate, periodCount,
            periodLength, outstandingBalances);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AgedCreditors.class,
                "reportGeneratedAt", reportGeneratedAt,
                "reportAsOfDate", reportAsOfDate,
                "periodCount", periodCount,
                "periodLength", periodLength,
                "outstandingBalances", outstandingBalances);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<OffsetDateTime> reportGeneratedAt = Optional.empty();

        private Optional<LocalDate> reportAsOfDate = Optional.empty();

        private Optional<Long> periodCount;

        private Optional<Long> periodLength;

        private Optional<? extends List<OutstandingBalanceBySupplier>> outstandingBalances = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The exact date and time the report was generated.
         */
        public Builder reportGeneratedAt(OffsetDateTime reportGeneratedAt) {
            Utils.checkNotNull(reportGeneratedAt, "reportGeneratedAt");
            this.reportGeneratedAt = Optional.ofNullable(reportGeneratedAt);
            return this;
        }

        /**
         * The exact date and time the report was generated.
         */
        public Builder reportGeneratedAt(Optional<OffsetDateTime> reportGeneratedAt) {
            Utils.checkNotNull(reportGeneratedAt, "reportGeneratedAt");
            this.reportGeneratedAt = reportGeneratedAt;
            return this;
        }


        /**
         * The cutoff date for transactions included in the report.
         */
        public Builder reportAsOfDate(LocalDate reportAsOfDate) {
            Utils.checkNotNull(reportAsOfDate, "reportAsOfDate");
            this.reportAsOfDate = Optional.ofNullable(reportAsOfDate);
            return this;
        }

        /**
         * The cutoff date for transactions included in the report.
         */
        public Builder reportAsOfDate(Optional<LocalDate> reportAsOfDate) {
            Utils.checkNotNull(reportAsOfDate, "reportAsOfDate");
            this.reportAsOfDate = reportAsOfDate;
            return this;
        }


        /**
         * Number of aging periods shown in the report.
         */
        public Builder periodCount(long periodCount) {
            Utils.checkNotNull(periodCount, "periodCount");
            this.periodCount = Optional.ofNullable(periodCount);
            return this;
        }

        /**
         * Number of aging periods shown in the report.
         */
        public Builder periodCount(Optional<Long> periodCount) {
            Utils.checkNotNull(periodCount, "periodCount");
            this.periodCount = periodCount;
            return this;
        }


        /**
         * Length of each aging period in days.
         */
        public Builder periodLength(long periodLength) {
            Utils.checkNotNull(periodLength, "periodLength");
            this.periodLength = Optional.ofNullable(periodLength);
            return this;
        }

        /**
         * Length of each aging period in days.
         */
        public Builder periodLength(Optional<Long> periodLength) {
            Utils.checkNotNull(periodLength, "periodLength");
            this.periodLength = periodLength;
            return this;
        }


        public Builder outstandingBalances(List<OutstandingBalanceBySupplier> outstandingBalances) {
            Utils.checkNotNull(outstandingBalances, "outstandingBalances");
            this.outstandingBalances = Optional.ofNullable(outstandingBalances);
            return this;
        }

        public Builder outstandingBalances(Optional<? extends List<OutstandingBalanceBySupplier>> outstandingBalances) {
            Utils.checkNotNull(outstandingBalances, "outstandingBalances");
            this.outstandingBalances = outstandingBalances;
            return this;
        }

        public AgedCreditors build() {
            if (periodCount == null) {
                periodCount = _SINGLETON_VALUE_PeriodCount.value();
            }
            if (periodLength == null) {
                periodLength = _SINGLETON_VALUE_PeriodLength.value();
            }

            return new AgedCreditors(
                reportGeneratedAt, reportAsOfDate, periodCount,
                periodLength, outstandingBalances);
        }


        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_PeriodCount =
                new LazySingletonValue<>(
                        "period_count",
                        "4",
                        new TypeReference<Optional<Long>>() {});

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_PeriodLength =
                new LazySingletonValue<>(
                        "period_length",
                        "30",
                        new TypeReference<Optional<Long>>() {});
    }
}
