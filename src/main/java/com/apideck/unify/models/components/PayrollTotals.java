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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * PayrollTotals
 * 
 * <p>The overview of the payroll totals.
 */
public class PayrollTotals {
    /**
     * The total company debit for the payroll.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_debit")
    private JsonNullable<Double> companyDebit;

    /**
     * The total tax debit for the payroll.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tax_debit")
    private JsonNullable<Double> taxDebit;

    /**
     * The total check amount for the payroll.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("check_amount")
    private JsonNullable<Double> checkAmount;

    /**
     * The net pay amount for the payroll.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("net_pay")
    private JsonNullable<Double> netPay;

    /**
     * The gross pay amount for the payroll.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("gross_pay")
    private JsonNullable<Double> grossPay;

    /**
     * The total amount of employer paid taxes for the payroll.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employer_taxes")
    private JsonNullable<Double> employerTaxes;

    /**
     * The total amount of employee paid taxes for the payroll.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee_taxes")
    private JsonNullable<Double> employeeTaxes;

    /**
     * The total amount of company contributed benefits for the payroll.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employer_benefit_contributions")
    private JsonNullable<Double> employerBenefitContributions;

    /**
     * The total amount of employee deducted benefits for the payroll.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee_benefit_deductions")
    private JsonNullable<Double> employeeBenefitDeductions;

    @JsonCreator
    public PayrollTotals(
            @JsonProperty("company_debit") JsonNullable<Double> companyDebit,
            @JsonProperty("tax_debit") JsonNullable<Double> taxDebit,
            @JsonProperty("check_amount") JsonNullable<Double> checkAmount,
            @JsonProperty("net_pay") JsonNullable<Double> netPay,
            @JsonProperty("gross_pay") JsonNullable<Double> grossPay,
            @JsonProperty("employer_taxes") JsonNullable<Double> employerTaxes,
            @JsonProperty("employee_taxes") JsonNullable<Double> employeeTaxes,
            @JsonProperty("employer_benefit_contributions") JsonNullable<Double> employerBenefitContributions,
            @JsonProperty("employee_benefit_deductions") JsonNullable<Double> employeeBenefitDeductions) {
        Utils.checkNotNull(companyDebit, "companyDebit");
        Utils.checkNotNull(taxDebit, "taxDebit");
        Utils.checkNotNull(checkAmount, "checkAmount");
        Utils.checkNotNull(netPay, "netPay");
        Utils.checkNotNull(grossPay, "grossPay");
        Utils.checkNotNull(employerTaxes, "employerTaxes");
        Utils.checkNotNull(employeeTaxes, "employeeTaxes");
        Utils.checkNotNull(employerBenefitContributions, "employerBenefitContributions");
        Utils.checkNotNull(employeeBenefitDeductions, "employeeBenefitDeductions");
        this.companyDebit = companyDebit;
        this.taxDebit = taxDebit;
        this.checkAmount = checkAmount;
        this.netPay = netPay;
        this.grossPay = grossPay;
        this.employerTaxes = employerTaxes;
        this.employeeTaxes = employeeTaxes;
        this.employerBenefitContributions = employerBenefitContributions;
        this.employeeBenefitDeductions = employeeBenefitDeductions;
    }
    
    public PayrollTotals() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The total company debit for the payroll.
     */
    @JsonIgnore
    public JsonNullable<Double> companyDebit() {
        return companyDebit;
    }

    /**
     * The total tax debit for the payroll.
     */
    @JsonIgnore
    public JsonNullable<Double> taxDebit() {
        return taxDebit;
    }

    /**
     * The total check amount for the payroll.
     */
    @JsonIgnore
    public JsonNullable<Double> checkAmount() {
        return checkAmount;
    }

    /**
     * The net pay amount for the payroll.
     */
    @JsonIgnore
    public JsonNullable<Double> netPay() {
        return netPay;
    }

    /**
     * The gross pay amount for the payroll.
     */
    @JsonIgnore
    public JsonNullable<Double> grossPay() {
        return grossPay;
    }

    /**
     * The total amount of employer paid taxes for the payroll.
     */
    @JsonIgnore
    public JsonNullable<Double> employerTaxes() {
        return employerTaxes;
    }

    /**
     * The total amount of employee paid taxes for the payroll.
     */
    @JsonIgnore
    public JsonNullable<Double> employeeTaxes() {
        return employeeTaxes;
    }

    /**
     * The total amount of company contributed benefits for the payroll.
     */
    @JsonIgnore
    public JsonNullable<Double> employerBenefitContributions() {
        return employerBenefitContributions;
    }

    /**
     * The total amount of employee deducted benefits for the payroll.
     */
    @JsonIgnore
    public JsonNullable<Double> employeeBenefitDeductions() {
        return employeeBenefitDeductions;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The total company debit for the payroll.
     */
    public PayrollTotals withCompanyDebit(double companyDebit) {
        Utils.checkNotNull(companyDebit, "companyDebit");
        this.companyDebit = JsonNullable.of(companyDebit);
        return this;
    }

    /**
     * The total company debit for the payroll.
     */
    public PayrollTotals withCompanyDebit(JsonNullable<Double> companyDebit) {
        Utils.checkNotNull(companyDebit, "companyDebit");
        this.companyDebit = companyDebit;
        return this;
    }

    /**
     * The total tax debit for the payroll.
     */
    public PayrollTotals withTaxDebit(double taxDebit) {
        Utils.checkNotNull(taxDebit, "taxDebit");
        this.taxDebit = JsonNullable.of(taxDebit);
        return this;
    }

    /**
     * The total tax debit for the payroll.
     */
    public PayrollTotals withTaxDebit(JsonNullable<Double> taxDebit) {
        Utils.checkNotNull(taxDebit, "taxDebit");
        this.taxDebit = taxDebit;
        return this;
    }

    /**
     * The total check amount for the payroll.
     */
    public PayrollTotals withCheckAmount(double checkAmount) {
        Utils.checkNotNull(checkAmount, "checkAmount");
        this.checkAmount = JsonNullable.of(checkAmount);
        return this;
    }

    /**
     * The total check amount for the payroll.
     */
    public PayrollTotals withCheckAmount(JsonNullable<Double> checkAmount) {
        Utils.checkNotNull(checkAmount, "checkAmount");
        this.checkAmount = checkAmount;
        return this;
    }

    /**
     * The net pay amount for the payroll.
     */
    public PayrollTotals withNetPay(double netPay) {
        Utils.checkNotNull(netPay, "netPay");
        this.netPay = JsonNullable.of(netPay);
        return this;
    }

    /**
     * The net pay amount for the payroll.
     */
    public PayrollTotals withNetPay(JsonNullable<Double> netPay) {
        Utils.checkNotNull(netPay, "netPay");
        this.netPay = netPay;
        return this;
    }

    /**
     * The gross pay amount for the payroll.
     */
    public PayrollTotals withGrossPay(double grossPay) {
        Utils.checkNotNull(grossPay, "grossPay");
        this.grossPay = JsonNullable.of(grossPay);
        return this;
    }

    /**
     * The gross pay amount for the payroll.
     */
    public PayrollTotals withGrossPay(JsonNullable<Double> grossPay) {
        Utils.checkNotNull(grossPay, "grossPay");
        this.grossPay = grossPay;
        return this;
    }

    /**
     * The total amount of employer paid taxes for the payroll.
     */
    public PayrollTotals withEmployerTaxes(double employerTaxes) {
        Utils.checkNotNull(employerTaxes, "employerTaxes");
        this.employerTaxes = JsonNullable.of(employerTaxes);
        return this;
    }

    /**
     * The total amount of employer paid taxes for the payroll.
     */
    public PayrollTotals withEmployerTaxes(JsonNullable<Double> employerTaxes) {
        Utils.checkNotNull(employerTaxes, "employerTaxes");
        this.employerTaxes = employerTaxes;
        return this;
    }

    /**
     * The total amount of employee paid taxes for the payroll.
     */
    public PayrollTotals withEmployeeTaxes(double employeeTaxes) {
        Utils.checkNotNull(employeeTaxes, "employeeTaxes");
        this.employeeTaxes = JsonNullable.of(employeeTaxes);
        return this;
    }

    /**
     * The total amount of employee paid taxes for the payroll.
     */
    public PayrollTotals withEmployeeTaxes(JsonNullable<Double> employeeTaxes) {
        Utils.checkNotNull(employeeTaxes, "employeeTaxes");
        this.employeeTaxes = employeeTaxes;
        return this;
    }

    /**
     * The total amount of company contributed benefits for the payroll.
     */
    public PayrollTotals withEmployerBenefitContributions(double employerBenefitContributions) {
        Utils.checkNotNull(employerBenefitContributions, "employerBenefitContributions");
        this.employerBenefitContributions = JsonNullable.of(employerBenefitContributions);
        return this;
    }

    /**
     * The total amount of company contributed benefits for the payroll.
     */
    public PayrollTotals withEmployerBenefitContributions(JsonNullable<Double> employerBenefitContributions) {
        Utils.checkNotNull(employerBenefitContributions, "employerBenefitContributions");
        this.employerBenefitContributions = employerBenefitContributions;
        return this;
    }

    /**
     * The total amount of employee deducted benefits for the payroll.
     */
    public PayrollTotals withEmployeeBenefitDeductions(double employeeBenefitDeductions) {
        Utils.checkNotNull(employeeBenefitDeductions, "employeeBenefitDeductions");
        this.employeeBenefitDeductions = JsonNullable.of(employeeBenefitDeductions);
        return this;
    }

    /**
     * The total amount of employee deducted benefits for the payroll.
     */
    public PayrollTotals withEmployeeBenefitDeductions(JsonNullable<Double> employeeBenefitDeductions) {
        Utils.checkNotNull(employeeBenefitDeductions, "employeeBenefitDeductions");
        this.employeeBenefitDeductions = employeeBenefitDeductions;
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
        PayrollTotals other = (PayrollTotals) o;
        return 
            Utils.enhancedDeepEquals(this.companyDebit, other.companyDebit) &&
            Utils.enhancedDeepEquals(this.taxDebit, other.taxDebit) &&
            Utils.enhancedDeepEquals(this.checkAmount, other.checkAmount) &&
            Utils.enhancedDeepEquals(this.netPay, other.netPay) &&
            Utils.enhancedDeepEquals(this.grossPay, other.grossPay) &&
            Utils.enhancedDeepEquals(this.employerTaxes, other.employerTaxes) &&
            Utils.enhancedDeepEquals(this.employeeTaxes, other.employeeTaxes) &&
            Utils.enhancedDeepEquals(this.employerBenefitContributions, other.employerBenefitContributions) &&
            Utils.enhancedDeepEquals(this.employeeBenefitDeductions, other.employeeBenefitDeductions);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            companyDebit, taxDebit, checkAmount,
            netPay, grossPay, employerTaxes,
            employeeTaxes, employerBenefitContributions, employeeBenefitDeductions);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PayrollTotals.class,
                "companyDebit", companyDebit,
                "taxDebit", taxDebit,
                "checkAmount", checkAmount,
                "netPay", netPay,
                "grossPay", grossPay,
                "employerTaxes", employerTaxes,
                "employeeTaxes", employeeTaxes,
                "employerBenefitContributions", employerBenefitContributions,
                "employeeBenefitDeductions", employeeBenefitDeductions);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<Double> companyDebit = JsonNullable.undefined();

        private JsonNullable<Double> taxDebit = JsonNullable.undefined();

        private JsonNullable<Double> checkAmount = JsonNullable.undefined();

        private JsonNullable<Double> netPay = JsonNullable.undefined();

        private JsonNullable<Double> grossPay = JsonNullable.undefined();

        private JsonNullable<Double> employerTaxes = JsonNullable.undefined();

        private JsonNullable<Double> employeeTaxes = JsonNullable.undefined();

        private JsonNullable<Double> employerBenefitContributions = JsonNullable.undefined();

        private JsonNullable<Double> employeeBenefitDeductions = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The total company debit for the payroll.
         */
        public Builder companyDebit(double companyDebit) {
            Utils.checkNotNull(companyDebit, "companyDebit");
            this.companyDebit = JsonNullable.of(companyDebit);
            return this;
        }

        /**
         * The total company debit for the payroll.
         */
        public Builder companyDebit(JsonNullable<Double> companyDebit) {
            Utils.checkNotNull(companyDebit, "companyDebit");
            this.companyDebit = companyDebit;
            return this;
        }


        /**
         * The total tax debit for the payroll.
         */
        public Builder taxDebit(double taxDebit) {
            Utils.checkNotNull(taxDebit, "taxDebit");
            this.taxDebit = JsonNullable.of(taxDebit);
            return this;
        }

        /**
         * The total tax debit for the payroll.
         */
        public Builder taxDebit(JsonNullable<Double> taxDebit) {
            Utils.checkNotNull(taxDebit, "taxDebit");
            this.taxDebit = taxDebit;
            return this;
        }


