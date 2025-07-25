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
import java.util.Optional;


public class LedgerAccountSubsidiaries {
    /**
     * The ID of the subsidiary.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonCreator
    public LedgerAccountSubsidiaries(
            @JsonProperty("id") Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
    }
    
    public LedgerAccountSubsidiaries() {
        this(Optional.empty());
    }

    /**
     * The ID of the subsidiary.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The ID of the subsidiary.
     */
    public LedgerAccountSubsidiaries withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }


    /**
     * The ID of the subsidiary.
     */
    public LedgerAccountSubsidiaries withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        LedgerAccountSubsidiaries other = (LedgerAccountSubsidiaries) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LedgerAccountSubsidiaries.class,
                "id", id);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> id = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The ID of the subsidiary.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * The ID of the subsidiary.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public LedgerAccountSubsidiaries build() {

            return new LedgerAccountSubsidiaries(
                id);
        }

    }
}
