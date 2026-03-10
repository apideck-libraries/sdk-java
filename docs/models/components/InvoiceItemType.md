# InvoiceItemType

Item type

## Example Usage

```java
import com.apideck.unify.models.components.InvoiceItemType;

InvoiceItemType value = InvoiceItemType.INVENTORY;

// Open enum: use .of() to create instances from custom string values
InvoiceItemType custom = InvoiceItemType.of("custom_value");
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `INVENTORY`     | inventory       |
| `NON_INVENTORY` | non_inventory   |
| `SERVICE`       | service         |
| `DESCRIPTION`   | description     |
| `OTHER`         | other           |