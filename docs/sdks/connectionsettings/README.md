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
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.VaultConnectionSettingsAllRequest;
import com.apideck.unify.models.operations.VaultConnectionSettingsAllResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
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
import com.apideck.unify.models.components.ConnectionConfiguration;
import com.apideck.unify.models.components.ConnectionDefaults;
import com.apideck.unify.models.components.ConnectionInput;
import com.apideck.unify.models.components.ConnectionValue;
import com.apideck.unify.models.components.CustomMappingInput;
import com.apideck.unify.models.components.Five;
import com.apideck.unify.models.components.FormFieldOptionGroup;
import com.apideck.unify.models.components.FormFieldOptionGroupOptionType;
import com.apideck.unify.models.components.OptionType;
import com.apideck.unify.models.components.SimpleFormFieldOption;
import com.apideck.unify.models.components.SimpleFormFieldOptionValue;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.VaultConnectionSettingsUpdateRequest;
import com.apideck.unify.models.operations.VaultConnectionSettingsUpdateResponse;
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
                                        FormFieldOptionGroup.builder()
                                            .label("General Channel")
                                            .options(List.of(
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .optionType(OptionType.SIMPLE)
                                                    .value(SimpleFormFieldOptionValue.of(123L))
                                                    .build(),
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .optionType(OptionType.SIMPLE)
                                                    .value(SimpleFormFieldOptionValue.of(List.of(
                                                        Five.of("team"),
                                                        Five.of("general"))))
                                                    .build()))
                                            .optionType(FormFieldOptionGroupOptionType.GROUP)
                                            .id("1234")
                                            .build(),
                                        FormFieldOptionGroup.builder()
                                            .label("General Channel")
                                            .options(List.of(
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .optionType(OptionType.SIMPLE)
                                                    .value(SimpleFormFieldOptionValue.of(List.of(
                                                        Five.of("team"),
                                                        Five.of("general"))))
                                                    .build()))
                                            .optionType(FormFieldOptionGroupOptionType.GROUP)
                                            .id("1234")
                                            .build()))
                                    .value(ConnectionValue.of(10.5))
                                    .build(),
                                ConnectionDefaults.builder()
                                    .id("ProductInterest")
                                    .options(List.of(
                                        SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .optionType(OptionType.SIMPLE)
                                            .value(SimpleFormFieldOptionValue.of(List.of(
                                                Five.of("team"),
                                                Five.of("general"))))
                                            .build()))
                                    .value(ConnectionValue.of(true))
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
                                            .value(SimpleFormFieldOptionValue.of(123L))
                                            .build()))
                                    .value(ConnectionValue.of(true))
                                    .build(),
                                ConnectionDefaults.builder()
                                    .id("ProductInterest")
                                    .options(List.of(
                                        SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .optionType(OptionType.SIMPLE)
                                            .value(SimpleFormFieldOptionValue.of("general"))
                                            .build(),
                                        FormFieldOptionGroup.builder()
                                            .label("General Channel")
                                            .options(List.of(
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .optionType(OptionType.SIMPLE)
                                                    .value(SimpleFormFieldOptionValue.of(123L))
                                                    .build(),
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .optionType(OptionType.SIMPLE)
                                                    .value(SimpleFormFieldOptionValue.of(12.5))
                                                    .build(),
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .optionType(OptionType.SIMPLE)
                                                    .value(SimpleFormFieldOptionValue.of(true))
                                                    .build()))
                                            .optionType(FormFieldOptionGroupOptionType.GROUP)
                                            .id("1234")
                                            .build()))
                                    .value(ConnectionValue.of(10L))
                                    .build(),
                                ConnectionDefaults.builder()
                                    .id("ProductInterest")
                                    .options(List.of(
                                        FormFieldOptionGroup.builder()
                                            .label("General Channel")
                                            .options(List.of(
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .optionType(OptionType.SIMPLE)
                                                    .value(SimpleFormFieldOptionValue.of("general"))
                                                    .build()))
                                            .optionType(FormFieldOptionGroupOptionType.GROUP)
                                            .id("1234")
                                            .build(),
                                        FormFieldOptionGroup.builder()
                                            .label("General Channel")
                                            .options(List.of(
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .optionType(OptionType.SIMPLE)
                                                    .value(SimpleFormFieldOptionValue.of(12.5))
                                                    .build(),
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .optionType(OptionType.SIMPLE)
                                                    .value(SimpleFormFieldOptionValue.of(12.5))
                                                    .build(),
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .optionType(OptionType.SIMPLE)
                                                    .value(SimpleFormFieldOptionValue.of("general"))
                                                    .build()))
                                            .optionType(FormFieldOptionGroupOptionType.GROUP)
                                            .id("1234")
                                            .build()))
                                    .value(ConnectionValue.of(10.5))
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
                                            .value(SimpleFormFieldOptionValue.of(123L))
                                            .build(),
                                        FormFieldOptionGroup.builder()
                                            .label("General Channel")
                                            .options(List.of(
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .optionType(OptionType.SIMPLE)
                                                    .value(SimpleFormFieldOptionValue.of(List.of(
                                                        Five.of("team"),
                                                        Five.of("general"))))
                                                    .build(),
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .optionType(OptionType.SIMPLE)
                                                    .value(SimpleFormFieldOptionValue.of(true))
                                                    .build(),
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .optionType(OptionType.SIMPLE)
                                                    .value(SimpleFormFieldOptionValue.of(12.5))
                                                    .build()))
                                            .optionType(FormFieldOptionGroupOptionType.GROUP)
                                            .id("1234")
                                            .build(),
                                        SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .optionType(OptionType.SIMPLE)
                                            .value(SimpleFormFieldOptionValue.of(12.5))
                                            .build()))
                                    .value(ConnectionValue.of("GC5000 series"))
                                    .build(),
                                ConnectionDefaults.builder()
                                    .id("ProductInterest")
                                    .options(List.of(
                                        FormFieldOptionGroup.builder()
                                            .label("General Channel")
                                            .options(List.of(
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .optionType(OptionType.SIMPLE)
                                                    .value(SimpleFormFieldOptionValue.of(List.of(
                                                        Five.of("team"),
                                                        Five.of("general"))))
                                                    .build(),
                                                SimpleFormFieldOption.builder()
                                                    .label("General Channel")
                                                    .optionType(OptionType.SIMPLE)
                                                    .value(SimpleFormFieldOptionValue.of("general"))
                                                    .build()))
                                            .optionType(FormFieldOptionGroupOptionType.GROUP)
                                            .id("1234")
                                            .build(),
                                        SimpleFormFieldOption.builder()
                                            .label("General Channel")
                                            .optionType(OptionType.SIMPLE)
                                            .value(SimpleFormFieldOptionValue.of(123L))
                                            .build()))
                                    .value(ConnectionValue.of(10.5))
                                    .build()))
                            .build()))
                    .customMappings(List.of(
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