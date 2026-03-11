# LinkedFinancialAccountAccountType

The type of account being referenced. Use `ledger_account` for GL accounts from the chart of accounts, or `bank_account` for bank account entities. When not specified, the connector will use its default behavior.

## Example Usage

```java
import com.apideck.unify.models.components.LinkedFinancialAccountAccountType;

LinkedFinancialAccountAccountType value = LinkedFinancialAccountAccountType.LEDGER_ACCOUNT;

// Open enum: use .of() to create instances from custom string values
LinkedFinancialAccountAccountType custom = LinkedFinancialAccountAccountType.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `LEDGER_ACCOUNT` | ledger_account   |
| `BANK_ACCOUNT`   | bank_account     |