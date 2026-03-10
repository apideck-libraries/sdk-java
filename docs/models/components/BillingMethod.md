# BillingMethod

Method used for billing this project

## Example Usage

```java
import com.apideck.unify.models.components.BillingMethod;

BillingMethod value = BillingMethod.FIXED_PRICE;

// Open enum: use .of() to create instances from custom string values
BillingMethod custom = BillingMethod.of("custom_value");
```


## Values

| Name                 | Value                |
| -------------------- | -------------------- |
| `FIXED_PRICE`        | fixed_price          |
| `TIME_AND_MATERIALS` | time_and_materials   |
| `MILESTONE_BASED`    | milestone_based      |
| `RETAINER`           | retainer             |
| `NON_BILLABLE`       | non_billable         |