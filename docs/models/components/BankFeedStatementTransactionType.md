# BankFeedStatementTransactionType

Type of transaction.

## Example Usage

```java
import com.apideck.unify.models.components.BankFeedStatementTransactionType;

BankFeedStatementTransactionType value = BankFeedStatementTransactionType.CREDIT;

// Open enum: use .of() to create instances from custom string values
BankFeedStatementTransactionType custom = BankFeedStatementTransactionType.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `CREDIT`   | credit     |
| `DEBIT`    | debit      |
| `DEPOSIT`  | deposit    |
| `TRANSFER` | transfer   |
| `PAYMENT`  | payment    |
| `OTHER`    | other      |