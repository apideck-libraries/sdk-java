# Connections
(*vault().connections()*)

## Overview

### Available Operations

* [list](#list) - Get all connections
* [get](#get) - Get connection
* [update](#update) - Update connection
* [delete](#delete) - Deletes a connection
* [imports](#imports) - Import connection
* [token](#token) - Authorize Access Token

## list

This endpoint includes all the configured integrations and contains the required assets
to build an integrations page where your users can install integrations.
OAuth2 supported integrations will contain authorize and revoke links to handle the authentication flows.


### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.VaultConnectionsAllResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        VaultConnectionsAllResponse res = sdk.vault().connections().list()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .api("crm")
                .configured(true)
                .call();

        if (res.getConnectionsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    | Example                                                        |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `consumerId`                                                   | *Optional\<String>*                                            | :heavy_minus_sign:                                             | ID of the consumer which you want to get or push data from     | test-consumer                                                  |
| `appId`                                                        | *Optional\<String>*                                            | :heavy_minus_sign:                                             | The ID of your Unify application                               | dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX                        |
| `api`                                                          | *Optional\<String>*                                            | :heavy_minus_sign:                                             | Scope results to Unified API                                   | crm                                                            |
| `configured`                                                   | *Optional\<Boolean>*                                           | :heavy_minus_sign:                                             | Scopes results to connections that have been configured or not | true                                                           |

### Response

**[VaultConnectionsAllResponse](../../models/operations/VaultConnectionsAllResponse.md)**

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

Get a connection

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.VaultConnectionsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        VaultConnectionsOneResponse res = sdk.vault().connections().get()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .serviceId("pipedrive")
                .unifiedApi("crm")
                .call();

        if (res.getConnectionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                | Example                                                    |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `consumerId`                                               | *Optional\<String>*                                        | :heavy_minus_sign:                                         | ID of the consumer which you want to get or push data from | test-consumer                                              |
| `appId`                                                    | *Optional\<String>*                                        | :heavy_minus_sign:                                         | The ID of your Unify application                           | dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX                    |
| `serviceId`                                                | *String*                                                   | :heavy_check_mark:                                         | Service ID of the resource to return                       | pipedrive                                                  |
| `unifiedApi`                                               | *String*                                                   | :heavy_check_mark:                                         | Unified API                                                | crm                                                        |

### Response

**[VaultConnectionsOneResponse](../../models/operations/VaultConnectionsOneResponse.md)**

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

Update a connection

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.ConnectionConfiguration;
import com.apideck.unify.models.components.ConnectionDefaults;
import com.apideck.unify.models.components.ConnectionInput;
import com.apideck.unify.models.components.ConnectionValue;
import com.apideck.unify.models.components.CustomMappingInput;
import com.apideck.unify.models.components.Five;
import com.apideck.unify.models.components.FormFieldOption;
import com.apideck.unify.models.components.FormFieldOptionGroup;
import com.apideck.unify.models.components.SimpleFormFieldOption;
import com.apideck.unify.models.components.SimpleFormFieldOptionValue;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.VaultConnectionsUpdateRequest;
import com.apideck.unify.models.operations.VaultConnectionsUpdateResponse;
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

        VaultConnectionsUpdateRequest req = VaultConnectionsUpdateRequest.builder()
                .serviceId("pipedrive")
                .unifiedApi("crm")
                .connection(ConnectionInput.builder()
                    .enabled(true)
                    .settings(Map.ofEntries(
                        Map.entry("instance_url", "https://eu28.salesforce.com"),
                        Map.entry("api_key", "12345xxxxxx")))
                    .metadata(Map.ofEntries(
                        Map.entry("account", Map.ofEntries(\n    Map.entry("name", "My Company"),\n    Map.entry("id", "c01458a5-7276-41ce-bc19-639906b0450a"))),
                        Map.entry("plan", "enterprise")))
                    .configuration(List.of(
                        ConnectionConfiguration.builder()
                            .resource("leads")
                            .defaults(List.of(
                                ConnectionDefaults.builder()
                                    .id("ProductInterest")
                                    .options(List.of(
                                        FormFieldOption.of(FormFieldOptionGroup.builder()
                                            .id("1234")
                                            .label("General Channel")
                                            .options(List.of(
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .value(SimpleFormFieldOptionValue.of(12.5d))
                                                    .build(),
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .value(SimpleFormFieldOptionValue.of(List.of(
                                                        Five.of("team"),
                                                        Five.of("general"))))
                                                    .build()))
                                            .build()),
                                        FormFieldOption.of(SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .value(SimpleFormFieldOptionValue.of(List.of(
                                                Five.of("team"),
                                                Five.of("general"))))
                                            .build())))
                                    .value(ConnectionValue.of(10.5d))
                                    .build(),
                                ConnectionDefaults.builder()
                                    .id("ProductInterest")
                                    .options(List.of(
                                        FormFieldOption.of(SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .value(SimpleFormFieldOptionValue.of("general"))
                                            .build())))
                                    .value(ConnectionValue.of(true))
                                    .build()))
                            .build(),
                        ConnectionConfiguration.builder()
                            .resource("leads")
                            .defaults(List.of(
                                ConnectionDefaults.builder()
                                    .id("ProductInterest")
                                    .options(List.of(
                                        FormFieldOption.of(SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .value(SimpleFormFieldOptionValue.of(true))
                                            .build())))
                                    .value(ConnectionValue.of(true))
                                    .build(),
                                ConnectionDefaults.builder()
                                    .id("ProductInterest")
                                    .options(List.of(
                                        FormFieldOption.of(SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .value(SimpleFormFieldOptionValue.of(true))
                                            .build()),
                                        FormFieldOption.of(FormFieldOptionGroup.builder()
                                            .id("1234")
                                            .label("General Channel")
                                            .options(List.of(
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .value(SimpleFormFieldOptionValue.of(12.5d))
                                                    .build(),
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .value(SimpleFormFieldOptionValue.of("general"))
                                                    .build()))
                                            .build())))
                                    .value(ConnectionValue.of(10L))
                                    .build(),
                                ConnectionDefaults.builder()
                                    .id("ProductInterest")
                                    .options(List.of(
                                        FormFieldOption.of(FormFieldOptionGroup.builder()
                                            .id("1234")
                                            .label("General Channel")
                                            .options(List.of(
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .value(SimpleFormFieldOptionValue.of(List.of(
                                                        Five.of("team"),
                                                        Five.of("general"))))
                                                    .build(),
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .value(SimpleFormFieldOptionValue.of(true))
                                                    .build(),
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .value(SimpleFormFieldOptionValue.of(12.5d))
                                                    .build()))
                                            .build()),
                                        FormFieldOption.of(SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .value(SimpleFormFieldOptionValue.of(12.5d))
                                            .build())))
                                    .value(ConnectionValue.of(10.5d))
                                    .build()))
                            .build(),
                        ConnectionConfiguration.builder()
                            .resource("leads")
                            .defaults(List.of(
                                ConnectionDefaults.builder()
                                    .id("ProductInterest")
                                    .options(List.of(
                                        FormFieldOption.of(SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .value(SimpleFormFieldOptionValue.of("general"))
                                            .build()),
                                        FormFieldOption.of(SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .value(SimpleFormFieldOptionValue.of(true))
                                            .build()),
                                        FormFieldOption.of(SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .value(SimpleFormFieldOptionValue.of(true))
                                            .build())))
                                    .value(ConnectionValue.of("GC5000 series"))
                                    .build(),
                                ConnectionDefaults.builder()
                                    .id("ProductInterest")
                                    .options(List.of(
                                        FormFieldOption.of(SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .value(SimpleFormFieldOptionValue.of(true))
                                            .build()),
                                        FormFieldOption.of(SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .value(SimpleFormFieldOptionValue.of(123L))
                                            .build())))
                                    .value(ConnectionValue.of(10.5d))
                                    .build()))
                            .build()))
                    .customMappings(List.of(
                        CustomMappingInput.builder()
                            .value("$.root.training.first_aid")
                            .build()))
                    .build())
                .build();

        VaultConnectionsUpdateResponse res = sdk.vault().connections().update()
                .request(req)
                .call();

        if (res.updateConnectionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [VaultConnectionsUpdateRequest](../../models/operations/VaultConnectionsUpdateRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[VaultConnectionsUpdateResponse](../../models/operations/VaultConnectionsUpdateResponse.md)**

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

Deletes a connection

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.VaultConnectionsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        VaultConnectionsDeleteResponse res = sdk.vault().connections().delete()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .serviceId("pipedrive")
                .unifiedApi("crm")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                | Example                                                    |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `consumerId`                                               | *Optional\<String>*                                        | :heavy_minus_sign:                                         | ID of the consumer which you want to get or push data from | test-consumer                                              |
| `appId`                                                    | *Optional\<String>*                                        | :heavy_minus_sign:                                         | The ID of your Unify application                           | dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX                    |
| `serviceId`                                                | *String*                                                   | :heavy_check_mark:                                         | Service ID of the resource to return                       | pipedrive                                                  |
| `unifiedApi`                                               | *String*                                                   | :heavy_check_mark:                                         | Unified API                                                | crm                                                        |

### Response

**[VaultConnectionsDeleteResponse](../../models/operations/VaultConnectionsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## imports

Import an authorized connection.


### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.ConnectionImportData;
import com.apideck.unify.models.components.Credentials;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.VaultConnectionsImportRequest;
import com.apideck.unify.models.operations.VaultConnectionsImportResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        VaultConnectionsImportRequest req = VaultConnectionsImportRequest.builder()
                .serviceId("pipedrive")
                .unifiedApi("crm")
                .connectionImportData(ConnectionImportData.builder()
                    .credentials(Credentials.builder()
                        .refreshToken("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.cThIIoDvwdueQB468K5xDc5633seEFoqwxjF_xSJyQQ")
                        .accessToken("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c")
                        .build())
                    .metadata(Map.ofEntries(
                        Map.entry("account", Map.ofEntries(\n    Map.entry("name", "My Company"),\n    Map.entry("id", "c01458a5-7276-41ce-bc19-639906b0450a"))),
                        Map.entry("plan", "enterprise")))
                    .build())
                .build();

        VaultConnectionsImportResponse res = sdk.vault().connections().imports()
                .request(req)
                .call();

        if (res.createConnectionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [VaultConnectionsImportRequest](../../models/operations/VaultConnectionsImportRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[VaultConnectionsImportResponse](../../models/operations/VaultConnectionsImportResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## token

Triggers exchanging persisted connection credentials for an access token and store it in Vault. Currently supported for connections with the `client_credentials` or `password` OAuth grant type.

Note:
  - Do not include any credentials in the request body. This operation does not persist changes, but only triggers the exchange of persisted connection credentials for an access token.
  - The access token will not be returned in the response. A 200 response code indicates the authorization was successful and that a valid access token was stored on the connection.
  - The access token will be used for subsequent API requests.


### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.VaultConnectionsTokenRequest;
import com.apideck.unify.models.operations.VaultConnectionsTokenResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        VaultConnectionsTokenRequest req = VaultConnectionsTokenRequest.builder()
                .serviceId("pipedrive")
                .unifiedApi("crm")
                .build();

        VaultConnectionsTokenResponse res = sdk.vault().connections().token()
                .request(req)
                .call();

        if (res.getConnectionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [VaultConnectionsTokenRequest](../../models/operations/VaultConnectionsTokenRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[VaultConnectionsTokenResponse](../../models/operations/VaultConnectionsTokenResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |