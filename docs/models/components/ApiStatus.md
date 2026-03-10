# ApiStatus

Status of the API. APIs with status live or beta are callable.

## Example Usage

```java
import com.apideck.unify.models.components.ApiStatus;

ApiStatus value = ApiStatus.LIVE;

// Open enum: use .of() to create instances from custom string values
ApiStatus custom = ApiStatus.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `LIVE`        | live          |
| `BETA`        | beta          |
| `DEVELOPMENT` | development   |
| `CONSIDERING` | considering   |