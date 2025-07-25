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
import java.util.Optional;


public class PaymentsFilter {

    @SpeakeasyMetadata("queryParam:name=updated_since")
    private Optional<OffsetDateTime> updatedSince;


    @SpeakeasyMetadata("queryParam:name=invoice_id")
    private Optional<String> invoiceId;

    @JsonCreator
    public PaymentsFilter(
            Optional<OffsetDateTime> updatedSince,
            Optional<String> invoiceId) {
        Utils.checkNotNull(updatedSince, "updatedSince");
        Utils.checkNotNull(invoiceId, "invoiceId");
        this.updatedSince = updatedSince;
        this.invoiceId = invoiceId;
    }
    
    public PaymentsFilter() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<OffsetDateTime> updatedSince() {
        return updatedSince;
    }

    @JsonIgnore
    public Optional<String> invoiceId() {
        return invoiceId;
    }

    public static Builder builder() {
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

    public PaymentsFilter withInvoiceId(String invoiceId) {
        Utils.checkNotNull(invoiceId, "invoiceId");
        this.invoiceId = Optional.ofNullable(invoiceId);
        return this;
    }


    public PaymentsFilter withInvoiceId(Optional<String> invoiceId) {
        Utils.checkNotNull(invoiceId, "invoiceId");
        this.invoiceId = invoiceId;
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
            Utils.enhancedDeepEquals(this.updatedSince, other.updatedSince) &&
            Utils.enhancedDeepEquals(this.invoiceId, other.invoiceId);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            updatedSince, invoiceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaymentsFilter.class,
                "updatedSince", updatedSince,
                "invoiceId", invoiceId);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private Optional<OffsetDateTime> updatedSince = Optional.empty();

        private Optional<String> invoiceId = Optional.empty();

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


        public Builder invoiceId(String invoiceId) {
            Utils.checkNotNull(invoiceId, "invoiceId");
            this.invoiceId = Optional.ofNullable(invoiceId);
            return this;
        }

        public Builder invoiceId(Optional<String> invoiceId) {
            Utils.checkNotNull(invoiceId, "invoiceId");
            this.invoiceId = invoiceId;
            return this;
        }

        public PaymentsFilter build() {

            return new PaymentsFilter(
                updatedSince, invoiceId);
        }

    }
}
