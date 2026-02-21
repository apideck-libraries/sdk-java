# Accounting.ExpenseCategories

## Overview

### Available Operations

* [list](#list) - List Expense Categories
* [create](#create) - Create Expense Category
* [get](#get) - Get Expense Category
* [update](#update) - Update Expense Category
* [delete](#delete) - Delete Expense Category

## list

List Expense Categories

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.expenseCategoriesAll" method="get" path="/accounting/expense-categories" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.ExpenseCategoriesFilter;
import com.apideck.unify.models.components.ExpenseCategoriesFilterStatus;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingExpenseCategoriesAllRequest;
import com.apideck.unify.models.operations.AccountingExpenseCategoriesAllResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingExpenseCategoriesAllRequest req = AccountingExpenseCategoriesAllRequest.builder()
                .serviceId("salesforce")
                .fields("id,updated_at")
                .filter(ExpenseCategoriesFilter.builder()
                    .updatedSince(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .status(ExpenseCategoriesFilterStatus.ACTIVE)
                    .build())
                .build();


        sdk.accounting().expenseCategories().list()
                .callAsStream()
                .forEach((AccountingExpenseCategoriesAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [AccountingExpenseCategoriesAllRequest](../../models/operations/AccountingExpenseCategoriesAllRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[AccountingExpenseCategoriesAllResponse](../../models/operations/AccountingExpenseCategoriesAllResponse.md)**

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

Create Expense Category

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.expenseCategoriesAdd" method="post" path="/accounting/expense-categories" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingExpenseCategoriesAddRequest;
import com.apideck.unify.models.operations.AccountingExpenseCategoriesAddResponse;
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

        AccountingExpenseCategoriesAddRequest req = AccountingExpenseCategoriesAddRequest.builder()
                .expenseCategory(ExpenseCategoryInput.builder()
                    .name("Travel")
                    .displayId("123456")
                    .code("TRAVEL-001")
                    .description("Travel-related expenses including flights, hotels, and ground transportation.")
                    .status(ExpenseCategoryStatus.ACTIVE)
                    .account(LinkedLedgerAccount.builder()
                        .id("123456")
                        .name("Bank account")
                        .nominalCode("N091")
                        .code("453")
                        .parentId("123456")
                        .displayId("123456")
                        .build())
                    .offsetAccount(LinkedLedgerAccount.builder()
                        .id("123456")
                        .name("Bank account")
                        .nominalCode("N091")
                        .code("453")
                        .parentId("123456")
                        .displayId("123456")
                        .build())
                    .taxRate(LinkedTaxRateInput.builder()
                        .id("123456")
                        .code("N-T")
                        .rate(10d)
                        .build())
                    .rateRequired(false)
                    .defaultRate(0.67)
                    .rowVersion("1-12345")
                    .passThrough(List.of(
                        PassThroughBody.builder()
                            .serviceId("<id>")
                            .extendPaths(List.of(
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

        AccountingExpenseCategoriesAddResponse res = sdk.accounting().expenseCategories().create()
                .request(req)
                .call();

        if (res.createExpenseCategoryResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [AccountingExpenseCategoriesAddRequest](../../models/operations/AccountingExpenseCategoriesAddRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[AccountingExpenseCategoriesAddResponse](../../models/operations/AccountingExpenseCategoriesAddResponse.md)**

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

Get Expense Category

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.expenseCategoriesOne" method="get" path="/accounting/expense-categories/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingExpenseCategoriesOneRequest;
import com.apideck.unify.models.operations.AccountingExpenseCategoriesOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingExpenseCategoriesOneRequest req = AccountingExpenseCategoriesOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        AccountingExpenseCategoriesOneResponse res = sdk.accounting().expenseCategories().get()
                .request(req)
                .call();

        if (res.getExpenseCategoryResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [AccountingExpenseCategoriesOneRequest](../../models/operations/AccountingExpenseCategoriesOneRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[AccountingExpenseCategoriesOneResponse](../../models/operations/AccountingExpenseCategoriesOneResponse.md)**

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

Update Expense Category

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.expenseCategoriesUpdate" method="patch" path="/accounting/expense-categories/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingExpenseCategoriesUpdateRequest;
import com.apideck.unify.models.operations.AccountingExpenseCategoriesUpdateResponse;
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

        AccountingExpenseCategoriesUpdateRequest req = AccountingExpenseCategoriesUpdateRequest.builder()
                .id("<id>")
                .expenseCategory(ExpenseCategoryInput.builder()
                    .name("Travel")
                    .displayId("123456")
                    .code("TRAVEL-001")
                    .description("Travel-related expenses including flights, hotels, and ground transportation.")
                    .status(ExpenseCategoryStatus.ACTIVE)
                    .account(LinkedLedgerAccount.builder()
                        .id("123456")
                        .name("Bank account")
                        .nominalCode("N091")
                        .code("453")
                        .parentId("123456")
                        .displayId("123456")
                        .build())
                    .offsetAccount(LinkedLedgerAccount.builder()
                        .id("123456")
                        .name("Bank account")
                        .nominalCode("N091")
                        .code("453")
                        .parentId("123456")
                        .displayId("123456")
                        .build())
                    .taxRate(LinkedTaxRateInput.builder()
                        .id("123456")
                        .code("N-T")
                        .rate(10d)
                        .build())
                    .rateRequired(false)
                    .defaultRate(0.67)
                    .rowVersion("1-12345")
                    .passThrough(List.of(
                        PassThroughBody.builder()
                            .serviceId("<id>")
                            .extendPaths(List.of(
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

        AccountingExpenseCategoriesUpdateResponse res = sdk.accounting().expenseCategories().update()
                .request(req)
                .call();

        if (res.updateExpenseCategoryResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [AccountingExpenseCategoriesUpdateRequest](../../models/operations/AccountingExpenseCategoriesUpdateRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |

### Response

**[AccountingExpenseCategoriesUpdateResponse](../../models/operations/AccountingExpenseCategoriesUpdateResponse.md)**

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

Delete Expense Category

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.expenseCategoriesDelete" method="delete" path="/accounting/expense-categories/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingExpenseCategoriesDeleteRequest;
import com.apideck.unify.models.operations.AccountingExpenseCategoriesDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingExpenseCategoriesDeleteRequest req = AccountingExpenseCategoriesDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AccountingExpenseCategoriesDeleteResponse res = sdk.accounting().expenseCategories().delete()
                .request(req)
                .call();

        if (res.deleteExpenseCategoryResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [AccountingExpenseCategoriesDeleteRequest](../../models/operations/AccountingExpenseCategoriesDeleteRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |

### Response

**[AccountingExpenseCategoriesDeleteResponse](../../models/operations/AccountingExpenseCategoriesDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |