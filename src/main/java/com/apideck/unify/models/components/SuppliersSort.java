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
import java.util.Optional;


public class SuppliersSort {
    /**
     * The field on which to sort the Suppliers
     */
    @SpeakeasyMetadata("queryParam:name=by")
    private Optional<? extends SuppliersSortBy> by;

    /**
     * The direction in which to sort the results
     */
    @SpeakeasyMetadata("queryParam:name=direction")
    private Optional<? extends SortDirection> direction;

    @JsonCreator
    public SuppliersSort(
            Optional<? extends SuppliersSortBy> by,
            Optional<? extends SortDirection> direction) {
        Utils.checkNotNull(by, "by");
        Utils.checkNotNull(direction, "direction");
        this.by = by;
        this.direction = direction;
    }
    
    public SuppliersSort() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The field on which to sort the Suppliers
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SuppliersSortBy> by() {
        return (Optional<SuppliersSortBy>) by;
    }

    /**
     * The direction in which to sort the results
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SortDirection> direction() {
        return (Optional<SortDirection>) direction;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The field on which to sort the Suppliers
     */
    public SuppliersSort withBy(SuppliersSortBy by) {
        Utils.checkNotNull(by, "by");
        this.by = Optional.ofNullable(by);
        return this;
    }


    /**
     * The field on which to sort the Suppliers
     */
    public SuppliersSort withBy(Optional<? extends SuppliersSortBy> by) {
        Utils.checkNotNull(by, "by");
        this.by = by;
        return this;
    }

    /**
     * The direction in which to sort the results
     */
    public SuppliersSort withDirection(SortDirection direction) {
        Utils.checkNotNull(direction, "direction");
        this.direction = Optional.ofNullable(direction);
        return this;
    }


    /**
     * The direction in which to sort the results
     */
    public SuppliersSort withDirection(Optional<? extends SortDirection> direction) {
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
        SuppliersSort other = (SuppliersSort) o;
        return 
            Utils.enhancedDeepEquals(this.by, other.by) &&
            Utils.enhancedDeepEquals(this.direction, other.direction);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            by, direction);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SuppliersSort.class,
                "by", by,
                "direction", direction);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<? extends SuppliersSortBy> by = Optional.empty();

        private Optional<? extends SortDirection> direction;

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The field on which to sort the Suppliers
         */
        public Builder by(SuppliersSortBy by) {
            Utils.checkNotNull(by, "by");
            this.by = Optional.ofNullable(by);
            return this;
        }

        /**
         * The field on which to sort the Suppliers
         */
        public Builder by(Optional<? extends SuppliersSortBy> by) {
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

        public SuppliersSort build() {
            if (direction == null) {
                direction = _SINGLETON_VALUE_Direction.value();
            }

            return new SuppliersSort(
                by, direction);
        }


        private static final LazySingletonValue<Optional<? extends SortDirection>> _SINGLETON_VALUE_Direction =
                new LazySingletonValue<>(
                        "direction",
                        "\"asc\"",
                        new TypeReference<Optional<? extends SortDirection>>() {});
    }
}
