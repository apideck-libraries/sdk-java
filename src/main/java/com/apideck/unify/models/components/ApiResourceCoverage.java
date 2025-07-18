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
import java.util.List;
import java.util.Optional;


public class ApiResourceCoverage {
    /**
     * ID of the resource, typically a lowercased version of name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * Name of the resource (plural)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * Status of the resource. Resources with status live or beta are callable.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends ResourceStatus> status;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("coverage")
    private Optional<? extends List<Coverage>> coverage;

    @JsonCreator
    public ApiResourceCoverage(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("status") Optional<? extends ResourceStatus> status,
            @JsonProperty("coverage") Optional<? extends List<Coverage>> coverage) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(coverage, "coverage");
        this.id = id;
        this.name = name;
        this.status = status;
        this.coverage = coverage;
    }
    
    public ApiResourceCoverage() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty());
    }

    /**
     * ID of the resource, typically a lowercased version of name.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * Name of the resource (plural)
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * Status of the resource. Resources with status live or beta are callable.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ResourceStatus> status() {
        return (Optional<ResourceStatus>) status;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Coverage>> coverage() {
        return (Optional<List<Coverage>>) coverage;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * ID of the resource, typically a lowercased version of name.
     */
    public ApiResourceCoverage withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }


    /**
     * ID of the resource, typically a lowercased version of name.
     */
    public ApiResourceCoverage withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Name of the resource (plural)
     */
    public ApiResourceCoverage withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }


    /**
     * Name of the resource (plural)
     */
    public ApiResourceCoverage withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Status of the resource. Resources with status live or beta are callable.
     */
    public ApiResourceCoverage withStatus(ResourceStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }


    /**
     * Status of the resource. Resources with status live or beta are callable.
     */
    public ApiResourceCoverage withStatus(Optional<? extends ResourceStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public ApiResourceCoverage withCoverage(List<Coverage> coverage) {
        Utils.checkNotNull(coverage, "coverage");
        this.coverage = Optional.ofNullable(coverage);
        return this;
    }


    public ApiResourceCoverage withCoverage(Optional<? extends List<Coverage>> coverage) {
        Utils.checkNotNull(coverage, "coverage");
        this.coverage = coverage;
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
        ApiResourceCoverage other = (ApiResourceCoverage) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.name, other.name) &&
            Utils.enhancedDeepEquals(this.status, other.status) &&
            Utils.enhancedDeepEquals(this.coverage, other.coverage);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, name, status,
            coverage);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApiResourceCoverage.class,
                "id", id,
                "name", name,
                "status", status,
                "coverage", coverage);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> id = Optional.empty();

        private Optional<String> name = Optional.empty();

        private Optional<? extends ResourceStatus> status = Optional.empty();

        private Optional<? extends List<Coverage>> coverage = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * ID of the resource, typically a lowercased version of name.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * ID of the resource, typically a lowercased version of name.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }


        /**
         * Name of the resource (plural)
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * Name of the resource (plural)
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }


        /**
         * Status of the resource. Resources with status live or beta are callable.
         */
        public Builder status(ResourceStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Status of the resource. Resources with status live or beta are callable.
         */
        public Builder status(Optional<? extends ResourceStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }


        public Builder coverage(List<Coverage> coverage) {
            Utils.checkNotNull(coverage, "coverage");
            this.coverage = Optional.ofNullable(coverage);
            return this;
        }

        public Builder coverage(Optional<? extends List<Coverage>> coverage) {
            Utils.checkNotNull(coverage, "coverage");
            this.coverage = coverage;
            return this;
        }

        public ApiResourceCoverage build() {

            return new ApiResourceCoverage(
                id, name, status,
                coverage);
        }

    }
}
