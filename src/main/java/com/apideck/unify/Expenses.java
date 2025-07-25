/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify;

import static com.apideck.unify.operations.Operations.RequestOperation;

import com.apideck.unify.models.operations.AccountingExpensesAddRequest;
import com.apideck.unify.models.operations.AccountingExpensesAddRequestBuilder;
import com.apideck.unify.models.operations.AccountingExpensesAddResponse;
import com.apideck.unify.models.operations.AccountingExpensesAllRequest;
import com.apideck.unify.models.operations.AccountingExpensesAllRequestBuilder;
import com.apideck.unify.models.operations.AccountingExpensesAllResponse;
import com.apideck.unify.models.operations.AccountingExpensesDeleteRequest;
import com.apideck.unify.models.operations.AccountingExpensesDeleteRequestBuilder;
import com.apideck.unify.models.operations.AccountingExpensesDeleteResponse;
import com.apideck.unify.models.operations.AccountingExpensesOneRequest;
import com.apideck.unify.models.operations.AccountingExpensesOneRequestBuilder;
import com.apideck.unify.models.operations.AccountingExpensesOneResponse;
import com.apideck.unify.models.operations.AccountingExpensesUpdateRequest;
import com.apideck.unify.models.operations.AccountingExpensesUpdateRequestBuilder;
import com.apideck.unify.models.operations.AccountingExpensesUpdateResponse;
import com.apideck.unify.operations.AccountingExpensesAddOperation;
import com.apideck.unify.operations.AccountingExpensesAllOperation;
import com.apideck.unify.operations.AccountingExpensesDeleteOperation;
import com.apideck.unify.operations.AccountingExpensesOneOperation;
import com.apideck.unify.operations.AccountingExpensesUpdateOperation;
import com.apideck.unify.utils.Options;
import java.lang.Exception;
import java.util.Optional;


public class Expenses {
    private final SDKConfiguration sdkConfiguration;

    Expenses(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * List Expenses
     * 
     * <p>List Expenses
     * 
     * @return The call builder
     */
    public AccountingExpensesAllRequestBuilder list() {
        return new AccountingExpensesAllRequestBuilder(sdkConfiguration);
    }

    /**
     * List Expenses
     * 
     * <p>List Expenses
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingExpensesAllResponse list(AccountingExpensesAllRequest request) throws Exception {
        return list(request, Optional.empty());
    }

    /**
     * List Expenses
     * 
     * <p>List Expenses
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingExpensesAllResponse list(AccountingExpensesAllRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingExpensesAllRequest, AccountingExpensesAllResponse> operation
              = new AccountingExpensesAllOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Create Expense
     * 
     * <p>Create Expense
     * 
     * @return The call builder
     */
    public AccountingExpensesAddRequestBuilder create() {
        return new AccountingExpensesAddRequestBuilder(sdkConfiguration);
    }

    /**
     * Create Expense
     * 
     * <p>Create Expense
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingExpensesAddResponse create(AccountingExpensesAddRequest request) throws Exception {
        return create(request, Optional.empty());
    }

    /**
     * Create Expense
     * 
     * <p>Create Expense
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingExpensesAddResponse create(AccountingExpensesAddRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingExpensesAddRequest, AccountingExpensesAddResponse> operation
              = new AccountingExpensesAddOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Get Expense
     * 
     * <p>Get Expense
     * 
     * @return The call builder
     */
    public AccountingExpensesOneRequestBuilder get() {
        return new AccountingExpensesOneRequestBuilder(sdkConfiguration);
    }

    /**
     * Get Expense
     * 
     * <p>Get Expense
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingExpensesOneResponse get(AccountingExpensesOneRequest request) throws Exception {
        return get(request, Optional.empty());
    }

    /**
     * Get Expense
     * 
     * <p>Get Expense
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingExpensesOneResponse get(AccountingExpensesOneRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingExpensesOneRequest, AccountingExpensesOneResponse> operation
              = new AccountingExpensesOneOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Update Expense
     * 
     * <p>Update Expense
     * 
     * @return The call builder
     */
    public AccountingExpensesUpdateRequestBuilder update() {
        return new AccountingExpensesUpdateRequestBuilder(sdkConfiguration);
    }

    /**
     * Update Expense
     * 
     * <p>Update Expense
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingExpensesUpdateResponse update(AccountingExpensesUpdateRequest request) throws Exception {
        return update(request, Optional.empty());
    }

    /**
     * Update Expense
     * 
     * <p>Update Expense
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingExpensesUpdateResponse update(AccountingExpensesUpdateRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingExpensesUpdateRequest, AccountingExpensesUpdateResponse> operation
              = new AccountingExpensesUpdateOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Delete Expense
     * 
     * <p>Delete Expense
     * 
     * @return The call builder
     */
    public AccountingExpensesDeleteRequestBuilder delete() {
        return new AccountingExpensesDeleteRequestBuilder(sdkConfiguration);
    }

    /**
     * Delete Expense
     * 
     * <p>Delete Expense
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingExpensesDeleteResponse delete(AccountingExpensesDeleteRequest request) throws Exception {
        return delete(request, Optional.empty());
    }

    /**
     * Delete Expense
     * 
     * <p>Delete Expense
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingExpensesDeleteResponse delete(AccountingExpensesDeleteRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingExpensesDeleteRequest, AccountingExpensesDeleteResponse> operation
              = new AccountingExpensesDeleteOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

}
