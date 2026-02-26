# Accounting.ExpenseReports

## Overview

### Available Operations

* [list](#list) - List Expense Reports
* [create](#create) - Create Expense Report
* [get](#get) - Get Expense Report
* [update](#update) - Update Expense Report
* [delete](#delete) - Delete Expense Report

## list

List Expense Reports

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.expenseReportsAll" method="get" path="/accounting/expense-reports" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.ExpenseReportsFilter;
import com.apideck.unify.models.components.ExpenseReportsFilterStatus;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingExpenseReportsAllRequest;
import com.apideck.unify.models.operations.AccountingExpenseReportsAllResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingExpenseReportsAllRequest req = AccountingExpenseReportsAllRequest.builder()
                .serviceId("salesforce")
                .fields("id,updated_at")
                .filter(ExpenseReportsFilter.builder()
                    .updatedSince(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .status(ExpenseReportsFilterStatus.SUBMITTED)
                    .build())
                .build();


        sdk.accounting().expenseReports().list()
                .callAsStream()
                .forEach((AccountingExpenseReportsAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AccountingExpenseReportsAllRequest](../../models/operations/AccountingExpenseReportsAllRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[AccountingExpenseReportsAllResponse](../../models/operations/AccountingExpenseReportsAllResponse.md)**

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

Create Expense Report

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.expenseReportsAdd" method="post" path="/accounting/expense-reports" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingExpenseReportsAddRequest;
import com.apideck.unify.models.operations.AccountingExpenseReportsAddResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingExpenseReportsAddRequest req = AccountingExpenseReportsAddRequest.builder()
                .expenseReport(ExpenseReportInput.builder()
                    .employee(ExpenseReportEmployee.builder()
                        .id("12345")
                        .displayName("John Doe")
                        .build())
                    .transactionDate(OffsetDateTime.parse("2021-05-01T12:00:00.000Z"))
                    .lineItems(List.of())
                    .displayId("123456")
                    .number("ER-001")
                    .title("Q1 Business Travel")
                    .status(ExpenseReportStatus.SUBMITTED)
                    .postingDate(LocalDate.parse("2024-06-01"))
                    .dueDate(LocalDate.parse("2024-06-15"))
                    .currency(Currency.USD)
                    .currencyRate(0.69)
                    .subTotal(250d)
                    .totalTax(25d)
                    .totalAmount(1250.75)
                    .reimbursableAmount(1100d)
                    .memo("Business travel expenses for Q1 client meetings")
                    .department(LinkedDepartmentInput.builder()
                        .displayId("123456")
                        .name("Acme Inc.")
                        .build())
                    .location(LinkedLocationInput.builder()
                        .id("123456")
                        .displayId("123456")
                        .name("New York Office")
                        .build())
                    .account(JsonNullable.of(null))
                    .accountingPeriod(AccountingPeriod.builder()
                        .id("12345")
                        .name("Q1 2024")
                        .build())
                    .subsidiary(LinkedSubsidiaryInput.builder()
                        .displayId("123456")
                        .name("Acme Inc.")
                        .build())
                    .trackingCategories(List.of(
                        LinkedTrackingCategory.builder()
                            .id("123456")
                            .code("100")
                            .name("New York")
                            .parentId("123456")
                            .parentName("New York")
                            .build()))
                    .taxInclusive(true)
                    .approvedBy(ApprovedBy.builder()
                        .id("12345")
                        .displayName("Jane Smith")
                        .build())
                    .customFields(List.of(
                        CustomField.of(CustomField1.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(CustomField1Value.of("Uses Salesforce and Marketo"))
                            .build())))
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

        AccountingExpenseReportsAddResponse res = sdk.accounting().expenseReports().create()
                .request(req)
                .call();

        if (res.createExpenseReportResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AccountingExpenseReportsAddRequest](../../models/operations/AccountingExpenseReportsAddRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[AccountingExpenseReportsAddResponse](../../models/operations/AccountingExpenseReportsAddResponse.md)**

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

Get Expense Report

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.expenseReportsOne" method="get" path="/accounting/expense-reports/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingExpenseReportsOneRequest;
import com.apideck.unify.models.operations.AccountingExpenseReportsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingExpenseReportsOneRequest req = AccountingExpenseReportsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        AccountingExpenseReportsOneResponse res = sdk.accounting().expenseReports().get()
                .request(req)
                .call();

        if (res.getExpenseReportResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AccountingExpenseReportsOneRequest](../../models/operations/AccountingExpenseReportsOneRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[AccountingExpenseReportsOneResponse](../../models/operations/AccountingExpenseReportsOneResponse.md)**

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

Update Expense Report

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.expenseReportsUpdate" method="patch" path="/accounting/expense-reports/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingExpenseReportsUpdateRequest;
import com.apideck.unify.models.operations.AccountingExpenseReportsUpdateResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingExpenseReportsUpdateRequest req = AccountingExpenseReportsUpdateRequest.builder()
                .id("<id>")
                .expenseReport(ExpenseReportInput.builder()
                    .employee(ExpenseReportEmployee.builder()
                        .id("12345")
                        .displayName("John Doe")
                        .build())
                    .transactionDate(OffsetDateTime.parse("2021-05-01T12:00:00.000Z"))
                    .lineItems(List.of())
                    .displayId("123456")
                    .number("ER-001")
                    .title("Q1 Business Travel")
                    .status(ExpenseReportStatus.SUBMITTED)
                    .postingDate(LocalDate.parse("2024-06-01"))
                    .dueDate(LocalDate.parse("2024-06-15"))
                    .currency(Currency.USD)
                    .currencyRate(0.69)
                    .subTotal(250d)
                    .totalTax(25d)
                    .totalAmount(1250.75)
                    .reimbursableAmount(1100d)
                    .memo("Business travel expenses for Q1 client meetings")
                    .department(LinkedDepartmentInput.builder()
                        .displayId("123456")
                        .name("Acme Inc.")
                        .build())
                    .location(LinkedLocationInput.builder()
                        .id("123456")
                        .displayId("123456")
                        .name("New York Office")
                        .build())
                    .account(LinkedLedgerAccount.builder()
                        .id("123456")
                        .name("Bank account")
                        .nominalCode("N091")
                        .code("453")
                        .parentId("123456")
                        .displayId("123456")
                        .build())
                    .accountingPeriod(AccountingPeriod.builder()
                        .id("12345")
                        .name("Q1 2024")
                        .build())
                    .subsidiary(LinkedSubsidiaryInput.builder()
                        .displayId("123456")
                        .name("Acme Inc.")
                        .build())
                    .trackingCategories(JsonNullable.of(null))
                    .taxInclusive(true)
                    .approvedBy(ApprovedBy.builder()
                        .id("12345")
                        .displayName("Jane Smith")
                        .build())
                    .customFields(List.of(
                        CustomField.of(CustomField1.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(CustomField1Value.of("Uses Salesforce and Marketo"))
                            .build())))
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

        AccountingExpenseReportsUpdateResponse res = sdk.accounting().expenseReports().update()
                .request(req)
                .call();

        if (res.updateExpenseReportResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [AccountingExpenseReportsUpdateRequest](../../models/operations/AccountingExpenseReportsUpdateRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[AccountingExpenseReportsUpdateResponse](../../models/operations/AccountingExpenseReportsUpdateResponse.md)**

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

Delete Expense Report

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.expenseReportsDelete" method="delete" path="/accounting/expense-reports/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingExpenseReportsDeleteRequest;
import com.apideck.unify.models.operations.AccountingExpenseReportsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingExpenseReportsDeleteRequest req = AccountingExpenseReportsDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AccountingExpenseReportsDeleteResponse res = sdk.accounting().expenseReports().delete()
                .request(req)
                .call();

        if (res.deleteExpenseReportResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [AccountingExpenseReportsDeleteRequest](../../models/operations/AccountingExpenseReportsDeleteRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[AccountingExpenseReportsDeleteResponse](../../models/operations/AccountingExpenseReportsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |