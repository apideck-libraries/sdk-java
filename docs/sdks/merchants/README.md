# Merchants
(*pos().merchants()*)

## Overview

### Available Operations

* [list](#list) - List Merchants
* [create](#create) - Create Merchant
* [get](#get) - Get Merchant
* [update](#update) - Update Merchant
* [delete](#delete) - Delete Merchant

## list

List Merchants

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosMerchantsAllRequest;
import com.apideck.unify.models.operations.PosMerchantsAllResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        PosMerchantsAllRequest req = PosMerchantsAllRequest.builder()
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        PosMerchantsAllResponse res = sdk.pos().merchants().list()
                .request(req)
                .call();

        if (res.getMerchantsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PosMerchantsAllRequest](../../models/operations/PosMerchantsAllRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PosMerchantsAllResponse](../../models/operations/PosMerchantsAllResponse.md)**

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

Create Merchant

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.Address;
import com.apideck.unify.models.components.Currency;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.MerchantInput;
import com.apideck.unify.models.components.MerchantStatus;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.ServiceChargeInput;
import com.apideck.unify.models.components.Type;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosMerchantsAddRequest;
import com.apideck.unify.models.operations.PosMerchantsAddResponse;
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

        PosMerchantsAddRequest req = PosMerchantsAddRequest.builder()
                .merchant(MerchantInput.builder()
                    .name("Dunkin Donuts")
                    .address(Address.builder()
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
                    .ownerId("12345")
                    .mainLocationId("12345")
                    .status(MerchantStatus.ACTIVE)
                    .serviceCharges(List.of(
                        ServiceChargeInput.builder()
                            .name("Charge for delivery")
                            .amount(27500d)
                            .percentage(12.5d)
                            .currency(Currency.USD)
                            .active(true)
                            .build()))
                    .language("EN")
                    .currency(Currency.USD)
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

        PosMerchantsAddResponse res = sdk.pos().merchants().create()
                .request(req)
                .call();

        if (res.createMerchantResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PosMerchantsAddRequest](../../models/operations/PosMerchantsAddRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PosMerchantsAddResponse](../../models/operations/PosMerchantsAddResponse.md)**

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

Get Merchant

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosMerchantsOneRequest;
import com.apideck.unify.models.operations.PosMerchantsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        PosMerchantsOneRequest req = PosMerchantsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        PosMerchantsOneResponse res = sdk.pos().merchants().get()
                .request(req)
                .call();

        if (res.getMerchantResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PosMerchantsOneRequest](../../models/operations/PosMerchantsOneRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PosMerchantsOneResponse](../../models/operations/PosMerchantsOneResponse.md)**

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

Update Merchant

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.Address;
import com.apideck.unify.models.components.Currency;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.MerchantInput;
import com.apideck.unify.models.components.MerchantStatus;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.ServiceChargeInput;
import com.apideck.unify.models.components.Type;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosMerchantsUpdateRequest;
import com.apideck.unify.models.operations.PosMerchantsUpdateResponse;
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

        PosMerchantsUpdateRequest req = PosMerchantsUpdateRequest.builder()
                .id("<id>")
                .merchant(MerchantInput.builder()
                    .name("Dunkin Donuts")
                    .address(Address.builder()
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
                    .ownerId("12345")
                    .mainLocationId("12345")
                    .status(MerchantStatus.ACTIVE)
                    .serviceCharges(List.of(
                        ServiceChargeInput.builder()
                            .name("Charge for delivery")
                            .amount(27500d)
                            .percentage(12.5d)
                            .currency(Currency.USD)
                            .active(true)
                            .build()))
                    .language("EN")
                    .currency(Currency.USD)
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

        PosMerchantsUpdateResponse res = sdk.pos().merchants().update()
                .request(req)
                .call();

        if (res.updateMerchantResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PosMerchantsUpdateRequest](../../models/operations/PosMerchantsUpdateRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PosMerchantsUpdateResponse](../../models/operations/PosMerchantsUpdateResponse.md)**

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

Delete Merchant

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosMerchantsDeleteRequest;
import com.apideck.unify.models.operations.PosMerchantsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        PosMerchantsDeleteRequest req = PosMerchantsDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        PosMerchantsDeleteResponse res = sdk.pos().merchants().delete()
                .request(req)
                .call();

        if (res.deleteMerchantResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PosMerchantsDeleteRequest](../../models/operations/PosMerchantsDeleteRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PosMerchantsDeleteResponse](../../models/operations/PosMerchantsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |