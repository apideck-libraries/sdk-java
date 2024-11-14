/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;


import com.apideck.unify.utils.LazySingletonValue;
import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class InvoicesSort {

    /**
     * The field on which to sort the Invoices
     */
    @SpeakeasyMetadata("queryParam:name=by")
    private Optional<? extends InvoicesSortBy> by;

    /**
     * The direction in which to sort the results
     */
    @SpeakeasyMetadata("queryParam:name=direction")
    private Optional<? extends SortDirection> direction;

    @JsonCreator
    public InvoicesSort(
            Optional<? extends InvoicesSortBy> by,
            Optional<? extends SortDirection> direction) {
        Utils.checkNotNull(by, "by");
        Utils.checkNotNull(direction, "direction");
        this.by = by;
        this.direction = direction;
    }
    
    public InvoicesSort() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The field on which to sort the Invoices
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<InvoicesSortBy> by() {
        return (Optional<InvoicesSortBy>) by;
    }

    /**
     * The direction in which to sort the results
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SortDirection> direction() {
        return (Optional<SortDirection>) direction;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The field on which to sort the Invoices
     */
    public InvoicesSort withBy(InvoicesSortBy by) {
        Utils.checkNotNull(by, "by");
        this.by = Optional.ofNullable(by);
        return this;
    }

    /**
     * The field on which to sort the Invoices
     */
    public InvoicesSort withBy(Optional<? extends InvoicesSortBy> by) {
        Utils.checkNotNull(by, "by");
        this.by = by;
        return this;
    }

    /**
     * The direction in which to sort the results
     */
    public InvoicesSort withDirection(SortDirection direction) {
        Utils.checkNotNull(direction, "direction");
        this.direction = Optional.ofNullable(direction);
        return this;
    }

    /**
     * The direction in which to sort the results
     */
    public InvoicesSort withDirection(Optional<? extends SortDirection> direction) {
        Utils.checkNotNull(direction, "direction");
        this.direction = direction;
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
        InvoicesSort other = (InvoicesSort) o;
        return 
            Objects.deepEquals(this.by, other.by) &&
            Objects.deepEquals(this.direction, other.direction);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            by,
            direction);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InvoicesSort.class,
                "by", by,
                "direction", direction);
    }
    
    public final static class Builder {
 
        private Optional<? extends InvoicesSortBy> by = Optional.empty();
 
        private Optional<? extends SortDirection> direction;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The field on which to sort the Invoices
         */
        public Builder by(InvoicesSortBy by) {
            Utils.checkNotNull(by, "by");
            this.by = Optional.ofNullable(by);
            return this;
        }

        /**
         * The field on which to sort the Invoices
         */
        public Builder by(Optional<? extends InvoicesSortBy> by) {
            Utils.checkNotNull(by, "by");
            this.by = by;
            return this;
        }

        /**
         * The direction in which to sort the results
         */
        public Builder direction(SortDirection direction) {
            Utils.checkNotNull(direction, "direction");
            this.direction = Optional.ofNullable(direction);
            return this;
        }

        /**
         * The direction in which to sort the results
         */
        public Builder direction(Optional<? extends SortDirection> direction) {
            Utils.checkNotNull(direction, "direction");
            this.direction = direction;
            return this;
        }
        
        public InvoicesSort build() {
            if (direction == null) {
                direction = _SINGLETON_VALUE_Direction.value();
            }            return new InvoicesSort(
                by,
                direction);
        }

        private static final LazySingletonValue<Optional<? extends SortDirection>> _SINGLETON_VALUE_Direction =
                new LazySingletonValue<>(
                        "direction",
                        "\"asc\"",
                        new TypeReference<Optional<? extends SortDirection>>() {});
    }
}

