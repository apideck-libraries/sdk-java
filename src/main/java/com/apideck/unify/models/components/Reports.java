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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class Reports {

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * The name of the report
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("report_name")
    private Optional<String> reportName;

    /**
     * The start date of the report
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<String> startDate;

    /**
     * The start date of the report
     */
    @JsonProperty("end_date")
    private String endDate;

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private JsonNullable<? extends Currency> currency;

    /**
     * A balance sheet assets account represents the financial position of a company at a specific point in time.
     */
    @JsonProperty("assets")
    private BalanceSheetAssetsAccount assets;

    /**
     * A balance sheet liabilities account represents the financial position of a company at a specific point in time.
     */
    @JsonProperty("liabilities")
    private BalanceSheetLiabilitiesAccount liabilities;

    /**
     * A balance sheet equity account represents the financial position of a company at a specific point in time.
     */
    @JsonProperty("equity")
    private BalanceSheetEquityAccount equity;

    /**
     * The net assets of the balance sheet
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("net_assets")
    private Optional<Double> netAssets;

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
     * A balance sheet uncategorized items account represents the financial position of a company at a specific point in time.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uncategorized_items")
    private Optional<? extends BalanceSheetUncategorizedItemsAccount> uncategorizedItems;

    @JsonCreator
    public Reports(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("report_name") Optional<String> reportName,
            @JsonProperty("start_date") Optional<String> startDate,
            @JsonProperty("end_date") String endDate,
            @JsonProperty("currency") JsonNullable<? extends Currency> currency,
            @JsonProperty("assets") BalanceSheetAssetsAccount assets,
            @JsonProperty("liabilities") BalanceSheetLiabilitiesAccount liabilities,
            @JsonProperty("equity") BalanceSheetEquityAccount equity,
            @JsonProperty("net_assets") Optional<Double> netAssets,
            @JsonProperty("custom_mappings") JsonNullable<? extends CustomMappings> customMappings,
            @JsonProperty("updated_by") JsonNullable<String> updatedBy,
            @JsonProperty("created_by") JsonNullable<String> createdBy,
            @JsonProperty("updated_at") JsonNullable<OffsetDateTime> updatedAt,
            @JsonProperty("created_at") JsonNullable<OffsetDateTime> createdAt,
            @JsonProperty("uncategorized_items") Optional<? extends BalanceSheetUncategorizedItemsAccount> uncategorizedItems) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(reportName, "reportName");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(assets, "assets");
        Utils.checkNotNull(liabilities, "liabilities");
        Utils.checkNotNull(equity, "equity");
        Utils.checkNotNull(netAssets, "netAssets");
        Utils.checkNotNull(customMappings, "customMappings");
        Utils.checkNotNull(updatedBy, "updatedBy");
        Utils.checkNotNull(createdBy, "createdBy");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(uncategorizedItems, "uncategorizedItems");
        this.id = id;
        this.reportName = reportName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.currency = currency;
        this.assets = assets;
        this.liabilities = liabilities;
        this.equity = equity;
        this.netAssets = netAssets;
        this.customMappings = customMappings;
        this.updatedBy = updatedBy;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.uncategorizedItems = uncategorizedItems;
    }
    
    public Reports(
            String endDate,
            BalanceSheetAssetsAccount assets,
            BalanceSheetLiabilitiesAccount liabilities,
            BalanceSheetEquityAccount equity) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), endDate, JsonNullable.undefined(), assets, liabilities, equity, Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * The name of the report
     */
    @JsonIgnore
    public Optional<String> reportName() {
        return reportName;
    }

    /**
     * The start date of the report
     */
    @JsonIgnore
    public Optional<String> startDate() {
        return startDate;
    }

    /**
     * The start date of the report
     */
    @JsonIgnore
    public String endDate() {
        return endDate;
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
     * A balance sheet assets account represents the financial position of a company at a specific point in time.
     */
    @JsonIgnore
    public BalanceSheetAssetsAccount assets() {
        return assets;
    }

    /**
     * A balance sheet liabilities account represents the financial position of a company at a specific point in time.
     */
    @JsonIgnore
    public BalanceSheetLiabilitiesAccount liabilities() {
        return liabilities;
    }

    /**
     * A balance sheet equity account represents the financial position of a company at a specific point in time.
     */
    @JsonIgnore
    public BalanceSheetEquityAccount equity() {
        return equity;
    }

    /**
     * The net assets of the balance sheet
     */
    @JsonIgnore
    public Optional<Double> netAssets() {
        return netAssets;
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
     * A balance sheet uncategorized items account represents the financial position of a company at a specific point in time.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BalanceSheetUncategorizedItemsAccount> uncategorizedItems() {
        return (Optional<BalanceSheetUncategorizedItemsAccount>) uncategorizedItems;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique identifier for an object.
     */
    public Reports withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Reports withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The name of the report
     */
    public Reports withReportName(String reportName) {
        Utils.checkNotNull(reportName, "reportName");
        this.reportName = Optional.ofNullable(reportName);
        return this;
    }

    /**
     * The name of the report
     */
    public Reports withReportName(Optional<String> reportName) {
        Utils.checkNotNull(reportName, "reportName");
        this.reportName = reportName;
        return this;
    }

    /**
     * The start date of the report
     */
    public Reports withStartDate(String startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * The start date of the report
     */
    public Reports withStartDate(Optional<String> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * The start date of the report
     */
    public Reports withEndDate(String endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public Reports withCurrency(Currency currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = JsonNullable.of(currency);
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public Reports withCurrency(JsonNullable<? extends Currency> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * A balance sheet assets account represents the financial position of a company at a specific point in time.
     */
    public Reports withAssets(BalanceSheetAssetsAccount assets) {
        Utils.checkNotNull(assets, "assets");
        this.assets = assets;
        return this;
    }

    /**
     * A balance sheet liabilities account represents the financial position of a company at a specific point in time.
     */
    public Reports withLiabilities(BalanceSheetLiabilitiesAccount liabilities) {
        Utils.checkNotNull(liabilities, "liabilities");
        this.liabilities = liabilities;
        return this;
    }

    /**
     * A balance sheet equity account represents the financial position of a company at a specific point in time.
     */
    public Reports withEquity(BalanceSheetEquityAccount equity) {
        Utils.checkNotNull(equity, "equity");
        this.equity = equity;
        return this;
    }

    /**
     * The net assets of the balance sheet
     */
    public Reports withNetAssets(double netAssets) {
        Utils.checkNotNull(netAssets, "netAssets");
        this.netAssets = Optional.ofNullable(netAssets);
        return this;
    }

    /**
     * The net assets of the balance sheet
     */
    public Reports withNetAssets(Optional<Double> netAssets) {
        Utils.checkNotNull(netAssets, "netAssets");
        this.netAssets = netAssets;
        return this;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    public Reports withCustomMappings(CustomMappings customMappings) {
        Utils.checkNotNull(customMappings, "customMappings");
        this.customMappings = JsonNullable.of(customMappings);
        return this;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    public Reports withCustomMappings(JsonNullable<? extends CustomMappings> customMappings) {
        Utils.checkNotNull(customMappings, "customMappings");
        this.customMappings = customMappings;
        return this;
    }

    /**
     * The user who last updated the object.
     */
    public Reports withUpdatedBy(String updatedBy) {
        Utils.checkNotNull(updatedBy, "updatedBy");
        this.updatedBy = JsonNullable.of(updatedBy);
        return this;
    }

    /**
     * The user who last updated the object.
     */
    public Reports withUpdatedBy(JsonNullable<String> updatedBy) {
        Utils.checkNotNull(updatedBy, "updatedBy");
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * The user who created the object.
     */
    public Reports withCreatedBy(String createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = JsonNullable.of(createdBy);
        return this;
    }

    /**
     * The user who created the object.
     */
    public Reports withCreatedBy(JsonNullable<String> createdBy) {
        Utils.checkNotNull(createdBy, "createdBy");
        this.createdBy = createdBy;
        return this;
    }

    /**
     * The date and time when the object was last updated.
     */
    public Reports withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * The date and time when the object was last updated.
     */
    public Reports withUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The date and time when the object was created.
     */
    public Reports withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = JsonNullable.of(createdAt);
        return this;
    }

    /**
     * The date and time when the object was created.
     */
    public Reports withCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * A balance sheet uncategorized items account represents the financial position of a company at a specific point in time.
     */
    public Reports withUncategorizedItems(BalanceSheetUncategorizedItemsAccount uncategorizedItems) {
        Utils.checkNotNull(uncategorizedItems, "uncategorizedItems");
        this.uncategorizedItems = Optional.ofNullable(uncategorizedItems);
        return this;
    }

    /**
     * A balance sheet uncategorized items account represents the financial position of a company at a specific point in time.
     */
    public Reports withUncategorizedItems(Optional<? extends BalanceSheetUncategorizedItemsAccount> uncategorizedItems) {
        Utils.checkNotNull(uncategorizedItems, "uncategorizedItems");
        this.uncategorizedItems = uncategorizedItems;
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
        Reports other = (Reports) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.reportName, other.reportName) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.endDate, other.endDate) &&
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.assets, other.assets) &&
            Objects.deepEquals(this.liabilities, other.liabilities) &&
            Objects.deepEquals(this.equity, other.equity) &&
            Objects.deepEquals(this.netAssets, other.netAssets) &&
            Objects.deepEquals(this.customMappings, other.customMappings) &&
            Objects.deepEquals(this.updatedBy, other.updatedBy) &&
            Objects.deepEquals(this.createdBy, other.createdBy) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.uncategorizedItems, other.uncategorizedItems);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            reportName,
            startDate,
            endDate,
            currency,
            assets,
            liabilities,
            equity,
            netAssets,
            customMappings,
            updatedBy,
            createdBy,
            updatedAt,
            createdAt,
            uncategorizedItems);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Reports.class,
                "id", id,
                "reportName", reportName,
                "startDate", startDate,
                "endDate", endDate,
                "currency", currency,
                "assets", assets,
                "liabilities", liabilities,
                "equity", equity,
                "netAssets", netAssets,
                "customMappings", customMappings,
                "updatedBy", updatedBy,
                "createdBy", createdBy,
                "updatedAt", updatedAt,
                "createdAt", createdAt,
                "uncategorizedItems", uncategorizedItems);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> reportName = Optional.empty();
 
        private Optional<String> startDate = Optional.empty();
 
        private String endDate;
 
        private JsonNullable<? extends Currency> currency = JsonNullable.undefined();
 
        private BalanceSheetAssetsAccount assets;
 
        private BalanceSheetLiabilitiesAccount liabilities;
 
        private BalanceSheetEquityAccount equity;
 
        private Optional<Double> netAssets = Optional.empty();
 
        private JsonNullable<? extends CustomMappings> customMappings = JsonNullable.undefined();
 
        private JsonNullable<String> updatedBy = JsonNullable.undefined();
 
        private JsonNullable<String> createdBy = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> createdAt = JsonNullable.undefined();
 
        private Optional<? extends BalanceSheetUncategorizedItemsAccount> uncategorizedItems = Optional.empty();  
        
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

        /**
         * The name of the report
         */
        public Builder reportName(String reportName) {
            Utils.checkNotNull(reportName, "reportName");
            this.reportName = Optional.ofNullable(reportName);
            return this;
        }

        /**
         * The name of the report
         */
        public Builder reportName(Optional<String> reportName) {
            Utils.checkNotNull(reportName, "reportName");
            this.reportName = reportName;
            return this;
        }

        /**
         * The start date of the report
         */
        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * The start date of the report
         */
        public Builder startDate(Optional<String> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * The start date of the report
         */
        public Builder endDate(String endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
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
         * A balance sheet assets account represents the financial position of a company at a specific point in time.
         */
        public Builder assets(BalanceSheetAssetsAccount assets) {
            Utils.checkNotNull(assets, "assets");
            this.assets = assets;
            return this;
        }

        /**
         * A balance sheet liabilities account represents the financial position of a company at a specific point in time.
         */
        public Builder liabilities(BalanceSheetLiabilitiesAccount liabilities) {
            Utils.checkNotNull(liabilities, "liabilities");
            this.liabilities = liabilities;
            return this;
        }

        /**
         * A balance sheet equity account represents the financial position of a company at a specific point in time.
         */
        public Builder equity(BalanceSheetEquityAccount equity) {
            Utils.checkNotNull(equity, "equity");
            this.equity = equity;
            return this;
        }

        /**
         * The net assets of the balance sheet
         */
        public Builder netAssets(double netAssets) {
            Utils.checkNotNull(netAssets, "netAssets");
            this.netAssets = Optional.ofNullable(netAssets);
            return this;
        }

        /**
         * The net assets of the balance sheet
         */
        public Builder netAssets(Optional<Double> netAssets) {
            Utils.checkNotNull(netAssets, "netAssets");
            this.netAssets = netAssets;
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
         * A balance sheet uncategorized items account represents the financial position of a company at a specific point in time.
         */
        public Builder uncategorizedItems(BalanceSheetUncategorizedItemsAccount uncategorizedItems) {
            Utils.checkNotNull(uncategorizedItems, "uncategorizedItems");
            this.uncategorizedItems = Optional.ofNullable(uncategorizedItems);
            return this;
        }

        /**
         * A balance sheet uncategorized items account represents the financial position of a company at a specific point in time.
         */
        public Builder uncategorizedItems(Optional<? extends BalanceSheetUncategorizedItemsAccount> uncategorizedItems) {
            Utils.checkNotNull(uncategorizedItems, "uncategorizedItems");
            this.uncategorizedItems = uncategorizedItems;
            return this;
        }
        
        public Reports build() {
            return new Reports(
                id,
                reportName,
                startDate,
                endDate,
                currency,
                assets,
                liabilities,
                equity,
                netAssets,
                customMappings,
                updatedBy,
                createdBy,
                updatedAt,
                createdAt,
                uncategorizedItems);
        }
    }
}

