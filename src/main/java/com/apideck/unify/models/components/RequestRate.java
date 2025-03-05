/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.apideck.unify.models.components;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
/**
 * RequestRate - The rate at which requests for resources will be made to downstream.
 */

public class RequestRate {

    /**
     * The number of requests per window unit.
     */
    @JsonProperty("rate")
    private long rate;

    /**
     * Size of request window.
     */
    @JsonProperty("size")
    private long size;

    /**
     * The window unit for the rate.
     */
    @JsonProperty("unit")
    private Unit unit;

    @JsonCreator
    public RequestRate(
            @JsonProperty("rate") long rate,
            @JsonProperty("size") long size,
            @JsonProperty("unit") Unit unit) {
        Utils.checkNotNull(rate, "rate");
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(unit, "unit");
        this.rate = rate;
        this.size = size;
        this.unit = unit;
    }

    /**
     * The number of requests per window unit.
     */
    @JsonIgnore
    public long rate() {
        return rate;
    }

    /**
     * Size of request window.
     */
    @JsonIgnore
    public long size() {
        return size;
    }

    /**
     * The window unit for the rate.
     */
    @JsonIgnore
    public Unit unit() {
        return unit;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The number of requests per window unit.
     */
    public RequestRate withRate(long rate) {
        Utils.checkNotNull(rate, "rate");
        this.rate = rate;
        return this;
    }

    /**
     * Size of request window.
     */
    public RequestRate withSize(long size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    /**
     * The window unit for the rate.
     */
    public RequestRate withUnit(Unit unit) {
        Utils.checkNotNull(unit, "unit");
        this.unit = unit;
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
        RequestRate other = (RequestRate) o;
        return 
            Objects.deepEquals(this.rate, other.rate) &&
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.unit, other.unit);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            rate,
            size,
            unit);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RequestRate.class,
                "rate", rate,
                "size", size,
                "unit", unit);
    }
    
    public final static class Builder {
 
        private Long rate;
 
        private Long size;
 
        private Unit unit;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The number of requests per window unit.
         */
        public Builder rate(long rate) {
            Utils.checkNotNull(rate, "rate");
            this.rate = rate;
            return this;
        }

        /**
         * Size of request window.
         */
        public Builder size(long size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }

        /**
         * The window unit for the rate.
         */
        public Builder unit(Unit unit) {
            Utils.checkNotNull(unit, "unit");
            this.unit = unit;
            return this;
        }
        
        public RequestRate build() {
            return new RequestRate(
                rate,
                size,
                unit);
        }
    }
}

