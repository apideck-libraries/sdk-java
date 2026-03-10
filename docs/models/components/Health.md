# Health

Operational health status of the connection

## Example Usage

```java
import com.apideck.unify.models.components.Health;

Health value = Health.REVOKED;

// Open enum: use .of() to create instances from custom string values
Health custom = Health.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `REVOKED`          | revoked            |
| `MISSING_SETTINGS` | missing_settings   |
| `NEEDS_CONSENT`    | needs_consent      |
| `NEEDS_AUTH`       | needs_auth         |
| `PENDING_REFRESH`  | pending_refresh    |
| `OK`               | ok                 |