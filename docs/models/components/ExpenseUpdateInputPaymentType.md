# ExpenseUpdateInputPaymentType

The type of payment for the expense.

## Example Usage

```java
import com.apideck.unify.models.components.ExpenseUpdateInputPaymentType;

ExpenseUpdateInputPaymentType value = ExpenseUpdateInputPaymentType.CASH;

// Open enum: use .of() to create instances from custom string values
ExpenseUpdateInputPaymentType custom = ExpenseUpdateInputPaymentType.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `CASH`        | cash          |
| `CHECK`       | check         |
| `CREDIT_CARD` | credit_card   |
| `OTHER`       | other         |