# Accounting.BillCreditNotes

## Overview

### Available Operations

* [list](#list) - List Bill Credit Notes
* [create](#create) - Create Bill Credit Note
* [get](#get) - Get Bill Credit Note
* [update](#update) - Update Bill Credit Note
* [delete](#delete) - Delete Bill Credit Note

## list

List Bill Credit Notes

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.billCreditNotesAll" method="get" path="/accounting/bill-credit-notes" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBillCreditNotesAllRequest;
import com.apideck.unify.models.operations.AccountingBillCreditNotesAllResponse;
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

        AccountingBillCreditNotesAllRequest req = AccountingBillCreditNotesAllRequest.builder()
                .serviceId("salesforce")
                .companyId("12345")
                .filter(BillCreditNotesFilter.builder()
                    .ids("12345,67890")
                    .idSince("1")
                    .updatedSince(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .createdSince(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .number("OIT00546")
                    .supplierId("123abc")
                    .build())
                .sort(BillCreditNotesSort.builder()
                    .by(BillCreditNotesSortBy.UPDATED_AT)
                    .direction(SortDirection.DESC)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();


        sdk.accounting().billCreditNotes().list()
                .callAsStream()
                .forEach((AccountingBillCreditNotesAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [AccountingBillCreditNotesAllRequest](../../models/operations/AccountingBillCreditNotesAllRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[AccountingBillCreditNotesAllResponse](../../models/operations/AccountingBillCreditNotesAllResponse.md)**

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

Create Bill Credit Note

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.billCreditNotesAdd" method="post" path="/accounting/bill-credit-notes" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBillCreditNotesAddRequest;
import com.apideck.unify.models.operations.AccountingBillCreditNotesAddResponse;
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

        AccountingBillCreditNotesAddRequest req = AccountingBillCreditNotesAddRequest.builder()
                .billCreditNote(BillCreditNoteInput.builder()
                    .totalAmount(49.99)
                    .number("OIT00546")
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
                        .build())
                    .subsidiary(LinkedSubsidiaryInput.builder()
                        .displayId("123456")
                        .name("Acme Inc.")
                        .build())
                    .location(LinkedLocationInput.builder()
                        .id("123456")
                        .displayId("123456")
                        .name("New York Office")
                        .build())
                    .department(LinkedDepartmentInput.builder()
                        .displayId("123456")
                        .name("Acme Inc.")
                        .build())
                    .currency(Currency.USD)
                    .currencyRate(0.69)
                    .taxInclusive(true)
                    .subTotal(27500d)
                    .totalTax(2500d)
                    .taxCode("1234")
                    .balance(27500d)
                    .remainingCredit(27500d)
                    .status(BillCreditNoteStatus.AUTHORISED)
                    .reference("123456")
                    .dateIssued(OffsetDateTime.parse("2021-05-01T12:00:00.000Z"))
                    .datePaid(OffsetDateTime.parse("2021-05-01T12:00:00.000Z"))
                    .type(BillCreditNoteType.ACCOUNTS_PAYABLE_CREDIT)
                    .account(LinkedLedgerAccount.builder()
                        .id("123456")
                        .name("Bank account")
                        .nominalCode("N091")
                        .code("453")
                        .parentId("123456")
                        .displayId("123456")
                        .build())
                    .lineItems(List.of(
                        BillCreditNoteLineItemInput.builder()
                            .rowId("12345")
                            .code("120-C")
                            .lineNumber(1L)
                            .description("Returned goods credit")
                            .type(LineItemType.EXPENSE_ACCOUNT)
                            .taxAmount(27.5)
                            .totalAmount(27500d)
                            .quantity(1d)
                            .unitPrice(27500.5)
                            .unitOfMeasure("pc.")
                            .discountPercentage(0.01)
                            .discountAmount(19.99)
                            .serviceDate(LocalDate.parse("2024-01-15"))
                            .location(LinkedLocationInput.builder()
                                .id("123456")
                                .displayId("123456")
                                .name("New York Office")
                                .build())
                            .department(JsonNullable.of(null))
                            .item(LinkedInvoiceItem.builder()
                                .id("12344")
                                .code("120-C")
                                .name("Model Y")
                                .build())
                            .taxRate(LinkedTaxRateInput.builder()
                                .id("123456")
                                .code("N-T")
                                .rate(10d)
                                .build())
                            .ledgerAccount(LinkedLedgerAccount.builder()
                                .id("123456")
                                .name("Bank account")
                                .nominalCode("N091")
                                .code("453")
                                .parentId("123456")
                                .displayId("123456")
                                .build())
                            .trackingCategories(List.of(
                                LinkedTrackingCategory.builder()
                                    .id("123456")
                                    .code("100")
                                    .name("New York")
                                    .parentId("123456")
                                    .parentName("New York")
                                    .build()))
                            .rowVersion("1-12345")
                            .build()))
                    .allocations(List.of(
                        AllocationInput.builder()
                            .id("123456")
                            .amount(49.99)
                            .allocationId("123456")
                            .build()))
                    .note("Some notes about this bill credit note")
                    .terms("Some terms about this bill credit note")
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

        AccountingBillCreditNotesAddResponse res = sdk.accounting().billCreditNotes().create()
                .request(req)
                .call();

        if (res.createBillCreditNoteResponse().isPresent()) {
            System.out.println(res.createBillCreditNoteResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [AccountingBillCreditNotesAddRequest](../../models/operations/AccountingBillCreditNotesAddRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[AccountingBillCreditNotesAddResponse](../../models/operations/AccountingBillCreditNotesAddResponse.md)**

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

Get Bill Credit Note

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.billCreditNotesOne" method="get" path="/accounting/bill-credit-notes/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBillCreditNotesOneRequest;
import com.apideck.unify.models.operations.AccountingBillCreditNotesOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingBillCreditNotesOneRequest req = AccountingBillCreditNotesOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .companyId("12345")
                .fields("id,updated_at")
                .build();

        AccountingBillCreditNotesOneResponse res = sdk.accounting().billCreditNotes().get()
                .request(req)
                .call();

        if (res.getBillCreditNoteResponse().isPresent()) {
            System.out.println(res.getBillCreditNoteResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [AccountingBillCreditNotesOneRequest](../../models/operations/AccountingBillCreditNotesOneRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[AccountingBillCreditNotesOneResponse](../../models/operations/AccountingBillCreditNotesOneResponse.md)**

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

Update Bill Credit Note

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.billCreditNotesUpdate" method="patch" path="/accounting/bill-credit-notes/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBillCreditNotesUpdateRequest;
import com.apideck.unify.models.operations.AccountingBillCreditNotesUpdateResponse;
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

        AccountingBillCreditNotesUpdateRequest req = AccountingBillCreditNotesUpdateRequest.builder()
                .id("<id>")
                .billCreditNote(BillCreditNoteInput.builder()
                    .totalAmount(49.99)
                    .number("OIT00546")
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
                        .build())
                    .subsidiary(LinkedSubsidiaryInput.builder()
                        .displayId("123456")
                        .name("Acme Inc.")
                        .build())
                    .location(LinkedLocationInput.builder()
                        .id("123456")
                        .displayId("123456")
                        .name("New York Office")
                        .build())
                    .department(LinkedDepartmentInput.builder()
                        .displayId("123456")
                        .name("Acme Inc.")
                        .build())
                    .currency(Currency.USD)
                    .currencyRate(0.69)
                    .taxInclusive(true)
                    .subTotal(27500d)
                    .totalTax(2500d)
                    .taxCode("1234")
                    .balance(27500d)
                    .remainingCredit(27500d)
                    .status(BillCreditNoteStatus.AUTHORISED)
                    .reference("123456")
                    .dateIssued(OffsetDateTime.parse("2021-05-01T12:00:00.000Z"))
                    .datePaid(OffsetDateTime.parse("2021-05-01T12:00:00.000Z"))
                    .type(BillCreditNoteType.ACCOUNTS_PAYABLE_CREDIT)
                    .account(LinkedLedgerAccount.builder()
                        .id("123456")
                        .name("Bank account")
                        .nominalCode("N091")
                        .code("453")
                        .parentId("123456")
                        .displayId("123456")
                        .build())
                    .lineItems(List.of(
                        BillCreditNoteLineItemInput.builder()
                            .rowId("12345")
                            .code("120-C")
                            .lineNumber(1L)
                            .description("Returned goods credit")
                            .type(LineItemType.EXPENSE_ACCOUNT)
                            .taxAmount(27.5)
                            .totalAmount(27500d)
                            .quantity(1d)
                            .unitPrice(27500.5)
                            .unitOfMeasure("pc.")
                            .discountPercentage(0.01)
                            .discountAmount(19.99)
                            .serviceDate(LocalDate.parse("2024-01-15"))
                            .location(LinkedLocationInput.builder()
                                .id("123456")
                                .displayId("123456")
                                .name("New York Office")
                                .build())
                            .department(LinkedDepartmentInput.builder()
                                .displayId("123456")
                                .name("Acme Inc.")
                                .build())
                            .item(LinkedInvoiceItem.builder()
                                .id("12344")
                                .code("120-C")
                                .name("Model Y")
                                .build())
                            .taxRate(LinkedTaxRateInput.builder()
                                .id("123456")
                                .code("N-T")
                                .rate(10d)
                                .build())
                            .ledgerAccount(LinkedLedgerAccount.builder()
                                .id("123456")
                                .name("Bank account")
                                .nominalCode("N091")
                                .code("453")
                                .parentId("123456")
                                .displayId("123456")
                                .build())
                            .trackingCategories(List.of(
                                LinkedTrackingCategory.builder()
                                    .id("123456")
                                    .code("100")
                                    .name("New York")
                                    .parentId("123456")
                                    .parentName("New York")
                                    .build()))
                            .rowVersion("1-12345")
                            .build()))
                    .allocations(List.of(
                        AllocationInput.builder()
                            .id("123456")
                            .amount(49.99)
                            .allocationId("123456")
                            .build()))
                    .note("Some notes about this bill credit note")
                    .terms("Some terms about this bill credit note")
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
                .build();

        AccountingBillCreditNotesUpdateResponse res = sdk.accounting().billCreditNotes().update()
                .request(req)
                .call();

        if (res.updateBillCreditNoteResponse().isPresent()) {
            System.out.println(res.updateBillCreditNoteResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [AccountingBillCreditNotesUpdateRequest](../../models/operations/AccountingBillCreditNotesUpdateRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[AccountingBillCreditNotesUpdateResponse](../../models/operations/AccountingBillCreditNotesUpdateResponse.md)**

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

Delete Bill Credit Note

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.billCreditNotesDelete" method="delete" path="/accounting/bill-credit-notes/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBillCreditNotesDeleteRequest;
import com.apideck.unify.models.operations.AccountingBillCreditNotesDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingBillCreditNotesDeleteRequest req = AccountingBillCreditNotesDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AccountingBillCreditNotesDeleteResponse res = sdk.accounting().billCreditNotes().delete()
                .request(req)
                .call();

        if (res.deleteBillCreditNoteResponse().isPresent()) {
            System.out.println(res.deleteBillCreditNoteResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [AccountingBillCreditNotesDeleteRequest](../../models/operations/AccountingBillCreditNotesDeleteRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[AccountingBillCreditNotesDeleteResponse](../../models/operations/AccountingBillCreditNotesDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |