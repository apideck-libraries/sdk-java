/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.apideck.unify.utils.LazySingletonValue;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class FormField {

    /**
     * The unique identifier of the form field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * The label of the field
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("label")
    private Optional<String> label;

    /**
     * The placeholder for the form field
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("placeholder")
    private JsonNullable<String> placeholder;

    /**
     * The description of the form field
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends FormFieldType> type;

    /**
     * Indicates if the form field is required, which means it must be filled in before the form can be submitted
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required")
    private Optional<Boolean> required;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_field")
    private Optional<Boolean> customField;

    /**
     * Only applicable to select fields. Allow the user to add a custom value though the option select if the desired value is not in the option select list.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allow_custom_values")
    private Optional<Boolean> allowCustomValues;

    /**
     * Indicates if the form field is displayed in a “read-only” mode.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("disabled")
    private JsonNullable<Boolean> disabled;

    /**
     * Indicates if the form field is not displayed but the value that is being stored on the connection.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden")
    private JsonNullable<Boolean> hidden;

    /**
     * When the setting is deprecated, it should be hidden from the user interface. The value will still be stored on the connection for the sake of backwards compatibility.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deprecated")
    private JsonNullable<Boolean> deprecated;

    /**
     * Indicates if the form field contains sensitive data, which will display the value as a masked input.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sensitive")
    private JsonNullable<Boolean> sensitive;

    /**
     * Prefix to display in front of the form field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prefix")
    private JsonNullable<String> prefix;

    /**
     * Suffix to display next to the form field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("suffix")
    private JsonNullable<String> suffix;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    private Optional<? extends List<FormFieldOption>> options;

    @JsonCreator
    public FormField(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("label") Optional<String> label,
            @JsonProperty("placeholder") JsonNullable<String> placeholder,
            @JsonProperty("description") JsonNullable<String> description,
            @JsonProperty("type") Optional<? extends FormFieldType> type,
            @JsonProperty("required") Optional<Boolean> required,
            @JsonProperty("custom_field") Optional<Boolean> customField,
            @JsonProperty("allow_custom_values") Optional<Boolean> allowCustomValues,
            @JsonProperty("disabled") JsonNullable<Boolean> disabled,
            @JsonProperty("hidden") JsonNullable<Boolean> hidden,
            @JsonProperty("deprecated") JsonNullable<Boolean> deprecated,
            @JsonProperty("sensitive") JsonNullable<Boolean> sensitive,
            @JsonProperty("prefix") JsonNullable<String> prefix,
            @JsonProperty("suffix") JsonNullable<String> suffix,
            @JsonProperty("options") Optional<? extends List<FormFieldOption>> options) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(label, "label");
        Utils.checkNotNull(placeholder, "placeholder");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(required, "required");
        Utils.checkNotNull(customField, "customField");
        Utils.checkNotNull(allowCustomValues, "allowCustomValues");
        Utils.checkNotNull(disabled, "disabled");
        Utils.checkNotNull(hidden, "hidden");
        Utils.checkNotNull(deprecated, "deprecated");
        Utils.checkNotNull(sensitive, "sensitive");
        Utils.checkNotNull(prefix, "prefix");
        Utils.checkNotNull(suffix, "suffix");
        Utils.checkNotNull(options, "options");
        this.id = id;
        this.label = label;
        this.placeholder = placeholder;
        this.description = description;
        this.type = type;
        this.required = required;
        this.customField = customField;
        this.allowCustomValues = allowCustomValues;
        this.disabled = disabled;
        this.hidden = hidden;
        this.deprecated = deprecated;
        this.sensitive = sensitive;
        this.prefix = prefix;
        this.suffix = suffix;
        this.options = options;
    }
    
    public FormField() {
        this(Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * The unique identifier of the form field.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * The label of the field
     */
    @JsonIgnore
    public Optional<String> label() {
        return label;
    }

    /**
     * The placeholder for the form field
     */
    @JsonIgnore
    public JsonNullable<String> placeholder() {
        return placeholder;
    }

    /**
     * The description of the form field
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<FormFieldType> type() {
        return (Optional<FormFieldType>) type;
    }

    /**
     * Indicates if the form field is required, which means it must be filled in before the form can be submitted
     */
    @JsonIgnore
    public Optional<Boolean> required() {
        return required;
    }

    @JsonIgnore
    public Optional<Boolean> customField() {
        return customField;
    }

    /**
     * Only applicable to select fields. Allow the user to add a custom value though the option select if the desired value is not in the option select list.
     */
    @JsonIgnore
    public Optional<Boolean> allowCustomValues() {
        return allowCustomValues;
    }

    /**
     * Indicates if the form field is displayed in a “read-only” mode.
     */
    @JsonIgnore
    public JsonNullable<Boolean> disabled() {
        return disabled;
    }

    /**
     * Indicates if the form field is not displayed but the value that is being stored on the connection.
     */
    @JsonIgnore
    public JsonNullable<Boolean> hidden() {
        return hidden;
    }

    /**
     * When the setting is deprecated, it should be hidden from the user interface. The value will still be stored on the connection for the sake of backwards compatibility.
     */
    @JsonIgnore
    public JsonNullable<Boolean> deprecated() {
        return deprecated;
    }

    /**
     * Indicates if the form field contains sensitive data, which will display the value as a masked input.
     */
    @JsonIgnore
    public JsonNullable<Boolean> sensitive() {
        return sensitive;
    }

    /**
     * Prefix to display in front of the form field.
     */
    @JsonIgnore
    public JsonNullable<String> prefix() {
        return prefix;
    }

    /**
     * Suffix to display next to the form field.
     */
    @JsonIgnore
    public JsonNullable<String> suffix() {
        return suffix;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<FormFieldOption>> options() {
        return (Optional<List<FormFieldOption>>) options;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The unique identifier of the form field.
     */
    public FormField withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * The unique identifier of the form field.
     */
    public FormField withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The label of the field
     */
    public FormField withLabel(String label) {
        Utils.checkNotNull(label, "label");
        this.label = Optional.ofNullable(label);
        return this;
    }

    /**
     * The label of the field
     */
    public FormField withLabel(Optional<String> label) {
        Utils.checkNotNull(label, "label");
        this.label = label;
        return this;
    }

    /**
     * The placeholder for the form field
     */
    public FormField withPlaceholder(String placeholder) {
        Utils.checkNotNull(placeholder, "placeholder");
        this.placeholder = JsonNullable.of(placeholder);
        return this;
    }

    /**
     * The placeholder for the form field
     */
    public FormField withPlaceholder(JsonNullable<String> placeholder) {
        Utils.checkNotNull(placeholder, "placeholder");
        this.placeholder = placeholder;
        return this;
    }

    /**
     * The description of the form field
     */
    public FormField withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * The description of the form field
     */
    public FormField withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public FormField withType(FormFieldType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public FormField withType(Optional<? extends FormFieldType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Indicates if the form field is required, which means it must be filled in before the form can be submitted
     */
    public FormField withRequired(boolean required) {
        Utils.checkNotNull(required, "required");
        this.required = Optional.ofNullable(required);
        return this;
    }

    /**
     * Indicates if the form field is required, which means it must be filled in before the form can be submitted
     */
    public FormField withRequired(Optional<Boolean> required) {
        Utils.checkNotNull(required, "required");
        this.required = required;
        return this;
    }

    public FormField withCustomField(boolean customField) {
        Utils.checkNotNull(customField, "customField");
        this.customField = Optional.ofNullable(customField);
        return this;
    }

    public FormField withCustomField(Optional<Boolean> customField) {
        Utils.checkNotNull(customField, "customField");
        this.customField = customField;
        return this;
    }

    /**
     * Only applicable to select fields. Allow the user to add a custom value though the option select if the desired value is not in the option select list.
     */
    public FormField withAllowCustomValues(boolean allowCustomValues) {
        Utils.checkNotNull(allowCustomValues, "allowCustomValues");
        this.allowCustomValues = Optional.ofNullable(allowCustomValues);
        return this;
    }

    /**
     * Only applicable to select fields. Allow the user to add a custom value though the option select if the desired value is not in the option select list.
     */
    public FormField withAllowCustomValues(Optional<Boolean> allowCustomValues) {
        Utils.checkNotNull(allowCustomValues, "allowCustomValues");
        this.allowCustomValues = allowCustomValues;
        return this;
    }

    /**
     * Indicates if the form field is displayed in a “read-only” mode.
     */
    public FormField withDisabled(boolean disabled) {
        Utils.checkNotNull(disabled, "disabled");
        this.disabled = JsonNullable.of(disabled);
        return this;
    }

    /**
     * Indicates if the form field is displayed in a “read-only” mode.
     */
    public FormField withDisabled(JsonNullable<Boolean> disabled) {
        Utils.checkNotNull(disabled, "disabled");
        this.disabled = disabled;
        return this;
    }

    /**
     * Indicates if the form field is not displayed but the value that is being stored on the connection.
     */
    public FormField withHidden(boolean hidden) {
        Utils.checkNotNull(hidden, "hidden");
        this.hidden = JsonNullable.of(hidden);
        return this;
    }

    /**
     * Indicates if the form field is not displayed but the value that is being stored on the connection.
     */
    public FormField withHidden(JsonNullable<Boolean> hidden) {
        Utils.checkNotNull(hidden, "hidden");
        this.hidden = hidden;
        return this;
    }

    /**
     * When the setting is deprecated, it should be hidden from the user interface. The value will still be stored on the connection for the sake of backwards compatibility.
     */
    public FormField withDeprecated(boolean deprecated) {
        Utils.checkNotNull(deprecated, "deprecated");
        this.deprecated = JsonNullable.of(deprecated);
        return this;
    }

    /**
     * When the setting is deprecated, it should be hidden from the user interface. The value will still be stored on the connection for the sake of backwards compatibility.
     */
    public FormField withDeprecated(JsonNullable<Boolean> deprecated) {
        Utils.checkNotNull(deprecated, "deprecated");
        this.deprecated = deprecated;
        return this;
    }

    /**
     * Indicates if the form field contains sensitive data, which will display the value as a masked input.
     */
    public FormField withSensitive(boolean sensitive) {
        Utils.checkNotNull(sensitive, "sensitive");
        this.sensitive = JsonNullable.of(sensitive);
        return this;
    }

    /**
     * Indicates if the form field contains sensitive data, which will display the value as a masked input.
     */
    public FormField withSensitive(JsonNullable<Boolean> sensitive) {
        Utils.checkNotNull(sensitive, "sensitive");
        this.sensitive = sensitive;
        return this;
    }

    /**
     * Prefix to display in front of the form field.
     */
    public FormField withPrefix(String prefix) {
        Utils.checkNotNull(prefix, "prefix");
        this.prefix = JsonNullable.of(prefix);
        return this;
    }

    /**
     * Prefix to display in front of the form field.
     */
    public FormField withPrefix(JsonNullable<String> prefix) {
        Utils.checkNotNull(prefix, "prefix");
        this.prefix = prefix;
        return this;
    }

    /**
     * Suffix to display next to the form field.
     */
    public FormField withSuffix(String suffix) {
        Utils.checkNotNull(suffix, "suffix");
        this.suffix = JsonNullable.of(suffix);
        return this;
    }

    /**
     * Suffix to display next to the form field.
     */
    public FormField withSuffix(JsonNullable<String> suffix) {
        Utils.checkNotNull(suffix, "suffix");
        this.suffix = suffix;
        return this;
    }

    public FormField withOptions(List<FormFieldOption> options) {
        Utils.checkNotNull(options, "options");
        this.options = Optional.ofNullable(options);
        return this;
    }

    public FormField withOptions(Optional<? extends List<FormFieldOption>> options) {
        Utils.checkNotNull(options, "options");
        this.options = options;
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
        FormField other = (FormField) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.label, other.label) &&
            Objects.deepEquals(this.placeholder, other.placeholder) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.required, other.required) &&
            Objects.deepEquals(this.customField, other.customField) &&
            Objects.deepEquals(this.allowCustomValues, other.allowCustomValues) &&
            Objects.deepEquals(this.disabled, other.disabled) &&
            Objects.deepEquals(this.hidden, other.hidden) &&
            Objects.deepEquals(this.deprecated, other.deprecated) &&
            Objects.deepEquals(this.sensitive, other.sensitive) &&
            Objects.deepEquals(this.prefix, other.prefix) &&
            Objects.deepEquals(this.suffix, other.suffix) &&
            Objects.deepEquals(this.options, other.options);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            label,
            placeholder,
            description,
            type,
            required,
            customField,
            allowCustomValues,
            disabled,
            hidden,
            deprecated,
            sensitive,
            prefix,
            suffix,
            options);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FormField.class,
                "id", id,
                "label", label,
                "placeholder", placeholder,
                "description", description,
                "type", type,
                "required", required,
                "customField", customField,
                "allowCustomValues", allowCustomValues,
                "disabled", disabled,
                "hidden", hidden,
                "deprecated", deprecated,
                "sensitive", sensitive,
                "prefix", prefix,
                "suffix", suffix,
                "options", options);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> label = Optional.empty();
 
        private JsonNullable<String> placeholder = JsonNullable.undefined();
 
        private JsonNullable<String> description = JsonNullable.undefined();
 
        private Optional<? extends FormFieldType> type = Optional.empty();
 
        private Optional<Boolean> required = Optional.empty();
 
        private Optional<Boolean> customField = Optional.empty();
 
        private Optional<Boolean> allowCustomValues;
 
        private JsonNullable<Boolean> disabled = JsonNullable.undefined();
 
        private JsonNullable<Boolean> hidden = JsonNullable.undefined();
 
        private JsonNullable<Boolean> deprecated = JsonNullable.undefined();
 
        private JsonNullable<Boolean> sensitive = JsonNullable.undefined();
 
        private JsonNullable<String> prefix = JsonNullable.undefined();
 
        private JsonNullable<String> suffix = JsonNullable.undefined();
 
        private Optional<? extends List<FormFieldOption>> options = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique identifier of the form field.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * The unique identifier of the form field.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The label of the field
         */
        public Builder label(String label) {
            Utils.checkNotNull(label, "label");
            this.label = Optional.ofNullable(label);
            return this;
        }

        /**
         * The label of the field
         */
        public Builder label(Optional<String> label) {
            Utils.checkNotNull(label, "label");
            this.label = label;
            return this;
        }

        /**
         * The placeholder for the form field
         */
        public Builder placeholder(String placeholder) {
            Utils.checkNotNull(placeholder, "placeholder");
            this.placeholder = JsonNullable.of(placeholder);
            return this;
        }

        /**
         * The placeholder for the form field
         */
        public Builder placeholder(JsonNullable<String> placeholder) {
            Utils.checkNotNull(placeholder, "placeholder");
            this.placeholder = placeholder;
            return this;
        }

        /**
         * The description of the form field
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * The description of the form field
         */
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        public Builder type(FormFieldType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends FormFieldType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Indicates if the form field is required, which means it must be filled in before the form can be submitted
         */
        public Builder required(boolean required) {
            Utils.checkNotNull(required, "required");
            this.required = Optional.ofNullable(required);
            return this;
        }

        /**
         * Indicates if the form field is required, which means it must be filled in before the form can be submitted
         */
        public Builder required(Optional<Boolean> required) {
            Utils.checkNotNull(required, "required");
            this.required = required;
            return this;
        }

        public Builder customField(boolean customField) {
            Utils.checkNotNull(customField, "customField");
            this.customField = Optional.ofNullable(customField);
            return this;
        }

        public Builder customField(Optional<Boolean> customField) {
            Utils.checkNotNull(customField, "customField");
            this.customField = customField;
            return this;
        }

        /**
         * Only applicable to select fields. Allow the user to add a custom value though the option select if the desired value is not in the option select list.
         */
        public Builder allowCustomValues(boolean allowCustomValues) {
            Utils.checkNotNull(allowCustomValues, "allowCustomValues");
            this.allowCustomValues = Optional.ofNullable(allowCustomValues);
            return this;
        }

        /**
         * Only applicable to select fields. Allow the user to add a custom value though the option select if the desired value is not in the option select list.
         */
        public Builder allowCustomValues(Optional<Boolean> allowCustomValues) {
            Utils.checkNotNull(allowCustomValues, "allowCustomValues");
            this.allowCustomValues = allowCustomValues;
            return this;
        }

        /**
         * Indicates if the form field is displayed in a “read-only” mode.
         */
        public Builder disabled(boolean disabled) {
            Utils.checkNotNull(disabled, "disabled");
            this.disabled = JsonNullable.of(disabled);
            return this;
        }

        /**
         * Indicates if the form field is displayed in a “read-only” mode.
         */
        public Builder disabled(JsonNullable<Boolean> disabled) {
            Utils.checkNotNull(disabled, "disabled");
            this.disabled = disabled;
            return this;
        }

        /**
         * Indicates if the form field is not displayed but the value that is being stored on the connection.
         */
        public Builder hidden(boolean hidden) {
            Utils.checkNotNull(hidden, "hidden");
            this.hidden = JsonNullable.of(hidden);
            return this;
        }

        /**
         * Indicates if the form field is not displayed but the value that is being stored on the connection.
         */
        public Builder hidden(JsonNullable<Boolean> hidden) {
            Utils.checkNotNull(hidden, "hidden");
            this.hidden = hidden;
            return this;
        }

        /**
         * When the setting is deprecated, it should be hidden from the user interface. The value will still be stored on the connection for the sake of backwards compatibility.
         */
        public Builder deprecated(boolean deprecated) {
            Utils.checkNotNull(deprecated, "deprecated");
            this.deprecated = JsonNullable.of(deprecated);
            return this;
        }

        /**
         * When the setting is deprecated, it should be hidden from the user interface. The value will still be stored on the connection for the sake of backwards compatibility.
         */
        public Builder deprecated(JsonNullable<Boolean> deprecated) {
            Utils.checkNotNull(deprecated, "deprecated");
            this.deprecated = deprecated;
            return this;
        }

        /**
         * Indicates if the form field contains sensitive data, which will display the value as a masked input.
         */
        public Builder sensitive(boolean sensitive) {
            Utils.checkNotNull(sensitive, "sensitive");
            this.sensitive = JsonNullable.of(sensitive);
            return this;
        }

        /**
         * Indicates if the form field contains sensitive data, which will display the value as a masked input.
         */
        public Builder sensitive(JsonNullable<Boolean> sensitive) {
            Utils.checkNotNull(sensitive, "sensitive");
            this.sensitive = sensitive;
            return this;
        }

        /**
         * Prefix to display in front of the form field.
         */
        public Builder prefix(String prefix) {
            Utils.checkNotNull(prefix, "prefix");
            this.prefix = JsonNullable.of(prefix);
            return this;
        }

        /**
         * Prefix to display in front of the form field.
         */
        public Builder prefix(JsonNullable<String> prefix) {
            Utils.checkNotNull(prefix, "prefix");
            this.prefix = prefix;
            return this;
        }

        /**
         * Suffix to display next to the form field.
         */
        public Builder suffix(String suffix) {
            Utils.checkNotNull(suffix, "suffix");
            this.suffix = JsonNullable.of(suffix);
            return this;
        }

        /**
         * Suffix to display next to the form field.
         */
        public Builder suffix(JsonNullable<String> suffix) {
            Utils.checkNotNull(suffix, "suffix");
            this.suffix = suffix;
            return this;
        }

        public Builder options(List<FormFieldOption> options) {
            Utils.checkNotNull(options, "options");
            this.options = Optional.ofNullable(options);
            return this;
        }

        public Builder options(Optional<? extends List<FormFieldOption>> options) {
            Utils.checkNotNull(options, "options");
            this.options = options;
            return this;
        }
        
        public FormField build() {
            if (allowCustomValues == null) {
                allowCustomValues = _SINGLETON_VALUE_AllowCustomValues.value();
            }
            return new FormField(
                id,
                label,
                placeholder,
                description,
                type,
                required,
                customField,
                allowCustomValues,
                disabled,
                hidden,
                deprecated,
                sensitive,
                prefix,
                suffix,
                options);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_AllowCustomValues =
                new LazySingletonValue<>(
                        "allow_custom_values",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});
    }
}
