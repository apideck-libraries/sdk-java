# Projects
(*accounting().projects()*)

## Overview

### Available Operations

* [list](#list) - List projects
* [create](#create) - Create project
* [get](#get) - Get project
* [update](#update) - Update project
* [delete](#delete) - Delete project

## list

List projects

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.projectsAll" method="get" path="/accounting/projects" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingProjectsAllRequest;
import com.apideck.unify.models.operations.AccountingProjectsAllResponse;
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

        AccountingProjectsAllRequest req = AccountingProjectsAllRequest.builder()
                .serviceId("salesforce")
                .filter(ProjectsFilter.builder()
                    .name("Website Redesign")
                    .status(ProjectStatus.ACTIVE)
                    .customerId("12345")
                    .updatedSince(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .build())
                .sort(ProjectsSort.builder()
                    .by(ProjectsSortSortBy.NAME)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();


        sdk.accounting().projects().list()
                .callAsStream()
                .forEach((AccountingProjectsAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AccountingProjectsAllRequest](../../models/operations/AccountingProjectsAllRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AccountingProjectsAllResponse](../../models/operations/AccountingProjectsAllResponse.md)**

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

Create project

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.projectsAdd" method="post" path="/accounting/projects" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingProjectsAddRequest;
import com.apideck.unify.models.operations.AccountingProjectsAddResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.util.List;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingProjectsAddRequest req = AccountingProjectsAddRequest.builder()
                .project(ProjectInput.builder()
                    .name("Website Redesign Project")
                    .displayId("PROJ-001")
                    .referenceId("WD-REF-2024-001")
                    .description("Complete redesign of the company website including new branding and improved user experience")
                    .status(ProjectProjectStatus.ACTIVE)
                    .active(true)
                    .projectType(ProjectType.CLIENT_PROJECT)
                    .priority(Priority.HIGH)
                    .completionPercentage(75.5)
                    .startDate(LocalDate.parse("2024-01-15"))
                    .endDate(LocalDate.parse("2024-06-30"))
                    .customer(LinkedCustomerInput.builder()
                        .id("12345")
                        .displayName("Windsurf Shop")
                        .email("boring@boring.com")
                        .build())
                    .department(ProjectDepartment.builder()
                        .id("DEPT-001")
                        .name("Marketing")
                        .build())
                    .companyId("12345")
                    .ownerId("12345")
                    .parentProject(ParentProject.builder()
                        .id("PROJ-PARENT-001")
                        .name("Company Website Overhaul")
                        .build())
                    .currency(Currency.USD)
                    .budgetAmount(50000d)
                    .approvedAmount(48000d)
                    .budgetHours(400d)
                    .hourlyRate(125d)
                    .billingMethod(BillingMethod.TIME_AND_MATERIALS)
                    .phase(ProjectPhase.EXECUTION)
                    .taxRate(LinkedTaxRateInput.builder()
                        .id("123456")
                        .rate(10d)
                        .build())
                    .trackingCategories(List.of(
                        LinkedTrackingCategory.builder()
                            .id("123456")
                            .name("New York")
                            .parentId("123456")
                            .parentName("New York")
                            .build()))
                    .tags(List.of(
                        "website",
                        "redesign",
                        "urgent"))
                    .notes("Client has requested modern design with mobile-first approach")
                    .contractNumber("CNT-2024-001")
                    .profitMargin(15.5)
                    .scheduleStatus(ScheduleStatus.ON_SCHEDULE)
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
                    .teamSize(8L)
                    .customFields(List.of(
                        CustomField.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(Value.of("Uses Salesforce and Marketo"))
                            .build()))
                    .rowVersion("1-12345")
                    .build())
                .serviceId("salesforce")
                .build();

        AccountingProjectsAddResponse res = sdk.accounting().projects().create()
                .request(req)
                .call();

        if (res.createProjectResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AccountingProjectsAddRequest](../../models/operations/AccountingProjectsAddRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AccountingProjectsAddResponse](../../models/operations/AccountingProjectsAddResponse.md)**

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

Get project

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.projectsOne" method="get" path="/accounting/projects/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingProjectsOneRequest;
import com.apideck.unify.models.operations.AccountingProjectsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingProjectsOneRequest req = AccountingProjectsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AccountingProjectsOneResponse res = sdk.accounting().projects().get()
                .request(req)
                .call();

        if (res.getProjectResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AccountingProjectsOneRequest](../../models/operations/AccountingProjectsOneRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AccountingProjectsOneResponse](../../models/operations/AccountingProjectsOneResponse.md)**

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

Update project

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.projectsUpdate" method="patch" path="/accounting/projects/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingProjectsUpdateRequest;
import com.apideck.unify.models.operations.AccountingProjectsUpdateResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingProjectsUpdateRequest req = AccountingProjectsUpdateRequest.builder()
                .id("<id>")
                .project(ProjectInput.builder()
                    .name("Website Redesign Project")
                    .displayId("PROJ-001")
                    .referenceId("WD-REF-2024-001")
                    .description("Complete redesign of the company website including new branding and improved user experience")
                    .status(ProjectProjectStatus.ACTIVE)
                    .active(true)
                    .projectType(ProjectType.CLIENT_PROJECT)
                    .priority(Priority.HIGH)
                    .completionPercentage(75.5)
                    .startDate(LocalDate.parse("2024-01-15"))
                    .endDate(LocalDate.parse("2024-06-30"))
                    .customer(JsonNullable.of(null))
                    .department(ProjectDepartment.builder()
                        .id("DEPT-001")
                        .name("Marketing")
                        .build())
                    .companyId("12345")
                    .ownerId("12345")
                    .parentProject(ParentProject.builder()
                        .id("PROJ-PARENT-001")
                        .name("Company Website Overhaul")
                        .build())
                    .currency(Currency.USD)
                    .budgetAmount(50000d)
                    .approvedAmount(48000d)
                    .budgetHours(400d)
                    .hourlyRate(125d)
                    .billingMethod(BillingMethod.TIME_AND_MATERIALS)
                    .phase(ProjectPhase.EXECUTION)
                    .taxRate(LinkedTaxRateInput.builder()
                        .id("123456")
                        .rate(10d)
                        .build())
                    .trackingCategories(List.of(
                        LinkedTrackingCategory.builder()
                            .id("123456")
                            .name("New York")
                            .parentId("123456")
                            .parentName("New York")
                            .build()))
                    .tags(List.of(
                        "website",
                        "redesign",
                        "urgent"))
                    .notes("Client has requested modern design with mobile-first approach")
                    .contractNumber("CNT-2024-001")
                    .profitMargin(15.5)
                    .scheduleStatus(ScheduleStatus.ON_SCHEDULE)
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
                    .teamSize(8L)
                    .customFields(List.of(
                        CustomField.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(Value.of("Uses Salesforce and Marketo"))
                            .build()))
                    .rowVersion("1-12345")
                    .build())
                .serviceId("salesforce")
                .build();

        AccountingProjectsUpdateResponse res = sdk.accounting().projects().update()
                .request(req)
                .call();

        if (res.updateProjectResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AccountingProjectsUpdateRequest](../../models/operations/AccountingProjectsUpdateRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AccountingProjectsUpdateResponse](../../models/operations/AccountingProjectsUpdateResponse.md)**

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

Delete project

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.projectsDelete" method="delete" path="/accounting/projects/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingProjectsDeleteRequest;
import com.apideck.unify.models.operations.AccountingProjectsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingProjectsDeleteRequest req = AccountingProjectsDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AccountingProjectsDeleteResponse res = sdk.accounting().projects().delete()
                .request(req)
                .call();

        if (res.deleteProjectResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AccountingProjectsDeleteRequest](../../models/operations/AccountingProjectsDeleteRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AccountingProjectsDeleteResponse](../../models/operations/AccountingProjectsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |