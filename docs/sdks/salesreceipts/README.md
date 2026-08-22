# Accounting.SalesReceipts

## Overview

### Available Operations

* [list](#list) - List Sales Receipts
* [create](#create) - Create Sales Receipt
* [get](#get) - Get Sales Receipt
* [update](#update) - Update Sales Receipt
* [delete](#delete) - Delete Sales Receipt

## list

List Sales Receipts

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.salesReceiptsAll" method="get" path="/accounting/sales-receipts" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingSalesReceiptsAllRequest;
import com.apideck.unify.models.operations.AccountingSalesReceiptsAllResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingSalesReceiptsAllRequest req = AccountingSalesReceiptsAllRequest.builder()
                .serviceId("salesforce")
                .companyId("12345")
                .filter(SalesReceiptsFilter.builder()
                    .updatedSince(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .customerId("123abc")
                    .build())
                .sort(SalesReceiptsSort.builder()
                    .by(SalesReceiptsSortBy.UPDATED_AT)
                    .direction(SortDirection.DESC)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();


        sdk.accounting().salesReceipts().list()
                .callAsStream()
                .forEach((AccountingSalesReceiptsAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [AccountingSalesReceiptsAllRequest](../../models/operations/AccountingSalesReceiptsAllRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[AccountingSalesReceiptsAllResponse](../../models/operations/AccountingSalesReceiptsAllResponse.md)**

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

Create Sales Receipt

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.salesReceiptsAdd" method="post" path="/accounting/sales-receipts" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingSalesReceiptsAddRequest;
import com.apideck.unify.models.operations.AccountingSalesReceiptsAddResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingSalesReceiptsAddRequest req = AccountingSalesReceiptsAddRequest.builder()
                .salesReceipt(SalesReceiptInput.builder()
                    .totalAmount(49.99)
                    .number("SR-00001")
                    .customer(LinkedCustomerInput.builder()
                        .id("12345")
                        .displayName("Windsurf Shop")
                        .email("boring@boring.com")
                        .build())
                    .currency(Currency.USD)
                    .currencyRate(0.69)
                    .taxInclusive(true)
                    .subTotal(250d)
                    .totalTax(25d)
                    .transactionDate(OffsetDateTime.parse("2021-05-01T12:00:00.000Z"))
                    .paymentMethod("cash")
                    .paymentMethodReference("123456")
                    .paymentMethodId("12345")
                    .account(LinkedLedgerAccount.builder()
                        .id("123456")
                        .name("Bank account")
                        .nominalCode("N091")
                        .code("453")
                        .parentId("123456")
                        .displayId("123456")
                        .build())
                    .lineItems(List.of(
                        InvoiceLineItemInput.builder()
                            .id("12345")
                            .rowId("12345")
                            .code("120-C")
                            .lineNumber(1L)
                            .description("Model Y is a fully electric, mid-size SUV, with seating for up to seven, dual motor AWD and unparalleled protection.")
                            .type(InvoiceLineItemType.SALES_ITEM)
                            .taxAmount(27500d)
                            .totalAmount(27500d)
                            .quantity(1d)
                            .unitPrice(27500.5)
                            .unitOfMeasure("pc.")
                            .discountPercentage(0.01)
                            .discountAmount(19.99)
                            .serviceDate(LocalDate.parse("2024-01-15"))
                            .categoryId("12345")
                            .locationId("12345")
                            .departmentId("12345")
                            .subsidiaryId("12345")
                            .shippingId("12345")
                            .memo("Some memo")
                            .prepaid(true)
                            .item(LinkedInvoiceItem.builder()
                                .id("12344")
                                .code("120-C")
                                .name("Model Y")
                                .build())
                            .taxApplicableOn("Domestic_Purchase_of_Goods_and_Services")
                            .taxRecoverability("Fully_Recoverable")
                            .taxMethod("Due_to_Supplier")
                            .worktags(List.of(
                                LinkedWorktag.builder()
                                    .id("123456")
                                    .value("New York")
                                    .build()))
                            .taxRate(LinkedTaxRateInput.builder()
                                .id("123456")
                                .code("N-T")
                                .rate(10d)
                                .build())
                            .trackingCategories(List.of(
                                LinkedTrackingCategory.builder()
                                    .id("123456")
                                    .code("100")
                                    .name("New York")
                                    .parentId("123456")
                                    .parentName("New York")
                                    .build()))
                            .ledgerAccount(LinkedLedgerAccount.builder()
                                .id("123456")
                                .name("Bank account")
                                .nominalCode("N091")
                                .code("453")
                                .parentId("123456")
                                .displayId("123456")
                                .build())
                            .customFields(List.of(
                                CustomField.of(CustomField1.builder()
                                    .id("2389328923893298")
                                    .name("employee_level")
                                    .refName("Marketing")
                                    .description("Employee Level")
                                    .value(CustomField1Value.of("Uses Salesforce and Marketo"))
                                    .build())))
                            .rowVersion("1-12345")
                            .build()))
                    .taxCode("1234")
                    .discountPercentage(5.5)
                    .discountAmount(25d)
                    .note("Thank you for your purchase")
                    .customerMemo("Thank you for your business and have a great day!")
                    .reference("REF-123456")
                    .billingAddress(Address.builder()
                        .id("123")
                        .type(Type.PRIMARY)
                        .string("25 Spring Street, Blackburn, VIC 3130")
                        .name("HQ US")
                        .line1("Main street")
                        .line2("apt #")
                        .line3("Suite #")
                        .line4("delivery instructions")
                        .line5("Attention: Finance Dept")
                        .streetNumber("25")
                        .city("San Francisco")
                        .state("CA")
                        .postalCode("94104")
                        .country("US")
                        .latitude("40.759211")
                        .longitude("-73.984638")
                        .county("Santa Clara")
                        .contactName("Elon Musk")
                        .salutation("Mr")
                        .phoneNumber("111-111-1111")
                        .fax("122-111-1111")
                        .email("elon@musk.com")
                        .website("https://elonmusk.com")
                        .notes("Address notes or delivery instructions.")
                        .rowVersion("1-12345")
                        .build())
                    .shippingAddress(Address.builder()
                        .id("123")
                        .type(Type.PRIMARY)
                        .string("25 Spring Street, Blackburn, VIC 3130")
                        .name("HQ US")
                        .line1("Main street")
                        .line2("apt #")
                        .line3("Suite #")
                        .line4("delivery instructions")
                        .line5("Attention: Finance Dept")
                        .streetNumber("25")
                        .city("San Francisco")
                        .state("CA")
                        .postalCode("94104")
                        .country("US")
                        .latitude("40.759211")
                        .longitude("-73.984638")
                        .county("Santa Clara")
                        .contactName("Elon Musk")
                        .salutation("Mr")
                        .phoneNumber("111-111-1111")
                        .fax("122-111-1111")
                        .email("elon@musk.com")
                        .website("https://elonmusk.com")
                        .notes("Address notes or delivery instructions.")
                        .rowVersion("1-12345")
                        .build())
                    .department(LinkedDepartmentInput.builder()
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
                    .customFields(List.of(
                        CustomField.of(CustomField1.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .refName("Marketing")
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
                .companyId("12345")
                .build();

        AccountingSalesReceiptsAddResponse res = sdk.accounting().salesReceipts().create()
                .request(req)
                .call();

        if (res.createSalesReceiptResponse().isPresent()) {
            System.out.println(res.createSalesReceiptResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [AccountingSalesReceiptsAddRequest](../../models/operations/AccountingSalesReceiptsAddRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[AccountingSalesReceiptsAddResponse](../../models/operations/AccountingSalesReceiptsAddResponse.md)**

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

Get Sales Receipt

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.salesReceiptsOne" method="get" path="/accounting/sales-receipts/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingSalesReceiptsOneRequest;
import com.apideck.unify.models.operations.AccountingSalesReceiptsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingSalesReceiptsOneRequest req = AccountingSalesReceiptsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .companyId("12345")
                .fields("id,updated_at")
                .build();

        AccountingSalesReceiptsOneResponse res = sdk.accounting().salesReceipts().get()
                .request(req)
                .call();

        if (res.getSalesReceiptResponse().isPresent()) {
            System.out.println(res.getSalesReceiptResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [AccountingSalesReceiptsOneRequest](../../models/operations/AccountingSalesReceiptsOneRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[AccountingSalesReceiptsOneResponse](../../models/operations/AccountingSalesReceiptsOneResponse.md)**

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

Update Sales Receipt

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.salesReceiptsUpdate" method="patch" path="/accounting/sales-receipts/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingSalesReceiptsUpdateRequest;
import com.apideck.unify.models.operations.AccountingSalesReceiptsUpdateResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingSalesReceiptsUpdateRequest req = AccountingSalesReceiptsUpdateRequest.builder()
                .id("<id>")
                .salesReceipt(SalesReceiptInput.builder()
                    .totalAmount(49.99)
                    .number("SR-00001")
                    .customer(LinkedCustomerInput.builder()
                        .id("12345")
                        .displayName("Windsurf Shop")
                        .email("boring@boring.com")
                        .build())
                    .currency(Currency.USD)
                    .currencyRate(0.69)
                    .taxInclusive(true)
                    .subTotal(250d)
                    .totalTax(25d)
                    .transactionDate(OffsetDateTime.parse("2021-05-01T12:00:00.000Z"))
                    .paymentMethod("cash")
                    .paymentMethodReference("123456")
                    .paymentMethodId("12345")
                    .account(LinkedLedgerAccount.builder()
                        .id("123456")
                        .name("Bank account")
                        .nominalCode("N091")
                        .code("453")
                        .parentId("123456")
                        .displayId("123456")
                        .build())
                    .lineItems(List.of(
                        InvoiceLineItemInput.builder()
                            .id("12345")
                            .rowId("12345")
                            .code("120-C")
                            .lineNumber(1L)
                            .description("Model Y is a fully electric, mid-size SUV, with seating for up to seven, dual motor AWD and unparalleled protection.")
                            .type(InvoiceLineItemType.SALES_ITEM)
                            .taxAmount(27500d)
                            .totalAmount(27500d)
                            .quantity(1d)
                            .unitPrice(27500.5)
                            .unitOfMeasure("pc.")
                            .discountPercentage(0.01)
                            .discountAmount(19.99)
                            .serviceDate(LocalDate.parse("2024-01-15"))
                            .categoryId("12345")
                            .locationId("12345")
                            .departmentId("12345")
                            .subsidiaryId("12345")
                            .shippingId("12345")
                            .memo("Some memo")
                            .prepaid(true)
                            .item(LinkedInvoiceItem.builder()
                                .id("12344")
                                .code("120-C")
                                .name("Model Y")
                                .build())
                            .taxApplicableOn("Domestic_Purchase_of_Goods_and_Services")
                            .taxRecoverability("Fully_Recoverable")
                            .taxMethod("Due_to_Supplier")
                            .worktags(List.of(
                                LinkedWorktag.builder()
                                    .id("123456")
                                    .value("New York")
                                    .build()))
                            .taxRate(LinkedTaxRateInput.builder()
                                .id("123456")
                                .code("N-T")
                                .rate(10d)
                                .build())
                            .trackingCategories(List.of(
                                LinkedTrackingCategory.builder()
                                    .id("123456")
                                    .code("100")
                                    .name("New York")
                                    .parentId("123456")
                                    .parentName("New York")
                                    .build()))
                            .ledgerAccount(LinkedLedgerAccount.builder()
                                .id("123456")
                                .name("Bank account")
                                .nominalCode("N091")
                                .code("453")
                                .parentId("123456")
                                .displayId("123456")
                                .build())
                            .customFields(List.of(
                                CustomField.of(CustomField1.builder()
                                    .id("2389328923893298")
                                    .name("employee_level")
                                    .refName("Marketing")
                                    .description("Employee Level")
                                    .value(CustomField1Value.of("Uses Salesforce and Marketo"))
                                    .build())))
                            .rowVersion("1-12345")
                            .build()))
                    .taxCode("1234")
                    .discountPercentage(5.5)
                    .discountAmount(25d)
                    .note("Thank you for your purchase")
                    .customerMemo("Thank you for your business and have a great day!")
                    .reference("REF-123456")
                    .billingAddress(Address.builder()
                        .id("123")
                        .type(Type.PRIMARY)
                        .string("25 Spring Street, Blackburn, VIC 3130")
                        .name("HQ US")
                        .line1("Main street")
                        .line2("apt #")
                        .line3("Suite #")
                        .line4("delivery instructions")
                        .line5("Attention: Finance Dept")
                        .streetNumber("25")
                        .city("San Francisco")
                        .state("CA")
                        .postalCode("94104")
                        .country("US")
                        .latitude("40.759211")
                        .longitude("-73.984638")
                        .county("Santa Clara")
                        .contactName("Elon Musk")
                        .salutation("Mr")
                        .phoneNumber("111-111-1111")
                        .fax("122-111-1111")
                        .email("elon@musk.com")
                        .website("https://elonmusk.com")
                        .notes("Address notes or delivery instructions.")
                        .rowVersion("1-12345")
                        .build())
                    .shippingAddress(Address.builder()
                        .id("123")
                        .type(Type.PRIMARY)
                        .string("25 Spring Street, Blackburn, VIC 3130")
                        .name("HQ US")
                        .line1("Main street")
                        .line2("apt #")
                        .line3("Suite #")
                        .line4("delivery instructions")
                        .line5("Attention: Finance Dept")
                        .streetNumber("25")
                        .city("San Francisco")
                        .state("CA")
                        .postalCode("94104")
                        .country("US")
                        .latitude("40.759211")
                        .longitude("-73.984638")
                        .county("Santa Clara")
                        .contactName("Elon Musk")
                        .salutation("Mr")
                        .phoneNumber("111-111-1111")
                        .fax("122-111-1111")
                        .email("elon@musk.com")
                        .website("https://elonmusk.com")
                        .notes("Address notes or delivery instructions.")
                        .rowVersion("1-12345")
                        .build())
                    .department(LinkedDepartmentInput.builder()
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
                    .customFields(List.of(
                        CustomField.of(CustomField1.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .refName("Marketing")
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
                .companyId("12345")
                .build();

        AccountingSalesReceiptsUpdateResponse res = sdk.accounting().salesReceipts().update()
                .request(req)
                .call();

        if (res.updateSalesReceiptResponse().isPresent()) {
            System.out.println(res.updateSalesReceiptResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [AccountingSalesReceiptsUpdateRequest](../../models/operations/AccountingSalesReceiptsUpdateRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[AccountingSalesReceiptsUpdateResponse](../../models/operations/AccountingSalesReceiptsUpdateResponse.md)**

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

Delete Sales Receipt

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.salesReceiptsDelete" method="delete" path="/accounting/sales-receipts/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingSalesReceiptsDeleteRequest;
import com.apideck.unify.models.operations.AccountingSalesReceiptsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingSalesReceiptsDeleteRequest req = AccountingSalesReceiptsDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .companyId("12345")
                .build();

        AccountingSalesReceiptsDeleteResponse res = sdk.accounting().salesReceipts().delete()
                .request(req)
                .call();

        if (res.deleteSalesReceiptResponse().isPresent()) {
            System.out.println(res.deleteSalesReceiptResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [AccountingSalesReceiptsDeleteRequest](../../models/operations/AccountingSalesReceiptsDeleteRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[AccountingSalesReceiptsDeleteResponse](../../models/operations/AccountingSalesReceiptsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |