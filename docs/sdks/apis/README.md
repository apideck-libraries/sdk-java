# Connector.Apis

## Overview

### Available Operations

* [list](#list) - List APIs
* [get](#get) - Get API

## list

List APIs

### Example Usage

<!-- UsageSnippet language="java" operationID="connector.apisAll" method="get" path="/connector/apis" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.ApiStatus;
import com.apideck.unify.models.components.ApisFilter;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.ConnectorApisAllResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, Exception {

        Apideck sdk = Apideck.builder()
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();


        sdk.connector().apis().list()
                .limit(20L)
                .filter(ApisFilter.builder()
                    .status(ApiStatus.BETA)
                    .build())
                .callAsStream()
                .forEach((ConnectorApisAllResponse item) -> {
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
| `filter`                                                                                                         | [Optional\<ApisFilter>](../../models/components/ApisFilter.md)                                                   | :heavy_minus_sign:                                                                                               | Apply filters                                                                                                    | {<br/>"status": "beta"<br/>}                                                                                     |

### Response

**[ConnectorApisAllResponse](../../models/operations/ConnectorApisAllResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## get

Get API

### Example Usage

<!-- UsageSnippet language="java" operationID="connector.apisOne" method="get" path="/connector/apis/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.ConnectorApisOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, Exception {

        Apideck sdk = Apideck.builder()
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        ConnectorApisOneResponse res = sdk.connector().apis().get()
                .id("<id>")
                .call();

        if (res.getApiResponse().isPresent()) {
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

**[ConnectorApisOneResponse](../../models/operations/ConnectorApisOneResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |