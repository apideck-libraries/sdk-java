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
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class Addresses {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends EcommerceCustomerType> type;

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<String> id;

    /**
     * First line of the street address of the customer
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("line1")
    private JsonNullable<String> line1;

    /**
     * Second line of the street address of the customer
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("line2")
    private JsonNullable<String> line2;

    /**
     * City of the customer
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    private JsonNullable<String> city;

    /**
     * State of the customer
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    private JsonNullable<String> state;

    /**
     * Postal code of the customer
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postal_code")
    private JsonNullable<String> postalCode;

    /**
     * Country of the customer
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    private JsonNullable<String> country;

    @JsonCreator
    public Addresses(
            @JsonProperty("type") Optional<? extends EcommerceCustomerType> type,
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("line1") JsonNullable<String> line1,
            @JsonProperty("line2") JsonNullable<String> line2,
            @JsonProperty("city") JsonNullable<String> city,
            @JsonProperty("state") JsonNullable<String> state,
            @JsonProperty("postal_code") JsonNullable<String> postalCode,
            @JsonProperty("country") JsonNullable<String> country) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(line1, "line1");
        Utils.checkNotNull(line2, "line2");
        Utils.checkNotNull(city, "city");
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(postalCode, "postalCode");
        Utils.checkNotNull(country, "country");
        this.type = type;
        this.id = id;
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }
    
    public Addresses() {
        this(Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<EcommerceCustomerType> type() {
        return (Optional<EcommerceCustomerType>) type;
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public JsonNullable<String> id() {
        return id;
    }

    /**
     * First line of the street address of the customer
     */
    @JsonIgnore
    public JsonNullable<String> line1() {
        return line1;
    }

    /**
     * Second line of the street address of the customer
     */
    @JsonIgnore
    public JsonNullable<String> line2() {
        return line2;
    }

    /**
     * City of the customer
     */
    @JsonIgnore
    public JsonNullable<String> city() {
        return city;
    }

    /**
     * State of the customer
     */
    @JsonIgnore
    public JsonNullable<String> state() {
        return state;
    }

    /**
     * Postal code of the customer
     */
    @JsonIgnore
    public JsonNullable<String> postalCode() {
        return postalCode;
    }

    /**
     * Country of the customer
     */
    @JsonIgnore
    public JsonNullable<String> country() {
        return country;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Addresses withType(EcommerceCustomerType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public Addresses withType(Optional<? extends EcommerceCustomerType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Addresses withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Addresses withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * First line of the street address of the customer
     */
    public Addresses withLine1(String line1) {
        Utils.checkNotNull(line1, "line1");
        this.line1 = JsonNullable.of(line1);
        return this;
    }

    /**
     * First line of the street address of the customer
     */
    public Addresses withLine1(JsonNullable<String> line1) {
        Utils.checkNotNull(line1, "line1");
        this.line1 = line1;
        return this;
    }

    /**
     * Second line of the street address of the customer
     */
    public Addresses withLine2(String line2) {
        Utils.checkNotNull(line2, "line2");
        this.line2 = JsonNullable.of(line2);
        return this;
    }

    /**
     * Second line of the street address of the customer
     */
    public Addresses withLine2(JsonNullable<String> line2) {
        Utils.checkNotNull(line2, "line2");
        this.line2 = line2;
        return this;
    }

    /**
     * City of the customer
     */
    public Addresses withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = JsonNullable.of(city);
        return this;
    }

    /**
     * City of the customer
     */
    public Addresses withCity(JsonNullable<String> city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    /**
     * State of the customer
     */
    public Addresses withState(String state) {
        Utils.checkNotNull(state, "state");
        this.state = JsonNullable.of(state);
        return this;
    }

    /**
     * State of the customer
     */
    public Addresses withState(JsonNullable<String> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    /**
     * Postal code of the customer
     */
    public Addresses withPostalCode(String postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = JsonNullable.of(postalCode);
        return this;
    }

    /**
     * Postal code of the customer
     */
    public Addresses withPostalCode(JsonNullable<String> postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Country of the customer
     */
    public Addresses withCountry(String country) {
        Utils.checkNotNull(country, "country");
        this.country = JsonNullable.of(country);
        return this;
    }

    /**
     * Country of the customer
     */
    public Addresses withCountry(JsonNullable<String> country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
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
        Addresses other = (Addresses) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.line1, other.line1) &&
            Objects.deepEquals(this.line2, other.line2) &&
            Objects.deepEquals(this.city, other.city) &&
            Objects.deepEquals(this.state, other.state) &&
            Objects.deepEquals(this.postalCode, other.postalCode) &&
            Objects.deepEquals(this.country, other.country);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            id,
            line1,
            line2,
            city,
            state,
            postalCode,
            country);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Addresses.class,
                "type", type,
                "id", id,
                "line1", line1,
                "line2", line2,
                "city", city,
                "state", state,
                "postalCode", postalCode,
                "country", country);
    }
    
    public final static class Builder {
 
        private Optional<? extends EcommerceCustomerType> type = Optional.empty();
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private JsonNullable<String> line1 = JsonNullable.undefined();
 
        private JsonNullable<String> line2 = JsonNullable.undefined();
 
        private JsonNullable<String> city = JsonNullable.undefined();
 
        private JsonNullable<String> state = JsonNullable.undefined();
 
        private JsonNullable<String> postalCode = JsonNullable.undefined();
 
        private JsonNullable<String> country = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(EcommerceCustomerType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends EcommerceCustomerType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder id(JsonNullable<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * First line of the street address of the customer
         */
        public Builder line1(String line1) {
            Utils.checkNotNull(line1, "line1");
            this.line1 = JsonNullable.of(line1);
            return this;
        }

        /**
         * First line of the street address of the customer
         */
        public Builder line1(JsonNullable<String> line1) {
            Utils.checkNotNull(line1, "line1");
            this.line1 = line1;
            return this;
        }

        /**
         * Second line of the street address of the customer
         */
        public Builder line2(String line2) {
            Utils.checkNotNull(line2, "line2");
            this.line2 = JsonNullable.of(line2);
            return this;
        }

        /**
         * Second line of the street address of the customer
         */
        public Builder line2(JsonNullable<String> line2) {
            Utils.checkNotNull(line2, "line2");
            this.line2 = line2;
            return this;
        }

        /**
         * City of the customer
         */
        public Builder city(String city) {
            Utils.checkNotNull(city, "city");
            this.city = JsonNullable.of(city);
            return this;
        }

        /**
         * City of the customer
         */
        public Builder city(JsonNullable<String> city) {
            Utils.checkNotNull(city, "city");
            this.city = city;
            return this;
        }

        /**
         * State of the customer
         */
        public Builder state(String state) {
            Utils.checkNotNull(state, "state");
            this.state = JsonNullable.of(state);
            return this;
        }

        /**
         * State of the customer
         */
        public Builder state(JsonNullable<String> state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }

        /**
         * Postal code of the customer
         */
        public Builder postalCode(String postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = JsonNullable.of(postalCode);
            return this;
        }

        /**
         * Postal code of the customer
         */
        public Builder postalCode(JsonNullable<String> postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = postalCode;
            return this;
        }

        /**
         * Country of the customer
         */
        public Builder country(String country) {
            Utils.checkNotNull(country, "country");
            this.country = JsonNullable.of(country);
            return this;
        }

        /**
         * Country of the customer
         */
        public Builder country(JsonNullable<String> country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }
        
        public Addresses build() {
            return new Addresses(
                type,
                id,
                line1,
                line2,
                city,
                state,
                postalCode,
                country);
        }
    }
}

