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
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class Application {

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("applicant_id")
    private Optional<String> applicantId;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("job_id")
    private Optional<String> jobId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private JsonNullable<? extends ApplicationStatus> status;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stage")
    private Optional<? extends Stage> stage;

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_mappings")
    private JsonNullable<? extends CustomMappings> customMappings;

    /**
     * The user who last updated the object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_by")
    private JsonNullable<String> updatedBy;

    /**
     * The user who created the object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    private JsonNullable<String> createdBy;

    /**
     * The date and time when the object was last updated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private JsonNullable<OffsetDateTime> updatedAt;

    /**
     * The date and time when the object was created.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private JsonNullable<OffsetDateTime> createdAt;

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pass_through")
    private Optional<? extends List<PassThroughBody>> passThrough;

    @JsonCreator
    public Application(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("applicant_id") Optional<String> applicantId,
            @JsonProperty("job_id") Optional<String> jobId,
            @JsonProperty("status") JsonNullable<? extends ApplicationStatus> status,
            @JsonProperty("stage") Optional<? extends Stage> stage,
            @JsonProperty("custom_mappings") JsonNullable<? extends CustomMappings> customMappings,
            @JsonProperty("updated_by") JsonNullable<String> updatedBy,
            @JsonProperty("created_by") JsonNullable<String> createdBy,
            @JsonProperty("updated_at") JsonNullable<OffsetDateTime> updatedAt,
            @JsonProperty("created_at") JsonNullable<OffsetDateTime> createdAt,
            @JsonProperty("pass_through") Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(applicantId, "applicantId");
        Utils.checkNotNull(jobId, "jobId");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(stage, "stage");
        Utils.checkNotNull(customMappings, "customMappings");
        Utils.checkNotNull(updatedBy, "updatedBy");
        Utils.checkNotNull(createdBy, "createdBy");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(passThrough, "passThrough");
        this.id = id;
        this.applicantId = applicantId;
        this.jobId = jobId;
        this.status = status;
        this.stage = stage;
        this.customMappings = customMappings;
        this.updatedBy = updatedBy;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.passThrough = passThrough;
    }
    
    public Application() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> applicantId() {
        return applicantId;
    }

    @JsonIgnore
    public Optional<String> jobId() {
        return jobId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<ApplicationStatus> status() {
        return (JsonNullable<ApplicationStatus>) status;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Stage> stage() {
        return (Optional<Stage>) stage;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<CustomMappings> customMappings() {
        return (JsonNullable<CustomMappings>) customMappings;
    }

    /**
     * The user who last updated the object.
     */
    @JsonIgnore
    public JsonNullable<String> updatedBy() {
        return updatedBy;
    }

    /**
     * The user who created the object.
     */
    @JsonIgnore
    public JsonNullable<String> createdBy() {
        return createdBy;
    }

    /**
     * The date and time when the object was last updated.
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    /**
     * The date and time when the object was created.
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> createdAt() {
        return createdAt;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<PassThroughBody>> passThrough() {
        return (Optional<List<PassThroughBody>>) passThrough;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique identifier for an object.
     */
    public Application withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Application withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Application withApplicantId(String applicantId) {
        Utils.checkNotNull(applicantId, "applicantId");
        this.applicantId = Optional.ofNullable(applicantId);
        return this;
    }

    public Application withApplicantId(Optional<String> applicantId) {
        Utils.checkNotNull(applicantId, "applicantId");
        this.applicantId = applicantId;
        return this;
    }

    public Application withJobId(String jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = Optional.ofNullable(jobId);
        return this;
    }

    public Application withJobId(Optional<String> jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
        return this;
    }

    public Application withStatus(ApplicationStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = JsonNullable.of(status);
        return this;
    }

    public Application withStatus(JsonNullable<? extends ApplicationStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public Application withStage(Stage stage) {
        Utils.checkNotNull(stage, "stage");
        this.stage = Optional.ofNullable(stage);
        return this;
    }

    public Application withStage(Optional<? extends Stage> stage) {
        Utils.checkNotNull(stage, "stage");
        this.stage = stage;
        return this;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    public Application withCustomMappings(CustomMappings customMappings) {
        Utils.checkNotNull(customMappings, "customMappings");
        this.customMappings = JsonNullable.of(customMappings);
        return this;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    public Application withCustomMappings(JsonNullable<? extends CustomMappings> customMappings) {
        Utils.checkNotNull(customMappings, "customMappings");
        this.customMappings = customMappings;
        return this;
    }

    /**
     * The user who last updated the object.
     */
    public Application withUpdatedBy(String updatedBy) {
        Utils.checkNotNull(updatedBy, "updatedBy");
        this.updatedBy = JsonNullable.of(updatedBy);
        return this;
    }

    /**
     * The user who last updated the object.
     */
    public Application withUpdatedBy(JsonNullable<String> updatedBy) {
        Utils.checkNotNull(updatedBy, "updatedBy");
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * The user who created the object.
     */
    public Application withCreatedBy(String createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = JsonNullable.of(createdBy);
        return this;
    }

    /**
     * The user who created the object.
     */
    public Application withCreatedBy(JsonNullable<String> createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    /**
     * The date and time when the object was last updated.
     */
    public Application withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * The date and time when the object was last updated.
     */
    public Application withUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The date and time when the object was created.
     */
    public Application withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = JsonNullable.of(createdAt);
        return this;
    }

    /**
     * The date and time when the object was created.
     */
    public Application withCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public Application withPassThrough(List<PassThroughBody> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public Application withPassThrough(Optional<? extends List<PassThroughBody>> passThrough) {
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
        Application other = (Application) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.applicantId, other.applicantId) &&
            Objects.deepEquals(this.jobId, other.jobId) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.stage, other.stage) &&
            Objects.deepEquals(this.customMappings, other.customMappings) &&
            Objects.deepEquals(this.updatedBy, other.updatedBy) &&
            Objects.deepEquals(this.createdBy, other.createdBy) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.passThrough, other.passThrough);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            applicantId,
            jobId,
            status,
            stage,
            customMappings,
            updatedBy,
            createdBy,
            updatedAt,
            createdAt,
            passThrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Application.class,
                "id", id,
                "applicantId", applicantId,
                "jobId", jobId,
                "status", status,
                "stage", stage,
                "customMappings", customMappings,
                "updatedBy", updatedBy,
                "createdBy", createdBy,
                "updatedAt", updatedAt,
                "createdAt", createdAt,
                "passThrough", passThrough);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> applicantId = Optional.empty();
 
        private Optional<String> jobId = Optional.empty();
 
        private JsonNullable<? extends ApplicationStatus> status = JsonNullable.undefined();
 
        private Optional<? extends Stage> stage = Optional.empty();
 
        private JsonNullable<? extends CustomMappings> customMappings = JsonNullable.undefined();
 
        private JsonNullable<String> updatedBy = JsonNullable.undefined();
 
        private JsonNullable<String> createdBy = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> createdAt = JsonNullable.undefined();
 
        private Optional<? extends List<PassThroughBody>> passThrough = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A unique identifier for an object.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder applicantId(String applicantId) {
            Utils.checkNotNull(applicantId, "applicantId");
            this.applicantId = Optional.ofNullable(applicantId);
            return this;
        }

        public Builder applicantId(Optional<String> applicantId) {
            Utils.checkNotNull(applicantId, "applicantId");
            this.applicantId = applicantId;
            return this;
        }

        public Builder jobId(String jobId) {
            Utils.checkNotNull(jobId, "jobId");
            this.jobId = Optional.ofNullable(jobId);
            return this;
        }

        public Builder jobId(Optional<String> jobId) {
            Utils.checkNotNull(jobId, "jobId");
            this.jobId = jobId;
            return this;
        }

        public Builder status(ApplicationStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = JsonNullable.of(status);
            return this;
        }

        public Builder status(JsonNullable<? extends ApplicationStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder stage(Stage stage) {
            Utils.checkNotNull(stage, "stage");
            this.stage = Optional.ofNullable(stage);
            return this;
        }

        public Builder stage(Optional<? extends Stage> stage) {
            Utils.checkNotNull(stage, "stage");
            this.stage = stage;
            return this;
        }

        /**
         * When custom mappings are configured on the resource, the result is included here.
         */
        public Builder customMappings(CustomMappings customMappings) {
            Utils.checkNotNull(customMappings, "customMappings");
            this.customMappings = JsonNullable.of(customMappings);
            return this;
        }

        /**
         * When custom mappings are configured on the resource, the result is included here.
         */
        public Builder customMappings(JsonNullable<? extends CustomMappings> customMappings) {
            Utils.checkNotNull(customMappings, "customMappings");
            this.customMappings = customMappings;
            return this;
        }

        /**
         * The user who last updated the object.
         */
        public Builder updatedBy(String updatedBy) {
            Utils.checkNotNull(updatedBy, "updatedBy");
            this.updatedBy = JsonNullable.of(updatedBy);
            return this;
        }

        /**
         * The user who last updated the object.
         */
        public Builder updatedBy(JsonNullable<String> updatedBy) {
            Utils.checkNotNull(updatedBy, "updatedBy");
            this.updatedBy = updatedBy;
            return this;
        }

        /**
         * The user who created the object.
         */
        public Builder createdBy(String createdBy) {
            Utils.checkNotNull(createdBy, "createdBy");
            this.createdBy = JsonNullable.of(createdBy);
            return this;
        }

        /**
         * The user who created the object.
         */
        public Builder createdBy(JsonNullable<String> createdBy) {
            Utils.checkNotNull(createdBy, "createdBy");
            this.createdBy = createdBy;
            return this;
        }

        /**
         * The date and time when the object was last updated.
         */
        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = JsonNullable.of(updatedAt);
            return this;
        }

        /**
         * The date and time when the object was last updated.
         */
        public Builder updatedAt(JsonNullable<OffsetDateTime> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * The date and time when the object was created.
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = JsonNullable.of(createdAt);
            return this;
        }

        /**
         * The date and time when the object was created.
         */
        public Builder createdAt(JsonNullable<OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
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
        
        public Application build() {
            return new Application(
                id,
                applicantId,
                jobId,
                status,
                stage,
                customMappings,
                updatedBy,
                createdBy,
                updatedAt,
                createdAt,
                passThrough);
        }
    }
}

