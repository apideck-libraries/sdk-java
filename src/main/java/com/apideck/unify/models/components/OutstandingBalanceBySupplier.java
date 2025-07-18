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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Optional;


public class OutstandingBalanceBySupplier {
    /**
     * Unique identifier for the supplier.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supplier_id")
    private Optional<String> supplierId;

    /**
     * Full name of the supplier.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supplier_name")
    private Optional<String> supplierName;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("outstanding_balances_by_currency")
    private Optional<? extends List<OutstandingBalanceByCurrency>> outstandingBalancesByCurrency;

    @JsonCreator
    public OutstandingBalanceBySupplier(
            @JsonProperty("supplier_id") Optional<String> supplierId,
            @JsonProperty("supplier_name") Optional<String> supplierName,
            @JsonProperty("outstanding_balances_by_currency") Optional<? extends List<OutstandingBalanceByCurrency>> outstandingBalancesByCurrency) {
        Utils.checkNotNull(supplierId, "supplierId");
        Utils.checkNotNull(supplierName, "supplierName");
        Utils.checkNotNull(outstandingBalancesByCurrency, "outstandingBalancesByCurrency");
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.outstandingBalancesByCurrency = outstandingBalancesByCurrency;
    }
    
    public OutstandingBalanceBySupplier() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Unique identifier for the supplier.
     */
    @JsonIgnore
    public Optional<String> supplierId() {
        return supplierId;
    }

    /**
     * Full name of the supplier.
     */
    @JsonIgnore
    public Optional<String> supplierName() {
        return supplierName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<OutstandingBalanceByCurrency>> outstandingBalancesByCurrency() {
        return (Optional<List<OutstandingBalanceByCurrency>>) outstandingBalancesByCurrency;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Unique identifier for the supplier.
     */
    public OutstandingBalanceBySupplier withSupplierId(String supplierId) {
        Utils.checkNotNull(supplierId, "supplierId");
        this.supplierId = Optional.ofNullable(supplierId);
        return this;
    }


    /**
     * Unique identifier for the supplier.
     */
    public OutstandingBalanceBySupplier withSupplierId(Optional<String> supplierId) {
        Utils.checkNotNull(supplierId, "supplierId");
        this.supplierId = supplierId;
        return this;
    }

    /**
     * Full name of the supplier.
     */
    public OutstandingBalanceBySupplier withSupplierName(String supplierName) {
        Utils.checkNotNull(supplierName, "supplierName");
        this.supplierName = Optional.ofNullable(supplierName);
        return this;
    }


    /**
     * Full name of the supplier.
     */
    public OutstandingBalanceBySupplier withSupplierName(Optional<String> supplierName) {
        Utils.checkNotNull(supplierName, "supplierName");
        this.supplierName = supplierName;
        return this;
    }

    public OutstandingBalanceBySupplier withOutstandingBalancesByCurrency(List<OutstandingBalanceByCurrency> outstandingBalancesByCurrency) {
        Utils.checkNotNull(outstandingBalancesByCurrency, "outstandingBalancesByCurrency");
        this.outstandingBalancesByCurrency = Optional.ofNullable(outstandingBalancesByCurrency);
        return this;
    }


    public OutstandingBalanceBySupplier withOutstandingBalancesByCurrency(Optional<? extends List<OutstandingBalanceByCurrency>> outstandingBalancesByCurrency) {
        Utils.checkNotNull(outstandingBalancesByCurrency, "outstandingBalancesByCurrency");
        this.outstandingBalancesByCurrency = outstandingBalancesByCurrency;
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
        OutstandingBalanceBySupplier other = (OutstandingBalanceBySupplier) o;
        return 
            Utils.enhancedDeepEquals(this.supplierId, other.supplierId) &&
            Utils.enhancedDeepEquals(this.supplierName, other.supplierName) &&
            Utils.enhancedDeepEquals(this.outstandingBalancesByCurrency, other.outstandingBalancesByCurrency);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            supplierId, supplierName, outstandingBalancesByCurrency);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OutstandingBalanceBySupplier.class,
                "supplierId", supplierId,
                "supplierName", supplierName,
                "outstandingBalancesByCurrency", outstandingBalancesByCurrency);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> supplierId = Optional.empty();

        private Optional<String> supplierName = Optional.empty();

        private Optional<? extends List<OutstandingBalanceByCurrency>> outstandingBalancesByCurrency = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Unique identifier for the supplier.
         */
        public Builder supplierId(String supplierId) {
            Utils.checkNotNull(supplierId, "supplierId");
            this.supplierId = Optional.ofNullable(supplierId);
            return this;
        }

        /**
         * Unique identifier for the supplier.
         */
        public Builder supplierId(Optional<String> supplierId) {
            Utils.checkNotNull(supplierId, "supplierId");
            this.supplierId = supplierId;
            return this;
        }


        /**
         * Full name of the supplier.
         */
        public Builder supplierName(String supplierName) {
            Utils.checkNotNull(supplierName, "supplierName");
            this.supplierName = Optional.ofNullable(supplierName);
            return this;
        }

        /**
         * Full name of the supplier.
         */
        public Builder supplierName(Optional<String> supplierName) {
            Utils.checkNotNull(supplierName, "supplierName");
            this.supplierName = supplierName;
            return this;
        }


        public Builder outstandingBalancesByCurrency(List<OutstandingBalanceByCurrency> outstandingBalancesByCurrency) {
            Utils.checkNotNull(outstandingBalancesByCurrency, "outstandingBalancesByCurrency");
            this.outstandingBalancesByCurrency = Optional.ofNullable(outstandingBalancesByCurrency);
            return this;
        }

        public Builder outstandingBalancesByCurrency(Optional<? extends List<OutstandingBalanceByCurrency>> outstandingBalancesByCurrency) {
            Utils.checkNotNull(outstandingBalancesByCurrency, "outstandingBalancesByCurrency");
            this.outstandingBalancesByCurrency = outstandingBalancesByCurrency;
            return this;
        }

        public OutstandingBalanceBySupplier build() {

            return new OutstandingBalanceBySupplier(
                supplierId, supplierName, outstandingBalancesByCurrency);
        }

    }
}
