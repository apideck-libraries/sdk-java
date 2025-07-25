# Orders
(*ecommerce().orders()*)

## Overview

### Available Operations

* [list](#list) - List Orders
* [get](#get) - Get Order

## list

List Orders

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.EcommerceOrdersAllRequest;
import com.apideck.unify.models.operations.EcommerceOrdersAllResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        EcommerceOrdersAllRequest req = EcommerceOrdersAllRequest.builder()
                .serviceId("salesforce")
                .filter(EcommerceOrdersFilter.builder()
                    .email("elon@musk.com")
                    .customerId("123")
                    .updatedSince("2020-09-30T07:43:32.000Z")
                    .createdSince("2020-09-30T07:43:32.000Z")
                    .build())
                .sort(OrdersSort.builder()
                    .by(OrdersSortBy.CREATED_AT)
                    .direction(SortDirection.DESC)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();

        sdk.ecommerce().orders().list()
                .request(req)
                .callAsStream()
                .forEach((EcommerceOrdersAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [EcommerceOrdersAllRequest](../../models/operations/EcommerceOrdersAllRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[EcommerceOrdersAllResponse](../../models/operations/EcommerceOrdersAllResponse.md)**

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

Get Order

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.EcommerceOrdersOneRequest;
import com.apideck.unify.models.operations.EcommerceOrdersOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        EcommerceOrdersOneRequest req = EcommerceOrdersOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        EcommerceOrdersOneResponse res = sdk.ecommerce().orders().get()
                .request(req)
                .call();

        if (res.getEcommerceOrderResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [EcommerceOrdersOneRequest](../../models/operations/EcommerceOrdersOneRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[EcommerceOrdersOneResponse](../../models/operations/EcommerceOrdersOneResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |