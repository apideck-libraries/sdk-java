# CreditOrDebit

Whether the amount is a credit or debit.

## Example Usage

```java
import com.apideck.unify.models.components.CreditOrDebit;

CreditOrDebit value = CreditOrDebit.CREDIT;

// Open enum: use .of() to create instances from custom string values
CreditOrDebit custom = CreditOrDebit.of("custom_value");
```


## Values

| Name     | Value    |
| -------- | -------- |
| `CREDIT` | credit   |
| `DEBIT`  | debit    |