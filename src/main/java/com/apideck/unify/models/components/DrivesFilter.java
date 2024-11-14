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


public class DrivesFilter {

    /**
     * ID of the drive group to filter on
     */
    @SpeakeasyMetadata("queryParam:name=group_id")
    private Optional<String> groupId;

    @JsonCreator
    public DrivesFilter(
            Optional<String> groupId) {
        Utils.checkNotNull(groupId, "groupId");
        this.groupId = groupId;
    }
    
    public DrivesFilter() {
        this(Optional.empty());
    }

    /**
     * ID of the drive group to filter on
     */
    @JsonIgnore
    public Optional<String> groupId() {
        return groupId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the drive group to filter on
     */
    public DrivesFilter withGroupId(String groupId) {
        Utils.checkNotNull(groupId, "groupId");
        this.groupId = Optional.ofNullable(groupId);
        return this;
    }

    /**
     * ID of the drive group to filter on
     */
    public DrivesFilter withGroupId(Optional<String> groupId) {
        Utils.checkNotNull(groupId, "groupId");
        this.groupId = groupId;
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
        DrivesFilter other = (DrivesFilter) o;
        return 
            Objects.deepEquals(this.groupId, other.groupId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            groupId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DrivesFilter.class,
                "groupId", groupId);
    }
    
    public final static class Builder {
 
        private Optional<String> groupId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID of the drive group to filter on
         */
        public Builder groupId(String groupId) {
            Utils.checkNotNull(groupId, "groupId");
            this.groupId = Optional.ofNullable(groupId);
            return this;
        }

        /**
         * ID of the drive group to filter on
         */
        public Builder groupId(Optional<String> groupId) {
            Utils.checkNotNull(groupId, "groupId");
            this.groupId = groupId;
            return this;
        }
        
        public DrivesFilter build() {
            return new DrivesFilter(
                groupId);
        }
    }
}
