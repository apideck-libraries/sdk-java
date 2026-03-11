# AccountingMethod

The accounting method used for the report: cash or accrual.

## Example Usage

```java
import com.apideck.unify.models.components.AccountingMethod;

AccountingMethod value = AccountingMethod.CASH;

// Open enum: use .of() to create instances from custom string values
AccountingMethod custom = AccountingMethod.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `CASH`    | cash      |
| `ACCRUAL` | accrual   |