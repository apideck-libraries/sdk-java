# Webhooks
(*webhook().webhooks()*)

## Overview

### Available Operations

* [list](#list) - List webhook subscriptions
* [create](#create) - Create webhook subscription
* [get](#get) - Get webhook subscription
* [update](#update) - Update webhook subscription
* [delete](#delete) - Delete webhook subscription

## list

List all webhook subscriptions

### Example Usage

<!-- UsageSnippet language="java" operationID="webhook.webhooksAll" method="get" path="/webhook/webhooks" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.WebhookWebhooksAllResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        sdk.webhook().webhooks().list()
                .limit(20L)
                .callAsStream()
                .forEach((WebhookWebhooksAllResponse item) -> {
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

**[WebhookWebhooksAllResponse](../../models/operations/WebhookWebhooksAllResponse.md)**

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

Create a webhook subscription to receive events

### Example Usage

<!-- UsageSnippet language="java" operationID="webhook.webhooksAdd" method="post" path="/webhook/webhooks" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.WebhookWebhooksAddResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        WebhookWebhooksAddResponse res = sdk.webhook().webhooks().create()
                .createWebhookRequest(CreateWebhookRequest.builder()
                    .unifiedApi(UnifiedApiId.CRM)
                    .status(Status.ENABLED)
                    .deliveryUrl("https://example.com/my/webhook/endpoint")
                    .events(List.of(
                        WebhookEventType.VAULT_CONNECTION_CREATED,
                        WebhookEventType.VAULT_CONNECTION_UPDATED))
                    .description("A description")
                    .build())
                .call();

        if (res.createWebhookResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             | Example                                                                 |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `appId`                                                                 | *Optional\<String>*                                                     | :heavy_minus_sign:                                                      | The ID of your Unify application                                        | dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX                                 |
| `createWebhookRequest`                                                  | [CreateWebhookRequest](../../models/components/CreateWebhookRequest.md) | :heavy_check_mark:                                                      | N/A                                                                     |                                                                         |

### Response

**[WebhookWebhooksAddResponse](../../models/operations/WebhookWebhooksAddResponse.md)**

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

Get the webhook subscription details

### Example Usage

<!-- UsageSnippet language="java" operationID="webhook.webhooksOne" method="get" path="/webhook/webhooks/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.WebhookWebhooksOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        WebhookWebhooksOneResponse res = sdk.webhook().webhooks().get()
                .id("<id>")
                .call();

        if (res.getWebhookResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `id`                                                                                               | *String*                                                                                           | :heavy_check_mark:                                                                                 | JWT Webhook token that represents the unifiedApi and applicationId associated to the event source. |                                                                                                    |
| `appId`                                                                                            | *Optional\<String>*                                                                                | :heavy_minus_sign:                                                                                 | The ID of your Unify application                                                                   | dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX                                                            |

### Response

**[WebhookWebhooksOneResponse](../../models/operations/WebhookWebhooksOneResponse.md)**

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

Update a webhook subscription

### Example Usage

<!-- UsageSnippet language="java" operationID="webhook.webhooksUpdate" method="patch" path="/webhook/webhooks/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.WebhookWebhooksUpdateResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        WebhookWebhooksUpdateResponse res = sdk.webhook().webhooks().update()
                .id("<id>")
                .updateWebhookRequest(UpdateWebhookRequest.builder()
                    .description("A description")
                    .status(Status.ENABLED)
                    .deliveryUrl("https://example.com/my/webhook/endpoint")
                    .events(List.of(
                        WebhookEventType.VAULT_CONNECTION_CREATED,
                        WebhookEventType.VAULT_CONNECTION_UPDATED))
                    .build())
                .call();

        if (res.updateWebhookResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `id`                                                                                               | *String*                                                                                           | :heavy_check_mark:                                                                                 | JWT Webhook token that represents the unifiedApi and applicationId associated to the event source. |                                                                                                    |
| `appId`                                                                                            | *Optional\<String>*                                                                                | :heavy_minus_sign:                                                                                 | The ID of your Unify application                                                                   | dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX                                                            |
| `updateWebhookRequest`                                                                             | [UpdateWebhookRequest](../../models/components/UpdateWebhookRequest.md)                            | :heavy_check_mark:                                                                                 | N/A                                                                                                |                                                                                                    |

### Response

**[WebhookWebhooksUpdateResponse](../../models/operations/WebhookWebhooksUpdateResponse.md)**

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

Delete a webhook subscription

### Example Usage

<!-- UsageSnippet language="java" operationID="webhook.webhooksDelete" method="delete" path="/webhook/webhooks/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.WebhookWebhooksDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        WebhookWebhooksDeleteResponse res = sdk.webhook().webhooks().delete()
                .id("<id>")
                .call();

        if (res.deleteWebhookResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `id`                                                                                               | *String*                                                                                           | :heavy_check_mark:                                                                                 | JWT Webhook token that represents the unifiedApi and applicationId associated to the event source. |                                                                                                    |
| `appId`                                                                                            | *Optional\<String>*                                                                                | :heavy_minus_sign:                                                                                 | The ID of your Unify application                                                                   | dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX                                                            |

### Response

**[WebhookWebhooksDeleteResponse](../../models/operations/WebhookWebhooksDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |