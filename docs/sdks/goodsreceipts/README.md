# Accounting.GoodsReceipts

## Overview

### Available Operations

* [list](#list) - List Goods Receipts
* [create](#create) - Create Goods Receipt
* [get](#get) - Get Goods Receipt

## list

List Goods Receipts

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.goodsReceiptsAll" method="get" path="/accounting/goods-receipts" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingGoodsReceiptsAllRequest;
import com.apideck.unify.models.operations.AccountingGoodsReceiptsAllResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingGoodsReceiptsAllRequest req = AccountingGoodsReceiptsAllRequest.builder()
                .serviceId("salesforce")
                .companyId("12345")
                .filter(GoodsReceiptsFilter.builder()
                    .updatedSince(OffsetDateTime.parse("2026-09-01T07:43:32.000Z"))
                    .supplierId("123abc")
                    .purchaseOrderId("123456")
                    .build())
                .sort(GoodsReceiptsSort.builder()
                    .by(GoodsReceiptsSortBy.UPDATED_AT)
                    .direction(SortDirection.DESC)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();


        sdk.accounting().goodsReceipts().list()
                .callAsStream()
                .forEach((AccountingGoodsReceiptsAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [AccountingGoodsReceiptsAllRequest](../../models/operations/AccountingGoodsReceiptsAllRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[AccountingGoodsReceiptsAllResponse](../../models/operations/AccountingGoodsReceiptsAllResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/BadRequestResponse       | 400                                    | application/json                       |
| models/errors/UnauthorizedResponse     | 401                                    | application/json                       |
| models/errors/PaymentRequiredResponse  | 402                                    | application/json                       |
| models/errors/NotFoundResponse         | 404                                    | application/json                       |
| models/errors/MethodNotAllowedResponse | 405                                    | application/json                       |
| models/errors/UnprocessableResponse    | 422                                    | application/json                       |
| models/errors/APIException             | 4XX, 5XX                               | \*/\*                                  |

## create

Create a Goods Receipt against a purchase order. `purchase_order_id` is required and every line names the purchase order line it receives against; a receipt that is not tied to a purchase order cannot be created. The response returns the `id` of the new receipt only: read it with `GET /accounting/goods-receipts/{id}` to see the posted document.

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.goodsReceiptsAdd" method="post" path="/accounting/goods-receipts" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingGoodsReceiptsAddRequest;
import com.apideck.unify.models.operations.AccountingGoodsReceiptsAddResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingGoodsReceiptsAddRequest req = AccountingGoodsReceiptsAddRequest.builder()
                .goodsReceiptCreateInput(GoodsReceiptCreateInput.builder()
                    .purchaseOrderId("4500000004")
                    .lineItems(List.of())
                    .receivedDate(LocalDate.parse("2026-09-01"))
                    .postedDate(LocalDate.parse("2026-09-01"))
                    .reference("DN-78910")
                    .notes("Partial delivery, remainder expected next week.")
                    .locationId("1710/171A")
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
                .companyId("12345")
                .build();

        AccountingGoodsReceiptsAddResponse res = sdk.accounting().goodsReceipts().create()
                .request(req)
                .call();

        if (res.createGoodsReceiptResponse().isPresent()) {
            System.out.println(res.createGoodsReceiptResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [AccountingGoodsReceiptsAddRequest](../../models/operations/AccountingGoodsReceiptsAddRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[AccountingGoodsReceiptsAddResponse](../../models/operations/AccountingGoodsReceiptsAddResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/BadRequestResponse       | 400                                    | application/json                       |
| models/errors/UnauthorizedResponse     | 401                                    | application/json                       |
| models/errors/PaymentRequiredResponse  | 402                                    | application/json                       |
| models/errors/NotFoundResponse         | 404                                    | application/json                       |
| models/errors/MethodNotAllowedResponse | 405                                    | application/json                       |
| models/errors/UnprocessableResponse    | 422                                    | application/json                       |
| models/errors/APIException             | 4XX, 5XX                               | \*/\*                                  |

## get

Get Goods Receipt

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.goodsReceiptsOne" method="get" path="/accounting/goods-receipts/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingGoodsReceiptsOneRequest;
import com.apideck.unify.models.operations.AccountingGoodsReceiptsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingGoodsReceiptsOneRequest req = AccountingGoodsReceiptsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .companyId("12345")
                .fields("id,updated_at")
                .build();

        AccountingGoodsReceiptsOneResponse res = sdk.accounting().goodsReceipts().get()
                .request(req)
                .call();

        if (res.getGoodsReceiptResponse().isPresent()) {
            System.out.println(res.getGoodsReceiptResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [AccountingGoodsReceiptsOneRequest](../../models/operations/AccountingGoodsReceiptsOneRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[AccountingGoodsReceiptsOneResponse](../../models/operations/AccountingGoodsReceiptsOneResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/BadRequestResponse       | 400                                    | application/json                       |
| models/errors/UnauthorizedResponse     | 401                                    | application/json                       |
| models/errors/PaymentRequiredResponse  | 402                                    | application/json                       |
| models/errors/NotFoundResponse         | 404                                    | application/json                       |
| models/errors/MethodNotAllowedResponse | 405                                    | application/json                       |
| models/errors/UnprocessableResponse    | 422                                    | application/json                       |
| models/errors/APIException             | 4XX, 5XX                               | \*/\*                                  |