# ApideckLeads
(*lead().leads()*)

## Overview

### Available Operations

* [list](#list) - List leads
* [create](#create) - Create lead
* [get](#get) - Get lead
* [update](#update) - Update lead
* [delete](#delete) - Delete lead

## list

List leads

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.LeadsFilter;
import com.apideck.unify.models.components.LeadsSort;
import com.apideck.unify.models.components.LeadsSortBy;
import com.apideck.unify.models.components.SortDirection;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.LeadLeadsAllRequest;
import com.apideck.unify.models.operations.LeadLeadsAllResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        LeadLeadsAllRequest req = LeadLeadsAllRequest.builder()
                .serviceId("salesforce")
                .filter(LeadsFilter.builder()
                    .name("Elon Musk")
                    .firstName("Elon")
                    .lastName("Musk")
                    .email("elon@tesla.com")
                    .phoneNumber("1234567890")
                    .build())
                .sort(LeadsSort.builder()
                    .by(LeadsSortBy.CREATED_AT)
                    .direction(SortDirection.DESC)
                    .build())
                .fields("id,updated_at")
                .build();

        LeadLeadsAllResponse res = sdk.lead().leads().list()
                .request(req)
                .call();

        if (res.getLeadsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [LeadLeadsAllRequest](../../models/operations/LeadLeadsAllRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[LeadLeadsAllResponse](../../models/operations/LeadLeadsAllResponse.md)**

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

Create lead

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.Address;
import com.apideck.unify.models.components.Currency;
import com.apideck.unify.models.components.CustomField;
import com.apideck.unify.models.components.Email;
import com.apideck.unify.models.components.EmailType;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.LeadInput;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.PhoneNumber;
import com.apideck.unify.models.components.PhoneNumberType;
import com.apideck.unify.models.components.SocialLink;
import com.apideck.unify.models.components.Type;
import com.apideck.unify.models.components.Value;
import com.apideck.unify.models.components.Website;
import com.apideck.unify.models.components.WebsiteType;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.LeadLeadsAddRequest;
import com.apideck.unify.models.operations.LeadLeadsAddResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        LeadLeadsAddRequest req = LeadLeadsAddRequest.builder()
                .lead(LeadInput.builder()
                    .name("Elon Musk")
                    .companyName("Spacex")
                    .ownerId("54321")
                    .ownerName("John Doe")
                    .companyId("2")
                    .leadId("2")
                    .leadSource("Cold Call")
                    .firstName("Elon")
                    .lastName("Musk")
                    .description("A thinker")
                    .prefix("Sir")
                    .title("CEO")
                    .language("EN")
                    .status("New")
                    .monetaryAmount(75000d)
                    .currency(Currency.USD)
                    .fax("+12129876543")
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
                            .value(Value.of(true))
                            .build()))
                    .tags(List.of(
                        "New"))
                    .passThrough(List.of(
                        PassThroughBody.builder()
                            .serviceId("<id>")
                            .extendPaths(List.of(
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(\n    Map.entry("TaxClassificationRef", Map.ofEntries(\n    Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build()))
                            .build()))
                    .build())
                .serviceId("salesforce")
                .build();

        LeadLeadsAddResponse res = sdk.lead().leads().create()
                .request(req)
                .call();

        if (res.createLeadResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [LeadLeadsAddRequest](../../models/operations/LeadLeadsAddRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[LeadLeadsAddResponse](../../models/operations/LeadLeadsAddResponse.md)**

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

Get lead

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.LeadLeadsOneRequest;
import com.apideck.unify.models.operations.LeadLeadsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        LeadLeadsOneRequest req = LeadLeadsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        LeadLeadsOneResponse res = sdk.lead().leads().get()
                .request(req)
                .call();

        if (res.getLeadResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [LeadLeadsOneRequest](../../models/operations/LeadLeadsOneRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[LeadLeadsOneResponse](../../models/operations/LeadLeadsOneResponse.md)**

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

Update lead

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.Address;
import com.apideck.unify.models.components.Currency;
import com.apideck.unify.models.components.CustomField;
import com.apideck.unify.models.components.Email;
import com.apideck.unify.models.components.EmailType;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.LeadInput;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.PhoneNumber;
import com.apideck.unify.models.components.PhoneNumberType;
import com.apideck.unify.models.components.Six;
import com.apideck.unify.models.components.SocialLink;
import com.apideck.unify.models.components.Type;
import com.apideck.unify.models.components.Value;
import com.apideck.unify.models.components.Website;
import com.apideck.unify.models.components.WebsiteType;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.LeadLeadsUpdateRequest;
import com.apideck.unify.models.operations.LeadLeadsUpdateResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        LeadLeadsUpdateRequest req = LeadLeadsUpdateRequest.builder()
                .id("<id>")
                .lead(LeadInput.builder()
                    .name("Elon Musk")
                    .companyName("Spacex")
                    .ownerId("54321")
                    .ownerName("John Doe")
                    .companyId("2")
                    .leadId("2")
                    .leadSource("Cold Call")
                    .firstName("Elon")
                    .lastName("Musk")
                    .description("A thinker")
                    .prefix("Sir")
                    .title("CEO")
                    .language("EN")
                    .status("New")
                    .monetaryAmount(75000d)
                    .currency(Currency.USD)
                    .fax("+12129876543")
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
                            .value(Value.of6(List.of(
                                Six.builder()
                                    .build())))
                            .build()))
                    .tags(List.of(
                        "New"))
                    .passThrough(List.of(
                        PassThroughBody.builder()
                            .serviceId("<id>")
                            .extendPaths(List.of(
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(\n    Map.entry("TaxClassificationRef", Map.ofEntries(\n    Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build()))
                            .build()))
                    .build())
                .serviceId("salesforce")
                .build();

        LeadLeadsUpdateResponse res = sdk.lead().leads().update()
                .request(req)
                .call();

        if (res.updateLeadResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [LeadLeadsUpdateRequest](../../models/operations/LeadLeadsUpdateRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[LeadLeadsUpdateResponse](../../models/operations/LeadLeadsUpdateResponse.md)**

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

Delete lead

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.LeadLeadsDeleteRequest;
import com.apideck.unify.models.operations.LeadLeadsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        LeadLeadsDeleteRequest req = LeadLeadsDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        LeadLeadsDeleteResponse res = sdk.lead().leads().delete()
                .request(req)
                .call();

        if (res.deleteLeadResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [LeadLeadsDeleteRequest](../../models/operations/LeadLeadsDeleteRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[LeadLeadsDeleteResponse](../../models/operations/LeadLeadsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |