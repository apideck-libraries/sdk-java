# Vault.ConnectionCustomMappings

## Overview

### Available Operations

* [list](#list) - List connection custom mappings

## list

This endpoint returns a list of custom mappings for a connection.

### Example Usage

<!-- UsageSnippet language="java" operationID="vault.connectionCustomMappingsAll" method="get" path="/vault/connections/{unified_api}/{service_id}/{resource}/custom-mappings" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.VaultConnectionCustomMappingsAllRequest;
import com.apideck.unify.models.operations.VaultConnectionCustomMappingsAllResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        VaultConnectionCustomMappingsAllRequest req = VaultConnectionCustomMappingsAllRequest.builder()
                .unifiedApi("crm")
                .serviceId("pipedrive")
                .resource("leads")
                .resourceId("1234")
                .build();

        VaultConnectionCustomMappingsAllResponse res = sdk.vault().connectionCustomMappings().list()
                .request(req)
                .call();

        if (res.getCustomMappingsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [VaultConnectionCustomMappingsAllRequest](../../models/operations/VaultConnectionCustomMappingsAllRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[VaultConnectionCustomMappingsAllResponse](../../models/operations/VaultConnectionCustomMappingsAllResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |