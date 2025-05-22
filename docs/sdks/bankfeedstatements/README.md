# BankFeedStatements
(*accounting().bankFeedStatements()*)

## Overview

### Available Operations

* [list](#list) - List Bank Feed Statements
* [create](#create) - Create Bank Feed Statement
* [get](#get) - Get Bank Feed Statement
* [update](#update) - Update Bank Feed Statement
* [delete](#delete) - Delete Bank Feed Statement

## list

List Bank Feed Statements

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsAllRequest;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingBankFeedStatementsAllRequest req = AccountingBankFeedStatementsAllRequest.builder()
                .serviceId("salesforce")
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();

        sdk.accounting().bankFeedStatements().list()
                .request(req)
                .callAsStream()
                .forEach(item -> {
                   // handle item
                });

    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [AccountingBankFeedStatementsAllRequest](../../models/operations/AccountingBankFeedStatementsAllRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[AccountingBankFeedStatementsAllResponse](../../models/operations/AccountingBankFeedStatementsAllResponse.md)**

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

Create Bank Feed Statement

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsAddRequest;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsAddResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingBankFeedStatementsAddRequest req = AccountingBankFeedStatementsAddRequest.builder()
                .bankFeedStatement(BankFeedStatementInput.builder()
                    .bankFeedAccountId("acc_456")
                    .status(StatementStatus.PENDING)
                    .startDate(OffsetDateTime.parse("2021-05-01T12:00:00.000Z"))
                    .endDate(OffsetDateTime.parse("2025-01-31T12:00:00.000Z"))
                    .startBalance(10500.25)
                    .startBalanceCreditOrDebit(CreditOrDebit.DEBIT)
                    .endBalance(9800.5)
                    .endBalanceCreditOrDebit(CreditOrDebit.DEBIT)
                    .transactions(List.of(
                        Transactions.builder()
                            .postedDate(OffsetDateTime.parse("2025-01-15T12:00:00.000Z"))
                            .amount(250)
                            .creditOrDebit(CreditOrDebit.DEBIT)
                            .sourceTransactionId("txn_987")
                            .description("Payment received from ACME Corp")
                            .counterparty("ACME Corp")
                            .reference("INV-2025-01")
                            .transactionType(BankFeedStatementTransactionType.PAYMENT)
                            .build(),
                        Transactions.builder()
                            .postedDate(OffsetDateTime.parse("2025-01-15T12:00:00.000Z"))
                            .amount(250)
                            .creditOrDebit(CreditOrDebit.DEBIT)
                            .sourceTransactionId("txn_987")
                            .description("Payment received from ACME Corp")
                            .counterparty("ACME Corp")
                            .reference("INV-2025-01")
                            .transactionType(BankFeedStatementTransactionType.PAYMENT)
                            .build(),
                        Transactions.builder()
                            .postedDate(OffsetDateTime.parse("2025-01-15T12:00:00.000Z"))
                            .amount(250)
                            .creditOrDebit(CreditOrDebit.DEBIT)
                            .sourceTransactionId("txn_987")
                            .description("Payment received from ACME Corp")
                            .counterparty("ACME Corp")
                            .reference("INV-2025-01")
                            .transactionType(BankFeedStatementTransactionType.PAYMENT)
                            .build()))
                    .build())
                .serviceId("salesforce")
                .build();

        AccountingBankFeedStatementsAddResponse res = sdk.accounting().bankFeedStatements().create()
                .request(req)
                .call();

        if (res.createBankFeedStatementResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [AccountingBankFeedStatementsAddRequest](../../models/operations/AccountingBankFeedStatementsAddRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[AccountingBankFeedStatementsAddResponse](../../models/operations/AccountingBankFeedStatementsAddResponse.md)**

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

Get Bank Feed Statement

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsOneRequest;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingBankFeedStatementsOneRequest req = AccountingBankFeedStatementsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        AccountingBankFeedStatementsOneResponse res = sdk.accounting().bankFeedStatements().get()
                .request(req)
                .call();

        if (res.getBankFeedStatementResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [AccountingBankFeedStatementsOneRequest](../../models/operations/AccountingBankFeedStatementsOneRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[AccountingBankFeedStatementsOneResponse](../../models/operations/AccountingBankFeedStatementsOneResponse.md)**

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

Update Bank Feed Statement

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsUpdateRequest;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsUpdateResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingBankFeedStatementsUpdateRequest req = AccountingBankFeedStatementsUpdateRequest.builder()
                .id("<id>")
                .bankFeedStatement(BankFeedStatementInput.builder()
                    .bankFeedAccountId("acc_456")
                    .status(StatementStatus.PENDING)
                    .startDate(OffsetDateTime.parse("2021-05-01T12:00:00.000Z"))
                    .endDate(OffsetDateTime.parse("2025-01-31T12:00:00.000Z"))
                    .startBalance(10500.25)
                    .startBalanceCreditOrDebit(CreditOrDebit.DEBIT)
                    .endBalance(9800.5)
                    .endBalanceCreditOrDebit(CreditOrDebit.DEBIT)
                    .transactions(List.of(
                        Transactions.builder()
                            .postedDate(OffsetDateTime.parse("2025-01-15T12:00:00.000Z"))
                            .amount(250)
                            .creditOrDebit(CreditOrDebit.DEBIT)
                            .sourceTransactionId("txn_987")
                            .description("Payment received from ACME Corp")
                            .counterparty("ACME Corp")
                            .reference("INV-2025-01")
                            .transactionType(BankFeedStatementTransactionType.PAYMENT)
                            .build(),
                        Transactions.builder()
                            .postedDate(OffsetDateTime.parse("2025-01-15T12:00:00.000Z"))
                            .amount(250)
                            .creditOrDebit(CreditOrDebit.DEBIT)
                            .sourceTransactionId("txn_987")
                            .description("Payment received from ACME Corp")
                            .counterparty("ACME Corp")
                            .reference("INV-2025-01")
                            .transactionType(BankFeedStatementTransactionType.PAYMENT)
                            .build()))
                    .build())
                .serviceId("salesforce")
                .build();

        AccountingBankFeedStatementsUpdateResponse res = sdk.accounting().bankFeedStatements().update()
                .request(req)
                .call();

        if (res.updateBankFeedStatementResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [AccountingBankFeedStatementsUpdateRequest](../../models/operations/AccountingBankFeedStatementsUpdateRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |

### Response

**[AccountingBankFeedStatementsUpdateResponse](../../models/operations/AccountingBankFeedStatementsUpdateResponse.md)**

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

Delete Bank Feed Statement

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsDeleteRequest;
import com.apideck.unify.models.operations.AccountingBankFeedStatementsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        AccountingBankFeedStatementsDeleteRequest req = AccountingBankFeedStatementsDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AccountingBankFeedStatementsDeleteResponse res = sdk.accounting().bankFeedStatements().delete()
                .request(req)
                .call();

        if (res.deleteBankFeedStatementResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [AccountingBankFeedStatementsDeleteRequest](../../models/operations/AccountingBankFeedStatementsDeleteRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |

### Response

**[AccountingBankFeedStatementsDeleteResponse](../../models/operations/AccountingBankFeedStatementsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |