# Vault.ConnectionConsent

## Overview

### Available Operations

* [update](#update) - Update consent state

## update

Update the consent state of a connection

### Example Usage

<!-- UsageSnippet language="java" operationID="vault.connectionConsentUpdate" method="patch" path="/vault/connections/{unified_api}/{service_id}/consent" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.VaultConnectionConsentUpdateRequest;
import com.apideck.unify.models.operations.VaultConnectionConsentUpdateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        VaultConnectionConsentUpdateRequest req = VaultConnectionConsentUpdateRequest.builder()
                .serviceId("pipedrive")
                .unifiedApi("crm")
                .updateConsentRequest(UpdateConsentRequest.builder()
                    .resources(UpdateConsentRequestResources.of(Two.WILDCARD))
                    .granted(true)
                    .build())
                .build();

        VaultConnectionConsentUpdateResponse res = sdk.vault().connectionConsent().update()
                .request(req)
                .call();

        if (res.updateConsentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [VaultConnectionConsentUpdateRequest](../../models/operations/VaultConnectionConsentUpdateRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[VaultConnectionConsentUpdateResponse](../../models/operations/VaultConnectionConsentUpdateResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |