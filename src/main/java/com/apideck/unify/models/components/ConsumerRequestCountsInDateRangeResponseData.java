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
import java.util.Objects;
import java.util.Optional;


public class ConsumerRequestCountsInDateRangeResponseData {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("application_id")
    private Optional<String> applicationId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("consumer_id")
    private Optional<String> consumerId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_datetime")
    private Optional<String> startDatetime;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_datetime")
    private Optional<String> endDatetime;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("aggregated_request_count")
    private Optional<Double> aggregatedRequestCount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("request_counts")
    private Optional<? extends RequestCountAllocation> requestCounts;

    @JsonCreator
    public ConsumerRequestCountsInDateRangeResponseData(
            @JsonProperty("application_id") Optional<String> applicationId,
            @JsonProperty("consumer_id") Optional<String> consumerId,
            @JsonProperty("start_datetime") Optional<String> startDatetime,
            @JsonProperty("end_datetime") Optional<String> endDatetime,
            @JsonProperty("aggregated_request_count") Optional<Double> aggregatedRequestCount,
            @JsonProperty("request_counts") Optional<? extends RequestCountAllocation> requestCounts) {
        Utils.checkNotNull(applicationId, "applicationId");
        Utils.checkNotNull(consumerId, "consumerId");
        Utils.checkNotNull(startDatetime, "startDatetime");
        Utils.checkNotNull(endDatetime, "endDatetime");
        Utils.checkNotNull(aggregatedRequestCount, "aggregatedRequestCount");
        Utils.checkNotNull(requestCounts, "requestCounts");
        this.applicationId = applicationId;
        this.consumerId = consumerId;
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
        this.aggregatedRequestCount = aggregatedRequestCount;
        this.requestCounts = requestCounts;
    }
    
    public ConsumerRequestCountsInDateRangeResponseData() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> applicationId() {
        return applicationId;
    }

    @JsonIgnore
    public Optional<String> consumerId() {
        return consumerId;
    }

    @JsonIgnore
    public Optional<String> startDatetime() {
        return startDatetime;
    }

    @JsonIgnore
    public Optional<String> endDatetime() {
        return endDatetime;
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

    public final static Builder builder() {
        return new Builder();
    }

    public ConsumerRequestCountsInDateRangeResponseData withApplicationId(String applicationId) {
        Utils.checkNotNull(applicationId, "applicationId");
        this.applicationId = Optional.ofNullable(applicationId);
        return this;
    }

    public ConsumerRequestCountsInDateRangeResponseData withApplicationId(Optional<String> applicationId) {
        Utils.checkNotNull(applicationId, "applicationId");
        this.applicationId = applicationId;
        return this;
    }

    public ConsumerRequestCountsInDateRangeResponseData withConsumerId(String consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = Optional.ofNullable(consumerId);
        return this;
    }

    public ConsumerRequestCountsInDateRangeResponseData withConsumerId(Optional<String> consumerId) {
        Utils.checkNotNull(consumerId, "consumerId");
        this.consumerId = consumerId;
        return this;
    }

    public ConsumerRequestCountsInDateRangeResponseData withStartDatetime(String startDatetime) {
        Utils.checkNotNull(startDatetime, "startDatetime");
        this.startDatetime = Optional.ofNullable(startDatetime);
        return this;
    }

    public ConsumerRequestCountsInDateRangeResponseData withStartDatetime(Optional<String> startDatetime) {
        Utils.checkNotNull(startDatetime, "startDatetime");
        this.startDatetime = startDatetime;
        return this;
    }

    public ConsumerRequestCountsInDateRangeResponseData withEndDatetime(String endDatetime) {
        Utils.checkNotNull(endDatetime, "endDatetime");
        this.endDatetime = Optional.ofNullable(endDatetime);
        return this;
    }

    public ConsumerRequestCountsInDateRangeResponseData withEndDatetime(Optional<String> endDatetime) {
        Utils.checkNotNull(endDatetime, "endDatetime");
        this.endDatetime = endDatetime;
        return this;
    }

    public ConsumerRequestCountsInDateRangeResponseData withAggregatedRequestCount(double aggregatedRequestCount) {
        Utils.checkNotNull(aggregatedRequestCount, "aggregatedRequestCount");
        this.aggregatedRequestCount = Optional.ofNullable(aggregatedRequestCount);
        return this;
    }

    public ConsumerRequestCountsInDateRangeResponseData withAggregatedRequestCount(Optional<Double> aggregatedRequestCount) {
        Utils.checkNotNull(aggregatedRequestCount, "aggregatedRequestCount");
        this.aggregatedRequestCount = aggregatedRequestCount;
        return this;
    }

    public ConsumerRequestCountsInDateRangeResponseData withRequestCounts(RequestCountAllocation requestCounts) {
        Utils.checkNotNull(requestCounts, "requestCounts");
        this.requestCounts = Optional.ofNullable(requestCounts);
        return this;
    }

    public ConsumerRequestCountsInDateRangeResponseData withRequestCounts(Optional<? extends RequestCountAllocation> requestCounts) {
        Utils.checkNotNull(requestCounts, "requestCounts");
        this.requestCounts = requestCounts;
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
        ConsumerRequestCountsInDateRangeResponseData other = (ConsumerRequestCountsInDateRangeResponseData) o;
        return 
            Objects.deepEquals(this.applicationId, other.applicationId) &&
            Objects.deepEquals(this.consumerId, other.consumerId) &&
            Objects.deepEquals(this.startDatetime, other.startDatetime) &&
            Objects.deepEquals(this.endDatetime, other.endDatetime) &&
            Objects.deepEquals(this.aggregatedRequestCount, other.aggregatedRequestCount) &&
            Objects.deepEquals(this.requestCounts, other.requestCounts);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            applicationId,
            consumerId,
            startDatetime,
            endDatetime,
            aggregatedRequestCount,
            requestCounts);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConsumerRequestCountsInDateRangeResponseData.class,
                "applicationId", applicationId,
                "consumerId", consumerId,
                "startDatetime", startDatetime,
                "endDatetime", endDatetime,
                "aggregatedRequestCount", aggregatedRequestCount,
                "requestCounts", requestCounts);
    }
    
    public final static class Builder {
 
        private Optional<String> applicationId = Optional.empty();
 
        private Optional<String> consumerId = Optional.empty();
 
        private Optional<String> startDatetime = Optional.empty();
 
        private Optional<String> endDatetime = Optional.empty();
 
        private Optional<Double> aggregatedRequestCount = Optional.empty();
 
        private Optional<? extends RequestCountAllocation> requestCounts = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder startDatetime(String startDatetime) {
            Utils.checkNotNull(startDatetime, "startDatetime");
            this.startDatetime = Optional.ofNullable(startDatetime);
            return this;
        }

        public Builder startDatetime(Optional<String> startDatetime) {
            Utils.checkNotNull(startDatetime, "startDatetime");
            this.startDatetime = startDatetime;
            return this;
        }

        public Builder endDatetime(String endDatetime) {
            Utils.checkNotNull(endDatetime, "endDatetime");
            this.endDatetime = Optional.ofNullable(endDatetime);
            return this;
        }

        public Builder endDatetime(Optional<String> endDatetime) {
            Utils.checkNotNull(endDatetime, "endDatetime");
            this.endDatetime = endDatetime;
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
        
        public ConsumerRequestCountsInDateRangeResponseData build() {
            return new ConsumerRequestCountsInDateRangeResponseData(
                applicationId,
                consumerId,
                startDatetime,
                endDatetime,
                aggregatedRequestCount,
                requestCounts);
        }
    }
}
