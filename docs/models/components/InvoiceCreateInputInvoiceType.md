# InvoiceCreateInputInvoiceType

Invoice type

## Example Usage

```java
import com.apideck.unify.models.components.InvoiceCreateInputInvoiceType;

InvoiceCreateInputInvoiceType value = InvoiceCreateInputInvoiceType.STANDARD;

// Open enum: use .of() to create instances from custom string values
InvoiceCreateInputInvoiceType custom = InvoiceCreateInputInvoiceType.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `STANDARD` | standard   |
| `CREDIT`   | credit     |
| `SERVICE`  | service    |
| `PRODUCT`  | product    |
| `SUPPLIER` | supplier   |
| `OTHER`    | other      |