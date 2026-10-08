# Accounting.SalesOrders

## Overview

### Available Operations

* [list](#list) - List Sales Orders
* [create](#create) - Create Sales Order
* [get](#get) - Get Sales Order
* [update](#update) - Update Sales Order
* [delete](#delete) - Delete Sales Order

## list

List Sales Orders

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.salesOrdersAll" method="get" path="/accounting/sales-orders" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.SalesOrdersFilter;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingSalesOrdersAllRequest;
import com.apideck.unify.models.operations.AccountingSalesOrdersAllResponse;
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

        AccountingSalesOrdersAllRequest req = AccountingSalesOrdersAllRequest.builder()
                .serviceId("salesforce")
                .companyId("12345")
                .filter(SalesOrdersFilter.builder()
                    .updatedSince(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .createdSince(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .number("SO000123")
                    .customerId("123abc")
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .build();


        sdk.accounting().salesOrders().list()
                .callAsStream()
                .forEach((AccountingSalesOrdersAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AccountingSalesOrdersAllRequest](../../models/operations/AccountingSalesOrdersAllRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AccountingSalesOrdersAllResponse](../../models/operations/AccountingSalesOrdersAllResponse.md)**

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

Create Sales Order

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.salesOrdersAdd" method="post" path="/accounting/sales-orders" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingSalesOrdersAddRequest;
import com.apideck.unify.models.operations.AccountingSalesOrdersAddResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingSalesOrdersAddRequest req = AccountingSalesOrdersAddRequest.builder()
                .salesOrder(SalesOrderInput.builder()
                    .number("SO000123")
                    .customer(LinkedCustomerInput.builder()
                        .id("12345")
                        .displayName("Windsurf Shop")
                        .email("boring@boring.com")
                        .build())
                    .quoteId("123456")
                    .companyId("12345")
                    .departmentId("12345")
                    .locationId("12345")
                    .projectId("12345")
                    .subsidiaryId("12345")
                    .orderDate(LocalDate.parse("2020-09-30"))
                    .deliveryDate(LocalDate.parse("2020-10-15"))
                    .orderType("SO")
                    .terms("Net 30")
                    .termsId("12345")
                    .poNumber("90000117")
                    .reference("INV-2024-001")
                    .status(SalesOrderStatus.OPEN)
                    .currency(Currency.USD)
                    .currencyRate(0.69)
                    .taxInclusive(true)
                    .subTotal(27500d)
                    .totalTax(2500d)
                    .taxCode("1234")
                    .discountPercentage(5.5)
                    .discountAmount(25d)
                    .total(30000d)
                    .shippingMethod("FEDEX")
                    .paymentMethod("cash")
                    .customerMemo("Thank you for your order!")
                    .notes("Ship with next consignment")
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
                    .trackingCategories(List.of(
                        LinkedTrackingCategory.builder()
                            .id("123456")
                            .code("100")
                            .name("New York")
                            .parentId("123456")
                            .parentName("New York")
                            .build()))
                    .templateId("123456")
                    .sourceDocumentUrl("https://www.ordersolution.com/order/123456")
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

        AccountingSalesOrdersAddResponse res = sdk.accounting().salesOrders().create()
                .request(req)
                .call();

        if (res.createSalesOrderResponse().isPresent()) {
            System.out.println(res.createSalesOrderResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AccountingSalesOrdersAddRequest](../../models/operations/AccountingSalesOrdersAddRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AccountingSalesOrdersAddResponse](../../models/operations/AccountingSalesOrdersAddResponse.md)**

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

Get Sales Order

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.salesOrdersOne" method="get" path="/accounting/sales-orders/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingSalesOrdersOneRequest;
import com.apideck.unify.models.operations.AccountingSalesOrdersOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingSalesOrdersOneRequest req = AccountingSalesOrdersOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .companyId("12345")
                .build();

        AccountingSalesOrdersOneResponse res = sdk.accounting().salesOrders().get()
                .request(req)
                .call();

        if (res.getSalesOrderResponse().isPresent()) {
            System.out.println(res.getSalesOrderResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AccountingSalesOrdersOneRequest](../../models/operations/AccountingSalesOrdersOneRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AccountingSalesOrdersOneResponse](../../models/operations/AccountingSalesOrdersOneResponse.md)**

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

Update Sales Order

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.salesOrdersUpdate" method="patch" path="/accounting/sales-orders/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingSalesOrdersUpdateRequest;
import com.apideck.unify.models.operations.AccountingSalesOrdersUpdateResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingSalesOrdersUpdateRequest req = AccountingSalesOrdersUpdateRequest.builder()
                .id("<id>")
                .salesOrder(SalesOrderInput.builder()
                    .number("SO000123")
                    .customer(LinkedCustomerInput.builder()
                        .id("12345")
                        .displayName("Windsurf Shop")
                        .email("boring@boring.com")
                        .build())
                    .quoteId("123456")
                    .companyId("12345")
                    .departmentId("12345")
                    .locationId("12345")
                    .projectId("12345")
                    .subsidiaryId("12345")
                    .orderDate(LocalDate.parse("2020-09-30"))
                    .deliveryDate(LocalDate.parse("2020-10-15"))
                    .orderType("SO")
                    .terms("Net 30")
                    .termsId("12345")
                    .poNumber("90000117")
                    .reference("INV-2024-001")
                    .status(SalesOrderStatus.OPEN)
                    .currency(Currency.USD)
                    .currencyRate(0.69)
                    .taxInclusive(true)
                    .subTotal(27500d)
                    .totalTax(2500d)
                    .taxCode("1234")
                    .discountPercentage(5.5)
                    .discountAmount(25d)
                    .total(30000d)
                    .shippingMethod("FEDEX")
                    .paymentMethod("cash")
                    .customerMemo("Thank you for your order!")
                    .notes("Ship with next consignment")
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
                    .trackingCategories(List.of(
                        LinkedTrackingCategory.builder()
                            .id("123456")
                            .code("100")
                            .name("New York")
                            .parentId("123456")
                            .parentName("New York")
                            .build()))
                    .templateId("123456")
                    .sourceDocumentUrl("https://www.ordersolution.com/order/123456")
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

        AccountingSalesOrdersUpdateResponse res = sdk.accounting().salesOrders().update()
                .request(req)
                .call();

        if (res.updateSalesOrderResponse().isPresent()) {
            System.out.println(res.updateSalesOrderResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AccountingSalesOrdersUpdateRequest](../../models/operations/AccountingSalesOrdersUpdateRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[AccountingSalesOrdersUpdateResponse](../../models/operations/AccountingSalesOrdersUpdateResponse.md)**

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

Delete Sales Order

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.salesOrdersDelete" method="delete" path="/accounting/sales-orders/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingSalesOrdersDeleteRequest;
import com.apideck.unify.models.operations.AccountingSalesOrdersDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingSalesOrdersDeleteRequest req = AccountingSalesOrdersDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .companyId("12345")
                .build();

        AccountingSalesOrdersDeleteResponse res = sdk.accounting().salesOrders().delete()
                .request(req)
                .call();

        if (res.deleteSalesOrderResponse().isPresent()) {
            System.out.println(res.deleteSalesOrderResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AccountingSalesOrdersDeleteRequest](../../models/operations/AccountingSalesOrdersDeleteRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[AccountingSalesOrdersDeleteResponse](../../models/operations/AccountingSalesOrdersDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |