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
import java.lang.SuppressWarnings;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

public class InvoiceItemFilter {

    /**
     * The type of invoice item, indicating whether it is an inventory item, a service, or another type.
     */
    @SpeakeasyMetadata("queryParam:name=type")
    private JsonNullable<? extends InvoiceItemFilterInvoiceItemType> type;

    @JsonCreator
    public InvoiceItemFilter(
            JsonNullable<? extends InvoiceItemFilterInvoiceItemType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
    }
    
    public InvoiceItemFilter() {
        this(JsonNullable.undefined());
    }

    /**
     * The type of invoice item, indicating whether it is an inventory item, a service, or another type.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<InvoiceItemFilterInvoiceItemType> type() {
        return (JsonNullable<InvoiceItemFilterInvoiceItemType>) type;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The type of invoice item, indicating whether it is an inventory item, a service, or another type.
     */
    public InvoiceItemFilter withType(InvoiceItemFilterInvoiceItemType type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * The type of invoice item, indicating whether it is an inventory item, a service, or another type.
     */
    public InvoiceItemFilter withType(JsonNullable<? extends InvoiceItemFilterInvoiceItemType> type) {
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
        InvoiceItemFilter other = (InvoiceItemFilter) o;
        return 
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InvoiceItemFilter.class,
                "type", type);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends InvoiceItemFilterInvoiceItemType> type = JsonNullable.undefined();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The type of invoice item, indicating whether it is an inventory item, a service, or another type.
         */
        public Builder type(InvoiceItemFilterInvoiceItemType type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        /**
         * The type of invoice item, indicating whether it is an inventory item, a service, or another type.
         */
        public Builder type(JsonNullable<? extends InvoiceItemFilterInvoiceItemType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public InvoiceItemFilter build() {
            return new InvoiceItemFilter(
                type);
        }
    }
}
