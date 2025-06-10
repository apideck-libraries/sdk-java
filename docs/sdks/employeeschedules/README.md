# EmployeeSchedules
(*hris().employeeSchedules()*)

## Overview

### Available Operations

* [list](#list) - List Employee Schedules

## list

List schedules for employee, a schedule is a work pattern, not the actual worked hours, for an employee.

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.*;
import com.apideck.unify.models.operations.HrisEmployeeSchedulesAllRequest;
import com.apideck.unify.models.operations.HrisEmployeeSchedulesAllResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        HrisEmployeeSchedulesAllRequest req = HrisEmployeeSchedulesAllRequest.builder()
                .employeeId("<id>")
                .serviceId("salesforce")
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();

        HrisEmployeeSchedulesAllResponse res = sdk.hris().employeeSchedules().list()
                .request(req)
                .call();

        if (res.getEmployeeSchedulesResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [HrisEmployeeSchedulesAllRequest](../../models/operations/HrisEmployeeSchedulesAllRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[HrisEmployeeSchedulesAllResponse](../../models/operations/HrisEmployeeSchedulesAllResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |