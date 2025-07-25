/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify;

import static com.apideck.unify.operations.Operations.RequestOperation;

import com.apideck.unify.models.operations.CrmNotesAddRequest;
import com.apideck.unify.models.operations.CrmNotesAddRequestBuilder;
import com.apideck.unify.models.operations.CrmNotesAddResponse;
import com.apideck.unify.models.operations.CrmNotesAllRequest;
import com.apideck.unify.models.operations.CrmNotesAllRequestBuilder;
import com.apideck.unify.models.operations.CrmNotesAllResponse;
import com.apideck.unify.models.operations.CrmNotesDeleteRequest;
import com.apideck.unify.models.operations.CrmNotesDeleteRequestBuilder;
import com.apideck.unify.models.operations.CrmNotesDeleteResponse;
import com.apideck.unify.models.operations.CrmNotesOneRequest;
import com.apideck.unify.models.operations.CrmNotesOneRequestBuilder;
import com.apideck.unify.models.operations.CrmNotesOneResponse;
import com.apideck.unify.models.operations.CrmNotesUpdateRequest;
import com.apideck.unify.models.operations.CrmNotesUpdateRequestBuilder;
import com.apideck.unify.models.operations.CrmNotesUpdateResponse;
import com.apideck.unify.operations.CrmNotesAddOperation;
import com.apideck.unify.operations.CrmNotesAllOperation;
import com.apideck.unify.operations.CrmNotesDeleteOperation;
import com.apideck.unify.operations.CrmNotesOneOperation;
import com.apideck.unify.operations.CrmNotesUpdateOperation;
import com.apideck.unify.utils.Options;
import java.lang.Exception;
import java.util.Optional;


public class Notes {
    private final SDKConfiguration sdkConfiguration;

    Notes(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * List notes
     * 
     * <p>List notes
     * 
     * @return The call builder
     */
    public CrmNotesAllRequestBuilder list() {
        return new CrmNotesAllRequestBuilder(sdkConfiguration);
    }

    /**
     * List notes
     * 
     * <p>List notes
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CrmNotesAllResponse list(CrmNotesAllRequest request) throws Exception {
        return list(request, Optional.empty());
    }

    /**
     * List notes
     * 
     * <p>List notes
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CrmNotesAllResponse list(CrmNotesAllRequest request, Optional<Options> options) throws Exception {
        RequestOperation<CrmNotesAllRequest, CrmNotesAllResponse> operation
              = new CrmNotesAllOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Create note
     * 
     * <p>Create note
     * 
     * @return The call builder
     */
    public CrmNotesAddRequestBuilder create() {
        return new CrmNotesAddRequestBuilder(sdkConfiguration);
    }

    /**
     * Create note
     * 
     * <p>Create note
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CrmNotesAddResponse create(CrmNotesAddRequest request) throws Exception {
        return create(request, Optional.empty());
    }

    /**
     * Create note
     * 
     * <p>Create note
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CrmNotesAddResponse create(CrmNotesAddRequest request, Optional<Options> options) throws Exception {
        RequestOperation<CrmNotesAddRequest, CrmNotesAddResponse> operation
              = new CrmNotesAddOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Get note
     * 
     * <p>Get note
     * 
     * @return The call builder
     */
    public CrmNotesOneRequestBuilder get() {
        return new CrmNotesOneRequestBuilder(sdkConfiguration);
    }

    /**
     * Get note
     * 
     * <p>Get note
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CrmNotesOneResponse get(CrmNotesOneRequest request) throws Exception {
        return get(request, Optional.empty());
    }

    /**
     * Get note
     * 
     * <p>Get note
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CrmNotesOneResponse get(CrmNotesOneRequest request, Optional<Options> options) throws Exception {
        RequestOperation<CrmNotesOneRequest, CrmNotesOneResponse> operation
              = new CrmNotesOneOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Update note
     * 
     * <p>Update note
     * 
     * @return The call builder
     */
    public CrmNotesUpdateRequestBuilder update() {
        return new CrmNotesUpdateRequestBuilder(sdkConfiguration);
    }

    /**
     * Update note
     * 
     * <p>Update note
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CrmNotesUpdateResponse update(CrmNotesUpdateRequest request) throws Exception {
        return update(request, Optional.empty());
    }

    /**
     * Update note
     * 
     * <p>Update note
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CrmNotesUpdateResponse update(CrmNotesUpdateRequest request, Optional<Options> options) throws Exception {
        RequestOperation<CrmNotesUpdateRequest, CrmNotesUpdateResponse> operation
              = new CrmNotesUpdateOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Delete note
     * 
     * <p>Delete note
     * 
     * @return The call builder
     */
    public CrmNotesDeleteRequestBuilder delete() {
        return new CrmNotesDeleteRequestBuilder(sdkConfiguration);
    }

    /**
     * Delete note
     * 
     * <p>Delete note
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CrmNotesDeleteResponse delete(CrmNotesDeleteRequest request) throws Exception {
        return delete(request, Optional.empty());
    }

    /**
     * Delete note
     * 
     * <p>Delete note
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CrmNotesDeleteResponse delete(CrmNotesDeleteRequest request, Optional<Options> options) throws Exception {
        RequestOperation<CrmNotesDeleteRequest, CrmNotesDeleteResponse> operation
              = new CrmNotesDeleteOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

}
