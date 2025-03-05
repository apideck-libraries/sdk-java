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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

public class EcommerceStore {

    /**
     * A unique identifier for an object.
     */
    @JsonProperty("id")
    private String id;

    /**
     * The store's name
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * The store's website URL
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("store_url")
    private JsonNullable<String> storeUrl;

    /**
     * The store's admin login URL
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("admin_url")
    private JsonNullable<String> adminUrl;

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_mappings")
    private JsonNullable<? extends CustomMappings> customMappings;

    /**
     * The date and time when the object was created.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    private JsonNullable<OffsetDateTime> createdAt;

    /**
     * The date and time when the object was last updated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    private JsonNullable<OffsetDateTime> updatedAt;

    @JsonCreator
    public EcommerceStore(
            @JsonProperty("id") String id,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("store_url") JsonNullable<String> storeUrl,
            @JsonProperty("admin_url") JsonNullable<String> adminUrl,
            @JsonProperty("custom_mappings") JsonNullable<? extends CustomMappings> customMappings,
            @JsonProperty("created_at") JsonNullable<OffsetDateTime> createdAt,
            @JsonProperty("updated_at") JsonNullable<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(storeUrl, "storeUrl");
        Utils.checkNotNull(adminUrl, "adminUrl");
        Utils.checkNotNull(customMappings, "customMappings");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.id = id;
        this.name = name;
        this.storeUrl = storeUrl;
        this.adminUrl = adminUrl;
        this.customMappings = customMappings;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public EcommerceStore(
            String id) {
        this(id, JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * The store's name
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * The store's website URL
     */
    @JsonIgnore
    public JsonNullable<String> storeUrl() {
        return storeUrl;
    }

    /**
     * The store's admin login URL
     */
    @JsonIgnore
    public JsonNullable<String> adminUrl() {
        return adminUrl;
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
     * The date and time when the object was created.
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> createdAt() {
        return createdAt;
    }

    /**
     * The date and time when the object was last updated.
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique identifier for an object.
     */
    public EcommerceStore withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The store's name
     */
    public EcommerceStore withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * The store's name
     */
    public EcommerceStore withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The store's website URL
     */
    public EcommerceStore withStoreUrl(String storeUrl) {
        Utils.checkNotNull(storeUrl, "storeUrl");
        this.storeUrl = JsonNullable.of(storeUrl);
        return this;
    }

    /**
     * The store's website URL
     */
    public EcommerceStore withStoreUrl(JsonNullable<String> storeUrl) {
        Utils.checkNotNull(storeUrl, "storeUrl");
        this.storeUrl = storeUrl;
        return this;
    }

    /**
     * The store's admin login URL
     */
    public EcommerceStore withAdminUrl(String adminUrl) {
        Utils.checkNotNull(adminUrl, "adminUrl");
        this.adminUrl = JsonNullable.of(adminUrl);
        return this;
    }

    /**
     * The store's admin login URL
     */
    public EcommerceStore withAdminUrl(JsonNullable<String> adminUrl) {
        Utils.checkNotNull(adminUrl, "adminUrl");
        this.adminUrl = adminUrl;
        return this;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    public EcommerceStore withCustomMappings(CustomMappings customMappings) {
        Utils.checkNotNull(customMappings, "customMappings");
        this.customMappings = JsonNullable.of(customMappings);
        return this;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    public EcommerceStore withCustomMappings(JsonNullable<? extends CustomMappings> customMappings) {
        Utils.checkNotNull(customMappings, "customMappings");
        this.customMappings = customMappings;
        return this;
    }

    /**
     * The date and time when the object was created.
     */
    public EcommerceStore withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = JsonNullable.of(createdAt);
        return this;
    }

    /**
     * The date and time when the object was created.
     */
    public EcommerceStore withCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The date and time when the object was last updated.
     */
    public EcommerceStore withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * The date and time when the object was last updated.
     */
    public EcommerceStore withUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
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
        EcommerceStore other = (EcommerceStore) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.storeUrl, other.storeUrl) &&
            Objects.deepEquals(this.adminUrl, other.adminUrl) &&
            Objects.deepEquals(this.customMappings, other.customMappings) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            storeUrl,
            adminUrl,
            customMappings,
            createdAt,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EcommerceStore.class,
                "id", id,
                "name", name,
                "storeUrl", storeUrl,
                "adminUrl", adminUrl,
                "customMappings", customMappings,
                "createdAt", createdAt,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private String id;
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private JsonNullable<String> storeUrl = JsonNullable.undefined();
 
        private JsonNullable<String> adminUrl = JsonNullable.undefined();
 
        private JsonNullable<? extends CustomMappings> customMappings = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> createdAt = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A unique identifier for an object.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The store's name
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * The store's name
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The store's website URL
         */
        public Builder storeUrl(String storeUrl) {
            Utils.checkNotNull(storeUrl, "storeUrl");
            this.storeUrl = JsonNullable.of(storeUrl);
            return this;
        }

        /**
         * The store's website URL
         */
        public Builder storeUrl(JsonNullable<String> storeUrl) {
            Utils.checkNotNull(storeUrl, "storeUrl");
            this.storeUrl = storeUrl;
            return this;
        }

        /**
         * The store's admin login URL
         */
        public Builder adminUrl(String adminUrl) {
            Utils.checkNotNull(adminUrl, "adminUrl");
            this.adminUrl = JsonNullable.of(adminUrl);
            return this;
        }

        /**
         * The store's admin login URL
         */
        public Builder adminUrl(JsonNullable<String> adminUrl) {
            Utils.checkNotNull(adminUrl, "adminUrl");
            this.adminUrl = adminUrl;
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
        
        public EcommerceStore build() {
            return new EcommerceStore(
                id,
                name,
                storeUrl,
                adminUrl,
                customMappings,
                createdAt,
                updatedAt);
        }
    }
}

