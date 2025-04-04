/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class ConnectorApiResourceCoverageOneRequest {

    /**
     * The ID of your Unify application
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-app-id")
    private Optional<String> appId;

    /**
     * ID of the record you are acting upon.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * ID of the resource you are acting upon.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=resource_id")
    private String resourceId;

    @JsonCreator
    public ConnectorApiResourceCoverageOneRequest(
            Optional<String> appId,
            String id,
            String resourceId) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(resourceId, "resourceId");
        this.appId = appId;
        this.id = id;
        this.resourceId = resourceId;
    }
    
    public ConnectorApiResourceCoverageOneRequest(
            String id,
            String resourceId) {
        this(Optional.empty(), id, resourceId);
    }

    /**
     * The ID of your Unify application
     */
    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    /**
     * ID of the record you are acting upon.
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * ID of the resource you are acting upon.
     */
    @JsonIgnore
    public String resourceId() {
        return resourceId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The ID of your Unify application
     */
    public ConnectorApiResourceCoverageOneRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public ConnectorApiResourceCoverageOneRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * ID of the record you are acting upon.
     */
    public ConnectorApiResourceCoverageOneRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * ID of the resource you are acting upon.
     */
    public ConnectorApiResourceCoverageOneRequest withResourceId(String resourceId) {
        Utils.checkNotNull(resourceId, "resourceId");
        this.resourceId = resourceId;
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
        ConnectorApiResourceCoverageOneRequest other = (ConnectorApiResourceCoverageOneRequest) o;
        return 
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.resourceId, other.resourceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            appId,
            id,
            resourceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConnectorApiResourceCoverageOneRequest.class,
                "appId", appId,
                "id", id,
                "resourceId", resourceId);
    }
    
    public final static class Builder {
 
        private Optional<String> appId = Optional.empty();
 
        private String id;
 
        private String resourceId;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of your Unify application
         */
        public Builder appId(String appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = Optional.ofNullable(appId);
            return this;
        }

        /**
         * The ID of your Unify application
         */
        public Builder appId(Optional<String> appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = appId;
            return this;
        }

        /**
         * ID of the record you are acting upon.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * ID of the resource you are acting upon.
         */
        public Builder resourceId(String resourceId) {
            Utils.checkNotNull(resourceId, "resourceId");
            this.resourceId = resourceId;
            return this;
        }
        
        public ConnectorApiResourceCoverageOneRequest build() {
            return new ConnectorApiResourceCoverageOneRequest(
                appId,
                id,
                resourceId);
        }
    }
}
