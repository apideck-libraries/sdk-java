# Customers
(*accounting().customers()*)

## Overview

### Available Operations

* [list](#list) - List Customers
* [create](#create) - Create Customer
* [get](#get) - Get Customer
* [update](#update) - Update Customer
* [delete](#delete) - Delete Customer

## list

List Customers

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingCustomersAllRequest;
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

        AccountingCustomersAllRequest req = AccountingCustomersAllRequest.builder()
                .serviceId("salesforce")
                .filter(CustomersFilter.builder()
                    .companyName("SpaceX")
                    .displayName("Elon Musk")
                    .firstName("Elon")
                    .lastName("Musk")
                    .email("elon@musk.com")
                    .status(CustomersFilterStatus.ACTIVE)
                    .updatedSince(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .supplierId("123")
                    .build())
                .sort(CustomersSort.builder()
                    .by(CustomersSortBy.UPDATED_AT)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();

        sdk.accounting().customers().list()
                .request(req)
                .callAsStream()
                .forEach(item -> {
                   // handle item
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [AccountingCustomersAllRequest](../../models/operations/AccountingCustomersAllRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[AccountingCustomersAllResponse](../../models/operations/AccountingCustomersAllResponse.md)**

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

Create Customer

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingCustomersAddRequest;
import com.apideck.unify.models.operations.AccountingCustomersAddResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingCustomersAddRequest req = AccountingCustomersAddRequest.builder()
                .customer(CustomerInput.builder()
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
                    .project(false)
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
                            .build(),
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
                            .build(),
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
                            .build()))
                    .notes("Some notes about this customer")
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
                    .parent(LinkedParentCustomer.builder()
                        .id("12345")
                        .name("Windsurf Shop")
                        .build())
                    .status(CustomerStatusStatus.ACTIVE)
                    .paymentMethod("cash")
                    .channel("email")
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
                            .value(Value.of(10))
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

        AccountingCustomersAddResponse res = sdk.accounting().customers().create()
                .request(req)
                .call();

        if (res.createCustomerResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [AccountingCustomersAddRequest](../../models/operations/AccountingCustomersAddRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[AccountingCustomersAddResponse](../../models/operations/AccountingCustomersAddResponse.md)**

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

Get Customer

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingCustomersOneRequest;
import com.apideck.unify.models.operations.AccountingCustomersOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingCustomersOneRequest req = AccountingCustomersOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        AccountingCustomersOneResponse res = sdk.accounting().customers().get()
                .request(req)
                .call();

        if (res.getCustomerResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [AccountingCustomersOneRequest](../../models/operations/AccountingCustomersOneRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[AccountingCustomersOneResponse](../../models/operations/AccountingCustomersOneResponse.md)**

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

Update Customer

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingCustomersUpdateRequest;
import com.apideck.unify.models.operations.AccountingCustomersUpdateResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingCustomersUpdateRequest req = AccountingCustomersUpdateRequest.builder()
                .id("<id>")
                .customer(CustomerInput.builder()
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
                    .project(false)
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
                            .build(),
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
                            .build(),
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
                            .build(),
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
                    .notes("Some notes about this customer")
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
                    .parent(LinkedParentCustomer.builder()
                        .id("12345")
                        .name("Windsurf Shop")
                        .build())
                    .status(CustomerStatusStatus.ACTIVE)
                    .paymentMethod("cash")
                    .channel("email")
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
                                    .value(Map.ofEntries(
                                        Map.entry("TaxClassificationRef", Map.ofEntries(
                                            Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build()))
                            .build()))
                    .build())
                .serviceId("salesforce")
                .build();

        AccountingCustomersUpdateResponse res = sdk.accounting().customers().update()
                .request(req)
                .call();

        if (res.updateCustomerResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AccountingCustomersUpdateRequest](../../models/operations/AccountingCustomersUpdateRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AccountingCustomersUpdateResponse](../../models/operations/AccountingCustomersUpdateResponse.md)**

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

Delete Customer

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingCustomersDeleteRequest;
import com.apideck.unify.models.operations.AccountingCustomersDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingCustomersDeleteRequest req = AccountingCustomersDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AccountingCustomersDeleteResponse res = sdk.accounting().customers().delete()
                .request(req)
                .call();

        if (res.deleteCustomerResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AccountingCustomersDeleteRequest](../../models/operations/AccountingCustomersDeleteRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AccountingCustomersDeleteResponse](../../models/operations/AccountingCustomersDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |