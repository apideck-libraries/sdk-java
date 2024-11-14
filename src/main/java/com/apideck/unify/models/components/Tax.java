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
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class Tax {

    /**
     * The name of the tax.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * Paid by employer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employer")
    private JsonNullable<Boolean> employer;

    /**
     * The amount of the tax.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private JsonNullable<Double> amount;

    @JsonCreator
    public Tax(
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("employer") JsonNullable<Boolean> employer,
            @JsonProperty("amount") JsonNullable<Double> amount) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(employer, "employer");
        Utils.checkNotNull(amount, "amount");
        this.name = name;
        this.employer = employer;
        this.amount = amount;
    }
    
    public Tax() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The name of the tax.
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * Paid by employer.
     */
    @JsonIgnore
    public JsonNullable<Boolean> employer() {
        return employer;
    }

    /**
     * The amount of the tax.
     */
    @JsonIgnore
    public JsonNullable<Double> amount() {
        return amount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the tax.
     */
    public Tax withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The name of the tax.
     */
    public Tax withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Paid by employer.
     */
    public Tax withEmployer(boolean employer) {
        Utils.checkNotNull(employer, "employer");
        this.employer = JsonNullable.of(employer);
        return this;
    }

    /**
     * Paid by employer.
     */
    public Tax withEmployer(JsonNullable<Boolean> employer) {
        Utils.checkNotNull(employer, "employer");
        this.employer = employer;
        return this;
    }

    /**
     * The amount of the tax.
     */
    public Tax withAmount(double amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = JsonNullable.of(amount);
        return this;
    }

    /**
     * The amount of the tax.
     */
    public Tax withAmount(JsonNullable<Double> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
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
        Tax other = (Tax) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.employer, other.employer) &&
            Objects.deepEquals(this.amount, other.amount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            employer,
            amount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Tax.class,
                "name", name,
                "employer", employer,
                "amount", amount);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<Boolean> employer = JsonNullable.undefined();
 
        private JsonNullable<Double> amount = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name of the tax.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * The name of the tax.
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Paid by employer.
         */
        public Builder employer(boolean employer) {
            Utils.checkNotNull(employer, "employer");
            this.employer = JsonNullable.of(employer);
            return this;
        }

        /**
         * Paid by employer.
         */
        public Builder employer(JsonNullable<Boolean> employer) {
            Utils.checkNotNull(employer, "employer");
            this.employer = employer;
            return this;
        }

        /**
         * The amount of the tax.
         */
        public Builder amount(double amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = JsonNullable.of(amount);
            return this;
        }

        /**
         * The amount of the tax.
         */
        public Builder amount(JsonNullable<Double> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }
        
        public Tax build() {
            return new Tax(
                name,
                employer,
                amount);
        }
    }
}
