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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.LocalDate;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;


public class Person {
    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<String> id;

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
     * Middle name of the person.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("middle_name")
    private JsonNullable<String> middleName;

    /**
     * The gender represents the gender identity of a person.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("gender")
    private JsonNullable<? extends Gender> gender;

    /**
     * Initials of the person
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("initials")
    private JsonNullable<String> initials;

    /**
     * Date of birth
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("birthday")
    private JsonNullable<LocalDate> birthday;

    /**
     * Date of death
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deceased_on")
    private JsonNullable<LocalDate> deceasedOn;

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_mappings")
    private JsonNullable<? extends Map<String, Object>> customMappings;

    @JsonCreator
    public Person(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("first_name") JsonNullable<String> firstName,
            @JsonProperty("last_name") JsonNullable<String> lastName,
            @JsonProperty("middle_name") JsonNullable<String> middleName,
            @JsonProperty("gender") JsonNullable<? extends Gender> gender,
            @JsonProperty("initials") JsonNullable<String> initials,
            @JsonProperty("birthday") JsonNullable<LocalDate> birthday,
            @JsonProperty("deceased_on") JsonNullable<LocalDate> deceasedOn,
            @JsonProperty("custom_mappings") JsonNullable<? extends Map<String, Object>> customMappings) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(middleName, "middleName");
        Utils.checkNotNull(gender, "gender");
        Utils.checkNotNull(initials, "initials");
        Utils.checkNotNull(birthday, "birthday");
        Utils.checkNotNull(deceasedOn, "deceasedOn");
        Utils.checkNotNull(customMappings, "customMappings");
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.gender = gender;
        this.initials = initials;
        this.birthday = birthday;
        this.deceasedOn = deceasedOn;
        this.customMappings = customMappings;
    }
    
    public Person() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public JsonNullable<String> id() {
        return id;
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
     * Middle name of the person.
     */
    @JsonIgnore
    public JsonNullable<String> middleName() {
        return middleName;
    }

    /**
     * The gender represents the gender identity of a person.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Gender> gender() {
        return (JsonNullable<Gender>) gender;
    }

    /**
     * Initials of the person
     */
    @JsonIgnore
    public JsonNullable<String> initials() {
        return initials;
    }

    /**
     * Date of birth
     */
    @JsonIgnore
    public JsonNullable<LocalDate> birthday() {
        return birthday;
    }

    /**
     * Date of death
     */
    @JsonIgnore
    public JsonNullable<LocalDate> deceasedOn() {
        return deceasedOn;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, Object>> customMappings() {
        return (JsonNullable<Map<String, Object>>) customMappings;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * A unique identifier for an object.
     */
    public Person withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public Person withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The first name of the person.
     */
    public Person withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = JsonNullable.of(firstName);
        return this;
    }

    /**
     * The first name of the person.
     */
    public Person withFirstName(JsonNullable<String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    /**
     * The last name of the person.
     */
    public Person withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = JsonNullable.of(lastName);
        return this;
    }

    /**
     * The last name of the person.
     */
    public Person withLastName(JsonNullable<String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    /**
     * Middle name of the person.
     */
    public Person withMiddleName(String middleName) {
        Utils.checkNotNull(middleName, "middleName");
        this.middleName = JsonNullable.of(middleName);
        return this;
    }

    /**
     * Middle name of the person.
     */
    public Person withMiddleName(JsonNullable<String> middleName) {
        Utils.checkNotNull(middleName, "middleName");
        this.middleName = middleName;
        return this;
    }

    /**
     * The gender represents the gender identity of a person.
     */
    public Person withGender(Gender gender) {
        Utils.checkNotNull(gender, "gender");
        this.gender = JsonNullable.of(gender);
        return this;
    }

    /**
     * The gender represents the gender identity of a person.
     */
    public Person withGender(JsonNullable<? extends Gender> gender) {
        Utils.checkNotNull(gender, "gender");
        this.gender = gender;
        return this;
    }

    /**
     * Initials of the person
     */
    public Person withInitials(String initials) {
        Utils.checkNotNull(initials, "initials");
        this.initials = JsonNullable.of(initials);
        return this;
    }

    /**
     * Initials of the person
     */
    public Person withInitials(JsonNullable<String> initials) {
        Utils.checkNotNull(initials, "initials");
        this.initials = initials;
        return this;
    }

    /**
     * Date of birth
     */
    public Person withBirthday(LocalDate birthday) {
        Utils.checkNotNull(birthday, "birthday");
        this.birthday = JsonNullable.of(birthday);
        return this;
    }

    /**
     * Date of birth
     */
    public Person withBirthday(JsonNullable<LocalDate> birthday) {
        Utils.checkNotNull(birthday, "birthday");
        this.birthday = birthday;
        return this;
    }

    /**
     * Date of death
     */
    public Person withDeceasedOn(LocalDate deceasedOn) {
        Utils.checkNotNull(deceasedOn, "deceasedOn");
        this.deceasedOn = JsonNullable.of(deceasedOn);
        return this;
    }

    /**
     * Date of death
     */
    public Person withDeceasedOn(JsonNullable<LocalDate> deceasedOn) {
        Utils.checkNotNull(deceasedOn, "deceasedOn");
        this.deceasedOn = deceasedOn;
        return this;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    public Person withCustomMappings(Map<String, Object> customMappings) {
        Utils.checkNotNull(customMappings, "customMappings");
        this.customMappings = JsonNullable.of(customMappings);
        return this;
    }

    /**
     * When custom mappings are configured on the resource, the result is included here.
     */
    public Person withCustomMappings(JsonNullable<? extends Map<String, Object>> customMappings) {
        Utils.checkNotNull(customMappings, "customMappings");
        this.customMappings = customMappings;
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
        Person other = (Person) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.firstName, other.firstName) &&
            Utils.enhancedDeepEquals(this.lastName, other.lastName) &&
            Utils.enhancedDeepEquals(this.middleName, other.middleName) &&
            Utils.enhancedDeepEquals(this.gender, other.gender) &&
            Utils.enhancedDeepEquals(this.initials, other.initials) &&
            Utils.enhancedDeepEquals(this.birthday, other.birthday) &&
            Utils.enhancedDeepEquals(this.deceasedOn, other.deceasedOn) &&
            Utils.enhancedDeepEquals(this.customMappings, other.customMappings);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, firstName, lastName,
            middleName, gender, initials,
            birthday, deceasedOn, customMappings);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Person.class,
                "id", id,
                "firstName", firstName,
                "lastName", lastName,
                "middleName", middleName,
                "gender", gender,
                "initials", initials,
                "birthday", birthday,
                "deceasedOn", deceasedOn,
                "customMappings", customMappings);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<String> id = JsonNullable.undefined();

        private JsonNullable<String> firstName = JsonNullable.undefined();

        private JsonNullable<String> lastName = JsonNullable.undefined();

        private JsonNullable<String> middleName = JsonNullable.undefined();

        private JsonNullable<? extends Gender> gender = JsonNullable.undefined();

        private JsonNullable<String> initials = JsonNullable.undefined();

        private JsonNullable<LocalDate> birthday = JsonNullable.undefined();

        private JsonNullable<LocalDate> deceasedOn = JsonNullable.undefined();

        private JsonNullable<? extends Map<String, Object>> customMappings = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * A unique identifier for an object.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder id(JsonNullable<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
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
         * Middle name of the person.
         */
        public Builder middleName(String middleName) {
            Utils.checkNotNull(middleName, "middleName");
            this.middleName = JsonNullable.of(middleName);
            return this;
        }

        /**
         * Middle name of the person.
         */
        public Builder middleName(JsonNullable<String> middleName) {
            Utils.checkNotNull(middleName, "middleName");
            this.middleName = middleName;
            return this;
        }


        /**
         * The gender represents the gender identity of a person.
         */
        public Builder gender(Gender gender) {
            Utils.checkNotNull(gender, "gender");
            this.gender = JsonNullable.of(gender);
            return this;
        }

        /**
         * The gender represents the gender identity of a person.
         */
        public Builder gender(JsonNullable<? extends Gender> gender) {
            Utils.checkNotNull(gender, "gender");
            this.gender = gender;
            return this;
        }


        /**
         * Initials of the person
         */
        public Builder initials(String initials) {
            Utils.checkNotNull(initials, "initials");
            this.initials = JsonNullable.of(initials);
            return this;
        }

        /**
         * Initials of the person
         */
        public Builder initials(JsonNullable<String> initials) {
            Utils.checkNotNull(initials, "initials");
            this.initials = initials;
            return this;
        }


        /**
         * Date of birth
         */
        public Builder birthday(LocalDate birthday) {
            Utils.checkNotNull(birthday, "birthday");
            this.birthday = JsonNullable.of(birthday);
            return this;
        }

        /**
         * Date of birth
         */
        public Builder birthday(JsonNullable<LocalDate> birthday) {
            Utils.checkNotNull(birthday, "birthday");
            this.birthday = birthday;
            return this;
        }


        /**
         * Date of death
         */
        public Builder deceasedOn(LocalDate deceasedOn) {
            Utils.checkNotNull(deceasedOn, "deceasedOn");
            this.deceasedOn = JsonNullable.of(deceasedOn);
            return this;
        }

        /**
         * Date of death
         */
        public Builder deceasedOn(JsonNullable<LocalDate> deceasedOn) {
            Utils.checkNotNull(deceasedOn, "deceasedOn");
            this.deceasedOn = deceasedOn;
            return this;
        }


        /**
         * When custom mappings are configured on the resource, the result is included here.
         */
        public Builder customMappings(Map<String, Object> customMappings) {
            Utils.checkNotNull(customMappings, "customMappings");
            this.customMappings = JsonNullable.of(customMappings);
            return this;
        }

        /**
         * When custom mappings are configured on the resource, the result is included here.
         */
        public Builder customMappings(JsonNullable<? extends Map<String, Object>> customMappings) {
            Utils.checkNotNull(customMappings, "customMappings");
            this.customMappings = customMappings;
            return this;
        }

        public Person build() {

            return new Person(
                id, firstName, lastName,
                middleName, gender, initials,
                birthday, deceasedOn, customMappings);
        }

    }
}
