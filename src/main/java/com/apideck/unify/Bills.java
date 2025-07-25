/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify;

import static com.apideck.unify.operations.Operations.RequestOperation;

import com.apideck.unify.models.operations.AccountingBillsAddRequest;
import com.apideck.unify.models.operations.AccountingBillsAddRequestBuilder;
import com.apideck.unify.models.operations.AccountingBillsAddResponse;
import com.apideck.unify.models.operations.AccountingBillsAllRequest;
import com.apideck.unify.models.operations.AccountingBillsAllRequestBuilder;
import com.apideck.unify.models.operations.AccountingBillsAllResponse;
import com.apideck.unify.models.operations.AccountingBillsDeleteRequest;
import com.apideck.unify.models.operations.AccountingBillsDeleteRequestBuilder;
import com.apideck.unify.models.operations.AccountingBillsDeleteResponse;
import com.apideck.unify.models.operations.AccountingBillsOneRequest;
import com.apideck.unify.models.operations.AccountingBillsOneRequestBuilder;
import com.apideck.unify.models.operations.AccountingBillsOneResponse;
import com.apideck.unify.models.operations.AccountingBillsUpdateRequest;
import com.apideck.unify.models.operations.AccountingBillsUpdateRequestBuilder;
import com.apideck.unify.models.operations.AccountingBillsUpdateResponse;
import com.apideck.unify.operations.AccountingBillsAddOperation;
import com.apideck.unify.operations.AccountingBillsAllOperation;
import com.apideck.unify.operations.AccountingBillsDeleteOperation;
import com.apideck.unify.operations.AccountingBillsOneOperation;
import com.apideck.unify.operations.AccountingBillsUpdateOperation;
import com.apideck.unify.utils.Options;
import java.lang.Exception;
import java.util.Optional;


public class Bills {
    private final SDKConfiguration sdkConfiguration;

    Bills(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * List Bills
     * 
     * <p>List Bills
     * 
     * @return The call builder
     */
    public AccountingBillsAllRequestBuilder list() {
        return new AccountingBillsAllRequestBuilder(sdkConfiguration);
    }

    /**
     * List Bills
     * 
     * <p>List Bills
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingBillsAllResponse list(AccountingBillsAllRequest request) throws Exception {
        return list(request, Optional.empty());
    }

    /**
     * List Bills
     * 
     * <p>List Bills
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingBillsAllResponse list(AccountingBillsAllRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingBillsAllRequest, AccountingBillsAllResponse> operation
              = new AccountingBillsAllOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Create Bill
     * 
     * <p>Create Bill
     * 
     * @return The call builder
     */
    public AccountingBillsAddRequestBuilder create() {
        return new AccountingBillsAddRequestBuilder(sdkConfiguration);
    }

    /**
     * Create Bill
     * 
     * <p>Create Bill
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingBillsAddResponse create(AccountingBillsAddRequest request) throws Exception {
        return create(request, Optional.empty());
    }

    /**
     * Create Bill
     * 
     * <p>Create Bill
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingBillsAddResponse create(AccountingBillsAddRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingBillsAddRequest, AccountingBillsAddResponse> operation
              = new AccountingBillsAddOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Get Bill
     * 
     * <p>Get Bill
     * 
     * @return The call builder
     */
    public AccountingBillsOneRequestBuilder get() {
        return new AccountingBillsOneRequestBuilder(sdkConfiguration);
    }

    /**
     * Get Bill
     * 
     * <p>Get Bill
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingBillsOneResponse get(AccountingBillsOneRequest request) throws Exception {
        return get(request, Optional.empty());
    }

    /**
     * Get Bill
     * 
     * <p>Get Bill
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingBillsOneResponse get(AccountingBillsOneRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingBillsOneRequest, AccountingBillsOneResponse> operation
              = new AccountingBillsOneOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Update Bill
     * 
     * <p>Update Bill
     * 
     * @return The call builder
     */
    public AccountingBillsUpdateRequestBuilder update() {
        return new AccountingBillsUpdateRequestBuilder(sdkConfiguration);
    }

    /**
     * Update Bill
     * 
     * <p>Update Bill
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingBillsUpdateResponse update(AccountingBillsUpdateRequest request) throws Exception {
        return update(request, Optional.empty());
    }

    /**
     * Update Bill
     * 
     * <p>Update Bill
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingBillsUpdateResponse update(AccountingBillsUpdateRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingBillsUpdateRequest, AccountingBillsUpdateResponse> operation
              = new AccountingBillsUpdateOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Delete Bill
     * 
     * <p>Delete Bill
     * 
     * @return The call builder
     */
    public AccountingBillsDeleteRequestBuilder delete() {
        return new AccountingBillsDeleteRequestBuilder(sdkConfiguration);
    }

    /**
     * Delete Bill
     * 
     * <p>Delete Bill
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingBillsDeleteResponse delete(AccountingBillsDeleteRequest request) throws Exception {
        return delete(request, Optional.empty());
    }

    /**
     * Delete Bill
     * 
     * <p>Delete Bill
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingBillsDeleteResponse delete(AccountingBillsDeleteRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingBillsDeleteRequest, AccountingBillsDeleteResponse> operation
              = new AccountingBillsDeleteOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

}
