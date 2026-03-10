# ConnectorOauthGrantType

OAuth grant type used by the connector. More info: https://oauth.net/2/grant-types

## Example Usage

```java
import com.apideck.unify.models.components.ConnectorOauthGrantType;

ConnectorOauthGrantType value = ConnectorOauthGrantType.AUTHORIZATION_CODE;

// Open enum: use .of() to create instances from custom string values
ConnectorOauthGrantType custom = ConnectorOauthGrantType.of("custom_value");
```


## Values

| Name                 | Value                |
| -------------------- | -------------------- |
| `AUTHORIZATION_CODE` | authorization_code   |
| `CLIENT_CREDENTIALS` | client_credentials   |
| `PASSWORD`           | password             |