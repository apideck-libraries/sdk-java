# Expenses
(*accounting().expenses()*)

## Overview

### Available Operations

* [list](#list) - List Expenses
* [create](#create) - Create Expense
* [get](#get) - Get Expense
* [update](#update) - Update Expense
* [delete](#delete) - Delete Expense

## list

List Expenses

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.AccountingExpensesAllRequest;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingExpensesAllRequest req = AccountingExpensesAllRequest.builder()
                .raw(false)
                .serviceId("salesforce")
                .limit(20L)
                .build();

        sdk.accounting().expenses().list()
                .request(req)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AccountingExpensesAllRequest](../../models/operations/AccountingExpensesAllRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AccountingExpensesAllResponse](../../models/operations/AccountingExpensesAllResponse.md)**

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

Create Expense

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.Currency;
import com.apideck.unify.models.components.CustomField;
import com.apideck.unify.models.components.ExpenseInput;
import com.apideck.unify.models.components.ExpenseLineItemInput;
import com.apideck.unify.models.components.ExpensePaymentType;
import com.apideck.unify.models.components.ExpenseType;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.LinkedTaxRateInput;
import com.apideck.unify.models.components.LinkedTrackingCategory;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.Value;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.AccountingExpensesAddRequest;
import com.apideck.unify.models.operations.AccountingExpensesAddResponse;
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

        AccountingExpensesAddRequest req = AccountingExpensesAddRequest.builder()
                .expense(ExpenseInput.builder()
                    .transactionDate(OffsetDateTime.parse("2021-05-01T12:00:00.000Z"))
                    .accountId("123456")
                    .lineItems(List.of(
                        ExpenseLineItemInput.builder()
                            .totalAmount(275d)
                            .trackingCategories(List.of(
                                LinkedTrackingCategory.builder()
                                    .id("123456")
                                    .name("New York")
                                    .build(),
                                LinkedTrackingCategory.builder()
                                    .id("123456")
                                    .name("New York")
                                    .build()))
                            .accountId("123456")
                            .customerId("12345")
                            .departmentId("12345")
                            .locationId("12345")
                            .taxRate(LinkedTaxRateInput.builder()
                                .id("123456")
                                .rate(10d)
                                .build())
                            .description("Travel US.")
                            .billable(true)
                            .build()))
                    .number("OIT00546")
                    .customerId("12345")
                    .supplierId("12345")
                    .companyId("12345")
                    .departmentId("12345")
                    .paymentType(ExpensePaymentType.CASH)
                    .currency(Currency.USD)
                    .currencyRate(0.69d)
                    .type(ExpenseType.EXPENSE)
                    .memo("For travel expenses incurred on 2024-05-15")
                    .taxRate(LinkedTaxRateInput.builder()
                        .id("123456")
                        .rate(10d)
                        .build())
                    .totalAmount(275d)
                    .customFields(List.of(
                        CustomField.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(Value.of("Uses Salesforce and Marketo"))
                            .build(),
                        CustomField.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(Value.of("Uses Salesforce and Marketo"))
                            .build()))
                    .rowVersion("1-12345")
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
                            .build(),
                        PassThroughBody.builder()
                            .serviceId("<id>")
                            .extendPaths(List.of(
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(\n    Map.entry("TaxClassificationRef", Map.ofEntries(\n    Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build()))
                            .build(),
                        PassThroughBody.builder()
                            .serviceId("<id>")
                            .extendPaths(List.of(
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(\n    Map.entry("TaxClassificationRef", Map.ofEntries(\n    Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build()))
                            .build()))
                    .build())
                .raw(false)
                .serviceId("salesforce")
                .build();

        AccountingExpensesAddResponse res = sdk.accounting().expenses().create()
                .request(req)
                .call();

        if (res.createExpenseResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AccountingExpensesAddRequest](../../models/operations/AccountingExpensesAddRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AccountingExpensesAddResponse](../../models/operations/AccountingExpensesAddResponse.md)**

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

Get Expense

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.AccountingExpensesOneRequest;
import com.apideck.unify.models.operations.AccountingExpensesOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingExpensesOneRequest req = AccountingExpensesOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .raw(false)
                .build();

        AccountingExpensesOneResponse res = sdk.accounting().expenses().get()
                .request(req)
                .call();

        if (res.getExpenseResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AccountingExpensesOneRequest](../../models/operations/AccountingExpensesOneRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AccountingExpensesOneResponse](../../models/operations/AccountingExpensesOneResponse.md)**

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

Update Expense

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.Currency;
import com.apideck.unify.models.components.CustomField;
import com.apideck.unify.models.components.ExpenseInput;
import com.apideck.unify.models.components.ExpenseLineItemInput;
import com.apideck.unify.models.components.ExpensePaymentType;
import com.apideck.unify.models.components.ExpenseType;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.Four;
import com.apideck.unify.models.components.LinkedTaxRateInput;
import com.apideck.unify.models.components.LinkedTrackingCategory;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.Value;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.AccountingExpensesUpdateRequest;
import com.apideck.unify.models.operations.AccountingExpensesUpdateResponse;
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

        AccountingExpensesUpdateRequest req = AccountingExpensesUpdateRequest.builder()
                .id("<id>")
                .expense(ExpenseInput.builder()
                    .transactionDate(OffsetDateTime.parse("2021-05-01T12:00:00.000Z"))
                    .accountId("123456")
                    .lineItems(List.of(
                        ExpenseLineItemInput.builder()
                            .totalAmount(275d)
                            .trackingCategories(List.of(
                                LinkedTrackingCategory.builder()
                                    .id("123456")
                                    .name("New York")
                                    .build(),
                                LinkedTrackingCategory.builder()
                                    .id("123456")
                                    .name("New York")
                                    .build()))
                            .accountId("123456")
                            .customerId("12345")
                            .departmentId("12345")
                            .locationId("12345")
                            .taxRate(LinkedTaxRateInput.builder()
                                .id("123456")
                                .rate(10d)
                                .build())
                            .description("Travel US.")
                            .billable(true)
                            .build(),
                        ExpenseLineItemInput.builder()
                            .totalAmount(275d)
                            .trackingCategories(List.of(
                                LinkedTrackingCategory.builder()
                                    .id("123456")
                                    .name("New York")
                                    .build(),
                                LinkedTrackingCategory.builder()
                                    .id("123456")
                                    .name("New York")
                                    .build()))
                            .accountId("123456")
                            .customerId("12345")
                            .departmentId("12345")
                            .locationId("12345")
                            .taxRate(LinkedTaxRateInput.builder()
                                .id("123456")
                                .rate(10d)
                                .build())
                            .description("Travel US.")
                            .billable(true)
                            .build(),
                        ExpenseLineItemInput.builder()
                            .totalAmount(275d)
                            .trackingCategories(List.of(
                                LinkedTrackingCategory.builder()
                                    .id("123456")
                                    .name("New York")
                                    .build(),
                                LinkedTrackingCategory.builder()
                                    .id("123456")
                                    .name("New York")
                                    .build(),
                                LinkedTrackingCategory.builder()
                                    .id("123456")
                                    .name("New York")
                                    .build()))
                            .accountId("123456")
                            .customerId("12345")
                            .departmentId("12345")
                            .locationId("12345")
                            .taxRate(LinkedTaxRateInput.builder()
                                .id("123456")
                                .rate(10d)
                                .build())
                            .description("Travel US.")
                            .billable(true)
                            .build()))
                    .number("OIT00546")
                    .customerId("12345")
                    .supplierId("12345")
                    .companyId("12345")
                    .departmentId("12345")
                    .paymentType(ExpensePaymentType.CASH)
                    .currency(Currency.USD)
                    .currencyRate(0.69d)
                    .type(ExpenseType.EXPENSE)
                    .memo("For travel expenses incurred on 2024-05-15")
                    .taxRate(LinkedTaxRateInput.builder()
                        .id("123456")
                        .rate(10d)
                        .build())
                    .totalAmount(275d)
                    .customFields(List.of(
                        CustomField.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(Value.of(true))
                            .build(),
                        CustomField.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(Value.of(Four.builder()
                                .build()))
                            .build()))
                    .rowVersion("1-12345")
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
                                    .build()))
                            .build(),
                        PassThroughBody.builder()
                            .serviceId("<id>")
                            .extendPaths(List.of(
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(\n    Map.entry("TaxClassificationRef", Map.ofEntries(\n    Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build()))
                            .build(),
                        PassThroughBody.builder()
                            .serviceId("<id>")
                            .extendPaths(List.of(
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(\n    Map.entry("TaxClassificationRef", Map.ofEntries(\n    Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build()))
                            .build()))
                    .build())
                .serviceId("salesforce")
                .raw(false)
                .build();

        AccountingExpensesUpdateResponse res = sdk.accounting().expenses().update()
                .request(req)
                .call();

        if (res.updateExpenseResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AccountingExpensesUpdateRequest](../../models/operations/AccountingExpensesUpdateRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AccountingExpensesUpdateResponse](../../models/operations/AccountingExpensesUpdateResponse.md)**

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

Delete Expense

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.AccountingExpensesDeleteRequest;
import com.apideck.unify.models.operations.AccountingExpensesDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingExpensesDeleteRequest req = AccountingExpensesDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .raw(false)
                .build();

        AccountingExpensesDeleteResponse res = sdk.accounting().expenses().delete()
                .request(req)
                .call();

        if (res.deleteExpenseResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AccountingExpensesDeleteRequest](../../models/operations/AccountingExpensesDeleteRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AccountingExpensesDeleteResponse](../../models/operations/AccountingExpensesDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |