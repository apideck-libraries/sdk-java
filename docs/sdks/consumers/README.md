# Consumers
(*vault().consumers()*)

## Overview

### Available Operations

* [create](#create) - Create consumer
* [list](#list) - Get all consumers
* [get](#get) - Get consumer
* [update](#update) - Update consumer
* [delete](#delete) - Delete consumer

## create

Create a consumer

### Example Usage

<!-- UsageSnippet language="java" operationID="vault.consumersAdd" method="post" path="/vault/consumers" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.ConsumerMetadata;
import com.apideck.unify.models.components.CreateConsumerRequest;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.VaultConsumersAddResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        VaultConsumersAddResponse res = sdk.vault().consumers().create()
                .createConsumerRequest(CreateConsumerRequest.builder()
                    .consumerId("test_consumer_id")
                    .metadata(ConsumerMetadata.builder()
                        .accountName("SpaceX")
                        .userName("Elon Musk")
                        .email("elon@musk.com")
                        .image("https://www.spacex.com/static/images/share.jpg")
                        .build())
                    .build())
                .call();

        if (res.createConsumerResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               | Example                                                                   |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `appId`                                                                   | *Optional\<String>*                                                       | :heavy_minus_sign:                                                        | The ID of your Unify application                                          | dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX                                   |
| `createConsumerRequest`                                                   | [CreateConsumerRequest](../../models/components/CreateConsumerRequest.md) | :heavy_check_mark:                                                        | N/A                                                                       |                                                                           |

### Response

**[VaultConsumersAddResponse](../../models/operations/VaultConsumersAddResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## list

This endpoint includes all application consumers, along with an aggregated count of requests made.


### Example Usage

<!-- UsageSnippet language="java" operationID="vault.consumersAll" method="get" path="/vault/consumers" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.VaultConsumersAllResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();


        sdk.vault().consumers().list()
                .limit(20L)
                .callAsStream()
                .forEach((VaultConsumersAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      | Example                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `appId`                                                                                                          | *Optional\<String>*                                                                                              | :heavy_minus_sign:                                                                                               | The ID of your Unify application                                                                                 | dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX                                                                          |
| `cursor`                                                                                                         | *JsonNullable\<String>*                                                                                          | :heavy_minus_sign:                                                                                               | Cursor to start from. You can find cursors for next/previous pages in the meta.cursors property of the response. |                                                                                                                  |
| `limit`                                                                                                          | *Optional\<Long>*                                                                                                | :heavy_minus_sign:                                                                                               | Number of results to return. Minimum 1, Maximum 200, Default 20                                                  |                                                                                                                  |

### Response

**[VaultConsumersAllResponse](../../models/operations/VaultConsumersAllResponse.md)**

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

Consumer detail including their aggregated counts with the connections they have authorized.


### Example Usage

<!-- UsageSnippet language="java" operationID="vault.consumersOne" method="get" path="/vault/consumers/{consumer_id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.VaultConsumersOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        VaultConsumersOneResponse res = sdk.vault().consumers().get()
                .consumerId("test_user_id")
                .call();

        if (res.getConsumerResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                               | Type                                    | Required                                | Description                             | Example                                 |
| --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- |
| `appId`                                 | *Optional\<String>*                     | :heavy_minus_sign:                      | The ID of your Unify application        | dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX |
| `consumerId`                            | *String*                                | :heavy_check_mark:                      | ID of the consumer to return            | test_user_id                            |

### Response

**[VaultConsumersOneResponse](../../models/operations/VaultConsumersOneResponse.md)**

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

Update consumer metadata such as name and email.

### Example Usage

<!-- UsageSnippet language="java" operationID="vault.consumersUpdate" method="patch" path="/vault/consumers/{consumer_id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.ConsumerMetadata;
import com.apideck.unify.models.components.UpdateConsumerRequest;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.VaultConsumersUpdateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        VaultConsumersUpdateResponse res = sdk.vault().consumers().update()
                .consumerId("test_user_id")
                .updateConsumerRequest(UpdateConsumerRequest.builder()
                    .metadata(ConsumerMetadata.builder()
                        .accountName("SpaceX")
                        .userName("Elon Musk")
                        .email("elon@musk.com")
                        .image("https://www.spacex.com/static/images/share.jpg")
                        .build())
                    .build())
                .call();

        if (res.updateConsumerResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               | Example                                                                   |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `appId`                                                                   | *Optional\<String>*                                                       | :heavy_minus_sign:                                                        | The ID of your Unify application                                          | dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX                                   |
| `consumerId`                                                              | *String*                                                                  | :heavy_check_mark:                                                        | ID of the consumer to return                                              | test_user_id                                                              |
| `updateConsumerRequest`                                                   | [UpdateConsumerRequest](../../models/components/UpdateConsumerRequest.md) | :heavy_check_mark:                                                        | N/A                                                                       |                                                                           |

### Response

**[VaultConsumersUpdateResponse](../../models/operations/VaultConsumersUpdateResponse.md)**

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

Delete consumer and all their connections, including credentials.

### Example Usage

<!-- UsageSnippet language="java" operationID="vault.consumersDelete" method="delete" path="/vault/consumers/{consumer_id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.VaultConsumersDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        VaultConsumersDeleteResponse res = sdk.vault().consumers().delete()
                .consumerId("test_user_id")
                .call();

        if (res.deleteConsumerResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                               | Type                                    | Required                                | Description                             | Example                                 |
| --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- |
| `appId`                                 | *Optional\<String>*                     | :heavy_minus_sign:                      | The ID of your Unify application        | dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX |
| `consumerId`                            | *String*                                | :heavy_check_mark:                      | ID of the consumer to return            | test_user_id                            |

### Response

**[VaultConsumersDeleteResponse](../../models/operations/VaultConsumersDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |