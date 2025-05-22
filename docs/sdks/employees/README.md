# Employees
(*hris().employees()*)

## Overview

### Available Operations

* [list](#list) - List Employees
* [create](#create) - Create Employee
* [get](#get) - Get Employee
* [update](#update) - Update Employee
* [delete](#delete) - Delete Employee

## list

Apideck operates as a stateless Unified API, which means that the list endpoint only provides a portion of the employee model. This is due to the fact that most HRIS systems do not readily provide all data in every call. However, you can access the complete employee model through an employee detail call.

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.HrisEmployeesAllRequest;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        HrisEmployeesAllRequest req = HrisEmployeesAllRequest.builder()
                .serviceId("salesforce")
                .filter(EmployeesFilter.builder()
                    .companyId("1234")
                    .email("elon@tesla.com")
                    .firstName("Elon")
                    .title("Manager")
                    .lastName("Musk")
                    .managerId("1234")
                    .employmentStatus(EmployeesFilterEmploymentStatus.ACTIVE)
                    .employeeNumber("123456-AB")
                    .departmentId("1234")
                    .city("San Francisco")
                    .country("US")
                    .build())
                .sort(EmployeesSort.builder()
                    .by(EmployeesSortBy.CREATED_AT)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();

        sdk.hris().employees().list()
                .request(req)
                .callAsStream()
                .forEach(item -> {
                   // handle item
                });

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [HrisEmployeesAllRequest](../../models/operations/HrisEmployeesAllRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[HrisEmployeesAllResponse](../../models/operations/HrisEmployeesAllResponse.md)**

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

Create Employee

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.HrisEmployeesAddRequest;
import com.apideck.unify.models.operations.HrisEmployeesAddResponse;
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

        HrisEmployeesAddRequest req = HrisEmployeesAddRequest.builder()
                .employee(EmployeeInput.builder()
                    .id("12345")
                    .firstName("Elon")
                    .lastName("Musk")
                    .middleName("D.")
                    .displayName("Technoking")
                    .preferredName("Elon Musk")
                    .initials("EM")
                    .salutation("Mr")
                    .title("CEO")
                    .maritalStatus("married")
                    .partner(PersonInput.builder()
                        .firstName("Elon")
                        .lastName("Musk")
                        .middleName("D.")
                        .gender(Gender.MALE)
                        .initials("EM")
                        .birthday(LocalDate.parse("2000-08-12"))
                        .deceasedOn(LocalDate.parse("2000-08-12"))
                        .build())
                    .division("Europe")
                    .divisionId("12345")
                    .departmentId("12345")
                    .departmentName("12345")
                    .team(Team.builder()
                        .id("1234")
                        .name("Full Stack Engineers")
                        .build())
                    .companyId("23456")
                    .companyName("SpaceX")
                    .employmentStartDate("2021-10-26")
                    .employmentEndDate("2028-10-26")
                    .leavingReason(LeavingReason.RESIGNED)
                    .employeeNumber("123456-AB")
                    .employmentStatus(EmploymentStatus.ACTIVE)
                    .ethnicity("African American")
                    .manager(Manager.builder()
                        .id("12345")
                        .name("Elon Musk")
                        .firstName("Elon")
                        .lastName("Musk")
                        .email("elon@musk.com")
                        .employmentStatus(EmploymentStatus.ACTIVE)
                        .build())
                    .directReports(List.of(
                        "a0d636c6-43b3-4bde-8c70-85b707d992f4",
                        "a98lfd96-43b3-4bde-8c70-85b707d992e6"))
                    .socialSecurityNumber("123456789")
                    .birthday(LocalDate.parse("2000-08-12"))
                    .deceasedOn(LocalDate.parse("2000-08-12"))
                    .countryOfBirth("US")
                    .description("A description")
                    .gender(Gender.MALE)
                    .pronouns("she,her")
                    .preferredLanguage("EN")
                    .languages(List.of(
                        "EN"))
                    .nationalities(List.of(
                        "US"))
                    .photoUrl("https://unavatar.io/elon-musk")
                    .timezone("Europe/London")
                    .source("lever")
                    .sourceId("12345")
                    .recordUrl("https://app.intercom.io/contacts/12345")
                    .jobs(List.of(
                        EmployeeJobInput.builder()
                            .title("CEO")
                            .role("Sales")
                            .startDate(LocalDate.parse("2020-08-12"))
                            .endDate(LocalDate.parse("2020-08-12"))
                            .compensationRate(72000)
                            .currency(Currency.USD)
                            .paymentUnit(PaymentUnit.YEAR)
                            .hiredAt(LocalDate.parse("2020-08-12"))
                            .isPrimary(true)
                            .isManager(true)
                            .status(EmployeeJobStatus.ACTIVE)
                            .location(Address.builder()
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
                            .build(),
                        EmployeeJobInput.builder()
                            .title("CEO")
                            .role("Sales")
                            .startDate(LocalDate.parse("2020-08-12"))
                            .endDate(LocalDate.parse("2020-08-12"))
                            .compensationRate(72000)
                            .currency(Currency.USD)
                            .paymentUnit(PaymentUnit.YEAR)
                            .hiredAt(LocalDate.parse("2020-08-12"))
                            .isPrimary(true)
                            .isManager(true)
                            .status(EmployeeJobStatus.ACTIVE)
                            .location(Address.builder()
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
                            .build(),
                        EmployeeJobInput.builder()
                            .title("CEO")
                            .role("Sales")
                            .startDate(LocalDate.parse("2020-08-12"))
                            .endDate(LocalDate.parse("2020-08-12"))
                            .compensationRate(72000)
                            .currency(Currency.USD)
                            .paymentUnit(PaymentUnit.YEAR)
                            .hiredAt(LocalDate.parse("2020-08-12"))
                            .isPrimary(true)
                            .isManager(true)
                            .status(EmployeeJobStatus.ACTIVE)
                            .location(Address.builder()
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
                            .build()))
                    .compensations(List.of(
                        EmployeeCompensationInput.builder()
                            .rate(50)
                            .paymentUnit(PaymentUnit.HOUR)
                            .flsaStatus(FlsaStatus.NONEXEMPT)
                            .effectiveDate("2021-06-11")
                            .build()))
                    .worksRemote(true)
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
                            .build()))
                    .emails(List.of(
                        Email.builder()
                            .email("elon@musk.com")
                            .id("123")
                            .type(EmailType.PRIMARY)
                            .build()))
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
                    .socialLinks(List.of(
                        SocialLink.builder()
                            .url("https://www.twitter.com/apideck")
                            .id("12345")
                            .type("twitter")
                            .build(),
                        SocialLink.builder()
                            .url("https://www.twitter.com/apideck")
                            .id("12345")
                            .type("twitter")
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
                    .taxCode("1111")
                    .taxId("234-32-0000")
                    .dietaryPreference("Veggie")
                    .foodAllergies(List.of(
                        "No allergies"))
                    .probationPeriod(ProbationPeriod.builder()
                        .startDate(LocalDate.parse("2021-10-01"))
                        .endDate(LocalDate.parse("2021-11-28"))
                        .build())
                    .tags(List.of(
                        "New"))
                    .rowVersion("1-12345")
                    .deleted(true)
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

        HrisEmployeesAddResponse res = sdk.hris().employees().create()
                .request(req)
                .call();

        if (res.createEmployeeResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [HrisEmployeesAddRequest](../../models/operations/HrisEmployeesAddRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[HrisEmployeesAddResponse](../../models/operations/HrisEmployeesAddResponse.md)**

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

Get Employee

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.EmployeesOneFilter;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.HrisEmployeesOneRequest;
import com.apideck.unify.models.operations.HrisEmployeesOneResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        HrisEmployeesOneRequest req = HrisEmployeesOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .filter(EmployeesOneFilter.builder()
                    .companyId("1234")
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .build();

        HrisEmployeesOneResponse res = sdk.hris().employees().get()
                .request(req)
                .call();

        if (res.getEmployeeResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [HrisEmployeesOneRequest](../../models/operations/HrisEmployeesOneRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[HrisEmployeesOneResponse](../../models/operations/HrisEmployeesOneResponse.md)**

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

Update Employee

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.HrisEmployeesUpdateRequest;
import com.apideck.unify.models.operations.HrisEmployeesUpdateResponse;
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

        HrisEmployeesUpdateRequest req = HrisEmployeesUpdateRequest.builder()
                .id("<id>")
                .employee(EmployeeInput.builder()
                    .id("12345")
                    .firstName("Elon")
                    .lastName("Musk")
                    .middleName("D.")
                    .displayName("Technoking")
                    .preferredName("Elon Musk")
                    .initials("EM")
                    .salutation("Mr")
                    .title("CEO")
                    .maritalStatus("married")
                    .partner(PersonInput.builder()
                        .firstName("Elon")
                        .lastName("Musk")
                        .middleName("D.")
                        .gender(Gender.MALE)
                        .initials("EM")
                        .birthday(LocalDate.parse("2000-08-12"))
                        .deceasedOn(LocalDate.parse("2000-08-12"))
                        .build())
                    .division("Europe")
                    .divisionId("12345")
                    .departmentId("12345")
                    .departmentName("12345")
                    .team(Team.builder()
                        .id("1234")
                        .name("Full Stack Engineers")
                        .build())
                    .companyId("23456")
                    .companyName("SpaceX")
                    .employmentStartDate("2021-10-26")
                    .employmentEndDate("2028-10-26")
                    .leavingReason(LeavingReason.RESIGNED)
                    .employeeNumber("123456-AB")
                    .employmentStatus(EmploymentStatus.ACTIVE)
                    .ethnicity("African American")
                    .manager(Manager.builder()
                        .id("12345")
                        .name("Elon Musk")
                        .firstName("Elon")
                        .lastName("Musk")
                        .email("elon@musk.com")
                        .employmentStatus(EmploymentStatus.ACTIVE)
                        .build())
                    .directReports(List.of(
                        "a0d636c6-43b3-4bde-8c70-85b707d992f4",
                        "a98lfd96-43b3-4bde-8c70-85b707d992e6"))
                    .socialSecurityNumber("123456789")
                    .birthday(LocalDate.parse("2000-08-12"))
                    .deceasedOn(LocalDate.parse("2000-08-12"))
                    .countryOfBirth("US")
                    .description("A description")
                    .gender(Gender.MALE)
                    .pronouns("she,her")
                    .preferredLanguage("EN")
                    .languages(List.of(
                        "EN"))
                    .nationalities(List.of(
                        "US"))
                    .photoUrl("https://unavatar.io/elon-musk")
                    .timezone("Europe/London")
                    .source("lever")
                    .sourceId("12345")
                    .recordUrl("https://app.intercom.io/contacts/12345")
                    .jobs(List.of(
                        EmployeeJobInput.builder()
                            .title("CEO")
                            .role("Sales")
                            .startDate(LocalDate.parse("2020-08-12"))
                            .endDate(LocalDate.parse("2020-08-12"))
                            .compensationRate(72000)
                            .currency(Currency.USD)
                            .paymentUnit(PaymentUnit.YEAR)
                            .hiredAt(LocalDate.parse("2020-08-12"))
                            .isPrimary(true)
                            .isManager(true)
                            .status(EmployeeJobStatus.ACTIVE)
                            .location(Address.builder()
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
                            .build()))
                    .compensations(List.of(
                        EmployeeCompensationInput.builder()
                            .rate(50)
                            .paymentUnit(PaymentUnit.HOUR)
                            .flsaStatus(FlsaStatus.NONEXEMPT)
                            .effectiveDate("2021-06-11")
                            .build()))
                    .worksRemote(true)
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
                    .socialLinks(List.of(
                        SocialLink.builder()
                            .url("https://www.twitter.com/apideck")
                            .id("12345")
                            .type("twitter")
                            .build(),
                        SocialLink.builder()
                            .url("https://www.twitter.com/apideck")
                            .id("12345")
                            .type("twitter")
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
                    .taxCode("1111")
                    .taxId("234-32-0000")
                    .dietaryPreference("Veggie")
                    .foodAllergies(List.of(
                        "No allergies"))
                    .probationPeriod(ProbationPeriod.builder()
                        .startDate(LocalDate.parse("2021-10-01"))
                        .endDate(LocalDate.parse("2021-11-28"))
                        .build())
                    .tags(List.of(
                        "New"))
                    .rowVersion("1-12345")
                    .deleted(true)
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
                    .build())
                .serviceId("salesforce")
                .build();

        HrisEmployeesUpdateResponse res = sdk.hris().employees().update()
                .request(req)
                .call();

        if (res.updateEmployeeResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [HrisEmployeesUpdateRequest](../../models/operations/HrisEmployeesUpdateRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[HrisEmployeesUpdateResponse](../../models/operations/HrisEmployeesUpdateResponse.md)**

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

Delete Employee

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.HrisEmployeesDeleteRequest;
import com.apideck.unify.models.operations.HrisEmployeesDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        HrisEmployeesDeleteRequest req = HrisEmployeesDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        HrisEmployeesDeleteResponse res = sdk.hris().employees().delete()
                .request(req)
                .call();

        if (res.deleteEmployeeResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [HrisEmployeesDeleteRequest](../../models/operations/HrisEmployeesDeleteRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[HrisEmployeesDeleteResponse](../../models/operations/HrisEmployeesDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |