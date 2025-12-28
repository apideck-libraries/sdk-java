# Connector.ConnectorResources

## Overview

### Available Operations

* [get](#get) - Get Connector Resource

## get

Get Connector Resource

### Example Usage

<!-- UsageSnippet language="java" operationID="connector.connectorResourcesOne" method="get" path="/connector/connectors/{id}/resources/{resource_id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.UnifiedApiId;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.ConnectorConnectorResourcesOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, Exception {

        Apideck sdk = Apideck.builder()
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        ConnectorConnectorResourcesOneResponse res = sdk.connector().connectorResources().get()
                .id("<id>")
                .resourceId("<id>")
                .unifiedApi(UnifiedApiId.CRM)
                .call();

        if (res.getConnectorResourceResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             | Example                                                                                                 |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `appId`                                                                                                 | *Optional\<String>*                                                                                     | :heavy_minus_sign:                                                                                      | The ID of your Unify application                                                                        | dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX                                                                 |
| `id`                                                                                                    | *String*                                                                                                | :heavy_check_mark:                                                                                      | ID of the record you are acting upon.                                                                   |                                                                                                         |
| `resourceId`                                                                                            | *String*                                                                                                | :heavy_check_mark:                                                                                      | ID of the resource you are acting upon.                                                                 |                                                                                                         |
| `unifiedApi`                                                                                            | [Optional\<UnifiedApiId>](../../models/components/UnifiedApiId.md)                                      | :heavy_minus_sign:                                                                                      | Specify unified API for the connector resource. This is useful when a resource appears in multiple APIs | crm                                                                                                     |

### Response

**[ConnectorConnectorResourcesOneResponse](../../models/operations/ConnectorConnectorResourcesOneResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |