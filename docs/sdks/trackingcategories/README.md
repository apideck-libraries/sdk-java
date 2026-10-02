# Accounting.TrackingCategories

## Overview

### Available Operations

* [list](#list) - List Tracking Categories
* [create](#create) - Create Tracking Category
* [get](#get) - Get Tracking Category
* [update](#update) - Update Tracking Category
* [delete](#delete) - Delete Tracking Category
* [createBatch](#createbatch) - Create Tracking Categories in batch

## list

List Tracking Categories

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.trackingCategoriesAll" method="get" path="/accounting/tracking-categories" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingTrackingCategoriesAllRequest;
import com.apideck.unify.models.operations.AccountingTrackingCategoriesAllResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingTrackingCategoriesAllRequest req = AccountingTrackingCategoriesAllRequest.builder()
                .serviceId("salesforce")
                .companyId("12345")
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();


        sdk.accounting().trackingCategories().list()
                .callAsStream()
                .forEach((AccountingTrackingCategoriesAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [AccountingTrackingCategoriesAllRequest](../../models/operations/AccountingTrackingCategoriesAllRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[AccountingTrackingCategoriesAllResponse](../../models/operations/AccountingTrackingCategoriesAllResponse.md)**

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

Create Tracking Category

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.trackingCategoriesAdd" method="post" path="/accounting/tracking-categories" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingTrackingCategoriesAddRequest;
import com.apideck.unify.models.operations.AccountingTrackingCategoriesAddResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingTrackingCategoriesAddRequest req = AccountingTrackingCategoriesAddRequest.builder()
                .trackingCategory(TrackingCategoryInput.builder()
                    .parentId("12345")
                    .name("Department")
                    .code("100")
                    .status(TrackingCategoryStatus.ACTIVE)
                    .rowVersion("1-12345")
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
                .companyId("12345")
                .build();

        AccountingTrackingCategoriesAddResponse res = sdk.accounting().trackingCategories().create()
                .request(req)
                .call();

        if (res.createTrackingCategoryResponse().isPresent()) {
            System.out.println(res.createTrackingCategoryResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [AccountingTrackingCategoriesAddRequest](../../models/operations/AccountingTrackingCategoriesAddRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[AccountingTrackingCategoriesAddResponse](../../models/operations/AccountingTrackingCategoriesAddResponse.md)**

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

Get Tracking Category

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.trackingCategoriesOne" method="get" path="/accounting/tracking-categories/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingTrackingCategoriesOneRequest;
import com.apideck.unify.models.operations.AccountingTrackingCategoriesOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingTrackingCategoriesOneRequest req = AccountingTrackingCategoriesOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .companyId("12345")
                .fields("id,updated_at")
                .build();

        AccountingTrackingCategoriesOneResponse res = sdk.accounting().trackingCategories().get()
                .request(req)
                .call();

        if (res.getTrackingCategoryResponse().isPresent()) {
            System.out.println(res.getTrackingCategoryResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [AccountingTrackingCategoriesOneRequest](../../models/operations/AccountingTrackingCategoriesOneRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[AccountingTrackingCategoriesOneResponse](../../models/operations/AccountingTrackingCategoriesOneResponse.md)**

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

Update Tracking Category

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.trackingCategoriesUpdate" method="patch" path="/accounting/tracking-categories/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingTrackingCategoriesUpdateRequest;
import com.apideck.unify.models.operations.AccountingTrackingCategoriesUpdateResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingTrackingCategoriesUpdateRequest req = AccountingTrackingCategoriesUpdateRequest.builder()
                .id("<id>")
                .trackingCategory(TrackingCategoryInput.builder()
                    .parentId("12345")
                    .name("Department")
                    .code("100")
                    .status(TrackingCategoryStatus.ACTIVE)
                    .rowVersion("1-12345")
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
                .companyId("12345")
                .build();

        AccountingTrackingCategoriesUpdateResponse res = sdk.accounting().trackingCategories().update()
                .request(req)
                .call();

        if (res.updateTrackingCategoryResponse().isPresent()) {
            System.out.println(res.updateTrackingCategoryResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [AccountingTrackingCategoriesUpdateRequest](../../models/operations/AccountingTrackingCategoriesUpdateRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |

### Response

**[AccountingTrackingCategoriesUpdateResponse](../../models/operations/AccountingTrackingCategoriesUpdateResponse.md)**

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

Delete Tracking Category

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.trackingCategoriesDelete" method="delete" path="/accounting/tracking-categories/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingTrackingCategoriesDeleteRequest;
import com.apideck.unify.models.operations.AccountingTrackingCategoriesDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingTrackingCategoriesDeleteRequest req = AccountingTrackingCategoriesDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .companyId("12345")
                .build();

        AccountingTrackingCategoriesDeleteResponse res = sdk.accounting().trackingCategories().delete()
                .request(req)
                .call();

        if (res.deleteTrackingCategoryResponse().isPresent()) {
            System.out.println(res.deleteTrackingCategoryResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [AccountingTrackingCategoriesDeleteRequest](../../models/operations/AccountingTrackingCategoriesDeleteRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |

### Response

**[AccountingTrackingCategoriesDeleteResponse](../../models/operations/AccountingTrackingCategoriesDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## createBatch

Create multiple tracking categories in a single request. Each item is processed independently, so some may be created while others fail; the response returns `200` with one result per item, in the order the items were sent. The maximum number of items accepted per request depends on the connector.

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.trackingCategoriesBatchAdd" method="post" path="/accounting/tracking-categories/batch" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.BatchTrackingCategoriesRequest;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingTrackingCategoriesBatchAddRequest;
import com.apideck.unify.models.operations.AccountingTrackingCategoriesBatchAddResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingTrackingCategoriesBatchAddRequest req = AccountingTrackingCategoriesBatchAddRequest.builder()
                .batchTrackingCategoriesRequest(BatchTrackingCategoriesRequest.builder()
                    .items(List.of())
                    .build())
                .serviceId("salesforce")
                .companyId("12345")
                .build();

        AccountingTrackingCategoriesBatchAddResponse res = sdk.accounting().trackingCategories().createBatch()
                .request(req)
                .call();

        if (res.batchTrackingCategoriesResponse().isPresent()) {
            System.out.println(res.batchTrackingCategoriesResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [AccountingTrackingCategoriesBatchAddRequest](../../models/operations/AccountingTrackingCategoriesBatchAddRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |

### Response

**[AccountingTrackingCategoriesBatchAddResponse](../../models/operations/AccountingTrackingCategoriesBatchAddResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |