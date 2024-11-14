# ApideckPayments
(*pos().payments()*)

## Overview

### Available Operations

* [list](#list) - List Payments
* [create](#create) - Create Payment
* [get](#get) - Get Payment
* [update](#update) - Update Payment
* [delete](#delete) - Delete Payment

## list

List Payments

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosPaymentsAllRequest;
import com.apideck.unify.models.operations.PosPaymentsAllResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        PosPaymentsAllRequest req = PosPaymentsAllRequest.builder()
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        PosPaymentsAllResponse res = sdk.pos().payments().list()
                .request(req)
                .call();

        if (res.getPosPaymentsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PosPaymentsAllRequest](../../models/operations/PosPaymentsAllRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PosPaymentsAllResponse](../../models/operations/PosPaymentsAllResponse.md)**

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

Create Payment

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.Address;
import com.apideck.unify.models.components.CardType;
import com.apideck.unify.models.components.Currency;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.ExternalDetails;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.PaymentCardInput;
import com.apideck.unify.models.components.PosBankAccount;
import com.apideck.unify.models.components.PosPaymentCardDetails;
import com.apideck.unify.models.components.PosPaymentInput;
import com.apideck.unify.models.components.PosPaymentProcessingFeesType;
import com.apideck.unify.models.components.PosPaymentSource;
import com.apideck.unify.models.components.PosPaymentStatusStatus;
import com.apideck.unify.models.components.PosPaymentType;
import com.apideck.unify.models.components.PrepaidType;
import com.apideck.unify.models.components.ProcessingFees;
import com.apideck.unify.models.components.ServiceChargeInput;
import com.apideck.unify.models.components.Type;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosPaymentsAddRequest;
import com.apideck.unify.models.operations.PosPaymentsAddResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        PosPaymentsAddRequest req = PosPaymentsAddRequest.builder()
                .posPayment(PosPaymentInput.builder()
                    .sourceId("12345")
                    .orderId("12345")
                    .customerId("12345")
                    .tenderId("12345")
                    .amount(27.5d)
                    .currency(Currency.USD)
                    .merchantId("12345")
                    .employeeId("12345")
                    .locationId("12345")
                    .deviceId("12345")
                    .externalPaymentId("12345")
                    .idempotencyKey("random_string")
                    .tip(7d)
                    .tax(20d)
                    .total(37.5d)
                    .appFee(3d)
                    .changeBackCashAmount(20d)
                    .approved(37.5d)
                    .refunded(37.5d)
                    .processingFees(List.of(
                        ProcessingFees.builder()
                            .amount(1.05d)
                            .effectiveAt(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                            .processingType(PosPaymentProcessingFeesType.INITIAL)
                            .build()))
                    .source(PosPaymentSource.EXTERNAL)
                    .status(PosPaymentStatusStatus.APPROVED)
                    .cardDetails(PosPaymentCardDetails.builder()
                        .card(PaymentCardInput.builder()
                            .bin("41111")
                            .cardType(CardType.CREDIT)
                            .prepaidType(PrepaidType.PREPAID)
                            .cardholderName("John Doe")
                            .customerId("12345")
                            .merchantId("12345")
                            .expMonth(1L)
                            .expYear(2022L)
                            .fingerprint(" Intended as a POS-assigned identifier, based on the card number, to identify the card across multiple locations within a single application.")
                            .last4("The last 4 digits of the card number.")
                            .enabled(true)
                            .billingAddress(Address.builder()
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
                            .referenceId("card-001")
                            .version("230320320320")
                            .build())
                        .build())
                    .bankAccount(PosBankAccount.builder()
                        .country("US")
                        .build())
                    .externalDetails(ExternalDetails.builder()
                        .type(PosPaymentType.SOCIAL)
                        .source("<value>")
                        .sourceFeeAmount(2.5d)
                        .build())
                    .serviceCharges(List.of(
                        ServiceChargeInput.builder()
                            .name("Charge for delivery")
                            .amount(27500d)
                            .percentage(12.5d)
                            .currency(Currency.USD)
                            .active(true)
                            .build()))
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

        PosPaymentsAddResponse res = sdk.pos().payments().create()
                .request(req)
                .call();

        if (res.createPosPaymentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PosPaymentsAddRequest](../../models/operations/PosPaymentsAddRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PosPaymentsAddResponse](../../models/operations/PosPaymentsAddResponse.md)**

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

Get Payment

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosPaymentsOneRequest;
import com.apideck.unify.models.operations.PosPaymentsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        PosPaymentsOneRequest req = PosPaymentsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        PosPaymentsOneResponse res = sdk.pos().payments().get()
                .request(req)
                .call();

        if (res.getPosPaymentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PosPaymentsOneRequest](../../models/operations/PosPaymentsOneRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PosPaymentsOneResponse](../../models/operations/PosPaymentsOneResponse.md)**

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

Update Payment

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.Address;
import com.apideck.unify.models.components.CardType;
import com.apideck.unify.models.components.Currency;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.ExternalDetails;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.PaymentCardInput;
import com.apideck.unify.models.components.PosBankAccount;
import com.apideck.unify.models.components.PosPaymentCardDetails;
import com.apideck.unify.models.components.PosPaymentInput;
import com.apideck.unify.models.components.PosPaymentProcessingFeesType;
import com.apideck.unify.models.components.PosPaymentSource;
import com.apideck.unify.models.components.PosPaymentStatusStatus;
import com.apideck.unify.models.components.PosPaymentType;
import com.apideck.unify.models.components.PrepaidType;
import com.apideck.unify.models.components.ProcessingFees;
import com.apideck.unify.models.components.ServiceChargeInput;
import com.apideck.unify.models.components.Type;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosPaymentsUpdateRequest;
import com.apideck.unify.models.operations.PosPaymentsUpdateResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        PosPaymentsUpdateRequest req = PosPaymentsUpdateRequest.builder()
                .id("<id>")
                .posPayment(PosPaymentInput.builder()
                    .sourceId("12345")
                    .orderId("12345")
                    .customerId("12345")
                    .tenderId("12345")
                    .amount(27.5d)
                    .currency(Currency.USD)
                    .merchantId("12345")
                    .employeeId("12345")
                    .locationId("12345")
                    .deviceId("12345")
                    .externalPaymentId("12345")
                    .idempotencyKey("random_string")
                    .tip(7d)
                    .tax(20d)
                    .total(37.5d)
                    .appFee(3d)
                    .changeBackCashAmount(20d)
                    .approved(37.5d)
                    .refunded(37.5d)
                    .processingFees(List.of(
                        ProcessingFees.builder()
                            .amount(1.05d)
                            .effectiveAt(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                            .processingType(PosPaymentProcessingFeesType.INITIAL)
                            .build()))
                    .source(PosPaymentSource.EXTERNAL)
                    .status(PosPaymentStatusStatus.APPROVED)
                    .cardDetails(PosPaymentCardDetails.builder()
                        .card(PaymentCardInput.builder()
                            .bin("41111")
                            .cardType(CardType.CREDIT)
                            .prepaidType(PrepaidType.PREPAID)
                            .cardholderName("John Doe")
                            .customerId("12345")
                            .merchantId("12345")
                            .expMonth(1L)
                            .expYear(2022L)
                            .fingerprint(" Intended as a POS-assigned identifier, based on the card number, to identify the card across multiple locations within a single application.")
                            .last4("The last 4 digits of the card number.")
                            .enabled(true)
                            .billingAddress(Address.builder()
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
                            .referenceId("card-001")
                            .version("230320320320")
                            .build())
                        .build())
                    .bankAccount(PosBankAccount.builder()
                        .country("US")
                        .build())
                    .externalDetails(ExternalDetails.builder()
                        .type(PosPaymentType.FOOD_VOUCHER)
                        .source("<value>")
                        .sourceFeeAmount(2.5d)
                        .build())
                    .serviceCharges(List.of(
                        ServiceChargeInput.builder()
                            .name("Charge for delivery")
                            .amount(27500d)
                            .percentage(12.5d)
                            .currency(Currency.USD)
                            .active(true)
                            .build()))
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

        PosPaymentsUpdateResponse res = sdk.pos().payments().update()
                .request(req)
                .call();

        if (res.updatePosPaymentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PosPaymentsUpdateRequest](../../models/operations/PosPaymentsUpdateRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PosPaymentsUpdateResponse](../../models/operations/PosPaymentsUpdateResponse.md)**

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

Delete Payment

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosPaymentsDeleteRequest;
import com.apideck.unify.models.operations.PosPaymentsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        PosPaymentsDeleteRequest req = PosPaymentsDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        PosPaymentsDeleteResponse res = sdk.pos().payments().delete()
                .request(req)
                .call();

        if (res.deletePosPaymentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PosPaymentsDeleteRequest](../../models/operations/PosPaymentsDeleteRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PosPaymentsDeleteResponse](../../models/operations/PosPaymentsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |