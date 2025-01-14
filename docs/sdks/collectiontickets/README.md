# CollectionTickets
(*issueTracking().collectionTickets()*)

## Overview

### Available Operations

* [list](#list) - List Tickets
* [create](#create) - Create Ticket
* [get](#get) - Get Ticket
* [update](#update) - Update Ticket
* [delete](#delete) - Delete Ticket

## list

List Tickets

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.IssuesFilter;
import com.apideck.unify.models.components.SortDirection;
import com.apideck.unify.models.components.TicketsSort;
import com.apideck.unify.models.components.TicketsSortBy;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.IssueTrackingCollectionTicketsAllRequest;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        IssueTrackingCollectionTicketsAllRequest req = IssueTrackingCollectionTicketsAllRequest.builder()
                .collectionId("apideck-io")
                .serviceId("salesforce")
                .sort(TicketsSort.builder()
                    .by(TicketsSortBy.CREATED_AT)
                    .direction(SortDirection.DESC)
                    .build())
                .filter(IssuesFilter.builder()
                    .status(List.of(
                        "open"))
                    .since(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .assigneeId("2332bd9c2eaaa5dcfa14721c")
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();

        sdk.issueTracking().collectionTickets().list()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [IssueTrackingCollectionTicketsAllRequest](../../models/operations/IssueTrackingCollectionTicketsAllRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |

### Response

**[IssueTrackingCollectionTicketsAllResponse](../../models/operations/IssueTrackingCollectionTicketsAllResponse.md)**

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

Create Ticket

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.AssigneeInput;
import com.apideck.unify.models.components.CollectionTagInput;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.Priority;
import com.apideck.unify.models.components.TicketInput;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.IssueTrackingCollectionTicketsAddRequest;
import com.apideck.unify.models.operations.IssueTrackingCollectionTicketsAddResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        IssueTrackingCollectionTicketsAddRequest req = IssueTrackingCollectionTicketsAddRequest.builder()
                .collectionId("apideck-io")
                .ticket(TicketInput.builder()
                    .parentId("12345")
                    .type("Technical")
                    .subject("Technical Support Request")
                    .description("I am facing issues with my internet connection")
                    .status("open")
                    .priority(Priority.HIGH)
                    .assignees(List.of(
                        AssigneeInput.builder()
                            .id("12345")
                            .build()))
                    .dueDate(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .tags(List.of(
                        CollectionTagInput.builder()
                            .id("12345")
                            .build(),
                        CollectionTagInput.builder()
                            .id("12345")
                            .build()))
                    .passThrough(List.of(
                        PassThroughBody.builder()
                            .serviceId("<id>")
                            .extendPaths(List.of(
                            ))
                            .build()))
                    .build())
                .serviceId("salesforce")
                .build();

        IssueTrackingCollectionTicketsAddResponse res = sdk.issueTracking().collectionTickets().create()
                .request(req)
                .call();

        if (res.createTicketResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [IssueTrackingCollectionTicketsAddRequest](../../models/operations/IssueTrackingCollectionTicketsAddRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |

### Response

**[IssueTrackingCollectionTicketsAddResponse](../../models/operations/IssueTrackingCollectionTicketsAddResponse.md)**

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

Get Ticket

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.IssueTrackingCollectionTicketsOneRequest;
import com.apideck.unify.models.operations.IssueTrackingCollectionTicketsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        IssueTrackingCollectionTicketsOneRequest req = IssueTrackingCollectionTicketsOneRequest.builder()
                .ticketId("<id>")
                .collectionId("apideck-io")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        IssueTrackingCollectionTicketsOneResponse res = sdk.issueTracking().collectionTickets().get()
                .request(req)
                .call();

        if (res.getTicketResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [IssueTrackingCollectionTicketsOneRequest](../../models/operations/IssueTrackingCollectionTicketsOneRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |

### Response

**[IssueTrackingCollectionTicketsOneResponse](../../models/operations/IssueTrackingCollectionTicketsOneResponse.md)**

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

Update Ticket

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.AssigneeInput;
import com.apideck.unify.models.components.CollectionTagInput;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.Priority;
import com.apideck.unify.models.components.TicketInput;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.IssueTrackingCollectionTicketsUpdateRequest;
import com.apideck.unify.models.operations.IssueTrackingCollectionTicketsUpdateResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        IssueTrackingCollectionTicketsUpdateRequest req = IssueTrackingCollectionTicketsUpdateRequest.builder()
                .ticketId("<id>")
                .collectionId("apideck-io")
                .ticket(TicketInput.builder()
                    .parentId("12345")
                    .type("Technical")
                    .subject("Technical Support Request")
                    .description("I am facing issues with my internet connection")
                    .status("open")
                    .priority(Priority.HIGH)
                    .assignees(List.of(
                        AssigneeInput.builder()
                            .id("12345")
                            .build(),
                        AssigneeInput.builder()
                            .id("12345")
                            .build(),
                        AssigneeInput.builder()
                            .id("12345")
                            .build()))
                    .dueDate(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .tags(List.of(
                        CollectionTagInput.builder()
                            .id("12345")
                            .build(),
                        CollectionTagInput.builder()
                            .id("12345")
                            .build()))
                    .passThrough(List.of(
                        PassThroughBody.builder()
                            .serviceId("<id>")
                            .extendPaths(List.of(
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(\n    Map.entry("TaxClassificationRef", Map.ofEntries(\n    Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build(),
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(\n    Map.entry("TaxClassificationRef", Map.ofEntries(\n    Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build(),
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(\n    Map.entry("TaxClassificationRef", Map.ofEntries(\n    Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build()))
                            .build()))
                    .build())
                .serviceId("salesforce")
                .build();

        IssueTrackingCollectionTicketsUpdateResponse res = sdk.issueTracking().collectionTickets().update()
                .request(req)
                .call();

        if (res.updateTicketResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [IssueTrackingCollectionTicketsUpdateRequest](../../models/operations/IssueTrackingCollectionTicketsUpdateRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |

### Response

**[IssueTrackingCollectionTicketsUpdateResponse](../../models/operations/IssueTrackingCollectionTicketsUpdateResponse.md)**

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

Delete Ticket

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.IssueTrackingCollectionTicketsDeleteRequest;
import com.apideck.unify.models.operations.IssueTrackingCollectionTicketsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        IssueTrackingCollectionTicketsDeleteRequest req = IssueTrackingCollectionTicketsDeleteRequest.builder()
                .ticketId("<id>")
                .collectionId("apideck-io")
                .serviceId("salesforce")
                .build();

        IssueTrackingCollectionTicketsDeleteResponse res = sdk.issueTracking().collectionTickets().delete()
                .request(req)
                .call();

        if (res.deleteTicketResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [IssueTrackingCollectionTicketsDeleteRequest](../../models/operations/IssueTrackingCollectionTicketsDeleteRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |

### Response

**[IssueTrackingCollectionTicketsDeleteResponse](../../models/operations/IssueTrackingCollectionTicketsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |