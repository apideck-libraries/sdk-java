# IssueTracking.CollectionUsers

## Overview

### Available Operations

* [list](#list) - List Users
* [get](#get) - Get user

## list

List Users

### Example Usage

<!-- UsageSnippet language="java" operationID="issueTracking.collectionUsersAll" method="get" path="/issue-tracking/collections/{collection_id}/users" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.IssueTrackingCollectionUsersAllRequest;
import com.apideck.unify.models.operations.IssueTrackingCollectionUsersAllResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        IssueTrackingCollectionUsersAllRequest req = IssueTrackingCollectionUsersAllRequest.builder()
                .collectionId("apideck-io")
                .serviceId("salesforce")
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();


        sdk.issueTracking().collectionUsers().list()
                .callAsStream()
                .forEach((IssueTrackingCollectionUsersAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [IssueTrackingCollectionUsersAllRequest](../../models/operations/IssueTrackingCollectionUsersAllRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[IssueTrackingCollectionUsersAllResponse](../../models/operations/IssueTrackingCollectionUsersAllResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## get

Get user

### Example Usage

<!-- UsageSnippet language="java" operationID="issueTracking.collectionUsersOne" method="get" path="/issue-tracking/collections/{collection_id}/users/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.IssueTrackingCollectionUsersOneRequest;
import com.apideck.unify.models.operations.IssueTrackingCollectionUsersOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        IssueTrackingCollectionUsersOneRequest req = IssueTrackingCollectionUsersOneRequest.builder()
                .collectionId("apideck-io")
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        IssueTrackingCollectionUsersOneResponse res = sdk.issueTracking().collectionUsers().get()
                .request(req)
                .call();

        if (res.getCollectionUserResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [IssueTrackingCollectionUsersOneRequest](../../models/operations/IssueTrackingCollectionUsersOneRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[IssueTrackingCollectionUsersOneResponse](../../models/operations/IssueTrackingCollectionUsersOneResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |