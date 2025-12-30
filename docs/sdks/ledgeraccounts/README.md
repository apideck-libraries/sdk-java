# Accounting.LedgerAccounts

## Overview

### Available Operations

* [list](#list) - List Ledger Accounts
* [create](#create) - Create Ledger Account
* [get](#get) - Get Ledger Account
* [update](#update) - Update Ledger Account
* [delete](#delete) - Delete Ledger Account

## list

List Ledger Accounts

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.ledgerAccountsAll" method="get" path="/accounting/ledger-accounts" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingLedgerAccountsAllRequest;
import com.apideck.unify.models.operations.AccountingLedgerAccountsAllResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingLedgerAccountsAllRequest req = AccountingLedgerAccountsAllRequest.builder()
                .serviceId("salesforce")
                .filter(LedgerAccountsFilter.builder()
                    .updatedSince(OffsetDateTime.parse("2020-09-30T07:43:32.000Z"))
                    .build())
                .sort(LedgerAccountsSort.builder()
                    .by(LedgerAccountsSortBy.UPDATED_AT)
                    .direction(SortDirection.DESC)
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();


        sdk.accounting().ledgerAccounts().list()
                .callAsStream()
                .forEach((AccountingLedgerAccountsAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AccountingLedgerAccountsAllRequest](../../models/operations/AccountingLedgerAccountsAllRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[AccountingLedgerAccountsAllResponse](../../models/operations/AccountingLedgerAccountsAllResponse.md)**

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

Create Ledger Account

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.ledgerAccountsAdd" method="post" path="/accounting/ledger-accounts" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingLedgerAccountsAddRequest;
import com.apideck.unify.models.operations.AccountingLedgerAccountsAddResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingLedgerAccountsAddRequest req = AccountingLedgerAccountsAddRequest.builder()
                .ledgerAccount(LedgerAccountInput.builder()
                    .displayId("1-12345")
                    .code("453")
                    .classification(LedgerAccountClassification.ASSET)
                    .type(LedgerAccountType.BANK)
                    .subType("CHECKING_ACCOUNT")
                    .name("Bank account")
                    .fullyQualifiedName("Asset.Bank.Checking_Account")
                    .description("Main checking account")
                    .openingBalance(75000d)
                    .currentBalance(20000d)
                    .currency(Currency.USD)
                    .taxType("NONE")
                    .taxRate(LinkedTaxRateInput.builder()
                        .id("123456")
                        .rate(10d)
                        .build())
                    .level(1d)
                    .active(true)
                    .status(AccountStatus.ACTIVE)
                    .header(true)
                    .bankAccount(BankAccount.builder()
                        .bankName("Monzo")
                        .accountNumber("123465")
                        .accountName("SPACEX LLC")
                        .accountType(AccountType.CREDIT_CARD)
                        .iban("CH2989144532982975332")
                        .bic("AUDSCHGGXXX")
                        .routingNumber("012345678")
                        .bsbNumber("062-001")
                        .branchIdentifier("001")
                        .bankCode("BNH")
                        .currency(Currency.USD)
                        .build())
                    .parentAccount(ParentAccount.builder()
                        .id("12345")
                        .name("Bank Accounts")
                        .displayId("1-1100")
                        .build())
                    .subAccount(false)
                    .lastReconciliationDate(LocalDate.parse("2020-09-30"))
                    .customFields(List.of(
                        CustomField.of(CustomField1.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(CustomField1Value.of("Uses Salesforce and Marketo"))
                            .build())))
                    .rowVersion("1-12345")
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

        AccountingLedgerAccountsAddResponse res = sdk.accounting().ledgerAccounts().create()
                .request(req)
                .call();

        if (res.createLedgerAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AccountingLedgerAccountsAddRequest](../../models/operations/AccountingLedgerAccountsAddRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[AccountingLedgerAccountsAddResponse](../../models/operations/AccountingLedgerAccountsAddResponse.md)**

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

Get Ledger Account

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.ledgerAccountsOne" method="get" path="/accounting/ledger-accounts/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingLedgerAccountsOneRequest;
import com.apideck.unify.models.operations.AccountingLedgerAccountsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingLedgerAccountsOneRequest req = AccountingLedgerAccountsOneRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        AccountingLedgerAccountsOneResponse res = sdk.accounting().ledgerAccounts().get()
                .request(req)
                .call();

        if (res.getLedgerAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AccountingLedgerAccountsOneRequest](../../models/operations/AccountingLedgerAccountsOneRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[AccountingLedgerAccountsOneResponse](../../models/operations/AccountingLedgerAccountsOneResponse.md)**

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

Update Ledger Account

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.ledgerAccountsUpdate" method="patch" path="/accounting/ledger-accounts/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.*;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingLedgerAccountsUpdateRequest;
import com.apideck.unify.models.operations.AccountingLedgerAccountsUpdateResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingLedgerAccountsUpdateRequest req = AccountingLedgerAccountsUpdateRequest.builder()
                .id("<id>")
                .ledgerAccount(LedgerAccountInput.builder()
                    .displayId("1-12345")
                    .code("453")
                    .classification(LedgerAccountClassification.ASSET)
                    .type(LedgerAccountType.BANK)
                    .subType("CHECKING_ACCOUNT")
                    .name("Bank account")
                    .fullyQualifiedName("Asset.Bank.Checking_Account")
                    .description("Main checking account")
                    .openingBalance(75000d)
                    .currentBalance(20000d)
                    .currency(Currency.USD)
                    .taxType("NONE")
                    .taxRate(LinkedTaxRateInput.builder()
                        .id("123456")
                        .rate(10d)
                        .build())
                    .level(1d)
                    .active(true)
                    .status(AccountStatus.ACTIVE)
                    .header(true)
                    .bankAccount(BankAccount.builder()
                        .bankName("Monzo")
                        .accountNumber("123465")
                        .accountName("SPACEX LLC")
                        .accountType(AccountType.CREDIT_CARD)
                        .iban("CH2989144532982975332")
                        .bic("AUDSCHGGXXX")
                        .routingNumber("012345678")
                        .bsbNumber("062-001")
                        .branchIdentifier("001")
                        .bankCode("BNH")
                        .currency(Currency.USD)
                        .build())
                    .parentAccount(ParentAccount.builder()
                        .id("12345")
                        .name("Bank Accounts")
                        .displayId("1-1100")
                        .build())
                    .subAccount(false)
                    .lastReconciliationDate(LocalDate.parse("2020-09-30"))
                    .customFields(List.of(
                        CustomField.of(CustomField1.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(CustomField1Value.of("Uses Salesforce and Marketo"))
                            .build()),
                        CustomField.of(CustomField1.builder()
                            .id("2389328923893298")
                            .name("employee_level")
                            .description("Employee Level")
                            .value(CustomField1Value.of("Uses Salesforce and Marketo"))
                            .build())))
                    .rowVersion("1-12345")
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
                                    .build()))
                            .build()))
                    .build())
                .serviceId("salesforce")
                .build();

        AccountingLedgerAccountsUpdateResponse res = sdk.accounting().ledgerAccounts().update()
                .request(req)
                .call();

        if (res.updateLedgerAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [AccountingLedgerAccountsUpdateRequest](../../models/operations/AccountingLedgerAccountsUpdateRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[AccountingLedgerAccountsUpdateResponse](../../models/operations/AccountingLedgerAccountsUpdateResponse.md)**

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

Delete Ledger Account

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.ledgerAccountsDelete" method="delete" path="/accounting/ledger-accounts/{id}" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingLedgerAccountsDeleteRequest;
import com.apideck.unify.models.operations.AccountingLedgerAccountsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingLedgerAccountsDeleteRequest req = AccountingLedgerAccountsDeleteRequest.builder()
                .id("<id>")
                .serviceId("salesforce")
                .build();

        AccountingLedgerAccountsDeleteResponse res = sdk.accounting().ledgerAccounts().delete()
                .request(req)
                .call();

        if (res.deleteLedgerAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [AccountingLedgerAccountsDeleteRequest](../../models/operations/AccountingLedgerAccountsDeleteRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[AccountingLedgerAccountsDeleteResponse](../../models/operations/AccountingLedgerAccountsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |