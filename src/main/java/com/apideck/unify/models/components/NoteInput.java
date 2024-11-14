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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class NoteInput {

    /**
     * The title of the note
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private JsonNullable<String> title;

    /**
     * The content of the note.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("content")
    private JsonNullable<String> content;

    /**
     * The user that owns the note.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("owner_id")
    private JsonNullable<String> ownerId;

    /**
     * The contact that is related to the note.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contact_id")
    private JsonNullable<String> contactId;

    /**
     * The company that is related to the note.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_id")
    private JsonNullable<String> companyId;

    /**
     * The opportunity that is related to the note.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("opportunity_id")
    private JsonNullable<String> opportunityId;

    /**
     * The lead that is related to the note.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lead_id")
    private JsonNullable<String> leadId;

    /**
     * Whether the Note is active or not.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("active")
    private JsonNullable<Boolean> active;

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pass_through")
    private Optional<? extends List<PassThroughBody>> passThrough;

    @JsonCreator
    public NoteInput(
            @JsonProperty("title") JsonNullable<String> title,
            @JsonProperty("content") JsonNullable<String> content,
            @JsonProperty("owner_id") JsonNullable<String> ownerId,
            @JsonProperty("contact_id") JsonNullable<String> contactId,
            @JsonProperty("company_id") JsonNullable<String> companyId,
            @JsonProperty("opportunity_id") JsonNullable<String> opportunityId,
            @JsonProperty("lead_id") JsonNullable<String> leadId,
            @JsonProperty("active") JsonNullable<Boolean> active,
            @JsonProperty("pass_through") Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(content, "content");
        Utils.checkNotNull(ownerId, "ownerId");
        Utils.checkNotNull(contactId, "contactId");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(opportunityId, "opportunityId");
        Utils.checkNotNull(leadId, "leadId");
        Utils.checkNotNull(active, "active");
        Utils.checkNotNull(passThrough, "passThrough");
        this.title = title;
        this.content = content;
        this.ownerId = ownerId;
        this.contactId = contactId;
        this.companyId = companyId;
        this.opportunityId = opportunityId;
        this.leadId = leadId;
        this.active = active;
        this.passThrough = passThrough;
    }
    
    public NoteInput() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * The title of the note
     */
    @JsonIgnore
    public JsonNullable<String> title() {
        return title;
    }

    /**
     * The content of the note.
     */
    @JsonIgnore
    public JsonNullable<String> content() {
        return content;
    }

    /**
     * The user that owns the note.
     */
    @JsonIgnore
    public JsonNullable<String> ownerId() {
        return ownerId;
    }

    /**
     * The contact that is related to the note.
     */
    @JsonIgnore
    public JsonNullable<String> contactId() {
        return contactId;
    }

    /**
     * The company that is related to the note.
     */
    @JsonIgnore
    public JsonNullable<String> companyId() {
        return companyId;
    }

    /**
     * The opportunity that is related to the note.
     */
    @JsonIgnore
    public JsonNullable<String> opportunityId() {
        return opportunityId;
    }

    /**
     * The lead that is related to the note.
     */
    @JsonIgnore
    public JsonNullable<String> leadId() {
        return leadId;
    }

    /**
     * Whether the Note is active or not.
     */
    @JsonIgnore
    public JsonNullable<Boolean> active() {
        return active;
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
     * The title of the note
     */
    public NoteInput withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = JsonNullable.of(title);
        return this;
    }

    /**
     * The title of the note
     */
    public NoteInput withTitle(JsonNullable<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    /**
     * The content of the note.
     */
    public NoteInput withContent(String content) {
        Utils.checkNotNull(content, "content");
        this.content = JsonNullable.of(content);
        return this;
    }

    /**
     * The content of the note.
     */
    public NoteInput withContent(JsonNullable<String> content) {
        Utils.checkNotNull(content, "content");
        this.content = content;
        return this;
    }

    /**
     * The user that owns the note.
     */
    public NoteInput withOwnerId(String ownerId) {
        Utils.checkNotNull(ownerId, "ownerId");
        this.ownerId = JsonNullable.of(ownerId);
        return this;
    }

    /**
     * The user that owns the note.
     */
    public NoteInput withOwnerId(JsonNullable<String> ownerId) {
        Utils.checkNotNull(ownerId, "ownerId");
        this.ownerId = ownerId;
        return this;
    }

    /**
     * The contact that is related to the note.
     */
    public NoteInput withContactId(String contactId) {
        Utils.checkNotNull(contactId, "contactId");
        this.contactId = JsonNullable.of(contactId);
        return this;
    }

    /**
     * The contact that is related to the note.
     */
    public NoteInput withContactId(JsonNullable<String> contactId) {
        Utils.checkNotNull(contactId, "contactId");
        this.contactId = contactId;
        return this;
    }

    /**
     * The company that is related to the note.
     */
    public NoteInput withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = JsonNullable.of(companyId);
        return this;
    }

    /**
     * The company that is related to the note.
     */
    public NoteInput withCompanyId(JsonNullable<String> companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * The opportunity that is related to the note.
     */
    public NoteInput withOpportunityId(String opportunityId) {
        Utils.checkNotNull(opportunityId, "opportunityId");
        this.opportunityId = JsonNullable.of(opportunityId);
        return this;
    }

    /**
     * The opportunity that is related to the note.
     */
    public NoteInput withOpportunityId(JsonNullable<String> opportunityId) {
        Utils.checkNotNull(opportunityId, "opportunityId");
        this.opportunityId = opportunityId;
        return this;
    }

    /**
     * The lead that is related to the note.
     */
    public NoteInput withLeadId(String leadId) {
        Utils.checkNotNull(leadId, "leadId");
        this.leadId = JsonNullable.of(leadId);
        return this;
    }

    /**
     * The lead that is related to the note.
     */
    public NoteInput withLeadId(JsonNullable<String> leadId) {
        Utils.checkNotNull(leadId, "leadId");
        this.leadId = leadId;
        return this;
    }

    /**
     * Whether the Note is active or not.
     */
    public NoteInput withActive(boolean active) {
        Utils.checkNotNull(active, "active");
        this.active = JsonNullable.of(active);
        return this;
    }

    /**
     * Whether the Note is active or not.
     */
    public NoteInput withActive(JsonNullable<Boolean> active) {
        Utils.checkNotNull(active, "active");
        this.active = active;
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public NoteInput withPassThrough(List<PassThroughBody> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public NoteInput withPassThrough(Optional<? extends List<PassThroughBody>> passThrough) {
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
        NoteInput other = (NoteInput) o;
        return 
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.content, other.content) &&
            Objects.deepEquals(this.ownerId, other.ownerId) &&
            Objects.deepEquals(this.contactId, other.contactId) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.opportunityId, other.opportunityId) &&
            Objects.deepEquals(this.leadId, other.leadId) &&
            Objects.deepEquals(this.active, other.active) &&
            Objects.deepEquals(this.passThrough, other.passThrough);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            title,
            content,
            ownerId,
            contactId,
            companyId,
            opportunityId,
            leadId,
            active,
            passThrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(NoteInput.class,
                "title", title,
                "content", content,
                "ownerId", ownerId,
                "contactId", contactId,
                "companyId", companyId,
                "opportunityId", opportunityId,
                "leadId", leadId,
                "active", active,
                "passThrough", passThrough);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> title = JsonNullable.undefined();
 
        private JsonNullable<String> content = JsonNullable.undefined();
 
        private JsonNullable<String> ownerId = JsonNullable.undefined();
 
        private JsonNullable<String> contactId = JsonNullable.undefined();
 
        private JsonNullable<String> companyId = JsonNullable.undefined();
 
        private JsonNullable<String> opportunityId = JsonNullable.undefined();
 
        private JsonNullable<String> leadId = JsonNullable.undefined();
 
        private JsonNullable<Boolean> active = JsonNullable.undefined();
 
        private Optional<? extends List<PassThroughBody>> passThrough = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The title of the note
         */
        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = JsonNullable.of(title);
            return this;
        }

        /**
         * The title of the note
         */
        public Builder title(JsonNullable<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        /**
         * The content of the note.
         */
        public Builder content(String content) {
            Utils.checkNotNull(content, "content");
            this.content = JsonNullable.of(content);
            return this;
        }

        /**
         * The content of the note.
         */
        public Builder content(JsonNullable<String> content) {
            Utils.checkNotNull(content, "content");
            this.content = content;
            return this;
        }

        /**
         * The user that owns the note.
         */
        public Builder ownerId(String ownerId) {
            Utils.checkNotNull(ownerId, "ownerId");
            this.ownerId = JsonNullable.of(ownerId);
            return this;
        }

        /**
         * The user that owns the note.
         */
        public Builder ownerId(JsonNullable<String> ownerId) {
            Utils.checkNotNull(ownerId, "ownerId");
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The contact that is related to the note.
         */
        public Builder contactId(String contactId) {
            Utils.checkNotNull(contactId, "contactId");
            this.contactId = JsonNullable.of(contactId);
            return this;
        }

        /**
         * The contact that is related to the note.
         */
        public Builder contactId(JsonNullable<String> contactId) {
            Utils.checkNotNull(contactId, "contactId");
            this.contactId = contactId;
            return this;
        }

        /**
         * The company that is related to the note.
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = JsonNullable.of(companyId);
            return this;
        }

        /**
         * The company that is related to the note.
         */
        public Builder companyId(JsonNullable<String> companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }

        /**
         * The opportunity that is related to the note.
         */
        public Builder opportunityId(String opportunityId) {
            Utils.checkNotNull(opportunityId, "opportunityId");
            this.opportunityId = JsonNullable.of(opportunityId);
            return this;
        }

        /**
         * The opportunity that is related to the note.
         */
        public Builder opportunityId(JsonNullable<String> opportunityId) {
            Utils.checkNotNull(opportunityId, "opportunityId");
            this.opportunityId = opportunityId;
            return this;
        }

        /**
         * The lead that is related to the note.
         */
        public Builder leadId(String leadId) {
            Utils.checkNotNull(leadId, "leadId");
            this.leadId = JsonNullable.of(leadId);
            return this;
        }

        /**
         * The lead that is related to the note.
         */
        public Builder leadId(JsonNullable<String> leadId) {
            Utils.checkNotNull(leadId, "leadId");
            this.leadId = leadId;
            return this;
        }

        /**
         * Whether the Note is active or not.
         */
        public Builder active(boolean active) {
            Utils.checkNotNull(active, "active");
            this.active = JsonNullable.of(active);
            return this;
        }

        /**
         * Whether the Note is active or not.
         */
        public Builder active(JsonNullable<Boolean> active) {
            Utils.checkNotNull(active, "active");
            this.active = active;
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
        
        public NoteInput build() {
            return new NoteInput(
                title,
                content,
                ownerId,
                contactId,
                companyId,
                opportunityId,
                leadId,
                active,
                passThrough);
        }
    }
}

