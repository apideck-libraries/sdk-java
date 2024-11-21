# CreateCallback
(*vault().createCallback()*)

## Overview

### Available Operations

* [state](#state) - Create Callback State

## state

This endpoint creates a callback state that can be used to issue requests to the callback endpoint.


### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.CreateCallbackState;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.VaultCreateCallbackStateRequest;
import com.apideck.unify.models.operations.VaultCreateCallbackStateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        VaultCreateCallbackStateRequest req = VaultCreateCallbackStateRequest.builder()
                .serviceId("pipedrive")
                .unifiedApi("crm")
                .createCallbackState(CreateCallbackState.builder()
                    .redirectUri("https://example.com/callback")
                    .build())
                .build();

        VaultCreateCallbackStateResponse res = sdk.vault().createCallback().state()
                .request(req)
                .call();

        if (res.createCallbackStateResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [VaultCreateCallbackStateRequest](../../models/operations/VaultCreateCallbackStateRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[VaultCreateCallbackStateResponse](../../models/operations/VaultCreateCallbackStateResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |