# Sessions
(*vault().sessions()*)

## Overview

### Available Operations

* [create](#create) - Create Session

## create

Making a POST request to this endpoint will initiate a Hosted Vault session. Redirect the consumer to the returned
URL to allow temporary access to manage their integrations and settings.

Note: This is a short lived token that will expire after 1 hour (TTL: 3600).


### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.ConsumerMetadata;
import com.apideck.unify.models.components.Session;
import com.apideck.unify.models.components.SessionSettings;
import com.apideck.unify.models.components.Theme;
import com.apideck.unify.models.components.UnifiedApiId;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.VaultSessionsCreateResponse;
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

        VaultSessionsCreateResponse res = sdk.vault().sessions().create()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .session(Session.builder()
                    .consumerMetadata(ConsumerMetadata.builder()
                        .accountName("SpaceX")
                        .userName("Elon Musk")
                        .email("elon@musk.com")
                        .image("https://www.spacex.com/static/images/share.jpg")
                        .build())
                    .redirectUri("https://mysaas.com/dashboard")
                    .settings(SessionSettings.builder()
                        .unifiedApis(List.of(
                            UnifiedApiId.CRM))
                        .build())
                    .theme(Theme.builder()
                        .favicon("https://res.cloudinary.com/apideck/icons/intercom")
                        .logo("https://res.cloudinary.com/apideck/icons/intercom")
                        .primaryColor("#286efa")
                        .sidepanelBackgroundColor("#286efa")
                        .sidepanelTextColor("#FFFFFF")
                        .vaultName("Intercom")
                        .privacyUrl("https://compliance.apideck.com/privacy-policy")
                        .termsUrl("https://www.termsfeed.com/terms-conditions/957c85c1b089ae9e3219c83eff65377e")
                        .build())
                    .customConsumerSettings(Map.ofEntries(
                        Map.entry("feature_flag_1", true),
                        Map.entry("tax_rates", List.of(\n    Map.ofEntries(\n    Map.entry("id", "6"),\n    Map.entry("label", "6%")),\n    Map.ofEntries(\n    Map.entry("id", "21"),\n    Map.entry("label", "21%"))))))
                    .build())
                .call();

        if (res.createSessionResponse().isPresent()) {
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
| `session`                                                  | [Optional\<Session>](../../models/components/Session.md)   | :heavy_minus_sign:                                         | Additional redirect uri and/or consumer metadata           |                                                            |

### Response

**[VaultSessionsCreateResponse](../../models/operations/VaultSessionsCreateResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |