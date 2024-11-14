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


public class LinkedTaxRate {

    /**
     * The ID of the object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<String> id;

    /**
     * Tax rate code
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private JsonNullable<String> code;

    /**
     * Name of the tax rate
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * Rate of the tax rate
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rate")
    private JsonNullable<Double> rate;

    @JsonCreator
    public LinkedTaxRate(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("code") JsonNullable<String> code,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("rate") JsonNullable<Double> rate) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(rate, "rate");
        this.id = id;
        this.code = code;
        this.name = name;
        this.rate = rate;
    }
    
    public LinkedTaxRate() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The ID of the object.
     */
    @JsonIgnore
    public JsonNullable<String> id() {
        return id;
    }

    /**
     * Tax rate code
     */
    @JsonIgnore
    public JsonNullable<String> code() {
        return code;
    }

    /**
     * Name of the tax rate
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * Rate of the tax rate
     */
    @JsonIgnore
    public JsonNullable<Double> rate() {
        return rate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the object.
     */
    public LinkedTaxRate withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * The ID of the object.
     */
    public LinkedTaxRate withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Tax rate code
     */
    public LinkedTaxRate withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = JsonNullable.of(code);
        return this;
    }

    /**
     * Tax rate code
     */
    public LinkedTaxRate withCode(JsonNullable<String> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    /**
     * Name of the tax rate
     */
    public LinkedTaxRate withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Name of the tax rate
     */
    public LinkedTaxRate withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Rate of the tax rate
     */
    public LinkedTaxRate withRate(double rate) {
        Utils.checkNotNull(rate, "rate");
        this.rate = JsonNullable.of(rate);
        return this;
    }

    /**
     * Rate of the tax rate
     */
    public LinkedTaxRate withRate(JsonNullable<Double> rate) {
        Utils.checkNotNull(rate, "rate");
        this.rate = rate;
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
        LinkedTaxRate other = (LinkedTaxRate) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.rate, other.rate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            code,
            name,
            rate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LinkedTaxRate.class,
                "id", id,
                "code", code,
                "name", name,
                "rate", rate);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private JsonNullable<String> code = JsonNullable.undefined();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<Double> rate = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the object.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * The ID of the object.
         */
        public Builder id(JsonNullable<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Tax rate code
         */
        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = JsonNullable.of(code);
            return this;
        }

        /**
         * Tax rate code
         */
        public Builder code(JsonNullable<String> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        /**
         * Name of the tax rate
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * Name of the tax rate
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Rate of the tax rate
         */
        public Builder rate(double rate) {
            Utils.checkNotNull(rate, "rate");
            this.rate = JsonNullable.of(rate);
            return this;
        }

        /**
         * Rate of the tax rate
         */
        public Builder rate(JsonNullable<Double> rate) {
            Utils.checkNotNull(rate, "rate");
            this.rate = rate;
            return this;
        }
        
        public LinkedTaxRate build() {
            return new LinkedTaxRate(
                id,
                code,
                name,
                rate);
        }
    }
}
