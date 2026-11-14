# Vault.Connections

## Overview

### Available Operations

* [list](#list) - Get all connections
* [get](#get) - Get connection
* [update](#update) - Update connection
* [delete](#delete) - Deletes a connection
* [imports](#imports) - Import connection
* [migrate](#migrate) - Migrate connection
* [token](#token) - Authorize Access Token
* [confirm](#confirm) - Confirm Connection

## list

This endpoint includes all the configured integrations and contains the required assets
to build an integrations page where your users can install integrations.
OAuth2 supported integrations will contain authorize and revoke links to handle the authentication flows.


### Example Usage

<!-- UsageSnippet language="java" operationID="vault.connectionsAll" method="get" path="/vault/connections" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.VaultConnectionsAllResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        VaultConnectionsAllResponse res = sdk.vault().connections().list()
                .api("crm")
                .configured(true)
                .call();

        if (res.getConnectionsResponse().isPresent()) {
            System.out.println(res.getConnectionsResponse().get());
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

<!-- UsageSnippet language="java" operationID="vault.connectionsOne" method="get" path="/vault/connections/{unified_api}/{service_id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.VaultConnectionsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        VaultConnectionsOneResponse res = sdk.vault().connections().get()
                .serviceId("pipedrive")
                .unifiedApi("crm")
                .call();

        if (res.getConnectionResponse().isPresent()) {
            System.out.println(res.getConnectionResponse().get());
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

<!-- UsageSnippet language="java" operationID="vault.connectionsUpdate" method="patch" path="/vault/connections/{unified_api}/{service_id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.VaultConnectionsUpdateRequest;
import com.apideck.unify.models.operations.VaultConnectionsUpdateResponse;
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

        VaultConnectionsUpdateRequest req = VaultConnectionsUpdateRequest.builder()
                .serviceId("pipedrive")
                .unifiedApi("crm")
                .connection(ConnectionInput.builder()
                    .enabled(true)
                    .settings(Map.ofEntries(
                        Map.entry("instance_url", "https://eu28.salesforce.com"),
                        Map.entry("api_key", "12345xxxxxx")))
                    .metadata(ConnectionMetadataInput.builder()
                        .additionalProperties(Map.ofEntries(
                            Map.entry("account", Map.ofEntries(
                                Map.entry("name", "My Company"),
                                Map.entry("id", "c01458a5-7276-41ce-bc19-639906b0450a"))),
                            Map.entry("plan", "enterprise")))
                        .build())
                    .configuration(List.of(
                        ConnectionConfiguration.builder()
                            .resource("leads")
                            .defaults(List.of(
                                ConnectionDefaults.builder()
                                    .id("ProductInterest")
                                    .options(List.of(
                                        FormFieldOptionGroup.builder()
                                            .label("General Channel")
                                            .options(List.of())
                                            .optionType(FormFieldOptionGroupOptionType.GROUP)
                                            .build(),
                                        SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .optionType(OptionType.SIMPLE)
                                            .build()))
                                    .value(ConnectionValue.of("GC5000 series"))
                                    .build(),
                                ConnectionDefaults.builder()
                                    .id("ProductInterest")
                                    .options(List.of(
                                        FormFieldOptionGroup.builder()
                                            .label("General Channel")
                                            .options(List.of())
                                            .optionType(FormFieldOptionGroupOptionType.GROUP)
                                            .build(),
                                        SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .optionType(OptionType.SIMPLE)
                                            .build()))
                                    .value(ConnectionValue.of("GC5000 series"))
                                    .build()))
                            .build(),
                        ConnectionConfiguration.builder()
                            .resource("leads")
                            .defaults(List.of(
                                ConnectionDefaults.builder()
                                    .id("ProductInterest")
                                    .options(List.of(
                                        FormFieldOptionGroup.builder()
                                            .label("General Channel")
                                            .options(List.of())
                                            .optionType(FormFieldOptionGroupOptionType.GROUP)
                                            .build(),
                                        SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .optionType(OptionType.SIMPLE)
                                            .build()))
                                    .value(ConnectionValue.of("GC5000 series"))
                                    .build(),
                                ConnectionDefaults.builder()
                                    .id("ProductInterest")
                                    .options(List.of(
                                        FormFieldOptionGroup.builder()
                                            .label("General Channel")
                                            .options(List.of())
                                            .optionType(FormFieldOptionGroupOptionType.GROUP)
                                            .build(),
                                        SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .optionType(OptionType.SIMPLE)
                                            .build()))
                                    .value(ConnectionValue.of("GC5000 series"))
                                    .build()))
                            .build()))
                    .customMappings(List.of(
                        CustomMappingInput.builder()
                            .value("$.root.training.first_aid")
                            .build(),
                        CustomMappingInput.builder()
                            .value("$.root.training.first_aid")
                            .build(),
                        CustomMappingInput.builder()
                            .value("$.root.training.first_aid")
                            .build()))
                    .build())
                .build();

        VaultConnectionsUpdateResponse res = sdk.vault().connections().update()
                .request(req)
                .call();

        if (res.updateConnectionResponse().isPresent()) {
            System.out.println(res.updateConnectionResponse().get());
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

<!-- UsageSnippet language="java" operationID="vault.connectionsDelete" method="delete" path="/vault/connections/{unified_api}/{service_id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.VaultConnectionsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        VaultConnectionsDeleteResponse res = sdk.vault().connections().delete()
                .serviceId("pipedrive")
                .unifiedApi("crm")
                .call();

        if (res.unexpectedErrorResponse().isPresent()) {
            System.out.println(res.unexpectedErrorResponse().get());
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

<!-- UsageSnippet language="java" operationID="vault.connectionsImport" method="post" path="/vault/connections/{unified_api}/{service_id}/import" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.ConnectionImportData;
import com.apideck.unify.models.components.Credentials;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.VaultConnectionsImportRequest;
import com.apideck.unify.models.operations.VaultConnectionsImportResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        VaultConnectionsImportRequest req = VaultConnectionsImportRequest.builder()
                .serviceId("pipedrive")
                .unifiedApi("crm")
                .connectionImportData(ConnectionImportData.builder()
                    .credentials(Credentials.builder()
                        .refreshToken("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.cThIIoDvwdueQB468K5xDc5633seEFoqwxjF_xSJyQQ")
                        .accessToken("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c")
                        .build())
                    .settings(Map.ofEntries(
                        Map.entry("instance_url", "https://eu28.salesforce.com")))
                    .metadata(Map.ofEntries(
                        Map.entry("account", Map.ofEntries(
                            Map.entry("name", "My Company"),
                            Map.entry("id", "c01458a5-7276-41ce-bc19-639906b0450a"))),
                        Map.entry("plan", "enterprise")))
                    .build())
                .build();

        VaultConnectionsImportResponse res = sdk.vault().connections().imports()
                .request(req)
                .call();

        if (res.createConnectionResponse().isPresent()) {
            System.out.println(res.createConnectionResponse().get());
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

## migrate

Migrate the connection to the target connector, keeping its credentials and connection state
(settings, metadata, configuration, subscriptions, consents). The source connection record is
removed WITHOUT revoking or disconnecting the downstream token.

Available migration targets are declared per connector — refer to the connector's
documentation page or the Connector API's `migration_targets` field.

Migrated tokens carry the source connector's OAuth scopes, so operations exclusive to the
target connector may require re-authorization.

Retries are idempotent: a partially-completed migration resumes where it left off.


### Example Usage

<!-- UsageSnippet language="java" operationID="vault.connectionsMigrate" method="post" path="/vault/connections/{unified_api}/{service_id}/migrate" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.ConnectionMigrateData;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.VaultConnectionsMigrateRequest;
import com.apideck.unify.models.operations.VaultConnectionsMigrateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        VaultConnectionsMigrateRequest req = VaultConnectionsMigrateRequest.builder()
                .serviceId("pipedrive")
                .unifiedApi("crm")
                .connectionMigrateData(ConnectionMigrateData.builder()
                    .targetServiceId("intuit-enterprise-suite")
                    .build())
                .build();

        VaultConnectionsMigrateResponse res = sdk.vault().connections().migrate()
                .request(req)
                .call();

        if (res.createConnectionResponse().isPresent()) {
            System.out.println(res.createConnectionResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [VaultConnectionsMigrateRequest](../../models/operations/VaultConnectionsMigrateRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[VaultConnectionsMigrateResponse](../../models/operations/VaultConnectionsMigrateResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/ConflictResponse        | 409                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## token

Triggers exchanging persisted connection credentials for an access token and store it in Vault. Currently supported for connections with the `client_credentials` or `password` OAuth grant type.

Note:
  - Do not include any credentials in the request body. This operation does not persist changes, but only triggers the exchange of persisted connection credentials for an access token.
  - The access token will not be returned in the response. A 200 response code indicates the authorization was successful and that a valid access token was stored on the connection.
  - The access token will be used for subsequent API requests.


### Example Usage

<!-- UsageSnippet language="java" operationID="vault.connectionsToken" method="post" path="/vault/connections/{unified_api}/{service_id}/token" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.VaultConnectionsTokenRequest;
import com.apideck.unify.models.operations.VaultConnectionsTokenResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        VaultConnectionsTokenRequest req = VaultConnectionsTokenRequest.builder()
                .serviceId("pipedrive")
                .unifiedApi("crm")
                .build();

        VaultConnectionsTokenResponse res = sdk.vault().connections().token()
                .request(req)
                .call();

        if (res.getConnectionResponse().isPresent()) {
            System.out.println(res.getConnectionResponse().get());
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

## confirm

Confirms an OAuth connection after the callback by redeeming its confirm token.

The confirm step is required when your application's OAuth protection mode was `enforced` when the
authorization flow started. In that case Vault completes the OAuth exchange but leaves the connection
**unconfirmed** and not callable, and the callback redirects to your `redirect_uri` with a hash
fragment containing a `confirm_token`, the `service_id` and the `unified_api`, plus the `nonce` when
the authorize request included one and the `target_origin` when it included an `opener_origin`:
`#confirm_token=<token>&service_id=<service_id>&unified_api=<unified_api>&nonce=<nonce>&target_origin=<origin>`.
Call this endpoint with that `confirm_token` to confirm the connection and make it callable.

The `confirm_token` is single use and expires 30 minutes after the callback. Only confirm tokens are
accepted; other tokens (such as an authorize `state`) are rejected. In the `off`
protection mode there is no confirm step: the connection is callable immediately after the
callback and no `confirm_token` is issued.

Authenticate in one of two ways:

- With the Vault session JWT as the bearer token (`Authorization: Bearer <session token>`) and the
  `x-apideck-auth-type: JWT` header, as Hosted Vault and Vault JS do. The application and consumer
  are taken from the session.
- With your API key (`Authorization: Bearer <API key>`) plus the `x-apideck-app-id` and
  `x-apideck-consumer-id` headers, from your backend.


### Example Usage

<!-- UsageSnippet language="java" operationID="vault.connectionsConfirm" method="post" path="/vault/connections/{unified_api}/{service_id}/confirm" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.ConfirmConnection;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.VaultConnectionsConfirmRequest;
import com.apideck.unify.models.operations.VaultConnectionsConfirmResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        VaultConnectionsConfirmRequest req = VaultConnectionsConfirmRequest.builder()
                .serviceId("pipedrive")
                .unifiedApi("crm")
                .confirmConnection(ConfirmConnection.builder()
                    .confirmToken("550e8400-e29b-41d4-a716-446655440000")
                    .build())
                .build();

        VaultConnectionsConfirmResponse res = sdk.vault().connections().confirm()
                .request(req)
                .call();

        if (res.confirmConnectionResponse().isPresent()) {
            System.out.println(res.confirmConnectionResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [VaultConnectionsConfirmRequest](../../models/operations/VaultConnectionsConfirmRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[VaultConnectionsConfirmResponse](../../models/operations/VaultConnectionsConfirmResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |