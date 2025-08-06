# CustomFields
(*vault().customFields()*)

## Overview

### Available Operations

* [list](#list) - Get resource custom fields

## list

This endpoint returns an custom fields on a connection resource.


### Example Usage

<!-- UsageSnippet language="java" operationID="vault.customFieldsAll" method="get" path="/vault/connections/{unified_api}/{service_id}/{resource}/custom-fields" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.VaultCustomFieldsAllRequest;
import com.apideck.unify.models.operations.VaultCustomFieldsAllResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        VaultCustomFieldsAllRequest req = VaultCustomFieldsAllRequest.builder()
                .unifiedApi("crm")
                .serviceId("pipedrive")
                .resource("leads")
                .resourceId("1234")
                .build();

        VaultCustomFieldsAllResponse res = sdk.vault().customFields().list()
                .request(req)
                .call();

        if (res.getCustomFieldsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [VaultCustomFieldsAllRequest](../../models/operations/VaultCustomFieldsAllRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[VaultCustomFieldsAllResponse](../../models/operations/VaultCustomFieldsAllResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |