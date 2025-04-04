# Applicants
(*ats().applicants()*)

## Overview

### Available Operations

* [list](#list) - List Applicants
* [create](#create) - Create Applicant
* [get](#get) - Get Applicant
* [update](#update) - Update Applicant
* [delete](#delete) - Delete Applicant

## list

List Applicants

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.ApplicantsFilter;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AtsApplicantsAllRequest;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AtsApplicantsAllRequest req = AtsApplicantsAllRequest.builder()
                .serviceId("salesforce")
                .filter(ApplicantsFilter.builder()
                    .jobId("1234")
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();

        sdk.ats().applicants().list()
                .request(req)
                .callAsStream()
                .forEach(item -> {
                   // handle item again
                });

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [AtsApplicantsAllRequest](../../models/operations/AtsApplicantsAllRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[AtsApplicantsAllResponse](../../models/operations/AtsApplicantsAllResponse.md)**

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

Create Applicant

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AtsApplicantsAddRequest;
import com.apideck.unify.models.operations.AtsApplicantsAddResponse;
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

        AtsApplicantsAddRequest req = AtsApplicantsAddRequest.builder()
                .applicant(ApplicantInput.builder()
                    .name("Elon Musk")
                    .firstName("Elon")
                    .lastName("Musk")
                    .middleName("D.")
                    .initials("EM")
                    .birthday(LocalDate.parse("2000-08-12"))
                    .coverLetter("I submit this application to express my sincere interest in the API developer position. In the previous role, I was responsible for leadership and ...")
                    .photoUrl("https://unavatar.io/elon-musk")
                    .headline("PepsiCo, Inc, Central Perk")
                    .title("CEO")
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
                    .customFields(List.of(
                        CustomField.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(Value.of(true))
                            .build(),
                        CustomField.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(Value.of("Uses Salesforce and Marketo"))
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
                    .websites(List.of(
                        Websites.builder()
                            .url("http://example.com")
                            .id("12345")
                            .type(ApplicantType.PRIMARY)
                            .build(),
                        Websites.builder()
                            .url("http://example.com")
                            .id("12345")
                            .type(ApplicantType.PRIMARY)
                            .build(),
                        Websites.builder()
                            .url("http://example.com")
                            .id("12345")
                            .type(ApplicantType.PRIMARY)
                            .build()))
                    .socialLinks(List.of(
                        SocialLinks.builder()
                            .url("https://www.twitter.com/apideck")
                            .id("12345")
                            .type("twitter")
                            .build()))
                    .stageId("12345")
                    .recruiterId("12345")
                    .coordinatorId("12345")
                    .applicationIds(List.of(
                        "a0d636c6-43b3-4bde-8c70-85b707d992f4",
                        "a98lfd96-43b3-4bde-8c70-85b707d992e6"))
                    .applications(List.of(
                        "a0d636c6-43b3-4bde-8c70-85b707d992f4",
                        "a98lfd96-43b3-4bde-8c70-85b707d992e6"))
                    .followers(List.of(
                        "a0d636c6-43b3-4bde-8c70-85b707d992f4",
                        "a98lfd96-43b3-4bde-8c70-85b707d992e6"))
                    .sources(List.of(
                        "Job site"))
                    .confidential(false)
                    .anonymized(true)
                    .tags(List.of(
                        "New"))
                    .archived(false)
                    .ownerId("54321")
                    .recordUrl("https://app.intercom.io/contacts/12345")
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
                            .build()))
                    .build())
                .serviceId("salesforce")
                .build();

        AtsApplicantsAddResponse res = sdk.ats().applicants().create()
                .request(req)
                .call();

        if (res.createApplicantResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [AtsApplicantsAddRequest](../../models/operations/AtsApplicantsAddRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[AtsApplicantsAddResponse](../../models/operations/AtsApplicantsAddResponse.md)**

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

Get Applicant

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AtsApplicantsOneRequest;
import com.apideck.unify.models.operations.AtsApplicantsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AtsApplicantsOneRequest req = AtsApplicantsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        AtsApplicantsOneResponse res = sdk.ats().applicants().get()
                .request(req)
                .call();

        if (res.getApplicantResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [AtsApplicantsOneRequest](../../models/operations/AtsApplicantsOneRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[AtsApplicantsOneResponse](../../models/operations/AtsApplicantsOneResponse.md)**

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

Update Applicant

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AtsApplicantsUpdateRequest;
import com.apideck.unify.models.operations.AtsApplicantsUpdateResponse;
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

        AtsApplicantsUpdateRequest req = AtsApplicantsUpdateRequest.builder()
                .id("<id>")
                .applicant(ApplicantInput.builder()
                    .name("Elon Musk")
                    .firstName("Elon")
                    .lastName("Musk")
                    .middleName("D.")
                    .initials("EM")
                    .birthday(LocalDate.parse("2000-08-12"))
                    .coverLetter("I submit this application to express my sincere interest in the API developer position. In the previous role, I was responsible for leadership and ...")
                    .photoUrl("https://unavatar.io/elon-musk")
                    .headline("PepsiCo, Inc, Central Perk")
                    .title("CEO")
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
                            .build(),
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
                            .value(Value.of(true))
                            .build(),
                        CustomField.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(Value.of6(List.of(
                                Six.builder()
                                    .build(),
                                Six.builder()
                                    .build())))
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
                    .websites(List.of(
                        Websites.builder()
                            .url("http://example.com")
                            .id("12345")
                            .type(ApplicantType.PRIMARY)
                            .build()))
                    .socialLinks(List.of(
                        SocialLinks.builder()
                            .url("https://www.twitter.com/apideck")
                            .id("12345")
                            .type("twitter")
                            .build(),
                        SocialLinks.builder()
                            .url("https://www.twitter.com/apideck")
                            .id("12345")
                            .type("twitter")
                            .build(),
                        SocialLinks.builder()
                            .url("https://www.twitter.com/apideck")
                            .id("12345")
                            .type("twitter")
                            .build()))
                    .stageId("12345")
                    .recruiterId("12345")
                    .coordinatorId("12345")
                    .applicationIds(List.of(
                        "a0d636c6-43b3-4bde-8c70-85b707d992f4",
                        "a98lfd96-43b3-4bde-8c70-85b707d992e6"))
                    .applications(List.of(
                        "a0d636c6-43b3-4bde-8c70-85b707d992f4",
                        "a98lfd96-43b3-4bde-8c70-85b707d992e6"))
                    .followers(List.of(
                        "a0d636c6-43b3-4bde-8c70-85b707d992f4",
                        "a98lfd96-43b3-4bde-8c70-85b707d992e6"))
                    .sources(List.of(
                        "Job site"))
                    .confidential(false)
                    .anonymized(true)
                    .tags(List.of(
                        "New"))
                    .archived(false)
                    .ownerId("54321")
                    .recordUrl("https://app.intercom.io/contacts/12345")
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

        AtsApplicantsUpdateResponse res = sdk.ats().applicants().update()
                .request(req)
                .call();

        if (res.updateApplicantResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [AtsApplicantsUpdateRequest](../../models/operations/AtsApplicantsUpdateRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[AtsApplicantsUpdateResponse](../../models/operations/AtsApplicantsUpdateResponse.md)**

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

Delete Applicant

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AtsApplicantsDeleteRequest;
import com.apideck.unify.models.operations.AtsApplicantsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AtsApplicantsDeleteRequest req = AtsApplicantsDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AtsApplicantsDeleteResponse res = sdk.ats().applicants().delete()
                .request(req)
                .call();

        if (res.deleteApplicantResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [AtsApplicantsDeleteRequest](../../models/operations/AtsApplicantsDeleteRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[AtsApplicantsDeleteResponse](../../models/operations/AtsApplicantsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |