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
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class Compensation {
    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("employee_id")
    private Optional<String> employeeId;

    /**
     * The employee's net pay. Only available when payroll has been processed
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("net_pay")
    private JsonNullable<Double> netPay;

    /**
     * The employee's gross pay. Only available when payroll has been processed
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("gross_pay")
    private JsonNullable<Double> grossPay;

    /**
     * An array of employer and employee taxes for the pay period.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxes")
    private JsonNullable<? extends List<Tax>> taxes;

    /**
     * An array of employee deductions for the pay period.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deductions")
    private JsonNullable<? extends List<Deduction>> deductions;

    /**
     * An array of employee benefits for the pay period.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("benefits")
    private JsonNullable<? extends List<Benefit>> benefits;

    @JsonCreator
    public Compensation(
            @JsonProperty("employee_id") Optional<String> employeeId,
            @JsonProperty("net_pay") JsonNullable<Double> netPay,
            @JsonProperty("gross_pay") JsonNullable<Double> grossPay,
            @JsonProperty("taxes") JsonNullable<? extends List<Tax>> taxes,
            @JsonProperty("deductions") JsonNullable<? extends List<Deduction>> deductions,
            @JsonProperty("benefits") JsonNullable<? extends List<Benefit>> benefits) {
        Utils.checkNotNull(employeeId, "employeeId");
        Utils.checkNotNull(netPay, "netPay");
        Utils.checkNotNull(grossPay, "grossPay");
        Utils.checkNotNull(taxes, "taxes");
        Utils.checkNotNull(deductions, "deductions");
        Utils.checkNotNull(benefits, "benefits");
        this.employeeId = employeeId;
        this.netPay = netPay;
        this.grossPay = grossPay;
        this.taxes = taxes;
        this.deductions = deductions;
        this.benefits = benefits;
    }
    
    public Compensation() {
        this(Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public Optional<String> employeeId() {
        return employeeId;
    }

    /**
     * The employee's net pay. Only available when payroll has been processed
     */
    @JsonIgnore
    public JsonNullable<Double> netPay() {
        return netPay;
    }

    /**
     * The employee's gross pay. Only available when payroll has been processed
     */
    @JsonIgnore
    public JsonNullable<Double> grossPay() {
        return grossPay;
    }

    /**
     * An array of employer and employee taxes for the pay period.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<Tax>> taxes() {
        return (JsonNullable<List<Tax>>) taxes;
    }

    /**
     * An array of employee deductions for the pay period.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<Deduction>> deductions() {
        return (JsonNullable<List<Deduction>>) deductions;
    }

    /**
     * An array of employee benefits for the pay period.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<Benefit>> benefits() {
        return (JsonNullable<List<Benefit>>) benefits;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * A unique identifier for an object.
     */
    public Compensation withEmployeeId(String employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = Optional.ofNullable(employeeId);
        return this;
    }


    /**
     * A unique identifier for an object.
     */
    public Compensation withEmployeeId(Optional<String> employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = employeeId;
        return this;
    }

    /**
     * The employee's net pay. Only available when payroll has been processed
     */
    public Compensation withNetPay(double netPay) {
        Utils.checkNotNull(netPay, "netPay");
        this.netPay = JsonNullable.of(netPay);
        return this;
    }

    /**
     * The employee's net pay. Only available when payroll has been processed
     */
    public Compensation withNetPay(JsonNullable<Double> netPay) {
        Utils.checkNotNull(netPay, "netPay");
        this.netPay = netPay;
        return this;
    }

    /**
     * The employee's gross pay. Only available when payroll has been processed
     */
    public Compensation withGrossPay(double grossPay) {
        Utils.checkNotNull(grossPay, "grossPay");
        this.grossPay = JsonNullable.of(grossPay);
        return this;
    }

    /**
     * The employee's gross pay. Only available when payroll has been processed
     */
    public Compensation withGrossPay(JsonNullable<Double> grossPay) {
        Utils.checkNotNull(grossPay, "grossPay");
        this.grossPay = grossPay;
        return this;
    }

    /**
     * An array of employer and employee taxes for the pay period.
     */
    public Compensation withTaxes(List<Tax> taxes) {
        Utils.checkNotNull(taxes, "taxes");
        this.taxes = JsonNullable.of(taxes);
        return this;
    }

    /**
     * An array of employer and employee taxes for the pay period.
     */
    public Compensation withTaxes(JsonNullable<? extends List<Tax>> taxes) {
        Utils.checkNotNull(taxes, "taxes");
        this.taxes = taxes;
        return this;
    }

    /**
     * An array of employee deductions for the pay period.
     */
    public Compensation withDeductions(List<Deduction> deductions) {
        Utils.checkNotNull(deductions, "deductions");
        this.deductions = JsonNullable.of(deductions);
        return this;
    }

    /**
     * An array of employee deductions for the pay period.
     */
    public Compensation withDeductions(JsonNullable<? extends List<Deduction>> deductions) {
        Utils.checkNotNull(deductions, "deductions");
        this.deductions = deductions;
        return this;
    }

    /**
     * An array of employee benefits for the pay period.
     */
    public Compensation withBenefits(List<Benefit> benefits) {
        Utils.checkNotNull(benefits, "benefits");
        this.benefits = JsonNullable.of(benefits);
        return this;
    }

    /**
     * An array of employee benefits for the pay period.
     */
    public Compensation withBenefits(JsonNullable<? extends List<Benefit>> benefits) {
        Utils.checkNotNull(benefits, "benefits");
        this.benefits = benefits;
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
        Compensation other = (Compensation) o;
        return 
            Utils.enhancedDeepEquals(this.employeeId, other.employeeId) &&
            Utils.enhancedDeepEquals(this.netPay, other.netPay) &&
            Utils.enhancedDeepEquals(this.grossPay, other.grossPay) &&
            Utils.enhancedDeepEquals(this.taxes, other.taxes) &&
            Utils.enhancedDeepEquals(this.deductions, other.deductions) &&
            Utils.enhancedDeepEquals(this.benefits, other.benefits);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            employeeId, netPay, grossPay,
            taxes, deductions, benefits);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Compensation.class,
                "employeeId", employeeId,
                "netPay", netPay,
                "grossPay", grossPay,
                "taxes", taxes,
                "deductions", deductions,
                "benefits", benefits);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> employeeId = Optional.empty();

        private JsonNullable<Double> netPay = JsonNullable.undefined();

        private JsonNullable<Double> grossPay = JsonNullable.undefined();

        private JsonNullable<? extends List<Tax>> taxes = JsonNullable.undefined();

        private JsonNullable<? extends List<Deduction>> deductions = JsonNullable.undefined();

        private JsonNullable<? extends List<Benefit>> benefits = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * A unique identifier for an object.
         */
        public Builder employeeId(String employeeId) {
            Utils.checkNotNull(employeeId, "employeeId");
            this.employeeId = Optional.ofNullable(employeeId);
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder employeeId(Optional<String> employeeId) {
            Utils.checkNotNull(employeeId, "employeeId");
            this.employeeId = employeeId;
            return this;
        }


        /**
         * The employee's net pay. Only available when payroll has been processed
         */
        public Builder netPay(double netPay) {
            Utils.checkNotNull(netPay, "netPay");
            this.netPay = JsonNullable.of(netPay);
            return this;
        }

        /**
         * The employee's net pay. Only available when payroll has been processed
         */
        public Builder netPay(JsonNullable<Double> netPay) {
            Utils.checkNotNull(netPay, "netPay");
            this.netPay = netPay;
            return this;
        }


        /**
         * The employee's gross pay. Only available when payroll has been processed
         */
        public Builder grossPay(double grossPay) {
            Utils.checkNotNull(grossPay, "grossPay");
            this.grossPay = JsonNullable.of(grossPay);
            return this;
        }

        /**
         * The employee's gross pay. Only available when payroll has been processed
         */
        public Builder grossPay(JsonNullable<Double> grossPay) {
            Utils.checkNotNull(grossPay, "grossPay");
            this.grossPay = grossPay;
            return this;
        }


        /**
         * An array of employer and employee taxes for the pay period.
         */
        public Builder taxes(List<Tax> taxes) {
            Utils.checkNotNull(taxes, "taxes");
            this.taxes = JsonNullable.of(taxes);
            return this;
        }

        /**
         * An array of employer and employee taxes for the pay period.
         */
        public Builder taxes(JsonNullable<? extends List<Tax>> taxes) {
            Utils.checkNotNull(taxes, "taxes");
            this.taxes = taxes;
            return this;
        }


        /**
         * An array of employee deductions for the pay period.
         */
        public Builder deductions(List<Deduction> deductions) {
            Utils.checkNotNull(deductions, "deductions");
            this.deductions = JsonNullable.of(deductions);
            return this;
        }

        /**
         * An array of employee deductions for the pay period.
         */
        public Builder deductions(JsonNullable<? extends List<Deduction>> deductions) {
            Utils.checkNotNull(deductions, "deductions");
            this.deductions = deductions;
            return this;
        }


        /**
         * An array of employee benefits for the pay period.
         */
        public Builder benefits(List<Benefit> benefits) {
            Utils.checkNotNull(benefits, "benefits");
            this.benefits = JsonNullable.of(benefits);
            return this;
        }

        /**
         * An array of employee benefits for the pay period.
         */
        public Builder benefits(JsonNullable<? extends List<Benefit>> benefits) {
            Utils.checkNotNull(benefits, "benefits");
            this.benefits = benefits;
            return this;
        }

        public Compensation build() {

            return new Compensation(
                employeeId, netPay, grossPay,
                taxes, deductions, benefits);
        }

    }
}
