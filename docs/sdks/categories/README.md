# Categories
(*accounting().categories()*)

## Overview

### Available Operations

* [list](#list) - List Categories
* [get](#get) - Get Category

## list

List Categories

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.categoriesAll" method="get" path="/accounting/categories" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.CategoriesFilter;
import com.apideck.unify.models.components.CategoriesFilterType;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingCategoriesAllRequest;
import com.apideck.unify.models.operations.AccountingCategoriesAllResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingCategoriesAllRequest req = AccountingCategoriesAllRequest.builder()
                .serviceId("salesforce")
                .fields("id,updated_at")
                .filter(CategoriesFilter.builder()
                    .type(CategoriesFilterType.EXPENSE)
                    .build())
                .build();

        sdk.accounting().categories().list()
                .request(req)
                .callAsStream()
                .forEach((AccountingCategoriesAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [AccountingCategoriesAllRequest](../../models/operations/AccountingCategoriesAllRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[AccountingCategoriesAllResponse](../../models/operations/AccountingCategoriesAllResponse.md)**

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

Get Category

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.categoriesOne" method="get" path="/accounting/categories/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.CategoriesFilter;
import com.apideck.unify.models.components.CategoriesFilterType;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingCategoriesOneRequest;
import com.apideck.unify.models.operations.AccountingCategoriesOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingCategoriesOneRequest req = AccountingCategoriesOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .filter(CategoriesFilter.builder()
                    .type(CategoriesFilterType.EXPENSE)
                    .build())
                .build();

        AccountingCategoriesOneResponse res = sdk.accounting().categories().get()
                .request(req)
                .call();

        if (res.getCategoryResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [AccountingCategoriesOneRequest](../../models/operations/AccountingCategoriesOneRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[AccountingCategoriesOneResponse](../../models/operations/AccountingCategoriesOneResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |