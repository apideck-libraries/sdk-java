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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * UncategorizedAccounts
 * 
 * <p>The accounts not categorized in the other sections
 */
public class UncategorizedAccounts {

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

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
    @JsonProperty("title")
    private Optional<String> title;

    /**
     * The type of profit and loss
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private JsonNullable<? extends ProfitAndLossType> type;

    /**
     * The aggregated total of all accounts within this category.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("total")
    private Optional<Double> total;

    @JsonProperty("records")
    private Object records;

    @JsonCreator
    public UncategorizedAccounts(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("code") Optional<String> code,
            @JsonProperty("title") Optional<String> title,
            @JsonProperty("type") JsonNullable<? extends ProfitAndLossType> type,
            @JsonProperty("total") Optional<Double> total,
            @JsonProperty("records") Object records) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(total, "total");
        Utils.checkNotNull(records, "records");
        this.id = id;
        this.code = code;
        this.title = title;
        this.type = type;
        this.total = total;
        this.records = records;
    }
    
    public UncategorizedAccounts(
            Object records) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), records);
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
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
    public Optional<String> title() {
        return title;
    }

    /**
     * The type of profit and loss
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<ProfitAndLossType> type() {
        return (JsonNullable<ProfitAndLossType>) type;
    }

    /**
     * The aggregated total of all accounts within this category.
     */
    @JsonIgnore
    public Optional<Double> total() {
        return total;
    }

    @JsonIgnore
    public Object records() {
        return records;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * A unique identifier for an object.
     */
    public UncategorizedAccounts withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public UncategorizedAccounts withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The account code of the account
     */
    public UncategorizedAccounts withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = Optional.ofNullable(code);
        return this;
    }

    /**
     * The account code of the account
     */
    public UncategorizedAccounts withCode(Optional<String> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    /**
     * The name of the account.
     */
    public UncategorizedAccounts withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    /**
     * The name of the account.
     */
    public UncategorizedAccounts withTitle(Optional<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    /**
     * The type of profit and loss
     */
    public UncategorizedAccounts withType(ProfitAndLossType type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * The type of profit and loss
     */
    public UncategorizedAccounts withType(JsonNullable<? extends ProfitAndLossType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The aggregated total of all accounts within this category.
     */
    public UncategorizedAccounts withTotal(double total) {
        Utils.checkNotNull(total, "total");
        this.total = Optional.ofNullable(total);
        return this;
    }

    /**
     * The aggregated total of all accounts within this category.
     */
    public UncategorizedAccounts withTotal(Optional<Double> total) {
        Utils.checkNotNull(total, "total");
        this.total = total;
        return this;
    }

    public UncategorizedAccounts withRecords(Object records) {
        Utils.checkNotNull(records, "records");
        this.records = records;
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
        UncategorizedAccounts other = (UncategorizedAccounts) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.total, other.total) &&
            Objects.deepEquals(this.records, other.records);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            code,
            title,
            type,
            total,
            records);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UncategorizedAccounts.class,
                "id", id,
                "code", code,
                "title", title,
                "type", type,
                "total", total,
                "records", records);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> code = Optional.empty();
 
        private Optional<String> title = Optional.empty();
 
        private JsonNullable<? extends ProfitAndLossType> type = JsonNullable.undefined();
 
        private Optional<Double> total = Optional.empty();
 
        private Object records;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A unique identifier for an object.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
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
        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        /**
         * The name of the account.
         */
        public Builder title(Optional<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        /**
         * The type of profit and loss
         */
        public Builder type(ProfitAndLossType type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        /**
         * The type of profit and loss
         */
        public Builder type(JsonNullable<? extends ProfitAndLossType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The aggregated total of all accounts within this category.
         */
        public Builder total(double total) {
            Utils.checkNotNull(total, "total");
            this.total = Optional.ofNullable(total);
            return this;
        }

        /**
         * The aggregated total of all accounts within this category.
         */
        public Builder total(Optional<Double> total) {
            Utils.checkNotNull(total, "total");
            this.total = total;
            return this;
        }

        public Builder records(Object records) {
            Utils.checkNotNull(records, "records");
            this.records = records;
            return this;
        }
        
        public UncategorizedAccounts build() {
            return new UncategorizedAccounts(
                id,
                code,
                title,
                type,
                total,
                records);
        }
    }
}
