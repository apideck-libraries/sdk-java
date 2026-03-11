# AllocationType

Type of entity this payment should be attributed to.

## Example Usage

```java
import com.apideck.unify.models.components.AllocationType;

AllocationType value = AllocationType.INVOICE;

// Open enum: use .of() to create instances from custom string values
AllocationType custom = AllocationType.of("custom_value");
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `INVOICE`       | invoice         |
| `ORDER`         | order           |
| `EXPENSE`       | expense         |
| `CREDIT_MEMO`   | credit_memo     |
| `OVER_PAYMENT`  | over_payment    |
| `PRE_PAYMENT`   | pre_payment     |
| `JOURNAL_ENTRY` | journal_entry   |
| `OTHER`         | other           |
| `BILL`          | bill            |