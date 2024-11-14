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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * BalanceSheetLiabilitiesAccount - A balance sheet liabilities account represents the financial position of a company at a specific point in time.
 */

public class BalanceSheetLiabilitiesAccount {

    /**
     * The unique identifier for the account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_id")
    private Optional<String> accountId;

    /**
     * The account code of the account
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private Optional<String> code;

    /**
     * The name of the account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * The amount or value of the item
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private Optional<Double> value;

    /**
     * A list of balance sheet accounts
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("items")
    private Optional<? extends Object> items;

    @JsonCreator
    public BalanceSheetLiabilitiesAccount(
            @JsonProperty("account_id") Optional<String> accountId,
            @JsonProperty("code") Optional<String> code,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("value") Optional<Double> value,
            @JsonProperty("items") Optional<? extends Object> items) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(items, "items");
        this.accountId = accountId;
        this.code = code;
        this.name = name;
        this.value = value;
        this.items = items;
    }
    
    public BalanceSheetLiabilitiesAccount() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The unique identifier for the account.
     */
    @JsonIgnore
    public Optional<String> accountId() {
        return accountId;
    }

    /**
     * The account code of the account
     */
    @JsonIgnore
    public Optional<String> code() {
        return code;
    }

    /**
     * The name of the account.
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * The amount or value of the item
     */
    @JsonIgnore
    public Optional<Double> value() {
        return value;
    }

    /**
     * A list of balance sheet accounts
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Object> items() {
        return (Optional<Object>) items;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The unique identifier for the account.
     */
    public BalanceSheetLiabilitiesAccount withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = Optional.ofNullable(accountId);
        return this;
    }

    /**
     * The unique identifier for the account.
     */
    public BalanceSheetLiabilitiesAccount withAccountId(Optional<String> accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    /**
     * The account code of the account
     */
    public BalanceSheetLiabilitiesAccount withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = Optional.ofNullable(code);
        return this;
    }

    /**
     * The account code of the account
     */
    public BalanceSheetLiabilitiesAccount withCode(Optional<String> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    /**
     * The name of the account.
     */
    public BalanceSheetLiabilitiesAccount withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The name of the account.
     */
    public BalanceSheetLiabilitiesAccount withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The amount or value of the item
     */
    public BalanceSheetLiabilitiesAccount withValue(double value) {
        Utils.checkNotNull(value, "value");
        this.value = Optional.ofNullable(value);
        return this;
    }

    /**
     * The amount or value of the item
     */
    public BalanceSheetLiabilitiesAccount withValue(Optional<Double> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    /**
     * A list of balance sheet accounts
     */
    public BalanceSheetLiabilitiesAccount withItems(Object items) {
        Utils.checkNotNull(items, "items");
        this.items = Optional.ofNullable(items);
        return this;
    }

    /**
     * A list of balance sheet accounts
     */
    public BalanceSheetLiabilitiesAccount withItems(Optional<? extends Object> items) {
        Utils.checkNotNull(items, "items");
        this.items = items;
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
        BalanceSheetLiabilitiesAccount other = (BalanceSheetLiabilitiesAccount) o;
        return 
            Objects.deepEquals(this.accountId, other.accountId) &&
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.value, other.value) &&
            Objects.deepEquals(this.items, other.items);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountId,
            code,
            name,
            value,
            items);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BalanceSheetLiabilitiesAccount.class,
                "accountId", accountId,
                "code", code,
                "name", name,
                "value", value,
                "items", items);
    }
    
    public final static class Builder {
 
        private Optional<String> accountId = Optional.empty();
 
        private Optional<String> code = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<Double> value = Optional.empty();
 
        private Optional<? extends Object> items = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique identifier for the account.
         */
        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = Optional.ofNullable(accountId);
            return this;
        }

        /**
         * The unique identifier for the account.
         */
        public Builder accountId(Optional<String> accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        /**
         * The account code of the account
         */
        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = Optional.ofNullable(code);
            return this;
        }

        /**
         * The account code of the account
         */
        public Builder code(Optional<String> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        /**
         * The name of the account.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * The name of the account.
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The amount or value of the item
         */
        public Builder value(double value) {
            Utils.checkNotNull(value, "value");
            this.value = Optional.ofNullable(value);
            return this;
        }

        /**
         * The amount or value of the item
         */
        public Builder value(Optional<Double> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        /**
         * A list of balance sheet accounts
         */
        public Builder items(Object items) {
            Utils.checkNotNull(items, "items");
            this.items = Optional.ofNullable(items);
            return this;
        }

        /**
         * A list of balance sheet accounts
         */
        public Builder items(Optional<? extends Object> items) {
            Utils.checkNotNull(items, "items");
            this.items = items;
            return this;
        }
        
        public BalanceSheetLiabilitiesAccount build() {
            return new BalanceSheetLiabilitiesAccount(
                accountId,
                code,
                name,
                value,
                items);
        }
    }
}

