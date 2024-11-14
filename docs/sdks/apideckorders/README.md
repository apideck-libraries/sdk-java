# ApideckOrders
(*pos().orders()*)

## Overview

### Available Operations

* [list](#list) - List Orders
* [create](#create) - Create Order
* [get](#get) - Get Order
* [update](#update) - Update Order
* [delete](#delete) - Delete Order
* [pay](#pay) - Pay Order

## list

List Orders

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosOrdersAllRequest;
import com.apideck.unify.models.operations.PosOrdersAllResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        PosOrdersAllRequest req = PosOrdersAllRequest.builder()
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        PosOrdersAllResponse res = sdk.pos().orders().list()
                .request(req)
                .call();

        if (res.getOrdersResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [PosOrdersAllRequest](../../models/operations/PosOrdersAllRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[PosOrdersAllResponse](../../models/operations/PosOrdersAllResponse.md)**

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

Create Order

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.Address;
import com.apideck.unify.models.components.CardEntryMethod;
import com.apideck.unify.models.components.CardStatus;
import com.apideck.unify.models.components.CardType;
import com.apideck.unify.models.components.CurbsidePickupDetails;
import com.apideck.unify.models.components.Currency;
import com.apideck.unify.models.components.Customers;
import com.apideck.unify.models.components.Email;
import com.apideck.unify.models.components.EmailType;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.OrderAppliedDiscounts;
import com.apideck.unify.models.components.OrderAppliedTaxes;
import com.apideck.unify.models.components.OrderDiscounts;
import com.apideck.unify.models.components.OrderDiscountsScope;
import com.apideck.unify.models.components.OrderDiscountsType;
import com.apideck.unify.models.components.OrderFulfillments;
import com.apideck.unify.models.components.OrderFulfillmentsType;
import com.apideck.unify.models.components.OrderInput;
import com.apideck.unify.models.components.OrderLineItems;
import com.apideck.unify.models.components.OrderModifiers;
import com.apideck.unify.models.components.OrderPayments;
import com.apideck.unify.models.components.OrderPickupDetails;
import com.apideck.unify.models.components.OrderRefunds;
import com.apideck.unify.models.components.OrderStatus;
import com.apideck.unify.models.components.OrderTenders;
import com.apideck.unify.models.components.OrderTendersType;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.PaymentCardInput;
import com.apideck.unify.models.components.PhoneNumber;
import com.apideck.unify.models.components.PhoneNumberType;
import com.apideck.unify.models.components.PosPaymentStatus;
import com.apideck.unify.models.components.PrepaidType;
import com.apideck.unify.models.components.Recipient;
import com.apideck.unify.models.components.ServiceChargeInput;
import com.apideck.unify.models.components.Taxes;
import com.apideck.unify.models.components.Type;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosOrdersAddRequest;
import com.apideck.unify.models.operations.PosOrdersAddResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        PosOrdersAddRequest req = PosOrdersAddRequest.builder()
                .order(OrderInput.builder()
                    .merchantId("12345")
                    .locationId("12345")
                    .idempotencyKey("random_string")
                    .orderNumber("1F")
                    .orderDate(LocalDate.parse("2022-08-12"))
                    .closedDate(LocalDate.parse("2022-08-13"))
                    .referenceId("my-order-001")
                    .status(OrderStatus.OPEN)
                    .paymentStatus(PosPaymentStatus.OPEN)
                    .currency(Currency.USD)
                    .customerId("12345")
                    .employeeId("12345")
                    .orderTypeId("12345")
                    .table("1F")
                    .seat("23F")
                    .totalAmount(275L)
                    .totalTip(700L)
                    .totalTax(275L)
                    .totalDiscount(300L)
                    .totalRefund(0L)
                    .totalServiceCharge(0L)
                    .refunded(false)
                    .customers(List.of(
                        Customers.builder()
                            .id("12345")
                            .firstName("Elon")
                            .middleName("D.")
                            .lastName("Musk")
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
                            .build()))
                    .fulfillments(List.of(
                        OrderFulfillments.builder()
                            .id("12345")
                            .type(OrderFulfillmentsType.SHIPMENT)
                            .pickupDetails(OrderPickupDetails.builder()
                                .autoCompleteDuration("P1W3D")
                                .cancelReason("Not hungry")
                                .expiresAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .pickupAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .pickupWindowDuration("P1W3D")
                                .prepTimeDuration("P1W3D")
                                .note("Pickup in the back.")
                                .placedAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .rejectedAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .readyAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .expiredAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .pickedUpAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .canceledAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .curbsidePickupDetails(CurbsidePickupDetails.builder()
                                    .buyerArrivedAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                    .build())
                                .recipient(Recipient.builder()
                                    .customerId("12345")
                                    .displayName("Elon Musk")
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
                                    .phoneNumber(PhoneNumber.builder()
                                        .number("111-111-1111")
                                        .id("12345")
                                        .countryCode("1")
                                        .areaCode("323")
                                        .extension("105")
                                        .type(PhoneNumberType.PRIMARY)
                                        .build())
                                    .email(Email.builder()
                                        .email("elon@musk.com")
                                        .id("123")
                                        .type(EmailType.PRIMARY)
                                        .build())
                                    .build())
                                .build())
                            .build()))
                    .lineItems(List.of(
                        OrderLineItems.builder()
                            .name("New York Strip Steak")
                            .totalTax(2000L)
                            .totalDiscount(3000L)
                            .totalAmount(27500L)
                            .quantity(1d)
                            .unitPrice(27500.5d)
                            .appliedTaxes(List.of(
                                OrderAppliedTaxes.builder()
                                    .taxId("sales-tax")
                                    .amount(27500L)
                                    .currency(Currency.USD)
                                    .build()))
                            .appliedDiscounts(List.of(
                                OrderAppliedDiscounts.builder()
                                    .discountId("12345")
                                    .amount(27500L)
                                    .currency(Currency.USD)
                                    .build()))
                            .modifiers(List.of(
                                OrderModifiers.builder()
                                    .id("12345")
                                    .name("New York Strip Steak - no cheese")
                                    .amount(27500L)
                                    .currency(Currency.USD)
                                    .alternateName("Modifier New")
                                    .modifierGroupId("123")
                                    .build()))
                            .build()))
                    .payments(List.of(
                        OrderPayments.builder()
                            .amount(27500L)
                            .currency(Currency.USD)
                            .build()))
                    .serviceCharges(List.of(
                        ServiceChargeInput.builder()
                            .name("Charge for delivery")
                            .amount(27500d)
                            .percentage(12.5d)
                            .currency(Currency.USD)
                            .active(true)
                            .build()))
                    .refunds(List.of(
                        OrderRefunds.builder()
                            .amount(27500L)
                            .currency(Currency.USD)
                            .reason("The reason for the refund being issued.")
                            .build()))
                    .taxes(List.of(
                        Taxes.builder()
                            .id("state-sales-tax")
                            .name("State Sales Tax")
                            .amount(27500L)
                            .currency(Currency.USD)
                            .percentage(15d)
                            .autoApplied(true)
                            .build()))
                    .discounts(List.of(
                        OrderDiscounts.builder()
                            .type(OrderDiscountsType.PERCENTAGE)
                            .name("10% off")
                            .amount(27500L)
                            .currency(Currency.USD)
                            .scope(OrderDiscountsScope.ORDER)
                            .build()))
                    .tenders(List.of(
                        OrderTenders.builder()
                            .name("10% off")
                            .type(OrderTendersType.CASH)
                            .note("An optional note associated with the tender at the time of payment.")
                            .amount(27500d)
                            .percentage(10d)
                            .currency(Currency.USD)
                            .totalAmount(275L)
                            .totalTip(7L)
                            .totalProcessingFee(0L)
                            .totalTax(2.75L)
                            .totalDiscount(3L)
                            .totalRefund(0L)
                            .totalServiceCharge(0L)
                            .buyerTenderedCashAmount(27500L)
                            .changeBackCashAmount(27500L)
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
                            .cardStatus(CardStatus.AUTHORIZED)
                            .cardEntryMethod(CardEntryMethod.SWIPED)
                            .build()))
                    .voided(false)
                    .version("230320320320")
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

        PosOrdersAddResponse res = sdk.pos().orders().create()
                .request(req)
                .call();

        if (res.createOrderResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [PosOrdersAddRequest](../../models/operations/PosOrdersAddRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[PosOrdersAddResponse](../../models/operations/PosOrdersAddResponse.md)**

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

Get Order

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosOrdersOneRequest;
import com.apideck.unify.models.operations.PosOrdersOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        PosOrdersOneRequest req = PosOrdersOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        PosOrdersOneResponse res = sdk.pos().orders().get()
                .request(req)
                .call();

        if (res.getOrderResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [PosOrdersOneRequest](../../models/operations/PosOrdersOneRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[PosOrdersOneResponse](../../models/operations/PosOrdersOneResponse.md)**

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

Updates an open order by adding, replacing, or deleting fields. Square-only: Orders with a `completed` or `canceled` status cannot be updated. To pay for an order, use the [payments endpoint](#tag/Payments).


### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.Address;
import com.apideck.unify.models.components.CardEntryMethod;
import com.apideck.unify.models.components.CardStatus;
import com.apideck.unify.models.components.CardType;
import com.apideck.unify.models.components.CurbsidePickupDetails;
import com.apideck.unify.models.components.Currency;
import com.apideck.unify.models.components.Customers;
import com.apideck.unify.models.components.Email;
import com.apideck.unify.models.components.EmailType;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.OrderAppliedDiscounts;
import com.apideck.unify.models.components.OrderAppliedTaxes;
import com.apideck.unify.models.components.OrderDiscounts;
import com.apideck.unify.models.components.OrderDiscountsScope;
import com.apideck.unify.models.components.OrderDiscountsType;
import com.apideck.unify.models.components.OrderFulfillments;
import com.apideck.unify.models.components.OrderFulfillmentsType;
import com.apideck.unify.models.components.OrderInput;
import com.apideck.unify.models.components.OrderLineItems;
import com.apideck.unify.models.components.OrderModifiers;
import com.apideck.unify.models.components.OrderPayments;
import com.apideck.unify.models.components.OrderPickupDetails;
import com.apideck.unify.models.components.OrderRefunds;
import com.apideck.unify.models.components.OrderStatus;
import com.apideck.unify.models.components.OrderTenders;
import com.apideck.unify.models.components.OrderTendersType;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.PaymentCardInput;
import com.apideck.unify.models.components.PhoneNumber;
import com.apideck.unify.models.components.PhoneNumberType;
import com.apideck.unify.models.components.PosPaymentStatus;
import com.apideck.unify.models.components.PrepaidType;
import com.apideck.unify.models.components.Recipient;
import com.apideck.unify.models.components.ServiceChargeInput;
import com.apideck.unify.models.components.Taxes;
import com.apideck.unify.models.components.Type;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosOrdersUpdateRequest;
import com.apideck.unify.models.operations.PosOrdersUpdateResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        PosOrdersUpdateRequest req = PosOrdersUpdateRequest.builder()
                .id("<id>")
                .order(OrderInput.builder()
                    .merchantId("12345")
                    .locationId("12345")
                    .idempotencyKey("random_string")
                    .orderNumber("1F")
                    .orderDate(LocalDate.parse("2022-08-12"))
                    .closedDate(LocalDate.parse("2022-08-13"))
                    .referenceId("my-order-001")
                    .status(OrderStatus.OPEN)
                    .paymentStatus(PosPaymentStatus.OPEN)
                    .currency(Currency.USD)
                    .customerId("12345")
                    .employeeId("12345")
                    .orderTypeId("12345")
                    .table("1F")
                    .seat("23F")
                    .totalAmount(275L)
                    .totalTip(700L)
                    .totalTax(275L)
                    .totalDiscount(300L)
                    .totalRefund(0L)
                    .totalServiceCharge(0L)
                    .refunded(false)
                    .customers(List.of(
                        Customers.builder()
                            .id("12345")
                            .firstName("Elon")
                            .middleName("D.")
                            .lastName("Musk")
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
                            .build()))
                    .fulfillments(List.of(
                        OrderFulfillments.builder()
                            .id("12345")
                            .type(OrderFulfillmentsType.SHIPMENT)
                            .pickupDetails(OrderPickupDetails.builder()
                                .autoCompleteDuration("P1W3D")
                                .cancelReason("Not hungry")
                                .expiresAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .pickupAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .pickupWindowDuration("P1W3D")
                                .prepTimeDuration("P1W3D")
                                .note("Pickup in the back.")
                                .placedAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .rejectedAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .readyAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .expiredAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .pickedUpAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .canceledAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .curbsidePickupDetails(CurbsidePickupDetails.builder()
                                    .buyerArrivedAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                    .build())
                                .recipient(Recipient.builder()
                                    .customerId("12345")
                                    .displayName("Elon Musk")
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
                                    .phoneNumber(PhoneNumber.builder()
                                        .number("111-111-1111")
                                        .id("12345")
                                        .countryCode("1")
                                        .areaCode("323")
                                        .extension("105")
                                        .type(PhoneNumberType.PRIMARY)
                                        .build())
                                    .email(Email.builder()
                                        .email("elon@musk.com")
                                        .id("123")
                                        .type(EmailType.PRIMARY)
                                        .build())
                                    .build())
                                .build())
                            .build()))
                    .lineItems(List.of(
                        OrderLineItems.builder()
                            .name("New York Strip Steak")
                            .totalTax(2000L)
                            .totalDiscount(3000L)
                            .totalAmount(27500L)
                            .quantity(1d)
                            .unitPrice(27500.5d)
                            .appliedTaxes(List.of(
                                OrderAppliedTaxes.builder()
                                    .taxId("sales-tax")
                                    .amount(27500L)
                                    .currency(Currency.USD)
                                    .build()))
                            .appliedDiscounts(List.of(
                                OrderAppliedDiscounts.builder()
                                    .discountId("12345")
                                    .amount(27500L)
                                    .currency(Currency.USD)
                                    .build()))
                            .modifiers(List.of(
                                OrderModifiers.builder()
                                    .id("12345")
                                    .name("New York Strip Steak - no cheese")
                                    .amount(27500L)
                                    .currency(Currency.USD)
                                    .alternateName("Modifier New")
                                    .modifierGroupId("123")
                                    .build()))
                            .build()))
                    .payments(List.of(
                        OrderPayments.builder()
                            .amount(27500L)
                            .currency(Currency.USD)
                            .build()))
                    .serviceCharges(List.of(
                        ServiceChargeInput.builder()
                            .name("Charge for delivery")
                            .amount(27500d)
                            .percentage(12.5d)
                            .currency(Currency.USD)
                            .active(true)
                            .build()))
                    .refunds(List.of(
                        OrderRefunds.builder()
                            .amount(27500L)
                            .currency(Currency.USD)
                            .reason("The reason for the refund being issued.")
                            .build()))
                    .taxes(List.of(
                        Taxes.builder()
                            .id("state-sales-tax")
                            .name("State Sales Tax")
                            .amount(27500L)
                            .currency(Currency.USD)
                            .percentage(15d)
                            .autoApplied(true)
                            .build()))
                    .discounts(List.of(
                        OrderDiscounts.builder()
                            .type(OrderDiscountsType.PERCENTAGE)
                            .name("10% off")
                            .amount(27500L)
                            .currency(Currency.USD)
                            .scope(OrderDiscountsScope.ORDER)
                            .build()))
                    .tenders(List.of(
                        OrderTenders.builder()
                            .name("10% off")
                            .type(OrderTendersType.CASH)
                            .note("An optional note associated with the tender at the time of payment.")
                            .amount(27500d)
                            .percentage(10d)
                            .currency(Currency.USD)
                            .totalAmount(275L)
                            .totalTip(7L)
                            .totalProcessingFee(0L)
                            .totalTax(2.75L)
                            .totalDiscount(3L)
                            .totalRefund(0L)
                            .totalServiceCharge(0L)
                            .buyerTenderedCashAmount(27500L)
                            .changeBackCashAmount(27500L)
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
                            .cardStatus(CardStatus.AUTHORIZED)
                            .cardEntryMethod(CardEntryMethod.SWIPED)
                            .build()))
                    .voided(false)
                    .version("230320320320")
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

        PosOrdersUpdateResponse res = sdk.pos().orders().update()
                .request(req)
                .call();

        if (res.updateOrderResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PosOrdersUpdateRequest](../../models/operations/PosOrdersUpdateRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PosOrdersUpdateResponse](../../models/operations/PosOrdersUpdateResponse.md)**

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

Delete Order

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosOrdersDeleteRequest;
import com.apideck.unify.models.operations.PosOrdersDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        PosOrdersDeleteRequest req = PosOrdersDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        PosOrdersDeleteResponse res = sdk.pos().orders().delete()
                .request(req)
                .call();

        if (res.deleteOrderResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PosOrdersDeleteRequest](../../models/operations/PosOrdersDeleteRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PosOrdersDeleteResponse](../../models/operations/PosOrdersDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## pay

Pay Order

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.Address;
import com.apideck.unify.models.components.CardEntryMethod;
import com.apideck.unify.models.components.CardStatus;
import com.apideck.unify.models.components.CardType;
import com.apideck.unify.models.components.CurbsidePickupDetails;
import com.apideck.unify.models.components.Currency;
import com.apideck.unify.models.components.Customers;
import com.apideck.unify.models.components.Email;
import com.apideck.unify.models.components.EmailType;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.OrderAppliedDiscounts;
import com.apideck.unify.models.components.OrderAppliedTaxes;
import com.apideck.unify.models.components.OrderDiscounts;
import com.apideck.unify.models.components.OrderDiscountsScope;
import com.apideck.unify.models.components.OrderDiscountsType;
import com.apideck.unify.models.components.OrderFulfillments;
import com.apideck.unify.models.components.OrderFulfillmentsType;
import com.apideck.unify.models.components.OrderInput;
import com.apideck.unify.models.components.OrderLineItems;
import com.apideck.unify.models.components.OrderModifiers;
import com.apideck.unify.models.components.OrderPayments;
import com.apideck.unify.models.components.OrderPickupDetails;
import com.apideck.unify.models.components.OrderRefunds;
import com.apideck.unify.models.components.OrderStatus;
import com.apideck.unify.models.components.OrderTenders;
import com.apideck.unify.models.components.OrderTendersType;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.PaymentCardInput;
import com.apideck.unify.models.components.PhoneNumber;
import com.apideck.unify.models.components.PhoneNumberType;
import com.apideck.unify.models.components.PosPaymentStatus;
import com.apideck.unify.models.components.PrepaidType;
import com.apideck.unify.models.components.Recipient;
import com.apideck.unify.models.components.ServiceChargeInput;
import com.apideck.unify.models.components.Taxes;
import com.apideck.unify.models.components.Type;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosOrdersPayRequest;
import com.apideck.unify.models.operations.PosOrdersPayResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        PosOrdersPayRequest req = PosOrdersPayRequest.builder()
                .id("<id>")
                .order(OrderInput.builder()
                    .merchantId("12345")
                    .locationId("12345")
                    .idempotencyKey("random_string")
                    .orderNumber("1F")
                    .orderDate(LocalDate.parse("2022-08-12"))
                    .closedDate(LocalDate.parse("2022-08-13"))
                    .referenceId("my-order-001")
                    .status(OrderStatus.OPEN)
                    .paymentStatus(PosPaymentStatus.OPEN)
                    .currency(Currency.USD)
                    .customerId("12345")
                    .employeeId("12345")
                    .orderTypeId("12345")
                    .table("1F")
                    .seat("23F")
                    .totalAmount(275L)
                    .totalTip(700L)
                    .totalTax(275L)
                    .totalDiscount(300L)
                    .totalRefund(0L)
                    .totalServiceCharge(0L)
                    .refunded(false)
                    .customers(List.of(
                        Customers.builder()
                            .id("12345")
                            .firstName("Elon")
                            .middleName("D.")
                            .lastName("Musk")
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
                            .build()))
                    .fulfillments(List.of(
                        OrderFulfillments.builder()
                            .id("12345")
                            .type(OrderFulfillmentsType.SHIPMENT)
                            .pickupDetails(OrderPickupDetails.builder()
                                .autoCompleteDuration("P1W3D")
                                .cancelReason("Not hungry")
                                .expiresAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .pickupAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .pickupWindowDuration("P1W3D")
                                .prepTimeDuration("P1W3D")
                                .note("Pickup in the back.")
                                .placedAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .rejectedAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .readyAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .expiredAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .pickedUpAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .canceledAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                .curbsidePickupDetails(CurbsidePickupDetails.builder()
                                    .buyerArrivedAt(OffsetDateTime.parse("2016-09-04T23:59:33.123Z"))
                                    .build())
                                .recipient(Recipient.builder()
                                    .customerId("12345")
                                    .displayName("Elon Musk")
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
                                    .phoneNumber(PhoneNumber.builder()
                                        .number("111-111-1111")
                                        .id("12345")
                                        .countryCode("1")
                                        .areaCode("323")
                                        .extension("105")
                                        .type(PhoneNumberType.PRIMARY)
                                        .build())
                                    .email(Email.builder()
                                        .email("elon@musk.com")
                                        .id("123")
                                        .type(EmailType.PRIMARY)
                                        .build())
                                    .build())
                                .build())
                            .build()))
                    .lineItems(List.of(
                        OrderLineItems.builder()
                            .name("New York Strip Steak")
                            .totalTax(2000L)
                            .totalDiscount(3000L)
                            .totalAmount(27500L)
                            .quantity(1d)
                            .unitPrice(27500.5d)
                            .appliedTaxes(List.of(
                                OrderAppliedTaxes.builder()
                                    .taxId("sales-tax")
                                    .amount(27500L)
                                    .currency(Currency.USD)
                                    .build()))
                            .appliedDiscounts(List.of(
                                OrderAppliedDiscounts.builder()
                                    .discountId("12345")
                                    .amount(27500L)
                                    .currency(Currency.USD)
                                    .build()))
                            .modifiers(List.of(
                                OrderModifiers.builder()
                                    .id("12345")
                                    .name("New York Strip Steak - no cheese")
                                    .amount(27500L)
                                    .currency(Currency.USD)
                                    .alternateName("Modifier New")
                                    .modifierGroupId("123")
                                    .build()))
                            .build()))
                    .payments(List.of(
                        OrderPayments.builder()
                            .amount(27500L)
                            .currency(Currency.USD)
                            .build()))
                    .serviceCharges(List.of(
                        ServiceChargeInput.builder()
                            .name("Charge for delivery")
                            .amount(27500d)
                            .percentage(12.5d)
                            .currency(Currency.USD)
                            .active(true)
                            .build()))
                    .refunds(List.of(
                        OrderRefunds.builder()
                            .amount(27500L)
                            .currency(Currency.USD)
                            .reason("The reason for the refund being issued.")
                            .build()))
                    .taxes(List.of(
                        Taxes.builder()
                            .id("state-sales-tax")
                            .name("State Sales Tax")
                            .amount(27500L)
                            .currency(Currency.USD)
                            .percentage(15d)
                            .autoApplied(true)
                            .build()))
                    .discounts(List.of(
                        OrderDiscounts.builder()
                            .type(OrderDiscountsType.PERCENTAGE)
                            .name("10% off")
                            .amount(27500L)
                            .currency(Currency.USD)
                            .scope(OrderDiscountsScope.ORDER)
                            .build()))
                    .tenders(List.of(
                        OrderTenders.builder()
                            .name("10% off")
                            .type(OrderTendersType.CASH)
                            .note("An optional note associated with the tender at the time of payment.")
                            .amount(27500d)
                            .percentage(10d)
                            .currency(Currency.USD)
                            .totalAmount(275L)
                            .totalTip(7L)
                            .totalProcessingFee(0L)
                            .totalTax(2.75L)
                            .totalDiscount(3L)
                            .totalRefund(0L)
                            .totalServiceCharge(0L)
                            .buyerTenderedCashAmount(27500L)
                            .changeBackCashAmount(27500L)
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
                            .cardStatus(CardStatus.AUTHORIZED)
                            .cardEntryMethod(CardEntryMethod.SWIPED)
                            .build()))
                    .voided(false)
                    .version("230320320320")
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
                .fields("id,updated_at")
                .build();

        PosOrdersPayResponse res = sdk.pos().orders().pay()
                .request(req)
                .call();

        if (res.createOrderResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [PosOrdersPayRequest](../../models/operations/PosOrdersPayRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[PosOrdersPayResponse](../../models/operations/PosOrdersPayResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |