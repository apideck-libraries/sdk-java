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
import java.util.List;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class AccountingLocationInput {
    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent_id")
    private JsonNullable<String> parentId;

    /**
     * The name of the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_name")
    private JsonNullable<String> companyName;

    /**
     * The display name of the location.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("display_name")
    private JsonNullable<String> displayName;

    /**
     * Based on the status some functionality is enabled or disabled.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends LocationStatus> status;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addresses")
    private Optional<? extends List<Address>> addresses;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subsidiaries")
    private Optional<? extends List<SubsidiaryReferenceInput>> subsidiaries;

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("row_version")
    private JsonNullable<String> rowVersion;

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pass_through")
    private Optional<? extends List<PassThroughBody>> passThrough;

    @JsonCreator
    public AccountingLocationInput(
            @JsonProperty("parent_id") JsonNullable<String> parentId,
            @JsonProperty("company_name") JsonNullable<String> companyName,
            @JsonProperty("display_name") JsonNullable<String> displayName,
            @JsonProperty("status") Optional<? extends LocationStatus> status,
            @JsonProperty("addresses") Optional<? extends List<Address>> addresses,
            @JsonProperty("subsidiaries") Optional<? extends List<SubsidiaryReferenceInput>> subsidiaries,
            @JsonProperty("row_version") JsonNullable<String> rowVersion,
            @JsonProperty("pass_through") Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(parentId, "parentId");
        Utils.checkNotNull(companyName, "companyName");
        Utils.checkNotNull(displayName, "displayName");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(addresses, "addresses");
        Utils.checkNotNull(subsidiaries, "subsidiaries");
        Utils.checkNotNull(rowVersion, "rowVersion");
        Utils.checkNotNull(passThrough, "passThrough");
        this.parentId = parentId;
        this.companyName = companyName;
        this.displayName = displayName;
        this.status = status;
        this.addresses = addresses;
        this.subsidiaries = subsidiaries;
        this.rowVersion = rowVersion;
        this.passThrough = passThrough;
    }
    
    public AccountingLocationInput() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            JsonNullable.undefined(), Optional.empty());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public JsonNullable<String> parentId() {
        return parentId;
    }

    /**
     * The name of the company.
     */
    @JsonIgnore
    public JsonNullable<String> companyName() {
        return companyName;
    }

    /**
     * The display name of the location.
     */
    @JsonIgnore
    public JsonNullable<String> displayName() {
        return displayName;
    }

    /**
     * Based on the status some functionality is enabled or disabled.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LocationStatus> status() {
        return (Optional<LocationStatus>) status;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Address>> addresses() {
        return (Optional<List<Address>>) addresses;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<SubsidiaryReferenceInput>> subsidiaries() {
        return (Optional<List<SubsidiaryReferenceInput>>) subsidiaries;
    }

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    @JsonIgnore
    public JsonNullable<String> rowVersion() {
        return rowVersion;
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
     * A unique identifier for an object.
     */
    public AccountingLocationInput withParentId(String parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = JsonNullable.of(parentId);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public AccountingLocationInput withParentId(JsonNullable<String> parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = parentId;
        return this;
    }

    /**
     * The name of the company.
     */
    public AccountingLocationInput withCompanyName(String companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = JsonNullable.of(companyName);
        return this;
    }

    /**
     * The name of the company.
     */
    public AccountingLocationInput withCompanyName(JsonNullable<String> companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = companyName;
        return this;
    }

    /**
     * The display name of the location.
     */
    public AccountingLocationInput withDisplayName(String displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = JsonNullable.of(displayName);
        return this;
    }

    /**
     * The display name of the location.
     */
    public AccountingLocationInput withDisplayName(JsonNullable<String> displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = displayName;
        return this;
    }

    /**
     * Based on the status some functionality is enabled or disabled.
     */
    public AccountingLocationInput withStatus(LocationStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }


    /**
     * Based on the status some functionality is enabled or disabled.
     */
    public AccountingLocationInput withStatus(Optional<? extends LocationStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public AccountingLocationInput withAddresses(List<Address> addresses) {
        Utils.checkNotNull(addresses, "addresses");
        this.addresses = Optional.ofNullable(addresses);
        return this;
    }


    public AccountingLocationInput withAddresses(Optional<? extends List<Address>> addresses) {
        Utils.checkNotNull(addresses, "addresses");
        this.addresses = addresses;
        return this;
    }

    public AccountingLocationInput withSubsidiaries(List<SubsidiaryReferenceInput> subsidiaries) {
        Utils.checkNotNull(subsidiaries, "subsidiaries");
        this.subsidiaries = Optional.ofNullable(subsidiaries);
        return this;
    }


    public AccountingLocationInput withSubsidiaries(Optional<? extends List<SubsidiaryReferenceInput>> subsidiaries) {
        Utils.checkNotNull(subsidiaries, "subsidiaries");
        this.subsidiaries = subsidiaries;
        return this;
    }

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    public AccountingLocationInput withRowVersion(String rowVersion) {
        Utils.checkNotNull(rowVersion, "rowVersion");
        this.rowVersion = JsonNullable.of(rowVersion);
        return this;
    }

    /**
     * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
     */
    public AccountingLocationInput withRowVersion(JsonNullable<String> rowVersion) {
        Utils.checkNotNull(rowVersion, "rowVersion");
        this.rowVersion = rowVersion;
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public AccountingLocationInput withPassThrough(List<PassThroughBody> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }


    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public AccountingLocationInput withPassThrough(Optional<? extends List<PassThroughBody>> passThrough) {
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
        AccountingLocationInput other = (AccountingLocationInput) o;
        return 
            Utils.enhancedDeepEquals(this.parentId, other.parentId) &&
            Utils.enhancedDeepEquals(this.companyName, other.companyName) &&
            Utils.enhancedDeepEquals(this.displayName, other.displayName) &&
            Utils.enhancedDeepEquals(this.status, other.status) &&
            Utils.enhancedDeepEquals(this.addresses, other.addresses) &&
            Utils.enhancedDeepEquals(this.subsidiaries, other.subsidiaries) &&
            Utils.enhancedDeepEquals(this.rowVersion, other.rowVersion) &&
            Utils.enhancedDeepEquals(this.passThrough, other.passThrough);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            parentId, companyName, displayName,
            status, addresses, subsidiaries,
            rowVersion, passThrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingLocationInput.class,
                "parentId", parentId,
                "companyName", companyName,
                "displayName", displayName,
                "status", status,
                "addresses", addresses,
                "subsidiaries", subsidiaries,
                "rowVersion", rowVersion,
                "passThrough", passThrough);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<String> parentId = JsonNullable.undefined();

        private JsonNullable<String> companyName = JsonNullable.undefined();

        private JsonNullable<String> displayName = JsonNullable.undefined();

        private Optional<? extends LocationStatus> status = Optional.empty();

        private Optional<? extends List<Address>> addresses = Optional.empty();

        private Optional<? extends List<SubsidiaryReferenceInput>> subsidiaries = Optional.empty();

        private JsonNullable<String> rowVersion = JsonNullable.undefined();

        private Optional<? extends List<PassThroughBody>> passThrough = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * A unique identifier for an object.
         */
        public Builder parentId(String parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = JsonNullable.of(parentId);
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder parentId(JsonNullable<String> parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = parentId;
            return this;
        }


        /**
         * The name of the company.
         */
        public Builder companyName(String companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = JsonNullable.of(companyName);
            return this;
        }

        /**
         * The name of the company.
         */
        public Builder companyName(JsonNullable<String> companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = companyName;
            return this;
        }


        /**
         * The display name of the location.
         */
        public Builder displayName(String displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = JsonNullable.of(displayName);
            return this;
        }

        /**
         * The display name of the location.
         */
        public Builder displayName(JsonNullable<String> displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = displayName;
            return this;
        }


        /**
         * Based on the status some functionality is enabled or disabled.
         */
        public Builder status(LocationStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Based on the status some functionality is enabled or disabled.
         */
        public Builder status(Optional<? extends LocationStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }


        public Builder addresses(List<Address> addresses) {
            Utils.checkNotNull(addresses, "addresses");
            this.addresses = Optional.ofNullable(addresses);
            return this;
        }

        public Builder addresses(Optional<? extends List<Address>> addresses) {
            Utils.checkNotNull(addresses, "addresses");
            this.addresses = addresses;
            return this;
        }


        public Builder subsidiaries(List<SubsidiaryReferenceInput> subsidiaries) {
            Utils.checkNotNull(subsidiaries, "subsidiaries");
            this.subsidiaries = Optional.ofNullable(subsidiaries);
            return this;
        }

        public Builder subsidiaries(Optional<? extends List<SubsidiaryReferenceInput>> subsidiaries) {
            Utils.checkNotNull(subsidiaries, "subsidiaries");
            this.subsidiaries = subsidiaries;
            return this;
        }


        /**
         * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
         */
        public Builder rowVersion(String rowVersion) {
            Utils.checkNotNull(rowVersion, "rowVersion");
            this.rowVersion = JsonNullable.of(rowVersion);
            return this;
        }

        /**
         * A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.
         */
        public Builder rowVersion(JsonNullable<String> rowVersion) {
            Utils.checkNotNull(rowVersion, "rowVersion");
            this.rowVersion = rowVersion;
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

        public AccountingLocationInput build() {

            return new AccountingLocationInput(
                parentId, companyName, displayName,
                status, addresses, subsidiaries,
                rowVersion, passThrough);
        }

    }
}
