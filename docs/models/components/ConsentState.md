# ConsentState

The current consent state of the connection

## Example Usage

```java
import com.apideck.unify.models.components.ConsentState;

ConsentState value = ConsentState.IMPLICIT;

// Open enum: use .of() to create instances from custom string values
ConsentState custom = ConsentState.of("custom_value");
```


## Values

| Name                 | Value                |
| -------------------- | -------------------- |
| `IMPLICIT`           | implicit             |
| `PENDING`            | pending              |
| `GRANTED`            | granted              |
| `DENIED`             | denied               |
| `REVOKED`            | revoked              |
| `REQUIRES_RECONSENT` | requires_reconsent   |