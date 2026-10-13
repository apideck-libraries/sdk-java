# Accounting.TrialBalance

## Overview

### Available Operations

* [get](#get) - Get Trial Balance

## get

Get the trial balance as of a date. Read-only.

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.trialBalanceOne" method="get" path="/accounting/trial-balance" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.TrialBalanceFilter;
import com.apideck.unify.models.components.TrialBalanceFilterAccountingMethod;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingTrialBalanceOneRequest;
import com.apideck.unify.models.operations.AccountingTrialBalanceOneResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingTrialBalanceOneRequest req = AccountingTrialBalanceOneRequest.builder()
                .serviceId("salesforce")
                .companyId("12345")
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .filter(TrialBalanceFilter.builder()
                    .endDate("2025-12-31")
                    .accountingMethod(TrialBalanceFilterAccountingMethod.ACCRUAL)
                    .build())
                .build();

        AccountingTrialBalanceOneResponse res = sdk.accounting().trialBalance().get()
                .request(req)
                .call();

        if (res.getTrialBalanceResponse().isPresent()) {
            System.out.println(res.getTrialBalanceResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AccountingTrialBalanceOneRequest](../../models/operations/AccountingTrialBalanceOneRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AccountingTrialBalanceOneResponse](../../models/operations/AccountingTrialBalanceOneResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |