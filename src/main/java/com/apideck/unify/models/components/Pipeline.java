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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class Pipeline {

    /**
     * The unique identifier of the Pipeline.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * The name of the Pipeline.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private JsonNullable<? extends Currency> currency;

    /**
     * Whether the Pipeline is archived or not.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("archived")
    private Optional<Boolean> archived;

    /**
     * Whether the Pipeline is active or not.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("active")
    private Optional<Boolean> active;

    /**
     * The order in which the Pipeline is displayed in the UI.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("display_order")
    private JsonNullable<Long> displayOrder;

    /**
     * Whether the Pipeline has win probability enabled or not.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("win_probability_enabled")
    private Optional<Boolean> winProbabilityEnabled;

    /**
     * The Pipeline Stages.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stages")
    private Optional<? extends List<Stages>> stages;

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
    public Pipeline(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("name") String name,
            @JsonProperty("currency") JsonNullable<? extends Currency> currency,
            @JsonProperty("archived") Optional<Boolean> archived,
            @JsonProperty("active") Optional<Boolean> active,
            @JsonProperty("display_order") JsonNullable<Long> displayOrder,
            @JsonProperty("win_probability_enabled") Optional<Boolean> winProbabilityEnabled,
            @JsonProperty("stages") Optional<? extends List<Stages>> stages,
            @JsonProperty("updated_at") JsonNullable<OffsetDateTime> updatedAt,
            @JsonProperty("created_at") JsonNullable<OffsetDateTime> createdAt,
            @JsonProperty("pass_through") Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(archived, "archived");
        Utils.checkNotNull(active, "active");
        Utils.checkNotNull(displayOrder, "displayOrder");
        Utils.checkNotNull(winProbabilityEnabled, "winProbabilityEnabled");
        Utils.checkNotNull(stages, "stages");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(passThrough, "passThrough");
        this.id = id;
        this.name = name;
        this.currency = currency;
        this.archived = archived;
        this.active = active;
        this.displayOrder = displayOrder;
        this.winProbabilityEnabled = winProbabilityEnabled;
        this.stages = stages;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.passThrough = passThrough;
    }
    
    public Pipeline(
            String name) {
        this(Optional.empty(), name, JsonNullable.undefined(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * The unique identifier of the Pipeline.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * The name of the Pipeline.
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Currency> currency() {
        return (JsonNullable<Currency>) currency;
    }

    /**
     * Whether the Pipeline is archived or not.
     */
    @JsonIgnore
    public Optional<Boolean> archived() {
        return archived;
    }

    /**
     * Whether the Pipeline is active or not.
     */
    @JsonIgnore
    public Optional<Boolean> active() {
        return active;
    }

    /**
     * The order in which the Pipeline is displayed in the UI.
     */
    @JsonIgnore
    public JsonNullable<Long> displayOrder() {
        return displayOrder;
    }

    /**
     * Whether the Pipeline has win probability enabled or not.
     */
    @JsonIgnore
    public Optional<Boolean> winProbabilityEnabled() {
        return winProbabilityEnabled;
    }

    /**
     * The Pipeline Stages.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Stages>> stages() {
        return (Optional<List<Stages>>) stages;
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
     * The unique identifier of the Pipeline.
     */
    public Pipeline withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * The unique identifier of the Pipeline.
     */
    public Pipeline withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The name of the Pipeline.
     */
    public Pipeline withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public Pipeline withCurrency(Currency currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = JsonNullable.of(currency);
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public Pipeline withCurrency(JsonNullable<? extends Currency> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * Whether the Pipeline is archived or not.
     */
    public Pipeline withArchived(boolean archived) {
        Utils.checkNotNull(archived, "archived");
        this.archived = Optional.ofNullable(archived);
        return this;
    }

    /**
     * Whether the Pipeline is archived or not.
     */
    public Pipeline withArchived(Optional<Boolean> archived) {
        Utils.checkNotNull(archived, "archived");
        this.archived = archived;
        return this;
    }

    /**
     * Whether the Pipeline is active or not.
     */
    public Pipeline withActive(boolean active) {
        Utils.checkNotNull(active, "active");
        this.active = Optional.ofNullable(active);
        return this;
    }

    /**
     * Whether the Pipeline is active or not.
     */
    public Pipeline withActive(Optional<Boolean> active) {
        Utils.checkNotNull(active, "active");
        this.active = active;
        return this;
    }

    /**
     * The order in which the Pipeline is displayed in the UI.
     */
    public Pipeline withDisplayOrder(long displayOrder) {
        Utils.checkNotNull(displayOrder, "displayOrder");
        this.displayOrder = JsonNullable.of(displayOrder);
        return this;
    }

    /**
     * The order in which the Pipeline is displayed in the UI.
     */
    public Pipeline withDisplayOrder(JsonNullable<Long> displayOrder) {
        Utils.checkNotNull(displayOrder, "displayOrder");
        this.displayOrder = displayOrder;
        return this;
    }

    /**
     * Whether the Pipeline has win probability enabled or not.
     */
    public Pipeline withWinProbabilityEnabled(boolean winProbabilityEnabled) {
        Utils.checkNotNull(winProbabilityEnabled, "winProbabilityEnabled");
        this.winProbabilityEnabled = Optional.ofNullable(winProbabilityEnabled);
        return this;
    }

    /**
     * Whether the Pipeline has win probability enabled or not.
     */
    public Pipeline withWinProbabilityEnabled(Optional<Boolean> winProbabilityEnabled) {
        Utils.checkNotNull(winProbabilityEnabled, "winProbabilityEnabled");
        this.winProbabilityEnabled = winProbabilityEnabled;
        return this;
    }

    /**
     * The Pipeline Stages.
     */
    public Pipeline withStages(List<Stages> stages) {
        Utils.checkNotNull(stages, "stages");
        this.stages = Optional.ofNullable(stages);
        return this;
    }

    /**
     * The Pipeline Stages.
     */
    public Pipeline withStages(Optional<? extends List<Stages>> stages) {
        Utils.checkNotNull(stages, "stages");
        this.stages = stages;
        return this;
    }

    /**
     * The date and time when the object was last updated.
     */
    public Pipeline withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * The date and time when the object was last updated.
     */
    public Pipeline withUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The date and time when the object was created.
     */
    public Pipeline withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = JsonNullable.of(createdAt);
        return this;
    }

    /**
     * The date and time when the object was created.
     */
    public Pipeline withCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public Pipeline withPassThrough(List<PassThroughBody> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public Pipeline withPassThrough(Optional<? extends List<PassThroughBody>> passThrough) {
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
        Pipeline other = (Pipeline) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.archived, other.archived) &&
            Objects.deepEquals(this.active, other.active) &&
            Objects.deepEquals(this.displayOrder, other.displayOrder) &&
            Objects.deepEquals(this.winProbabilityEnabled, other.winProbabilityEnabled) &&
            Objects.deepEquals(this.stages, other.stages) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.passThrough, other.passThrough);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            currency,
            archived,
            active,
            displayOrder,
            winProbabilityEnabled,
            stages,
            updatedAt,
            createdAt,
            passThrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Pipeline.class,
                "id", id,
                "name", name,
                "currency", currency,
                "archived", archived,
                "active", active,
                "displayOrder", displayOrder,
                "winProbabilityEnabled", winProbabilityEnabled,
                "stages", stages,
                "updatedAt", updatedAt,
                "createdAt", createdAt,
                "passThrough", passThrough);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private String name;
 
        private JsonNullable<? extends Currency> currency = JsonNullable.undefined();
 
        private Optional<Boolean> archived = Optional.empty();
 
        private Optional<Boolean> active = Optional.empty();
 
        private JsonNullable<Long> displayOrder = JsonNullable.undefined();
 
        private Optional<Boolean> winProbabilityEnabled = Optional.empty();
 
        private Optional<? extends List<Stages>> stages = Optional.empty();
 
        private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> createdAt = JsonNullable.undefined();
 
        private Optional<? extends List<PassThroughBody>> passThrough = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique identifier of the Pipeline.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * The unique identifier of the Pipeline.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The name of the Pipeline.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
         */
        public Builder currency(Currency currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = JsonNullable.of(currency);
            return this;
        }

        /**
         * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
         */
        public Builder currency(JsonNullable<? extends Currency> currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
            return this;
        }

        /**
         * Whether the Pipeline is archived or not.
         */
        public Builder archived(boolean archived) {
            Utils.checkNotNull(archived, "archived");
            this.archived = Optional.ofNullable(archived);
            return this;
        }

        /**
         * Whether the Pipeline is archived or not.
         */
        public Builder archived(Optional<Boolean> archived) {
            Utils.checkNotNull(archived, "archived");
            this.archived = archived;
            return this;
        }

        /**
         * Whether the Pipeline is active or not.
         */
        public Builder active(boolean active) {
            Utils.checkNotNull(active, "active");
            this.active = Optional.ofNullable(active);
            return this;
        }

        /**
         * Whether the Pipeline is active or not.
         */
        public Builder active(Optional<Boolean> active) {
            Utils.checkNotNull(active, "active");
            this.active = active;
            return this;
        }

        /**
         * The order in which the Pipeline is displayed in the UI.
         */
        public Builder displayOrder(long displayOrder) {
            Utils.checkNotNull(displayOrder, "displayOrder");
            this.displayOrder = JsonNullable.of(displayOrder);
            return this;
        }

        /**
         * The order in which the Pipeline is displayed in the UI.
         */
        public Builder displayOrder(JsonNullable<Long> displayOrder) {
            Utils.checkNotNull(displayOrder, "displayOrder");
            this.displayOrder = displayOrder;
            return this;
        }

        /**
         * Whether the Pipeline has win probability enabled or not.
         */
        public Builder winProbabilityEnabled(boolean winProbabilityEnabled) {
            Utils.checkNotNull(winProbabilityEnabled, "winProbabilityEnabled");
            this.winProbabilityEnabled = Optional.ofNullable(winProbabilityEnabled);
            return this;
        }

        /**
         * Whether the Pipeline has win probability enabled or not.
         */
        public Builder winProbabilityEnabled(Optional<Boolean> winProbabilityEnabled) {
            Utils.checkNotNull(winProbabilityEnabled, "winProbabilityEnabled");
            this.winProbabilityEnabled = winProbabilityEnabled;
            return this;
        }

        /**
         * The Pipeline Stages.
         */
        public Builder stages(List<Stages> stages) {
            Utils.checkNotNull(stages, "stages");
            this.stages = Optional.ofNullable(stages);
            return this;
        }

        /**
         * The Pipeline Stages.
         */
        public Builder stages(Optional<? extends List<Stages>> stages) {
            Utils.checkNotNull(stages, "stages");
            this.stages = stages;
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
        
        public Pipeline build() {
            return new Pipeline(
                id,
                name,
                currency,
                archived,
                active,
                displayOrder,
                winProbabilityEnabled,
                stages,
                updatedAt,
                createdAt,
                passThrough);
        }
    }
}

