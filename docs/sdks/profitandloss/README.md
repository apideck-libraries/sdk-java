# ProfitAndLoss
(*accounting().profitAndLoss()*)

## Overview

### Available Operations

* [get](#get) - Get Profit and Loss

## get

Get Profit and Loss

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.ProfitAndLossFilter;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingProfitAndLossOneRequest;
import com.apideck.unify.models.operations.AccountingProfitAndLossOneResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingProfitAndLossOneRequest req = AccountingProfitAndLossOneRequest.builder()
                .serviceId("salesforce")
                .filter(ProfitAndLossFilter.builder()
                    .customerId("123abc")
                    .startDate("2021-01-01")
                    .endDate("2021-12-31")
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();

        AccountingProfitAndLossOneResponse res = sdk.accounting().profitAndLoss().get()
                .request(req)
                .call();

        if (res.getProfitAndLossResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [AccountingProfitAndLossOneRequest](../../models/operations/AccountingProfitAndLossOneRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[AccountingProfitAndLossOneResponse](../../models/operations/AccountingProfitAndLossOneResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |