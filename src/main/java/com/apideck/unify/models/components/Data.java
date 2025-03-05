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
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Data {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("consumer_id")
    private Optional<String> consumerId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("application_id")
    private Optional<String> applicationId;

    /**
     * The metadata of the consumer. This is used to display the consumer in the sidebar. This is optional, but recommended.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends ConsumerMetadata> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("aggregated_request_count")
    private Optional<Double> aggregatedRequestCount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("request_counts")
    private Optional<? extends RequestCountAllocation> requestCounts;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created")
    private Optional<String> created;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modified")
    private Optional<String> modified;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("request_count_updated")
    private Optional<String> requestCountUpdated;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("services")
    private Optional<? extends List<String>> services;

    @JsonCreator
    public Data(
            @JsonProperty("consumer_id") Optional<String> consumerId,
            @JsonProperty("application_id") Optional<String> applicationId,
            @JsonProperty("metadata") Optional<? extends ConsumerMetadata> metadata,
            @JsonProperty("aggregated_request_count") Optional<Double> aggregatedRequestCount,
            @JsonProperty("request_counts") Optional<? extends RequestCountAllocation> requestCounts,
            @JsonProperty("created") Optional<String> created,
            @JsonProperty("modified") Optional<String> modified,
            @JsonProperty("request_count_updated") Optional<String> requestCountUpdated,
            @JsonProperty("services") Optional<? extends List<String>> services) {
        Utils.checkNotNull(consumerId, "consumerId");
        Utils.checkNotNull(applicationId, "applicationId");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(aggregatedRequestCount, "aggregatedRequestCount");
        Utils.checkNotNull(requestCounts, "requestCounts");
        Utils.checkNotNull(created, "created");
        Utils.checkNotNull(modified, "modified");
        Utils.checkNotNull(requestCountUpdated, "requestCountUpdated");
        Utils.checkNotNull(services, "services");
        this.consumerId = consumerId;
        this.applicationId = applicationId;
        this.metadata = metadata;
        this.aggregatedRequestCount = aggregatedRequestCount;
        this.requestCounts = requestCounts;
        this.created = created;
        this.modified = modified;
        this.requestCountUpdated = requestCountUpdated;
        this.services = services;
    }
    
    public Data() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> consumerId() {
        return consumerId;
    }

    @JsonIgnore
    public Optional<String> applicationId() {
        return applicationId;
    }

    /**
     * The metadata of the consumer. This is used to display the consumer in the sidebar. This is optional, but recommended.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ConsumerMetadata> metadata() {
        return (Optional<ConsumerMetadata>) metadata;
    }

    @JsonIgnore
    public Optional<Double> aggregatedRequestCount() {
        return aggregatedRequestCount;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<RequestCountAllocation> requestCounts() {
        return (Optional<RequestCountAllocation>) requestCounts;
    }

    @JsonIgnore
    public Optional<String> created() {
        return created;
    }

    @JsonIgnore
    public Optional<String> modified() {
        return modified;
    }

    @JsonIgnore
    public Optional<String> requestCountUpdated() {
        return requestCountUpdated;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> services() {
        return (Optional<List<String>>) services;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Data withConsumerId(String consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = Optional.ofNullable(consumerId);
        return this;
    }

    public Data withConsumerId(Optional<String> consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = consumerId;
        return this;
    }

    public Data withApplicationId(String applicationId) {
        Utils.checkNotNull(applicationId, "applicationId");
        this.applicationId = Optional.ofNullable(applicationId);
        return this;
    }

    public Data withApplicationId(Optional<String> applicationId) {
        Utils.checkNotNull(applicationId, "applicationId");
        this.applicationId = applicationId;
        return this;
    }

    /**
     * The metadata of the consumer. This is used to display the consumer in the sidebar. This is optional, but recommended.
     */
    public Data withMetadata(ConsumerMetadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * The metadata of the consumer. This is used to display the consumer in the sidebar. This is optional, but recommended.
     */
    public Data withMetadata(Optional<? extends ConsumerMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public Data withAggregatedRequestCount(double aggregatedRequestCount) {
        Utils.checkNotNull(aggregatedRequestCount, "aggregatedRequestCount");
        this.aggregatedRequestCount = Optional.ofNullable(aggregatedRequestCount);
        return this;
    }

    public Data withAggregatedRequestCount(Optional<Double> aggregatedRequestCount) {
        Utils.checkNotNull(aggregatedRequestCount, "aggregatedRequestCount");
        this.aggregatedRequestCount = aggregatedRequestCount;
        return this;
    }

    public Data withRequestCounts(RequestCountAllocation requestCounts) {
        Utils.checkNotNull(requestCounts, "requestCounts");
        this.requestCounts = Optional.ofNullable(requestCounts);
        return this;
    }

    public Data withRequestCounts(Optional<? extends RequestCountAllocation> requestCounts) {
        Utils.checkNotNull(requestCounts, "requestCounts");
        this.requestCounts = requestCounts;
        return this;
    }

    public Data withCreated(String created) {
        Utils.checkNotNull(created, "created");
        this.created = Optional.ofNullable(created);
        return this;
    }

    public Data withCreated(Optional<String> created) {
        Utils.checkNotNull(created, "created");
        this.created = created;
        return this;
    }

    public Data withModified(String modified) {
        Utils.checkNotNull(modified, "modified");
        this.modified = Optional.ofNullable(modified);
        return this;
    }

    public Data withModified(Optional<String> modified) {
        Utils.checkNotNull(modified, "modified");
        this.modified = modified;
        return this;
    }

    public Data withRequestCountUpdated(String requestCountUpdated) {
        Utils.checkNotNull(requestCountUpdated, "requestCountUpdated");
        this.requestCountUpdated = Optional.ofNullable(requestCountUpdated);
        return this;
    }

    public Data withRequestCountUpdated(Optional<String> requestCountUpdated) {
        Utils.checkNotNull(requestCountUpdated, "requestCountUpdated");
        this.requestCountUpdated = requestCountUpdated;
        return this;
    }

    public Data withServices(List<String> services) {
        Utils.checkNotNull(services, "services");
        this.services = Optional.ofNullable(services);
        return this;
    }

    public Data withServices(Optional<? extends List<String>> services) {
        Utils.checkNotNull(services, "services");
        this.services = services;
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
        Data other = (Data) o;
        return 
            Objects.deepEquals(this.consumerId, other.consumerId) &&
            Objects.deepEquals(this.applicationId, other.applicationId) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.aggregatedRequestCount, other.aggregatedRequestCount) &&
            Objects.deepEquals(this.requestCounts, other.requestCounts) &&
            Objects.deepEquals(this.created, other.created) &&
            Objects.deepEquals(this.modified, other.modified) &&
            Objects.deepEquals(this.requestCountUpdated, other.requestCountUpdated) &&
            Objects.deepEquals(this.services, other.services);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            consumerId,
            applicationId,
            metadata,
            aggregatedRequestCount,
            requestCounts,
            created,
            modified,
            requestCountUpdated,
            services);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Data.class,
                "consumerId", consumerId,
                "applicationId", applicationId,
                "metadata", metadata,
                "aggregatedRequestCount", aggregatedRequestCount,
                "requestCounts", requestCounts,
                "created", created,
                "modified", modified,
                "requestCountUpdated", requestCountUpdated,
                "services", services);
    }
    
    public final static class Builder {
 
        private Optional<String> consumerId = Optional.empty();
 
        private Optional<String> applicationId = Optional.empty();
 
        private Optional<? extends ConsumerMetadata> metadata = Optional.empty();
 
        private Optional<Double> aggregatedRequestCount = Optional.empty();
 
        private Optional<? extends RequestCountAllocation> requestCounts = Optional.empty();
 
        private Optional<String> created = Optional.empty();
 
        private Optional<String> modified = Optional.empty();
 
        private Optional<String> requestCountUpdated = Optional.empty();
 
        private Optional<? extends List<String>> services = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder consumerId(String consumerId) {
            Utils.checkNotNull(consumerId, "consumerId");
            this.consumerId = Optional.ofNullable(consumerId);
            return this;
        }

        public Builder consumerId(Optional<String> consumerId) {
            Utils.checkNotNull(consumerId, "consumerId");
            this.consumerId = consumerId;
            return this;
        }

        public Builder applicationId(String applicationId) {
            Utils.checkNotNull(applicationId, "applicationId");
            this.applicationId = Optional.ofNullable(applicationId);
            return this;
        }

        public Builder applicationId(Optional<String> applicationId) {
            Utils.checkNotNull(applicationId, "applicationId");
            this.applicationId = applicationId;
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

        public Builder aggregatedRequestCount(double aggregatedRequestCount) {
            Utils.checkNotNull(aggregatedRequestCount, "aggregatedRequestCount");
            this.aggregatedRequestCount = Optional.ofNullable(aggregatedRequestCount);
            return this;
        }

        public Builder aggregatedRequestCount(Optional<Double> aggregatedRequestCount) {
            Utils.checkNotNull(aggregatedRequestCount, "aggregatedRequestCount");
            this.aggregatedRequestCount = aggregatedRequestCount;
            return this;
        }

        public Builder requestCounts(RequestCountAllocation requestCounts) {
            Utils.checkNotNull(requestCounts, "requestCounts");
            this.requestCounts = Optional.ofNullable(requestCounts);
            return this;
        }

        public Builder requestCounts(Optional<? extends RequestCountAllocation> requestCounts) {
            Utils.checkNotNull(requestCounts, "requestCounts");
            this.requestCounts = requestCounts;
            return this;
        }

        public Builder created(String created) {
            Utils.checkNotNull(created, "created");
            this.created = Optional.ofNullable(created);
            return this;
        }

        public Builder created(Optional<String> created) {
            Utils.checkNotNull(created, "created");
            this.created = created;
            return this;
        }

        public Builder modified(String modified) {
            Utils.checkNotNull(modified, "modified");
            this.modified = Optional.ofNullable(modified);
            return this;
        }

        public Builder modified(Optional<String> modified) {
            Utils.checkNotNull(modified, "modified");
            this.modified = modified;
            return this;
        }

        public Builder requestCountUpdated(String requestCountUpdated) {
            Utils.checkNotNull(requestCountUpdated, "requestCountUpdated");
            this.requestCountUpdated = Optional.ofNullable(requestCountUpdated);
            return this;
        }

        public Builder requestCountUpdated(Optional<String> requestCountUpdated) {
            Utils.checkNotNull(requestCountUpdated, "requestCountUpdated");
            this.requestCountUpdated = requestCountUpdated;
            return this;
        }

        public Builder services(List<String> services) {
            Utils.checkNotNull(services, "services");
            this.services = Optional.ofNullable(services);
            return this;
        }

        public Builder services(Optional<? extends List<String>> services) {
            Utils.checkNotNull(services, "services");
            this.services = services;
            return this;
        }
        
        public Data build() {
            return new Data(
                consumerId,
                applicationId,
                metadata,
                aggregatedRequestCount,
                requestCounts,
                created,
                modified,
                requestCountUpdated,
                services);
        }
    }
}

