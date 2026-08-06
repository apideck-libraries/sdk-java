# Crm.ListMembers

## Overview

### Available Operations

* [list](#list) - List list members

## list

Retrieve the records that belong to a List. Returns a paginated set of members, each carrying the downstream record `id` and its `object_type`. Use this to enumerate the contents of a List (for example the contacts or companies a HubSpot list contains) instead of dropping to the proxy.


### Example Usage

<!-- UsageSnippet language="java" operationID="crm.listMembersAll" method="get" path="/crm/lists/{id}/members" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmListMembersAllRequest;
import com.apideck.unify.models.operations.CrmListMembersAllResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        CrmListMembersAllRequest req = CrmListMembersAllRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();


        sdk.crm().listMembers().list()
                .callAsStream()
                .forEach((CrmListMembersAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CrmListMembersAllRequest](../../models/operations/CrmListMembersAllRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CrmListMembersAllResponse](../../models/operations/CrmListMembersAllResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |