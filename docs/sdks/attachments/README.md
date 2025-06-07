# Attachments
(*accounting().attachments()*)

## Overview

### Available Operations

* [list](#list) - List Attachments
* [upload](#upload) - Upload attachment
* [get](#get) - Get Attachment
* [delete](#delete) - Delete Attachment
* [download](#download) - Download Attachment

## list

List Attachments

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.AttachmentReferenceType;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingAttachmentsAllRequest;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        AccountingAttachmentsAllRequest req = AccountingAttachmentsAllRequest.builder()
                .referenceType(AttachmentReferenceType.INVOICE)
                .referenceId("123456")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        sdk.accounting().attachments().list()
                .request(req)
                .callAsStream()
                .forEach(item -> {
                   // handle item
                });

    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AccountingAttachmentsAllRequest](../../models/operations/AccountingAttachmentsAllRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AccountingAttachmentsAllResponse](../../models/operations/AccountingAttachmentsAllResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## upload

Upload attachment

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.AttachmentReferenceType;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingAttachmentsUploadRequest;
import com.apideck.unify.models.operations.AccountingAttachmentsUploadResponse;
import java.lang.Exception;
import java.nio.charset.StandardCharsets;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        AccountingAttachmentsUploadRequest req = AccountingAttachmentsUploadRequest.builder()
                .referenceType(AttachmentReferenceType.INVOICE)
                .referenceId("123456")
                .requestBody("0x506D4BD16D".getBytes(StandardCharsets.UTF_8))
                .xApideckMetadata("{\"name\":\"document.pdf\",\"description\":\"Invoice attachment\"}")
                .serviceId("salesforce")
                .build();

        AccountingAttachmentsUploadResponse res = sdk.accounting().attachments().upload()
                .request(req)
                .call();

        if (res.createAttachmentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AccountingAttachmentsUploadRequest](../../models/operations/AccountingAttachmentsUploadRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |
| `serverURL`                                                                                         | *String*                                                                                            | :heavy_minus_sign:                                                                                  | An optional server URL to use.                                                                      |

### Response

**[AccountingAttachmentsUploadResponse](../../models/operations/AccountingAttachmentsUploadResponse.md)**

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

Get Attachment

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.AttachmentReferenceType;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingAttachmentsOneRequest;
import com.apideck.unify.models.operations.AccountingAttachmentsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        AccountingAttachmentsOneRequest req = AccountingAttachmentsOneRequest.builder()
                .referenceType(AttachmentReferenceType.INVOICE)
                .referenceId("123456")
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        AccountingAttachmentsOneResponse res = sdk.accounting().attachments().get()
                .request(req)
                .call();

        if (res.getAttachmentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AccountingAttachmentsOneRequest](../../models/operations/AccountingAttachmentsOneRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AccountingAttachmentsOneResponse](../../models/operations/AccountingAttachmentsOneResponse.md)**

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

Delete Attachment

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.AttachmentReferenceType;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingAttachmentsDeleteRequest;
import com.apideck.unify.models.operations.AccountingAttachmentsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        AccountingAttachmentsDeleteRequest req = AccountingAttachmentsDeleteRequest.builder()
                .referenceType(AttachmentReferenceType.INVOICE)
                .referenceId("123456")
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AccountingAttachmentsDeleteResponse res = sdk.accounting().attachments().delete()
                .request(req)
                .call();

        if (res.deleteAttachmentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AccountingAttachmentsDeleteRequest](../../models/operations/AccountingAttachmentsDeleteRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[AccountingAttachmentsDeleteResponse](../../models/operations/AccountingAttachmentsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |

## download

Download Attachment

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.AttachmentReferenceType;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingAttachmentsDownloadRequest;
import com.apideck.unify.models.operations.AccountingAttachmentsDownloadResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        AccountingAttachmentsDownloadRequest req = AccountingAttachmentsDownloadRequest.builder()
                .referenceType(AttachmentReferenceType.INVOICE)
                .referenceId("123456")
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        AccountingAttachmentsDownloadResponse res = sdk.accounting().attachments().download()
                .request(req)
                .call();

        if (res.getAttachmentDownloadResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [AccountingAttachmentsDownloadRequest](../../models/operations/AccountingAttachmentsDownloadRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[AccountingAttachmentsDownloadResponse](../../models/operations/AccountingAttachmentsDownloadResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |