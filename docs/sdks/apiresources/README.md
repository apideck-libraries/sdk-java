# ApiResources
(*connector().apiResources()*)

## Overview

### Available Operations

* [get](#get) - Get API Resource

## get

Get API Resource

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.operations.ConnectorApiResourcesOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        ConnectorApiResourcesOneResponse res = sdk.connector().apiResources().get()
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .id("<id>")
                .resourceId("<id>")
                .call();

        if (res.getApiResourceResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                               | Type                                    | Required                                | Description                             | Example                                 |
| --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- |
| `appId`                                 | *Optional\<String>*                     | :heavy_minus_sign:                      | The ID of your Unify application        | dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX |
| `id`                                    | *String*                                | :heavy_check_mark:                      | ID of the record you are acting upon.   |                                         |
| `resourceId`                            | *String*                                | :heavy_check_mark:                      | ID of the resource you are acting upon. |                                         |

### Response

**[ConnectorApiResourcesOneResponse](../../models/operations/ConnectorApiResourcesOneResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |