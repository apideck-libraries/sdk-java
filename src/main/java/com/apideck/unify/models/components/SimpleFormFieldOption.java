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
import java.util.Optional;


public class SimpleFormFieldOption {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("label")
    private Optional<String> label;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private Optional<? extends SimpleFormFieldOptionValue> value;

    @JsonCreator
    public SimpleFormFieldOption(
            @JsonProperty("label") Optional<String> label,
            @JsonProperty("value") Optional<? extends SimpleFormFieldOptionValue> value) {
        Utils.checkNotNull(label, "label");
        Utils.checkNotNull(value, "value");
        this.label = label;
        this.value = value;
    }
    
    public SimpleFormFieldOption() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> label() {
        return label;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SimpleFormFieldOptionValue> value() {
        return (Optional<SimpleFormFieldOptionValue>) value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SimpleFormFieldOption withLabel(String label) {
        Utils.checkNotNull(label, "label");
        this.label = Optional.ofNullable(label);
        return this;
    }

    public SimpleFormFieldOption withLabel(Optional<String> label) {
        Utils.checkNotNull(label, "label");
        this.label = label;
        return this;
    }

    public SimpleFormFieldOption withValue(SimpleFormFieldOptionValue value) {
        Utils.checkNotNull(value, "value");
        this.value = Optional.ofNullable(value);
        return this;
    }

    public SimpleFormFieldOption withValue(Optional<? extends SimpleFormFieldOptionValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        SimpleFormFieldOption other = (SimpleFormFieldOption) o;
        return 
            Objects.deepEquals(this.label, other.label) &&
            Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            label,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SimpleFormFieldOption.class,
                "label", label,
                "value", value);
    }
    
    public final static class Builder {
 
        private Optional<String> label = Optional.empty();
 
        private Optional<? extends SimpleFormFieldOptionValue> value = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder label(String label) {
            Utils.checkNotNull(label, "label");
            this.label = Optional.ofNullable(label);
            return this;
        }

        public Builder label(Optional<String> label) {
            Utils.checkNotNull(label, "label");
            this.label = label;
            return this;
        }

        public Builder value(SimpleFormFieldOptionValue value) {
            Utils.checkNotNull(value, "value");
            this.value = Optional.ofNullable(value);
            return this;
        }

        public Builder value(Optional<? extends SimpleFormFieldOptionValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public SimpleFormFieldOption build() {
            return new SimpleFormFieldOption(
                label,
                value);
        }
    }
}

