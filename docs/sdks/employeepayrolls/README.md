# EmployeePayrolls
(*hris().employeePayrolls()*)

## Overview

### Available Operations

* [list](#list) - List Employee Payrolls
* [get](#get) - Get Employee Payroll

## list

List payrolls for employee

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.PayrollsFilter;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.HrisEmployeePayrollsAllRequest;
import com.apideck.unify.models.operations.HrisEmployeePayrollsAllResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        HrisEmployeePayrollsAllRequest req = HrisEmployeePayrollsAllRequest.builder()
                .employeeId("<id>")
                .serviceId("salesforce")
                .filter(PayrollsFilter.builder()
                    .startDate("2022-04-08")
                    .endDate("2022-04-21")
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();

        HrisEmployeePayrollsAllResponse res = sdk.hris().employeePayrolls().list()
                .request(req)
                .call();

        if (res.getEmployeePayrollsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [HrisEmployeePayrollsAllRequest](../../models/operations/HrisEmployeePayrollsAllRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[HrisEmployeePayrollsAllResponse](../../models/operations/HrisEmployeePayrollsAllResponse.md)**

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

Get payroll for employee

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.HrisEmployeePayrollsOneRequest;
import com.apideck.unify.models.operations.HrisEmployeePayrollsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        HrisEmployeePayrollsOneRequest req = HrisEmployeePayrollsOneRequest.builder()
                .payrollId("<id>")
                .employeeId("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        HrisEmployeePayrollsOneResponse res = sdk.hris().employeePayrolls().get()
                .request(req)
                .call();

        if (res.getEmployeePayrollResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [HrisEmployeePayrollsOneRequest](../../models/operations/HrisEmployeePayrollsOneRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[HrisEmployeePayrollsOneResponse](../../models/operations/HrisEmployeePayrollsOneResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |