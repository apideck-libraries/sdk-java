/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify;

import static com.apideck.unify.operations.Operations.RequestOperation;

import com.apideck.unify.models.operations.AccountingBankFeedStatementsAddRequest;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsAddRequestBuilder;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsAddResponse;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsAllRequest;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsAllRequestBuilder;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsAllResponse;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsDeleteRequest;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsDeleteRequestBuilder;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsDeleteResponse;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsOneRequest;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsOneRequestBuilder;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsOneResponse;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsUpdateRequest;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsUpdateRequestBuilder;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsUpdateResponse;
import com.apideck.unify.operations.AccountingBankFeedStatementsAddOperation;
import com.apideck.unify.operations.AccountingBankFeedStatementsAllOperation;
import com.apideck.unify.operations.AccountingBankFeedStatementsDeleteOperation;
import com.apideck.unify.operations.AccountingBankFeedStatementsOneOperation;
import com.apideck.unify.operations.AccountingBankFeedStatementsUpdateOperation;
import com.apideck.unify.utils.Options;
import java.lang.Exception;
import java.util.Optional;


public class BankFeedStatements {
    private final SDKConfiguration sdkConfiguration;

    BankFeedStatements(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * List Bank Feed Statements
     * 
     * <p>List Bank Feed Statements
     * 
     * @return The call builder
     */
    public AccountingBankFeedStatementsAllRequestBuilder list() {
        return new AccountingBankFeedStatementsAllRequestBuilder(sdkConfiguration);
    }

    /**
     * List Bank Feed Statements
     * 
     * <p>List Bank Feed Statements
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingBankFeedStatementsAllResponse list(AccountingBankFeedStatementsAllRequest request) throws Exception {
        return list(request, Optional.empty());
    }

    /**
     * List Bank Feed Statements
     * 
     * <p>List Bank Feed Statements
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingBankFeedStatementsAllResponse list(AccountingBankFeedStatementsAllRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingBankFeedStatementsAllRequest, AccountingBankFeedStatementsAllResponse> operation
              = new AccountingBankFeedStatementsAllOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Create Bank Feed Statement
     * 
     * <p>Create Bank Feed Statement
     * 
     * @return The call builder
     */
    public AccountingBankFeedStatementsAddRequestBuilder create() {
        return new AccountingBankFeedStatementsAddRequestBuilder(sdkConfiguration);
    }

    /**
     * Create Bank Feed Statement
     * 
     * <p>Create Bank Feed Statement
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingBankFeedStatementsAddResponse create(AccountingBankFeedStatementsAddRequest request) throws Exception {
        return create(request, Optional.empty());
    }

    /**
     * Create Bank Feed Statement
     * 
     * <p>Create Bank Feed Statement
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingBankFeedStatementsAddResponse create(AccountingBankFeedStatementsAddRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingBankFeedStatementsAddRequest, AccountingBankFeedStatementsAddResponse> operation
              = new AccountingBankFeedStatementsAddOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Get Bank Feed Statement
     * 
     * <p>Get Bank Feed Statement
     * 
     * @return The call builder
     */
    public AccountingBankFeedStatementsOneRequestBuilder get() {
        return new AccountingBankFeedStatementsOneRequestBuilder(sdkConfiguration);
    }

    /**
     * Get Bank Feed Statement
     * 
     * <p>Get Bank Feed Statement
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingBankFeedStatementsOneResponse get(AccountingBankFeedStatementsOneRequest request) throws Exception {
        return get(request, Optional.empty());
    }

    /**
     * Get Bank Feed Statement
     * 
     * <p>Get Bank Feed Statement
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingBankFeedStatementsOneResponse get(AccountingBankFeedStatementsOneRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingBankFeedStatementsOneRequest, AccountingBankFeedStatementsOneResponse> operation
              = new AccountingBankFeedStatementsOneOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Update Bank Feed Statement
     * 
     * <p>Update Bank Feed Statement
     * 
     * @return The call builder
     */
    public AccountingBankFeedStatementsUpdateRequestBuilder update() {
        return new AccountingBankFeedStatementsUpdateRequestBuilder(sdkConfiguration);
    }

    /**
     * Update Bank Feed Statement
     * 
     * <p>Update Bank Feed Statement
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingBankFeedStatementsUpdateResponse update(AccountingBankFeedStatementsUpdateRequest request) throws Exception {
        return update(request, Optional.empty());
    }

    /**
     * Update Bank Feed Statement
     * 
     * <p>Update Bank Feed Statement
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingBankFeedStatementsUpdateResponse update(AccountingBankFeedStatementsUpdateRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingBankFeedStatementsUpdateRequest, AccountingBankFeedStatementsUpdateResponse> operation
              = new AccountingBankFeedStatementsUpdateOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Delete Bank Feed Statement
     * 
     * <p>Delete Bank Feed Statement
     * 
     * @return The call builder
     */
    public AccountingBankFeedStatementsDeleteRequestBuilder delete() {
        return new AccountingBankFeedStatementsDeleteRequestBuilder(sdkConfiguration);
    }

    /**
     * Delete Bank Feed Statement
     * 
     * <p>Delete Bank Feed Statement
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingBankFeedStatementsDeleteResponse delete(AccountingBankFeedStatementsDeleteRequest request) throws Exception {
        return delete(request, Optional.empty());
    }

    /**
     * Delete Bank Feed Statement
     * 
     * <p>Delete Bank Feed Statement
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingBankFeedStatementsDeleteResponse delete(AccountingBankFeedStatementsDeleteRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingBankFeedStatementsDeleteRequest, AccountingBankFeedStatementsDeleteResponse> operation
              = new AccountingBankFeedStatementsDeleteOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

}
