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
import com.apideck.unify.models.components.InvoicesFilter;
import com.apideck.unify.models.components.InvoicesSort;
import com.apideck.unify.models.components.InvoicesSortBy;
import com.apideck.unify.models.components.SortDirection;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.AccountingInvoicesAllRequest;
import com.apideck.unify.models.operations.AccountingInvoicesAllResponse;
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
                    .direction(SortDirection.DESC)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();

        AccountingInvoicesAllResponse res = sdk.accounting().invoices().list()
                .request(req)
                .call();

        if (res.getInvoicesResponse().isPresent()) {
            // handle response
        }
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
import com.apideck.unify.models.components.AccountType;
import com.apideck.unify.models.components.Address;
import com.apideck.unify.models.components.BankAccount;
import com.apideck.unify.models.components.Currency;
import com.apideck.unify.models.components.CustomField;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.Four;
import com.apideck.unify.models.components.InvoiceInput;
import com.apideck.unify.models.components.InvoiceLineItemInput;
import com.apideck.unify.models.components.InvoiceLineItemType;
import com.apideck.unify.models.components.InvoiceStatus;
import com.apideck.unify.models.components.InvoiceType;
import com.apideck.unify.models.components.LinkedCustomerInput;
import com.apideck.unify.models.components.LinkedInvoiceItem;
import com.apideck.unify.models.components.LinkedLedgerAccountInput;
import com.apideck.unify.models.components.LinkedTaxRateInput;
import com.apideck.unify.models.components.LinkedTrackingCategory;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.Type;
import com.apideck.unify.models.components.Value;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.AccountingInvoicesAddRequest;
import com.apideck.unify.models.operations.AccountingInvoicesAddResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

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
                    .currencyRate(0.69d)
                    .taxInclusive(true)
                    .subTotal(27500d)
                    .totalTax(2500d)
                    .taxCode("1234")
                    .discountPercentage(5.5d)
                    .discountAmount(25d)
                    .total(27500d)
                    .balance(27500d)
                    .deposit(0d)
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
                            .taxAmount(27500d)
                            .totalAmount(27500d)
                            .quantity(1d)
                            .unitPrice(27500.5d)
                            .unitOfMeasure("pc.")
                            .discountPercentage(0.01d)
                            .discountAmount(19.99d)
                            .locationId("1234")
                            .departmentId("1234")
                            .item(LinkedInvoiceItem.builder()
                                .id("12344")
                                .code("120-C")
                                .name("Model Y")
                                .build())
                            .taxRate(LinkedTaxRateInput.builder()
                                .id("123456")
                                .rate(10d)
                                .build())
                            .trackingCategories(List.of(
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
                                    .build()))
                            .rowVersion("1-12345")
                            .build(),
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
                            .unitPrice(27500.5d)
                            .unitOfMeasure("pc.")
                            .discountPercentage(0.01d)
                            .discountAmount(19.99d)
                            .locationId("1234")
                            .departmentId("1234")
                            .item(LinkedInvoiceItem.builder()
                                .id("12344")
                                .code("120-C")
                                .name("Model Y")
                                .build())
                            .taxRate(LinkedTaxRateInput.builder()
                                .id("123456")
                                .rate(10d)
                                .build())
                            .trackingCategories(List.of(
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
                                    .value(Value.of(Four.builder()
                                        .build()))
                                    .build(),
                                CustomField.builder()
                                    .id("2389328923893298")
                                    .name("employee_level")
                                    .description("Employee Level")
                                    .value(Value.of(10d))
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
                            .value(Value.of5(List.of(
                                "<value>",
                                "<value>")))
                            .build(),
                        CustomField.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(Value.of5(List.of(
                                "<value>",
                                "<value>",
                                "<value>")))
                            .build(),
                        CustomField.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(Value.of(true))
                            .build()))
                    .rowVersion("1-12345")
                    .passThrough(List.of(
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
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
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
import com.apideck.unify.models.components.AccountType;
import com.apideck.unify.models.components.Address;
import com.apideck.unify.models.components.BankAccount;
import com.apideck.unify.models.components.Currency;
import com.apideck.unify.models.components.CustomField;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.Four;
import com.apideck.unify.models.components.InvoiceInput;
import com.apideck.unify.models.components.InvoiceLineItemInput;
import com.apideck.unify.models.components.InvoiceLineItemType;
import com.apideck.unify.models.components.InvoiceStatus;
import com.apideck.unify.models.components.InvoiceType;
import com.apideck.unify.models.components.LinkedCustomerInput;
import com.apideck.unify.models.components.LinkedInvoiceItem;
import com.apideck.unify.models.components.LinkedLedgerAccountInput;
import com.apideck.unify.models.components.LinkedTaxRateInput;
import com.apideck.unify.models.components.LinkedTrackingCategory;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.Six;
import com.apideck.unify.models.components.Type;
import com.apideck.unify.models.components.Value;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.AccountingInvoicesUpdateRequest;
import com.apideck.unify.models.operations.AccountingInvoicesUpdateResponse;
import java.lang.Exception;
import java.time.LocalDate;
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
                    .currencyRate(0.69d)
                    .taxInclusive(true)
                    .subTotal(27500d)
                    .totalTax(2500d)
                    .taxCode("1234")
                    .discountPercentage(5.5d)
                    .discountAmount(25d)
                    .total(27500d)
                    .balance(27500d)
                    .deposit(0d)
                    .customerMemo("Thank you for your business and have a great day!")
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
                            .unitPrice(27500.5d)
                            .unitOfMeasure("pc.")
                            .discountPercentage(0.01d)
                            .discountAmount(19.99d)
                            .locationId("1234")
                            .departmentId("1234")
                            .item(LinkedInvoiceItem.builder()
                                .id("12344")
                                .code("120-C")
                                .name("Model Y")
                                .build())
                            .taxRate(LinkedTaxRateInput.builder()
                                .id("123456")
                                .rate(10d)
                                .build())
                            .trackingCategories(List.of(
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
                                    .build(),
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
                            .build(),
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
                            .unitPrice(27500.5d)
                            .unitOfMeasure("pc.")
                            .discountPercentage(0.01d)
                            .discountAmount(19.99d)
                            .locationId("1234")
                            .departmentId("1234")
                            .item(LinkedInvoiceItem.builder()
                                .id("12344")
                                .code("120-C")
                                .name("Model Y")
                                .build())
                            .taxRate(LinkedTaxRateInput.builder()
                                .id("123456")
                                .rate(10d)
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
                                    .value(Value.of(10d))
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
                            .value(Value.of6(List.of(
                                Six.builder()
                                    .build())))
                            .build()))
                    .rowVersion("1-12345")
                    .passThrough(List.of(
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
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
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