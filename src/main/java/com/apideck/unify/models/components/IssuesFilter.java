/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;


public class IssuesFilter {
    /**
     * Filter by ticket status, can be `open`, `closed` or `all`. Will passthrough if none of the above match
     */
    @SpeakeasyMetadata("queryParam:name=status")
    private Optional<? extends List<String>> status;

    /**
     * Only return tickets since a specific date
     */
    @SpeakeasyMetadata("queryParam:name=since")
    private Optional<OffsetDateTime> since;

    /**
     * Only return tickets assigned to a specific user
     */
    @SpeakeasyMetadata("queryParam:name=assignee_id")
    private Optional<String> assigneeId;

    @JsonCreator
    public IssuesFilter(
            Optional<? extends List<String>> status,
            Optional<OffsetDateTime> since,
            Optional<String> assigneeId) {
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(since, "since");
        Utils.checkNotNull(assigneeId, "assigneeId");
        this.status = status;
        this.since = since;
        this.assigneeId = assigneeId;
    }
    
    public IssuesFilter() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Filter by ticket status, can be `open`, `closed` or `all`. Will passthrough if none of the above match
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> status() {
        return (Optional<List<String>>) status;
    }

    /**
     * Only return tickets since a specific date
     */
    @JsonIgnore
    public Optional<OffsetDateTime> since() {
        return since;
    }

    /**
     * Only return tickets assigned to a specific user
     */
    @JsonIgnore
    public Optional<String> assigneeId() {
        return assigneeId;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Filter by ticket status, can be `open`, `closed` or `all`. Will passthrough if none of the above match
     */
    public IssuesFilter withStatus(List<String> status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }


    /**
     * Filter by ticket status, can be `open`, `closed` or `all`. Will passthrough if none of the above match
     */
    public IssuesFilter withStatus(Optional<? extends List<String>> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Only return tickets since a specific date
     */
    public IssuesFilter withSince(OffsetDateTime since) {
        Utils.checkNotNull(since, "since");
        this.since = Optional.ofNullable(since);
        return this;
    }


    /**
     * Only return tickets since a specific date
     */
    public IssuesFilter withSince(Optional<OffsetDateTime> since) {
        Utils.checkNotNull(since, "since");
        this.since = since;
        return this;
    }

    /**
     * Only return tickets assigned to a specific user
     */
    public IssuesFilter withAssigneeId(String assigneeId) {
        Utils.checkNotNull(assigneeId, "assigneeId");
        this.assigneeId = Optional.ofNullable(assigneeId);
        return this;
    }


    /**
     * Only return tickets assigned to a specific user
     */
    public IssuesFilter withAssigneeId(Optional<String> assigneeId) {
        Utils.checkNotNull(assigneeId, "assigneeId");
        this.assigneeId = assigneeId;
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
        IssuesFilter other = (IssuesFilter) o;
        return 
            Utils.enhancedDeepEquals(this.status, other.status) &&
            Utils.enhancedDeepEquals(this.since, other.since) &&
            Utils.enhancedDeepEquals(this.assigneeId, other.assigneeId);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            status, since, assigneeId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(IssuesFilter.class,
                "status", status,
                "since", since,
                "assigneeId", assigneeId);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<? extends List<String>> status = Optional.empty();

        private Optional<OffsetDateTime> since = Optional.empty();

        private Optional<String> assigneeId = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Filter by ticket status, can be `open`, `closed` or `all`. Will passthrough if none of the above match
         */
        public Builder status(List<String> status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Filter by ticket status, can be `open`, `closed` or `all`. Will passthrough if none of the above match
         */
        public Builder status(Optional<? extends List<String>> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }


        /**
         * Only return tickets since a specific date
         */
        public Builder since(OffsetDateTime since) {
            Utils.checkNotNull(since, "since");
            this.since = Optional.ofNullable(since);
            return this;
        }

        /**
         * Only return tickets since a specific date
         */
        public Builder since(Optional<OffsetDateTime> since) {
            Utils.checkNotNull(since, "since");
            this.since = since;
            return this;
        }


        /**
         * Only return tickets assigned to a specific user
         */
        public Builder assigneeId(String assigneeId) {
            Utils.checkNotNull(assigneeId, "assigneeId");
            this.assigneeId = Optional.ofNullable(assigneeId);
            return this;
        }

        /**
         * Only return tickets assigned to a specific user
         */
        public Builder assigneeId(Optional<String> assigneeId) {
            Utils.checkNotNull(assigneeId, "assigneeId");
            this.assigneeId = assigneeId;
            return this;
        }

        public IssuesFilter build() {

            return new IssuesFilter(
                status, since, assigneeId);
        }

    }
}
