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
import java.util.Objects;
import java.util.Optional;


public class EvenWeeks {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hours_monday")
    private Optional<Double> hoursMonday;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hours_tuesday")
    private Optional<Double> hoursTuesday;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hours_wednesday")
    private Optional<Double> hoursWednesday;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hours_thursday")
    private Optional<Double> hoursThursday;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hours_friday")
    private Optional<Double> hoursFriday;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hours_saturday")
    private Optional<Double> hoursSaturday;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hours_sunday")
    private Optional<Double> hoursSunday;

    @JsonCreator
    public EvenWeeks(
            @JsonProperty("hours_monday") Optional<Double> hoursMonday,
            @JsonProperty("hours_tuesday") Optional<Double> hoursTuesday,
            @JsonProperty("hours_wednesday") Optional<Double> hoursWednesday,
            @JsonProperty("hours_thursday") Optional<Double> hoursThursday,
            @JsonProperty("hours_friday") Optional<Double> hoursFriday,
            @JsonProperty("hours_saturday") Optional<Double> hoursSaturday,
            @JsonProperty("hours_sunday") Optional<Double> hoursSunday) {
        Utils.checkNotNull(hoursMonday, "hoursMonday");
        Utils.checkNotNull(hoursTuesday, "hoursTuesday");
        Utils.checkNotNull(hoursWednesday, "hoursWednesday");
        Utils.checkNotNull(hoursThursday, "hoursThursday");
        Utils.checkNotNull(hoursFriday, "hoursFriday");
        Utils.checkNotNull(hoursSaturday, "hoursSaturday");
        Utils.checkNotNull(hoursSunday, "hoursSunday");
        this.hoursMonday = hoursMonday;
        this.hoursTuesday = hoursTuesday;
        this.hoursWednesday = hoursWednesday;
        this.hoursThursday = hoursThursday;
        this.hoursFriday = hoursFriday;
        this.hoursSaturday = hoursSaturday;
        this.hoursSunday = hoursSunday;
    }
    
    public EvenWeeks() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Double> hoursMonday() {
        return hoursMonday;
    }

    @JsonIgnore
    public Optional<Double> hoursTuesday() {
        return hoursTuesday;
    }

    @JsonIgnore
    public Optional<Double> hoursWednesday() {
        return hoursWednesday;
    }

    @JsonIgnore
    public Optional<Double> hoursThursday() {
        return hoursThursday;
    }

    @JsonIgnore
    public Optional<Double> hoursFriday() {
        return hoursFriday;
    }

    @JsonIgnore
    public Optional<Double> hoursSaturday() {
        return hoursSaturday;
    }

    @JsonIgnore
    public Optional<Double> hoursSunday() {
        return hoursSunday;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public EvenWeeks withHoursMonday(double hoursMonday) {
        Utils.checkNotNull(hoursMonday, "hoursMonday");
        this.hoursMonday = Optional.ofNullable(hoursMonday);
        return this;
    }

    public EvenWeeks withHoursMonday(Optional<Double> hoursMonday) {
        Utils.checkNotNull(hoursMonday, "hoursMonday");
        this.hoursMonday = hoursMonday;
        return this;
    }

    public EvenWeeks withHoursTuesday(double hoursTuesday) {
        Utils.checkNotNull(hoursTuesday, "hoursTuesday");
        this.hoursTuesday = Optional.ofNullable(hoursTuesday);
        return this;
    }

    public EvenWeeks withHoursTuesday(Optional<Double> hoursTuesday) {
        Utils.checkNotNull(hoursTuesday, "hoursTuesday");
        this.hoursTuesday = hoursTuesday;
        return this;
    }

    public EvenWeeks withHoursWednesday(double hoursWednesday) {
        Utils.checkNotNull(hoursWednesday, "hoursWednesday");
        this.hoursWednesday = Optional.ofNullable(hoursWednesday);
        return this;
    }

    public EvenWeeks withHoursWednesday(Optional<Double> hoursWednesday) {
        Utils.checkNotNull(hoursWednesday, "hoursWednesday");
        this.hoursWednesday = hoursWednesday;
        return this;
    }

    public EvenWeeks withHoursThursday(double hoursThursday) {
        Utils.checkNotNull(hoursThursday, "hoursThursday");
        this.hoursThursday = Optional.ofNullable(hoursThursday);
        return this;
    }

    public EvenWeeks withHoursThursday(Optional<Double> hoursThursday) {
        Utils.checkNotNull(hoursThursday, "hoursThursday");
        this.hoursThursday = hoursThursday;
        return this;
    }

    public EvenWeeks withHoursFriday(double hoursFriday) {
        Utils.checkNotNull(hoursFriday, "hoursFriday");
        this.hoursFriday = Optional.ofNullable(hoursFriday);
        return this;
    }

    public EvenWeeks withHoursFriday(Optional<Double> hoursFriday) {
        Utils.checkNotNull(hoursFriday, "hoursFriday");
        this.hoursFriday = hoursFriday;
        return this;
    }

    public EvenWeeks withHoursSaturday(double hoursSaturday) {
        Utils.checkNotNull(hoursSaturday, "hoursSaturday");
        this.hoursSaturday = Optional.ofNullable(hoursSaturday);
        return this;
    }

    public EvenWeeks withHoursSaturday(Optional<Double> hoursSaturday) {
        Utils.checkNotNull(hoursSaturday, "hoursSaturday");
        this.hoursSaturday = hoursSaturday;
        return this;
    }

    public EvenWeeks withHoursSunday(double hoursSunday) {
        Utils.checkNotNull(hoursSunday, "hoursSunday");
        this.hoursSunday = Optional.ofNullable(hoursSunday);
        return this;
    }

    public EvenWeeks withHoursSunday(Optional<Double> hoursSunday) {
        Utils.checkNotNull(hoursSunday, "hoursSunday");
        this.hoursSunday = hoursSunday;
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
        EvenWeeks other = (EvenWeeks) o;
        return 
            Objects.deepEquals(this.hoursMonday, other.hoursMonday) &&
            Objects.deepEquals(this.hoursTuesday, other.hoursTuesday) &&
            Objects.deepEquals(this.hoursWednesday, other.hoursWednesday) &&
            Objects.deepEquals(this.hoursThursday, other.hoursThursday) &&
            Objects.deepEquals(this.hoursFriday, other.hoursFriday) &&
            Objects.deepEquals(this.hoursSaturday, other.hoursSaturday) &&
            Objects.deepEquals(this.hoursSunday, other.hoursSunday);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            hoursMonday,
            hoursTuesday,
            hoursWednesday,
            hoursThursday,
            hoursFriday,
            hoursSaturday,
            hoursSunday);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EvenWeeks.class,
                "hoursMonday", hoursMonday,
                "hoursTuesday", hoursTuesday,
                "hoursWednesday", hoursWednesday,
                "hoursThursday", hoursThursday,
                "hoursFriday", hoursFriday,
                "hoursSaturday", hoursSaturday,
                "hoursSunday", hoursSunday);
    }
    
    public final static class Builder {
 
        private Optional<Double> hoursMonday = Optional.empty();
 
        private Optional<Double> hoursTuesday = Optional.empty();
 
        private Optional<Double> hoursWednesday = Optional.empty();
 
        private Optional<Double> hoursThursday = Optional.empty();
 
        private Optional<Double> hoursFriday = Optional.empty();
 
        private Optional<Double> hoursSaturday = Optional.empty();
 
        private Optional<Double> hoursSunday = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder hoursMonday(double hoursMonday) {
            Utils.checkNotNull(hoursMonday, "hoursMonday");
            this.hoursMonday = Optional.ofNullable(hoursMonday);
            return this;
        }

        public Builder hoursMonday(Optional<Double> hoursMonday) {
            Utils.checkNotNull(hoursMonday, "hoursMonday");
            this.hoursMonday = hoursMonday;
            return this;
        }

        public Builder hoursTuesday(double hoursTuesday) {
            Utils.checkNotNull(hoursTuesday, "hoursTuesday");
            this.hoursTuesday = Optional.ofNullable(hoursTuesday);
            return this;
        }

        public Builder hoursTuesday(Optional<Double> hoursTuesday) {
            Utils.checkNotNull(hoursTuesday, "hoursTuesday");
            this.hoursTuesday = hoursTuesday;
            return this;
        }

        public Builder hoursWednesday(double hoursWednesday) {
            Utils.checkNotNull(hoursWednesday, "hoursWednesday");
            this.hoursWednesday = Optional.ofNullable(hoursWednesday);
            return this;
        }

        public Builder hoursWednesday(Optional<Double> hoursWednesday) {
            Utils.checkNotNull(hoursWednesday, "hoursWednesday");
            this.hoursWednesday = hoursWednesday;
            return this;
        }

        public Builder hoursThursday(double hoursThursday) {
            Utils.checkNotNull(hoursThursday, "hoursThursday");
            this.hoursThursday = Optional.ofNullable(hoursThursday);
            return this;
        }

        public Builder hoursThursday(Optional<Double> hoursThursday) {
            Utils.checkNotNull(hoursThursday, "hoursThursday");
            this.hoursThursday = hoursThursday;
            return this;
        }

        public Builder hoursFriday(double hoursFriday) {
            Utils.checkNotNull(hoursFriday, "hoursFriday");
            this.hoursFriday = Optional.ofNullable(hoursFriday);
            return this;
        }

        public Builder hoursFriday(Optional<Double> hoursFriday) {
            Utils.checkNotNull(hoursFriday, "hoursFriday");
            this.hoursFriday = hoursFriday;
            return this;
        }

        public Builder hoursSaturday(double hoursSaturday) {
            Utils.checkNotNull(hoursSaturday, "hoursSaturday");
            this.hoursSaturday = Optional.ofNullable(hoursSaturday);
            return this;
        }

        public Builder hoursSaturday(Optional<Double> hoursSaturday) {
            Utils.checkNotNull(hoursSaturday, "hoursSaturday");
            this.hoursSaturday = hoursSaturday;
            return this;
        }

        public Builder hoursSunday(double hoursSunday) {
            Utils.checkNotNull(hoursSunday, "hoursSunday");
            this.hoursSunday = Optional.ofNullable(hoursSunday);
            return this;
        }

        public Builder hoursSunday(Optional<Double> hoursSunday) {
            Utils.checkNotNull(hoursSunday, "hoursSunday");
            this.hoursSunday = hoursSunday;
            return this;
        }
        
        public EvenWeeks build() {
            return new EvenWeeks(
                hoursMonday,
                hoursTuesday,
                hoursWednesday,
                hoursThursday,
                hoursFriday,
                hoursSaturday,
                hoursSunday);
        }
    }
}
