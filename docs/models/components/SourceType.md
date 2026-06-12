# SourceType

Filter by the originating transaction type.

## Example Usage

```java
import com.apideck.unify.models.components.SourceType;

SourceType value = SourceType.OTHER;

// Open enum: use .of() to create instances from custom string values
SourceType custom = SourceType.of("custom_value");
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `OTHER`         | other           |
| `INVOICE`       | invoice         |
| `BILL`          | bill            |
| `CREDIT_NOTE`   | credit_note     |
| `PAYMENT`       | payment         |
| `REFUND`        | refund          |
| `EXPENSE`       | expense         |
| `JOURNAL_ENTRY` | journal_entry   |
| `PAYROLL`       | payroll         |