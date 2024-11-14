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


public class DriveGroupsFilter {

    /**
     * ID of the drive group to filter on
     */
    @SpeakeasyMetadata("queryParam:name=parent_group_id")
    private Optional<String> parentGroupId;

    @JsonCreator
    public DriveGroupsFilter(
            Optional<String> parentGroupId) {
        Utils.checkNotNull(parentGroupId, "parentGroupId");
        this.parentGroupId = parentGroupId;
    }
    
    public DriveGroupsFilter() {
        this(Optional.empty());
    }

    /**
     * ID of the drive group to filter on
     */
    @JsonIgnore
    public Optional<String> parentGroupId() {
        return parentGroupId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the drive group to filter on
     */
    public DriveGroupsFilter withParentGroupId(String parentGroupId) {
        Utils.checkNotNull(parentGroupId, "parentGroupId");
        this.parentGroupId = Optional.ofNullable(parentGroupId);
        return this;
    }

    /**
     * ID of the drive group to filter on
     */
    public DriveGroupsFilter withParentGroupId(Optional<String> parentGroupId) {
        Utils.checkNotNull(parentGroupId, "parentGroupId");
        this.parentGroupId = parentGroupId;
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
        DriveGroupsFilter other = (DriveGroupsFilter) o;
        return 
            Objects.deepEquals(this.parentGroupId, other.parentGroupId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            parentGroupId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DriveGroupsFilter.class,
                "parentGroupId", parentGroupId);
    }
    
    public final static class Builder {
 
        private Optional<String> parentGroupId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID of the drive group to filter on
         */
        public Builder parentGroupId(String parentGroupId) {
            Utils.checkNotNull(parentGroupId, "parentGroupId");
            this.parentGroupId = Optional.ofNullable(parentGroupId);
            return this;
        }

        /**
         * ID of the drive group to filter on
         */
        public Builder parentGroupId(Optional<String> parentGroupId) {
            Utils.checkNotNull(parentGroupId, "parentGroupId");
            this.parentGroupId = parentGroupId;
            return this;
        }
        
        public DriveGroupsFilter build() {
            return new DriveGroupsFilter(
                parentGroupId);
        }
    }
}
