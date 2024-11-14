# Items
(*pos().items()*)

## Overview

### Available Operations

* [list](#list) - List Items
* [create](#create) - Create Item
* [get](#get) - Get Item
* [update](#update) - Update Item
* [delete](#delete) - Delete Item

## list

List Items

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosItemsAllRequest;
import com.apideck.unify.models.operations.PosItemsAllResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        PosItemsAllRequest req = PosItemsAllRequest.builder()
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        PosItemsAllResponse res = sdk.pos().items().list()
                .request(req)
                .call();

        if (res.getItemsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [PosItemsAllRequest](../../models/operations/PosItemsAllRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[PosItemsAllResponse](../../models/operations/PosItemsAllResponse.md)**

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

Create Item

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.Currency;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.ItemCategoriesInput;
import com.apideck.unify.models.components.ItemInput;
import com.apideck.unify.models.components.ItemModifierGroups;
import com.apideck.unify.models.components.ItemOptions;
import com.apideck.unify.models.components.ItemPricingType;
import com.apideck.unify.models.components.ItemVariations;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.PricingType;
import com.apideck.unify.models.components.ProductType;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosItemsAddRequest;
import com.apideck.unify.models.operations.PosItemsAddResponse;
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

        PosItemsAddRequest req = PosItemsAddRequest.builder()
                .item(ItemInput.builder()
                    .name("Cocoa")
                    .id("#cocoa")
                    .idempotencyKey("random_string")
                    .description("Hot Chocolate")
                    .abbreviation("Ch")
                    .productType(ProductType.REGULAR)
                    .priceAmount(10d)
                    .pricingType(PricingType.FIXED)
                    .priceCurrency(Currency.USD)
                    .cost(2d)
                    .taxIds(List.of(
                        "12345",
                        "67890"))
                    .isRevenue(false)
                    .useDefaultTaxRates(false)
                    .absentAtLocationIds(List.of(
                        "12345",
                        "67890"))
                    .presentAtAllLocations(false)
                    .availableForPickup(false)
                    .availableOnline(false)
                    .sku("11910345")
                    .code("11910345")
                    .categories(List.of(
                        ItemCategoriesInput.builder()
                            .name("Food")
                            .imageIds(List.of(
                                "12345",
                                "67890"))
                            .build()))
                    .options(List.of(
                        ItemOptions.builder()
                            .id("12345")
                            .name("Option 1")
                            .attributeId("12345")
                            .build()))
                    .variations(List.of(
                        ItemVariations.builder()
                            .name("Food")
                            .sku("11910345")
                            .sequence(0d)
                            .pricingType(ItemPricingType.FIXED)
                            .priceAmount(10d)
                            .priceCurrency(Currency.USD)
                            .stockable(false)
                            .presentAtAllLocations(false)
                            .build()))
                    .modifierGroups(List.of(
                        ItemModifierGroups.builder()
                            .build()))
                    .available(true)
                    .hidden(true)
                    .deleted(true)
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

        PosItemsAddResponse res = sdk.pos().items().create()
                .request(req)
                .call();

        if (res.createItemResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [PosItemsAddRequest](../../models/operations/PosItemsAddRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[PosItemsAddResponse](../../models/operations/PosItemsAddResponse.md)**

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

Get Item

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosItemsOneRequest;
import com.apideck.unify.models.operations.PosItemsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        PosItemsOneRequest req = PosItemsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        PosItemsOneResponse res = sdk.pos().items().get()
                .request(req)
                .call();

        if (res.getItemResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [PosItemsOneRequest](../../models/operations/PosItemsOneRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[PosItemsOneResponse](../../models/operations/PosItemsOneResponse.md)**

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

Update Item

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.Currency;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.ItemCategoriesInput;
import com.apideck.unify.models.components.ItemInput;
import com.apideck.unify.models.components.ItemModifierGroups;
import com.apideck.unify.models.components.ItemOptions;
import com.apideck.unify.models.components.ItemPricingType;
import com.apideck.unify.models.components.ItemVariations;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.PricingType;
import com.apideck.unify.models.components.ProductType;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosItemsUpdateRequest;
import com.apideck.unify.models.operations.PosItemsUpdateResponse;
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

        PosItemsUpdateRequest req = PosItemsUpdateRequest.builder()
                .id("<id>")
                .item(ItemInput.builder()
                    .name("Cocoa")
                    .id("#cocoa")
                    .idempotencyKey("random_string")
                    .description("Hot Chocolate")
                    .abbreviation("Ch")
                    .productType(ProductType.REGULAR)
                    .priceAmount(10d)
                    .pricingType(PricingType.FIXED)
                    .priceCurrency(Currency.USD)
                    .cost(2d)
                    .taxIds(List.of(
                        "12345",
                        "67890"))
                    .isRevenue(false)
                    .useDefaultTaxRates(false)
                    .absentAtLocationIds(List.of(
                        "12345",
                        "67890"))
                    .presentAtAllLocations(false)
                    .availableForPickup(false)
                    .availableOnline(false)
                    .sku("11910345")
                    .code("11910345")
                    .categories(List.of(
                        ItemCategoriesInput.builder()
                            .name("Food")
                            .imageIds(List.of(
                                "12345",
                                "67890"))
                            .build()))
                    .options(List.of(
                        ItemOptions.builder()
                            .id("12345")
                            .name("Option 1")
                            .attributeId("12345")
                            .build()))
                    .variations(List.of(
                        ItemVariations.builder()
                            .name("Food")
                            .sku("11910345")
                            .sequence(0d)
                            .pricingType(ItemPricingType.FIXED)
                            .priceAmount(10d)
                            .priceCurrency(Currency.USD)
                            .stockable(false)
                            .presentAtAllLocations(false)
                            .build()))
                    .modifierGroups(List.of(
                        ItemModifierGroups.builder()
                            .build()))
                    .available(true)
                    .hidden(true)
                    .deleted(true)
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

        PosItemsUpdateResponse res = sdk.pos().items().update()
                .request(req)
                .call();

        if (res.updateItemResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PosItemsUpdateRequest](../../models/operations/PosItemsUpdateRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PosItemsUpdateResponse](../../models/operations/PosItemsUpdateResponse.md)**

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

Delete Item

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.PosItemsDeleteRequest;
import com.apideck.unify.models.operations.PosItemsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .customerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        PosItemsDeleteRequest req = PosItemsDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        PosItemsDeleteResponse res = sdk.pos().items().delete()
                .request(req)
                .call();

        if (res.deleteItemResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [PosItemsDeleteRequest](../../models/operations/PosItemsDeleteRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[PosItemsDeleteResponse](../../models/operations/PosItemsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |