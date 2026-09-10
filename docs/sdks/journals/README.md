# Accounting.Journals

## Overview

### Available Operations

* [list](#list) - List Journals
* [create](#create) - Create Journal
* [get](#get) - Get Journal
* [update](#update) - Update Journal
* [delete](#delete) - Delete Journal

## list

List the journals (daybooks) available for posting accounting entries, including their codes, types, and VAT settings.

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.journalsAll" method="get" path="/accounting/journals" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingJournalsAllRequest;
import com.apideck.unify.models.operations.AccountingJournalsAllResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingJournalsAllRequest req = AccountingJournalsAllRequest.builder()
                .serviceId("salesforce")
                .companyId("12345")
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();


        sdk.accounting().journals().list()
                .callAsStream()
                .forEach((AccountingJournalsAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AccountingJournalsAllRequest](../../models/operations/AccountingJournalsAllRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AccountingJournalsAllResponse](../../models/operations/AccountingJournalsAllResponse.md)**

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

Create Journal

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.journalsAdd" method="post" path="/accounting/journals" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingJournalsAddRequest;
import com.apideck.unify.models.operations.AccountingJournalsAddResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingJournalsAddRequest req = AccountingJournalsAddRequest.builder()
                .journal(JournalInput.builder()
                    .code("90")
                    .name("General journal")
                    .description("General journal")
                    .type(JournalType.GENERAL)
                    .allowVat(true)
                    .currency(Currency.USD)
                    .iban("GB33BUKB20201555555555")
                    .defaultAccount(LinkedFinancialAccountInput.builder()
                        .id("123456")
                        .type(LinkedFinancialAccountAccountType.LEDGER_ACCOUNT)
                        .code("1100")
                        .displayId("123456")
                        .accountNumber("123465")
                        .build())
                    .blocked(false)
                    .build())
                .serviceId("salesforce")
                .companyId("12345")
                .build();

        AccountingJournalsAddResponse res = sdk.accounting().journals().create()
                .request(req)
                .call();

        if (res.createJournalResponse().isPresent()) {
            System.out.println(res.createJournalResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AccountingJournalsAddRequest](../../models/operations/AccountingJournalsAddRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AccountingJournalsAddResponse](../../models/operations/AccountingJournalsAddResponse.md)**

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

Get Journal

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.journalsOne" method="get" path="/accounting/journals/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingJournalsOneRequest;
import com.apideck.unify.models.operations.AccountingJournalsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingJournalsOneRequest req = AccountingJournalsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .companyId("12345")
                .fields("id,updated_at")
                .build();

        AccountingJournalsOneResponse res = sdk.accounting().journals().get()
                .request(req)
                .call();

        if (res.getJournalResponse().isPresent()) {
            System.out.println(res.getJournalResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AccountingJournalsOneRequest](../../models/operations/AccountingJournalsOneRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AccountingJournalsOneResponse](../../models/operations/AccountingJournalsOneResponse.md)**

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

Update Journal

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.journalsUpdate" method="patch" path="/accounting/journals/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingJournalsUpdateRequest;
import com.apideck.unify.models.operations.AccountingJournalsUpdateResponse;
import java.lang.Exception;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingJournalsUpdateRequest req = AccountingJournalsUpdateRequest.builder()
                .id("<id>")
                .journal(JournalInput.builder()
                    .code("90")
                    .name("General journal")
                    .description("General journal")
                    .type(JournalType.GENERAL)
                    .allowVat(true)
                    .currency(Currency.USD)
                    .iban("GB33BUKB20201555555555")
                    .defaultAccount(JsonNullable.of(null))
                    .blocked(false)
                    .build())
                .serviceId("salesforce")
                .companyId("12345")
                .build();

        AccountingJournalsUpdateResponse res = sdk.accounting().journals().update()
                .request(req)
                .call();

        if (res.updateJournalResponse().isPresent()) {
            System.out.println(res.updateJournalResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AccountingJournalsUpdateRequest](../../models/operations/AccountingJournalsUpdateRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AccountingJournalsUpdateResponse](../../models/operations/AccountingJournalsUpdateResponse.md)**

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

Delete Journal

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.journalsDelete" method="delete" path="/accounting/journals/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingJournalsDeleteRequest;
import com.apideck.unify.models.operations.AccountingJournalsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingJournalsDeleteRequest req = AccountingJournalsDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .companyId("12345")
                .build();

        AccountingJournalsDeleteResponse res = sdk.accounting().journals().delete()
                .request(req)
                .call();

        if (res.deleteJournalResponse().isPresent()) {
            System.out.println(res.deleteJournalResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AccountingJournalsDeleteRequest](../../models/operations/AccountingJournalsDeleteRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AccountingJournalsDeleteResponse](../../models/operations/AccountingJournalsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |