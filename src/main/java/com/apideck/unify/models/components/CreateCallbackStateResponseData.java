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
import java.util.Optional;


public class CreateCallbackStateResponseData {

    /**
     * Callback state
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    private Optional<String> state;

    @JsonCreator
    public CreateCallbackStateResponseData(
            @JsonProperty("state") Optional<String> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
    }
    
    public CreateCallbackStateResponseData() {
        this(Optional.empty());
    }

    /**
     * Callback state
     */
    @JsonIgnore
    public Optional<String> state() {
        return state;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Callback state
     */
    public CreateCallbackStateResponseData withState(String state) {
        Utils.checkNotNull(state, "state");
        this.state = Optional.ofNullable(state);
        return this;
    }

    /**
     * Callback state
     */
    public CreateCallbackStateResponseData withState(Optional<String> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
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
        CreateCallbackStateResponseData other = (CreateCallbackStateResponseData) o;
        return 
            Objects.deepEquals(this.state, other.state);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            state);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateCallbackStateResponseData.class,
                "state", state);
    }
    
    public final static class Builder {
 
        private Optional<String> state = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Callback state
         */
        public Builder state(String state) {
            Utils.checkNotNull(state, "state");
            this.state = Optional.ofNullable(state);
            return this;
        }

        /**
         * Callback state
         */
        public Builder state(Optional<String> state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }
        
        public CreateCallbackStateResponseData build() {
            return new CreateCallbackStateResponseData(
                state);
        }
    }
}

