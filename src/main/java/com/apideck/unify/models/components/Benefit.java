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
import org.openapitools.jackson.nullable.JsonNullable;

public class Benefit {

    /**
     * The name of the benefit.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * The amount deducted for benefit.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee_deduction")
    private JsonNullable<Double> employeeDeduction;

    /**
     * The amount of employer contribution.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employer_contribution")
    private JsonNullable<Double> employerContribution;

    @JsonCreator
    public Benefit(
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("employee_deduction") JsonNullable<Double> employeeDeduction,
            @JsonProperty("employer_contribution") JsonNullable<Double> employerContribution) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(employeeDeduction, "employeeDeduction");
        Utils.checkNotNull(employerContribution, "employerContribution");
        this.name = name;
        this.employeeDeduction = employeeDeduction;
        this.employerContribution = employerContribution;
    }
    
    public Benefit() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The name of the benefit.
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * The amount deducted for benefit.
     */
    @JsonIgnore
    public JsonNullable<Double> employeeDeduction() {
        return employeeDeduction;
    }

    /**
     * The amount of employer contribution.
     */
    @JsonIgnore
    public JsonNullable<Double> employerContribution() {
        return employerContribution;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The name of the benefit.
     */
    public Benefit withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The name of the benefit.
     */
    public Benefit withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The amount deducted for benefit.
     */
    public Benefit withEmployeeDeduction(double employeeDeduction) {
        Utils.checkNotNull(employeeDeduction, "employeeDeduction");
        this.employeeDeduction = JsonNullable.of(employeeDeduction);
        return this;
    }

    /**
     * The amount deducted for benefit.
     */
    public Benefit withEmployeeDeduction(JsonNullable<Double> employeeDeduction) {
        Utils.checkNotNull(employeeDeduction, "employeeDeduction");
        this.employeeDeduction = employeeDeduction;
        return this;
    }

    /**
     * The amount of employer contribution.
     */
    public Benefit withEmployerContribution(double employerContribution) {
        Utils.checkNotNull(employerContribution, "employerContribution");
        this.employerContribution = JsonNullable.of(employerContribution);
        return this;
    }

    /**
     * The amount of employer contribution.
     */
    public Benefit withEmployerContribution(JsonNullable<Double> employerContribution) {
        Utils.checkNotNull(employerContribution, "employerContribution");
        this.employerContribution = employerContribution;
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
        Benefit other = (Benefit) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.employeeDeduction, other.employeeDeduction) &&
            Objects.deepEquals(this.employerContribution, other.employerContribution);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            employeeDeduction,
            employerContribution);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Benefit.class,
                "name", name,
                "employeeDeduction", employeeDeduction,
                "employerContribution", employerContribution);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<Double> employeeDeduction = JsonNullable.undefined();
 
        private JsonNullable<Double> employerContribution = JsonNullable.undefined();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name of the benefit.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * The name of the benefit.
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The amount deducted for benefit.
         */
        public Builder employeeDeduction(double employeeDeduction) {
            Utils.checkNotNull(employeeDeduction, "employeeDeduction");
            this.employeeDeduction = JsonNullable.of(employeeDeduction);
            return this;
        }

        /**
         * The amount deducted for benefit.
         */
        public Builder employeeDeduction(JsonNullable<Double> employeeDeduction) {
            Utils.checkNotNull(employeeDeduction, "employeeDeduction");
            this.employeeDeduction = employeeDeduction;
            return this;
        }

        /**
         * The amount of employer contribution.
         */
        public Builder employerContribution(double employerContribution) {
            Utils.checkNotNull(employerContribution, "employerContribution");
            this.employerContribution = JsonNullable.of(employerContribution);
            return this;
        }

        /**
         * The amount of employer contribution.
         */
        public Builder employerContribution(JsonNullable<Double> employerContribution) {
            Utils.checkNotNull(employerContribution, "employerContribution");
            this.employerContribution = employerContribution;
            return this;
        }
        
        public Benefit build() {
            return new Benefit(
                name,
                employeeDeduction,
                employerContribution);
        }
    }
}
