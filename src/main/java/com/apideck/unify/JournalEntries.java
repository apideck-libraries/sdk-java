/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify;

import static com.apideck.unify.operations.Operations.RequestOperation;

import com.apideck.unify.models.operations.AccountingJournalEntriesAddRequest;
import com.apideck.unify.models.operations.AccountingJournalEntriesAddRequestBuilder;
import com.apideck.unify.models.operations.AccountingJournalEntriesAddResponse;
import com.apideck.unify.models.operations.AccountingJournalEntriesAllRequest;
import com.apideck.unify.models.operations.AccountingJournalEntriesAllRequestBuilder;
import com.apideck.unify.models.operations.AccountingJournalEntriesAllResponse;
import com.apideck.unify.models.operations.AccountingJournalEntriesDeleteRequest;
import com.apideck.unify.models.operations.AccountingJournalEntriesDeleteRequestBuilder;
import com.apideck.unify.models.operations.AccountingJournalEntriesDeleteResponse;
import com.apideck.unify.models.operations.AccountingJournalEntriesOneRequest;
import com.apideck.unify.models.operations.AccountingJournalEntriesOneRequestBuilder;
import com.apideck.unify.models.operations.AccountingJournalEntriesOneResponse;
import com.apideck.unify.models.operations.AccountingJournalEntriesUpdateRequest;
import com.apideck.unify.models.operations.AccountingJournalEntriesUpdateRequestBuilder;
import com.apideck.unify.models.operations.AccountingJournalEntriesUpdateResponse;
import com.apideck.unify.operations.AccountingJournalEntriesAddOperation;
import com.apideck.unify.operations.AccountingJournalEntriesAllOperation;
import com.apideck.unify.operations.AccountingJournalEntriesDeleteOperation;
import com.apideck.unify.operations.AccountingJournalEntriesOneOperation;
import com.apideck.unify.operations.AccountingJournalEntriesUpdateOperation;
import com.apideck.unify.utils.Options;
import java.lang.Exception;
import java.util.Optional;


public class JournalEntries {
    private final SDKConfiguration sdkConfiguration;

    JournalEntries(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * List Journal Entries
     * 
     * <p>List Journal Entries
     * 
     * @return The call builder
     */
    public AccountingJournalEntriesAllRequestBuilder list() {
        return new AccountingJournalEntriesAllRequestBuilder(sdkConfiguration);
    }

    /**
     * List Journal Entries
     * 
     * <p>List Journal Entries
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingJournalEntriesAllResponse list(AccountingJournalEntriesAllRequest request) throws Exception {
        return list(request, Optional.empty());
    }

    /**
     * List Journal Entries
     * 
     * <p>List Journal Entries
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingJournalEntriesAllResponse list(AccountingJournalEntriesAllRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingJournalEntriesAllRequest, AccountingJournalEntriesAllResponse> operation
              = new AccountingJournalEntriesAllOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Create Journal Entry
     * 
     * <p>Create Journal Entry
     * 
     * @return The call builder
     */
    public AccountingJournalEntriesAddRequestBuilder create() {
        return new AccountingJournalEntriesAddRequestBuilder(sdkConfiguration);
    }

    /**
     * Create Journal Entry
     * 
     * <p>Create Journal Entry
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingJournalEntriesAddResponse create(AccountingJournalEntriesAddRequest request) throws Exception {
        return create(request, Optional.empty());
    }

    /**
     * Create Journal Entry
     * 
     * <p>Create Journal Entry
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingJournalEntriesAddResponse create(AccountingJournalEntriesAddRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingJournalEntriesAddRequest, AccountingJournalEntriesAddResponse> operation
              = new AccountingJournalEntriesAddOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Get Journal Entry
     * 
     * <p>Get Journal Entry
     * 
     * @return The call builder
     */
    public AccountingJournalEntriesOneRequestBuilder get() {
        return new AccountingJournalEntriesOneRequestBuilder(sdkConfiguration);
    }

    /**
     * Get Journal Entry
     * 
     * <p>Get Journal Entry
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingJournalEntriesOneResponse get(AccountingJournalEntriesOneRequest request) throws Exception {
        return get(request, Optional.empty());
    }

    /**
     * Get Journal Entry
     * 
     * <p>Get Journal Entry
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingJournalEntriesOneResponse get(AccountingJournalEntriesOneRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingJournalEntriesOneRequest, AccountingJournalEntriesOneResponse> operation
              = new AccountingJournalEntriesOneOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Update Journal Entry
     * 
     * <p>Update Journal Entry
     * 
     * @return The call builder
     */
    public AccountingJournalEntriesUpdateRequestBuilder update() {
        return new AccountingJournalEntriesUpdateRequestBuilder(sdkConfiguration);
    }

    /**
     * Update Journal Entry
     * 
     * <p>Update Journal Entry
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingJournalEntriesUpdateResponse update(AccountingJournalEntriesUpdateRequest request) throws Exception {
        return update(request, Optional.empty());
    }

    /**
     * Update Journal Entry
     * 
     * <p>Update Journal Entry
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingJournalEntriesUpdateResponse update(AccountingJournalEntriesUpdateRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingJournalEntriesUpdateRequest, AccountingJournalEntriesUpdateResponse> operation
              = new AccountingJournalEntriesUpdateOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Delete Journal Entry
     * 
     * <p>Delete Journal Entry
     * 
     * @return The call builder
     */
    public AccountingJournalEntriesDeleteRequestBuilder delete() {
        return new AccountingJournalEntriesDeleteRequestBuilder(sdkConfiguration);
    }

    /**
     * Delete Journal Entry
     * 
     * <p>Delete Journal Entry
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingJournalEntriesDeleteResponse delete(AccountingJournalEntriesDeleteRequest request) throws Exception {
        return delete(request, Optional.empty());
    }

    /**
     * Delete Journal Entry
     * 
     * <p>Delete Journal Entry
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public AccountingJournalEntriesDeleteResponse delete(AccountingJournalEntriesDeleteRequest request, Optional<Options> options) throws Exception {
        RequestOperation<AccountingJournalEntriesDeleteRequest, AccountingJournalEntriesDeleteResponse> operation
              = new AccountingJournalEntriesDeleteOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

}
