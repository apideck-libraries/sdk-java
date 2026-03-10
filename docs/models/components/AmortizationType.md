# AmortizationType

Type of amortization

## Example Usage

```java
import com.apideck.unify.models.components.AmortizationType;

AmortizationType value = AmortizationType.MANUAL;

// Open enum: use .of() to create instances from custom string values
AmortizationType custom = AmortizationType.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `MANUAL`   | manual     |
| `RECEIPT`  | receipt    |
| `SCHEDULE` | schedule   |
| `OTHER`    | other      |