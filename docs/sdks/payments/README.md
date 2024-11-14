# Payments
(*accounting().payments()*)

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
import com.apideck.unify.models.components.PaymentsFilter;
import com.apideck.unify.models.components.PaymentsSort;
import com.apideck.unify.models.components.PaymentsSortBy;
import com.apideck.unify.models.components.SortDirection;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.AccountingPaymentsAllRequest;
import com.apideck.unify.models.operations.AccountingPaymentsAllResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingPaymentsAllRequest req = AccountingPaymentsAllRequest.builder()
                .serviceId("salesforce")
                .filter(PaymentsFilter.builder()
                    .updatedSince(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .build())
                .sort(PaymentsSort.builder()
                    .by(PaymentsSortBy.UPDATED_AT)
                    .direction(SortDirection.DESC)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();

        AccountingPaymentsAllResponse res = sdk.accounting().payments().list()
                .request(req)
                .call();

        if (res.getPaymentsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AccountingPaymentsAllRequest](../../models/operations/AccountingPaymentsAllRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AccountingPaymentsAllResponse](../../models/operations/AccountingPaymentsAllResponse.md)**

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
import com.apideck.unify.models.components.AllocationInput;
import com.apideck.unify.models.components.Currency;
import com.apideck.unify.models.components.CustomField;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.LinkedCustomerInput;
import com.apideck.unify.models.components.LinkedLedgerAccountInput;
import com.apideck.unify.models.components.LinkedTrackingCategory;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.PaymentInput;
import com.apideck.unify.models.components.PaymentStatus;
import com.apideck.unify.models.components.PaymentType;
import com.apideck.unify.models.components.Value;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.AccountingPaymentsAddRequest;
import com.apideck.unify.models.operations.AccountingPaymentsAddResponse;
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

        AccountingPaymentsAddRequest req = AccountingPaymentsAddRequest.builder()
                .payment(PaymentInput.builder()
                    .totalAmount(49.99d)
                    .transactionDate(OffsetDateTime.parse("2021-05-01T12:00:00.000Z"))
                    .currency(Currency.USD)
                    .currencyRate(0.69d)
                    .reference("123456")
                    .paymentMethod("cash")
                    .paymentMethodReference("123456")
                    .paymentMethodId("12345")
                    .account(LinkedLedgerAccountInput.builder()
                        .id("123456")
                        .nominalCode("N091")
                        .code("453")
                        .build())
                    .customer(LinkedCustomerInput.builder()
                        .id("12345")
                        .displayName("Windsurf Shop")
                        .email("boring@boring.com")
                        .build())
                    .companyId("12345")
                    .reconciled(true)
                    .status(PaymentStatus.AUTHORISED)
                    .type(PaymentType.ACCOUNTS_RECEIVABLE)
                    .allocations(List.of(
                        AllocationInput.builder()
                            .id("123456")
                            .amount(49.99d)
                            .allocationId("123456")
                            .build()))
                    .note("Some notes about this transaction")
                    .number("123456")
                    .trackingCategories(List.of(
                        LinkedTrackingCategory.builder()
                            .id("123456")
                            .name("New York")
                            .build()))
                    .customFields(List.of(
                        CustomField.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(Value.of(true))
                            .build()))
                    .rowVersion("1-12345")
                    .displayId("123456")
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

        AccountingPaymentsAddResponse res = sdk.accounting().payments().create()
                .request(req)
                .call();

        if (res.createPaymentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AccountingPaymentsAddRequest](../../models/operations/AccountingPaymentsAddRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AccountingPaymentsAddResponse](../../models/operations/AccountingPaymentsAddResponse.md)**

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
import com.apideck.unify.models.operations.AccountingPaymentsOneRequest;
import com.apideck.unify.models.operations.AccountingPaymentsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingPaymentsOneRequest req = AccountingPaymentsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        AccountingPaymentsOneResponse res = sdk.accounting().payments().get()
                .request(req)
                .call();

        if (res.getPaymentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AccountingPaymentsOneRequest](../../models/operations/AccountingPaymentsOneRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AccountingPaymentsOneResponse](../../models/operations/AccountingPaymentsOneResponse.md)**

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
import com.apideck.unify.models.components.AllocationInput;
import com.apideck.unify.models.components.Currency;
import com.apideck.unify.models.components.CustomField;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.LinkedCustomerInput;
import com.apideck.unify.models.components.LinkedLedgerAccountInput;
import com.apideck.unify.models.components.LinkedTrackingCategory;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.PaymentInput;
import com.apideck.unify.models.components.PaymentStatus;
import com.apideck.unify.models.components.PaymentType;
import com.apideck.unify.models.components.Six;
import com.apideck.unify.models.components.Value;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.AccountingPaymentsUpdateRequest;
import com.apideck.unify.models.operations.AccountingPaymentsUpdateResponse;
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

        AccountingPaymentsUpdateRequest req = AccountingPaymentsUpdateRequest.builder()
                .id("<id>")
                .payment(PaymentInput.builder()
                    .totalAmount(49.99d)
                    .transactionDate(OffsetDateTime.parse("2021-05-01T12:00:00.000Z"))
                    .currency(Currency.USD)
                    .currencyRate(0.69d)
                    .reference("123456")
                    .paymentMethod("cash")
                    .paymentMethodReference("123456")
                    .paymentMethodId("12345")
                    .account(LinkedLedgerAccountInput.builder()
                        .id("123456")
                        .nominalCode("N091")
                        .code("453")
                        .build())
                    .customer(LinkedCustomerInput.builder()
                        .id("12345")
                        .displayName("Windsurf Shop")
                        .email("boring@boring.com")
                        .build())
                    .companyId("12345")
                    .reconciled(true)
                    .status(PaymentStatus.AUTHORISED)
                    .type(PaymentType.ACCOUNTS_RECEIVABLE)
                    .allocations(List.of(
                        AllocationInput.builder()
                            .id("123456")
                            .amount(49.99d)
                            .allocationId("123456")
                            .build()))
                    .note("Some notes about this transaction")
                    .number("123456")
                    .trackingCategories(List.of(
                        LinkedTrackingCategory.builder()
                            .id("123456")
                            .name("New York")
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
                    .rowVersion("1-12345")
                    .displayId("123456")
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

        AccountingPaymentsUpdateResponse res = sdk.accounting().payments().update()
                .request(req)
                .call();

        if (res.updatePaymentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AccountingPaymentsUpdateRequest](../../models/operations/AccountingPaymentsUpdateRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AccountingPaymentsUpdateResponse](../../models/operations/AccountingPaymentsUpdateResponse.md)**

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
import com.apideck.unify.models.operations.AccountingPaymentsDeleteRequest;
import com.apideck.unify.models.operations.AccountingPaymentsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingPaymentsDeleteRequest req = AccountingPaymentsDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AccountingPaymentsDeleteResponse res = sdk.accounting().payments().delete()
                .request(req)
                .call();

        if (res.deletePaymentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AccountingPaymentsDeleteRequest](../../models/operations/AccountingPaymentsDeleteRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AccountingPaymentsDeleteResponse](../../models/operations/AccountingPaymentsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |