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
import java.util.Objects;
import java.util.Optional;

public class OutstandingBalanceByCustomer {

    /**
     * Unique identifier for the customer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_id")
    private Optional<String> customerId;

    /**
     * Full name of the customer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_name")
    private Optional<String> customerName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("outstanding_balances_by_currency")
    private Optional<? extends List<OutstandingBalanceByCurrency>> outstandingBalancesByCurrency;

    @JsonCreator
    public OutstandingBalanceByCustomer(
            @JsonProperty("customer_id") Optional<String> customerId,
            @JsonProperty("customer_name") Optional<String> customerName,
            @JsonProperty("outstanding_balances_by_currency") Optional<? extends List<OutstandingBalanceByCurrency>> outstandingBalancesByCurrency) {
        Utils.checkNotNull(customerId, "customerId");
        Utils.checkNotNull(customerName, "customerName");
        Utils.checkNotNull(outstandingBalancesByCurrency, "outstandingBalancesByCurrency");
        this.customerId = customerId;
        this.customerName = customerName;
        this.outstandingBalancesByCurrency = outstandingBalancesByCurrency;
    }
    
    public OutstandingBalanceByCustomer() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Unique identifier for the customer.
     */
    @JsonIgnore
    public Optional<String> customerId() {
        return customerId;
    }

    /**
     * Full name of the customer.
     */
    @JsonIgnore
    public Optional<String> customerName() {
        return customerName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<OutstandingBalanceByCurrency>> outstandingBalancesByCurrency() {
        return (Optional<List<OutstandingBalanceByCurrency>>) outstandingBalancesByCurrency;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for the customer.
     */
    public OutstandingBalanceByCustomer withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = Optional.ofNullable(customerId);
        return this;
    }

    /**
     * Unique identifier for the customer.
     */
    public OutstandingBalanceByCustomer withCustomerId(Optional<String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }

    /**
     * Full name of the customer.
     */
    public OutstandingBalanceByCustomer withCustomerName(String customerName) {
        Utils.checkNotNull(customerName, "customerName");
        this.customerName = Optional.ofNullable(customerName);
        return this;
    }

    /**
     * Full name of the customer.
     */
    public OutstandingBalanceByCustomer withCustomerName(Optional<String> customerName) {
        Utils.checkNotNull(customerName, "customerName");
        this.customerName = customerName;
        return this;
    }

    public OutstandingBalanceByCustomer withOutstandingBalancesByCurrency(List<OutstandingBalanceByCurrency> outstandingBalancesByCurrency) {
        Utils.checkNotNull(outstandingBalancesByCurrency, "outstandingBalancesByCurrency");
        this.outstandingBalancesByCurrency = Optional.ofNullable(outstandingBalancesByCurrency);
        return this;
    }

    public OutstandingBalanceByCustomer withOutstandingBalancesByCurrency(Optional<? extends List<OutstandingBalanceByCurrency>> outstandingBalancesByCurrency) {
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
        OutstandingBalanceByCustomer other = (OutstandingBalanceByCustomer) o;
        return 
            Objects.deepEquals(this.customerId, other.customerId) &&
            Objects.deepEquals(this.customerName, other.customerName) &&
            Objects.deepEquals(this.outstandingBalancesByCurrency, other.outstandingBalancesByCurrency);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            customerId,
            customerName,
            outstandingBalancesByCurrency);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OutstandingBalanceByCustomer.class,
                "customerId", customerId,
                "customerName", customerName,
                "outstandingBalancesByCurrency", outstandingBalancesByCurrency);
    }
    
    public final static class Builder {
 
        private Optional<String> customerId = Optional.empty();
 
        private Optional<String> customerName = Optional.empty();
 
        private Optional<? extends List<OutstandingBalanceByCurrency>> outstandingBalancesByCurrency = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for the customer.
         */
        public Builder customerId(String customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = Optional.ofNullable(customerId);
            return this;
        }

        /**
         * Unique identifier for the customer.
         */
        public Builder customerId(Optional<String> customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = customerId;
            return this;
        }

        /**
         * Full name of the customer.
         */
        public Builder customerName(String customerName) {
            Utils.checkNotNull(customerName, "customerName");
            this.customerName = Optional.ofNullable(customerName);
            return this;
        }

        /**
         * Full name of the customer.
         */
        public Builder customerName(Optional<String> customerName) {
            Utils.checkNotNull(customerName, "customerName");
            this.customerName = customerName;
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
        
        public OutstandingBalanceByCustomer build() {
            return new OutstandingBalanceByCustomer(
                customerId,
                customerName,
                outstandingBalancesByCurrency);
        }
    }
}

