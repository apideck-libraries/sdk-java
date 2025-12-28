# Accounting.AgedCreditors

## Overview

### Available Operations

* [get](#get) - Get Aged Creditors

## get

Get Aged Creditors

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.agedCreditorsOne" method="get" path="/accounting/aged-creditors" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.AgedReportFilter;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingAgedCreditorsOneRequest;
import com.apideck.unify.models.operations.AccountingAgedCreditorsOneResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingAgedCreditorsOneRequest req = AccountingAgedCreditorsOneRequest.builder()
                .serviceId("salesforce")
                .filter(AgedReportFilter.builder()
                    .customerId("123abc")
                    .supplierId("123abc")
                    .reportAsOfDate("2024-01-01")
                    .periodCount(3L)
                    .periodLength(30L)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();

        AccountingAgedCreditorsOneResponse res = sdk.accounting().agedCreditors().get()
                .request(req)
                .call();

        if (res.getAgedCreditorsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [AccountingAgedCreditorsOneRequest](../../models/operations/AccountingAgedCreditorsOneRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[AccountingAgedCreditorsOneResponse](../../models/operations/AccountingAgedCreditorsOneResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |