# CollectionTags
(*issueTracking().collectionTags()*)

## Overview

### Available Operations

* [list](#list) - List Tags

## list

List Tags

### Example Usage

<!-- UsageSnippet language="java" operationID="issueTracking.collectionTagsAll" method="get" path="/issue-tracking/collections/{collection_id}/tags" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.IssueTrackingCollectionTagsAllRequest;
import com.apideck.unify.models.operations.IssueTrackingCollectionTagsAllResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        IssueTrackingCollectionTagsAllRequest req = IssueTrackingCollectionTagsAllRequest.builder()
                .collectionId("apideck-io")
                .serviceId("salesforce")
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();


        sdk.issueTracking().collectionTags().list()
                .callAsStream()
                .forEach((IssueTrackingCollectionTagsAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [IssueTrackingCollectionTagsAllRequest](../../models/operations/IssueTrackingCollectionTagsAllRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[IssueTrackingCollectionTagsAllResponse](../../models/operations/IssueTrackingCollectionTagsAllResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |