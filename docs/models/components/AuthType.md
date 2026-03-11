# AuthType

Type of authorization used by the connector

## Example Usage

```java
import com.apideck.unify.models.components.AuthType;

AuthType value = AuthType.OAUTH2;

// Open enum: use .of() to create instances from custom string values
AuthType custom = AuthType.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `OAUTH2`  | oauth2    |
| `API_KEY` | apiKey    |
| `BASIC`   | basic     |
| `CUSTOM`  | custom    |
| `NONE`    | none      |