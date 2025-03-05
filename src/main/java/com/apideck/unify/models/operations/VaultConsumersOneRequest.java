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

public class VaultConsumersOneRequest {

    /**
     * The ID of your Unify application
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-app-id")
    private Optional<String> appId;

    /**
     * ID of the consumer to return
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=consumer_id")
    private String consumerId;

    @JsonCreator
    public VaultConsumersOneRequest(
            Optional<String> appId,
            String consumerId) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(consumerId, "consumerId");
        this.appId = appId;
        this.consumerId = consumerId;
    }
    
    public VaultConsumersOneRequest(
            String consumerId) {
        this(Optional.empty(), consumerId);
    }

    /**
     * The ID of your Unify application
     */
    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    /**
     * ID of the consumer to return
     */
    @JsonIgnore
    public String consumerId() {
        return consumerId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of your Unify application
     */
    public VaultConsumersOneRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public VaultConsumersOneRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * ID of the consumer to return
     */
    public VaultConsumersOneRequest withConsumerId(String consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = consumerId;
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
        VaultConsumersOneRequest other = (VaultConsumersOneRequest) o;
        return 
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.consumerId, other.consumerId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            appId,
            consumerId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VaultConsumersOneRequest.class,
                "appId", appId,
                "consumerId", consumerId);
    }
    
    public final static class Builder {
 
        private Optional<String> appId = Optional.empty();
 
        private String consumerId;  
        
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
         * ID of the consumer to return
         */
        public Builder consumerId(String consumerId) {
            Utils.checkNotNull(consumerId, "consumerId");
            this.consumerId = consumerId;
            return this;
        }
        
        public VaultConsumersOneRequest build() {
            return new VaultConsumersOneRequest(
                appId,
                consumerId);
        }
    }
}

