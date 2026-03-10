# InvoiceLineItemType

Item type

## Example Usage

```java
import com.apideck.unify.models.components.InvoiceLineItemType;

InvoiceLineItemType value = InvoiceLineItemType.SALES_ITEM;

// Open enum: use .of() to create instances from custom string values
InvoiceLineItemType custom = InvoiceLineItemType.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `SALES_ITEM` | sales_item   |
| `DISCOUNT`   | discount     |
| `INFO`       | info         |
| `SUB_TOTAL`  | sub_total    |
| `SERVICE`    | service      |
| `OTHER`      | other        |