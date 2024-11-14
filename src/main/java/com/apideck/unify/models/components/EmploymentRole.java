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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class EmploymentRole {

    /**
     * The type of employment relationship the employee has with the organization.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private JsonNullable<? extends EmploymentType> type;

    /**
     * The work schedule of the employee.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sub_type")
    private JsonNullable<? extends EmploymentSubType> subType;

    @JsonCreator
    public EmploymentRole(
            @JsonProperty("type") JsonNullable<? extends EmploymentType> type,
            @JsonProperty("sub_type") JsonNullable<? extends EmploymentSubType> subType) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(subType, "subType");
        this.type = type;
        this.subType = subType;
    }
    
    public EmploymentRole() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * The type of employment relationship the employee has with the organization.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EmploymentType> type() {
        return (JsonNullable<EmploymentType>) type;
    }

    /**
     * The work schedule of the employee.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EmploymentSubType> subType() {
        return (JsonNullable<EmploymentSubType>) subType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The type of employment relationship the employee has with the organization.
     */
    public EmploymentRole withType(EmploymentType type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * The type of employment relationship the employee has with the organization.
     */
    public EmploymentRole withType(JsonNullable<? extends EmploymentType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The work schedule of the employee.
     */
    public EmploymentRole withSubType(EmploymentSubType subType) {
        Utils.checkNotNull(subType, "subType");
        this.subType = JsonNullable.of(subType);
        return this;
    }

    /**
     * The work schedule of the employee.
     */
    public EmploymentRole withSubType(JsonNullable<? extends EmploymentSubType> subType) {
        Utils.checkNotNull(subType, "subType");
        this.subType = subType;
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
        EmploymentRole other = (EmploymentRole) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.subType, other.subType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            subType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EmploymentRole.class,
                "type", type,
                "subType", subType);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends EmploymentType> type = JsonNullable.undefined();
 
        private JsonNullable<? extends EmploymentSubType> subType = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The type of employment relationship the employee has with the organization.
         */
        public Builder type(EmploymentType type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        /**
         * The type of employment relationship the employee has with the organization.
         */
        public Builder type(JsonNullable<? extends EmploymentType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The work schedule of the employee.
         */
        public Builder subType(EmploymentSubType subType) {
            Utils.checkNotNull(subType, "subType");
            this.subType = JsonNullable.of(subType);
            return this;
        }

        /**
         * The work schedule of the employee.
         */
        public Builder subType(JsonNullable<? extends EmploymentSubType> subType) {
            Utils.checkNotNull(subType, "subType");
            this.subType = subType;
            return this;
        }
        
        public EmploymentRole build() {
            return new EmploymentRole(
                type,
                subType);
        }
    }
}
