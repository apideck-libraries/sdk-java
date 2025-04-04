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
import java.util.Objects;
import java.util.Optional;

public class AccountingLocationsFilter {

    /**
     * Id of the subsidiary to search for
     */
    @SpeakeasyMetadata("queryParam:name=subsidiary")
    private Optional<String> subsidiary;

    @JsonCreator
    public AccountingLocationsFilter(
            Optional<String> subsidiary) {
        Utils.checkNotNull(subsidiary, "subsidiary");
        this.subsidiary = subsidiary;
    }
    
    public AccountingLocationsFilter() {
        this(Optional.empty());
    }

    /**
     * Id of the subsidiary to search for
     */
    @JsonIgnore
    public Optional<String> subsidiary() {
        return subsidiary;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Id of the subsidiary to search for
     */
    public AccountingLocationsFilter withSubsidiary(String subsidiary) {
        Utils.checkNotNull(subsidiary, "subsidiary");
        this.subsidiary = Optional.ofNullable(subsidiary);
        return this;
    }

    /**
     * Id of the subsidiary to search for
     */
    public AccountingLocationsFilter withSubsidiary(Optional<String> subsidiary) {
        Utils.checkNotNull(subsidiary, "subsidiary");
        this.subsidiary = subsidiary;
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
        AccountingLocationsFilter other = (AccountingLocationsFilter) o;
        return 
            Objects.deepEquals(this.subsidiary, other.subsidiary);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            subsidiary);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountingLocationsFilter.class,
                "subsidiary", subsidiary);
    }
    
    public final static class Builder {
 
        private Optional<String> subsidiary = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Id of the subsidiary to search for
         */
        public Builder subsidiary(String subsidiary) {
            Utils.checkNotNull(subsidiary, "subsidiary");
            this.subsidiary = Optional.ofNullable(subsidiary);
            return this;
        }

        /**
         * Id of the subsidiary to search for
         */
        public Builder subsidiary(Optional<String> subsidiary) {
            Utils.checkNotNull(subsidiary, "subsidiary");
            this.subsidiary = subsidiary;
            return this;
        }
        
        public AccountingLocationsFilter build() {
            return new AccountingLocationsFilter(
                subsidiary);
        }
    }
}
