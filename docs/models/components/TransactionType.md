# TransactionType

Type of the transaction.

## Example Usage

```java
import com.apideck.unify.models.components.TransactionType;

TransactionType value = TransactionType.INVOICE;

// Open enum: use .of() to create instances from custom string values
TransactionType custom = TransactionType.of("custom_value");
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `INVOICE`      | invoice        |
| `CREDIT_NOTE`  | credit_note    |
| `BILL`         | bill           |
| `PAYMENT`      | payment        |
| `BILL_PAYMENT` | bill_payment   |