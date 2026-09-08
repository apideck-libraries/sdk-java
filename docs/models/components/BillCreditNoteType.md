# BillCreditNoteType

The type of credit note. A bill credit note is always an accounts payable (supplier-side) credit.

## Example Usage

```java
import com.apideck.unify.models.components.BillCreditNoteType;

BillCreditNoteType value = BillCreditNoteType.ACCOUNTS_PAYABLE_CREDIT;

// Open enum: use .of() to create instances from custom string values
BillCreditNoteType custom = BillCreditNoteType.of("custom_value");
```


## Values

| Name                      | Value                     |
| ------------------------- | ------------------------- |
| `ACCOUNTS_PAYABLE_CREDIT` | accounts_payable_credit   |