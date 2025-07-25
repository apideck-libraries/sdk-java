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


public class HrisCompanyInput {

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("legal_name")
    private Optional<String> legalName;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("display_name")
    private JsonNullable<String> displayName;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subdomain")
    private JsonNullable<String> subdomain;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends HrisCompanyStatus> status;

    /**
     * An Company Number, Company ID or Company Code, is a unique number that has been assigned to each company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_number")
    private JsonNullable<String> companyNumber;

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private JsonNullable<? extends Currency> currency;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addresses")
    private Optional<? extends List<Address>> addresses;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone_numbers")
    private Optional<? extends List<PhoneNumber>> phoneNumbers;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emails")
    private Optional<? extends List<Email>> emails;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("websites")
    private Optional<? extends List<Website>> websites;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("debtor_id")
    private JsonNullable<String> debtorId;

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pass_through")
    private Optional<? extends List<PassThroughBody>> passThrough;

    @JsonCreator
    public HrisCompanyInput(
            @JsonProperty("legal_name") Optional<String> legalName,
            @JsonProperty("display_name") JsonNullable<String> displayName,
            @JsonProperty("subdomain") JsonNullable<String> subdomain,
            @JsonProperty("status") Optional<? extends HrisCompanyStatus> status,
            @JsonProperty("company_number") JsonNullable<String> companyNumber,
            @JsonProperty("currency") JsonNullable<? extends Currency> currency,
            @JsonProperty("addresses") Optional<? extends List<Address>> addresses,
            @JsonProperty("phone_numbers") Optional<? extends List<PhoneNumber>> phoneNumbers,
            @JsonProperty("emails") Optional<? extends List<Email>> emails,
            @JsonProperty("websites") Optional<? extends List<Website>> websites,
            @JsonProperty("debtor_id") JsonNullable<String> debtorId,
            @JsonProperty("pass_through") Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(legalName, "legalName");
        Utils.checkNotNull(displayName, "displayName");
        Utils.checkNotNull(subdomain, "subdomain");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(companyNumber, "companyNumber");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(addresses, "addresses");
        Utils.checkNotNull(phoneNumbers, "phoneNumbers");
        Utils.checkNotNull(emails, "emails");
        Utils.checkNotNull(websites, "websites");
        Utils.checkNotNull(debtorId, "debtorId");
        Utils.checkNotNull(passThrough, "passThrough");
        this.legalName = legalName;
        this.displayName = displayName;
        this.subdomain = subdomain;
        this.status = status;
        this.companyNumber = companyNumber;
        this.currency = currency;
        this.addresses = addresses;
        this.phoneNumbers = phoneNumbers;
        this.emails = emails;
        this.websites = websites;
        this.debtorId = debtorId;
        this.passThrough = passThrough;
    }
    
    public HrisCompanyInput() {
        this(Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(),
            Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), JsonNullable.undefined(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> legalName() {
        return legalName;
    }

    @JsonIgnore
    public JsonNullable<String> displayName() {
        return displayName;
    }

    @JsonIgnore
    public JsonNullable<String> subdomain() {
        return subdomain;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<HrisCompanyStatus> status() {
        return (Optional<HrisCompanyStatus>) status;
    }

    /**
     * An Company Number, Company ID or Company Code, is a unique number that has been assigned to each company.
     */
    @JsonIgnore
    public JsonNullable<String> companyNumber() {
        return companyNumber;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Currency> currency() {
        return (JsonNullable<Currency>) currency;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Address>> addresses() {
        return (Optional<List<Address>>) addresses;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<PhoneNumber>> phoneNumbers() {
        return (Optional<List<PhoneNumber>>) phoneNumbers;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Email>> emails() {
        return (Optional<List<Email>>) emails;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Website>> websites() {
        return (Optional<List<Website>>) websites;
    }

    @JsonIgnore
    public JsonNullable<String> debtorId() {
        return debtorId;
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


    public HrisCompanyInput withLegalName(String legalName) {
        Utils.checkNotNull(legalName, "legalName");
        this.legalName = Optional.ofNullable(legalName);
        return this;
    }


    public HrisCompanyInput withLegalName(Optional<String> legalName) {
        Utils.checkNotNull(legalName, "legalName");
        this.legalName = legalName;
        return this;
    }

    public HrisCompanyInput withDisplayName(String displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = JsonNullable.of(displayName);
        return this;
    }

    public HrisCompanyInput withDisplayName(JsonNullable<String> displayName) {
        Utils.checkNotNull(displayName, "displayName");
        this.displayName = displayName;
        return this;
    }

    public HrisCompanyInput withSubdomain(String subdomain) {
        Utils.checkNotNull(subdomain, "subdomain");
        this.subdomain = JsonNullable.of(subdomain);
        return this;
    }

    public HrisCompanyInput withSubdomain(JsonNullable<String> subdomain) {
        Utils.checkNotNull(subdomain, "subdomain");
        this.subdomain = subdomain;
        return this;
    }

    public HrisCompanyInput withStatus(HrisCompanyStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }


    public HrisCompanyInput withStatus(Optional<? extends HrisCompanyStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * An Company Number, Company ID or Company Code, is a unique number that has been assigned to each company.
     */
    public HrisCompanyInput withCompanyNumber(String companyNumber) {
        Utils.checkNotNull(companyNumber, "companyNumber");
        this.companyNumber = JsonNullable.of(companyNumber);
        return this;
    }

    /**
     * An Company Number, Company ID or Company Code, is a unique number that has been assigned to each company.
     */
    public HrisCompanyInput withCompanyNumber(JsonNullable<String> companyNumber) {
        Utils.checkNotNull(companyNumber, "companyNumber");
        this.companyNumber = companyNumber;
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public HrisCompanyInput withCurrency(Currency currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = JsonNullable.of(currency);
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public HrisCompanyInput withCurrency(JsonNullable<? extends Currency> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    public HrisCompanyInput withAddresses(List<Address> addresses) {
        Utils.checkNotNull(addresses, "addresses");
        this.addresses = Optional.ofNullable(addresses);
        return this;
    }


    public HrisCompanyInput withAddresses(Optional<? extends List<Address>> addresses) {
        Utils.checkNotNull(addresses, "addresses");
        this.addresses = addresses;
        return this;
    }

    public HrisCompanyInput withPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        Utils.checkNotNull(phoneNumbers, "phoneNumbers");
        this.phoneNumbers = Optional.ofNullable(phoneNumbers);
        return this;
    }


    public HrisCompanyInput withPhoneNumbers(Optional<? extends List<PhoneNumber>> phoneNumbers) {
        Utils.checkNotNull(phoneNumbers, "phoneNumbers");
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    public HrisCompanyInput withEmails(List<Email> emails) {
        Utils.checkNotNull(emails, "emails");
        this.emails = Optional.ofNullable(emails);
        return this;
    }


    public HrisCompanyInput withEmails(Optional<? extends List<Email>> emails) {
        Utils.checkNotNull(emails, "emails");
        this.emails = emails;
        return this;
    }

    public HrisCompanyInput withWebsites(List<Website> websites) {
        Utils.checkNotNull(websites, "websites");
        this.websites = Optional.ofNullable(websites);
        return this;
    }


    public HrisCompanyInput withWebsites(Optional<? extends List<Website>> websites) {
        Utils.checkNotNull(websites, "websites");
        this.websites = websites;
        return this;
    }

    public HrisCompanyInput withDebtorId(String debtorId) {
        Utils.checkNotNull(debtorId, "debtorId");
        this.debtorId = JsonNullable.of(debtorId);
        return this;
    }

    public HrisCompanyInput withDebtorId(JsonNullable<String> debtorId) {
        Utils.checkNotNull(debtorId, "debtorId");
        this.debtorId = debtorId;
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public HrisCompanyInput withPassThrough(List<PassThroughBody> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }


    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public HrisCompanyInput withPassThrough(Optional<? extends List<PassThroughBody>> passThrough) {
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
        HrisCompanyInput other = (HrisCompanyInput) o;
        return 
            Utils.enhancedDeepEquals(this.legalName, other.legalName) &&
            Utils.enhancedDeepEquals(this.displayName, other.displayName) &&
            Utils.enhancedDeepEquals(this.subdomain, other.subdomain) &&
            Utils.enhancedDeepEquals(this.status, other.status) &&
            Utils.enhancedDeepEquals(this.companyNumber, other.companyNumber) &&
            Utils.enhancedDeepEquals(this.currency, other.currency) &&
            Utils.enhancedDeepEquals(this.addresses, other.addresses) &&
            Utils.enhancedDeepEquals(this.phoneNumbers, other.phoneNumbers) &&
            Utils.enhancedDeepEquals(this.emails, other.emails) &&
            Utils.enhancedDeepEquals(this.websites, other.websites) &&
            Utils.enhancedDeepEquals(this.debtorId, other.debtorId) &&
            Utils.enhancedDeepEquals(this.passThrough, other.passThrough);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            legalName, displayName, subdomain,
            status, companyNumber, currency,
            addresses, phoneNumbers, emails,
            websites, debtorId, passThrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HrisCompanyInput.class,
                "legalName", legalName,
                "displayName", displayName,
                "subdomain", subdomain,
                "status", status,
                "companyNumber", companyNumber,
                "currency", currency,
                "addresses", addresses,
                "phoneNumbers", phoneNumbers,
                "emails", emails,
                "websites", websites,
                "debtorId", debtorId,
                "passThrough", passThrough);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> legalName = Optional.empty();

        private JsonNullable<String> displayName = JsonNullable.undefined();

        private JsonNullable<String> subdomain = JsonNullable.undefined();

        private Optional<? extends HrisCompanyStatus> status = Optional.empty();

        private JsonNullable<String> companyNumber = JsonNullable.undefined();

        private JsonNullable<? extends Currency> currency = JsonNullable.undefined();

        private Optional<? extends List<Address>> addresses = Optional.empty();

        private Optional<? extends List<PhoneNumber>> phoneNumbers = Optional.empty();

        private Optional<? extends List<Email>> emails = Optional.empty();

        private Optional<? extends List<Website>> websites = Optional.empty();

        private JsonNullable<String> debtorId = JsonNullable.undefined();

        private Optional<? extends List<PassThroughBody>> passThrough = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        public Builder legalName(String legalName) {
            Utils.checkNotNull(legalName, "legalName");
            this.legalName = Optional.ofNullable(legalName);
            return this;
        }

        public Builder legalName(Optional<String> legalName) {
            Utils.checkNotNull(legalName, "legalName");
            this.legalName = legalName;
            return this;
        }


        public Builder displayName(String displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = JsonNullable.of(displayName);
            return this;
        }

        public Builder displayName(JsonNullable<String> displayName) {
            Utils.checkNotNull(displayName, "displayName");
            this.displayName = displayName;
            return this;
        }


        public Builder subdomain(String subdomain) {
            Utils.checkNotNull(subdomain, "subdomain");
            this.subdomain = JsonNullable.of(subdomain);
            return this;
        }

        public Builder subdomain(JsonNullable<String> subdomain) {
            Utils.checkNotNull(subdomain, "subdomain");
            this.subdomain = subdomain;
            return this;
        }


        public Builder status(HrisCompanyStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        public Builder status(Optional<? extends HrisCompanyStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }


        /**
         * An Company Number, Company ID or Company Code, is a unique number that has been assigned to each company.
         */
        public Builder companyNumber(String companyNumber) {
            Utils.checkNotNull(companyNumber, "companyNumber");
            this.companyNumber = JsonNullable.of(companyNumber);
            return this;
        }

        /**
         * An Company Number, Company ID or Company Code, is a unique number that has been assigned to each company.
         */
        public Builder companyNumber(JsonNullable<String> companyNumber) {
            Utils.checkNotNull(companyNumber, "companyNumber");
            this.companyNumber = companyNumber;
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


        public Builder phoneNumbers(List<PhoneNumber> phoneNumbers) {
            Utils.checkNotNull(phoneNumbers, "phoneNumbers");
            this.phoneNumbers = Optional.ofNullable(phoneNumbers);
            return this;
        }

        public Builder phoneNumbers(Optional<? extends List<PhoneNumber>> phoneNumbers) {
            Utils.checkNotNull(phoneNumbers, "phoneNumbers");
            this.phoneNumbers = phoneNumbers;
            return this;
        }


        public Builder emails(List<Email> emails) {
            Utils.checkNotNull(emails, "emails");
            this.emails = Optional.ofNullable(emails);
            return this;
        }

        public Builder emails(Optional<? extends List<Email>> emails) {
            Utils.checkNotNull(emails, "emails");
            this.emails = emails;
            return this;
        }


        public Builder websites(List<Website> websites) {
            Utils.checkNotNull(websites, "websites");
            this.websites = Optional.ofNullable(websites);
            return this;
        }

        public Builder websites(Optional<? extends List<Website>> websites) {
            Utils.checkNotNull(websites, "websites");
            this.websites = websites;
            return this;
        }


        public Builder debtorId(String debtorId) {
            Utils.checkNotNull(debtorId, "debtorId");
            this.debtorId = JsonNullable.of(debtorId);
            return this;
        }

        public Builder debtorId(JsonNullable<String> debtorId) {
            Utils.checkNotNull(debtorId, "debtorId");
            this.debtorId = debtorId;
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

        public HrisCompanyInput build() {

            return new HrisCompanyInput(
                legalName, displayName, subdomain,
                status, companyNumber, currency,
                addresses, phoneNumbers, emails,
                websites, debtorId, passThrough);
        }

    }
}
