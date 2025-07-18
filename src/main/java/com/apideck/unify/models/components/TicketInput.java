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
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class TicketInput {
    /**
     * The ticket's parent ID
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent_id")
    private JsonNullable<String> parentId;

    /**
     * The ticket's type
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private JsonNullable<String> type;

    /**
     * Subject of the ticket
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subject")
    private JsonNullable<String> subject;

    /**
     * The ticket's description. HTML version of description is mapped if supported by the third-party platform
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * The current status of the ticket. Possible values include: open, in_progress, closed, or - in cases where there is no clear mapping - the original value passed through.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private JsonNullable<String> status;

    /**
     * Priority of the ticket
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("priority")
    private JsonNullable<? extends Priority> priority;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("assignees")
    private Optional<? extends List<AssigneeInput>> assignees;

    /**
     * Due date of the ticket
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("due_date")
    private JsonNullable<OffsetDateTime> dueDate;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    private Optional<? extends List<CollectionTagInput>> tags;

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pass_through")
    private Optional<? extends List<PassThroughBody>> passThrough;

    @JsonCreator
    public TicketInput(
            @JsonProperty("parent_id") JsonNullable<String> parentId,
            @JsonProperty("type") JsonNullable<String> type,
            @JsonProperty("subject") JsonNullable<String> subject,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("status") JsonNullable<String> status,
            @JsonProperty("priority") JsonNullable<? extends Priority> priority,
            @JsonProperty("assignees") Optional<? extends List<AssigneeInput>> assignees,
            @JsonProperty("due_date") JsonNullable<OffsetDateTime> dueDate,
            @JsonProperty("tags") Optional<? extends List<CollectionTagInput>> tags,
            @JsonProperty("pass_through") Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(parentId, "parentId");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(subject, "subject");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(priority, "priority");
        Utils.checkNotNull(assignees, "assignees");
        Utils.checkNotNull(dueDate, "dueDate");
        Utils.checkNotNull(tags, "tags");
        Utils.checkNotNull(passThrough, "passThrough");
        this.parentId = parentId;
        this.type = type;
        this.subject = subject;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.assignees = assignees;
        this.dueDate = dueDate;
        this.tags = tags;
        this.passThrough = passThrough;
    }
    
    public TicketInput() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            Optional.empty(), JsonNullable.undefined(), Optional.empty(),
            Optional.empty());
    }

    /**
     * The ticket's parent ID
     */
    @JsonIgnore
    public JsonNullable<String> parentId() {
        return parentId;
    }

    /**
     * The ticket's type
     */
    @JsonIgnore
    public JsonNullable<String> type() {
        return type;
    }

    /**
     * Subject of the ticket
     */
    @JsonIgnore
    public JsonNullable<String> subject() {
        return subject;
    }

    /**
     * The ticket's description. HTML version of description is mapped if supported by the third-party platform
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * The current status of the ticket. Possible values include: open, in_progress, closed, or - in cases where there is no clear mapping - the original value passed through.
     */
    @JsonIgnore
    public JsonNullable<String> status() {
        return status;
    }

    /**
     * Priority of the ticket
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Priority> priority() {
        return (JsonNullable<Priority>) priority;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<AssigneeInput>> assignees() {
        return (Optional<List<AssigneeInput>>) assignees;
    }

    /**
     * Due date of the ticket
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> dueDate() {
        return dueDate;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<CollectionTagInput>> tags() {
        return (Optional<List<CollectionTagInput>>) tags;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<PassThroughBody>> passThrough() {
        return (Optional<List<PassThroughBody>>) passThrough;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The ticket's parent ID
     */
    public TicketInput withParentId(String parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = JsonNullable.of(parentId);
        return this;
    }

    /**
     * The ticket's parent ID
     */
    public TicketInput withParentId(JsonNullable<String> parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = parentId;
        return this;
    }

    /**
     * The ticket's type
     */
    public TicketInput withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * The ticket's type
     */
    public TicketInput withType(JsonNullable<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Subject of the ticket
     */
    public TicketInput withSubject(String subject) {
        Utils.checkNotNull(subject, "subject");
        this.subject = JsonNullable.of(subject);
        return this;
    }

    /**
     * Subject of the ticket
     */
    public TicketInput withSubject(JsonNullable<String> subject) {
        Utils.checkNotNull(subject, "subject");
        this.subject = subject;
        return this;
    }

    /**
     * The ticket's description. HTML version of description is mapped if supported by the third-party platform
     */
    public TicketInput withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * The ticket's description. HTML version of description is mapped if supported by the third-party platform
     */
    public TicketInput withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * The current status of the ticket. Possible values include: open, in_progress, closed, or - in cases where there is no clear mapping - the original value passed through.
     */
    public TicketInput withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = JsonNullable.of(status);
        return this;
    }

    /**
     * The current status of the ticket. Possible values include: open, in_progress, closed, or - in cases where there is no clear mapping - the original value passed through.
     */
    public TicketInput withStatus(JsonNullable<String> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Priority of the ticket
     */
    public TicketInput withPriority(Priority priority) {
        Utils.checkNotNull(priority, "priority");
        this.priority = JsonNullable.of(priority);
        return this;
    }

    /**
     * Priority of the ticket
     */
    public TicketInput withPriority(JsonNullable<? extends Priority> priority) {
        Utils.checkNotNull(priority, "priority");
        this.priority = priority;
        return this;
    }

    public TicketInput withAssignees(List<AssigneeInput> assignees) {
        Utils.checkNotNull(assignees, "assignees");
        this.assignees = Optional.ofNullable(assignees);
        return this;
    }


    public TicketInput withAssignees(Optional<? extends List<AssigneeInput>> assignees) {
        Utils.checkNotNull(assignees, "assignees");
        this.assignees = assignees;
        return this;
    }

    /**
     * Due date of the ticket
     */
    public TicketInput withDueDate(OffsetDateTime dueDate) {
        Utils.checkNotNull(dueDate, "dueDate");
        this.dueDate = JsonNullable.of(dueDate);
        return this;
    }

    /**
     * Due date of the ticket
     */
    public TicketInput withDueDate(JsonNullable<OffsetDateTime> dueDate) {
        Utils.checkNotNull(dueDate, "dueDate");
        this.dueDate = dueDate;
        return this;
    }

    public TicketInput withTags(List<CollectionTagInput> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = Optional.ofNullable(tags);
        return this;
    }


    public TicketInput withTags(Optional<? extends List<CollectionTagInput>> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public TicketInput withPassThrough(List<PassThroughBody> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }


    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public TicketInput withPassThrough(Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = passThrough;
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
        TicketInput other = (TicketInput) o;
        return 
            Utils.enhancedDeepEquals(this.parentId, other.parentId) &&
            Utils.enhancedDeepEquals(this.type, other.type) &&
            Utils.enhancedDeepEquals(this.subject, other.subject) &&
            Utils.enhancedDeepEquals(this.description, other.description) &&
            Utils.enhancedDeepEquals(this.status, other.status) &&
            Utils.enhancedDeepEquals(this.priority, other.priority) &&
            Utils.enhancedDeepEquals(this.assignees, other.assignees) &&
            Utils.enhancedDeepEquals(this.dueDate, other.dueDate) &&
            Utils.enhancedDeepEquals(this.tags, other.tags) &&
            Utils.enhancedDeepEquals(this.passThrough, other.passThrough);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            parentId, type, subject,
            description, status, priority,
            assignees, dueDate, tags,
            passThrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TicketInput.class,
                "parentId", parentId,
                "type", type,
                "subject", subject,
                "description", description,
                "status", status,
                "priority", priority,
                "assignees", assignees,
                "dueDate", dueDate,
                "tags", tags,
                "passThrough", passThrough);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<String> parentId = JsonNullable.undefined();

        private JsonNullable<String> type = JsonNullable.undefined();

        private JsonNullable<String> subject = JsonNullable.undefined();

        private JsonNullable<String> description = JsonNullable.undefined();

        private JsonNullable<String> status = JsonNullable.undefined();

        private JsonNullable<? extends Priority> priority = JsonNullable.undefined();

        private Optional<? extends List<AssigneeInput>> assignees = Optional.empty();

        private JsonNullable<OffsetDateTime> dueDate = JsonNullable.undefined();

        private Optional<? extends List<CollectionTagInput>> tags = Optional.empty();

        private Optional<? extends List<PassThroughBody>> passThrough = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The ticket's parent ID
         */
        public Builder parentId(String parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = JsonNullable.of(parentId);
            return this;
        }

        /**
         * The ticket's parent ID
         */
        public Builder parentId(JsonNullable<String> parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = parentId;
            return this;
        }


        /**
         * The ticket's type
         */
        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        /**
         * The ticket's type
         */
        public Builder type(JsonNullable<String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }


        /**
         * Subject of the ticket
         */
        public Builder subject(String subject) {
            Utils.checkNotNull(subject, "subject");
            this.subject = JsonNullable.of(subject);
            return this;
        }

        /**
         * Subject of the ticket
         */
        public Builder subject(JsonNullable<String> subject) {
            Utils.checkNotNull(subject, "subject");
            this.subject = subject;
            return this;
        }


        /**
         * The ticket's description. HTML version of description is mapped if supported by the third-party platform
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * The ticket's description. HTML version of description is mapped if supported by the third-party platform
         */
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }


        /**
         * The current status of the ticket. Possible values include: open, in_progress, closed, or - in cases where there is no clear mapping - the original value passed through.
         */
        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = JsonNullable.of(status);
            return this;
        }

        /**
         * The current status of the ticket. Possible values include: open, in_progress, closed, or - in cases where there is no clear mapping - the original value passed through.
         */
        public Builder status(JsonNullable<String> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }


        /**
         * Priority of the ticket
         */
        public Builder priority(Priority priority) {
            Utils.checkNotNull(priority, "priority");
            this.priority = JsonNullable.of(priority);
            return this;
        }

        /**
         * Priority of the ticket
         */
        public Builder priority(JsonNullable<? extends Priority> priority) {
            Utils.checkNotNull(priority, "priority");
            this.priority = priority;
            return this;
        }


        public Builder assignees(List<AssigneeInput> assignees) {
            Utils.checkNotNull(assignees, "assignees");
            this.assignees = Optional.ofNullable(assignees);
            return this;
        }

        public Builder assignees(Optional<? extends List<AssigneeInput>> assignees) {
            Utils.checkNotNull(assignees, "assignees");
            this.assignees = assignees;
            return this;
        }


        /**
         * Due date of the ticket
         */
        public Builder dueDate(OffsetDateTime dueDate) {
            Utils.checkNotNull(dueDate, "dueDate");
            this.dueDate = JsonNullable.of(dueDate);
            return this;
        }

        /**
         * Due date of the ticket
         */
        public Builder dueDate(JsonNullable<OffsetDateTime> dueDate) {
            Utils.checkNotNull(dueDate, "dueDate");
            this.dueDate = dueDate;
            return this;
        }


        public Builder tags(List<CollectionTagInput> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        public Builder tags(Optional<? extends List<CollectionTagInput>> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = tags;
            return this;
        }


        /**
         * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
         */
        public Builder passThrough(List<PassThroughBody> passThrough) {
            Utils.checkNotNull(passThrough, "passThrough");
            this.passThrough = Optional.ofNullable(passThrough);
            return this;
        }

        /**
         * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
         */
        public Builder passThrough(Optional<? extends List<PassThroughBody>> passThrough) {
            Utils.checkNotNull(passThrough, "passThrough");
            this.passThrough = passThrough;
            return this;
        }

        public TicketInput build() {

            return new TicketInput(
                parentId, type, subject,
                description, status, priority,
                assignees, dueDate, tags,
                passThrough);
        }

    }
}
