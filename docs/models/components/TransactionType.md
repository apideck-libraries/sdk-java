# TransactionType

The kind of transaction, indicating whether it is a sales transaction or a purchase transaction.

## Example Usage

```java
import com.apideck.unify.models.components.TransactionType;

TransactionType value = TransactionType.SALE;

// Open enum: use .of() to create instances from custom string values
TransactionType custom = TransactionType.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `SALE`     | sale       |
| `PURCHASE` | purchase   |