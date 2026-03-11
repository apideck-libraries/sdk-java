# OauthCredentialsSource

Location of the OAuth client credentials. For most connectors the OAuth client credentials are stored on integration and managed by the application owner. For others they are stored on connection and managed by the consumer in Vault.

## Example Usage

```java
import com.apideck.unify.models.components.OauthCredentialsSource;

OauthCredentialsSource value = OauthCredentialsSource.INTEGRATION;

// Open enum: use .of() to create instances from custom string values
OauthCredentialsSource custom = OauthCredentialsSource.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `INTEGRATION` | integration   |
| `CONNECTION`  | connection    |