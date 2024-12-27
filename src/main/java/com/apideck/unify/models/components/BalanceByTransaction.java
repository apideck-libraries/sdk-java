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
import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;


public class BalanceByTransaction {

    /**
     * Unique identifier for the transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transaction_id")
    private Optional<String> transactionId;

    /**
     * Date of the transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transaction_date")
    private Optional<LocalDate> transactionDate;

    /**
     * Type of the transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transaction_type")
    private Optional<? extends TransactionType> transactionType;

    /**
     * Due date of the transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("due_date")
    private Optional<LocalDate> dueDate;

    /**
     * Original amount of the transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("original_amount")
    private Optional<Double> originalAmount;

    /**
     * Outstanding balance of the transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("outstanding_balance")
    private Optional<Double> outstandingBalance;

    /**
     * Transaction number of the transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transaction_number")
    private Optional<String> transactionNumber;

    @JsonCreator
    public BalanceByTransaction(
            @JsonProperty("transaction_id") Optional<String> transactionId,
            @JsonProperty("transaction_date") Optional<LocalDate> transactionDate,
            @JsonProperty("transaction_type") Optional<? extends TransactionType> transactionType,
            @JsonProperty("due_date") Optional<LocalDate> dueDate,
            @JsonProperty("original_amount") Optional<Double> originalAmount,
            @JsonProperty("outstanding_balance") Optional<Double> outstandingBalance,
            @JsonProperty("transaction_number") Optional<String> transactionNumber) {
        Utils.checkNotNull(transactionId, "transactionId");
        Utils.checkNotNull(transactionDate, "transactionDate");
        Utils.checkNotNull(transactionType, "transactionType");
        Utils.checkNotNull(dueDate, "dueDate");
        Utils.checkNotNull(originalAmount, "originalAmount");
        Utils.checkNotNull(outstandingBalance, "outstandingBalance");
        Utils.checkNotNull(transactionNumber, "transactionNumber");
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.dueDate = dueDate;
        this.originalAmount = originalAmount;
        this.outstandingBalance = outstandingBalance;
        this.transactionNumber = transactionNumber;
    }
    
    public BalanceByTransaction() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Unique identifier for the transaction.
     */
    @JsonIgnore
    public Optional<String> transactionId() {
        return transactionId;
    }

    /**
     * Date of the transaction.
     */
    @JsonIgnore
    public Optional<LocalDate> transactionDate() {
        return transactionDate;
    }

    /**
     * Type of the transaction.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TransactionType> transactionType() {
        return (Optional<TransactionType>) transactionType;
    }

    /**
     * Due date of the transaction.
     */
    @JsonIgnore
    public Optional<LocalDate> dueDate() {
        return dueDate;
    }

    /**
     * Original amount of the transaction.
     */
    @JsonIgnore
    public Optional<Double> originalAmount() {
        return originalAmount;
    }

    /**
     * Outstanding balance of the transaction.
     */
    @JsonIgnore
    public Optional<Double> outstandingBalance() {
        return outstandingBalance;
    }

