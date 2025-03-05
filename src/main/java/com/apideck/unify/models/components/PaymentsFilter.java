/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.apideck.unify.models.components;
import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

public class PaymentsFilter {

    @SpeakeasyMetadata("queryParam:name=updated_since")
    private Optional<OffsetDateTime> updatedSince;

    @JsonCreator
    public PaymentsFilter(
            Optional<OffsetDateTime> updatedSince) {
        Utils.checkNotNull(updatedSince, "updatedSince");
        this.updatedSince = updatedSince;
    }
    
    public PaymentsFilter() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedSince() {
        return updatedSince;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PaymentsFilter withUpdatedSince(OffsetDateTime updatedSince) {
        Utils.checkNotNull(updatedSince, "updatedSince");
        this.updatedSince = Optional.ofNullable(updatedSince);
        return this;
    }

    public PaymentsFilter withUpdatedSince(Optional<OffsetDateTime> updatedSince) {
        Utils.checkNotNull(updatedSince, "updatedSince");
        this.updatedSince = updatedSince;
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
        PaymentsFilter other = (PaymentsFilter) o;
        return 
            Objects.deepEquals(this.updatedSince, other.updatedSince);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            updatedSince);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaymentsFilter.class,
                "updatedSince", updatedSince);
    }
    
    public final static class Builder {
 
        private Optional<OffsetDateTime> updatedSince = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder updatedSince(OffsetDateTime updatedSince) {
            Utils.checkNotNull(updatedSince, "updatedSince");
            this.updatedSince = Optional.ofNullable(updatedSince);
            return this;
        }

        public Builder updatedSince(Optional<OffsetDateTime> updatedSince) {
            Utils.checkNotNull(updatedSince, "updatedSince");
            this.updatedSince = updatedSince;
            return this;
        }
        
        public PaymentsFilter build() {
            return new PaymentsFilter(
                updatedSince);
        }
    }
}

