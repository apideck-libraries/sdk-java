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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class WebhookSupportResources {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("events")
    private Optional<? extends List<String>> events;

    @JsonCreator
    public WebhookSupportResources(
            @JsonProperty("events") Optional<? extends List<String>> events) {
        Utils.checkNotNull(events, "events");
        this.events = events;
    }
    
    public WebhookSupportResources() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> events() {
        return (Optional<List<String>>) events;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public WebhookSupportResources withEvents(List<String> events) {
        Utils.checkNotNull(events, "events");
        this.events = Optional.ofNullable(events);
        return this;
    }

    public WebhookSupportResources withEvents(Optional<? extends List<String>> events) {
        Utils.checkNotNull(events, "events");
        this.events = events;
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
        WebhookSupportResources other = (WebhookSupportResources) o;
        return 
            Objects.deepEquals(this.events, other.events);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            events);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WebhookSupportResources.class,
                "events", events);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<String>> events = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder events(List<String> events) {
            Utils.checkNotNull(events, "events");
            this.events = Optional.ofNullable(events);
            return this;
        }

        public Builder events(Optional<? extends List<String>> events) {
            Utils.checkNotNull(events, "events");
            this.events = events;
            return this;
        }
        
        public WebhookSupportResources build() {
            return new WebhookSupportResources(
                events);
        }
    }
}

