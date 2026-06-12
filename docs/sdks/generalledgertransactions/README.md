# Accounting.GeneralLedgerTransactions

## Overview

### Available Operations

* [list](#list) - List General Ledger Transactions
* [get](#get) - Get General Ledger Transaction

## list

List General Ledger Transactions

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.generalLedgerTransactionsAll" method="get" path="/accounting/general-ledger-transactions" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingGeneralLedgerTransactionsAllRequest;
import com.apideck.unify.models.operations.AccountingGeneralLedgerTransactionsAllResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingGeneralLedgerTransactionsAllRequest req = AccountingGeneralLedgerTransactionsAllRequest.builder()
                .serviceId("salesforce")
                .companyId("12345")
                .filter(GeneralLedgerTransactionsFilter.builder()
                    .sourceType(SourceType.INVOICE)
                    .updatedSince(OffsetDateTime.parse("2024-09-30T07:43:32.000Z"))
                    .build())
                .sort(GeneralLedgerTransactionsSort.builder()
                    .by(GeneralLedgerTransactionsSortBy.POSTED_AT)
                    .direction(SortDirection.DESC)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();


        sdk.accounting().generalLedgerTransactions().list()
                .callAsStream()
                .forEach((AccountingGeneralLedgerTransactionsAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [AccountingGeneralLedgerTransactionsAllRequest](../../models/operations/AccountingGeneralLedgerTransactionsAllRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |

### Response

**[AccountingGeneralLedgerTransactionsAllResponse](../../models/operations/AccountingGeneralLedgerTransactionsAllResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## get

Get General Ledger Transaction

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.generalLedgerTransactionsOne" method="get" path="/accounting/general-ledger-transactions/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingGeneralLedgerTransactionsOneRequest;
import com.apideck.unify.models.operations.AccountingGeneralLedgerTransactionsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingGeneralLedgerTransactionsOneRequest req = AccountingGeneralLedgerTransactionsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .companyId("12345")
                .fields("id,updated_at")
                .build();

        AccountingGeneralLedgerTransactionsOneResponse res = sdk.accounting().generalLedgerTransactions().get()
                .request(req)
                .call();

        if (res.getGeneralLedgerTransactionResponse().isPresent()) {
            System.out.println(res.getGeneralLedgerTransactionResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [AccountingGeneralLedgerTransactionsOneRequest](../../models/operations/AccountingGeneralLedgerTransactionsOneRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |

### Response

**[AccountingGeneralLedgerTransactionsOneResponse](../../models/operations/AccountingGeneralLedgerTransactionsOneResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |