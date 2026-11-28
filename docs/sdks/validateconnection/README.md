# Vault.ValidateConnection

## Overview

### Available Operations

* [state](#state) - Validate Connection State

## state

This endpoint checks a connection again and returns its updated state.
For OAuth2 connectors and custom connectors with an OAuth grant (except connectors used only for authentication), this operation first forces the refresh flow for an access token regardless of its expiry.
Then, for connectors that support connection validation (`validation_support: true`), it sends the connector's validation request with the stored credentials.
The validation request is not sent when the connection is disabled, does not have the settings that the request needs, or still needs OAuth authorization.
When the connector has no OAuth refresh and no connection validation, nothing is sent to the integration, and the state is computed from the stored connection.
When the integration rejects the forced token refresh with a non-recoverable error, and no other process saved a newer token in the meantime, the connection is marked as not valid, `vault.connection.token_refresh.failed` is triggered, and the operation returns an error. Its `state` becomes `invalid` only when the connector supports connection validation and no refresh-token retention is active (`credentials_expire_at` is not a future time).

The result is saved on the connection. When the connection `state` changes, `vault.connection.updated` is triggered, and `vault.connection.callable` too when the connection becomes callable. Use this operation to check an `invalid` connection again: reading the connection does not check it.

Note:
  - Do not include any credentials in the request body. The operation uses the credentials stored on the connection.
  - If a refresh token flow was performed and successful, the new access token will then be used for subsequent API requests.
  - A connection that is waiting for confirmation is returned with its stored state, without a refresh or a validation request.


### Example Usage

<!-- UsageSnippet language="java" operationID="vault.validateConnectionState" method="post" path="/vault/connections/{unified_api}/{service_id}/validate" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.VaultValidateConnectionStateRequest;
import com.apideck.unify.models.operations.VaultValidateConnectionStateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        VaultValidateConnectionStateRequest req = VaultValidateConnectionStateRequest.builder()
                .serviceId("pipedrive")
                .unifiedApi("crm")
                .build();

        VaultValidateConnectionStateResponse res = sdk.vault().validateConnection().state()
                .request(req)
                .call();

        if (res.validateConnectionStateResponse().isPresent()) {
            System.out.println(res.validateConnectionStateResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [VaultValidateConnectionStateRequest](../../models/operations/VaultValidateConnectionStateRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[VaultValidateConnectionStateResponse](../../models/operations/VaultValidateConnectionStateResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |