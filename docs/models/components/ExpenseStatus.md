# ExpenseStatus

Expense status

## Example Usage

```java
import com.apideck.unify.models.components.ExpenseStatus;

ExpenseStatus value = ExpenseStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
ExpenseStatus custom = ExpenseStatus.of("custom_value");
```


## Values

| Name     | Value    |
| -------- | -------- |
| `DRAFT`  | draft    |
| `POSTED` | posted   |
| `VOIDED` | voided   |