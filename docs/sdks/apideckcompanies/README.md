# Crm.Companies

## Overview

### Available Operations

* [list](#list) - List companies
* [create](#create) - Create company
* [get](#get) - Get company
* [update](#update) - Update company
* [delete](#delete) - Delete company

## list

List companies

### Example Usage

<!-- UsageSnippet language="java" operationID="crm.companiesAll" method="get" path="/crm/companies" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmCompaniesAllRequest;
import com.apideck.unify.models.operations.CrmCompaniesAllResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        CrmCompaniesAllRequest req = CrmCompaniesAllRequest.builder()
                .serviceId("salesforce")
                .filter(CompaniesFilter.builder()
                    .name("SpaceX")
                    .build())
                .sort(CompaniesSort.builder()
                    .by(CompaniesSortBy.CREATED_AT)
                    .direction(SortDirection.DESC)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();


        sdk.crm().companies().list()
                .callAsStream()
                .forEach((CrmCompaniesAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CrmCompaniesAllRequest](../../models/operations/CrmCompaniesAllRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CrmCompaniesAllResponse](../../models/operations/CrmCompaniesAllResponse.md)**

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

Create company

### Example Usage

<!-- UsageSnippet language="java" operationID="crm.companiesAdd" method="post" path="/crm/companies" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmCompaniesAddRequest;
import com.apideck.unify.models.operations.CrmCompaniesAddResponse;
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

        CrmCompaniesAddRequest req = CrmCompaniesAddRequest.builder()
                .company1(Company1Input.builder()
                    .name("SpaceX")
                    .ownerId("12345")
                    .image("https://www.spacex.com/static/images/share.jpg")
                    .description("Space Exploration Technologies Corp. is an American aerospace manufacturer, space transportation services and communications company headquartered in Hawthorne, California.")
                    .vatNumber("BE0689615164")
                    .currency(Currency.USD)
                    .status("Open")
                    .fax("+12129876543")
                    .annualRevenue("+$35m")
                    .numberOfEmployees("500-1000")
                    .industry("Apparel")
                    .ownership("Public")
                    .salesTaxNumber("12456EN")
                    .payeeNumber("78932EN")
                    .abnOrTfn("46 115 614 695")
                    .abnBranch("123")
                    .acn("XXX XXX XXX")
                    .firstName("Elon")
                    .lastName("Musk")
                    .bankAccounts(List.of(
                        BankAccount1.builder()
                            .bankName("Monzo")
                            .accountNumber("123465")
                            .accountName("SPACEX LLC")
                            .accountType(BankAccount1AccountType.CREDIT_CARD)
                            .iban("CH2989144532982975332")
                            .bic("AUDSCHGGXXX")
                            .routingNumber("012345678")
                            .bsbNumber("062-001")
                            .branchIdentifier("001")
                            .bankCode("BNH")
                            .currency(Currency.USD)
                            .build(),
                        BankAccount1.builder()
                            .bankName("Monzo")
                            .accountNumber("123465")
                            .accountName("SPACEX LLC")
                            .accountType(BankAccount1AccountType.CREDIT_CARD)
                            .iban("CH2989144532982975332")
                            .bic("AUDSCHGGXXX")
                            .routingNumber("012345678")
                            .bsbNumber("062-001")
                            .branchIdentifier("001")
                            .bankCode("BNH")
                            .currency(Currency.USD)
                            .build(),
                        BankAccount1.builder()
                            .bankName("Monzo")
                            .accountNumber("123465")
                            .accountName("SPACEX LLC")
                            .accountType(BankAccount1AccountType.CREDIT_CARD)
                            .iban("CH2989144532982975332")
                            .bic("AUDSCHGGXXX")
                            .routingNumber("012345678")
                            .bsbNumber("062-001")
                            .branchIdentifier("001")
                            .bankCode("BNH")
                            .currency(Currency.USD)
                            .build()))
                    .websites(List.of(
                        Website.builder()
                            .url("http://example.com")
                            .id("12345")
                            .type(WebsiteType.PRIMARY)
                            .build()))
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
                    .socialLinks(List.of(
                        SocialLink.builder()
                            .url("https://www.twitter.com/apideck")
                            .id("12345")
                            .type("twitter")
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
                    .rowType(CompanyRowType.builder()
                        .id("12345")
                        .name("Customer Account")
                        .build())
                    .customFields(List.of(
                        CustomField.of(CustomField1.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(CustomField1Value.of("Uses Salesforce and Marketo"))
                            .build()),
                        CustomField.of(CustomField1.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(CustomField1Value.of("Uses Salesforce and Marketo"))
                            .build())))
                    .tags(List.of(
                        "New"))
                    .readOnly(false)
                    .salutation("Mr")
                    .birthday(LocalDate.parse("2000-08-12"))
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
                            .build()))
                    .build())
                .serviceId("salesforce")
                .build();

        CrmCompaniesAddResponse res = sdk.crm().companies().create()
                .request(req)
                .call();

        if (res.createCompanyResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CrmCompaniesAddRequest](../../models/operations/CrmCompaniesAddRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CrmCompaniesAddResponse](../../models/operations/CrmCompaniesAddResponse.md)**

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

Get company

### Example Usage

<!-- UsageSnippet language="java" operationID="crm.companiesOne" method="get" path="/crm/companies/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmCompaniesOneRequest;
import com.apideck.unify.models.operations.CrmCompaniesOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        CrmCompaniesOneRequest req = CrmCompaniesOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        CrmCompaniesOneResponse res = sdk.crm().companies().get()
                .request(req)
                .call();

        if (res.getCompanyResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CrmCompaniesOneRequest](../../models/operations/CrmCompaniesOneRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CrmCompaniesOneResponse](../../models/operations/CrmCompaniesOneResponse.md)**

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

Update company

### Example Usage

<!-- UsageSnippet language="java" operationID="crm.companiesUpdate" method="patch" path="/crm/companies/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmCompaniesUpdateRequest;
import com.apideck.unify.models.operations.CrmCompaniesUpdateResponse;
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

        CrmCompaniesUpdateRequest req = CrmCompaniesUpdateRequest.builder()
                .id("<id>")
                .company1(Company1Input.builder()
                    .name("SpaceX")
                    .ownerId("12345")
                    .image("https://www.spacex.com/static/images/share.jpg")
                    .description("Space Exploration Technologies Corp. is an American aerospace manufacturer, space transportation services and communications company headquartered in Hawthorne, California.")
                    .vatNumber("BE0689615164")
                    .currency(Currency.USD)
                    .status("Open")
                    .fax("+12129876543")
                    .annualRevenue("+$35m")
                    .numberOfEmployees("500-1000")
                    .industry("Apparel")
                    .ownership("Public")
                    .salesTaxNumber("12456EN")
                    .payeeNumber("78932EN")
                    .abnOrTfn("46 115 614 695")
                    .abnBranch("123")
                    .acn("XXX XXX XXX")
                    .firstName("Elon")
                    .lastName("Musk")
                    .bankAccounts(List.of(
                        BankAccount1.builder()
                            .bankName("Monzo")
                            .accountNumber("123465")
                            .accountName("SPACEX LLC")
                            .accountType(BankAccount1AccountType.CREDIT_CARD)
                            .iban("CH2989144532982975332")
                            .bic("AUDSCHGGXXX")
                            .routingNumber("012345678")
                            .bsbNumber("062-001")
                            .branchIdentifier("001")
                            .bankCode("BNH")
                            .currency(Currency.USD)
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
                    .socialLinks(List.of(
                        SocialLink.builder()
                            .url("https://www.twitter.com/apideck")
                            .id("12345")
                            .type("twitter")
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
                    .rowType(CompanyRowType.builder()
                        .id("12345")
                        .name("Customer Account")
                        .build())
                    .customFields(List.of(
                        CustomField.of(CustomField1.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(CustomField1Value.of("Uses Salesforce and Marketo"))
                            .build()),
                        CustomField.of(CustomField1.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(CustomField1Value.of("Uses Salesforce and Marketo"))
                            .build())))
                    .tags(List.of(
                        "New"))
                    .readOnly(false)
                    .salutation("Mr")
                    .birthday(LocalDate.parse("2000-08-12"))
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
                    .build())
                .serviceId("salesforce")
                .build();

        CrmCompaniesUpdateResponse res = sdk.crm().companies().update()
                .request(req)
                .call();

        if (res.updateCompanyResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CrmCompaniesUpdateRequest](../../models/operations/CrmCompaniesUpdateRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CrmCompaniesUpdateResponse](../../models/operations/CrmCompaniesUpdateResponse.md)**

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

Delete company

### Example Usage

<!-- UsageSnippet language="java" operationID="crm.companiesDelete" method="delete" path="/crm/companies/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmCompaniesDeleteRequest;
import com.apideck.unify.models.operations.CrmCompaniesDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        CrmCompaniesDeleteRequest req = CrmCompaniesDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        CrmCompaniesDeleteResponse res = sdk.crm().companies().delete()
                .request(req)
                .call();

        if (res.deleteCompanyResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CrmCompaniesDeleteRequest](../../models/operations/CrmCompaniesDeleteRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CrmCompaniesDeleteResponse](../../models/operations/CrmCompaniesDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |