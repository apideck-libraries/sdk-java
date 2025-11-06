# InvoiceItems
(*accounting().invoiceItems()*)

## Overview

### Available Operations

* [list](#list) - List Invoice Items
* [create](#create) - Create Invoice Item
* [get](#get) - Get Invoice Item
* [update](#update) - Update Invoice Item
* [delete](#delete) - Delete Invoice Item

## list

List Invoice Items

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.invoiceItemsAll" method="get" path="/accounting/invoice-items" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingInvoiceItemsAllRequest;
import com.apideck.unify.models.operations.AccountingInvoiceItemsAllResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingInvoiceItemsAllRequest req = AccountingInvoiceItemsAllRequest.builder()
                .serviceId("salesforce")
                .filter(InvoiceItemsFilter.builder()
                    .name("Widgets Large")
                    .type(InvoiceItemType.SERVICE)
                    .build())
                .sort(InvoiceItemsSort.builder()
                    .by(InvoiceItemsSortBy.UPDATED_AT)
                    .direction(SortDirection.DESC)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();


        sdk.accounting().invoiceItems().list()
                .callAsStream()
                .forEach((AccountingInvoiceItemsAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AccountingInvoiceItemsAllRequest](../../models/operations/AccountingInvoiceItemsAllRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AccountingInvoiceItemsAllResponse](../../models/operations/AccountingInvoiceItemsAllResponse.md)**

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

Create Invoice Item

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.invoiceItemsAdd" method="post" path="/accounting/invoice-items" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingInvoiceItemsAddRequest;
import com.apideck.unify.models.operations.AccountingInvoiceItemsAddResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        AccountingInvoiceItemsAddRequest req = AccountingInvoiceItemsAddRequest.builder()
                .invoiceItem(InvoiceItemInput.builder()
                    .name("Model Y")
                    .description("Model Y is a fully electric, mid-size SUV, with seating for up to seven, dual motor AWD and unparalleled protection.")
                    .code("120-C")
                    .sold(true)
                    .purchased(true)
                    .tracked(true)
                    .taxable(true)
                    .inventoryDate(LocalDate.parse("2020-10-30"))
                    .type(InvoiceItemTypeType.INVENTORY)
                    .salesDetails(InvoiceItemSalesDetails.builder()
                        .unitPrice(27500.5)
                        .unitOfMeasure("pc.")
                        .taxInclusive(true)
                        .taxRate(LinkedTaxRateInput.builder()
                            .id("123456")
                            .rate(10d)
                            .build())
                        .build())
                    .purchaseDetails(InvoiceItemPurchaseDetails.builder()
                        .unitPrice(27500.5)
                        .unitOfMeasure("pc.")
                        .taxInclusive(true)
                        .taxRate(LinkedTaxRateInput.builder()
                            .id("123456")
                            .rate(10d)
                            .build())
                        .build())
                    .quantity(1d)
                    .unitPrice(27500.5)
                    .assetAccount(LinkedLedgerAccount.builder()
                        .id("123456")
                        .nominalCode("N091")
                        .code("453")
                        .build())
                    .incomeAccount(LinkedLedgerAccount.builder()
                        .id("123456")
                        .nominalCode("N091")
                        .code("453")
                        .build())
                    .expenseAccount(LinkedLedgerAccount.builder()
                        .id("123456")
                        .nominalCode("N091")
                        .code("453")
                        .build())
                    .trackingCategories(JsonNullable.of(null))
                    .active(true)
                    .departmentId("12345")
                    .locationId("12345")
                    .subsidiaryId("12345")
                    .taxScheduleId("123456")
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

        AccountingInvoiceItemsAddResponse res = sdk.accounting().invoiceItems().create()
                .request(req)
                .call();

        if (res.createInvoiceItemResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AccountingInvoiceItemsAddRequest](../../models/operations/AccountingInvoiceItemsAddRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AccountingInvoiceItemsAddResponse](../../models/operations/AccountingInvoiceItemsAddResponse.md)**

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

Get Invoice Item

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.invoiceItemsOne" method="get" path="/accounting/invoice-items/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.InvoiceItemFilter;
import com.apideck.unify.models.components.InvoiceItemFilterInvoiceItemType;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingInvoiceItemsOneRequest;
import com.apideck.unify.models.operations.AccountingInvoiceItemsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingInvoiceItemsOneRequest req = AccountingInvoiceItemsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .filter(InvoiceItemFilter.builder()
                    .type(InvoiceItemFilterInvoiceItemType.SERVICE)
                    .build())
                .build();

        AccountingInvoiceItemsOneResponse res = sdk.accounting().invoiceItems().get()
                .request(req)
                .call();

        if (res.getInvoiceItemResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AccountingInvoiceItemsOneRequest](../../models/operations/AccountingInvoiceItemsOneRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AccountingInvoiceItemsOneResponse](../../models/operations/AccountingInvoiceItemsOneResponse.md)**

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

Update Invoice Item

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.invoiceItemsUpdate" method="patch" path="/accounting/invoice-items/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingInvoiceItemsUpdateRequest;
import com.apideck.unify.models.operations.AccountingInvoiceItemsUpdateResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        AccountingInvoiceItemsUpdateRequest req = AccountingInvoiceItemsUpdateRequest.builder()
                .id("<id>")
                .invoiceItem(InvoiceItemInput.builder()
                    .name("Model Y")
                    .description("Model Y is a fully electric, mid-size SUV, with seating for up to seven, dual motor AWD and unparalleled protection.")
                    .code("120-C")
                    .sold(true)
                    .purchased(true)
                    .tracked(true)
                    .taxable(true)
                    .inventoryDate(LocalDate.parse("2020-10-30"))
                    .type(InvoiceItemTypeType.INVENTORY)
                    .salesDetails(InvoiceItemSalesDetails.builder()
                        .unitPrice(27500.5)
                        .unitOfMeasure("pc.")
                        .taxInclusive(true)
                        .taxRate(LinkedTaxRateInput.builder()
                            .id("123456")
                            .rate(10d)
                            .build())
                        .build())
                    .purchaseDetails(InvoiceItemPurchaseDetails.builder()
                        .unitPrice(27500.5)
                        .unitOfMeasure("pc.")
                        .taxInclusive(true)
                        .taxRate(LinkedTaxRateInput.builder()
                            .id("123456")
                            .rate(10d)
                            .build())
                        .build())
                    .quantity(1d)
                    .unitPrice(27500.5)
                    .assetAccount(LinkedLedgerAccount.builder()
                        .id("123456")
                        .nominalCode("N091")
                        .code("453")
                        .build())
                    .incomeAccount(JsonNullable.of(null))
                    .expenseAccount(LinkedLedgerAccount.builder()
                        .id("123456")
                        .nominalCode("N091")
                        .code("453")
                        .build())
                    .trackingCategories(List.of(
                        LinkedTrackingCategory.builder()
                            .id("123456")
                            .name("New York")
                            .build(),
                        LinkedTrackingCategory.builder()
                            .id("123456")
                            .name("New York")
                            .build()))
                    .active(true)
                    .departmentId("12345")
                    .locationId("12345")
                    .subsidiaryId("12345")
                    .taxScheduleId("123456")
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
                            .build(),
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

        AccountingInvoiceItemsUpdateResponse res = sdk.accounting().invoiceItems().update()
                .request(req)
                .call();

        if (res.updateInvoiceItemsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [AccountingInvoiceItemsUpdateRequest](../../models/operations/AccountingInvoiceItemsUpdateRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[AccountingInvoiceItemsUpdateResponse](../../models/operations/AccountingInvoiceItemsUpdateResponse.md)**

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

Delete Invoice Item

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.invoiceItemsDelete" method="delete" path="/accounting/invoice-items/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingInvoiceItemsDeleteRequest;
import com.apideck.unify.models.operations.AccountingInvoiceItemsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingInvoiceItemsDeleteRequest req = AccountingInvoiceItemsDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AccountingInvoiceItemsDeleteResponse res = sdk.accounting().invoiceItems().delete()
                .request(req)
                .call();

        if (res.deleteTaxRateResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [AccountingInvoiceItemsDeleteRequest](../../models/operations/AccountingInvoiceItemsDeleteRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[AccountingInvoiceItemsDeleteResponse](../../models/operations/AccountingInvoiceItemsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |