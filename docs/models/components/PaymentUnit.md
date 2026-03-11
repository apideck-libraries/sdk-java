# PaymentUnit

Unit of measurement for employee compensation.

## Example Usage

```java
import com.apideck.unify.models.components.PaymentUnit;

PaymentUnit value = PaymentUnit.HOUR;

// Open enum: use .of() to create instances from custom string values
PaymentUnit custom = PaymentUnit.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `HOUR`     | hour       |
| `WEEK`     | week       |
| `MONTH`    | month      |
| `YEAR`     | year       |
| `PAYCHECK` | paycheck   |
| `OTHER`    | other      |