    /**
     * Transaction number of the transaction.
     */
    @JsonIgnore
    public Optional<String> transactionNumber() {
        return transactionNumber;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for the transaction.
     */
    public BalanceByTransaction withTransactionId(String transactionId) {
        Utils.checkNotNull(transactionId, "transactionId");
        this.transactionId = Optional.ofNullable(transactionId);
        return this;
    }

    /**
     * Unique identifier for the transaction.
     */
    public BalanceByTransaction withTransactionId(Optional<String> transactionId) {
        Utils.checkNotNull(transactionId, "transactionId");
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Date of the transaction.
     */
    public BalanceByTransaction withTransactionDate(LocalDate transactionDate) {
        Utils.checkNotNull(transactionDate, "transactionDate");
        this.transactionDate = Optional.ofNullable(transactionDate);
        return this;
    }

    /**
     * Date of the transaction.
     */
    public BalanceByTransaction withTransactionDate(Optional<LocalDate> transactionDate) {
        Utils.checkNotNull(transactionDate, "transactionDate");
        this.transactionDate = transactionDate;
        return this;
    }

    /**
     * Type of the transaction.
     */
    public BalanceByTransaction withTransactionType(TransactionType transactionType) {
        Utils.checkNotNull(transactionType, "transactionType");
        this.transactionType = Optional.ofNullable(transactionType);
        return this;
    }

    /**
     * Type of the transaction.
     */
    public BalanceByTransaction withTransactionType(Optional<? extends TransactionType> transactionType) {
        Utils.checkNotNull(transactionType, "transactionType");
        this.transactionType = transactionType;
        return this;
    }

    /**
     * Due date of the transaction.
     */
    public BalanceByTransaction withDueDate(LocalDate dueDate) {
        Utils.checkNotNull(dueDate, "dueDate");
        this.dueDate = Optional.ofNullable(dueDate);
        return this;
    }

    /**
     * Due date of the transaction.
     */
    public BalanceByTransaction withDueDate(Optional<LocalDate> dueDate) {
        Utils.checkNotNull(dueDate, "dueDate");
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Original amount of the transaction.
     */
    public BalanceByTransaction withOriginalAmount(double originalAmount) {
        Utils.checkNotNull(originalAmount, "originalAmount");
        this.originalAmount = Optional.ofNullable(originalAmount);
        return this;
    }

    /**
     * Original amount of the transaction.
     */
    public BalanceByTransaction withOriginalAmount(Optional<Double> originalAmount) {
        Utils.checkNotNull(originalAmount, "originalAmount");
        this.originalAmount = originalAmount;
        return this;
    }

    /**
     * Outstanding balance of the transaction.
     */
    public BalanceByTransaction withOutstandingBalance(double outstandingBalance) {
        Utils.checkNotNull(outstandingBalance, "outstandingBalance");
        this.outstandingBalance = Optional.ofNullable(outstandingBalance);
        return this;
    }

    /**
     * Outstanding balance of the transaction.
     */
    public BalanceByTransaction withOutstandingBalance(Optional<Double> outstandingBalance) {
        Utils.checkNotNull(outstandingBalance, "outstandingBalance");
        this.outstandingBalance = outstandingBalance;
        return this;
    }

    /**
     * Transaction number of the transaction.
     */
    public BalanceByTransaction withTransactionNumber(String transactionNumber) {
        Utils.checkNotNull(transactionNumber, "transactionNumber");
        this.transactionNumber = Optional.ofNullable(transactionNumber);
        return this;
    }

    /**
     * Transaction number of the transaction.
     */
    public BalanceByTransaction withTransactionNumber(Optional<String> transactionNumber) {
        Utils.checkNotNull(transactionNumber, "transactionNumber");
        this.transactionNumber = transactionNumber;
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
        BalanceByTransaction other = (BalanceByTransaction) o;
        return 
            Objects.deepEquals(this.transactionId, other.transactionId) &&
            Objects.deepEquals(this.transactionDate, other.transactionDate) &&
            Objects.deepEquals(this.transactionType, other.transactionType) &&
            Objects.deepEquals(this.dueDate, other.dueDate) &&
            Objects.deepEquals(this.originalAmount, other.originalAmount) &&
            Objects.deepEquals(this.outstandingBalance, other.outstandingBalance) &&
            Objects.deepEquals(this.transactionNumber, other.transactionNumber);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            transactionId,
            transactionDate,
            transactionType,
            dueDate,
            originalAmount,
            outstandingBalance,
            transactionNumber);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BalanceByTransaction.class,
                "transactionId", transactionId,
                "transactionDate", transactionDate,
                "transactionType", transactionType,
                "dueDate", dueDate,
                "originalAmount", originalAmount,
                "outstandingBalance", outstandingBalance,
                "transactionNumber", transactionNumber);
    }
    
    public final static class Builder {
 
        private Optional<String> transactionId = Optional.empty();
 
        private Optional<LocalDate> transactionDate = Optional.empty();
 
        private Optional<? extends TransactionType> transactionType = Optional.empty();
 
        private Optional<LocalDate> dueDate = Optional.empty();
 
        private Optional<Double> originalAmount = Optional.empty();
 
        private Optional<Double> outstandingBalance = Optional.empty();
 
        private Optional<String> transactionNumber = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for the transaction.
         */
        public Builder transactionId(String transactionId) {
            Utils.checkNotNull(transactionId, "transactionId");
            this.transactionId = Optional.ofNullable(transactionId);
            return this;
        }

        /**
         * Unique identifier for the transaction.
         */
        public Builder transactionId(Optional<String> transactionId) {
            Utils.checkNotNull(transactionId, "transactionId");
            this.transactionId = transactionId;
            return this;
        }

        /**
         * Date of the transaction.
         */
        public Builder transactionDate(LocalDate transactionDate) {
            Utils.checkNotNull(transactionDate, "transactionDate");
            this.transactionDate = Optional.ofNullable(transactionDate);
            return this;
        }

        /**
         * Date of the transaction.
         */
        public Builder transactionDate(Optional<LocalDate> transactionDate) {
            Utils.checkNotNull(transactionDate, "transactionDate");
            this.transactionDate = transactionDate;
            return this;
        }

        /**
         * Type of the transaction.
         */
        public Builder transactionType(TransactionType transactionType) {
            Utils.checkNotNull(transactionType, "transactionType");
            this.transactionType = Optional.ofNullable(transactionType);
            return this;
        }

        /**
         * Type of the transaction.
         */
        public Builder transactionType(Optional<? extends TransactionType> transactionType) {
            Utils.checkNotNull(transactionType, "transactionType");
            this.transactionType = transactionType;
            return this;
        }

        /**
         * Due date of the transaction.
         */
        public Builder dueDate(LocalDate dueDate) {
            Utils.checkNotNull(dueDate, "dueDate");
            this.dueDate = Optional.ofNullable(dueDate);
            return this;
        }

        /**
         * Due date of the transaction.
         */
        public Builder dueDate(Optional<LocalDate> dueDate) {
            Utils.checkNotNull(dueDate, "dueDate");
            this.dueDate = dueDate;
            return this;
        }

        /**
         * Original amount of the transaction.
         */
        public Builder originalAmount(double originalAmount) {
            Utils.checkNotNull(originalAmount, "originalAmount");
            this.originalAmount = Optional.ofNullable(originalAmount);
            return this;
        }

        /**
         * Original amount of the transaction.
         */
        public Builder originalAmount(Optional<Double> originalAmount) {
            Utils.checkNotNull(originalAmount, "originalAmount");
            this.originalAmount = originalAmount;
            return this;
        }

        /**
         * Outstanding balance of the transaction.
         */
        public Builder outstandingBalance(double outstandingBalance) {
            Utils.checkNotNull(outstandingBalance, "outstandingBalance");
            this.outstandingBalance = Optional.ofNullable(outstandingBalance);
            return this;
        }

        /**
         * Outstanding balance of the transaction.
         */
        public Builder outstandingBalance(Optional<Double> outstandingBalance) {
            Utils.checkNotNull(outstandingBalance, "outstandingBalance");
            this.outstandingBalance = outstandingBalance;
            return this;
        }

        /**
         * Transaction number of the transaction.
         */
        public Builder transactionNumber(String transactionNumber) {
            Utils.checkNotNull(transactionNumber, "transactionNumber");
            this.transactionNumber = Optional.ofNullable(transactionNumber);
            return this;
        }

        /**
         * Transaction number of the transaction.
         */
        public Builder transactionNumber(Optional<String> transactionNumber) {
            Utils.checkNotNull(transactionNumber, "transactionNumber");
            this.transactionNumber = transactionNumber;
            return this;
        }
        
        public BalanceByTransaction build() {
            return new BalanceByTransaction(
                transactionId,
                transactionDate,
                transactionType,
                dueDate,
                originalAmount,
                outstandingBalance,
                transactionNumber);
        }
    }
}

