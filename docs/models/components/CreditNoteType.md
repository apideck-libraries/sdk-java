# CreditNoteType

Whether this credit note reduces an amount owed by a customer (accounts receivable) or owed to a supplier (accounts payable). `accounts_payable_credit` support is connector-specific — most connectors only expose the accounts-receivable side. Check the connector's gotchas for known deviations.

## Example Usage

```java
import com.apideck.unify.models.components.CreditNoteType;

CreditNoteType value = CreditNoteType.ACCOUNTS_RECEIVABLE_CREDIT;

// Open enum: use .of() to create instances from custom string values
CreditNoteType custom = CreditNoteType.of("custom_value");
```


## Values

| Name                         | Value                        |
| ---------------------------- | ---------------------------- |
| `ACCOUNTS_RECEIVABLE_CREDIT` | accounts_receivable_credit   |
| `ACCOUNTS_PAYABLE_CREDIT`    | accounts_payable_credit      |