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

public class ConsumerInput {

    /**
     * Unique consumer identifier. You can freely choose a consumer ID yourself. Most of the time, this is an ID of your internal data model that represents a user or account in your system (for example account:12345). If the consumer doesn't exist yet, Vault will upsert a consumer based on your ID.
     */
    @JsonProperty("consumer_id")
    private String consumerId;

    /**
     * The metadata of the consumer. This is used to display the consumer in the sidebar. This is optional, but recommended.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends ConsumerMetadata> metadata;

    @JsonCreator
    public ConsumerInput(
            @JsonProperty("consumer_id") String consumerId,
            @JsonProperty("metadata") Optional<? extends ConsumerMetadata> metadata) {
        Utils.checkNotNull(consumerId, "consumerId");
        Utils.checkNotNull(metadata, "metadata");
        this.consumerId = consumerId;
        this.metadata = metadata;
    }
    
    public ConsumerInput(
            String consumerId) {
        this(consumerId, Optional.empty());
    }

    /**
     * Unique consumer identifier. You can freely choose a consumer ID yourself. Most of the time, this is an ID of your internal data model that represents a user or account in your system (for example account:12345). If the consumer doesn't exist yet, Vault will upsert a consumer based on your ID.
     */
    @JsonIgnore
    public String consumerId() {
        return consumerId;
    }

    /**
     * The metadata of the consumer. This is used to display the consumer in the sidebar. This is optional, but recommended.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ConsumerMetadata> metadata() {
        return (Optional<ConsumerMetadata>) metadata;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Unique consumer identifier. You can freely choose a consumer ID yourself. Most of the time, this is an ID of your internal data model that represents a user or account in your system (for example account:12345). If the consumer doesn't exist yet, Vault will upsert a consumer based on your ID.
     */
    public ConsumerInput withConsumerId(String consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = consumerId;
        return this;
    }

    /**
     * The metadata of the consumer. This is used to display the consumer in the sidebar. This is optional, but recommended.
     */
    public ConsumerInput withMetadata(ConsumerMetadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * The metadata of the consumer. This is used to display the consumer in the sidebar. This is optional, but recommended.
     */
    public ConsumerInput withMetadata(Optional<? extends ConsumerMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
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
        ConsumerInput other = (ConsumerInput) o;
        return 
            Objects.deepEquals(this.consumerId, other.consumerId) &&
            Objects.deepEquals(this.metadata, other.metadata);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            consumerId,
            metadata);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConsumerInput.class,
                "consumerId", consumerId,
                "metadata", metadata);
    }
    
    public final static class Builder {
 
        private String consumerId;
 
        private Optional<? extends ConsumerMetadata> metadata = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique consumer identifier. You can freely choose a consumer ID yourself. Most of the time, this is an ID of your internal data model that represents a user or account in your system (for example account:12345). If the consumer doesn't exist yet, Vault will upsert a consumer based on your ID.
         */
        public Builder consumerId(String consumerId) {
            Utils.checkNotNull(consumerId, "consumerId");
            this.consumerId = consumerId;
            return this;
        }

        /**
         * The metadata of the consumer. This is used to display the consumer in the sidebar. This is optional, but recommended.
         */
        public Builder metadata(ConsumerMetadata metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        /**
         * The metadata of the consumer. This is used to display the consumer in the sidebar. This is optional, but recommended.
         */
        public Builder metadata(Optional<? extends ConsumerMetadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }
        
        public ConsumerInput build() {
            return new ConsumerInput(
                consumerId,
                metadata);
        }
    }
}
