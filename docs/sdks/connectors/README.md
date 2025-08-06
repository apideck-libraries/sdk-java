# Connectors
(*connector().connectors()*)

## Overview

### Available Operations

* [list](#list) - List Connectors
* [get](#get) - Get Connector

## list

List Connectors

### Example Usage

<!-- UsageSnippet language="java" operationID="connector.connectorsAll" method="get" path="/connector/connectors" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.ConnectorsFilter;
import com.apideck.unify.models.components.UnifiedApiId;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.ConnectorConnectorsAllResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, Exception {

        Apideck sdk = Apideck.builder()
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        sdk.connector().connectors().list()
                .limit(20L)
                .filter(ConnectorsFilter.builder()
                    .unifiedApi(UnifiedApiId.FILE_STORAGE)
                    .build())
                .callAsStream()
                .forEach((ConnectorConnectorsAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      | Example                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `appId`                                                                                                          | *Optional\<String>*                                                                                              | :heavy_minus_sign:                                                                                               | The ID of your Unify application                                                                                 | dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX                                                                          |
| `cursor`                                                                                                         | *JsonNullable\<String>*                                                                                          | :heavy_minus_sign:                                                                                               | Cursor to start from. You can find cursors for next/previous pages in the meta.cursors property of the response. |                                                                                                                  |
| `limit`                                                                                                          | *Optional\<Long>*                                                                                                | :heavy_minus_sign:                                                                                               | Number of results to return. Minimum 1, Maximum 200, Default 20                                                  |                                                                                                                  |
| `filter`                                                                                                         | [Optional\<ConnectorsFilter>](../../models/components/ConnectorsFilter.md)                                       | :heavy_minus_sign:                                                                                               | Apply filters                                                                                                    | {<br/>"unified_api": "file-storage"<br/>}                                                                        |

### Response

**[ConnectorConnectorsAllResponse](../../models/operations/ConnectorConnectorsAllResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## get

Get Connector

### Example Usage

<!-- UsageSnippet language="java" operationID="connector.connectorsOne" method="get" path="/connector/connectors/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.ConnectorConnectorsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, Exception {

        Apideck sdk = Apideck.builder()
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        ConnectorConnectorsOneResponse res = sdk.connector().connectors().get()
                .id("<id>")
                .call();

        if (res.getConnectorResponse().isPresent()) {
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

### Response

**[ConnectorConnectorsOneResponse](../../models/operations/ConnectorConnectorsOneResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |