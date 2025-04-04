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
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class AllocationInput {

    /**
     * Unique identifier of entity this payment should be attributed to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * Type of entity this payment should be attributed to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends AllocationType> type;

    /**
     * Amount of payment that should be attributed to this allocation. If null, the total_amount will be used.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private JsonNullable<Double> amount;

    /**
     * Unique identifier of the allocation
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allocation_id")
    private Optional<String> allocationId;

    @JsonCreator
    public AllocationInput(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("type") Optional<? extends AllocationType> type,
            @JsonProperty("amount") JsonNullable<Double> amount,
            @JsonProperty("allocation_id") Optional<String> allocationId) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(allocationId, "allocationId");
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.allocationId = allocationId;
    }
    
    public AllocationInput() {
        this(Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * Unique identifier of entity this payment should be attributed to.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * Type of entity this payment should be attributed to.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AllocationType> type() {
        return (Optional<AllocationType>) type;
    }

    /**
     * Amount of payment that should be attributed to this allocation. If null, the total_amount will be used.
     */
    @JsonIgnore
    public JsonNullable<Double> amount() {
        return amount;
    }

    /**
     * Unique identifier of the allocation
     */
    @JsonIgnore
    public Optional<String> allocationId() {
        return allocationId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Unique identifier of entity this payment should be attributed to.
     */
    public AllocationInput withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Unique identifier of entity this payment should be attributed to.
     */
    public AllocationInput withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Type of entity this payment should be attributed to.
     */
    public AllocationInput withType(AllocationType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * Type of entity this payment should be attributed to.
     */
    public AllocationInput withType(Optional<? extends AllocationType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Amount of payment that should be attributed to this allocation. If null, the total_amount will be used.
     */
    public AllocationInput withAmount(double amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = JsonNullable.of(amount);
        return this;
    }

    /**
     * Amount of payment that should be attributed to this allocation. If null, the total_amount will be used.
     */
    public AllocationInput withAmount(JsonNullable<Double> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * Unique identifier of the allocation
     */
    public AllocationInput withAllocationId(String allocationId) {
        Utils.checkNotNull(allocationId, "allocationId");
        this.allocationId = Optional.ofNullable(allocationId);
        return this;
    }

    /**
     * Unique identifier of the allocation
     */
    public AllocationInput withAllocationId(Optional<String> allocationId) {
        Utils.checkNotNull(allocationId, "allocationId");
        this.allocationId = allocationId;
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
        AllocationInput other = (AllocationInput) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.allocationId, other.allocationId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            type,
            amount,
            allocationId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AllocationInput.class,
                "id", id,
                "type", type,
                "amount", amount,
                "allocationId", allocationId);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<? extends AllocationType> type = Optional.empty();
 
        private JsonNullable<Double> amount = JsonNullable.undefined();
 
        private Optional<String> allocationId = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier of entity this payment should be attributed to.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Unique identifier of entity this payment should be attributed to.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Type of entity this payment should be attributed to.
         */
        public Builder type(AllocationType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * Type of entity this payment should be attributed to.
         */
        public Builder type(Optional<? extends AllocationType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Amount of payment that should be attributed to this allocation. If null, the total_amount will be used.
         */
        public Builder amount(double amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = JsonNullable.of(amount);
            return this;
        }

        /**
         * Amount of payment that should be attributed to this allocation. If null, the total_amount will be used.
         */
        public Builder amount(JsonNullable<Double> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        /**
         * Unique identifier of the allocation
         */
        public Builder allocationId(String allocationId) {
            Utils.checkNotNull(allocationId, "allocationId");
            this.allocationId = Optional.ofNullable(allocationId);
            return this;
        }

        /**
         * Unique identifier of the allocation
         */
        public Builder allocationId(Optional<String> allocationId) {
            Utils.checkNotNull(allocationId, "allocationId");
            this.allocationId = allocationId;
            return this;
        }
        
        public AllocationInput build() {
            return new AllocationInput(
                id,
                type,
                amount,
                allocationId);
        }
    }
}
