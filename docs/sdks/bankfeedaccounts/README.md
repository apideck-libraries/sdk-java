# BankFeedAccounts
(*accounting().bankFeedAccounts()*)

## Overview

### Available Operations

* [list](#list) - List Bank Feed Accounts
* [create](#create) - Create Bank Feed Account
* [get](#get) - Get Bank Feed Account
* [update](#update) - Update Bank Feed Account
* [delete](#delete) - Delete Bank Feed Account

## list

List Bank Feed Accounts

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.bankFeedAccountsAll" method="get" path="/accounting/bank-feed-accounts" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBankFeedAccountsAllRequest;
import com.apideck.unify.models.operations.AccountingBankFeedAccountsAllResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingBankFeedAccountsAllRequest req = AccountingBankFeedAccountsAllRequest.builder()
                .serviceId("salesforce")
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();

        sdk.accounting().bankFeedAccounts().list()
                .request(req)
                .callAsStream()
                .forEach((AccountingBankFeedAccountsAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [AccountingBankFeedAccountsAllRequest](../../models/operations/AccountingBankFeedAccountsAllRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[AccountingBankFeedAccountsAllResponse](../../models/operations/AccountingBankFeedAccountsAllResponse.md)**

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

Create Bank Feed Account

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.bankFeedAccountsAdd" method="post" path="/accounting/bank-feed-accounts" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBankFeedAccountsAddRequest;
import com.apideck.unify.models.operations.AccountingBankFeedAccountsAddResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingBankFeedAccountsAddRequest req = AccountingBankFeedAccountsAddRequest.builder()
                .bankFeedAccount(BankFeedAccountInput.builder()
                    .bankAccountType(BankAccountType.BANK)
                    .sourceAccountId("src_456")
                    .targetAccountId("tgt_789")
                    .targetAccountName("Main Company Checking")
                    .targetAccountNumber("NL91ABNA0417164300")
                    .currency(Currency.USD)
                    .feedStatus(FeedStatus.PENDING)
                    .country("US")
                    .customFields(List.of(
                        CustomField.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(Value.of("Uses Salesforce and Marketo"))
                            .build(),
                        CustomField.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(Value.of("Uses Salesforce and Marketo"))
                            .build(),
                        CustomField.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(Value.of("Uses Salesforce and Marketo"))
                            .build()))
                    .build())
                .serviceId("salesforce")
                .build();

        AccountingBankFeedAccountsAddResponse res = sdk.accounting().bankFeedAccounts().create()
                .request(req)
                .call();

        if (res.createBankFeedAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [AccountingBankFeedAccountsAddRequest](../../models/operations/AccountingBankFeedAccountsAddRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[AccountingBankFeedAccountsAddResponse](../../models/operations/AccountingBankFeedAccountsAddResponse.md)**

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

Get Bank Feed Account

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.bankFeedAccountsOne" method="get" path="/accounting/bank-feed-accounts/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBankFeedAccountsOneRequest;
import com.apideck.unify.models.operations.AccountingBankFeedAccountsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingBankFeedAccountsOneRequest req = AccountingBankFeedAccountsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        AccountingBankFeedAccountsOneResponse res = sdk.accounting().bankFeedAccounts().get()
                .request(req)
                .call();

        if (res.getBankFeedAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [AccountingBankFeedAccountsOneRequest](../../models/operations/AccountingBankFeedAccountsOneRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[AccountingBankFeedAccountsOneResponse](../../models/operations/AccountingBankFeedAccountsOneResponse.md)**

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

Update Bank Feed Account

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.bankFeedAccountsUpdate" method="patch" path="/accounting/bank-feed-accounts/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBankFeedAccountsUpdateRequest;
import com.apideck.unify.models.operations.AccountingBankFeedAccountsUpdateResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingBankFeedAccountsUpdateRequest req = AccountingBankFeedAccountsUpdateRequest.builder()
                .id("<id>")
                .bankFeedAccount(BankFeedAccountInput.builder()
                    .bankAccountType(BankAccountType.BANK)
                    .sourceAccountId("src_456")
                    .targetAccountId("tgt_789")
                    .targetAccountName("Main Company Checking")
                    .targetAccountNumber("NL91ABNA0417164300")
                    .currency(Currency.USD)
                    .feedStatus(FeedStatus.PENDING)
                    .country("US")
                    .customFields(List.of(
                        CustomField.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(Value.of("Uses Salesforce and Marketo"))
                            .build(),
                        CustomField.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(Value.of("Uses Salesforce and Marketo"))
                            .build()))
                    .build())
                .serviceId("salesforce")
                .build();

        AccountingBankFeedAccountsUpdateResponse res = sdk.accounting().bankFeedAccounts().update()
                .request(req)
                .call();

        if (res.updateBankFeedAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [AccountingBankFeedAccountsUpdateRequest](../../models/operations/AccountingBankFeedAccountsUpdateRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[AccountingBankFeedAccountsUpdateResponse](../../models/operations/AccountingBankFeedAccountsUpdateResponse.md)**

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

Delete Bank Feed Account

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.bankFeedAccountsDelete" method="delete" path="/accounting/bank-feed-accounts/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBankFeedAccountsDeleteRequest;
import com.apideck.unify.models.operations.AccountingBankFeedAccountsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingBankFeedAccountsDeleteRequest req = AccountingBankFeedAccountsDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AccountingBankFeedAccountsDeleteResponse res = sdk.accounting().bankFeedAccounts().delete()
                .request(req)
                .call();

        if (res.deleteBankFeedAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [AccountingBankFeedAccountsDeleteRequest](../../models/operations/AccountingBankFeedAccountsDeleteRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[AccountingBankFeedAccountsDeleteResponse](../../models/operations/AccountingBankFeedAccountsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |