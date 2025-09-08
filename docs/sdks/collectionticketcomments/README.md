# CollectionTicketComments
(*issueTracking().collectionTicketComments()*)

## Overview

### Available Operations

* [list](#list) - List Comments
* [create](#create) - Create Comment
* [get](#get) - Get Comment
* [update](#update) - Update Comment
* [delete](#delete) - Delete Comment

## list

List Comments

### Example Usage

<!-- UsageSnippet language="java" operationID="issueTracking.collectionTicketCommentsAll" method="get" path="/issue-tracking/collections/{collection_id}/tickets/{ticket_id}/comments" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.IssueTrackingCollectionTicketCommentsAllRequest;
import com.apideck.unify.models.operations.IssueTrackingCollectionTicketCommentsAllResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        IssueTrackingCollectionTicketCommentsAllRequest req = IssueTrackingCollectionTicketCommentsAllRequest.builder()
                .collectionId("apideck-io")
                .ticketId("<id>")
                .serviceId("salesforce")
                .sort(CommentsSort.builder()
                    .by(CommentsSortBy.CREATED_AT)
                    .direction(SortDirection.DESC)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();


        sdk.issueTracking().collectionTicketComments().list()
                .callAsStream()
                .forEach((IssueTrackingCollectionTicketCommentsAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [IssueTrackingCollectionTicketCommentsAllRequest](../../models/operations/IssueTrackingCollectionTicketCommentsAllRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |

### Response

**[IssueTrackingCollectionTicketCommentsAllResponse](../../models/operations/IssueTrackingCollectionTicketCommentsAllResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## create

Create Comment

### Example Usage

<!-- UsageSnippet language="java" operationID="issueTracking.collectionTicketCommentsAdd" method="post" path="/issue-tracking/collections/{collection_id}/tickets/{ticket_id}/comments" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.IssueTrackingCollectionTicketCommentsAddRequest;
import com.apideck.unify.models.operations.IssueTrackingCollectionTicketCommentsAddResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        IssueTrackingCollectionTicketCommentsAddRequest req = IssueTrackingCollectionTicketCommentsAddRequest.builder()
                .collectionId("apideck-io")
                .ticketId("<id>")
                .collectionTicketComment(CollectionTicketCommentInput.builder()
                    .body("What internet provider do you use?")
                    .passThrough(List.of(
                        PassThroughBody.builder()
                            .serviceId("<id>")
                            .extendPaths(List.of(
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(
                                        Map.entry("TaxClassificationRef", Map.ofEntries(
                                            Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build(),
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(
                                        Map.entry("TaxClassificationRef", Map.ofEntries(
                                            Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build(),
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(
                                        Map.entry("TaxClassificationRef", Map.ofEntries(
                                            Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build()))
                            .build(),
                        PassThroughBody.builder()
                            .serviceId("<id>")
                            .extendPaths(List.of(
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(
                                        Map.entry("TaxClassificationRef", Map.ofEntries(
                                            Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build(),
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(
                                        Map.entry("TaxClassificationRef", Map.ofEntries(
                                            Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build(),
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(
                                        Map.entry("TaxClassificationRef", Map.ofEntries(
                                            Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build()))
                            .build()))
                    .build())
                .serviceId("salesforce")
                .build();

        IssueTrackingCollectionTicketCommentsAddResponse res = sdk.issueTracking().collectionTicketComments().create()
                .request(req)
                .call();

        if (res.createCommentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [IssueTrackingCollectionTicketCommentsAddRequest](../../models/operations/IssueTrackingCollectionTicketCommentsAddRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |

### Response

**[IssueTrackingCollectionTicketCommentsAddResponse](../../models/operations/IssueTrackingCollectionTicketCommentsAddResponse.md)**

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

Get Comment

### Example Usage

<!-- UsageSnippet language="java" operationID="issueTracking.collectionTicketCommentsOne" method="get" path="/issue-tracking/collections/{collection_id}/tickets/{ticket_id}/comments/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.IssueTrackingCollectionTicketCommentsOneRequest;
import com.apideck.unify.models.operations.IssueTrackingCollectionTicketCommentsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        IssueTrackingCollectionTicketCommentsOneRequest req = IssueTrackingCollectionTicketCommentsOneRequest.builder()
                .id("<id>")
                .collectionId("apideck-io")
                .ticketId("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();


        sdk.issueTracking().collectionTicketComments().get()
                .callAsStream()
                .forEach((IssueTrackingCollectionTicketCommentsOneResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [IssueTrackingCollectionTicketCommentsOneRequest](../../models/operations/IssueTrackingCollectionTicketCommentsOneRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |

### Response

**[IssueTrackingCollectionTicketCommentsOneResponse](../../models/operations/IssueTrackingCollectionTicketCommentsOneResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## update

Update Comment

### Example Usage

<!-- UsageSnippet language="java" operationID="issueTracking.collectionTicketCommentsUpdate" method="patch" path="/issue-tracking/collections/{collection_id}/tickets/{ticket_id}/comments/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.IssueTrackingCollectionTicketCommentsUpdateRequest;
import com.apideck.unify.models.operations.IssueTrackingCollectionTicketCommentsUpdateResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        IssueTrackingCollectionTicketCommentsUpdateRequest req = IssueTrackingCollectionTicketCommentsUpdateRequest.builder()
                .id("<id>")
                .collectionId("apideck-io")
                .ticketId("<id>")
                .collectionTicketComment(CollectionTicketCommentInput.builder()
                    .body("What internet provider do you use?")
                    .passThrough(List.of(
                        PassThroughBody.builder()
                            .serviceId("<id>")
                            .extendPaths(List.of(
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(
                                        Map.entry("TaxClassificationRef", Map.ofEntries(
                                            Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build(),
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(
                                        Map.entry("TaxClassificationRef", Map.ofEntries(
                                            Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build()))
                            .build()))
                    .build())
                .serviceId("salesforce")
                .build();

        IssueTrackingCollectionTicketCommentsUpdateResponse res = sdk.issueTracking().collectionTicketComments().update()
                .request(req)
                .call();

        if (res.updateCommentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                           | [IssueTrackingCollectionTicketCommentsUpdateRequest](../../models/operations/IssueTrackingCollectionTicketCommentsUpdateRequest.md) | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |

### Response

**[IssueTrackingCollectionTicketCommentsUpdateResponse](../../models/operations/IssueTrackingCollectionTicketCommentsUpdateResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## delete

Delete Comment

### Example Usage

<!-- UsageSnippet language="java" operationID="issueTracking.collectionTicketCommentsDelete" method="delete" path="/issue-tracking/collections/{collection_id}/tickets/{ticket_id}/comments/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.IssueTrackingCollectionTicketCommentsDeleteRequest;
import com.apideck.unify.models.operations.IssueTrackingCollectionTicketCommentsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        IssueTrackingCollectionTicketCommentsDeleteRequest req = IssueTrackingCollectionTicketCommentsDeleteRequest.builder()
                .id("<id>")
                .collectionId("apideck-io")
                .ticketId("<id>")
                .serviceId("salesforce")
                .build();

        IssueTrackingCollectionTicketCommentsDeleteResponse res = sdk.issueTracking().collectionTicketComments().delete()
                .request(req)
                .call();

        if (res.deleteCommentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                           | [IssueTrackingCollectionTicketCommentsDeleteRequest](../../models/operations/IssueTrackingCollectionTicketCommentsDeleteRequest.md) | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |

### Response

**[IssueTrackingCollectionTicketCommentsDeleteResponse](../../models/operations/IssueTrackingCollectionTicketCommentsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |