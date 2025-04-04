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

public class UpdateConsumerRequest {

    /**
     * The metadata of the consumer. This is used to display the consumer in the sidebar. This is optional, but recommended.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends ConsumerMetadata> metadata;

    @JsonCreator
    public UpdateConsumerRequest(
            @JsonProperty("metadata") Optional<? extends ConsumerMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
    }
    
    public UpdateConsumerRequest() {
        this(Optional.empty());
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
     * The metadata of the consumer. This is used to display the consumer in the sidebar. This is optional, but recommended.
     */
    public UpdateConsumerRequest withMetadata(ConsumerMetadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * The metadata of the consumer. This is used to display the consumer in the sidebar. This is optional, but recommended.
     */
    public UpdateConsumerRequest withMetadata(Optional<? extends ConsumerMetadata> metadata) {
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
        UpdateConsumerRequest other = (UpdateConsumerRequest) o;
        return 
            Objects.deepEquals(this.metadata, other.metadata);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            metadata);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateConsumerRequest.class,
                "metadata", metadata);
    }
    
    public final static class Builder {
 
        private Optional<? extends ConsumerMetadata> metadata = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
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
        
        public UpdateConsumerRequest build() {
            return new UpdateConsumerRequest(
                metadata);
        }
    }
}
