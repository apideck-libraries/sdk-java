# CustomObjectSchemas
(*crm().customObjectSchemas()*)

## Overview

### Available Operations

* [list](#list) - List custom object schemas
* [create](#create) - Create custom object schema
* [get](#get) - Get custom object schema
* [update](#update) - Update custom object schema
* [delete](#delete) - Delete custom object schema

## list

List custom object schemas

### Example Usage

<!-- UsageSnippet language="java" operationID="crm.customObjectSchemasAll" method="get" path="/crm/custom-object-schemas" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmCustomObjectSchemasAllRequest;
import com.apideck.unify.models.operations.CrmCustomObjectSchemasAllResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        CrmCustomObjectSchemasAllRequest req = CrmCustomObjectSchemasAllRequest.builder()
                .serviceId("salesforce")
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .build();

        sdk.crm().customObjectSchemas().list()
                .request(req)
                .callAsStream()
                .forEach((CrmCustomObjectSchemasAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [CrmCustomObjectSchemasAllRequest](../../models/operations/CrmCustomObjectSchemasAllRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[CrmCustomObjectSchemasAllResponse](../../models/operations/CrmCustomObjectSchemasAllResponse.md)**

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

Create custom object schema

### Example Usage

<!-- UsageSnippet language="java" operationID="crm.customObjectSchemasAdd" method="post" path="/crm/custom-object-schemas" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmCustomObjectSchemasAddRequest;
import com.apideck.unify.models.operations.CrmCustomObjectSchemasAddResponse;
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

        CrmCustomObjectSchemasAddRequest req = CrmCustomObjectSchemasAddRequest.builder()
                .customObjectSchema(CustomObjectSchemaInput.builder()
                    .name("project")
                    .description("This schema defines a project custom object")
                    .fields(List.of(
                        Fields.builder()
                            .id("field_123")
                            .name("project_name")
                            .description("Name of the project")
                            .type(CustomObjectSchemaType.STRING)
                            .required(true)
                            .options(List.of(
                                CustomObjectSchemaOptions.builder()
                                    .value("option1")
                                    .label("Option 1")
                                    .build()))
                            .defaultValue("New Project")
                            .build()))
                    .visible(true)
                    .active(true)
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
                            .build(),
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
                .build();

        CrmCustomObjectSchemasAddResponse res = sdk.crm().customObjectSchemas().create()
                .request(req)
                .call();

        if (res.createCustomObjectSchemaResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [CrmCustomObjectSchemasAddRequest](../../models/operations/CrmCustomObjectSchemasAddRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[CrmCustomObjectSchemasAddResponse](../../models/operations/CrmCustomObjectSchemasAddResponse.md)**

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

Get custom object schema

### Example Usage

<!-- UsageSnippet language="java" operationID="crm.customObjectSchemasOne" method="get" path="/crm/custom-object-schemas/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmCustomObjectSchemasOneRequest;
import com.apideck.unify.models.operations.CrmCustomObjectSchemasOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        CrmCustomObjectSchemasOneRequest req = CrmCustomObjectSchemasOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        CrmCustomObjectSchemasOneResponse res = sdk.crm().customObjectSchemas().get()
                .request(req)
                .call();

        if (res.getCustomObjectSchemaResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [CrmCustomObjectSchemasOneRequest](../../models/operations/CrmCustomObjectSchemasOneRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[CrmCustomObjectSchemasOneResponse](../../models/operations/CrmCustomObjectSchemasOneResponse.md)**

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

Update custom object schema

### Example Usage

<!-- UsageSnippet language="java" operationID="crm.customObjectSchemasUpdate" method="patch" path="/crm/custom-object-schemas/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmCustomObjectSchemasUpdateRequest;
import com.apideck.unify.models.operations.CrmCustomObjectSchemasUpdateResponse;
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

        CrmCustomObjectSchemasUpdateRequest req = CrmCustomObjectSchemasUpdateRequest.builder()
                .id("<id>")
                .customObjectSchema(CustomObjectSchemaInput.builder()
                    .name("project")
                    .description("This schema defines a project custom object")
                    .fields(List.of(
                        Fields.builder()
                            .id("field_123")
                            .name("project_name")
                            .description("Name of the project")
                            .type(CustomObjectSchemaType.STRING)
                            .required(true)
                            .options(List.of(
                                CustomObjectSchemaOptions.builder()
                                    .value("option1")
                                    .label("Option 1")
                                    .build(),
                                CustomObjectSchemaOptions.builder()
                                    .value("option1")
                                    .label("Option 1")
                                    .build()))
                            .defaultValue("New Project")
                            .build(),
                        Fields.builder()
                            .id("field_123")
                            .name("project_name")
                            .description("Name of the project")
                            .type(CustomObjectSchemaType.STRING)
                            .required(true)
                            .options(List.of(
                                CustomObjectSchemaOptions.builder()
                                    .value("option1")
                                    .label("Option 1")
                                    .build(),
                                CustomObjectSchemaOptions.builder()
                                    .value("option1")
                                    .label("Option 1")
                                    .build()))
                            .defaultValue("New Project")
                            .build(),
                        Fields.builder()
                            .id("field_123")
                            .name("project_name")
                            .description("Name of the project")
                            .type(CustomObjectSchemaType.STRING)
                            .required(true)
                            .options(List.of(
                                CustomObjectSchemaOptions.builder()
                                    .value("option1")
                                    .label("Option 1")
                                    .build(),
                                CustomObjectSchemaOptions.builder()
                                    .value("option1")
                                    .label("Option 1")
                                    .build()))
                            .defaultValue("New Project")
                            .build()))
                    .visible(true)
                    .active(true)
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
                .build();

        CrmCustomObjectSchemasUpdateResponse res = sdk.crm().customObjectSchemas().update()
                .request(req)
                .call();

        if (res.updateCustomObjectSchemaResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [CrmCustomObjectSchemasUpdateRequest](../../models/operations/CrmCustomObjectSchemasUpdateRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[CrmCustomObjectSchemasUpdateResponse](../../models/operations/CrmCustomObjectSchemasUpdateResponse.md)**

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

Delete custom object schema

### Example Usage

<!-- UsageSnippet language="java" operationID="crm.customObjectSchemasDelete" method="delete" path="/crm/custom-object-schemas/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.CrmCustomObjectSchemasDeleteRequest;
import com.apideck.unify.models.operations.CrmCustomObjectSchemasDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        CrmCustomObjectSchemasDeleteRequest req = CrmCustomObjectSchemasDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        CrmCustomObjectSchemasDeleteResponse res = sdk.crm().customObjectSchemas().delete()
                .request(req)
                .call();

        if (res.deleteCustomObjectSchemaResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [CrmCustomObjectSchemasDeleteRequest](../../models/operations/CrmCustomObjectSchemasDeleteRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[CrmCustomObjectSchemasDeleteResponse](../../models/operations/CrmCustomObjectSchemasDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |