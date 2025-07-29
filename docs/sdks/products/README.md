# Products
(*ecommerce().products()*)

## Overview

### Available Operations

* [list](#list) - List Products
* [get](#get) - Get Product

## list

List Products

### Example Usage

<!-- UsageSnippet language="java" operationID="ecommerce.productsAll" method="get" path="/ecommerce/products" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.EcommerceProductsFilter;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.EcommerceProductsAllRequest;
import com.apideck.unify.models.operations.EcommerceProductsAllResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        EcommerceProductsAllRequest req = EcommerceProductsAllRequest.builder()
                .serviceId("salesforce")
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .filter(EcommerceProductsFilter.builder()
                    .name("Product Name")
                    .updatedSince("2020-09-30T07:43:32.000Z")
                    .createdSince("2020-09-30T07:43:32.000Z")
                    .build())
                .build();

        sdk.ecommerce().products().list()
                .request(req)
                .callAsStream()
                .forEach((EcommerceProductsAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [EcommerceProductsAllRequest](../../models/operations/EcommerceProductsAllRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[EcommerceProductsAllResponse](../../models/operations/EcommerceProductsAllResponse.md)**

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

Get Product

### Example Usage

<!-- UsageSnippet language="java" operationID="ecommerce.productsOne" method="get" path="/ecommerce/products/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.EcommerceProductsOneRequest;
import com.apideck.unify.models.operations.EcommerceProductsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        EcommerceProductsOneRequest req = EcommerceProductsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        EcommerceProductsOneResponse res = sdk.ecommerce().products().get()
                .request(req)
                .call();

        if (res.getProductResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [EcommerceProductsOneRequest](../../models/operations/EcommerceProductsOneRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[EcommerceProductsOneResponse](../../models/operations/EcommerceProductsOneResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |