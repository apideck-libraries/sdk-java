# Proxy

## Overview

### Available Operations

* [get](#get) - GET
* [options](#options) - OPTIONS
* [post](#post) - POST
* [put](#put) - PUT
* [patch](#patch) - PATCH
* [delete](#delete) - DELETE

## get

Proxies a downstream GET request to a service and injects the necessary credentials into a request stored in Vault. This allows you to have an additional security layer and logging without needing to rely on Unify for normalization.
**Note**: Vault will proxy all data to the downstream URL and method/verb in the headers.


### Example Usage

<!-- UsageSnippet language="java" operationID="proxy.getProxy" method="get" path="/proxy" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.Unauthorized;
import com.apideck.unify.models.operations.ProxyGetProxyRequest;
import com.apideck.unify.models.operations.ProxyGetProxyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Unauthorized, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        ProxyGetProxyRequest req = ProxyGetProxyRequest.builder()
                .serviceId("close")
                .downstreamUrl("https://api.close.com/api/v1/lead")
                .unifiedApi("hris")
                .downstreamAuthorization("Bearer <token>")
                .build();

        ProxyGetProxyResponse res = sdk.proxy().get()
                .request(req)
                .call();

        if (res.responseJson().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ProxyGetProxyRequest](../../models/operations/ProxyGetProxyRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ProxyGetProxyResponse](../../models/operations/ProxyGetProxyResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/Unauthorized | 401                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## options

Proxies a downstream OPTION request to a service and injects the necessary credentials into a request stored in Vault. This allows you to have an additional security layer and logging without needing to rely on Unify for normalization.
**Note**: Vault will proxy all data to the downstream URL and method/verb in the headers.


### Example Usage

<!-- UsageSnippet language="java" operationID="proxy.optionsProxy" method="options" path="/proxy" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.Unauthorized;
import com.apideck.unify.models.operations.ProxyOptionsProxyRequest;
import com.apideck.unify.models.operations.ProxyOptionsProxyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Unauthorized, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        ProxyOptionsProxyRequest req = ProxyOptionsProxyRequest.builder()
                .serviceId("close")
                .downstreamUrl("https://api.close.com/api/v1/lead")
                .unifiedApi("hris")
                .downstreamAuthorization("Bearer <token>")
                .build();

        ProxyOptionsProxyResponse res = sdk.proxy().options()
                .request(req)
                .call();

        if (res.responseJson().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ProxyOptionsProxyRequest](../../models/operations/ProxyOptionsProxyRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ProxyOptionsProxyResponse](../../models/operations/ProxyOptionsProxyResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/Unauthorized | 401                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## post

Proxies a downstream POST request to a service and injects the necessary credentials into a request stored in Vault. This allows you to have an additional security layer and logging without needing to rely on Unify for normalization.
**Note**: Vault will proxy all data to the downstream URL and method/verb in the headers.


### Example Usage

<!-- UsageSnippet language="java" operationID="proxy.postProxy" method="post" path="/proxy" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.Unauthorized;
import com.apideck.unify.models.operations.ProxyPostProxyRequest;
import com.apideck.unify.models.operations.ProxyPostProxyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Unauthorized, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        ProxyPostProxyRequest req = ProxyPostProxyRequest.builder()
                .serviceId("close")
                .downstreamUrl("https://api.close.com/api/v1/lead")
                .unifiedApi("hris")
                .downstreamAuthorization("Bearer <token>")
                .build();

        ProxyPostProxyResponse res = sdk.proxy().post()
                .request(req)
                .call();

    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ProxyPostProxyRequest](../../models/operations/ProxyPostProxyRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ProxyPostProxyResponse](../../models/operations/ProxyPostProxyResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/Unauthorized | 401                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## put

Proxies a downstream PUT request to a service and injects the necessary credentials into a request stored in Vault. This allows you to have an additional security layer and logging without needing to rely on Unify for normalization.
**Note**: Vault will proxy all data to the downstream URL and method/verb in the headers.


### Example Usage

<!-- UsageSnippet language="java" operationID="proxy.putProxy" method="put" path="/proxy" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.Unauthorized;
import com.apideck.unify.models.operations.ProxyPutProxyRequest;
import com.apideck.unify.models.operations.ProxyPutProxyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Unauthorized, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        ProxyPutProxyRequest req = ProxyPutProxyRequest.builder()
                .serviceId("close")
                .downstreamUrl("https://api.close.com/api/v1/lead")
                .unifiedApi("hris")
                .downstreamAuthorization("Bearer <token>")
                .build();

        ProxyPutProxyResponse res = sdk.proxy().put()
                .request(req)
                .call();

    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ProxyPutProxyRequest](../../models/operations/ProxyPutProxyRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ProxyPutProxyResponse](../../models/operations/ProxyPutProxyResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/Unauthorized | 401                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## patch

Proxies a downstream PATCH request to a service and injects the necessary credentials into a request stored in Vault. This allows you to have an additional security layer and logging without needing to rely on Unify for normalization.
**Note**: Vault will proxy all data to the downstream URL and method/verb in the headers.


### Example Usage

<!-- UsageSnippet language="java" operationID="proxy.patchProxy" method="patch" path="/proxy" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.Unauthorized;
import com.apideck.unify.models.operations.ProxyPatchProxyRequest;
import com.apideck.unify.models.operations.ProxyPatchProxyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Unauthorized, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        ProxyPatchProxyRequest req = ProxyPatchProxyRequest.builder()
                .serviceId("close")
                .downstreamUrl("https://api.close.com/api/v1/lead")
                .unifiedApi("hris")
                .downstreamAuthorization("Bearer <token>")
                .build();

        ProxyPatchProxyResponse res = sdk.proxy().patch()
                .request(req)
                .call();

    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ProxyPatchProxyRequest](../../models/operations/ProxyPatchProxyRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ProxyPatchProxyResponse](../../models/operations/ProxyPatchProxyResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/Unauthorized | 401                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## delete

Proxies a downstream DELETE request to a service and injects the necessary credentials into a request stored in Vault. This allows you to have an additional security layer and logging without needing to rely on Unify for normalization.
**Note**: Vault will proxy all data to the downstream URL and method/verb in the headers.


### Example Usage

<!-- UsageSnippet language="java" operationID="proxy.deleteProxy" method="delete" path="/proxy" -->
```java
package hello.world;

import com.apideck.unify.Apideck;
import com.apideck.unify.models.errors.Unauthorized;
import com.apideck.unify.models.operations.ProxyDeleteProxyRequest;
import com.apideck.unify.models.operations.ProxyDeleteProxyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Unauthorized, Exception {

        Apideck sdk = Apideck.builder()
                .consumerId("test-consumer")
                .appId("dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX")
                .apiKey(System.getenv().getOrDefault("API_KEY", ""))
            .build();

        ProxyDeleteProxyRequest req = ProxyDeleteProxyRequest.builder()
                .serviceId("close")
                .downstreamUrl("https://api.close.com/api/v1/lead")
                .unifiedApi("hris")
                .downstreamAuthorization("Bearer <token>")
                .build();

        ProxyDeleteProxyResponse res = sdk.proxy().delete()
                .request(req)
                .call();

        if (res.responseJson().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ProxyDeleteProxyRequest](../../models/operations/ProxyDeleteProxyRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ProxyDeleteProxyResponse](../../models/operations/ProxyDeleteProxyResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/Unauthorized | 401                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |