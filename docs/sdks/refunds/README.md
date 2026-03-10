# Accounting.Refunds

## Overview

### Available Operations

* [list](#list) - List Refunds
* [create](#create) - Create Refund
* [get](#get) - Get Refund
* [update](#update) - Update Refund
* [delete](#delete) - Delete Refund

## list

List Refunds

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.refundsAll" method="get" path="/accounting/refunds" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingRefundsAllRequest;
import com.apideck.unify.models.operations.AccountingRefundsAllResponse;
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

        AccountingRefundsAllRequest req = AccountingRefundsAllRequest.builder()
                .serviceId("salesforce")
                .filter(RefundsFilter.builder()
                    .updatedSince(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .customerId("123abc")
                    .build())
                .sort(RefundsSort.builder()
                    .by(RefundsSortBy.UPDATED_AT)
                    .direction(SortDirection.DESC)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();


        sdk.accounting().refunds().list()
                .callAsStream()
                .forEach((AccountingRefundsAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [AccountingRefundsAllRequest](../../models/operations/AccountingRefundsAllRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[AccountingRefundsAllResponse](../../models/operations/AccountingRefundsAllResponse.md)**

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

Create Refund

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.refundsAdd" method="post" path="/accounting/refunds" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingRefundsAddRequest;
import com.apideck.unify.models.operations.AccountingRefundsAddResponse;
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

        AccountingRefundsAddRequest req = AccountingRefundsAddRequest.builder()
                .refund(RefundInput.builder()
                    .number("RF-00001")
                    .customer(JsonNullable.of(null))
                    .companyId("12345")
                    .currency(Currency.USD)
                    .currencyRate(0.69)
                    .taxInclusive(true)
                    .subTotal(250d)
                    .totalAmount(49.99)
                    .totalTax(25d)
                    .refundDate(OffsetDateTime.parse("2021-05-01T12:00:00.000Z"))
                    .status(RefundStatus.PAID)
                    .type(RefundType.REFUND_RECEIPT)
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
                                CustomField.builder()
                                    .id("2389328923893298")
                                    .name("employee_level")
                                    .description("Employee Level")
                                    .value(Value.of("Uses Salesforce and Marketo"))
                                    .build()))
                            .rowVersion("1-12345")
                            .build()))
                    .allocations(List.of(
                        AllocationInput.builder()
                            .id("123456")
                            .amount(49.99)
                            .allocationId("123456")
                            .build()))
                    .taxCode("1234")
                    .discountPercentage(5.5)
                    .discountAmount(25d)
                    .note("Refund for returned items")
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
                    .location(LinkedLocationInput.builder()
                        .id("123456")
                        .displayId("123456")
                        .name("New York Office")
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
                                    .value(Map.ofEntries(
                                        Map.entry("TaxClassificationRef", Map.ofEntries(
                                            Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build()))
                            .build()))
                    .build())
                .serviceId("salesforce")
                .build();

        AccountingRefundsAddResponse res = sdk.accounting().refunds().create()
                .request(req)
                .call();

        if (res.createRefundResponse().isPresent()) {
            System.out.println(res.createRefundResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [AccountingRefundsAddRequest](../../models/operations/AccountingRefundsAddRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[AccountingRefundsAddResponse](../../models/operations/AccountingRefundsAddResponse.md)**

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

Get Refund

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.refundsOne" method="get" path="/accounting/refunds/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingRefundsOneRequest;
import com.apideck.unify.models.operations.AccountingRefundsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingRefundsOneRequest req = AccountingRefundsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        AccountingRefundsOneResponse res = sdk.accounting().refunds().get()
                .request(req)
                .call();

        if (res.getRefundResponse().isPresent()) {
            System.out.println(res.getRefundResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [AccountingRefundsOneRequest](../../models/operations/AccountingRefundsOneRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[AccountingRefundsOneResponse](../../models/operations/AccountingRefundsOneResponse.md)**

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

Update Refund

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.refundsUpdate" method="patch" path="/accounting/refunds/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingRefundsUpdateRequest;
import com.apideck.unify.models.operations.AccountingRefundsUpdateResponse;
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

        AccountingRefundsUpdateRequest req = AccountingRefundsUpdateRequest.builder()
                .id("<id>")
                .refund(RefundInput.builder()
                    .number("RF-00001")
                    .customer(LinkedCustomerInput.builder()
                        .id("12345")
                        .displayName("Windsurf Shop")
                        .email("boring@boring.com")
                        .build())
                    .companyId("12345")
                    .currency(Currency.USD)
                    .currencyRate(0.69)
                    .taxInclusive(true)
                    .subTotal(250d)
                    .totalAmount(49.99)
                    .totalTax(25d)
                    .refundDate(OffsetDateTime.parse("2021-05-01T12:00:00.000Z"))
                    .status(RefundStatus.PAID)
                    .type(RefundType.REFUND_RECEIPT)
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
                                CustomField.builder()
                                    .id("2389328923893298")
                                    .name("employee_level")
                                    .description("Employee Level")
                                    .value(Value.of("Uses Salesforce and Marketo"))
                                    .build()))
                            .rowVersion("1-12345")
                            .build()))
                    .allocations(List.of(
                        AllocationInput.builder()
                            .id("123456")
                            .amount(49.99)
                            .allocationId("123456")
                            .build()))
                    .taxCode("1234")
                    .discountPercentage(5.5)
                    .discountAmount(25d)
                    .note("Refund for returned items")
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
                    .location(LinkedLocationInput.builder()
                        .id("123456")
                        .displayId("123456")
                        .name("New York Office")
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
                                    .value(Map.ofEntries(
                                        Map.entry("TaxClassificationRef", Map.ofEntries(
                                            Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build()))
                            .build()))
                    .build())
                .serviceId("salesforce")
                .build();

        AccountingRefundsUpdateResponse res = sdk.accounting().refunds().update()
                .request(req)
                .call();

        if (res.updateRefundResponse().isPresent()) {
            System.out.println(res.updateRefundResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [AccountingRefundsUpdateRequest](../../models/operations/AccountingRefundsUpdateRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[AccountingRefundsUpdateResponse](../../models/operations/AccountingRefundsUpdateResponse.md)**

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

Delete Refund

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.refundsDelete" method="delete" path="/accounting/refunds/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingRefundsDeleteRequest;
import com.apideck.unify.models.operations.AccountingRefundsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingRefundsDeleteRequest req = AccountingRefundsDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AccountingRefundsDeleteResponse res = sdk.accounting().refunds().delete()
                .request(req)
                .call();

        if (res.deleteRefundResponse().isPresent()) {
            System.out.println(res.deleteRefundResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [AccountingRefundsDeleteRequest](../../models/operations/AccountingRefundsDeleteRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[AccountingRefundsDeleteResponse](../../models/operations/AccountingRefundsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |