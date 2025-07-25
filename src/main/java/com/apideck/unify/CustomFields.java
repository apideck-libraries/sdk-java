/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify;

import static com.apideck.unify.operations.Operations.RequestOperation;

import com.apideck.unify.models.operations.VaultCustomFieldsAllRequest;
import com.apideck.unify.models.operations.VaultCustomFieldsAllRequestBuilder;
import com.apideck.unify.models.operations.VaultCustomFieldsAllResponse;
import com.apideck.unify.operations.VaultCustomFieldsAllOperation;
import com.apideck.unify.utils.Options;
import java.lang.Exception;
import java.util.Optional;


public class CustomFields {
    private final SDKConfiguration sdkConfiguration;

    CustomFields(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Get resource custom fields
     * 
     * <p>This endpoint returns an custom fields on a connection resource.
     * 
     * @return The call builder
     */
    public VaultCustomFieldsAllRequestBuilder list() {
        return new VaultCustomFieldsAllRequestBuilder(sdkConfiguration);
    }

    /**
     * Get resource custom fields
     * 
     * <p>This endpoint returns an custom fields on a connection resource.
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public VaultCustomFieldsAllResponse list(VaultCustomFieldsAllRequest request) throws Exception {
        return list(request, Optional.empty());
    }

    /**
     * Get resource custom fields
     * 
     * <p>This endpoint returns an custom fields on a connection resource.
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public VaultCustomFieldsAllResponse list(VaultCustomFieldsAllRequest request, Optional<Options> options) throws Exception {
        RequestOperation<VaultCustomFieldsAllRequest, VaultCustomFieldsAllResponse> operation
              = new VaultCustomFieldsAllOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

}
