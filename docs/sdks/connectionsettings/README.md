# ConnectionSettings
(*vault().connectionSettings()*)

## Overview

### Available Operations

* [list](#list) - Get resource settings
* [update](#update) - Update settings

## list

This endpoint returns custom settings and their defaults required by connection for a given resource.


### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.VaultConnectionSettingsAllRequest;
import com.apideck.unify.models.operations.VaultConnectionSettingsAllResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        VaultConnectionSettingsAllRequest req = VaultConnectionSettingsAllRequest.builder()
                .unifiedApi("crm")
                .serviceId("pipedrive")
                .resource("leads")
                .build();

        VaultConnectionSettingsAllResponse res = sdk.vault().connectionSettings().list()
                .request(req)
                .call();

        if (res.getConnectionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [VaultConnectionSettingsAllRequest](../../models/operations/VaultConnectionSettingsAllRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[VaultConnectionSettingsAllResponse](../../models/operations/VaultConnectionSettingsAllResponse.md)**

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

Update default values for a connection's resource settings

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.VaultConnectionSettingsUpdateRequest;
import com.apideck.unify.models.operations.VaultConnectionSettingsUpdateResponse;
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

        VaultConnectionSettingsUpdateRequest req = VaultConnectionSettingsUpdateRequest.builder()
                .serviceId("pipedrive")
                .unifiedApi("crm")
                .resource("leads")
                .connection(ConnectionInput.builder()
                    .enabled(true)
                    .settings(Map.ofEntries(
                        Map.entry("instance_url", "https://eu28.salesforce.com"),
                        Map.entry("api_key", "12345xxxxxx")))
                    .metadata(Map.ofEntries(
                        Map.entry("account", Map.ofEntries(
                            Map.entry("name", "My Company"),
                            Map.entry("id", "c01458a5-7276-41ce-bc19-639906b0450a"))),
                        Map.entry("plan", "enterprise")))
                    .configuration(List.of(
                        ConnectionConfiguration.builder()
                            .resource("leads")
                            .defaults(List.of(
                                ConnectionDefaults.builder()
                                    .id("ProductInterest")
                                    .options(List.of(
                                        SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .optionType(OptionType.SIMPLE)
                                            .build()))
                                    .value(ConnectionValue.of("GC5000 series"))
                                    .build(),
                                ConnectionDefaults.builder()
                                    .id("ProductInterest")
                                    .options(List.of(
                                        SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .optionType(OptionType.SIMPLE)
                                            .build()))
                                    .value(ConnectionValue.of("GC5000 series"))
                                    .build(),
                                ConnectionDefaults.builder()
                                    .id("ProductInterest")
                                    .options(List.of(
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
                                        SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .optionType(OptionType.SIMPLE)
                                            .build()))
                                    .value(ConnectionValue.of("GC5000 series"))
                                    .build(),
                                ConnectionDefaults.builder()
                                    .id("ProductInterest")
                                    .options(List.of(
                                        SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .optionType(OptionType.SIMPLE)
                                            .build()))
                                    .value(ConnectionValue.of("GC5000 series"))
                                    .build(),
                                ConnectionDefaults.builder()
                                    .id("ProductInterest")
                                    .options(List.of(
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
                            .build()))
                    .build())
                .build();

        VaultConnectionSettingsUpdateResponse res = sdk.vault().connectionSettings().update()
                .request(req)
                .call();

        if (res.updateConnectionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [VaultConnectionSettingsUpdateRequest](../../models/operations/VaultConnectionSettingsUpdateRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[VaultConnectionSettingsUpdateResponse](../../models/operations/VaultConnectionSettingsUpdateResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |