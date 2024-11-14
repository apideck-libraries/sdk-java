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


public class ModifierGroupFilter {

    /**
     * Id of the job to filter on
     */
    @SpeakeasyMetadata("queryParam:name=modifier_group_id")
    private Optional<String> modifierGroupId;

    @JsonCreator
    public ModifierGroupFilter(
            Optional<String> modifierGroupId) {
        Utils.checkNotNull(modifierGroupId, "modifierGroupId");
        this.modifierGroupId = modifierGroupId;
    }
    
    public ModifierGroupFilter() {
        this(Optional.empty());
    }

    /**
     * Id of the job to filter on
     */
    @JsonIgnore
    public Optional<String> modifierGroupId() {
        return modifierGroupId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Id of the job to filter on
     */
    public ModifierGroupFilter withModifierGroupId(String modifierGroupId) {
        Utils.checkNotNull(modifierGroupId, "modifierGroupId");
        this.modifierGroupId = Optional.ofNullable(modifierGroupId);
        return this;
    }

    /**
     * Id of the job to filter on
     */
    public ModifierGroupFilter withModifierGroupId(Optional<String> modifierGroupId) {
        Utils.checkNotNull(modifierGroupId, "modifierGroupId");
        this.modifierGroupId = modifierGroupId;
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
        ModifierGroupFilter other = (ModifierGroupFilter) o;
        return 
            Objects.deepEquals(this.modifierGroupId, other.modifierGroupId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            modifierGroupId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ModifierGroupFilter.class,
                "modifierGroupId", modifierGroupId);
    }
    
    public final static class Builder {
 
        private Optional<String> modifierGroupId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Id of the job to filter on
         */
        public Builder modifierGroupId(String modifierGroupId) {
            Utils.checkNotNull(modifierGroupId, "modifierGroupId");
            this.modifierGroupId = Optional.ofNullable(modifierGroupId);
            return this;
        }

        /**
         * Id of the job to filter on
         */
        public Builder modifierGroupId(Optional<String> modifierGroupId) {
            Utils.checkNotNull(modifierGroupId, "modifierGroupId");
            this.modifierGroupId = modifierGroupId;
            return this;
        }
        
        public ModifierGroupFilter build() {
            return new ModifierGroupFilter(
                modifierGroupId);
        }
    }
}
