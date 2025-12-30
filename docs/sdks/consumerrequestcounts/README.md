# Vault.ConsumerRequestCounts

## Overview

### Available Operations

* [list](#list) - Consumer request counts

## list

Get consumer request counts within a given datetime range.


### Example Usage

<!-- UsageSnippet language="java" operationID="vault.consumerRequestCountsAll" method="get" path="/vault/consumers/{consumer_id}/stats" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.VaultConsumerRequestCountsAllResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        VaultConsumerRequestCountsAllResponse res = sdk.vault().consumerRequestCounts().list()
                .consumerId("test_user_id")
                .startDatetime("2021-05-01T12:00:00.000Z")
                .endDatetime("2021-05-30T12:00:00.000Z")
                .call();

        if (res.consumerRequestCountsInDateRangeResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              | Example                                                  |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `appId`                                                  | *Optional\<String>*                                      | :heavy_minus_sign:                                       | The ID of your Unify application                         | dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX                  |
| `consumerId`                                             | *String*                                                 | :heavy_check_mark:                                       | ID of the consumer to return                             | test_user_id                                             |
| `startDatetime`                                          | *String*                                                 | :heavy_check_mark:                                       | Scopes results to requests that happened after datetime  | 2021-05-01T12:00:00.000Z                                 |
| `endDatetime`                                            | *String*                                                 | :heavy_check_mark:                                       | Scopes results to requests that happened before datetime | 2021-05-30T12:00:00.000Z                                 |

### Response

**[VaultConsumerRequestCountsAllResponse](../../models/operations/VaultConsumerRequestCountsAllResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |