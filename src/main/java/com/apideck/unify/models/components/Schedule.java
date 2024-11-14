/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;


import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class Schedule {

    /**
     * A unique identifier for an object.
     */
    @JsonProperty("id")
    private String id;

    /**
     * The start date, inclusive, of the schedule period.
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * The end date, inclusive, of the schedule period.
     */
    @JsonProperty("end_date")
    private String endDate;

    @JsonProperty("work_pattern")
    private WorkPattern workPattern;

    @JsonCreator
    public Schedule(
            @JsonProperty("id") String id,
            @JsonProperty("start_date") String startDate,
            @JsonProperty("end_date") String endDate,
            @JsonProperty("work_pattern") WorkPattern workPattern) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(workPattern, "workPattern");
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.workPattern = workPattern;
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * The start date, inclusive, of the schedule period.
     */
    @JsonIgnore
    public String startDate() {
        return startDate;
    }

    /**
     * The end date, inclusive, of the schedule period.
     */
    @JsonIgnore
    public String endDate() {
        return endDate;
    }

    @JsonIgnore
    public WorkPattern workPattern() {
        return workPattern;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique identifier for an object.
     */
    public Schedule withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The start date, inclusive, of the schedule period.
     */
    public Schedule withStartDate(String startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * The end date, inclusive, of the schedule period.
     */
    public Schedule withEndDate(String endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    public Schedule withWorkPattern(WorkPattern workPattern) {
        Utils.checkNotNull(workPattern, "workPattern");
        this.workPattern = workPattern;
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
        Schedule other = (Schedule) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.endDate, other.endDate) &&
            Objects.deepEquals(this.workPattern, other.workPattern);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            startDate,
            endDate,
            workPattern);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Schedule.class,
                "id", id,
                "startDate", startDate,
                "endDate", endDate,
                "workPattern", workPattern);
    }
    
    public final static class Builder {
 
        private String id;
 
        private String startDate;
 
        private String endDate;
 
        private WorkPattern workPattern;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A unique identifier for an object.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The start date, inclusive, of the schedule period.
         */
        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * The end date, inclusive, of the schedule period.
         */
        public Builder endDate(String endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }

        public Builder workPattern(WorkPattern workPattern) {
            Utils.checkNotNull(workPattern, "workPattern");
            this.workPattern = workPattern;
            return this;
        }
        
        public Schedule build() {
            return new Schedule(
                id,
                startDate,
                endDate,
                workPattern);
        }
    }
}
