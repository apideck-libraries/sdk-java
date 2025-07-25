/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify;

import static com.apideck.unify.operations.Operations.RequestOperation;

import com.apideck.unify.models.operations.VaultLogsAllRequest;
import com.apideck.unify.models.operations.VaultLogsAllRequestBuilder;
import com.apideck.unify.models.operations.VaultLogsAllResponse;
import com.apideck.unify.operations.VaultLogsAllOperation;
import com.apideck.unify.utils.Options;
import java.lang.Exception;
import java.util.Optional;


public class Logs {
    private final SDKConfiguration sdkConfiguration;

    Logs(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Get all consumer request logs
     * 
     * <p>This endpoint includes all consumer request logs.
     * 
     * @return The call builder
     */
    public VaultLogsAllRequestBuilder list() {
        return new VaultLogsAllRequestBuilder(sdkConfiguration);
    }

    /**
     * Get all consumer request logs
     * 
     * <p>This endpoint includes all consumer request logs.
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public VaultLogsAllResponse list(VaultLogsAllRequest request) throws Exception {
        return list(request, Optional.empty());
    }

    /**
     * Get all consumer request logs
     * 
     * <p>This endpoint includes all consumer request logs.
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public VaultLogsAllResponse list(VaultLogsAllRequest request, Optional<Options> options) throws Exception {
        RequestOperation<VaultLogsAllRequest, VaultLogsAllResponse> operation
              = new VaultLogsAllOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

}
