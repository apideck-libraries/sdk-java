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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public class PassThroughBody {
    /**
     * Identifier for the service to which this pass_through should be applied.
     */
    @JsonProperty("service_id")
    private String serviceId;

    /**
     * Optional identifier for a workflow operation to which this pass_through should be applied. This is useful for Unify calls that are making more than one downstream request.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("operation_id")
    private Optional<String> operationId;

    /**
     * Simple object allowing any properties for direct extension.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("extend_object")
    private Optional<? extends Map<String, Object>> extendObject;

    /**
     * Array of objects for structured data modifications via paths.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("extend_paths")
    private Optional<? extends List<ExtendPaths>> extendPaths;

    @JsonCreator
    public PassThroughBody(
            @JsonProperty("service_id") String serviceId,
            @JsonProperty("operation_id") Optional<String> operationId,
            @JsonProperty("extend_object") Optional<? extends Map<String, Object>> extendObject,
            @JsonProperty("extend_paths") Optional<? extends List<ExtendPaths>> extendPaths) {
        Utils.checkNotNull(serviceId, "serviceId");
        Utils.checkNotNull(operationId, "operationId");
        Utils.checkNotNull(extendObject, "extendObject");
        Utils.checkNotNull(extendPaths, "extendPaths");
        this.serviceId = serviceId;
        this.operationId = operationId;
        this.extendObject = extendObject;
        this.extendPaths = extendPaths;
    }
    
    public PassThroughBody(
            String serviceId) {
        this(serviceId, Optional.empty(), Optional.empty(),
            Optional.empty());
    }

    /**
     * Identifier for the service to which this pass_through should be applied.
     */
    @JsonIgnore
    public String serviceId() {
        return serviceId;
    }

    /**
     * Optional identifier for a workflow operation to which this pass_through should be applied. This is useful for Unify calls that are making more than one downstream request.
     */
    @JsonIgnore
    public Optional<String> operationId() {
        return operationId;
    }

    /**
     * Simple object allowing any properties for direct extension.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> extendObject() {
        return (Optional<Map<String, Object>>) extendObject;
    }

    /**
     * Array of objects for structured data modifications via paths.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ExtendPaths>> extendPaths() {
        return (Optional<List<ExtendPaths>>) extendPaths;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Identifier for the service to which this pass_through should be applied.
     */
    public PassThroughBody withServiceId(String serviceId) {
        Utils.checkNotNull(serviceId, "serviceId");
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Optional identifier for a workflow operation to which this pass_through should be applied. This is useful for Unify calls that are making more than one downstream request.
     */
    public PassThroughBody withOperationId(String operationId) {
        Utils.checkNotNull(operationId, "operationId");
        this.operationId = Optional.ofNullable(operationId);
        return this;
    }


    /**
     * Optional identifier for a workflow operation to which this pass_through should be applied. This is useful for Unify calls that are making more than one downstream request.
     */
    public PassThroughBody withOperationId(Optional<String> operationId) {
        Utils.checkNotNull(operationId, "operationId");
        this.operationId = operationId;
        return this;
    }

    /**
     * Simple object allowing any properties for direct extension.
     */
    public PassThroughBody withExtendObject(Map<String, Object> extendObject) {
        Utils.checkNotNull(extendObject, "extendObject");
        this.extendObject = Optional.ofNullable(extendObject);
        return this;
    }


    /**
     * Simple object allowing any properties for direct extension.
     */
    public PassThroughBody withExtendObject(Optional<? extends Map<String, Object>> extendObject) {
        Utils.checkNotNull(extendObject, "extendObject");
        this.extendObject = extendObject;
        return this;
    }

    /**
     * Array of objects for structured data modifications via paths.
     */
    public PassThroughBody withExtendPaths(List<ExtendPaths> extendPaths) {
        Utils.checkNotNull(extendPaths, "extendPaths");
        this.extendPaths = Optional.ofNullable(extendPaths);
        return this;
    }


    /**
     * Array of objects for structured data modifications via paths.
     */
    public PassThroughBody withExtendPaths(Optional<? extends List<ExtendPaths>> extendPaths) {
        Utils.checkNotNull(extendPaths, "extendPaths");
        this.extendPaths = extendPaths;
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
        PassThroughBody other = (PassThroughBody) o;
        return 
            Utils.enhancedDeepEquals(this.serviceId, other.serviceId) &&
            Utils.enhancedDeepEquals(this.operationId, other.operationId) &&
            Utils.enhancedDeepEquals(this.extendObject, other.extendObject) &&
            Utils.enhancedDeepEquals(this.extendPaths, other.extendPaths);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            serviceId, operationId, extendObject,
            extendPaths);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PassThroughBody.class,
                "serviceId", serviceId,
                "operationId", operationId,
                "extendObject", extendObject,
                "extendPaths", extendPaths);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String serviceId;

        private Optional<String> operationId = Optional.empty();

        private Optional<? extends Map<String, Object>> extendObject = Optional.empty();

        private Optional<? extends List<ExtendPaths>> extendPaths = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Identifier for the service to which this pass_through should be applied.
         */
        public Builder serviceId(String serviceId) {
            Utils.checkNotNull(serviceId, "serviceId");
            this.serviceId = serviceId;
            return this;
        }


        /**
         * Optional identifier for a workflow operation to which this pass_through should be applied. This is useful for Unify calls that are making more than one downstream request.
         */
        public Builder operationId(String operationId) {
            Utils.checkNotNull(operationId, "operationId");
            this.operationId = Optional.ofNullable(operationId);
            return this;
        }

        /**
         * Optional identifier for a workflow operation to which this pass_through should be applied. This is useful for Unify calls that are making more than one downstream request.
         */
        public Builder operationId(Optional<String> operationId) {
            Utils.checkNotNull(operationId, "operationId");
            this.operationId = operationId;
            return this;
        }


        /**
         * Simple object allowing any properties for direct extension.
         */
        public Builder extendObject(Map<String, Object> extendObject) {
            Utils.checkNotNull(extendObject, "extendObject");
            this.extendObject = Optional.ofNullable(extendObject);
            return this;
        }

        /**
         * Simple object allowing any properties for direct extension.
         */
        public Builder extendObject(Optional<? extends Map<String, Object>> extendObject) {
            Utils.checkNotNull(extendObject, "extendObject");
            this.extendObject = extendObject;
            return this;
        }


        /**
         * Array of objects for structured data modifications via paths.
         */
        public Builder extendPaths(List<ExtendPaths> extendPaths) {
            Utils.checkNotNull(extendPaths, "extendPaths");
            this.extendPaths = Optional.ofNullable(extendPaths);
            return this;
        }

        /**
         * Array of objects for structured data modifications via paths.
         */
        public Builder extendPaths(Optional<? extends List<ExtendPaths>> extendPaths) {
            Utils.checkNotNull(extendPaths, "extendPaths");
            this.extendPaths = extendPaths;
            return this;
        }

        public PassThroughBody build() {

            return new PassThroughBody(
                serviceId, operationId, extendObject,
                extendPaths);
        }

    }
}
