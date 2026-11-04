# BillPaymentUpdateInputAllocationType

Type of entity this payment should be attributed to.

## Example Usage

```java
import com.apideck.unify.models.components.BillPaymentUpdateInputAllocationType;

BillPaymentUpdateInputAllocationType value = BillPaymentUpdateInputAllocationType.BILL;

// Open enum: use .of() to create instances from custom string values
BillPaymentUpdateInputAllocationType custom = BillPaymentUpdateInputAllocationType.of("custom_value");
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `BILL`          | bill            |
| `EXPENSE`       | expense         |
| `CREDIT_MEMO`   | credit_memo     |
| `OVER_PAYMENT`  | over_payment    |
| `PRE_PAYMENT`   | pre_payment     |
| `JOURNAL_ENTRY` | journal_entry   |
| `OTHER`         | other           |