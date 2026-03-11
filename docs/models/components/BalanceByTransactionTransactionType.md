# BalanceByTransactionTransactionType

Type of the transaction.

## Example Usage

```java
import com.apideck.unify.models.components.BalanceByTransactionTransactionType;

BalanceByTransactionTransactionType value = BalanceByTransactionTransactionType.INVOICE;

// Open enum: use .of() to create instances from custom string values
BalanceByTransactionTransactionType custom = BalanceByTransactionTransactionType.of("custom_value");
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `INVOICE`      | invoice        |
| `CREDIT_NOTE`  | credit_note    |
| `BILL`         | bill           |
| `PAYMENT`      | payment        |
| `BILL_PAYMENT` | bill_payment   |