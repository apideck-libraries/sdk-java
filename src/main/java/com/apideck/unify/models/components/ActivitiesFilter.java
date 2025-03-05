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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

public class ActivitiesFilter {

    /**
     * Company ID to filter on
     */
    @SpeakeasyMetadata("queryParam:name=company_id")
    private Optional<String> companyId;

    /**
     * Owner ID to filter on
     */
    @SpeakeasyMetadata("queryParam:name=owner_id")
    private Optional<String> ownerId;

    /**
     * Primary contact ID to filter on
     */
    @SpeakeasyMetadata("queryParam:name=contact_id")
    private Optional<String> contactId;

    @SpeakeasyMetadata("queryParam:name=updated_since")
    private Optional<OffsetDateTime> updatedSince;

    /**
     * Type to filter on
     */
    @SpeakeasyMetadata("queryParam:name=type")
    private Optional<String> type;

    @JsonCreator
    public ActivitiesFilter(
            Optional<String> companyId,
            Optional<String> ownerId,
            Optional<String> contactId,
            Optional<OffsetDateTime> updatedSince,
            Optional<String> type) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(ownerId, "ownerId");
        Utils.checkNotNull(contactId, "contactId");
        Utils.checkNotNull(updatedSince, "updatedSince");
        Utils.checkNotNull(type, "type");
        this.companyId = companyId;
        this.ownerId = ownerId;
        this.contactId = contactId;
        this.updatedSince = updatedSince;
        this.type = type;
    }
    
    public ActivitiesFilter() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Company ID to filter on
     */
    @JsonIgnore
    public Optional<String> companyId() {
        return companyId;
    }

    /**
     * Owner ID to filter on
     */
    @JsonIgnore
    public Optional<String> ownerId() {
        return ownerId;
    }

    /**
     * Primary contact ID to filter on
     */
    @JsonIgnore
    public Optional<String> contactId() {
        return contactId;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedSince() {
        return updatedSince;
    }

    /**
     * Type to filter on
     */
    @JsonIgnore
    public Optional<String> type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Company ID to filter on
     */
    public ActivitiesFilter withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = Optional.ofNullable(companyId);
        return this;
    }

    /**
     * Company ID to filter on
     */
    public ActivitiesFilter withCompanyId(Optional<String> companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Owner ID to filter on
     */
    public ActivitiesFilter withOwnerId(String ownerId) {
        Utils.checkNotNull(ownerId, "ownerId");
        this.ownerId = Optional.ofNullable(ownerId);
        return this;
    }

    /**
     * Owner ID to filter on
     */
    public ActivitiesFilter withOwnerId(Optional<String> ownerId) {
        Utils.checkNotNull(ownerId, "ownerId");
        this.ownerId = ownerId;
        return this;
    }

    /**
     * Primary contact ID to filter on
     */
    public ActivitiesFilter withContactId(String contactId) {
        Utils.checkNotNull(contactId, "contactId");
        this.contactId = Optional.ofNullable(contactId);
        return this;
    }

    /**
     * Primary contact ID to filter on
     */
    public ActivitiesFilter withContactId(Optional<String> contactId) {
        Utils.checkNotNull(contactId, "contactId");
        this.contactId = contactId;
        return this;
    }

    public ActivitiesFilter withUpdatedSince(OffsetDateTime updatedSince) {
        Utils.checkNotNull(updatedSince, "updatedSince");
        this.updatedSince = Optional.ofNullable(updatedSince);
        return this;
    }

    public ActivitiesFilter withUpdatedSince(Optional<OffsetDateTime> updatedSince) {
        Utils.checkNotNull(updatedSince, "updatedSince");
        this.updatedSince = updatedSince;
        return this;
    }

    /**
     * Type to filter on
     */
    public ActivitiesFilter withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * Type to filter on
     */
    public ActivitiesFilter withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        ActivitiesFilter other = (ActivitiesFilter) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.ownerId, other.ownerId) &&
            Objects.deepEquals(this.contactId, other.contactId) &&
            Objects.deepEquals(this.updatedSince, other.updatedSince) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            ownerId,
            contactId,
            updatedSince,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ActivitiesFilter.class,
                "companyId", companyId,
                "ownerId", ownerId,
                "contactId", contactId,
                "updatedSince", updatedSince,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<String> companyId = Optional.empty();
 
        private Optional<String> ownerId = Optional.empty();
 
        private Optional<String> contactId = Optional.empty();
 
        private Optional<OffsetDateTime> updatedSince = Optional.empty();
 
        private Optional<String> type = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Company ID to filter on
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = Optional.ofNullable(companyId);
            return this;
        }

        /**
         * Company ID to filter on
         */
        public Builder companyId(Optional<String> companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }

        /**
         * Owner ID to filter on
         */
        public Builder ownerId(String ownerId) {
            Utils.checkNotNull(ownerId, "ownerId");
            this.ownerId = Optional.ofNullable(ownerId);
            return this;
        }

        /**
         * Owner ID to filter on
         */
        public Builder ownerId(Optional<String> ownerId) {
            Utils.checkNotNull(ownerId, "ownerId");
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Primary contact ID to filter on
         */
        public Builder contactId(String contactId) {
            Utils.checkNotNull(contactId, "contactId");
            this.contactId = Optional.ofNullable(contactId);
            return this;
        }

        /**
         * Primary contact ID to filter on
         */
        public Builder contactId(Optional<String> contactId) {
            Utils.checkNotNull(contactId, "contactId");
            this.contactId = contactId;
            return this;
        }

        public Builder updatedSince(OffsetDateTime updatedSince) {
            Utils.checkNotNull(updatedSince, "updatedSince");
            this.updatedSince = Optional.ofNullable(updatedSince);
            return this;
        }

        public Builder updatedSince(Optional<OffsetDateTime> updatedSince) {
            Utils.checkNotNull(updatedSince, "updatedSince");
            this.updatedSince = updatedSince;
            return this;
        }

        /**
         * Type to filter on
         */
        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * Type to filter on
         */
        public Builder type(Optional<String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public ActivitiesFilter build() {
            return new ActivitiesFilter(
                companyId,
                ownerId,
                contactId,
                updatedSince,
                type);
        }
    }
}

