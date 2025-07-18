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
import org.openapitools.jackson.nullable.JsonNullable;


public class PhoneNumber {
    /**
     * Unique identifier of the phone number
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<String> id;

    /**
     * The country code of the phone number, e.g. +1
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country_code")
    private JsonNullable<String> countryCode;

    /**
     * The area code of the phone number, e.g. 323
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("area_code")
    private JsonNullable<String> areaCode;

    /**
     * The phone number
     */
    @JsonProperty("number")
    private String number;

    /**
     * The extension of the phone number
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("extension")
    private JsonNullable<String> extension;

    /**
     * The type of phone number
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private JsonNullable<? extends PhoneNumberType> type;

    @JsonCreator
    public PhoneNumber(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("country_code") JsonNullable<String> countryCode,
            @JsonProperty("area_code") JsonNullable<String> areaCode,
            @JsonProperty("number") String number,
            @JsonProperty("extension") JsonNullable<String> extension,
            @JsonProperty("type") JsonNullable<? extends PhoneNumberType> type) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(countryCode, "countryCode");
        Utils.checkNotNull(areaCode, "areaCode");
        Utils.checkNotNull(number, "number");
        Utils.checkNotNull(extension, "extension");
        Utils.checkNotNull(type, "type");
        this.id = id;
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.number = number;
        this.extension = extension;
        this.type = type;
    }
    
    public PhoneNumber(
            String number) {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            number, JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Unique identifier of the phone number
     */
    @JsonIgnore
    public JsonNullable<String> id() {
        return id;
    }

    /**
     * The country code of the phone number, e.g. +1
     */
    @JsonIgnore
    public JsonNullable<String> countryCode() {
        return countryCode;
    }

    /**
     * The area code of the phone number, e.g. 323
     */
    @JsonIgnore
    public JsonNullable<String> areaCode() {
        return areaCode;
    }

    /**
     * The phone number
     */
    @JsonIgnore
    public String number() {
        return number;
    }

    /**
     * The extension of the phone number
     */
    @JsonIgnore
    public JsonNullable<String> extension() {
        return extension;
    }

    /**
     * The type of phone number
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<PhoneNumberType> type() {
        return (JsonNullable<PhoneNumberType>) type;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Unique identifier of the phone number
     */
    public PhoneNumber withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier of the phone number
     */
    public PhoneNumber withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The country code of the phone number, e.g. +1
     */
    public PhoneNumber withCountryCode(String countryCode) {
        Utils.checkNotNull(countryCode, "countryCode");
        this.countryCode = JsonNullable.of(countryCode);
        return this;
    }

    /**
     * The country code of the phone number, e.g. +1
     */
    public PhoneNumber withCountryCode(JsonNullable<String> countryCode) {
        Utils.checkNotNull(countryCode, "countryCode");
        this.countryCode = countryCode;
        return this;
    }

    /**
     * The area code of the phone number, e.g. 323
     */
    public PhoneNumber withAreaCode(String areaCode) {
        Utils.checkNotNull(areaCode, "areaCode");
        this.areaCode = JsonNullable.of(areaCode);
        return this;
    }

    /**
     * The area code of the phone number, e.g. 323
     */
    public PhoneNumber withAreaCode(JsonNullable<String> areaCode) {
        Utils.checkNotNull(areaCode, "areaCode");
        this.areaCode = areaCode;
        return this;
    }

    /**
     * The phone number
     */
    public PhoneNumber withNumber(String number) {
        Utils.checkNotNull(number, "number");
        this.number = number;
        return this;
    }

    /**
     * The extension of the phone number
     */
    public PhoneNumber withExtension(String extension) {
        Utils.checkNotNull(extension, "extension");
        this.extension = JsonNullable.of(extension);
        return this;
    }

    /**
     * The extension of the phone number
     */
    public PhoneNumber withExtension(JsonNullable<String> extension) {
        Utils.checkNotNull(extension, "extension");
        this.extension = extension;
        return this;
    }

    /**
     * The type of phone number
     */
    public PhoneNumber withType(PhoneNumberType type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * The type of phone number
     */
    public PhoneNumber withType(JsonNullable<? extends PhoneNumberType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        PhoneNumber other = (PhoneNumber) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.countryCode, other.countryCode) &&
            Utils.enhancedDeepEquals(this.areaCode, other.areaCode) &&
            Utils.enhancedDeepEquals(this.number, other.number) &&
            Utils.enhancedDeepEquals(this.extension, other.extension) &&
            Utils.enhancedDeepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, countryCode, areaCode,
            number, extension, type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PhoneNumber.class,
                "id", id,
                "countryCode", countryCode,
                "areaCode", areaCode,
                "number", number,
                "extension", extension,
                "type", type);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<String> id = JsonNullable.undefined();

        private JsonNullable<String> countryCode = JsonNullable.undefined();

        private JsonNullable<String> areaCode = JsonNullable.undefined();

        private String number;

        private JsonNullable<String> extension = JsonNullable.undefined();

        private JsonNullable<? extends PhoneNumberType> type = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Unique identifier of the phone number
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * Unique identifier of the phone number
         */
        public Builder id(JsonNullable<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }


        /**
         * The country code of the phone number, e.g. +1
         */
        public Builder countryCode(String countryCode) {
            Utils.checkNotNull(countryCode, "countryCode");
            this.countryCode = JsonNullable.of(countryCode);
            return this;
        }

        /**
         * The country code of the phone number, e.g. +1
         */
        public Builder countryCode(JsonNullable<String> countryCode) {
            Utils.checkNotNull(countryCode, "countryCode");
            this.countryCode = countryCode;
            return this;
        }


        /**
         * The area code of the phone number, e.g. 323
         */
        public Builder areaCode(String areaCode) {
            Utils.checkNotNull(areaCode, "areaCode");
            this.areaCode = JsonNullable.of(areaCode);
            return this;
        }

        /**
         * The area code of the phone number, e.g. 323
         */
        public Builder areaCode(JsonNullable<String> areaCode) {
            Utils.checkNotNull(areaCode, "areaCode");
            this.areaCode = areaCode;
            return this;
        }


        /**
         * The phone number
         */
        public Builder number(String number) {
            Utils.checkNotNull(number, "number");
            this.number = number;
            return this;
        }


        /**
         * The extension of the phone number
         */
        public Builder extension(String extension) {
            Utils.checkNotNull(extension, "extension");
            this.extension = JsonNullable.of(extension);
            return this;
        }

        /**
         * The extension of the phone number
         */
        public Builder extension(JsonNullable<String> extension) {
            Utils.checkNotNull(extension, "extension");
            this.extension = extension;
            return this;
        }


        /**
         * The type of phone number
         */
        public Builder type(PhoneNumberType type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        /**
         * The type of phone number
         */
        public Builder type(JsonNullable<? extends PhoneNumberType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public PhoneNumber build() {

            return new PhoneNumber(
                id, countryCode, areaCode,
                number, extension, type);
        }

    }
}
