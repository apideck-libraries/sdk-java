# Activities
(*crm().activities()*)

## Overview

### Available Operations

* [list](#list) - List activities
* [create](#create) - Create activity
* [get](#get) - Get activity
* [update](#update) - Update activity
* [delete](#delete) - Delete activity

## list

List activities

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmActivitiesAllRequest;
import com.apideck.unify.models.operations.CrmActivitiesAllResponse;
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

        CrmActivitiesAllRequest req = CrmActivitiesAllRequest.builder()
                .serviceId("salesforce")
                .filter(ActivitiesFilter.builder()
                    .updatedSince(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .build())
                .sort(ActivitiesSort.builder()
                    .by(ActivitiesSortBy.CREATED_AT)
                    .direction(SortDirection.DESC)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();

        sdk.crm().activities().list()
                .request(req)
                .callAsStream()
                .forEach((CrmActivitiesAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CrmActivitiesAllRequest](../../models/operations/CrmActivitiesAllRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CrmActivitiesAllResponse](../../models/operations/CrmActivitiesAllResponse.md)**

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

Create activity

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmActivitiesAddRequest;
import com.apideck.unify.models.operations.CrmActivitiesAddResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        CrmActivitiesAddRequest req = CrmActivitiesAddRequest.builder()
                .activity(ActivityInput.builder()
                    .type(ActivityType.MEETING)
                    .activityDatetime("2021-05-01T12:00:00.000Z")
                    .durationSeconds(1800L)
                    .userId("12345")
                    .accountId("12345")
                    .contactId("12345")
                    .companyId("12345")
                    .opportunityId("12345")
                    .leadId("12345")
                    .ownerId("12345")
                    .campaignId("12345")
                    .caseId("12345")
                    .assetId("12345")
                    .contractId("12345")
                    .productId("12345")
                    .solutionId("12345")
                    .customObjectId("12345")
                    .title("Meeting")
                    .description("More info about the meeting")
                    .note("An internal note about the meeting")
                    .location("Space")
                    .locationAddress(Address.builder()
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
                    .allDayEvent(false)
                    .private_(true)
                    .groupEvent(true)
                    .eventSubType("debrief")
                    .groupEventType("Proposed")
                    .child(false)
                    .archived(false)
                    .deleted(false)
                    .showAs(ShowAs.BUSY)
                    .done(false)
                    .startDatetime("2021-05-01T12:00:00.000Z")
                    .endDatetime("2021-05-01T12:30:00.000Z")
                    .activityDate("2021-05-01")
                    .endDate("2021-05-01")
                    .recurrent(false)
                    .reminderDatetime("2021-05-01T17:00:00.000Z")
                    .reminderSet(false)
                    .videoConferenceUrl("https://us02web.zoom.us/j/88120759396")
                    .videoConferenceId("zoom:88120759396")
                    .customFields(List.of(
                        CustomField.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(JsonNullable.of(null))
                            .build()))
                    .attendees(List.of(
                        ActivityAttendeeInput.builder()
                            .name("Elon Musk")
                            .firstName("Elon")
                            .middleName("D.")
                            .lastName("Musk")
                            .prefix("Mr.")
                            .suffix("PhD")
                            .emailAddress("elon@musk.com")
                            .isOrganizer(true)
                            .status(ActivityAttendeeStatus.ACCEPTED)
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
                                    .build()))
                            .build()))
                    .build())
                .serviceId("salesforce")
                .build();

        CrmActivitiesAddResponse res = sdk.crm().activities().create()
                .request(req)
                .call();

        if (res.createActivityResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CrmActivitiesAddRequest](../../models/operations/CrmActivitiesAddRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CrmActivitiesAddResponse](../../models/operations/CrmActivitiesAddResponse.md)**

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

Get activity

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmActivitiesOneRequest;
import com.apideck.unify.models.operations.CrmActivitiesOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        CrmActivitiesOneRequest req = CrmActivitiesOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        CrmActivitiesOneResponse res = sdk.crm().activities().get()
                .request(req)
                .call();

        if (res.getActivityResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CrmActivitiesOneRequest](../../models/operations/CrmActivitiesOneRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CrmActivitiesOneResponse](../../models/operations/CrmActivitiesOneResponse.md)**

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

Update activity

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmActivitiesUpdateRequest;
import com.apideck.unify.models.operations.CrmActivitiesUpdateResponse;
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

        CrmActivitiesUpdateRequest req = CrmActivitiesUpdateRequest.builder()
                .id("<id>")
                .activity(ActivityInput.builder()
                    .type(ActivityType.MEETING)
                    .activityDatetime("2021-05-01T12:00:00.000Z")
                    .durationSeconds(1800L)
                    .userId("12345")
                    .accountId("12345")
                    .contactId("12345")
                    .companyId("12345")
                    .opportunityId("12345")
                    .leadId("12345")
                    .ownerId("12345")
                    .campaignId("12345")
                    .caseId("12345")
                    .assetId("12345")
                    .contractId("12345")
                    .productId("12345")
                    .solutionId("12345")
                    .customObjectId("12345")
                    .title("Meeting")
                    .description("More info about the meeting")
                    .note("An internal note about the meeting")
                    .location("Space")
                    .locationAddress(Address.builder()
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
                    .allDayEvent(false)
                    .private_(true)
                    .groupEvent(true)
                    .eventSubType("debrief")
                    .groupEventType("Proposed")
                    .child(false)
                    .archived(false)
                    .deleted(false)
                    .showAs(ShowAs.BUSY)
                    .done(false)
                    .startDatetime("2021-05-01T12:00:00.000Z")
                    .endDatetime("2021-05-01T12:30:00.000Z")
                    .activityDate("2021-05-01")
                    .endDate("2021-05-01")
                    .recurrent(false)
                    .reminderDatetime("2021-05-01T17:00:00.000Z")
                    .reminderSet(false)
                    .videoConferenceUrl("https://us02web.zoom.us/j/88120759396")
                    .videoConferenceId("zoom:88120759396")
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
                    .attendees(List.of(
                        ActivityAttendeeInput.builder()
                            .name("Elon Musk")
                            .firstName("Elon")
                            .middleName("D.")
                            .lastName("Musk")
                            .prefix("Mr.")
                            .suffix("PhD")
                            .emailAddress("elon@musk.com")
                            .isOrganizer(true)
                            .status(ActivityAttendeeStatus.ACCEPTED)
                            .build(),
                        ActivityAttendeeInput.builder()
                            .name("Elon Musk")
                            .firstName("Elon")
                            .middleName("D.")
                            .lastName("Musk")
                            .prefix("Mr.")
                            .suffix("PhD")
                            .emailAddress("elon@musk.com")
                            .isOrganizer(true)
                            .status(ActivityAttendeeStatus.ACCEPTED)
                            .build(),
                        ActivityAttendeeInput.builder()
                            .name("Elon Musk")
                            .firstName("Elon")
                            .middleName("D.")
                            .lastName("Musk")
                            .prefix("Mr.")
                            .suffix("PhD")
                            .emailAddress("elon@musk.com")
                            .isOrganizer(true)
                            .status(ActivityAttendeeStatus.ACCEPTED)
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

        CrmActivitiesUpdateResponse res = sdk.crm().activities().update()
                .request(req)
                .call();

        if (res.updateActivityResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CrmActivitiesUpdateRequest](../../models/operations/CrmActivitiesUpdateRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CrmActivitiesUpdateResponse](../../models/operations/CrmActivitiesUpdateResponse.md)**

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

Delete activity

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmActivitiesDeleteRequest;
import com.apideck.unify.models.operations.CrmActivitiesDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        CrmActivitiesDeleteRequest req = CrmActivitiesDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        CrmActivitiesDeleteResponse res = sdk.crm().activities().delete()
                .request(req)
                .call();

        if (res.deleteActivityResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CrmActivitiesDeleteRequest](../../models/operations/CrmActivitiesDeleteRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CrmActivitiesDeleteResponse](../../models/operations/CrmActivitiesDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |