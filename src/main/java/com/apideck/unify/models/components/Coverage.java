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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class Coverage {

    /**
     * ID of the resource in the Connector's API (downstream)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("downstream_id")
    private Optional<String> downstreamId;

    /**
     * Name of the resource in the Connector's API (downstream)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("downstream_name")
    private Optional<String> downstreamName;

    /**
     * Indicates if pagination (cursor and limit parameters) is supported on the list endpoint of the resource.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pagination_supported")
    private Optional<Boolean> paginationSupported;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pagination")
    private Optional<? extends PaginationCoverage> pagination;

    /**
     * List of supported operations on the resource.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supported_operations")
    private Optional<? extends List<String>> supportedOperations;

    /**
     * Supported filters on the list endpoint of the resource.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supported_filters")
    private Optional<? extends List<String>> supportedFilters;

    /**
     * Supported sorting properties on the list endpoint of the resource.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supported_sort_by")
    private Optional<? extends List<String>> supportedSortBy;

    /**
     * Supported fields on the detail endpoint.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supported_fields")
    private Optional<? extends List<SupportedProperty>> supportedFields;

    /**
     * Supported fields on the list endpoint.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("supported_list_fields")
    private Optional<? extends List<SupportedProperty>> supportedListFields;

    @JsonCreator
    public Coverage(
            @JsonProperty("downstream_id") Optional<String> downstreamId,
            @JsonProperty("downstream_name") Optional<String> downstreamName,
            @JsonProperty("pagination_supported") Optional<Boolean> paginationSupported,
            @JsonProperty("pagination") Optional<? extends PaginationCoverage> pagination,
            @JsonProperty("supported_operations") Optional<? extends List<String>> supportedOperations,
            @JsonProperty("supported_filters") Optional<? extends List<String>> supportedFilters,
            @JsonProperty("supported_sort_by") Optional<? extends List<String>> supportedSortBy,
            @JsonProperty("supported_fields") Optional<? extends List<SupportedProperty>> supportedFields,
            @JsonProperty("supported_list_fields") Optional<? extends List<SupportedProperty>> supportedListFields) {
        Utils.checkNotNull(downstreamId, "downstreamId");
        Utils.checkNotNull(downstreamName, "downstreamName");
        Utils.checkNotNull(paginationSupported, "paginationSupported");
        Utils.checkNotNull(pagination, "pagination");
        Utils.checkNotNull(supportedOperations, "supportedOperations");
        Utils.checkNotNull(supportedFilters, "supportedFilters");
        Utils.checkNotNull(supportedSortBy, "supportedSortBy");
        Utils.checkNotNull(supportedFields, "supportedFields");
        Utils.checkNotNull(supportedListFields, "supportedListFields");
        this.downstreamId = downstreamId;
        this.downstreamName = downstreamName;
        this.paginationSupported = paginationSupported;
        this.pagination = pagination;
        this.supportedOperations = supportedOperations;
        this.supportedFilters = supportedFilters;
        this.supportedSortBy = supportedSortBy;
        this.supportedFields = supportedFields;
        this.supportedListFields = supportedListFields;
    }
    
    public Coverage() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * ID of the resource in the Connector's API (downstream)
     */
    @JsonIgnore
    public Optional<String> downstreamId() {
        return downstreamId;
    }

    /**
     * Name of the resource in the Connector's API (downstream)
     */
    @JsonIgnore
    public Optional<String> downstreamName() {
        return downstreamName;
    }

    /**
     * Indicates if pagination (cursor and limit parameters) is supported on the list endpoint of the resource.
     */
    @JsonIgnore
    public Optional<Boolean> paginationSupported() {
        return paginationSupported;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PaginationCoverage> pagination() {
        return (Optional<PaginationCoverage>) pagination;
    }

    /**
     * List of supported operations on the resource.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> supportedOperations() {
        return (Optional<List<String>>) supportedOperations;
    }

    /**
     * Supported filters on the list endpoint of the resource.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> supportedFilters() {
        return (Optional<List<String>>) supportedFilters;
    }

    /**
     * Supported sorting properties on the list endpoint of the resource.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> supportedSortBy() {
        return (Optional<List<String>>) supportedSortBy;
    }

    /**
     * Supported fields on the detail endpoint.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<SupportedProperty>> supportedFields() {
        return (Optional<List<SupportedProperty>>) supportedFields;
    }

    /**
     * Supported fields on the list endpoint.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<SupportedProperty>> supportedListFields() {
        return (Optional<List<SupportedProperty>>) supportedListFields;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the resource in the Connector's API (downstream)
     */
    public Coverage withDownstreamId(String downstreamId) {
        Utils.checkNotNull(downstreamId, "downstreamId");
        this.downstreamId = Optional.ofNullable(downstreamId);
        return this;
    }

    /**
     * ID of the resource in the Connector's API (downstream)
     */
    public Coverage withDownstreamId(Optional<String> downstreamId) {
        Utils.checkNotNull(downstreamId, "downstreamId");
        this.downstreamId = downstreamId;
        return this;
    }

    /**
     * Name of the resource in the Connector's API (downstream)
     */
    public Coverage withDownstreamName(String downstreamName) {
        Utils.checkNotNull(downstreamName, "downstreamName");
        this.downstreamName = Optional.ofNullable(downstreamName);
        return this;
    }

    /**
     * Name of the resource in the Connector's API (downstream)
     */
    public Coverage withDownstreamName(Optional<String> downstreamName) {
        Utils.checkNotNull(downstreamName, "downstreamName");
        this.downstreamName = downstreamName;
        return this;
    }

    /**
     * Indicates if pagination (cursor and limit parameters) is supported on the list endpoint of the resource.
     */
    public Coverage withPaginationSupported(boolean paginationSupported) {
        Utils.checkNotNull(paginationSupported, "paginationSupported");
        this.paginationSupported = Optional.ofNullable(paginationSupported);
        return this;
    }

    /**
     * Indicates if pagination (cursor and limit parameters) is supported on the list endpoint of the resource.
     */
    public Coverage withPaginationSupported(Optional<Boolean> paginationSupported) {
        Utils.checkNotNull(paginationSupported, "paginationSupported");
        this.paginationSupported = paginationSupported;
        return this;
    }

    public Coverage withPagination(PaginationCoverage pagination) {
        Utils.checkNotNull(pagination, "pagination");
        this.pagination = Optional.ofNullable(pagination);
        return this;
    }

    public Coverage withPagination(Optional<? extends PaginationCoverage> pagination) {
        Utils.checkNotNull(pagination, "pagination");
        this.pagination = pagination;
        return this;
    }

    /**
     * List of supported operations on the resource.
     */
    public Coverage withSupportedOperations(List<String> supportedOperations) {
        Utils.checkNotNull(supportedOperations, "supportedOperations");
        this.supportedOperations = Optional.ofNullable(supportedOperations);
        return this;
    }

    /**
     * List of supported operations on the resource.
     */
    public Coverage withSupportedOperations(Optional<? extends List<String>> supportedOperations) {
        Utils.checkNotNull(supportedOperations, "supportedOperations");
        this.supportedOperations = supportedOperations;
        return this;
    }

    /**
     * Supported filters on the list endpoint of the resource.
     */
    public Coverage withSupportedFilters(List<String> supportedFilters) {
        Utils.checkNotNull(supportedFilters, "supportedFilters");
        this.supportedFilters = Optional.ofNullable(supportedFilters);
        return this;
    }

    /**
     * Supported filters on the list endpoint of the resource.
     */
    public Coverage withSupportedFilters(Optional<? extends List<String>> supportedFilters) {
        Utils.checkNotNull(supportedFilters, "supportedFilters");
        this.supportedFilters = supportedFilters;
        return this;
    }

    /**
     * Supported sorting properties on the list endpoint of the resource.
     */
    public Coverage withSupportedSortBy(List<String> supportedSortBy) {
        Utils.checkNotNull(supportedSortBy, "supportedSortBy");
        this.supportedSortBy = Optional.ofNullable(supportedSortBy);
        return this;
    }

    /**
     * Supported sorting properties on the list endpoint of the resource.
     */
    public Coverage withSupportedSortBy(Optional<? extends List<String>> supportedSortBy) {
        Utils.checkNotNull(supportedSortBy, "supportedSortBy");
        this.supportedSortBy = supportedSortBy;
        return this;
    }

    /**
     * Supported fields on the detail endpoint.
     */
    public Coverage withSupportedFields(List<SupportedProperty> supportedFields) {
        Utils.checkNotNull(supportedFields, "supportedFields");
        this.supportedFields = Optional.ofNullable(supportedFields);
        return this;
    }

    /**
     * Supported fields on the detail endpoint.
     */
    public Coverage withSupportedFields(Optional<? extends List<SupportedProperty>> supportedFields) {
        Utils.checkNotNull(supportedFields, "supportedFields");
        this.supportedFields = supportedFields;
        return this;
    }

    /**
     * Supported fields on the list endpoint.
     */
    public Coverage withSupportedListFields(List<SupportedProperty> supportedListFields) {
        Utils.checkNotNull(supportedListFields, "supportedListFields");
        this.supportedListFields = Optional.ofNullable(supportedListFields);
        return this;
    }

    /**
     * Supported fields on the list endpoint.
     */
    public Coverage withSupportedListFields(Optional<? extends List<SupportedProperty>> supportedListFields) {
        Utils.checkNotNull(supportedListFields, "supportedListFields");
        this.supportedListFields = supportedListFields;
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
        Coverage other = (Coverage) o;
        return 
            Objects.deepEquals(this.downstreamId, other.downstreamId) &&
            Objects.deepEquals(this.downstreamName, other.downstreamName) &&
            Objects.deepEquals(this.paginationSupported, other.paginationSupported) &&
            Objects.deepEquals(this.pagination, other.pagination) &&
            Objects.deepEquals(this.supportedOperations, other.supportedOperations) &&
            Objects.deepEquals(this.supportedFilters, other.supportedFilters) &&
            Objects.deepEquals(this.supportedSortBy, other.supportedSortBy) &&
            Objects.deepEquals(this.supportedFields, other.supportedFields) &&
            Objects.deepEquals(this.supportedListFields, other.supportedListFields);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            downstreamId,
            downstreamName,
            paginationSupported,
            pagination,
            supportedOperations,
            supportedFilters,
            supportedSortBy,
            supportedFields,
            supportedListFields);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Coverage.class,
                "downstreamId", downstreamId,
                "downstreamName", downstreamName,
                "paginationSupported", paginationSupported,
                "pagination", pagination,
                "supportedOperations", supportedOperations,
                "supportedFilters", supportedFilters,
                "supportedSortBy", supportedSortBy,
                "supportedFields", supportedFields,
                "supportedListFields", supportedListFields);
    }
    
    public final static class Builder {
 
        private Optional<String> downstreamId = Optional.empty();
 
        private Optional<String> downstreamName = Optional.empty();
 
        private Optional<Boolean> paginationSupported = Optional.empty();
 
        private Optional<? extends PaginationCoverage> pagination = Optional.empty();
 
        private Optional<? extends List<String>> supportedOperations = Optional.empty();
 
        private Optional<? extends List<String>> supportedFilters = Optional.empty();
 
        private Optional<? extends List<String>> supportedSortBy = Optional.empty();
 
        private Optional<? extends List<SupportedProperty>> supportedFields = Optional.empty();
 
        private Optional<? extends List<SupportedProperty>> supportedListFields = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID of the resource in the Connector's API (downstream)
         */
        public Builder downstreamId(String downstreamId) {
            Utils.checkNotNull(downstreamId, "downstreamId");
            this.downstreamId = Optional.ofNullable(downstreamId);
            return this;
        }

        /**
         * ID of the resource in the Connector's API (downstream)
         */
        public Builder downstreamId(Optional<String> downstreamId) {
            Utils.checkNotNull(downstreamId, "downstreamId");
            this.downstreamId = downstreamId;
            return this;
        }

        /**
         * Name of the resource in the Connector's API (downstream)
         */
        public Builder downstreamName(String downstreamName) {
            Utils.checkNotNull(downstreamName, "downstreamName");
            this.downstreamName = Optional.ofNullable(downstreamName);
            return this;
        }

        /**
         * Name of the resource in the Connector's API (downstream)
         */
        public Builder downstreamName(Optional<String> downstreamName) {
            Utils.checkNotNull(downstreamName, "downstreamName");
            this.downstreamName = downstreamName;
            return this;
        }

        /**
         * Indicates if pagination (cursor and limit parameters) is supported on the list endpoint of the resource.
         */
        public Builder paginationSupported(boolean paginationSupported) {
            Utils.checkNotNull(paginationSupported, "paginationSupported");
            this.paginationSupported = Optional.ofNullable(paginationSupported);
            return this;
        }

        /**
         * Indicates if pagination (cursor and limit parameters) is supported on the list endpoint of the resource.
         */
        public Builder paginationSupported(Optional<Boolean> paginationSupported) {
            Utils.checkNotNull(paginationSupported, "paginationSupported");
            this.paginationSupported = paginationSupported;
            return this;
        }

        public Builder pagination(PaginationCoverage pagination) {
            Utils.checkNotNull(pagination, "pagination");
            this.pagination = Optional.ofNullable(pagination);
            return this;
        }

        public Builder pagination(Optional<? extends PaginationCoverage> pagination) {
            Utils.checkNotNull(pagination, "pagination");
            this.pagination = pagination;
            return this;
        }

        /**
         * List of supported operations on the resource.
         */
        public Builder supportedOperations(List<String> supportedOperations) {
            Utils.checkNotNull(supportedOperations, "supportedOperations");
            this.supportedOperations = Optional.ofNullable(supportedOperations);
            return this;
        }

        /**
         * List of supported operations on the resource.
         */
        public Builder supportedOperations(Optional<? extends List<String>> supportedOperations) {
            Utils.checkNotNull(supportedOperations, "supportedOperations");
            this.supportedOperations = supportedOperations;
            return this;
        }

        /**
         * Supported filters on the list endpoint of the resource.
         */
        public Builder supportedFilters(List<String> supportedFilters) {
            Utils.checkNotNull(supportedFilters, "supportedFilters");
            this.supportedFilters = Optional.ofNullable(supportedFilters);
            return this;
        }

        /**
         * Supported filters on the list endpoint of the resource.
         */
        public Builder supportedFilters(Optional<? extends List<String>> supportedFilters) {
            Utils.checkNotNull(supportedFilters, "supportedFilters");
            this.supportedFilters = supportedFilters;
            return this;
        }

        /**
         * Supported sorting properties on the list endpoint of the resource.
         */
        public Builder supportedSortBy(List<String> supportedSortBy) {
            Utils.checkNotNull(supportedSortBy, "supportedSortBy");
            this.supportedSortBy = Optional.ofNullable(supportedSortBy);
            return this;
        }

        /**
         * Supported sorting properties on the list endpoint of the resource.
         */
        public Builder supportedSortBy(Optional<? extends List<String>> supportedSortBy) {
            Utils.checkNotNull(supportedSortBy, "supportedSortBy");
            this.supportedSortBy = supportedSortBy;
            return this;
        }

        /**
         * Supported fields on the detail endpoint.
         */
        public Builder supportedFields(List<SupportedProperty> supportedFields) {
            Utils.checkNotNull(supportedFields, "supportedFields");
            this.supportedFields = Optional.ofNullable(supportedFields);
            return this;
        }

        /**
         * Supported fields on the detail endpoint.
         */
        public Builder supportedFields(Optional<? extends List<SupportedProperty>> supportedFields) {
            Utils.checkNotNull(supportedFields, "supportedFields");
            this.supportedFields = supportedFields;
            return this;
        }

        /**
         * Supported fields on the list endpoint.
         */
        public Builder supportedListFields(List<SupportedProperty> supportedListFields) {
            Utils.checkNotNull(supportedListFields, "supportedListFields");
            this.supportedListFields = Optional.ofNullable(supportedListFields);
            return this;
        }

        /**
         * Supported fields on the list endpoint.
         */
        public Builder supportedListFields(Optional<? extends List<SupportedProperty>> supportedListFields) {
            Utils.checkNotNull(supportedListFields, "supportedListFields");
            this.supportedListFields = supportedListFields;
            return this;
        }
        
        public Coverage build() {
            return new Coverage(
                downstreamId,
                downstreamName,
                paginationSupported,
                pagination,
                supportedOperations,
                supportedFilters,
                supportedSortBy,
                supportedFields,
                supportedListFields);
        }
    }
}
