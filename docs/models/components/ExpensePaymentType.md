# ExpensePaymentType

The type of payment for the expense.

## Example Usage

```java
import com.apideck.unify.models.components.ExpensePaymentType;

ExpensePaymentType value = ExpensePaymentType.CASH;

// Open enum: use .of() to create instances from custom string values
ExpensePaymentType custom = ExpensePaymentType.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `CASH`        | cash          |
| `CHECK`       | check         |
| `CREDIT_CARD` | credit_card   |
| `OTHER`       | other         |