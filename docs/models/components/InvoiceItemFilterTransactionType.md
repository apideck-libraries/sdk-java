# InvoiceItemFilterTransactionType

The kind of transaction, indicating whether it is a sales transaction or a purchase transaction.

## Example Usage

```java
import com.apideck.unify.models.components.InvoiceItemFilterTransactionType;

InvoiceItemFilterTransactionType value = InvoiceItemFilterTransactionType.SALE;

// Open enum: use .of() to create instances from custom string values
InvoiceItemFilterTransactionType custom = InvoiceItemFilterTransactionType.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `SALE`     | sale       |
| `PURCHASE` | purchase   |