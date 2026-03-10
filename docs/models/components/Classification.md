# Classification

The classification of account.

## Example Usage

```java
import com.apideck.unify.models.components.Classification;

Classification value = Classification.ASSET;

// Open enum: use .of() to create instances from custom string values
Classification custom = Classification.of("custom_value");
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