/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;


import com.apideck.unify.models.components.ConsumerInput;
import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class VaultConsumersAddRequest {

    /**
     * The ID of your Unify application
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-app-id")
    private Optional<String> appId;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private ConsumerInput consumer;

    @JsonCreator
    public VaultConsumersAddRequest(
            Optional<String> appId,
            ConsumerInput consumer) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(consumer, "consumer");
        this.appId = appId;
        this.consumer = consumer;
    }
    
    public VaultConsumersAddRequest(
            ConsumerInput consumer) {
        this(Optional.empty(), consumer);
    }

    /**
     * The ID of your Unify application
     */
    @JsonIgnore
    public Optional<String> appId() {
        return appId;
    }

    @JsonIgnore
    public ConsumerInput consumer() {
        return consumer;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of your Unify application
     */
    public VaultConsumersAddRequest withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public VaultConsumersAddRequest withAppId(Optional<String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    public VaultConsumersAddRequest withConsumer(ConsumerInput consumer) {
        Utils.checkNotNull(consumer, "consumer");
        this.consumer = consumer;
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
        VaultConsumersAddRequest other = (VaultConsumersAddRequest) o;
        return 
            Objects.deepEquals(this.appId, other.appId) &&
            Objects.deepEquals(this.consumer, other.consumer);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            appId,
            consumer);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VaultConsumersAddRequest.class,
                "appId", appId,
                "consumer", consumer);
    }
    
    public final static class Builder {
 
        private Optional<String> appId = Optional.empty();
 
        private ConsumerInput consumer;  
        
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

        public Builder consumer(ConsumerInput consumer) {
            Utils.checkNotNull(consumer, "consumer");
            this.consumer = consumer;
            return this;
        }
        
        public VaultConsumersAddRequest build() {
            return new VaultConsumersAddRequest(
                appId,
                consumer);
        }
    }
}

