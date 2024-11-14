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
import java.util.Objects;
import java.util.Optional;


public class NetIncome {

    /**
     * Total net income
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("total")
    private Optional<Double> total;

    @JsonProperty("records")
    private Object records;

    @JsonCreator
    public NetIncome(
            @JsonProperty("total") Optional<Double> total,
            @JsonProperty("records") Object records) {
        Utils.checkNotNull(total, "total");
        Utils.checkNotNull(records, "records");
        this.total = total;
        this.records = records;
    }
    
    public NetIncome(
            Object records) {
        this(Optional.empty(), records);
    }

    /**
     * Total net income
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
     * Total net income
     */
    public NetIncome withTotal(double total) {
        Utils.checkNotNull(total, "total");
        this.total = Optional.ofNullable(total);
        return this;
    }

    /**
     * Total net income
     */
    public NetIncome withTotal(Optional<Double> total) {
        Utils.checkNotNull(total, "total");
        this.total = total;
        return this;
    }

    public NetIncome withRecords(Object records) {
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
        NetIncome other = (NetIncome) o;
        return 
            Objects.deepEquals(this.total, other.total) &&
            Objects.deepEquals(this.records, other.records);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            total,
            records);
    }
    
    @Override
    public String toString() {
        return Utils.toString(NetIncome.class,
                "total", total,
                "records", records);
    }
    
    public final static class Builder {
 
        private Optional<Double> total = Optional.empty();
 
        private Object records;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Total net income
         */
        public Builder total(double total) {
            Utils.checkNotNull(total, "total");
            this.total = Optional.ofNullable(total);
            return this;
        }

        /**
         * Total net income
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
        
        public NetIncome build() {
            return new NetIncome(
                total,
                records);
        }
    }
}

