# ConnectionHealth

The operational health status of the connection

## Example Usage

```java
import com.apideck.unify.models.components.ConnectionHealth;

ConnectionHealth value = ConnectionHealth.OK;

// Open enum: use .of() to create instances from custom string values
ConnectionHealth custom = ConnectionHealth.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `OK`               | ok                 |
| `PENDING_REFRESH`  | pending_refresh    |
| `NEEDS_AUTH`       | needs_auth         |
| `NEEDS_CONSENT`    | needs_consent      |
| `REVOKED`          | revoked            |
| `MISSING_SETTINGS` | missing_settings   |