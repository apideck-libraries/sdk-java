# Accounting.Companies

## Overview

### Available Operations

* [list](#list) - List companies

## list

List all companies accessible through the current connection. Only connectors that support multi-company access (x-apideck-supports-multi-company) will return a list of companies. Use the returned company ID in the x-apideck-company-id header to scope subsequent requests to a specific company.

### Example Usage

<!-- UsageSnippet language="java" operationID="accounting.companiesAll" method="get" path="/accounting/companies" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.AccountingCompaniesAllRequest;
import com.apideck.unify.models.operations.AccountingCompaniesAllResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        AccountingCompaniesAllRequest req = AccountingCompaniesAllRequest.builder()
                .serviceId("salesforce")
                .companyId("12345")
                .fields("id,updated_at")
                .build();


        sdk.accounting().companies().list()
                .callAsStream()
                .forEach((AccountingCompaniesAllResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [AccountingCompaniesAllRequest](../../models/operations/AccountingCompaniesAllRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[AccountingCompaniesAllResponse](../../models/operations/AccountingCompaniesAllResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |