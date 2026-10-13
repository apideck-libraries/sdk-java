# TrialBalanceFilterAccountingMethod

The accounting method used for the report: cash or accrual.

## Example Usage

```java
import com.apideck.unify.models.components.TrialBalanceFilterAccountingMethod;

TrialBalanceFilterAccountingMethod value = TrialBalanceFilterAccountingMethod.CASH;

// Open enum: use .of() to create instances from custom string values
TrialBalanceFilterAccountingMethod custom = TrialBalanceFilterAccountingMethod.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `CASH`    | cash      |
| `ACCRUAL` | accrual   |