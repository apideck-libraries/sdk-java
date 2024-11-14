/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.operations;


import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class VaultValidateConnectionStateRequestBody {

    @JsonCreator
    public VaultValidateConnectionStateRequestBody() {
        
        
    }

    public final static Builder builder() {
        return new Builder();
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            );
    }
    
    @Override
    public String toString() {
        return Utils.toString(VaultValidateConnectionStateRequestBody.class);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public VaultValidateConnectionStateRequestBody build() {
            return new VaultValidateConnectionStateRequestBody(
                );
        }
    }
}
