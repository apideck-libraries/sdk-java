/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify;

import static com.apideck.unify.operations.Operations.RequestOperation;

import com.apideck.unify.models.operations.ConnectorApiResourcesOneRequest;
import com.apideck.unify.models.operations.ConnectorApiResourcesOneRequestBuilder;
import com.apideck.unify.models.operations.ConnectorApiResourcesOneResponse;
import com.apideck.unify.operations.ConnectorApiResourcesOneOperation;
import com.apideck.unify.utils.Options;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;


public class ApiResources {
    private final SDKConfiguration sdkConfiguration;

    ApiResources(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Get API Resource
     * 
     * <p>Get API Resource
     * 
     * @return The call builder
     */
    public ConnectorApiResourcesOneRequestBuilder get() {
        return new ConnectorApiResourcesOneRequestBuilder(sdkConfiguration);
    }

    /**
     * Get API Resource
     * 
     * <p>Get API Resource
     * 
     * @param id ID of the record you are acting upon.
     * @param resourceId ID of the resource you are acting upon.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ConnectorApiResourcesOneResponse get(String id, String resourceId) throws Exception {
        return get(Optional.empty(), id, resourceId,
            Optional.empty());
    }

    /**
     * Get API Resource
     * 
     * <p>Get API Resource
     * 
     * @param appId The ID of your Unify application
     * @param id ID of the record you are acting upon.
     * @param resourceId ID of the resource you are acting upon.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ConnectorApiResourcesOneResponse get(
            Optional<String> appId, String id,
            String resourceId, Optional<Options> options) throws Exception {
        ConnectorApiResourcesOneRequest request =
            ConnectorApiResourcesOneRequest
                .builder()
                .appId(appId)
                .id(id)
                .resourceId(resourceId)
                .build();
        RequestOperation<ConnectorApiResourcesOneRequest, ConnectorApiResourcesOneResponse> operation
              = new ConnectorApiResourcesOneOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

}
