# ConnectorDocs
(*connector().connectorDocs()*)

## Overview

### Available Operations

* [get](#get) - Get Connector Doc content

## get

Get Connector Doc content

### Example Usage

<!-- UsageSnippet language="java" operationID="connector.connectorDocsOne" method="get" path="/connector/connectors/{id}/docs/{doc_id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.ConnectorConnectorDocsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, Exception {

        Apideck sdk = Apideck.builder()
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        ConnectorConnectorDocsOneResponse res = sdk.connector().connectorDocs().get()
                .id("<id>")
                .docId("application_owner+oauth_credentials")
                .call();

        if (res.getConnectorDocResponse().isPresent()) {
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
| `docId`                                 | *String*                                | :heavy_check_mark:                      | ID of the Doc                           | application_owner+oauth_credentials     |

### Response

**[ConnectorConnectorDocsOneResponse](../../models/operations/ConnectorConnectorDocsOneResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |