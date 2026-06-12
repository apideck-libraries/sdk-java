# GeneralLedgerTransactionLineItemType

Side of the entry. Redundant with the sign of net_amount but exposed as an explicit flag for filtering convenience.

## Example Usage

```java
import com.apideck.unify.models.components.GeneralLedgerTransactionLineItemType;

GeneralLedgerTransactionLineItemType value = GeneralLedgerTransactionLineItemType.DEBIT;

// Open enum: use .of() to create instances from custom string values
GeneralLedgerTransactionLineItemType custom = GeneralLedgerTransactionLineItemType.of("custom_value");
```


## Values

| Name     | Value    |
| -------- | -------- |
| `DEBIT`  | debit    |
| `CREDIT` | credit   |