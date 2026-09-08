# TaxStatus

The tax applicability of the product: `taxable` (the product is taxed), `shipping` (only the shipping is taxed, the product itself is exempt) or `none` (neither is taxed).

## Example Usage

```java
import com.apideck.unify.models.components.TaxStatus;

TaxStatus value = TaxStatus.TAXABLE;

// Open enum: use .of() to create instances from custom string values
TaxStatus custom = TaxStatus.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `TAXABLE`  | taxable    |
| `SHIPPING` | shipping   |
| `NONE`     | none       |