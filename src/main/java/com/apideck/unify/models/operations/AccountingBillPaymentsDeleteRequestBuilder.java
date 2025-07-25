/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import static com.apideck.unify.operations.Operations.RequestOperation;

import com.apideck.unify.SDKConfiguration;
import com.apideck.unify.operations.AccountingBillPaymentsDeleteOperation;
import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.lang.Exception;
import java.util.Optional;

public class AccountingBillPaymentsDeleteRequestBuilder {

    private AccountingBillPaymentsDeleteRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public AccountingBillPaymentsDeleteRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public AccountingBillPaymentsDeleteRequestBuilder request(AccountingBillPaymentsDeleteRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public AccountingBillPaymentsDeleteRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public AccountingBillPaymentsDeleteRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public AccountingBillPaymentsDeleteResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<AccountingBillPaymentsDeleteRequest, AccountingBillPaymentsDeleteResponse> operation
              = new AccountingBillPaymentsDeleteOperation(sdkConfiguration, options);

        return operation.handleResponse(operation.doRequest(request));
    }
}
