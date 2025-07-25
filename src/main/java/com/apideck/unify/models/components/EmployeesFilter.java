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
import java.lang.SuppressWarnings;
import java.util.Optional;


public class EmployeesFilter {
    /**
     * Company ID to filter on
     */
    @SpeakeasyMetadata("queryParam:name=company_id")
    private Optional<String> companyId;

    /**
     * Email to filter on
     */
    @SpeakeasyMetadata("queryParam:name=email")
    private Optional<String> email;

    /**
     * First Name to filter on
     */
    @SpeakeasyMetadata("queryParam:name=first_name")
    private Optional<String> firstName;

    /**
     * Job title to filter on
     */
    @SpeakeasyMetadata("queryParam:name=title")
    private Optional<String> title;

    /**
     * Last Name to filter on
     */
    @SpeakeasyMetadata("queryParam:name=last_name")
    private Optional<String> lastName;

    /**
     * Manager id to filter on
     */
    @SpeakeasyMetadata("queryParam:name=manager_id")
    private Optional<String> managerId;

    /**
     * Employment status to filter on
     */
    @SpeakeasyMetadata("queryParam:name=employment_status")
    private Optional<? extends EmployeesFilterEmploymentStatus> employmentStatus;

    /**
     * Employee number to filter on
     */
    @SpeakeasyMetadata("queryParam:name=employee_number")
    private Optional<String> employeeNumber;

    /**
     * ID of the department to filter on
     */
    @SpeakeasyMetadata("queryParam:name=department_id")
    private Optional<String> departmentId;

    /**
     * City to filter on
     */
    @SpeakeasyMetadata("queryParam:name=city")
    private Optional<String> city;

    /**
     * Country to filter on
     */
    @SpeakeasyMetadata("queryParam:name=country")
    private Optional<String> country;

