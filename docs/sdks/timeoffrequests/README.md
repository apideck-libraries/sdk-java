# TimeOffRequests
(*hris().timeOffRequests()*)

## Overview

### Available Operations

* [list](#list) - List Time Off Requests
* [create](#create) - Create Time Off Request
* [get](#get) - Get Time Off Request
* [update](#update) - Update Time Off Request
* [delete](#delete) - Delete Time Off Request

## list

List Time Off Requests

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.TimeOffRequestStatus;
import com.apideck.unify.models.components.TimeOffRequestsFilter;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.HrisTimeOffRequestsAllRequest;
import com.apideck.unify.models.operations.HrisTimeOffRequestsAllResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        HrisTimeOffRequestsAllRequest req = HrisTimeOffRequestsAllRequest.builder()
                .serviceId("salesforce")
                .filter(TimeOffRequestsFilter.builder()
                    .startDate("2022-04-08")
                    .endDate("2022-04-21")
                    .updatedSince("2020-09-30T07:43:32.000Z")
                    .employeeId("1234")
                    .timeOffRequestStatus(TimeOffRequestStatus.APPROVED)
                    .companyId("1234")
                    .build())
                .passThrough(Map.ofEntries(
                    Map.entry("search", "San Francisco")))
                .fields("id,updated_at")
                .build();

        HrisTimeOffRequestsAllResponse res = sdk.hris().timeOffRequests().list()
                .request(req)
                .call();

        if (res.getTimeOffRequestsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [HrisTimeOffRequestsAllRequest](../../models/operations/HrisTimeOffRequestsAllRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[HrisTimeOffRequestsAllResponse](../../models/operations/HrisTimeOffRequestsAllResponse.md)**

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

Create Time Off Request

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.Notes;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.RequestType;
import com.apideck.unify.models.components.TimeOffRequestInput;
import com.apideck.unify.models.components.TimeOffRequestStatusStatus;
import com.apideck.unify.models.components.Units;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.HrisTimeOffRequestsAddRequest;
import com.apideck.unify.models.operations.HrisTimeOffRequestsAddResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        HrisTimeOffRequestsAddRequest req = HrisTimeOffRequestsAddRequest.builder()
                .timeOffRequest(TimeOffRequestInput.builder()
                    .employeeId("12345")
                    .policyId("12345")
                    .status(TimeOffRequestStatusStatus.APPROVED)
                    .description("Enjoying some sun.")
                    .startDate("2022-04-01")
                    .endDate("2022-04-01")
                    .requestDate("2022-03-21")
                    .requestType(RequestType.VACATION)
                    .approvalDate("2022-03-21")
                    .units(Units.HOURS)
                    .amount(3.5d)
                    .dayPart("morning")
                    .notes(Notes.builder()
                        .employee("Relaxing on the beach for a few hours.")
                        .manager("Enjoy!")
                        .build())
                    .passThrough(List.of(
                        PassThroughBody.builder()
                            .serviceId("<id>")
                            .extendPaths(List.of(
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(\n    Map.entry("TaxClassificationRef", Map.ofEntries(\n    Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build()))
                            .build()))
                    .policyType("sick")
                    .build())
                .serviceId("salesforce")
                .build();

        HrisTimeOffRequestsAddResponse res = sdk.hris().timeOffRequests().create()
                .request(req)
                .call();

        if (res.createTimeOffRequestResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [HrisTimeOffRequestsAddRequest](../../models/operations/HrisTimeOffRequestsAddRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[HrisTimeOffRequestsAddResponse](../../models/operations/HrisTimeOffRequestsAddResponse.md)**

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

Get Time Off Request

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.HrisTimeOffRequestsOneRequest;
import com.apideck.unify.models.operations.HrisTimeOffRequestsOneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        HrisTimeOffRequestsOneRequest req = HrisTimeOffRequestsOneRequest.builder()
                .id("<id>")
                .employeeId("<id>")
                .serviceId("salesforce")
                .fields("id,updated_at")
                .build();

        HrisTimeOffRequestsOneResponse res = sdk.hris().timeOffRequests().get()
                .request(req)
                .call();

        if (res.getTimeOffRequestResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [HrisTimeOffRequestsOneRequest](../../models/operations/HrisTimeOffRequestsOneRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[HrisTimeOffRequestsOneResponse](../../models/operations/HrisTimeOffRequestsOneResponse.md)**

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

Update Time Off Request

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.components.ExtendPaths;
import com.apideck.unify.models.components.Notes;
import com.apideck.unify.models.components.PassThroughBody;
import com.apideck.unify.models.components.RequestType;
import com.apideck.unify.models.components.TimeOffRequestInput;
import com.apideck.unify.models.components.TimeOffRequestStatusStatus;
import com.apideck.unify.models.components.Units;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.HrisTimeOffRequestsUpdateRequest;
import com.apideck.unify.models.operations.HrisTimeOffRequestsUpdateResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        HrisTimeOffRequestsUpdateRequest req = HrisTimeOffRequestsUpdateRequest.builder()
                .id("<id>")
                .employeeId("<id>")
                .timeOffRequest(TimeOffRequestInput.builder()
                    .employeeId("12345")
                    .policyId("12345")
                    .status(TimeOffRequestStatusStatus.APPROVED)
                    .description("Enjoying some sun.")
                    .startDate("2022-04-01")
                    .endDate("2022-04-01")
                    .requestDate("2022-03-21")
                    .requestType(RequestType.VACATION)
                    .approvalDate("2022-03-21")
                    .units(Units.HOURS)
                    .amount(3.5d)
                    .dayPart("morning")
                    .notes(Notes.builder()
                        .employee("Relaxing on the beach for a few hours.")
                        .manager("Enjoy!")
                        .build())
                    .passThrough(List.of(
                        PassThroughBody.builder()
                            .serviceId("<id>")
                            .extendPaths(List.of(
                                ExtendPaths.builder()
                                    .path("$.nested.property")
                                    .value(Map.ofEntries(\n    Map.entry("TaxClassificationRef", Map.ofEntries(\n    Map.entry("value", "EUC-99990201-V1-00020000")))))
                                    .build()))
                            .build()))
                    .policyType("sick")
                    .build())
                .serviceId("salesforce")
                .build();

        HrisTimeOffRequestsUpdateResponse res = sdk.hris().timeOffRequests().update()
                .request(req)
                .call();

        if (res.updateTimeOffRequestResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [HrisTimeOffRequestsUpdateRequest](../../models/operations/HrisTimeOffRequestsUpdateRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[HrisTimeOffRequestsUpdateResponse](../../models/operations/HrisTimeOffRequestsUpdateResponse.md)**

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

Delete Time Off Request

### Example Usage

```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.HrisTimeOffRequestsDeleteRequest;
import com.apideck.unify.models.operations.HrisTimeOffRequestsDeleteResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestResponse, UnauthorizedResponse, PaymentRequiredResponse, NotFoundResponse, UnprocessableResponse, Exception {

        Apideck sdk = Apideck.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
            .build();

        HrisTimeOffRequestsDeleteRequest req = HrisTimeOffRequestsDeleteRequest.builder()
                .id("<id>")
                .employeeId("<id>")
                .serviceId("salesforce")
                .build();

        HrisTimeOffRequestsDeleteResponse res = sdk.hris().timeOffRequests().delete()
                .request(req)
                .call();

        if (res.deleteTimeOffRequestResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [HrisTimeOffRequestsDeleteRequest](../../models/operations/HrisTimeOffRequestsDeleteRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[HrisTimeOffRequestsDeleteResponse](../../models/operations/HrisTimeOffRequestsDeleteResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/BadRequestResponse      | 400                                   | application/json                      |
| models/errors/UnauthorizedResponse    | 401                                   | application/json                      |
| models/errors/PaymentRequiredResponse | 402                                   | application/json                      |
| models/errors/NotFoundResponse        | 404                                   | application/json                      |
| models/errors/UnprocessableResponse   | 422                                   | application/json                      |
| models/errors/APIException            | 4XX, 5XX                              | \*/\*                                 |