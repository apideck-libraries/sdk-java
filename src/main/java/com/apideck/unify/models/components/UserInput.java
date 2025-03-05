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
import java.lang.Deprecated;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class UserInput {

    /**
     * The parent user id
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parent_id")
    private JsonNullable<String> parentId;

    /**
     * The username of the user
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("username")
    private JsonNullable<String> username;

    /**
     * The first name of the person.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("first_name")
    private JsonNullable<String> firstName;

    /**
     * The last name of the person.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_name")
    private JsonNullable<String> lastName;

    /**
     * The job title of the person.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private JsonNullable<String> title;

    /**
     * The division the person is currently in. Usually a collection of departments or teams or regions.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("division")
    private JsonNullable<String> division;

    /**
     * The department the person is currently in. [Deprecated](https://developers.apideck.com/changelog) in favor of the dedicated department_id and department_name field.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("department")
    @Deprecated
    private JsonNullable<String> department;

    /**
     * The name of the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_name")
    private JsonNullable<String> companyName;

    /**
     * An Employee Number, Employee ID or Employee Code, is a unique number that has been assigned to each individual staff member within a company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee_number")
    private JsonNullable<String> employeeNumber;

    /**
     * A description of the object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    /**
     * The URL of the user's avatar
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("image")
    private JsonNullable<String> image;

    /**
     * language code according to ISO 639-1. For the United States - EN
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("language")
    private JsonNullable<String> language;

    /**
     * The status of the user
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private JsonNullable<String> status;

    /**
     * The password of the user
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private JsonNullable<String> password;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addresses")
    private Optional<? extends List<Address>> addresses;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone_numbers")
    private Optional<? extends List<PhoneNumber>> phoneNumbers;

    @JsonProperty("emails")
    private List<Email> emails;

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pass_through")
    private Optional<? extends List<PassThroughBody>> passThrough;

    @JsonCreator
    public UserInput(
            @JsonProperty("parent_id") JsonNullable<String> parentId,
            @JsonProperty("username") JsonNullable<String> username,
            @JsonProperty("first_name") JsonNullable<String> firstName,
            @JsonProperty("last_name") JsonNullable<String> lastName,
            @JsonProperty("title") JsonNullable<String> title,
            @JsonProperty("division") JsonNullable<String> division,
            @JsonProperty("department") JsonNullable<String> department,
            @JsonProperty("company_name") JsonNullable<String> companyName,
            @JsonProperty("employee_number") JsonNullable<String> employeeNumber,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("image") JsonNullable<String> image,
            @JsonProperty("language") JsonNullable<String> language,
            @JsonProperty("status") JsonNullable<String> status,
            @JsonProperty("password") JsonNullable<String> password,
            @JsonProperty("addresses") Optional<? extends List<Address>> addresses,
            @JsonProperty("phone_numbers") Optional<? extends List<PhoneNumber>> phoneNumbers,
            @JsonProperty("emails") List<Email> emails,
            @JsonProperty("pass_through") Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(parentId, "parentId");
        Utils.checkNotNull(username, "username");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(division, "division");
        Utils.checkNotNull(department, "department");
        Utils.checkNotNull(companyName, "companyName");
        Utils.checkNotNull(employeeNumber, "employeeNumber");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(image, "image");
        Utils.checkNotNull(language, "language");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(addresses, "addresses");
        Utils.checkNotNull(phoneNumbers, "phoneNumbers");
        Utils.checkNotNull(emails, "emails");
        Utils.checkNotNull(passThrough, "passThrough");
        this.parentId = parentId;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.division = division;
        this.department = department;
        this.companyName = companyName;
        this.employeeNumber = employeeNumber;
        this.description = description;
        this.image = image;
        this.language = language;
        this.status = status;
        this.password = password;
        this.addresses = addresses;
        this.phoneNumbers = phoneNumbers;
        this.emails = emails;
        this.passThrough = passThrough;
    }
    
    public UserInput(
            List<Email> emails) {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), emails, Optional.empty());
    }

    /**
     * The parent user id
     */
    @JsonIgnore
    public JsonNullable<String> parentId() {
        return parentId;
    }

    /**
     * The username of the user
     */
    @JsonIgnore
    public JsonNullable<String> username() {
        return username;
    }

    /**
     * The first name of the person.
     */
    @JsonIgnore
    public JsonNullable<String> firstName() {
        return firstName;
    }

    /**
     * The last name of the person.
     */
    @JsonIgnore
    public JsonNullable<String> lastName() {
        return lastName;
    }

    /**
     * The job title of the person.
     */
    @JsonIgnore
    public JsonNullable<String> title() {
        return title;
    }

    /**
     * The division the person is currently in. Usually a collection of departments or teams or regions.
     */
    @JsonIgnore
    public JsonNullable<String> division() {
        return division;
    }

    /**
     * The department the person is currently in. [Deprecated](https://developers.apideck.com/changelog) in favor of the dedicated department_id and department_name field.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public JsonNullable<String> department() {
        return department;
    }

    /**
     * The name of the company.
     */
    @JsonIgnore
    public JsonNullable<String> companyName() {
        return companyName;
    }

    /**
     * An Employee Number, Employee ID or Employee Code, is a unique number that has been assigned to each individual staff member within a company.
     */
    @JsonIgnore
    public JsonNullable<String> employeeNumber() {
        return employeeNumber;
    }

    /**
     * A description of the object.
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    /**
     * The URL of the user's avatar
     */
    @JsonIgnore
    public JsonNullable<String> image() {
        return image;
    }

    /**
     * language code according to ISO 639-1. For the United States - EN
     */
    @JsonIgnore
    public JsonNullable<String> language() {
        return language;
    }

    /**
     * The status of the user
     */
    @JsonIgnore
    public JsonNullable<String> status() {
        return status;
    }

    /**
     * The password of the user
     */
    @JsonIgnore
    public JsonNullable<String> password() {
        return password;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Address>> addresses() {
        return (Optional<List<Address>>) addresses;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<PhoneNumber>> phoneNumbers() {
        return (Optional<List<PhoneNumber>>) phoneNumbers;
    }

    @JsonIgnore
    public List<Email> emails() {
        return emails;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<PassThroughBody>> passThrough() {
        return (Optional<List<PassThroughBody>>) passThrough;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The parent user id
     */
    public UserInput withParentId(String parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = JsonNullable.of(parentId);
        return this;
    }

    /**
     * The parent user id
     */
    public UserInput withParentId(JsonNullable<String> parentId) {
        Utils.checkNotNull(parentId, "parentId");
        this.parentId = parentId;
        return this;
    }

    /**
     * The username of the user
     */
    public UserInput withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = JsonNullable.of(username);
        return this;
    }

    /**
     * The username of the user
     */
    public UserInput withUsername(JsonNullable<String> username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
        return this;
    }

    /**
     * The first name of the person.
     */
    public UserInput withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = JsonNullable.of(firstName);
        return this;
    }

    /**
     * The first name of the person.
     */
    public UserInput withFirstName(JsonNullable<String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    /**
     * The last name of the person.
     */
    public UserInput withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = JsonNullable.of(lastName);
        return this;
    }

    /**
     * The last name of the person.
     */
    public UserInput withLastName(JsonNullable<String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    /**
     * The job title of the person.
     */
    public UserInput withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = JsonNullable.of(title);
        return this;
    }

    /**
     * The job title of the person.
     */
    public UserInput withTitle(JsonNullable<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    /**
     * The division the person is currently in. Usually a collection of departments or teams or regions.
     */
    public UserInput withDivision(String division) {
        Utils.checkNotNull(division, "division");
        this.division = JsonNullable.of(division);
        return this;
    }

    /**
     * The division the person is currently in. Usually a collection of departments or teams or regions.
     */
    public UserInput withDivision(JsonNullable<String> division) {
        Utils.checkNotNull(division, "division");
        this.division = division;
        return this;
    }

    /**
     * The department the person is currently in. [Deprecated](https://developers.apideck.com/changelog) in favor of the dedicated department_id and department_name field.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public UserInput withDepartment(String department) {
        Utils.checkNotNull(department, "department");
        this.department = JsonNullable.of(department);
        return this;
    }

    /**
     * The department the person is currently in. [Deprecated](https://developers.apideck.com/changelog) in favor of the dedicated department_id and department_name field.
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public UserInput withDepartment(JsonNullable<String> department) {
        Utils.checkNotNull(department, "department");
        this.department = department;
        return this;
    }

    /**
     * The name of the company.
     */
    public UserInput withCompanyName(String companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = JsonNullable.of(companyName);
        return this;
    }

    /**
     * The name of the company.
     */
    public UserInput withCompanyName(JsonNullable<String> companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = companyName;
        return this;
    }

    /**
     * An Employee Number, Employee ID or Employee Code, is a unique number that has been assigned to each individual staff member within a company.
     */
    public UserInput withEmployeeNumber(String employeeNumber) {
        Utils.checkNotNull(employeeNumber, "employeeNumber");
        this.employeeNumber = JsonNullable.of(employeeNumber);
        return this;
    }

    /**
     * An Employee Number, Employee ID or Employee Code, is a unique number that has been assigned to each individual staff member within a company.
     */
    public UserInput withEmployeeNumber(JsonNullable<String> employeeNumber) {
        Utils.checkNotNull(employeeNumber, "employeeNumber");
        this.employeeNumber = employeeNumber;
        return this;
    }

    /**
     * A description of the object.
     */
    public UserInput withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * A description of the object.
     */
    public UserInput withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * The URL of the user's avatar
     */
    public UserInput withImage(String image) {
        Utils.checkNotNull(image, "image");
        this.image = JsonNullable.of(image);
        return this;
    }

    /**
     * The URL of the user's avatar
     */
    public UserInput withImage(JsonNullable<String> image) {
        Utils.checkNotNull(image, "image");
        this.image = image;
        return this;
    }

    /**
     * language code according to ISO 639-1. For the United States - EN
     */
    public UserInput withLanguage(String language) {
        Utils.checkNotNull(language, "language");
        this.language = JsonNullable.of(language);
        return this;
    }

    /**
     * language code according to ISO 639-1. For the United States - EN
     */
    public UserInput withLanguage(JsonNullable<String> language) {
        Utils.checkNotNull(language, "language");
        this.language = language;
        return this;
    }

    /**
     * The status of the user
     */
    public UserInput withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = JsonNullable.of(status);
        return this;
    }

    /**
     * The status of the user
     */
    public UserInput withStatus(JsonNullable<String> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * The password of the user
     */
    public UserInput withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = JsonNullable.of(password);
        return this;
    }

    /**
     * The password of the user
     */
    public UserInput withPassword(JsonNullable<String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    public UserInput withAddresses(List<Address> addresses) {
        Utils.checkNotNull(addresses, "addresses");
        this.addresses = Optional.ofNullable(addresses);
        return this;
    }

    public UserInput withAddresses(Optional<? extends List<Address>> addresses) {
        Utils.checkNotNull(addresses, "addresses");
        this.addresses = addresses;
        return this;
    }

    public UserInput withPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        Utils.checkNotNull(phoneNumbers, "phoneNumbers");
        this.phoneNumbers = Optional.ofNullable(phoneNumbers);
        return this;
    }

    public UserInput withPhoneNumbers(Optional<? extends List<PhoneNumber>> phoneNumbers) {
        Utils.checkNotNull(phoneNumbers, "phoneNumbers");
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    public UserInput withEmails(List<Email> emails) {
        Utils.checkNotNull(emails, "emails");
        this.emails = emails;
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public UserInput withPassThrough(List<PassThroughBody> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public UserInput withPassThrough(Optional<? extends List<PassThroughBody>> passThrough) {
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
        UserInput other = (UserInput) o;
        return 
            Objects.deepEquals(this.parentId, other.parentId) &&
            Objects.deepEquals(this.username, other.username) &&
            Objects.deepEquals(this.firstName, other.firstName) &&
            Objects.deepEquals(this.lastName, other.lastName) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.division, other.division) &&
            Objects.deepEquals(this.department, other.department) &&
            Objects.deepEquals(this.companyName, other.companyName) &&
            Objects.deepEquals(this.employeeNumber, other.employeeNumber) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.image, other.image) &&
            Objects.deepEquals(this.language, other.language) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.password, other.password) &&
            Objects.deepEquals(this.addresses, other.addresses) &&
            Objects.deepEquals(this.phoneNumbers, other.phoneNumbers) &&
            Objects.deepEquals(this.emails, other.emails) &&
            Objects.deepEquals(this.passThrough, other.passThrough);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            parentId,
            username,
            firstName,
            lastName,
            title,
            division,
            department,
            companyName,
            employeeNumber,
            description,
            image,
            language,
            status,
            password,
            addresses,
            phoneNumbers,
            emails,
            passThrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UserInput.class,
                "parentId", parentId,
                "username", username,
                "firstName", firstName,
                "lastName", lastName,
                "title", title,
                "division", division,
                "department", department,
                "companyName", companyName,
                "employeeNumber", employeeNumber,
                "description", description,
                "image", image,
                "language", language,
                "status", status,
                "password", password,
                "addresses", addresses,
                "phoneNumbers", phoneNumbers,
                "emails", emails,
                "passThrough", passThrough);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> parentId = JsonNullable.undefined();
 
        private JsonNullable<String> username = JsonNullable.undefined();
 
        private JsonNullable<String> firstName = JsonNullable.undefined();
 
        private JsonNullable<String> lastName = JsonNullable.undefined();
 
        private JsonNullable<String> title = JsonNullable.undefined();
 
        private JsonNullable<String> division = JsonNullable.undefined();
 
        @Deprecated
        private JsonNullable<String> department = JsonNullable.undefined();
 
        private JsonNullable<String> companyName = JsonNullable.undefined();
 
        private JsonNullable<String> employeeNumber = JsonNullable.undefined();
 
        private JsonNullable<String> description = JsonNullable.undefined();
 
        private JsonNullable<String> image = JsonNullable.undefined();
 
        private JsonNullable<String> language = JsonNullable.undefined();
 
        private JsonNullable<String> status = JsonNullable.undefined();
 
        private JsonNullable<String> password = JsonNullable.undefined();
 
        private Optional<? extends List<Address>> addresses = Optional.empty();
 
        private Optional<? extends List<PhoneNumber>> phoneNumbers = Optional.empty();
 
        private List<Email> emails;
 
        private Optional<? extends List<PassThroughBody>> passThrough = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The parent user id
         */
        public Builder parentId(String parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = JsonNullable.of(parentId);
            return this;
        }

        /**
         * The parent user id
         */
        public Builder parentId(JsonNullable<String> parentId) {
            Utils.checkNotNull(parentId, "parentId");
            this.parentId = parentId;
            return this;
        }

        /**
         * The username of the user
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = JsonNullable.of(username);
            return this;
        }

        /**
         * The username of the user
         */
        public Builder username(JsonNullable<String> username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }

        /**
         * The first name of the person.
         */
        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = JsonNullable.of(firstName);
            return this;
        }

        /**
         * The first name of the person.
         */
        public Builder firstName(JsonNullable<String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        /**
         * The last name of the person.
         */
        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = JsonNullable.of(lastName);
            return this;
        }

        /**
         * The last name of the person.
         */
        public Builder lastName(JsonNullable<String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        /**
         * The job title of the person.
         */
        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = JsonNullable.of(title);
            return this;
        }

        /**
         * The job title of the person.
         */
        public Builder title(JsonNullable<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        /**
         * The division the person is currently in. Usually a collection of departments or teams or regions.
         */
        public Builder division(String division) {
            Utils.checkNotNull(division, "division");
            this.division = JsonNullable.of(division);
            return this;
        }

        /**
         * The division the person is currently in. Usually a collection of departments or teams or regions.
         */
        public Builder division(JsonNullable<String> division) {
            Utils.checkNotNull(division, "division");
            this.division = division;
            return this;
        }

        /**
         * The department the person is currently in. [Deprecated](https://developers.apideck.com/changelog) in favor of the dedicated department_id and department_name field.
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder department(String department) {
            Utils.checkNotNull(department, "department");
            this.department = JsonNullable.of(department);
            return this;
        }

        /**
         * The department the person is currently in. [Deprecated](https://developers.apideck.com/changelog) in favor of the dedicated department_id and department_name field.
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder department(JsonNullable<String> department) {
            Utils.checkNotNull(department, "department");
            this.department = department;
            return this;
        }

        /**
         * The name of the company.
         */
        public Builder companyName(String companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = JsonNullable.of(companyName);
            return this;
        }

        /**
         * The name of the company.
         */
        public Builder companyName(JsonNullable<String> companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = companyName;
            return this;
        }

        /**
         * An Employee Number, Employee ID or Employee Code, is a unique number that has been assigned to each individual staff member within a company.
         */
        public Builder employeeNumber(String employeeNumber) {
            Utils.checkNotNull(employeeNumber, "employeeNumber");
            this.employeeNumber = JsonNullable.of(employeeNumber);
            return this;
        }

        /**
         * An Employee Number, Employee ID or Employee Code, is a unique number that has been assigned to each individual staff member within a company.
         */
        public Builder employeeNumber(JsonNullable<String> employeeNumber) {
            Utils.checkNotNull(employeeNumber, "employeeNumber");
            this.employeeNumber = employeeNumber;
            return this;
        }

        /**
         * A description of the object.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * A description of the object.
         */
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * The URL of the user's avatar
         */
        public Builder image(String image) {
            Utils.checkNotNull(image, "image");
            this.image = JsonNullable.of(image);
            return this;
        }

        /**
         * The URL of the user's avatar
         */
        public Builder image(JsonNullable<String> image) {
            Utils.checkNotNull(image, "image");
            this.image = image;
            return this;
        }

        /**
         * language code according to ISO 639-1. For the United States - EN
         */
        public Builder language(String language) {
            Utils.checkNotNull(language, "language");
            this.language = JsonNullable.of(language);
            return this;
        }

        /**
         * language code according to ISO 639-1. For the United States - EN
         */
        public Builder language(JsonNullable<String> language) {
            Utils.checkNotNull(language, "language");
            this.language = language;
            return this;
        }

        /**
         * The status of the user
         */
        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = JsonNullable.of(status);
            return this;
        }

        /**
         * The status of the user
         */
        public Builder status(JsonNullable<String> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * The password of the user
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = JsonNullable.of(password);
            return this;
        }

        /**
         * The password of the user
         */
        public Builder password(JsonNullable<String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        public Builder addresses(List<Address> addresses) {
            Utils.checkNotNull(addresses, "addresses");
            this.addresses = Optional.ofNullable(addresses);
            return this;
        }

        public Builder addresses(Optional<? extends List<Address>> addresses) {
            Utils.checkNotNull(addresses, "addresses");
            this.addresses = addresses;
            return this;
        }

        public Builder phoneNumbers(List<PhoneNumber> phoneNumbers) {
            Utils.checkNotNull(phoneNumbers, "phoneNumbers");
            this.phoneNumbers = Optional.ofNullable(phoneNumbers);
            return this;
        }

        public Builder phoneNumbers(Optional<? extends List<PhoneNumber>> phoneNumbers) {
            Utils.checkNotNull(phoneNumbers, "phoneNumbers");
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        public Builder emails(List<Email> emails) {
            Utils.checkNotNull(emails, "emails");
            this.emails = emails;
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
        
        public UserInput build() {
            return new UserInput(
                parentId,
                username,
                firstName,
                lastName,
                title,
                division,
                department,
                companyName,
                employeeNumber,
                description,
                image,
                language,
                status,
                password,
                addresses,
                phoneNumbers,
                emails,
                passThrough);
        }
    }
}