        /**
         * The total check amount for the payroll.
         */
        public Builder checkAmount(double checkAmount) {
            Utils.checkNotNull(checkAmount, "checkAmount");
            this.checkAmount = JsonNullable.of(checkAmount);
            return this;
        }

        /**
         * The total check amount for the payroll.
         */
        public Builder checkAmount(JsonNullable<Double> checkAmount) {
            Utils.checkNotNull(checkAmount, "checkAmount");
            this.checkAmount = checkAmount;
            return this;
        }


        /**
         * The net pay amount for the payroll.
         */
        public Builder netPay(double netPay) {
            Utils.checkNotNull(netPay, "netPay");
            this.netPay = JsonNullable.of(netPay);
            return this;
        }

        /**
         * The net pay amount for the payroll.
         */
        public Builder netPay(JsonNullable<Double> netPay) {
            Utils.checkNotNull(netPay, "netPay");
            this.netPay = netPay;
            return this;
        }


        /**
         * The gross pay amount for the payroll.
         */
        public Builder grossPay(double grossPay) {
            Utils.checkNotNull(grossPay, "grossPay");
            this.grossPay = JsonNullable.of(grossPay);
            return this;
        }

        /**
         * The gross pay amount for the payroll.
         */
        public Builder grossPay(JsonNullable<Double> grossPay) {
            Utils.checkNotNull(grossPay, "grossPay");
            this.grossPay = grossPay;
            return this;
        }


        /**
         * The total amount of employer paid taxes for the payroll.
         */
        public Builder employerTaxes(double employerTaxes) {
            Utils.checkNotNull(employerTaxes, "employerTaxes");
            this.employerTaxes = JsonNullable.of(employerTaxes);
            return this;
        }

        /**
         * The total amount of employer paid taxes for the payroll.
         */
        public Builder employerTaxes(JsonNullable<Double> employerTaxes) {
            Utils.checkNotNull(employerTaxes, "employerTaxes");
            this.employerTaxes = employerTaxes;
            return this;
        }


        /**
         * The total amount of employee paid taxes for the payroll.
         */
        public Builder employeeTaxes(double employeeTaxes) {
            Utils.checkNotNull(employeeTaxes, "employeeTaxes");
            this.employeeTaxes = JsonNullable.of(employeeTaxes);
            return this;
        }

        /**
         * The total amount of employee paid taxes for the payroll.
         */
        public Builder employeeTaxes(JsonNullable<Double> employeeTaxes) {
            Utils.checkNotNull(employeeTaxes, "employeeTaxes");
            this.employeeTaxes = employeeTaxes;
            return this;
        }


        /**
         * The total amount of company contributed benefits for the payroll.
         */
        public Builder employerBenefitContributions(double employerBenefitContributions) {
            Utils.checkNotNull(employerBenefitContributions, "employerBenefitContributions");
            this.employerBenefitContributions = JsonNullable.of(employerBenefitContributions);
            return this;
        }

        /**
         * The total amount of company contributed benefits for the payroll.
         */
        public Builder employerBenefitContributions(JsonNullable<Double> employerBenefitContributions) {
            Utils.checkNotNull(employerBenefitContributions, "employerBenefitContributions");
            this.employerBenefitContributions = employerBenefitContributions;
            return this;
        }


        /**
         * The total amount of employee deducted benefits for the payroll.
         */
        public Builder employeeBenefitDeductions(double employeeBenefitDeductions) {
            Utils.checkNotNull(employeeBenefitDeductions, "employeeBenefitDeductions");
            this.employeeBenefitDeductions = JsonNullable.of(employeeBenefitDeductions);
            return this;
        }

        /**
         * The total amount of employee deducted benefits for the payroll.
         */
        public Builder employeeBenefitDeductions(JsonNullable<Double> employeeBenefitDeductions) {
            Utils.checkNotNull(employeeBenefitDeductions, "employeeBenefitDeductions");
            this.employeeBenefitDeductions = employeeBenefitDeductions;
            return this;
        }

        public PayrollTotals build() {

            return new PayrollTotals(
                companyDebit, taxDebit, checkAmount,
                netPay, grossPay, employerTaxes,
                employeeTaxes, employerBenefitContributions, employeeBenefitDeductions);
        }

    }
}