    @JsonCreator
    public EmployeesFilter(
            Optional<String> companyId,
            Optional<String> email,
            Optional<String> firstName,
            Optional<String> title,
            Optional<String> lastName,
            Optional<String> managerId,
            Optional<? extends EmployeesFilterEmploymentStatus> employmentStatus,
            Optional<String> employeeNumber,
            Optional<String> departmentId,
            Optional<String> city,
            Optional<String> country) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(managerId, "managerId");
        Utils.checkNotNull(employmentStatus, "employmentStatus");
        Utils.checkNotNull(employeeNumber, "employeeNumber");
        Utils.checkNotNull(departmentId, "departmentId");
        Utils.checkNotNull(city, "city");
        Utils.checkNotNull(country, "country");
        this.companyId = companyId;
        this.email = email;
        this.firstName = firstName;
        this.title = title;
        this.lastName = lastName;
        this.managerId = managerId;
        this.employmentStatus = employmentStatus;
        this.employeeNumber = employeeNumber;
        this.departmentId = departmentId;
        this.city = city;
        this.country = country;
    }
    
    public EmployeesFilter() {
        this(Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty());
    }

    /**
     * Company ID to filter on
     */
    @JsonIgnore
    public Optional<String> companyId() {
        return companyId;
    }

    /**
     * Email to filter on
     */
    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    /**
     * First Name to filter on
     */
    @JsonIgnore
    public Optional<String> firstName() {
        return firstName;
    }

    /**
     * Job title to filter on
     */
    @JsonIgnore
    public Optional<String> title() {
        return title;
    }

    /**
     * Last Name to filter on
     */
    @JsonIgnore
    public Optional<String> lastName() {
        return lastName;
    }

    /**
     * Manager id to filter on
     */
    @JsonIgnore
    public Optional<String> managerId() {
        return managerId;
    }

    /**
     * Employment status to filter on
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<EmployeesFilterEmploymentStatus> employmentStatus() {
        return (Optional<EmployeesFilterEmploymentStatus>) employmentStatus;
    }

    /**
     * Employee number to filter on
     */
    @JsonIgnore
    public Optional<String> employeeNumber() {
        return employeeNumber;
    }

    /**
     * ID of the department to filter on
     */
    @JsonIgnore
    public Optional<String> departmentId() {
        return departmentId;
    }

    /**
     * City to filter on
     */
    @JsonIgnore
    public Optional<String> city() {
        return city;
    }

    /**
     * Country to filter on
     */
    @JsonIgnore
    public Optional<String> country() {
        return country;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Company ID to filter on
     */
    public EmployeesFilter withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = Optional.ofNullable(companyId);
        return this;
    }


    /**
     * Company ID to filter on
     */
    public EmployeesFilter withCompanyId(Optional<String> companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Email to filter on
     */
    public EmployeesFilter withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }


    /**
     * Email to filter on
     */
    public EmployeesFilter withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * First Name to filter on
     */
    public EmployeesFilter withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = Optional.ofNullable(firstName);
        return this;
    }


    /**
     * First Name to filter on
     */
    public EmployeesFilter withFirstName(Optional<String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    /**
     * Job title to filter on
     */
    public EmployeesFilter withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }


    /**
     * Job title to filter on
     */
    public EmployeesFilter withTitle(Optional<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    /**
     * Last Name to filter on
     */
    public EmployeesFilter withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = Optional.ofNullable(lastName);
        return this;
    }


    /**
     * Last Name to filter on
     */
    public EmployeesFilter withLastName(Optional<String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    /**
     * Manager id to filter on
     */
    public EmployeesFilter withManagerId(String managerId) {
        Utils.checkNotNull(managerId, "managerId");
        this.managerId = Optional.ofNullable(managerId);
        return this;
    }


    /**
     * Manager id to filter on
     */
    public EmployeesFilter withManagerId(Optional<String> managerId) {
        Utils.checkNotNull(managerId, "managerId");
        this.managerId = managerId;
        return this;
    }

    /**
     * Employment status to filter on
     */
    public EmployeesFilter withEmploymentStatus(EmployeesFilterEmploymentStatus employmentStatus) {
        Utils.checkNotNull(employmentStatus, "employmentStatus");
        this.employmentStatus = Optional.ofNullable(employmentStatus);
        return this;
    }


    /**
     * Employment status to filter on
     */
    public EmployeesFilter withEmploymentStatus(Optional<? extends EmployeesFilterEmploymentStatus> employmentStatus) {
        Utils.checkNotNull(employmentStatus, "employmentStatus");
        this.employmentStatus = employmentStatus;
        return this;
    }

    /**
     * Employee number to filter on
     */
    public EmployeesFilter withEmployeeNumber(String employeeNumber) {
        Utils.checkNotNull(employeeNumber, "employeeNumber");
        this.employeeNumber = Optional.ofNullable(employeeNumber);
        return this;
    }


    /**
     * Employee number to filter on
     */
    public EmployeesFilter withEmployeeNumber(Optional<String> employeeNumber) {
        Utils.checkNotNull(employeeNumber, "employeeNumber");
        this.employeeNumber = employeeNumber;
        return this;
    }

    /**
     * ID of the department to filter on
     */
    public EmployeesFilter withDepartmentId(String departmentId) {
        Utils.checkNotNull(departmentId, "departmentId");
        this.departmentId = Optional.ofNullable(departmentId);
        return this;
    }


    /**
     * ID of the department to filter on
     */
    public EmployeesFilter withDepartmentId(Optional<String> departmentId) {
        Utils.checkNotNull(departmentId, "departmentId");
        this.departmentId = departmentId;
        return this;
    }

    /**
     * City to filter on
     */
    public EmployeesFilter withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = Optional.ofNullable(city);
        return this;
    }


    /**
     * City to filter on
     */
    public EmployeesFilter withCity(Optional<String> city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    /**
     * Country to filter on
     */
    public EmployeesFilter withCountry(String country) {
        Utils.checkNotNull(country, "country");
        this.country = Optional.ofNullable(country);
        return this;
    }


    /**
     * Country to filter on
     */
    public EmployeesFilter withCountry(Optional<String> country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
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
        EmployeesFilter other = (EmployeesFilter) o;
        return 
            Utils.enhancedDeepEquals(this.companyId, other.companyId) &&
            Utils.enhancedDeepEquals(this.email, other.email) &&
            Utils.enhancedDeepEquals(this.firstName, other.firstName) &&
            Utils.enhancedDeepEquals(this.title, other.title) &&
            Utils.enhancedDeepEquals(this.lastName, other.lastName) &&
            Utils.enhancedDeepEquals(this.managerId, other.managerId) &&
            Utils.enhancedDeepEquals(this.employmentStatus, other.employmentStatus) &&
            Utils.enhancedDeepEquals(this.employeeNumber, other.employeeNumber) &&
            Utils.enhancedDeepEquals(this.departmentId, other.departmentId) &&
            Utils.enhancedDeepEquals(this.city, other.city) &&
            Utils.enhancedDeepEquals(this.country, other.country);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            companyId, email, firstName,
            title, lastName, managerId,
            employmentStatus, employeeNumber, departmentId,
            city, country);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EmployeesFilter.class,
                "companyId", companyId,
                "email", email,
                "firstName", firstName,
                "title", title,
                "lastName", lastName,
                "managerId", managerId,
                "employmentStatus", employmentStatus,
                "employeeNumber", employeeNumber,
                "departmentId", departmentId,
                "city", city,
                "country", country);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<String> companyId = Optional.empty();

        private Optional<String> email = Optional.empty();

        private Optional<String> firstName = Optional.empty();

        private Optional<String> title = Optional.empty();

        private Optional<String> lastName = Optional.empty();

        private Optional<String> managerId = Optional.empty();

        private Optional<? extends EmployeesFilterEmploymentStatus> employmentStatus = Optional.empty();

        private Optional<String> employeeNumber = Optional.empty();

        private Optional<String> departmentId = Optional.empty();

        private Optional<String> city = Optional.empty();

        private Optional<String> country = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Company ID to filter on
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = Optional.ofNullable(companyId);
            return this;
        }

        /**
         * Company ID to filter on
         */
        public Builder companyId(Optional<String> companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }


        /**
         * Email to filter on
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        /**
         * Email to filter on
         */
        public Builder email(Optional<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }


        /**
         * First Name to filter on
         */
        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = Optional.ofNullable(firstName);
            return this;
        }

        /**
         * First Name to filter on
         */
        public Builder firstName(Optional<String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }


        /**
         * Job title to filter on
         */
        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        /**
         * Job title to filter on
         */
        public Builder title(Optional<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }


        /**
         * Last Name to filter on
         */
        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = Optional.ofNullable(lastName);
            return this;
        }

        /**
         * Last Name to filter on
         */
        public Builder lastName(Optional<String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }


        /**
         * Manager id to filter on
         */
        public Builder managerId(String managerId) {
            Utils.checkNotNull(managerId, "managerId");
            this.managerId = Optional.ofNullable(managerId);
            return this;
        }

        /**
         * Manager id to filter on
         */
        public Builder managerId(Optional<String> managerId) {
            Utils.checkNotNull(managerId, "managerId");
            this.managerId = managerId;
            return this;
        }


        /**
         * Employment status to filter on
         */
        public Builder employmentStatus(EmployeesFilterEmploymentStatus employmentStatus) {
            Utils.checkNotNull(employmentStatus, "employmentStatus");
            this.employmentStatus = Optional.ofNullable(employmentStatus);
            return this;
        }

        /**
         * Employment status to filter on
         */
        public Builder employmentStatus(Optional<? extends EmployeesFilterEmploymentStatus> employmentStatus) {
            Utils.checkNotNull(employmentStatus, "employmentStatus");
            this.employmentStatus = employmentStatus;
            return this;
        }


        /**
         * Employee number to filter on
         */
        public Builder employeeNumber(String employeeNumber) {
            Utils.checkNotNull(employeeNumber, "employeeNumber");
            this.employeeNumber = Optional.ofNullable(employeeNumber);
            return this;
        }

        /**
         * Employee number to filter on
         */
        public Builder employeeNumber(Optional<String> employeeNumber) {
            Utils.checkNotNull(employeeNumber, "employeeNumber");
            this.employeeNumber = employeeNumber;
            return this;
        }


        /**
         * ID of the department to filter on
         */
        public Builder departmentId(String departmentId) {
            Utils.checkNotNull(departmentId, "departmentId");
            this.departmentId = Optional.ofNullable(departmentId);
            return this;
        }

        /**
         * ID of the department to filter on
         */
        public Builder departmentId(Optional<String> departmentId) {
            Utils.checkNotNull(departmentId, "departmentId");
            this.departmentId = departmentId;
            return this;
        }


        /**
         * City to filter on
         */
        public Builder city(String city) {
            Utils.checkNotNull(city, "city");
            this.city = Optional.ofNullable(city);
            return this;
        }

        /**
         * City to filter on
         */
        public Builder city(Optional<String> city) {
            Utils.checkNotNull(city, "city");
            this.city = city;
            return this;
        }


        /**
         * Country to filter on
         */
        public Builder country(String country) {
            Utils.checkNotNull(country, "country");
            this.country = Optional.ofNullable(country);
            return this;
        }

        /**
         * Country to filter on
         */
        public Builder country(Optional<String> country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }

        public EmployeesFilter build() {

            return new EmployeesFilter(
                companyId, email, firstName,
                title, lastName, managerId,
                employmentStatus, employeeNumber, departmentId,
                city, country);
        }

    }
}
