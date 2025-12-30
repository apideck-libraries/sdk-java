# Crm.Opportunities

## Overview

### Available Operations

* [list](#list) - List opportunities
* [create](#create) - Create opportunity
* [get](#get) - Get opportunity
* [update](#update) - Update opportunity
* [delete](#delete) - Delete opportunity

## list

List opportunities

### Example Usage

<!-- UsageSnippet language="java" operationID="crm.opportunitiesAll" method="get" path="/crm/opportunities" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmOpportunitiesAllRequest;
import com.apideck.unify.models.operations.CrmOpportunitiesAllResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        CrmOpportunitiesAllRequest req = CrmOpportunitiesAllRequest.builder()
                .serviceId("salesforce")
                .filter(OpportunitiesFilter.builder()
                    .status("Completed")
                    .monetaryAmount(75000d)
                    .build())
                .sort(OpportunitiesSort.builder()
                    .by(OpportunitiesSortBy.CREATED_AT)
                    .direction(SortDirection.DESC)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();


        sdk.crm().opportunities().list()
                .callAsStream()
                .forEach((CrmOpportunitiesAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CrmOpportunitiesAllRequest](../../models/operations/CrmOpportunitiesAllRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CrmOpportunitiesAllResponse](../../models/operations/CrmOpportunitiesAllResponse.md)**

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

Create opportunity

### Example Usage

<!-- UsageSnippet language="java" operationID="crm.opportunitiesAdd" method="post" path="/crm/opportunities" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmOpportunitiesAddRequest;
import com.apideck.unify.models.operations.CrmOpportunitiesAddResponse;
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

        CrmOpportunitiesAddRequest req = CrmOpportunitiesAddRequest.builder()
                .opportunity(OpportunityInput.builder()
                    .title("New Rocket")
                    .primaryContactId("12345")
                    .description("Opportunities are created for People and Companies that are interested in buying your products or services. Create Opportunities for People and Companies to move them through one of your Pipelines.")
                    .type("Existing Customer - Upgrade")
                    .monetaryAmount(75000d)
                    .currency(Currency.USD)
                    .winProbability(40d)
                    .closeDate(LocalDate.parse("2020-10-30"))
                    .lossReasonId("12345")
                    .lossReason("No budget")
                    .wonReasonId("12345")
                    .wonReason("Best pitch")
                    .pipelineId("12345")
                    .pipelineStageId("12345")
                    .sourceId("12345")
                    .leadId("12345")
                    .leadSource("Website")
                    .contactId("12345")
                    .contactIds(List.of(
                        "12345"))
                    .companyId("12345")
                    .companyName("Copper")
                    .ownerId("12345")
                    .priority("None")
                    .status("Open")
                    .statusId("12345")
                    .tags(List.of(
                        "New"))
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
                            .build()),
                        CustomField.of(CustomField1.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(CustomField1Value.of("Uses Salesforce and Marketo"))
                            .build())))
                    .stageLastChangedAt(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
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
                            .build()))
                    .build())
                .serviceId("salesforce")
                .build();

        CrmOpportunitiesAddResponse res = sdk.crm().opportunities().create()
                .request(req)
                .call();

        if (res.createOpportunityResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CrmOpportunitiesAddRequest](../../models/operations/CrmOpportunitiesAddRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CrmOpportunitiesAddResponse](../../models/operations/CrmOpportunitiesAddResponse.md)**

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

Get opportunity

### Example Usage

<!-- UsageSnippet language="java" operationID="crm.opportunitiesOne" method="get" path="/crm/opportunities/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmOpportunitiesOneRequest;
import com.apideck.unify.models.operations.CrmOpportunitiesOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        CrmOpportunitiesOneRequest req = CrmOpportunitiesOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        CrmOpportunitiesOneResponse res = sdk.crm().opportunities().get()
                .request(req)
                .call();

        if (res.getOpportunityResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CrmOpportunitiesOneRequest](../../models/operations/CrmOpportunitiesOneRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CrmOpportunitiesOneResponse](../../models/operations/CrmOpportunitiesOneResponse.md)**

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

Update opportunity

### Example Usage

<!-- UsageSnippet language="java" operationID="crm.opportunitiesUpdate" method="patch" path="/crm/opportunities/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmOpportunitiesUpdateRequest;
import com.apideck.unify.models.operations.CrmOpportunitiesUpdateResponse;
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

        CrmOpportunitiesUpdateRequest req = CrmOpportunitiesUpdateRequest.builder()
                .id("<id>")
                .opportunity(OpportunityInput.builder()
                    .title("New Rocket")
                    .primaryContactId("12345")
                    .description("Opportunities are created for People and Companies that are interested in buying your products or services. Create Opportunities for People and Companies to move them through one of your Pipelines.")
                    .type("Existing Customer - Upgrade")
                    .monetaryAmount(75000d)
                    .currency(Currency.USD)
                    .winProbability(40d)
                    .closeDate(LocalDate.parse("2020-10-30"))
                    .lossReasonId("12345")
                    .lossReason("No budget")
                    .wonReasonId("12345")
                    .wonReason("Best pitch")
                    .pipelineId("12345")
                    .pipelineStageId("12345")
                    .sourceId("12345")
                    .leadId("12345")
                    .leadSource("Website")
                    .contactId("12345")
                    .contactIds(List.of(
                        "12345"))
                    .companyId("12345")
                    .companyName("Copper")
                    .ownerId("12345")
                    .priority("None")
                    .status("Open")
                    .statusId("12345")
                    .tags(List.of(
                        "New"))
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
                            .build()),
                        CustomField.of(CustomField1.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(CustomField1Value.of("Uses Salesforce and Marketo"))
                            .build())))
                    .stageLastChangedAt(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
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

        CrmOpportunitiesUpdateResponse res = sdk.crm().opportunities().update()
                .request(req)
                .call();

        if (res.updateOpportunityResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CrmOpportunitiesUpdateRequest](../../models/operations/CrmOpportunitiesUpdateRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CrmOpportunitiesUpdateResponse](../../models/operations/CrmOpportunitiesUpdateResponse.md)**

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

Delete opportunity

### Example Usage

<!-- UsageSnippet language="java" operationID="crm.opportunitiesDelete" method="delete" path="/crm/opportunities/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmOpportunitiesDeleteRequest;
import com.apideck.unify.models.operations.CrmOpportunitiesDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        CrmOpportunitiesDeleteRequest req = CrmOpportunitiesDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        CrmOpportunitiesDeleteResponse res = sdk.crm().opportunities().delete()
                .request(req)
                .call();

        if (res.deleteOpportunityResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CrmOpportunitiesDeleteRequest](../../models/operations/CrmOpportunitiesDeleteRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CrmOpportunitiesDeleteResponse](../../models/operations/CrmOpportunitiesDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |