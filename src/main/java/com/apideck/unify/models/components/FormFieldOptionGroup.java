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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class FormFieldOptionGroup implements FormFieldOption {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonProperty("label")
    private String label;

    @JsonProperty("options")
    private List<SimpleFormFieldOption> options;

    @JsonProperty("option_type")
    private FormFieldOptionGroupOptionType optionType;

    @JsonCreator
    public FormFieldOptionGroup(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("label") String label,
            @JsonProperty("options") List<SimpleFormFieldOption> options,
            @JsonProperty("option_type") FormFieldOptionGroupOptionType optionType) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(label, "label");
        Utils.checkNotNull(options, "options");
        Utils.checkNotNull(optionType, "optionType");
        this.id = id;
        this.label = label;
        this.options = options;
        this.optionType = optionType;
    }
    
    public FormFieldOptionGroup(
            String label,
            List<SimpleFormFieldOption> options,
            FormFieldOptionGroupOptionType optionType) {
        this(Optional.empty(), label, options, optionType);
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public String label() {
        return label;
    }

    @JsonIgnore
    public List<SimpleFormFieldOption> options() {
        return options;
    }

    @JsonIgnore
    @Override
    public String optionType() {
        return Utils.discriminatorToString(optionType);
    }

    public final static Builder builder() {
        return new Builder();
    }

    public FormFieldOptionGroup withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public FormFieldOptionGroup withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public FormFieldOptionGroup withLabel(String label) {
        Utils.checkNotNull(label, "label");
        this.label = label;
        return this;
    }

    public FormFieldOptionGroup withOptions(List<SimpleFormFieldOption> options) {
        Utils.checkNotNull(options, "options");
        this.options = options;
        return this;
    }

    public FormFieldOptionGroup withOptionType(FormFieldOptionGroupOptionType optionType) {
        Utils.checkNotNull(optionType, "optionType");
        this.optionType = optionType;
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
        FormFieldOptionGroup other = (FormFieldOptionGroup) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.label, other.label) &&
            Objects.deepEquals(this.options, other.options) &&
            Objects.deepEquals(this.optionType, other.optionType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            label,
            options,
            optionType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FormFieldOptionGroup.class,
                "id", id,
                "label", label,
                "options", options,
                "optionType", optionType);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private String label;
 
        private List<SimpleFormFieldOption> options;
 
        private FormFieldOptionGroupOptionType optionType;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder label(String label) {
            Utils.checkNotNull(label, "label");
            this.label = label;
            return this;
        }

        public Builder options(List<SimpleFormFieldOption> options) {
            Utils.checkNotNull(options, "options");
            this.options = options;
            return this;
        }

        public Builder optionType(FormFieldOptionGroupOptionType optionType) {
            Utils.checkNotNull(optionType, "optionType");
            this.optionType = optionType;
            return this;
        }
        
        public FormFieldOptionGroup build() {
            return new FormFieldOptionGroup(
                id,
                label,
                options,
                optionType);
        }
    }
}

