# PaymentFrequency

Frequency of employee compensation.

## Example Usage

```java
import com.apideck.unify.models.components.PaymentFrequency;

PaymentFrequency value = PaymentFrequency.WEEKLY;

// Open enum: use .of() to create instances from custom string values
PaymentFrequency custom = PaymentFrequency.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `WEEKLY`   | weekly     |
| `BIWEEKLY` | biweekly   |
| `MONTHLY`  | monthly    |
| `PRO_RATA` | pro-rata   |
| `OTHER`    | other      |