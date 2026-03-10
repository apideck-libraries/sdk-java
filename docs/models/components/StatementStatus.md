# StatementStatus

The current status of the bank feed statement.

## Example Usage

```java
import com.apideck.unify.models.components.StatementStatus;

StatementStatus value = StatementStatus.PENDING;

// Open enum: use .of() to create instances from custom string values
StatementStatus custom = StatementStatus.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `PENDING`  | pending    |
| `REJECTED` | rejected   |
| `SUCCESS`  | success    |