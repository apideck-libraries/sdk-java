# Bills
(*accounting().bills()*)

## Overview

### Available Operations

* [list](#list) - List Bills
* [create](#create) - Create Bill
* [get](#get) - Get Bill
* [update](#update) - Update Bill
* [delete](#delete) - Delete Bill

## list

List Bills

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBillsAllRequest;
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

        AccountingBillsAllRequest req = AccountingBillsAllRequest.builder()
                .serviceId("salesforce")
                .filter(BillsFilter.builder()
                    .updatedSince(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .build())
                .sort(BillsSort.builder()
                    .by(By.UPDATED_AT)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();

        sdk.accounting().bills().list()
                .request(req)
                .callAsStream()
                .forEach(item -> {
                   // handle item
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [AccountingBillsAllRequest](../../models/operations/AccountingBillsAllRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[AccountingBillsAllResponse](../../models/operations/AccountingBillsAllResponse.md)**

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

Create Bill

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBillsAddRequest;
import com.apideck.unify.models.operations.AccountingBillsAddResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        AccountingBillsAddRequest req = AccountingBillsAddRequest.builder()
                .bill(BillInput.builder()
                    .billNumber("10001")
                    .supplier(LinkedSupplierInput.builder()
                        .id("12345")
                        .displayName("Windsurf Shop")
                        .address(Address.builder()
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
                        .build())
                    .companyId("12345")
                    .currency(Currency.USD)
                    .currencyRate(0.69)
                    .taxInclusive(true)
                    .billDate(LocalDate.parse("2020-09-30"))
                    .dueDate(LocalDate.parse("2020-10-30"))
                    .paidDate(LocalDate.parse("2020-10-30"))
                    .poNumber("90000117")
                    .reference("123456")
                    .lineItems(List.of(
                        BillLineItemInput.builder()
                            .rowId("12345")
                            .code("120-C")
                            .lineNumber(1L)
                            .description("Model Y is a fully electric, mid-size SUV, with seating for up to seven, dual motor AWD and unparalleled protection.")
                            .type(BillLineItemType.EXPENSE_ACCOUNT)
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
                            .ledgerAccount(LinkedLedgerAccountInput.builder()
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
                                    .build(),
                                LinkedTrackingCategory.builder()
                                    .id("123456")
                                    .name("New York")
                                    .build()))
                            .rowVersion("1-12345")
                            .build()))
                    .terms("Net 30 days")
                    .balance(27500)
                    .deposit(0)
                    .subTotal(27500)
                    .totalTax(2500)
                    .total(27500)
                    .taxCode("1234")
                    .notes("Some notes about this bill.")
                    .status(BillStatus.DRAFT)
                    .ledgerAccount(LinkedLedgerAccountInput.builder()
                        .id("123456")
                        .nominalCode("N091")
                        .code("453")
                        .build())
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
                    .discountPercentage(5.5)
                    .sourceDocumentUrl("https://www.invoicesolution.com/bill/123456")
                    .trackingCategories(JsonNullable.of(null))
                    .rowVersion("1-12345")
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
                    .accountingPeriod("01-24")
                    .build())
                .serviceId("salesforce")
                .build();

        AccountingBillsAddResponse res = sdk.accounting().bills().create()
                .request(req)
                .call();

        if (res.createBillResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [AccountingBillsAddRequest](../../models/operations/AccountingBillsAddRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[AccountingBillsAddResponse](../../models/operations/AccountingBillsAddResponse.md)**

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

Get Bill

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBillsOneRequest;
import com.apideck.unify.models.operations.AccountingBillsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingBillsOneRequest req = AccountingBillsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        AccountingBillsOneResponse res = sdk.accounting().bills().get()
                .request(req)
                .call();

        if (res.getBillResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [AccountingBillsOneRequest](../../models/operations/AccountingBillsOneRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[AccountingBillsOneResponse](../../models/operations/AccountingBillsOneResponse.md)**

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

Update Bill

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBillsUpdateRequest;
import com.apideck.unify.models.operations.AccountingBillsUpdateResponse;
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

        AccountingBillsUpdateRequest req = AccountingBillsUpdateRequest.builder()
                .id("<id>")
                .bill(BillInput.builder()
                    .billNumber("10001")
                    .supplier(LinkedSupplierInput.builder()
                        .id("12345")
                        .displayName("Windsurf Shop")
                        .address(Address.builder()
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
                        .build())
                    .companyId("12345")
                    .currency(Currency.USD)
                    .currencyRate(0.69)
                    .taxInclusive(true)
                    .billDate(LocalDate.parse("2020-09-30"))
                    .dueDate(LocalDate.parse("2020-10-30"))
                    .paidDate(LocalDate.parse("2020-10-30"))
                    .poNumber("90000117")
                    .reference("123456")
                    .lineItems(List.of(
                        BillLineItemInput.builder()
                            .rowId("12345")
                            .code("120-C")
                            .lineNumber(1L)
                            .description("Model Y is a fully electric, mid-size SUV, with seating for up to seven, dual motor AWD and unparalleled protection.")
                            .type(BillLineItemType.EXPENSE_ACCOUNT)
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
                            .ledgerAccount(LinkedLedgerAccountInput.builder()
                                .id("123456")
                                .nominalCode("N091")
                                .code("453")
                                .build())
                            .trackingCategories(List.of(
                                LinkedTrackingCategory.builder()
                                    .id("123456")
                                    .name("New York")
                                    .build()))
                            .rowVersion("1-12345")
                            .build(),
                        BillLineItemInput.builder()
                            .rowId("12345")
                            .code("120-C")
                            .lineNumber(1L)
                            .description("Model Y is a fully electric, mid-size SUV, with seating for up to seven, dual motor AWD and unparalleled protection.")
                            .type(BillLineItemType.EXPENSE_ACCOUNT)
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
                            .ledgerAccount(LinkedLedgerAccountInput.builder()
                                .id("123456")
                                .nominalCode("N091")
                                .code("453")
                                .build())
                            .trackingCategories(List.of(
                                LinkedTrackingCategory.builder()
                                    .id("123456")
                                    .name("New York")
                                    .build()))
                            .rowVersion("1-12345")
                            .build()))
                    .terms("Net 30 days")
                    .balance(27500)
                    .deposit(0)
                    .subTotal(27500)
                    .totalTax(2500)
                    .total(27500)
                    .taxCode("1234")
                    .notes("Some notes about this bill.")
                    .status(BillStatus.DRAFT)
                    .ledgerAccount(LinkedLedgerAccountInput.builder()
                        .id("123456")
                        .nominalCode("N091")
                        .code("453")
                        .build())
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
                    .discountPercentage(5.5)
                    .sourceDocumentUrl("https://www.invoicesolution.com/bill/123456")
                    .trackingCategories(List.of(
                        LinkedTrackingCategory.builder()
                            .id("123456")
                            .name("New York")
                            .build()))
                    .rowVersion("1-12345")
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
                    .accountingPeriod("01-24")
                    .build())
                .serviceId("salesforce")
                .build();

        AccountingBillsUpdateResponse res = sdk.accounting().bills().update()
                .request(req)
                .call();

        if (res.updateBillResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AccountingBillsUpdateRequest](../../models/operations/AccountingBillsUpdateRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AccountingBillsUpdateResponse](../../models/operations/AccountingBillsUpdateResponse.md)**

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

Delete Bill

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBillsDeleteRequest;
import com.apideck.unify.models.operations.AccountingBillsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingBillsDeleteRequest req = AccountingBillsDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AccountingBillsDeleteResponse res = sdk.accounting().bills().delete()
                .request(req)
                .call();

        if (res.deleteBillResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AccountingBillsDeleteRequest](../../models/operations/AccountingBillsDeleteRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AccountingBillsDeleteResponse](../../models/operations/AccountingBillsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |