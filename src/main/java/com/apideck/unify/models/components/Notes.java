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
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class Notes {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee")
    private JsonNullable<String> employee;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("manager")
    private JsonNullable<String> manager;

    @JsonCreator
    public Notes(
            @JsonProperty("employee") JsonNullable<String> employee,
            @JsonProperty("manager") JsonNullable<String> manager) {
        Utils.checkNotNull(employee, "employee");
        Utils.checkNotNull(manager, "manager");
        this.employee = employee;
        this.manager = manager;
    }
    
    public Notes() {
        this(JsonNullable.undefined(), JsonNullable.undefined());
    }

    @JsonIgnore
    public JsonNullable<String> employee() {
        return employee;
    }

    @JsonIgnore
    public JsonNullable<String> manager() {
        return manager;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Notes withEmployee(String employee) {
        Utils.checkNotNull(employee, "employee");
        this.employee = JsonNullable.of(employee);
        return this;
    }

    public Notes withEmployee(JsonNullable<String> employee) {
        Utils.checkNotNull(employee, "employee");
        this.employee = employee;
        return this;
    }

    public Notes withManager(String manager) {
        Utils.checkNotNull(manager, "manager");
        this.manager = JsonNullable.of(manager);
        return this;
    }

    public Notes withManager(JsonNullable<String> manager) {
        Utils.checkNotNull(manager, "manager");
        this.manager = manager;
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
        Notes other = (Notes) o;
        return 
            Objects.deepEquals(this.employee, other.employee) &&
            Objects.deepEquals(this.manager, other.manager);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            employee,
            manager);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Notes.class,
                "employee", employee,
                "manager", manager);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> employee = JsonNullable.undefined();
 
        private JsonNullable<String> manager = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder employee(String employee) {
            Utils.checkNotNull(employee, "employee");
            this.employee = JsonNullable.of(employee);
            return this;
        }

        public Builder employee(JsonNullable<String> employee) {
            Utils.checkNotNull(employee, "employee");
            this.employee = employee;
            return this;
        }

        public Builder manager(String manager) {
            Utils.checkNotNull(manager, "manager");
            this.manager = JsonNullable.of(manager);
            return this;
        }

        public Builder manager(JsonNullable<String> manager) {
            Utils.checkNotNull(manager, "manager");
            this.manager = manager;
            return this;
        }
        
        public Notes build() {
            return new Notes(
                employee,
                manager);
        }
    }
}
