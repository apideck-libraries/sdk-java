# BillsFilterStatus

Filter by bill status

## Example Usage

```java
import com.apideck.unify.models.components.BillsFilterStatus;

BillsFilterStatus value = BillsFilterStatus.PAID;

// Open enum: use .of() to create instances from custom string values
BillsFilterStatus custom = BillsFilterStatus.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `PAID`           | paid             |
| `UNPAID`         | unpaid           |
| `PARTIALLY_PAID` | partially_paid   |