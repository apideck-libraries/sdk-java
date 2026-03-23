# TaxType

The tax applicability of this line item. Overrides the root-level tax_type for this line.

## Example Usage

```java
import com.apideck.unify.models.components.TaxType;

TaxType value = TaxType.SALES;

// Open enum: use .of() to create instances from custom string values
TaxType custom = TaxType.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `SALES`    | sales      |
| `PURCHASE` | purchase   |