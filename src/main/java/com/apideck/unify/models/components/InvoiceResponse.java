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
import org.openapitools.jackson.nullable.JsonNullable;


public class InvoiceResponse {

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    /**
     * The third-party API ID of original entity
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("downstream_id")
    private JsonNullable<String> downstreamId;

    @JsonCreator
    public InvoiceResponse(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("downstream_id") JsonNullable<String> downstreamId) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(downstreamId, "downstreamId");
        this.id = id;
        this.downstreamId = downstreamId;
    }
    
    public InvoiceResponse() {
        this(Optional.empty(), JsonNullable.undefined());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    /**
     * The third-party API ID of original entity
     */
    @JsonIgnore
    public JsonNullable<String> downstreamId() {
        return downstreamId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique identifier for an object.
     */
    public InvoiceResponse withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public InvoiceResponse withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The third-party API ID of original entity
     */
    public InvoiceResponse withDownstreamId(String downstreamId) {
        Utils.checkNotNull(downstreamId, "downstreamId");
        this.downstreamId = JsonNullable.of(downstreamId);
        return this;
    }

    /**
     * The third-party API ID of original entity
     */
    public InvoiceResponse withDownstreamId(JsonNullable<String> downstreamId) {
        Utils.checkNotNull(downstreamId, "downstreamId");
        this.downstreamId = downstreamId;
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
        InvoiceResponse other = (InvoiceResponse) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.downstreamId, other.downstreamId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            downstreamId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InvoiceResponse.class,
                "id", id,
                "downstreamId", downstreamId);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private JsonNullable<String> downstreamId = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A unique identifier for an object.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The third-party API ID of original entity
         */
        public Builder downstreamId(String downstreamId) {
            Utils.checkNotNull(downstreamId, "downstreamId");
            this.downstreamId = JsonNullable.of(downstreamId);
            return this;
        }

        /**
         * The third-party API ID of original entity
         */
        public Builder downstreamId(JsonNullable<String> downstreamId) {
            Utils.checkNotNull(downstreamId, "downstreamId");
            this.downstreamId = downstreamId;
            return this;
        }
        
        public InvoiceResponse build() {
            return new InvoiceResponse(
                id,
                downstreamId);
        }
    }
}
