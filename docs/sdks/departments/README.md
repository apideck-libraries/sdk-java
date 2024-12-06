# Departments
(*accounting().departments()*)

## Overview

### Available Operations

* [list](#list) - List Departments
* [create](#create) - Create Department
* [get](#get) - Get Department
* [update](#update) - Update Department
* [delete](#delete) - Delete Department

## list

List Departments

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.AccountingDepartmentsFilter;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.AccountingDepartmentsAllRequest;
import com.apideck.unify.models.operations.AccountingDepartmentsAllResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingDepartmentsAllRequest req = AccountingDepartmentsAllRequest.builder()
                .serviceId("salesforce")
                .fields("id,updated_at")
                .filter(AccountingDepartmentsFilter.builder()
                    .subsidiary("1")
                    .build())
                .build();

        AccountingDepartmentsAllResponse res = sdk.accounting().departments().list()
                .request(req)
                .call();

        if (res.getAccountingDepartmentsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AccountingDepartmentsAllRequest](../../models/operations/AccountingDepartmentsAllRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AccountingDepartmentsAllResponse](../../models/operations/AccountingDepartmentsAllResponse.md)**

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

Create Department

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.AccountingDepartmentInput;
import com.apideck.unify.models.components.DepartmentStatus;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.SubsidiaryReferenceInput;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.AccountingDepartmentsAddRequest;
import com.apideck.unify.models.operations.AccountingDepartmentsAddResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingDepartmentsAddRequest req = AccountingDepartmentsAddRequest.builder()
                .accountingDepartment(AccountingDepartmentInput.builder()
                    .parentId("12345")
                    .name("Sales")
                    .status(DepartmentStatus.ACTIVE)
                    .subsidiaries(List.of(
                        SubsidiaryReferenceInput.builder()
                            .name("SpaceX")
                            .build()))
                    .rowVersion("1-12345")
                    .passThrough(List.of(
                        PassThroughBody.builder()
                            .serviceId("<id>")
                            .extendPaths(List.of(
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(\n    Map.entry("TaxClassificationRef", Map.ofEntries(\n    Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build()))
                            .build(),
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

        AccountingDepartmentsAddResponse res = sdk.accounting().departments().create()
                .request(req)
                .call();

        if (res.createAccountingDepartmentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AccountingDepartmentsAddRequest](../../models/operations/AccountingDepartmentsAddRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AccountingDepartmentsAddResponse](../../models/operations/AccountingDepartmentsAddResponse.md)**

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

Get Department

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.AccountingDepartmentsOneRequest;
import com.apideck.unify.models.operations.AccountingDepartmentsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingDepartmentsOneRequest req = AccountingDepartmentsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        AccountingDepartmentsOneResponse res = sdk.accounting().departments().get()
                .request(req)
                .call();

        if (res.getAccountingDepartmentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AccountingDepartmentsOneRequest](../../models/operations/AccountingDepartmentsOneRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AccountingDepartmentsOneResponse](../../models/operations/AccountingDepartmentsOneResponse.md)**

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

Update Department

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.AccountingDepartmentInput;
import com.apideck.unify.models.components.DepartmentStatus;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.SubsidiaryReferenceInput;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.AccountingDepartmentsUpdateRequest;
import com.apideck.unify.models.operations.AccountingDepartmentsUpdateResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingDepartmentsUpdateRequest req = AccountingDepartmentsUpdateRequest.builder()
                .id("<id>")
                .accountingDepartment(AccountingDepartmentInput.builder()
                    .parentId("12345")
                    .name("Sales")
                    .status(DepartmentStatus.ACTIVE)
                    .subsidiaries(List.of(
                        SubsidiaryReferenceInput.builder()
                            .name("SpaceX")
                            .build(),
                        SubsidiaryReferenceInput.builder()
                            .name("SpaceX")
                            .build(),
                        SubsidiaryReferenceInput.builder()
                            .name("SpaceX")
                            .build()))
                    .rowVersion("1-12345")
                    .passThrough(List.of(
                        PassThroughBody.builder()
                            .serviceId("<id>")
                            .extendPaths(List.of(
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(\n    Map.entry("TaxClassificationRef", Map.ofEntries(\n    Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build()))
                            .build(),
                        PassThroughBody.builder()
                            .serviceId("<id>")
                            .extendPaths(List.of(
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(\n    Map.entry("TaxClassificationRef", Map.ofEntries(\n    Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build(),
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(\n    Map.entry("TaxClassificationRef", Map.ofEntries(\n    Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build(),
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(\n    Map.entry("TaxClassificationRef", Map.ofEntries(\n    Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build()))
                            .build()))
                    .build())
                .serviceId("salesforce")
                .build();

        AccountingDepartmentsUpdateResponse res = sdk.accounting().departments().update()
                .request(req)
                .call();

        if (res.updateAccountingDepartmentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AccountingDepartmentsUpdateRequest](../../models/operations/AccountingDepartmentsUpdateRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[AccountingDepartmentsUpdateResponse](../../models/operations/AccountingDepartmentsUpdateResponse.md)**

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

Delete Department

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.AccountingDepartmentsDeleteRequest;
import com.apideck.unify.models.operations.AccountingDepartmentsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingDepartmentsDeleteRequest req = AccountingDepartmentsDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AccountingDepartmentsDeleteResponse res = sdk.accounting().departments().delete()
                .request(req)
                .call();

        if (res.deleteAccountingDepartmentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AccountingDepartmentsDeleteRequest](../../models/operations/AccountingDepartmentsDeleteRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[AccountingDepartmentsDeleteResponse](../../models/operations/AccountingDepartmentsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |