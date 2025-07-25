/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify;

import static com.apideck.unify.operations.Operations.RequestOperation;

import com.apideck.unify.models.operations.SmsMessagesAddRequest;
import com.apideck.unify.models.operations.SmsMessagesAddRequestBuilder;
import com.apideck.unify.models.operations.SmsMessagesAddResponse;
import com.apideck.unify.models.operations.SmsMessagesAllRequest;
import com.apideck.unify.models.operations.SmsMessagesAllRequestBuilder;
import com.apideck.unify.models.operations.SmsMessagesAllResponse;
import com.apideck.unify.models.operations.SmsMessagesDeleteRequest;
import com.apideck.unify.models.operations.SmsMessagesDeleteRequestBuilder;
import com.apideck.unify.models.operations.SmsMessagesDeleteResponse;
import com.apideck.unify.models.operations.SmsMessagesOneRequest;
import com.apideck.unify.models.operations.SmsMessagesOneRequestBuilder;
import com.apideck.unify.models.operations.SmsMessagesOneResponse;
import com.apideck.unify.models.operations.SmsMessagesUpdateRequest;
import com.apideck.unify.models.operations.SmsMessagesUpdateRequestBuilder;
import com.apideck.unify.models.operations.SmsMessagesUpdateResponse;
import com.apideck.unify.operations.SmsMessagesAddOperation;
import com.apideck.unify.operations.SmsMessagesAllOperation;
import com.apideck.unify.operations.SmsMessagesDeleteOperation;
import com.apideck.unify.operations.SmsMessagesOneOperation;
import com.apideck.unify.operations.SmsMessagesUpdateOperation;
import com.apideck.unify.utils.Options;
import java.lang.Exception;
import java.util.Optional;


public class Messages {
    private final SDKConfiguration sdkConfiguration;

    Messages(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * List Messages
     * 
     * <p>List Messages
     * 
     * @return The call builder
     */
    public SmsMessagesAllRequestBuilder list() {
        return new SmsMessagesAllRequestBuilder(sdkConfiguration);
    }

    /**
     * List Messages
     * 
     * <p>List Messages
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public SmsMessagesAllResponse list(SmsMessagesAllRequest request) throws Exception {
        return list(request, Optional.empty());
    }

    /**
     * List Messages
     * 
     * <p>List Messages
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public SmsMessagesAllResponse list(SmsMessagesAllRequest request, Optional<Options> options) throws Exception {
        RequestOperation<SmsMessagesAllRequest, SmsMessagesAllResponse> operation
              = new SmsMessagesAllOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Create Message
     * 
     * <p>Create Message
     * 
     * @return The call builder
     */
    public SmsMessagesAddRequestBuilder create() {
        return new SmsMessagesAddRequestBuilder(sdkConfiguration);
    }

    /**
     * Create Message
     * 
     * <p>Create Message
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public SmsMessagesAddResponse create(SmsMessagesAddRequest request) throws Exception {
        return create(request, Optional.empty());
    }

    /**
     * Create Message
     * 
     * <p>Create Message
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public SmsMessagesAddResponse create(SmsMessagesAddRequest request, Optional<Options> options) throws Exception {
        RequestOperation<SmsMessagesAddRequest, SmsMessagesAddResponse> operation
              = new SmsMessagesAddOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Get Message
     * 
     * <p>Get Message
     * 
     * @return The call builder
     */
    public SmsMessagesOneRequestBuilder get() {
        return new SmsMessagesOneRequestBuilder(sdkConfiguration);
    }

    /**
     * Get Message
     * 
     * <p>Get Message
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public SmsMessagesOneResponse get(SmsMessagesOneRequest request) throws Exception {
        return get(request, Optional.empty());
    }

    /**
     * Get Message
     * 
     * <p>Get Message
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public SmsMessagesOneResponse get(SmsMessagesOneRequest request, Optional<Options> options) throws Exception {
        RequestOperation<SmsMessagesOneRequest, SmsMessagesOneResponse> operation
              = new SmsMessagesOneOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Update Message
     * 
     * <p>Update Message
     * 
     * @return The call builder
     */
    public SmsMessagesUpdateRequestBuilder update() {
        return new SmsMessagesUpdateRequestBuilder(sdkConfiguration);
    }

    /**
     * Update Message
     * 
     * <p>Update Message
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public SmsMessagesUpdateResponse update(SmsMessagesUpdateRequest request) throws Exception {
        return update(request, Optional.empty());
    }

    /**
     * Update Message
     * 
     * <p>Update Message
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public SmsMessagesUpdateResponse update(SmsMessagesUpdateRequest request, Optional<Options> options) throws Exception {
        RequestOperation<SmsMessagesUpdateRequest, SmsMessagesUpdateResponse> operation
              = new SmsMessagesUpdateOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Delete Message
     * 
     * <p>Delete Message
     * 
     * @return The call builder
     */
    public SmsMessagesDeleteRequestBuilder delete() {
        return new SmsMessagesDeleteRequestBuilder(sdkConfiguration);
    }

    /**
     * Delete Message
     * 
     * <p>Delete Message
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public SmsMessagesDeleteResponse delete(SmsMessagesDeleteRequest request) throws Exception {
        return delete(request, Optional.empty());
    }

    /**
     * Delete Message
     * 
     * <p>Delete Message
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public SmsMessagesDeleteResponse delete(SmsMessagesDeleteRequest request, Optional<Options> options) throws Exception {
        RequestOperation<SmsMessagesDeleteRequest, SmsMessagesDeleteResponse> operation
              = new SmsMessagesDeleteOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

}
