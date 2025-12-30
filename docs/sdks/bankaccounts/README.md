# Accounting.BankAccounts

## Overview

### Available Operations

* [list](#list) - List Bank Accounts
* [create](#create) - Create Bank Account
* [get](#get) - Get Bank Account
* [update](#update) - Update Bank Account
* [delete](#delete) - Delete Bank Account

## list

List Bank Accounts

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.bankAccountsAll" method="get" path="/accounting/bank-accounts" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBankAccountsAllRequest;
import com.apideck.unify.models.operations.AccountingBankAccountsAllResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingBankAccountsAllRequest req = AccountingBankAccountsAllRequest.builder()
                .serviceId("salesforce")
                .filter(BankAccountsFilter.builder()
                    .name("Main Operating")
                    .accountType(BankAccountsFilterAccountType.CHECKING)
                    .status(BankAccountsFilterStatus.ACTIVE)
                    .build())
                .sort(BankAccountsSort.builder()
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();


        sdk.accounting().bankAccounts().list()
                .callAsStream()
                .forEach((AccountingBankAccountsAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AccountingBankAccountsAllRequest](../../models/operations/AccountingBankAccountsAllRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AccountingBankAccountsAllResponse](../../models/operations/AccountingBankAccountsAllResponse.md)**

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

Create Bank Account

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.bankAccountsAdd" method="post" path="/accounting/bank-accounts" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBankAccountsAddRequest;
import com.apideck.unify.models.operations.AccountingBankAccountsAddResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingBankAccountsAddRequest req = AccountingBankAccountsAddRequest.builder()
                .accountingBankAccount(AccountingBankAccountInput.builder()
                    .displayId("BA-001")
                    .name("Main Operating Account")
                    .accountNumber("123465")
                    .accountType(AccountingBankAccountAccountType.CHECKING)
                    .ledgerAccount(LinkedLedgerAccount.builder()
                        .id("123456")
                        .name("Bank account")
                        .nominalCode("N091")
                        .code("453")
                        .parentId("123456")
                        .displayId("123456")
                        .build())
                    .bankName("Chase Bank")
                    .currency(Currency.USD)
                    .balance(25000d)
                    .availableBalance(24500d)
                    .overdraftLimit(5000d)
                    .routingNumber("021000021")
                    .iban("GB33BUKB20201555555555")
                    .bic("CHASUS33")
                    .bsbNumber("062-001")
                    .branchIdentifier("001")
                    .bankCode("BNH")
                    .country("US")
                    .status(AccountingBankAccountStatus.ACTIVE)
                    .description("Primary operating account for daily transactions")
                    .customFields(List.of(
                        CustomField.of(CustomField1.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(CustomField1Value.of("Uses Salesforce and Marketo"))
                            .build())))
                    .build())
                .serviceId("salesforce")
                .build();

        AccountingBankAccountsAddResponse res = sdk.accounting().bankAccounts().create()
                .request(req)
                .call();

        if (res.createBankAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AccountingBankAccountsAddRequest](../../models/operations/AccountingBankAccountsAddRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AccountingBankAccountsAddResponse](../../models/operations/AccountingBankAccountsAddResponse.md)**

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

Get Bank Account

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.bankAccountsOne" method="get" path="/accounting/bank-accounts/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.BankAccountFilter;
import com.apideck.unify.models.components.BankAccountFilterAccountType;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBankAccountsOneRequest;
import com.apideck.unify.models.operations.AccountingBankAccountsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingBankAccountsOneRequest req = AccountingBankAccountsOneRequest.builder()
                .id("<id>")
                .filter(BankAccountFilter.builder()
                    .accountType(BankAccountFilterAccountType.CHECKING)
                    .build())
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        AccountingBankAccountsOneResponse res = sdk.accounting().bankAccounts().get()
                .request(req)
                .call();

        if (res.getBankAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AccountingBankAccountsOneRequest](../../models/operations/AccountingBankAccountsOneRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AccountingBankAccountsOneResponse](../../models/operations/AccountingBankAccountsOneResponse.md)**

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

Update Bank Account

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.bankAccountsUpdate" method="patch" path="/accounting/bank-accounts/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBankAccountsUpdateRequest;
import com.apideck.unify.models.operations.AccountingBankAccountsUpdateResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingBankAccountsUpdateRequest req = AccountingBankAccountsUpdateRequest.builder()
                .id("<id>")
                .accountingBankAccount(AccountingBankAccountInput.builder()
                    .displayId("BA-001")
                    .name("Main Operating Account")
                    .accountNumber("123465")
                    .accountType(AccountingBankAccountAccountType.CHECKING)
                    .ledgerAccount(LinkedLedgerAccount.builder()
                        .id("123456")
                        .name("Bank account")
                        .nominalCode("N091")
                        .code("453")
                        .parentId("123456")
                        .displayId("123456")
                        .build())
                    .bankName("Chase Bank")
                    .currency(Currency.USD)
                    .balance(25000d)
                    .availableBalance(24500d)
                    .overdraftLimit(5000d)
                    .routingNumber("021000021")
                    .iban("GB33BUKB20201555555555")
                    .bic("CHASUS33")
                    .bsbNumber("062-001")
                    .branchIdentifier("001")
                    .bankCode("BNH")
                    .country("US")
                    .status(AccountingBankAccountStatus.ACTIVE)
                    .description("Primary operating account for daily transactions")
                    .customFields(List.of(
                        CustomField.of(CustomField1.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(CustomField1Value.of("Uses Salesforce and Marketo"))
                            .build())))
                    .build())
                .serviceId("salesforce")
                .build();

        AccountingBankAccountsUpdateResponse res = sdk.accounting().bankAccounts().update()
                .request(req)
                .call();

        if (res.updateBankAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [AccountingBankAccountsUpdateRequest](../../models/operations/AccountingBankAccountsUpdateRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[AccountingBankAccountsUpdateResponse](../../models/operations/AccountingBankAccountsUpdateResponse.md)**

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

Delete Bank Account

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.bankAccountsDelete" method="delete" path="/accounting/bank-accounts/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingBankAccountsDeleteRequest;
import com.apideck.unify.models.operations.AccountingBankAccountsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingBankAccountsDeleteRequest req = AccountingBankAccountsDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AccountingBankAccountsDeleteResponse res = sdk.accounting().bankAccounts().delete()
                .request(req)
                .call();

        if (res.deleteBankAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [AccountingBankAccountsDeleteRequest](../../models/operations/AccountingBankAccountsDeleteRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[AccountingBankAccountsDeleteResponse](../../models/operations/AccountingBankAccountsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |