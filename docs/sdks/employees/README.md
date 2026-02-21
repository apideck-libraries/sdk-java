# Accounting.Employees

## Overview

### Available Operations

* [list](#list) - List Employees
* [create](#create) - Create Employee
* [get](#get) - Get Employee
* [update](#update) - Update Employee
* [delete](#delete) - Delete Employee

## list

List Employees

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.employeesAll" method="get" path="/accounting/employees" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.AccountingEmployeesFilter;
import com.apideck.unify.models.components.AccountingEmployeesFilterStatus;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingEmployeesAllRequest;
import com.apideck.unify.models.operations.AccountingEmployeesAllResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingEmployeesAllRequest req = AccountingEmployeesAllRequest.builder()
                .serviceId("salesforce")
                .fields("id,updated_at")
                .filter(AccountingEmployeesFilter.builder()
                    .updatedSince(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .status(AccountingEmployeesFilterStatus.ACTIVE)
                    .build())
                .build();


        sdk.accounting().employees().list()
                .callAsStream()
                .forEach((AccountingEmployeesAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [AccountingEmployeesAllRequest](../../models/operations/AccountingEmployeesAllRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[AccountingEmployeesAllResponse](../../models/operations/AccountingEmployeesAllResponse.md)**

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

<!-- UsageSnippet language="java" operationID="accounting.employeesAdd" method="post" path="/accounting/employees" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingEmployeesAddRequest;
import com.apideck.unify.models.operations.AccountingEmployeesAddResponse;
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

        AccountingEmployeesAddRequest req = AccountingEmployeesAddRequest.builder()
                .accountingEmployee(AccountingEmployeeInput.builder()
                    .displayId("123456")
                    .firstName("John")
                    .lastName("Doe")
                    .displayName("John Doe")
                    .emails(List.of(
                        Email.builder()
                            .email("elon@musk.com")
                            .id("123")
                            .type(EmailType.PRIMARY)
                            .build()))
                    .employeeNumber("EMP-001")
                    .jobTitle("Senior Accountant")
                    .status(EmployeeStatus.ACTIVE)
                    .isContractor(false)
                    .department(LinkedDepartmentInput.builder()
                        .displayId("123456")
                        .name("Acme Inc.")
                        .build())
                    .location(LinkedLocationInput.builder()
                        .id("123456")
                        .displayId("123456")
                        .name("New York Office")
                        .build())
                    .manager(AccountingEmployeeManager.builder()
                        .id("12345")
                        .name("Jane Smith")
                        .build())
                    .hireDate(LocalDate.parse("2020-01-15"))
                    .terminationDate(LocalDate.parse("2025-12-31"))
                    .gender(Gender.MALE)
                    .birthDate(LocalDate.parse("1990-05-20"))
                    .subsidiary(LinkedSubsidiaryInput.builder()
                        .displayId("123456")
                        .name("Acme Inc.")
                        .build())
                    .trackingCategories(List.of(
                        LinkedTrackingCategory.builder()
                            .id("123456")
                            .code("100")
                            .name("New York")
                            .parentId("123456")
                            .parentName("New York")
                            .build()))
                    .currency(Currency.USD)
                    .notes("Some notes about this employee")
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
                    .customFields(List.of(
                        CustomField.of(CustomField1.builder()
                            .id("2389328923893298")
                            .name("employee_level")
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

        AccountingEmployeesAddResponse res = sdk.accounting().employees().create()
                .request(req)
                .call();

        if (res.createAccountingEmployeeResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [AccountingEmployeesAddRequest](../../models/operations/AccountingEmployeesAddRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[AccountingEmployeesAddResponse](../../models/operations/AccountingEmployeesAddResponse.md)**

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

<!-- UsageSnippet language="java" operationID="accounting.employeesOne" method="get" path="/accounting/employees/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingEmployeesOneRequest;
import com.apideck.unify.models.operations.AccountingEmployeesOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingEmployeesOneRequest req = AccountingEmployeesOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        AccountingEmployeesOneResponse res = sdk.accounting().employees().get()
                .request(req)
                .call();

        if (res.getAccountingEmployeeResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [AccountingEmployeesOneRequest](../../models/operations/AccountingEmployeesOneRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[AccountingEmployeesOneResponse](../../models/operations/AccountingEmployeesOneResponse.md)**

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

<!-- UsageSnippet language="java" operationID="accounting.employeesUpdate" method="patch" path="/accounting/employees/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingEmployeesUpdateRequest;
import com.apideck.unify.models.operations.AccountingEmployeesUpdateResponse;
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

        AccountingEmployeesUpdateRequest req = AccountingEmployeesUpdateRequest.builder()
                .id("<id>")
                .accountingEmployee(AccountingEmployeeInput.builder()
                    .displayId("123456")
                    .firstName("John")
                    .lastName("Doe")
                    .displayName("John Doe")
                    .emails(List.of(
                        Email.builder()
                            .email("elon@musk.com")
                            .id("123")
                            .type(EmailType.PRIMARY)
                            .build()))
                    .employeeNumber("EMP-001")
                    .jobTitle("Senior Accountant")
                    .status(EmployeeStatus.ACTIVE)
                    .isContractor(false)
                    .department(LinkedDepartmentInput.builder()
                        .displayId("123456")
                        .name("Acme Inc.")
                        .build())
                    .location(LinkedLocationInput.builder()
                        .id("123456")
                        .displayId("123456")
                        .name("New York Office")
                        .build())
                    .manager(AccountingEmployeeManager.builder()
                        .id("12345")
                        .name("Jane Smith")
                        .build())
                    .hireDate(LocalDate.parse("2020-01-15"))
                    .terminationDate(LocalDate.parse("2025-12-31"))
                    .gender(Gender.MALE)
                    .birthDate(LocalDate.parse("1990-05-20"))
                    .subsidiary(LinkedSubsidiaryInput.builder()
                        .displayId("123456")
                        .name("Acme Inc.")
                        .build())
                    .trackingCategories(List.of(
                        LinkedTrackingCategory.builder()
                            .id("123456")
                            .code("100")
                            .name("New York")
                            .parentId("123456")
                            .parentName("New York")
                            .build()))
                    .currency(Currency.USD)
                    .notes("Some notes about this employee")
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
                    .customFields(List.of(
                        CustomField.of(CustomField1.builder()
                            .id("2389328923893298")
                            .name("employee_level")
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

        AccountingEmployeesUpdateResponse res = sdk.accounting().employees().update()
                .request(req)
                .call();

        if (res.updateAccountingEmployeeResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AccountingEmployeesUpdateRequest](../../models/operations/AccountingEmployeesUpdateRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AccountingEmployeesUpdateResponse](../../models/operations/AccountingEmployeesUpdateResponse.md)**

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

<!-- UsageSnippet language="java" operationID="accounting.employeesDelete" method="delete" path="/accounting/employees/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingEmployeesDeleteRequest;
import com.apideck.unify.models.operations.AccountingEmployeesDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingEmployeesDeleteRequest req = AccountingEmployeesDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AccountingEmployeesDeleteResponse res = sdk.accounting().employees().delete()
                .request(req)
                .call();

        if (res.deleteAccountingEmployeeResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AccountingEmployeesDeleteRequest](../../models/operations/AccountingEmployeesDeleteRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AccountingEmployeesDeleteResponse](../../models/operations/AccountingEmployeesDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |