# ApiType

Indicates whether the API is a Unified API. If unified_api is false, the API is a Platform API.

## Example Usage

```java
import com.apideck.unify.models.components.ApiType;

ApiType value = ApiType.PLATFORM;

// Open enum: use .of() to create instances from custom string values
ApiType custom = ApiType.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `PLATFORM` | platform   |
| `UNIFIED`  | unified    |