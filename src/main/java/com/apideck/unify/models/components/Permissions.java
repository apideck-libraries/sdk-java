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
import java.util.Objects;
import java.util.Optional;

/**
 * Permissions - Permissions the current user has on this file.
 */

public class Permissions {

    /**
     * Whether the current user can download this file.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("download")
    private Optional<Boolean> download;

    @JsonCreator
    public Permissions(
            @JsonProperty("download") Optional<Boolean> download) {
        Utils.checkNotNull(download, "download");
        this.download = download;
    }
    
    public Permissions() {
        this(Optional.empty());
    }

    /**
     * Whether the current user can download this file.
     */
    @JsonIgnore
    public Optional<Boolean> download() {
        return download;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Whether the current user can download this file.
     */
    public Permissions withDownload(boolean download) {
        Utils.checkNotNull(download, "download");
        this.download = Optional.ofNullable(download);
        return this;
    }

    /**
     * Whether the current user can download this file.
     */
    public Permissions withDownload(Optional<Boolean> download) {
        Utils.checkNotNull(download, "download");
        this.download = download;
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
        Permissions other = (Permissions) o;
        return 
            Objects.deepEquals(this.download, other.download);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            download);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Permissions.class,
                "download", download);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> download = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Whether the current user can download this file.
         */
        public Builder download(boolean download) {
            Utils.checkNotNull(download, "download");
            this.download = Optional.ofNullable(download);
            return this;
        }

        /**
         * Whether the current user can download this file.
         */
        public Builder download(Optional<Boolean> download) {
            Utils.checkNotNull(download, "download");
            this.download = download;
            return this;
        }
        
        public Permissions build() {
            return new Permissions(
                download);
        }
    }
}

