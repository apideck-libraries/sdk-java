# ConnectorAuthType

Type of authorization used by the connector

## Example Usage

```java
import com.apideck.unify.models.components.ConnectorAuthType;

ConnectorAuthType value = ConnectorAuthType.OAUTH2;

// Open enum: use .of() to create instances from custom string values
ConnectorAuthType custom = ConnectorAuthType.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `OAUTH2`  | oauth2    |
| `API_KEY` | apiKey    |
| `BASIC`   | basic     |
| `CUSTOM`  | custom    |
| `NONE`    | none      |