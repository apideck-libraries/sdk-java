# IntegrationState

The current state of the Integration.

## Example Usage

```java
import com.apideck.unify.models.components.IntegrationState;

IntegrationState value = IntegrationState.DISABLED;

// Open enum: use .of() to create instances from custom string values
IntegrationState custom = IntegrationState.of("custom_value");
```


## Values

| Name                  | Value                 |
| --------------------- | --------------------- |
| `DISABLED`            | disabled              |
| `NEEDS_CONFIGURATION` | needs_configuration   |
| `CONFIGURED`          | configured            |