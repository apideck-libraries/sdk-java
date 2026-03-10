# InvoiceItemFilterInvoiceItemType

The type of invoice item, indicating whether it is an inventory item, a service, or another type.

## Example Usage

```java
import com.apideck.unify.models.components.InvoiceItemFilterInvoiceItemType;

InvoiceItemFilterInvoiceItemType value = InvoiceItemFilterInvoiceItemType.INVENTORY;

// Open enum: use .of() to create instances from custom string values
InvoiceItemFilterInvoiceItemType custom = InvoiceItemFilterInvoiceItemType.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `INVENTORY` | inventory   |
| `SERVICE`   | service     |
| `OTHER`     | other       |