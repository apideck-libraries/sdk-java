# JournalEntries
(*accounting().journalEntries()*)

## Overview

### Available Operations

* [list](#list) - List Journal Entries
* [create](#create) - Create Journal Entry
* [get](#get) - Get Journal Entry
* [update](#update) - Update Journal Entry
* [delete](#delete) - Delete Journal Entry

## list

List Journal Entries

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.journalEntriesAll" method="get" path="/accounting/journal-entries" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingJournalEntriesAllRequest;
import com.apideck.unify.models.operations.AccountingJournalEntriesAllResponse;
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

        AccountingJournalEntriesAllRequest req = AccountingJournalEntriesAllRequest.builder()
                .serviceId("salesforce")
                .filter(JournalEntriesFilter.builder()
                    .updatedSince(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .build())
                .sort(JournalEntriesSort.builder()
                    .by(JournalEntriesSortBy.UPDATED_AT)
                    .direction(SortDirection.DESC)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();

        sdk.accounting().journalEntries().list()
                .request(req)
                .callAsStream()
                .forEach((AccountingJournalEntriesAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AccountingJournalEntriesAllRequest](../../models/operations/AccountingJournalEntriesAllRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[AccountingJournalEntriesAllResponse](../../models/operations/AccountingJournalEntriesAllResponse.md)**

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

Create Journal Entry

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.journalEntriesAdd" method="post" path="/accounting/journal-entries" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingJournalEntriesAddRequest;
import com.apideck.unify.models.operations.AccountingJournalEntriesAddResponse;
import java.lang.Exception;
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

        AccountingJournalEntriesAddRequest req = AccountingJournalEntriesAddRequest.builder()
                .journalEntry(JournalEntryInput.builder()
                    .title("Purchase Invoice-Inventory (USD): 2019/02/01 Batch Summary Entry")
                    .currencyRate(0.69)
                    .currency(Currency.USD)
                    .companyId("12345")
                    .lineItems(List.of(
                        JournalEntryLineItemInput.builder()
                            .type(JournalEntryLineItemType.DEBIT)
                            .ledgerAccount(LinkedLedgerAccountInput.builder()
                                .id("123456")
                                .nominalCode("N091")
                                .code("453")
                                .build())
                            .description("Model Y is a fully electric, mid-size SUV, with seating for up to seven, dual motor AWD and unparalleled protection.")
                            .taxAmount(27500d)
                            .subTotal(27500d)
                            .totalAmount(27500d)
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
                            .customer(LinkedCustomerInput.builder()
                                .id("12345")
                                .displayName("Windsurf Shop")
                                .email("boring@boring.com")
                                .build())
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
                            .departmentId("12345")
                            .locationId("12345")
                            .lineNumber(1L)
                            .build()))
                    .status(JournalEntryStatus.DRAFT)
                    .memo("Thank you for your business and have a great day!")
                    .postedAt(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .journalSymbol("IND")
                    .taxType("sales")
                    .taxCode("1234")
                    .number("OIT00546")
                    .trackingCategories(JsonNullable.of(null))
                    .accountingPeriod("01-24")
                    .rowVersion("1-12345")
                    .customFields(List.of(
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
                    .build())
                .serviceId("salesforce")
                .build();

        AccountingJournalEntriesAddResponse res = sdk.accounting().journalEntries().create()
                .request(req)
                .call();

        if (res.createJournalEntryResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AccountingJournalEntriesAddRequest](../../models/operations/AccountingJournalEntriesAddRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[AccountingJournalEntriesAddResponse](../../models/operations/AccountingJournalEntriesAddResponse.md)**

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

Get Journal Entry

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.journalEntriesOne" method="get" path="/accounting/journal-entries/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingJournalEntriesOneRequest;
import com.apideck.unify.models.operations.AccountingJournalEntriesOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingJournalEntriesOneRequest req = AccountingJournalEntriesOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        AccountingJournalEntriesOneResponse res = sdk.accounting().journalEntries().get()
                .request(req)
                .call();

        if (res.getJournalEntryResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AccountingJournalEntriesOneRequest](../../models/operations/AccountingJournalEntriesOneRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[AccountingJournalEntriesOneResponse](../../models/operations/AccountingJournalEntriesOneResponse.md)**

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

Update Journal Entry

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.journalEntriesUpdate" method="patch" path="/accounting/journal-entries/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingJournalEntriesUpdateRequest;
import com.apideck.unify.models.operations.AccountingJournalEntriesUpdateResponse;
import java.lang.Exception;
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

        AccountingJournalEntriesUpdateRequest req = AccountingJournalEntriesUpdateRequest.builder()
                .id("<id>")
                .journalEntry(JournalEntryInput.builder()
                    .title("Purchase Invoice-Inventory (USD): 2019/02/01 Batch Summary Entry")
                    .currencyRate(0.69)
                    .currency(Currency.USD)
                    .companyId("12345")
                    .lineItems(List.of(
                        JournalEntryLineItemInput.builder()
                            .type(JournalEntryLineItemType.DEBIT)
                            .ledgerAccount(LinkedLedgerAccountInput.builder()
                                .id("123456")
                                .nominalCode("N091")
                                .code("453")
                                .build())
                            .description("Model Y is a fully electric, mid-size SUV, with seating for up to seven, dual motor AWD and unparalleled protection.")
                            .taxAmount(27500d)
                            .subTotal(27500d)
                            .totalAmount(27500d)
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
                            .customer(LinkedCustomerInput.builder()
                                .id("12345")
                                .displayName("Windsurf Shop")
                                .email("boring@boring.com")
                                .build())
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
                            .departmentId("12345")
                            .locationId("12345")
                            .lineNumber(1L)
                            .build()))
                    .status(JournalEntryStatus.DRAFT)
                    .memo("Thank you for your business and have a great day!")
                    .postedAt(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .journalSymbol("IND")
                    .taxType("sales")
                    .taxCode("1234")
                    .number("OIT00546")
                    .trackingCategories(List.of(
                        LinkedTrackingCategory.builder()
                            .id("123456")
                            .name("New York")
                            .build(),
                        LinkedTrackingCategory.builder()
                            .id("123456")
                            .name("New York")
                            .build()))
                    .accountingPeriod("01-24")
                    .rowVersion("1-12345")
                    .customFields(List.of(
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
                                    .build()))
                            .build()))
                    .build())
                .serviceId("salesforce")
                .build();

        AccountingJournalEntriesUpdateResponse res = sdk.accounting().journalEntries().update()
                .request(req)
                .call();

        if (res.updateJournalEntryResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [AccountingJournalEntriesUpdateRequest](../../models/operations/AccountingJournalEntriesUpdateRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[AccountingJournalEntriesUpdateResponse](../../models/operations/AccountingJournalEntriesUpdateResponse.md)**

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

Delete Journal Entry

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.journalEntriesDelete" method="delete" path="/accounting/journal-entries/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingJournalEntriesDeleteRequest;
import com.apideck.unify.models.operations.AccountingJournalEntriesDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingJournalEntriesDeleteRequest req = AccountingJournalEntriesDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AccountingJournalEntriesDeleteResponse res = sdk.accounting().journalEntries().delete()
                .request(req)
                .call();

        if (res.deleteJournalEntryResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [AccountingJournalEntriesDeleteRequest](../../models/operations/AccountingJournalEntriesDeleteRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[AccountingJournalEntriesDeleteResponse](../../models/operations/AccountingJournalEntriesDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |