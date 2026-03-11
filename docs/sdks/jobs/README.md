# Ats.Jobs

## Overview

### Available Operations

* [list](#list) - List Jobs
* [create](#create) - Create Job
* [get](#get) - Get Job
* [update](#update) - Update Job
* [delete](#delete) - Delete Job

## list

List Jobs

### Example Usage

<!-- UsageSnippet language="java" operationID="ats.jobsAll" method="get" path="/ats/jobs" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AtsJobsAllRequest;
import com.apideck.unify.models.operations.AtsJobsAllResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AtsJobsAllRequest req = AtsJobsAllRequest.builder()
                .serviceId("salesforce")
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();


        sdk.ats().jobs().list()
                .callAsStream()
                .forEach((AtsJobsAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [AtsJobsAllRequest](../../models/operations/AtsJobsAllRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[AtsJobsAllResponse](../../models/operations/AtsJobsAllResponse.md)**

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

Create Job

### Example Usage

<!-- UsageSnippet language="java" operationID="ats.jobsAdd" method="post" path="/ats/jobs" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AtsJobsAddRequest;
import com.apideck.unify.models.operations.AtsJobsAddResponse;
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

        AtsJobsAddRequest req = AtsJobsAddRequest.builder()
                .job(JobInput.builder()
                    .slug("ceo")
                    .title("CEO")
                    .sequence(3L)
                    .visibility(Visibility.INTERNAL)
                    .status(JobStatus.COMPLETED)
                    .code("123-OC")
                    .language("EN")
                    .employmentTerms(EmploymentTerms.FULL_TIME)
                    .experience("Director/ Vice President")
                    .location("San Francisco")
                    .remote(true)
                    .requisitionId("abc123")
                    .department(DepartmentInput.builder()
                        .name("R&D")
                        .code("2")
                        .description("R&D")
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
                    .branch(JobBranch.builder()
                        .name("HQ NY")
                        .build())
                    .recruiters(List.of(
                        "a0d636c6-43b3-4bde-8c70-85b707d992f4"))
                    .hiringManagers(List.of(
                        "123456"))
                    .followers(List.of(
                        "a0d636c6-43b3-4bde-8c70-85b707d992f4",
                        "a98lfd96-43b3-4bde-8c70-85b707d992e6"))
                    .description("A description")
                    .blocks(List.of(
                        Blocks.builder()
                            .title("string")
                            .content("string")
                            .build()))
                    .closing("The closing section of the job description")
                    .closingDate(LocalDate.parse("2020-10-30"))
                    .salary(Salary.builder()
                        .min(8000L)
                        .max(10000L)
                        .currency(Currency.USD)
                        .interval("year")
                        .build())
                    .links(List.of(
                        JobLinks.builder()
                            .type(JobType.JOB_PORTAL)
                            .url("https://app.intercom.io/contacts/12345")
                            .build()))
                    .confidential(false)
                    .availableToEmployees(false)
                    .tags(List.of(
                        "New"))
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
                    .customFields(List.of(
                        CustomField.of(CustomField1.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(CustomField1Value.of("Uses Salesforce and Marketo"))
                            .build())))
                    .deleted(true)
                    .ownerId("54321")
                    .build())
                .serviceId("salesforce")
                .build();

        AtsJobsAddResponse res = sdk.ats().jobs().create()
                .request(req)
                .call();

        if (res.createJobResponse().isPresent()) {
            System.out.println(res.createJobResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [AtsJobsAddRequest](../../models/operations/AtsJobsAddRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[AtsJobsAddResponse](../../models/operations/AtsJobsAddResponse.md)**

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

Get Job

### Example Usage

<!-- UsageSnippet language="java" operationID="ats.jobsOne" method="get" path="/ats/jobs/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AtsJobsOneRequest;
import com.apideck.unify.models.operations.AtsJobsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AtsJobsOneRequest req = AtsJobsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        AtsJobsOneResponse res = sdk.ats().jobs().get()
                .request(req)
                .call();

        if (res.getJobResponse().isPresent()) {
            System.out.println(res.getJobResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [AtsJobsOneRequest](../../models/operations/AtsJobsOneRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[AtsJobsOneResponse](../../models/operations/AtsJobsOneResponse.md)**

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

Update Job

### Example Usage

<!-- UsageSnippet language="java" operationID="ats.jobsUpdate" method="patch" path="/ats/jobs/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AtsJobsUpdateRequest;
import com.apideck.unify.models.operations.AtsJobsUpdateResponse;
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

        AtsJobsUpdateRequest req = AtsJobsUpdateRequest.builder()
                .id("<id>")
                .job(JobInput.builder()
                    .slug("ceo")
                    .title("CEO")
                    .sequence(3L)
                    .visibility(Visibility.INTERNAL)
                    .status(JobStatus.COMPLETED)
                    .code("123-OC")
                    .language("EN")
                    .employmentTerms(EmploymentTerms.FULL_TIME)
                    .experience("Director/ Vice President")
                    .location("San Francisco")
                    .remote(true)
                    .requisitionId("abc123")
                    .department(DepartmentInput.builder()
                        .name("R&D")
                        .code("2")
                        .description("R&D")
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
                    .branch(JobBranch.builder()
                        .name("HQ NY")
                        .build())
                    .recruiters(List.of(
                        "a0d636c6-43b3-4bde-8c70-85b707d992f4"))
                    .hiringManagers(List.of(
                        "123456"))
                    .followers(List.of(
                        "a0d636c6-43b3-4bde-8c70-85b707d992f4",
                        "a98lfd96-43b3-4bde-8c70-85b707d992e6"))
                    .description("A description")
                    .blocks(List.of(
                        Blocks.builder()
                            .title("string")
                            .content("string")
                            .build()))
                    .closing("The closing section of the job description")
                    .closingDate(LocalDate.parse("2020-10-30"))
                    .salary(Salary.builder()
                        .min(8000L)
                        .max(10000L)
                        .currency(Currency.USD)
                        .interval("year")
                        .build())
                    .links(List.of(
                        JobLinks.builder()
                            .type(JobType.JOB_PORTAL)
                            .url("https://app.intercom.io/contacts/12345")
                            .build()))
                    .confidential(false)
                    .availableToEmployees(false)
                    .tags(List.of(
                        "New"))
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
                    .customFields(List.of(
                        CustomField.of(CustomField1.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(CustomField1Value.of("Uses Salesforce and Marketo"))
                            .build())))
                    .deleted(true)
                    .ownerId("54321")
                    .build())
                .serviceId("salesforce")
                .build();

        AtsJobsUpdateResponse res = sdk.ats().jobs().update()
                .request(req)
                .call();

        if (res.updateJobResponse().isPresent()) {
            System.out.println(res.updateJobResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [AtsJobsUpdateRequest](../../models/operations/AtsJobsUpdateRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[AtsJobsUpdateResponse](../../models/operations/AtsJobsUpdateResponse.md)**

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

Delete Job

### Example Usage

<!-- UsageSnippet language="java" operationID="ats.jobsDelete" method="delete" path="/ats/jobs/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AtsJobsDeleteRequest;
import com.apideck.unify.models.operations.AtsJobsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AtsJobsDeleteRequest req = AtsJobsDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AtsJobsDeleteResponse res = sdk.ats().jobs().delete()
                .request(req)
                .call();

        if (res.deleteJobResponse().isPresent()) {
            System.out.println(res.deleteJobResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [AtsJobsDeleteRequest](../../models/operations/AtsJobsDeleteRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[AtsJobsDeleteResponse](../../models/operations/AtsJobsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |