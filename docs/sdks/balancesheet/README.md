# BalanceSheet
(*accounting().balanceSheet()*)

## Overview

### Available Operations

* [get](#get) - Get BalanceSheet

## get

Get BalanceSheet

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.BalanceSheetFilter;
import com.apideck.unify.models.components.PeriodType;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBalanceSheetOneRequest;
import com.apideck.unify.models.operations.AccountingBalanceSheetOneResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        AccountingBalanceSheetOneRequest req = AccountingBalanceSheetOneRequest.builder()
                .serviceId("salesforce")
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .filter(BalanceSheetFilter.builder()
                    .startDate("2021-01-01")
                    .endDate("2021-12-31")
                    .periodCount(3L)
                    .periodType(PeriodType.MONTH)
                    .build())
                .build();

        AccountingBalanceSheetOneResponse res = sdk.accounting().balanceSheet().get()
                .request(req)
                .call();

        if (res.getBalanceSheetResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AccountingBalanceSheetOneRequest](../../models/operations/AccountingBalanceSheetOneRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AccountingBalanceSheetOneResponse](../../models/operations/AccountingBalanceSheetOneResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |