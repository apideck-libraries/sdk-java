/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify;

import static com.apideck.unify.operations.Operations.RequestOperation;

import com.apideck.unify.models.operations.AccountingLedgerAccountsAddRequest;
import com.apideck.unify.models.operations.AccountingLedgerAccountsAddRequestBuilder;
import com.apideck.unify.models.operations.AccountingLedgerAccountsAddResponse;
import com.apideck.unify.models.operations.AccountingLedgerAccountsAllRequest;
import com.apideck.unify.models.operations.AccountingLedgerAccountsAllRequestBuilder;
import com.apideck.unify.models.operations.AccountingLedgerAccountsAllResponse;
import com.apideck.unify.models.operations.AccountingLedgerAccountsDeleteRequest;
import com.apideck.unify.models.operations.AccountingLedgerAccountsDeleteRequestBuilder;
import com.apideck.unify.models.operations.AccountingLedgerAccountsDeleteResponse;
import com.apideck.unify.models.operations.AccountingLedgerAccountsOneRequest;
import com.apideck.unify.models.operations.AccountingLedgerAccountsOneRequestBuilder;
import com.apideck.unify.models.operations.AccountingLedgerAccountsOneResponse;
import com.apideck.unify.models.operations.AccountingLedgerAccountsUpdateRequest;
import com.apideck.unify.models.operations.AccountingLedgerAccountsUpdateRequestBuilder;
import com.apideck.unify.models.operations.AccountingLedgerAccountsUpdateResponse;
import com.apideck.unify.operations.AccountingLedgerAccountsAddOperation;
import com.apideck.unify.operations.AccountingLedgerAccountsAllOperation;
import com.apideck.unify.operations.AccountingLedgerAccountsDeleteOperation;
import com.apideck.unify.operations.AccountingLedgerAccountsOneOperation;
import com.apideck.unify.operations.AccountingLedgerAccountsUpdateOperation;
import com.apideck.unify.utils.Options;
import java.lang.Exception;
import java.util.Optional;


public class LedgerAccounts {
    private final SDKConfiguration sdkConfiguration;

    LedgerAccounts(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * List Ledger Accounts
     * 
     * <p>List Ledger Accounts
     * 
     * @return The call builder
     */
    public AccountingLedgerAccountsAllRequestBuilder list() {
        return new AccountingLedgerAccountsAllRequestBuilder(sdkConfiguration);
    }

    /**
     * List Ledger Accounts
     * 
     * <p>List Ledger Accounts
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingLedgerAccountsAllResponse list(AccountingLedgerAccountsAllRequest request) throws Exception {
        return list(request, Optional.empty());
    }

    /**
     * List Ledger Accounts
     * 
     * <p>List Ledger Accounts
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingLedgerAccountsAllResponse list(AccountingLedgerAccountsAllRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingLedgerAccountsAllRequest, AccountingLedgerAccountsAllResponse> operation
              = new AccountingLedgerAccountsAllOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Create Ledger Account
     * 
     * <p>Create Ledger Account
     * 
     * @return The call builder
     */
    public AccountingLedgerAccountsAddRequestBuilder create() {
        return new AccountingLedgerAccountsAddRequestBuilder(sdkConfiguration);
    }

    /**
     * Create Ledger Account
     * 
     * <p>Create Ledger Account
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingLedgerAccountsAddResponse create(AccountingLedgerAccountsAddRequest request) throws Exception {
        return create(request, Optional.empty());
    }

    /**
     * Create Ledger Account
     * 
     * <p>Create Ledger Account
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingLedgerAccountsAddResponse create(AccountingLedgerAccountsAddRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingLedgerAccountsAddRequest, AccountingLedgerAccountsAddResponse> operation
              = new AccountingLedgerAccountsAddOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Get Ledger Account
     * 
     * <p>Get Ledger Account
     * 
     * @return The call builder
     */
    public AccountingLedgerAccountsOneRequestBuilder get() {
        return new AccountingLedgerAccountsOneRequestBuilder(sdkConfiguration);
    }

    /**
     * Get Ledger Account
     * 
     * <p>Get Ledger Account
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingLedgerAccountsOneResponse get(AccountingLedgerAccountsOneRequest request) throws Exception {
        return get(request, Optional.empty());
    }

    /**
     * Get Ledger Account
     * 
     * <p>Get Ledger Account
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingLedgerAccountsOneResponse get(AccountingLedgerAccountsOneRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingLedgerAccountsOneRequest, AccountingLedgerAccountsOneResponse> operation
              = new AccountingLedgerAccountsOneOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Update Ledger Account
     * 
     * <p>Update Ledger Account
     * 
     * @return The call builder
     */
    public AccountingLedgerAccountsUpdateRequestBuilder update() {
        return new AccountingLedgerAccountsUpdateRequestBuilder(sdkConfiguration);
    }

    /**
     * Update Ledger Account
     * 
     * <p>Update Ledger Account
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingLedgerAccountsUpdateResponse update(AccountingLedgerAccountsUpdateRequest request) throws Exception {
        return update(request, Optional.empty());
    }

    /**
     * Update Ledger Account
     * 
     * <p>Update Ledger Account
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingLedgerAccountsUpdateResponse update(AccountingLedgerAccountsUpdateRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingLedgerAccountsUpdateRequest, AccountingLedgerAccountsUpdateResponse> operation
              = new AccountingLedgerAccountsUpdateOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Delete Ledger Account
     * 
     * <p>Delete Ledger Account
     * 
     * @return The call builder
     */
    public AccountingLedgerAccountsDeleteRequestBuilder delete() {
        return new AccountingLedgerAccountsDeleteRequestBuilder(sdkConfiguration);
    }

    /**
     * Delete Ledger Account
     * 
     * <p>Delete Ledger Account
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingLedgerAccountsDeleteResponse delete(AccountingLedgerAccountsDeleteRequest request) throws Exception {
        return delete(request, Optional.empty());
    }

    /**
     * Delete Ledger Account
     * 
     * <p>Delete Ledger Account
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingLedgerAccountsDeleteResponse delete(AccountingLedgerAccountsDeleteRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingLedgerAccountsDeleteRequest, AccountingLedgerAccountsDeleteResponse> operation
              = new AccountingLedgerAccountsDeleteOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

}
