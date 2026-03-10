# LedgerAccountClassification

The classification of account.

## Example Usage

```java
import com.apideck.unify.models.components.LedgerAccountClassification;

LedgerAccountClassification value = LedgerAccountClassification.ASSET;

// Open enum: use .of() to create instances from custom string values
LedgerAccountClassification custom = LedgerAccountClassification.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `ASSET`          | asset            |
| `EQUITY`         | equity           |
| `EXPENSE`        | expense          |
| `LIABILITY`      | liability        |
| `REVENUE`        | revenue          |
| `INCOME`         | income           |
| `OTHER_INCOME`   | other_income     |
| `OTHER_EXPENSE`  | other_expense    |
| `COSTS_OF_SALES` | costs_of_sales   |
| `OTHER`          | other            |