# Invoices
(*accounting().invoices()*)

## Overview

### Available Operations

* [list](#list) - List Invoices
* [create](#create) - Create Invoice
* [get](#get) - Get Invoice
* [update](#update) - Update Invoice
* [delete](#delete) - Delete Invoice

## list

List Invoices

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingInvoicesAllRequest;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingInvoicesAllRequest req = AccountingInvoicesAllRequest.builder()
                .serviceId("salesforce")
                .filter(InvoicesFilter.builder()
                    .updatedSince(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .createdSince(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .number("OIT00546")
                    .build())
                .sort(InvoicesSort.builder()
                    .by(InvoicesSortBy.UPDATED_AT)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();

        sdk.accounting().invoices().list()
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
| `request`                                                                               | [AccountingInvoicesAllRequest](../../models/operations/AccountingInvoicesAllRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AccountingInvoicesAllResponse](../../models/operations/AccountingInvoicesAllResponse.md)**

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

Create Invoice

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingInvoicesAddRequest;
import com.apideck.unify.models.operations.AccountingInvoicesAddResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingInvoicesAddRequest req = AccountingInvoicesAddRequest.builder()
                .invoice(InvoiceInput.builder()
                    .type(InvoiceType.SERVICE)
                    .number("OIT00546")
                    .customer(LinkedCustomerInput.builder()
                        .id("12345")
                        .displayName("Windsurf Shop")
                        .email("boring@boring.com")
                        .build())
                    .companyId("12345")
                    .invoiceDate(LocalDate.parse("2020-09-30"))
                    .dueDate(LocalDate.parse("2020-09-30"))
                    .terms("Net 30 days")
                    .poNumber("90000117")
                    .reference("123456")
                    .status(InvoiceStatus.DRAFT)
                    .invoiceSent(true)
                    .currency(Currency.USD)
                    .currencyRate(0.69)
                    .taxInclusive(true)
                    .subTotal(27500)
                    .totalTax(2500)
                    .taxCode("1234")
                    .discountPercentage(5.5)
                    .discountAmount(25)
                    .total(27500)
                    .balance(27500)
                    .deposit(0)
                    .customerMemo("Thank you for your business and have a great day!")
                    .trackingCategories(List.of(
                        LinkedTrackingCategory.builder()
                            .id("123456")
                            .name("New York")
                            .build()))
                    .lineItems(List.of(
                        InvoiceLineItemInput.builder()
                            .id("12345")
                            .rowId("12345")
                            .code("120-C")
                            .lineNumber(1L)
                            .description("Model Y is a fully electric, mid-size SUV, with seating for up to seven, dual motor AWD and unparalleled protection.")
                            .type(InvoiceLineItemType.SALES_ITEM)
                            .taxAmount(27500)
                            .totalAmount(27500)
                            .quantity(1)
                            .unitPrice(27500.5)
                            .unitOfMeasure("pc.")
                            .discountPercentage(0.01)
                            .discountAmount(19.99)
                            .locationId("12345")
                            .departmentId("12345")
                            .item(LinkedInvoiceItem.builder()
                                .id("12344")
                                .code("120-C")
                                .name("Model Y")
                                .build())
                            .taxRate(LinkedTaxRateInput.builder()
                                .id("123456")
                                .rate(10)
                                .build())
                            .trackingCategories(List.of(
                                LinkedTrackingCategory.builder()
                                    .id("123456")
                                    .name("New York")
                                    .build()))
                            .ledgerAccount(JsonNullable.of(null))
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
                    .templateId("123456")
                    .sourceDocumentUrl("https://www.invoicesolution.com/invoice/123456")
                    .paymentAllocations(List.of(
                        PaymentAllocations.builder()
                            .id("123456")
                            .allocatedAmount(1000)
                            .date(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                            .build()))
                    .paymentMethod("cash")
                    .channel("email")
                    .language("EN")
                    .accountingByRow(false)
                    .bankAccount(BankAccount.builder()
                        .bankName("Monzo")
                        .accountNumber("123465")
                        .accountName("SPACEX LLC")
                        .accountType(AccountType.CREDIT_CARD)
                        .iban("CH2989144532982975332")
                        .bic("AUDSCHGGXXX")
                        .routingNumber("012345678")
                        .bsbNumber("062-001")
                        .branchIdentifier("001")
                        .bankCode("BNH")
                        .currency(Currency.USD)
                        .build())
                    .ledgerAccount(LinkedLedgerAccountInput.builder()
                        .id("123456")
                        .nominalCode("N091")
                        .code("453")
                        .build())
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

        AccountingInvoicesAddResponse res = sdk.accounting().invoices().create()
                .request(req)
                .call();

        if (res.createInvoiceResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AccountingInvoicesAddRequest](../../models/operations/AccountingInvoicesAddRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AccountingInvoicesAddResponse](../../models/operations/AccountingInvoicesAddResponse.md)**

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

Get Invoice

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingInvoicesOneRequest;
import com.apideck.unify.models.operations.AccountingInvoicesOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingInvoicesOneRequest req = AccountingInvoicesOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        AccountingInvoicesOneResponse res = sdk.accounting().invoices().get()
                .request(req)
                .call();

        if (res.getInvoiceResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AccountingInvoicesOneRequest](../../models/operations/AccountingInvoicesOneRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AccountingInvoicesOneResponse](../../models/operations/AccountingInvoicesOneResponse.md)**

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

Update Invoice

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingInvoicesUpdateRequest;
import com.apideck.unify.models.operations.AccountingInvoicesUpdateResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        AccountingInvoicesUpdateRequest req = AccountingInvoicesUpdateRequest.builder()
                .id("<id>")
                .invoice(InvoiceInput.builder()
                    .type(InvoiceType.SERVICE)
                    .number("OIT00546")
                    .customer(LinkedCustomerInput.builder()
                        .id("12345")
                        .displayName("Windsurf Shop")
                        .email("boring@boring.com")
                        .build())
                    .companyId("12345")
                    .invoiceDate(LocalDate.parse("2020-09-30"))
                    .dueDate(LocalDate.parse("2020-09-30"))
                    .terms("Net 30 days")
                    .poNumber("90000117")
                    .reference("123456")
                    .status(InvoiceStatus.DRAFT)
                    .invoiceSent(true)
                    .currency(Currency.USD)
                    .currencyRate(0.69)
                    .taxInclusive(true)
                    .subTotal(27500)
                    .totalTax(2500)
                    .taxCode("1234")
                    .discountPercentage(5.5)
                    .discountAmount(25)
                    .total(27500)
                    .balance(27500)
                    .deposit(0)
                    .customerMemo("Thank you for your business and have a great day!")
                    .trackingCategories(List.of(
                        LinkedTrackingCategory.builder()
                            .id("123456")
                            .name("New York")
                            .build()))
                    .lineItems(List.of(
                        InvoiceLineItemInput.builder()
                            .id("12345")
                            .rowId("12345")
                            .code("120-C")
                            .lineNumber(1L)
                            .description("Model Y is a fully electric, mid-size SUV, with seating for up to seven, dual motor AWD and unparalleled protection.")
                            .type(InvoiceLineItemType.SALES_ITEM)
                            .taxAmount(27500)
                            .totalAmount(27500)
                            .quantity(1)
                            .unitPrice(27500.5)
                            .unitOfMeasure("pc.")
                            .discountPercentage(0.01)
                            .discountAmount(19.99)
                            .locationId("12345")
                            .departmentId("12345")
                            .item(LinkedInvoiceItem.builder()
                                .id("12344")
                                .code("120-C")
                                .name("Model Y")
                                .build())
                            .taxRate(LinkedTaxRateInput.builder()
                                .id("123456")
                                .rate(10)
                                .build())
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
                            .ledgerAccount(LinkedLedgerAccountInput.builder()
                                .id("123456")
                                .nominalCode("N091")
                                .code("453")
                                .build())
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
                                    .value(Value.of6(List.of(
                                        Six.builder()
                                            .build())))
                                    .build(),
                                CustomField.builder()
                                    .id("2389328923893298")
                                    .name("employee_level")
                                    .description("Employee Level")
                                    .value(Value.of("Uses Salesforce and Marketo"))
                                    .build()))
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
                    .templateId("123456")
                    .sourceDocumentUrl("https://www.invoicesolution.com/invoice/123456")
                    .paymentAllocations(List.of(
                        PaymentAllocations.builder()
                            .id("123456")
                            .allocatedAmount(1000)
                            .date(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                            .build(),
                        PaymentAllocations.builder()
                            .id("123456")
                            .allocatedAmount(1000)
                            .date(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                            .build()))
                    .paymentMethod("cash")
                    .channel("email")
                    .language("EN")
                    .accountingByRow(false)
                    .bankAccount(BankAccount.builder()
                        .bankName("Monzo")
                        .accountNumber("123465")
                        .accountName("SPACEX LLC")
                        .accountType(AccountType.CREDIT_CARD)
                        .iban("CH2989144532982975332")
                        .bic("AUDSCHGGXXX")
                        .routingNumber("012345678")
                        .bsbNumber("062-001")
                        .branchIdentifier("001")
                        .bankCode("BNH")
                        .currency(Currency.USD)
                        .build())
                    .ledgerAccount(LinkedLedgerAccountInput.builder()
                        .id("123456")
                        .nominalCode("N091")
                        .code("453")
                        .build())
                    .customFields(List.of(
                        CustomField.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(Value.of(10))
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
                                    .build(),
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
                            .build(),
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
                                    .build(),
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
                                    .build(),
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

        AccountingInvoicesUpdateResponse res = sdk.accounting().invoices().update()
                .request(req)
                .call();

        if (res.updateInvoiceResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AccountingInvoicesUpdateRequest](../../models/operations/AccountingInvoicesUpdateRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AccountingInvoicesUpdateResponse](../../models/operations/AccountingInvoicesUpdateResponse.md)**

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

Delete Invoice

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingInvoicesDeleteRequest;
import com.apideck.unify.models.operations.AccountingInvoicesDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingInvoicesDeleteRequest req = AccountingInvoicesDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AccountingInvoicesDeleteResponse res = sdk.accounting().invoices().delete()
                .request(req)
                .call();

        if (res.deleteInvoiceResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AccountingInvoicesDeleteRequest](../../models/operations/AccountingInvoicesDeleteRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AccountingInvoicesDeleteResponse](../../models/operations/AccountingInvoicesDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |