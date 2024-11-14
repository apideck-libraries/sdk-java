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


public class ConnectorSetting {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("label")
    private Optional<String> label;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends ConnectorSettingType> type;

    @JsonCreator
    public ConnectorSetting(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("label") Optional<String> label,
            @JsonProperty("type") Optional<? extends ConnectorSettingType> type) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(label, "label");
        Utils.checkNotNull(type, "type");
        this.id = id;
        this.label = label;
        this.type = type;
    }
    
    public ConnectorSetting() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> label() {
        return label;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ConnectorSettingType> type() {
        return (Optional<ConnectorSettingType>) type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ConnectorSetting withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public ConnectorSetting withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public ConnectorSetting withLabel(String label) {
        Utils.checkNotNull(label, "label");
        this.label = Optional.ofNullable(label);
        return this;
    }

    public ConnectorSetting withLabel(Optional<String> label) {
        Utils.checkNotNull(label, "label");
        this.label = label;
        return this;
    }

    public ConnectorSetting withType(ConnectorSettingType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public ConnectorSetting withType(Optional<? extends ConnectorSettingType> type) {
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
        ConnectorSetting other = (ConnectorSetting) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.label, other.label) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            label,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConnectorSetting.class,
                "id", id,
                "label", label,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> label = Optional.empty();
 
        private Optional<? extends ConnectorSettingType> type = Optional.empty();  
        
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
            this.label = Optional.ofNullable(label);
            return this;
        }

        public Builder label(Optional<String> label) {
            Utils.checkNotNull(label, "label");
            this.label = label;
            return this;
        }

        public Builder type(ConnectorSettingType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends ConnectorSettingType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public ConnectorSetting build() {
            return new ConnectorSetting(
                id,
                label,
                type);
        }
    }
}

