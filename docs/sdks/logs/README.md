# Logs
(*vault().logs()*)

## Overview

### Available Operations

* [list](#list) - Get all consumer request logs

## list

This endpoint includes all consumer request logs.


### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.LogsFilter;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.VaultLogsAllRequest;
import com.apideck.unify.models.operations.VaultLogsAllResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        VaultLogsAllRequest req = VaultLogsAllRequest.builder()
                .filter(LogsFilter.builder()
                    .connectorId("crm+salesforce")
                    .statusCode(201d)
                    .excludeUnifiedApis("vault,proxy")
                    .build())
                .build();

        VaultLogsAllResponse res = sdk.vault().logs().list()
                .request(req)
                .call();

        if (res.getLogsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [VaultLogsAllRequest](../../models/operations/VaultLogsAllRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[VaultLogsAllResponse](../../models/operations/VaultLogsAllResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |