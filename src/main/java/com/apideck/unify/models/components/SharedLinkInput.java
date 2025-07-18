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


public class SharedLinkInput {
    /**
     * The URL that can be used to download the file.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("download_url")
    private JsonNullable<String> downloadUrl;

    /**
     * The ID of the file or folder to link.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("target_id")
    private Optional<String> targetId;

    /**
     * The scope of the shared link.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scope")
    private JsonNullable<? extends Scope> scope;

    /**
     * Optional password for the shared link.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private JsonNullable<String> password;

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pass_through")
    private Optional<? extends List<PassThroughBody>> passThrough;

    @JsonCreator
    public SharedLinkInput(
            @JsonProperty("download_url") JsonNullable<String> downloadUrl,
            @JsonProperty("target_id") Optional<String> targetId,
            @JsonProperty("scope") JsonNullable<? extends Scope> scope,
            @JsonProperty("password") JsonNullable<String> password,
            @JsonProperty("pass_through") Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(downloadUrl, "downloadUrl");
        Utils.checkNotNull(targetId, "targetId");
        Utils.checkNotNull(scope, "scope");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(passThrough, "passThrough");
        this.downloadUrl = downloadUrl;
        this.targetId = targetId;
        this.scope = scope;
        this.password = password;
        this.passThrough = passThrough;
    }
    
    public SharedLinkInput() {
        this(JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(),
            JsonNullable.undefined(), Optional.empty());
    }

    /**
     * The URL that can be used to download the file.
     */
    @JsonIgnore
    public JsonNullable<String> downloadUrl() {
        return downloadUrl;
    }

    /**
     * The ID of the file or folder to link.
     */
    @JsonIgnore
    public Optional<String> targetId() {
        return targetId;
    }

    /**
     * The scope of the shared link.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Scope> scope() {
        return (JsonNullable<Scope>) scope;
    }

    /**
     * Optional password for the shared link.
     */
    @JsonIgnore
    public JsonNullable<String> password() {
        return password;
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
     * The URL that can be used to download the file.
     */
    public SharedLinkInput withDownloadUrl(String downloadUrl) {
        Utils.checkNotNull(downloadUrl, "downloadUrl");
        this.downloadUrl = JsonNullable.of(downloadUrl);
        return this;
    }

    /**
     * The URL that can be used to download the file.
     */
    public SharedLinkInput withDownloadUrl(JsonNullable<String> downloadUrl) {
        Utils.checkNotNull(downloadUrl, "downloadUrl");
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * The ID of the file or folder to link.
     */
    public SharedLinkInput withTargetId(String targetId) {
        Utils.checkNotNull(targetId, "targetId");
        this.targetId = Optional.ofNullable(targetId);
        return this;
    }


    /**
     * The ID of the file or folder to link.
     */
    public SharedLinkInput withTargetId(Optional<String> targetId) {
        Utils.checkNotNull(targetId, "targetId");
        this.targetId = targetId;
        return this;
    }

    /**
     * The scope of the shared link.
     */
    public SharedLinkInput withScope(Scope scope) {
        Utils.checkNotNull(scope, "scope");
        this.scope = JsonNullable.of(scope);
        return this;
    }

    /**
     * The scope of the shared link.
     */
    public SharedLinkInput withScope(JsonNullable<? extends Scope> scope) {
        Utils.checkNotNull(scope, "scope");
        this.scope = scope;
        return this;
    }

    /**
     * Optional password for the shared link.
     */
    public SharedLinkInput withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = JsonNullable.of(password);
        return this;
    }

    /**
     * Optional password for the shared link.
     */
    public SharedLinkInput withPassword(JsonNullable<String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public SharedLinkInput withPassThrough(List<PassThroughBody> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }


    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public SharedLinkInput withPassThrough(Optional<? extends List<PassThroughBody>> passThrough) {
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
        SharedLinkInput other = (SharedLinkInput) o;
        return 
            Utils.enhancedDeepEquals(this.downloadUrl, other.downloadUrl) &&
            Utils.enhancedDeepEquals(this.targetId, other.targetId) &&
            Utils.enhancedDeepEquals(this.scope, other.scope) &&
            Utils.enhancedDeepEquals(this.password, other.password) &&
            Utils.enhancedDeepEquals(this.passThrough, other.passThrough);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            downloadUrl, targetId, scope,
            password, passThrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SharedLinkInput.class,
                "downloadUrl", downloadUrl,
                "targetId", targetId,
                "scope", scope,
                "password", password,
                "passThrough", passThrough);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<String> downloadUrl = JsonNullable.undefined();

        private Optional<String> targetId = Optional.empty();

        private JsonNullable<? extends Scope> scope = JsonNullable.undefined();

        private JsonNullable<String> password = JsonNullable.undefined();

        private Optional<? extends List<PassThroughBody>> passThrough = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The URL that can be used to download the file.
         */
        public Builder downloadUrl(String downloadUrl) {
            Utils.checkNotNull(downloadUrl, "downloadUrl");
            this.downloadUrl = JsonNullable.of(downloadUrl);
            return this;
        }

        /**
         * The URL that can be used to download the file.
         */
        public Builder downloadUrl(JsonNullable<String> downloadUrl) {
            Utils.checkNotNull(downloadUrl, "downloadUrl");
            this.downloadUrl = downloadUrl;
            return this;
        }


        /**
         * The ID of the file or folder to link.
         */
        public Builder targetId(String targetId) {
            Utils.checkNotNull(targetId, "targetId");
            this.targetId = Optional.ofNullable(targetId);
            return this;
        }

        /**
         * The ID of the file or folder to link.
         */
        public Builder targetId(Optional<String> targetId) {
            Utils.checkNotNull(targetId, "targetId");
            this.targetId = targetId;
            return this;
        }


        /**
         * The scope of the shared link.
         */
        public Builder scope(Scope scope) {
            Utils.checkNotNull(scope, "scope");
            this.scope = JsonNullable.of(scope);
            return this;
        }

        /**
         * The scope of the shared link.
         */
        public Builder scope(JsonNullable<? extends Scope> scope) {
            Utils.checkNotNull(scope, "scope");
            this.scope = scope;
            return this;
        }


        /**
         * Optional password for the shared link.
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = JsonNullable.of(password);
            return this;
        }

        /**
         * Optional password for the shared link.
         */
        public Builder password(JsonNullable<String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
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

        public SharedLinkInput build() {

            return new SharedLinkInput(
                downloadUrl, targetId, scope,
                password, passThrough);
        }

    }
}
