# Suppliers
(*accounting().suppliers()*)

## Overview

### Available Operations

* [list](#list) - List Suppliers
* [create](#create) - Create Supplier
* [get](#get) - Get Supplier
* [update](#update) - Update Supplier
* [delete](#delete) - Delete Supplier

## list

List Suppliers

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingSuppliersAllRequest;
import com.apideck.unify.models.operations.AccountingSuppliersAllResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        AccountingSuppliersAllRequest req = AccountingSuppliersAllRequest.builder()
                .serviceId("salesforce")
                .filter(SuppliersFilter.builder()
                    .companyName("SpaceX")
                    .displayName("Elon Musk")
                    .firstName("Elon")
                    .lastName("Musk")
                    .email("elon@musk.com")
                    .updatedSince(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .build())
                .sort(SuppliersSort.builder()
                    .by(SuppliersSortBy.UPDATED_AT)
                    .direction(SortDirection.DESC)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();

        sdk.accounting().suppliers().list()
                .request(req)
                .callAsStream()
                .forEach((AccountingSuppliersAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [AccountingSuppliersAllRequest](../../models/operations/AccountingSuppliersAllRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[AccountingSuppliersAllResponse](../../models/operations/AccountingSuppliersAllResponse.md)**

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

Create Supplier

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingSuppliersAddRequest;
import com.apideck.unify.models.operations.AccountingSuppliersAddResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        AccountingSuppliersAddRequest req = AccountingSuppliersAddRequest.builder()
                .supplier(SupplierInput.builder()
                    .displayId("EMP00101")
                    .displayName("Windsurf Shop")
                    .companyName("SpaceX")
                    .companyId("12345")
                    .title("CEO")
                    .firstName("Elon")
                    .middleName("D.")
                    .lastName("Musk")
                    .suffix("Jr.")
                    .individual(true)
                    .addresses(List.of(
                        Address.builder()
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
                            .build()))
                    .phoneNumbers(List.of(
                        PhoneNumber.builder()
                            .number("111-111-1111")
                            .id("12345")
                            .countryCode("1")
                            .areaCode("323")
                            .extension("105")
                            .type(PhoneNumberType.PRIMARY)
                            .build(),
                        PhoneNumber.builder()
                            .number("111-111-1111")
                            .id("12345")
                            .countryCode("1")
                            .areaCode("323")
                            .extension("105")
                            .type(PhoneNumberType.PRIMARY)
                            .build()))
                    .emails(List.of(
                        Email.builder()
                            .email("elon@musk.com")
                            .id("123")
                            .type(EmailType.PRIMARY)
                            .build()))
                    .websites(List.of(
                        Website.builder()
                            .url("http://example.com")
                            .id("12345")
                            .type(WebsiteType.PRIMARY)
                            .build(),
                        Website.builder()
                            .url("http://example.com")
                            .id("12345")
                            .type(WebsiteType.PRIMARY)
                            .build(),
                        Website.builder()
                            .url("http://example.com")
                            .id("12345")
                            .type(WebsiteType.PRIMARY)
                            .build()))
                    .bankAccounts(List.of(
                        BankAccount.builder()
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
                            .build()))
                    .notes("Some notes about this supplier")
                    .taxRate(LinkedTaxRateInput.builder()
                        .id("123456")
                        .rate(10)
                        .build())
                    .taxNumber("US123945459")
                    .currency(Currency.USD)
                    .account(LinkedLedgerAccountInput.builder()
                        .id("123456")
                        .nominalCode("N091")
                        .code("453")
                        .build())
                    .status(SupplierStatus.ACTIVE)
                    .paymentMethod("cash")
                    .channel("email")
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
                    .subsidiaryId("12345")
                    .build())
                .serviceId("salesforce")
                .build();

        AccountingSuppliersAddResponse res = sdk.accounting().suppliers().create()
                .request(req)
                .call();

        if (res.createSupplierResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [AccountingSuppliersAddRequest](../../models/operations/AccountingSuppliersAddRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[AccountingSuppliersAddResponse](../../models/operations/AccountingSuppliersAddResponse.md)**

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

Get Supplier

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingSuppliersOneRequest;
import com.apideck.unify.models.operations.AccountingSuppliersOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        AccountingSuppliersOneRequest req = AccountingSuppliersOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        AccountingSuppliersOneResponse res = sdk.accounting().suppliers().get()
                .request(req)
                .call();

        if (res.getSupplierResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [AccountingSuppliersOneRequest](../../models/operations/AccountingSuppliersOneRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[AccountingSuppliersOneResponse](../../models/operations/AccountingSuppliersOneResponse.md)**

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

Update Supplier

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingSuppliersUpdateRequest;
import com.apideck.unify.models.operations.AccountingSuppliersUpdateResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        AccountingSuppliersUpdateRequest req = AccountingSuppliersUpdateRequest.builder()
                .id("<id>")
                .supplier(SupplierInput.builder()
                    .displayId("EMP00101")
                    .displayName("Windsurf Shop")
                    .companyName("SpaceX")
                    .companyId("12345")
                    .title("CEO")
                    .firstName("Elon")
                    .middleName("D.")
                    .lastName("Musk")
                    .suffix("Jr.")
                    .individual(true)
                    .addresses(List.of(
                        Address.builder()
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
                            .build()))
                    .phoneNumbers(List.of(
                        PhoneNumber.builder()
                            .number("111-111-1111")
                            .id("12345")
                            .countryCode("1")
                            .areaCode("323")
                            .extension("105")
                            .type(PhoneNumberType.PRIMARY)
                            .build(),
                        PhoneNumber.builder()
                            .number("111-111-1111")
                            .id("12345")
                            .countryCode("1")
                            .areaCode("323")
                            .extension("105")
                            .type(PhoneNumberType.PRIMARY)
                            .build()))
                    .emails(List.of(
                        Email.builder()
                            .email("elon@musk.com")
                            .id("123")
                            .type(EmailType.PRIMARY)
                            .build()))
                    .websites(List.of(
                        Website.builder()
                            .url("http://example.com")
                            .id("12345")
                            .type(WebsiteType.PRIMARY)
                            .build()))
                    .bankAccounts(List.of(
                        BankAccount.builder()
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
                            .build(),
                        BankAccount.builder()
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
                            .build()))
                    .notes("Some notes about this supplier")
                    .taxRate(LinkedTaxRateInput.builder()
                        .id("123456")
                        .rate(10)
                        .build())
                    .taxNumber("US123945459")
                    .currency(Currency.USD)
                    .account(LinkedLedgerAccountInput.builder()
                        .id("123456")
                        .nominalCode("N091")
                        .code("453")
                        .build())
                    .status(SupplierStatus.ACTIVE)
                    .paymentMethod("cash")
                    .channel("email")
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
                    .subsidiaryId("12345")
                    .build())
                .serviceId("salesforce")
                .build();

        AccountingSuppliersUpdateResponse res = sdk.accounting().suppliers().update()
                .request(req)
                .call();

        if (res.updateSupplierResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AccountingSuppliersUpdateRequest](../../models/operations/AccountingSuppliersUpdateRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AccountingSuppliersUpdateResponse](../../models/operations/AccountingSuppliersUpdateResponse.md)**

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

Delete Supplier

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingSuppliersDeleteRequest;
import com.apideck.unify.models.operations.AccountingSuppliersDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        AccountingSuppliersDeleteRequest req = AccountingSuppliersDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AccountingSuppliersDeleteResponse res = sdk.accounting().suppliers().delete()
                .request(req)
                .call();

        if (res.deleteSupplierResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AccountingSuppliersDeleteRequest](../../models/operations/AccountingSuppliersDeleteRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AccountingSuppliersDeleteResponse](../../models/operations/AccountingSuppliersDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |