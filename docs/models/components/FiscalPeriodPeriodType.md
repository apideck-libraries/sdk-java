# FiscalPeriodPeriodType

Whether this record is a posting period, or a quarter or year that groups posting periods.

## Example Usage

```java
import com.apideck.unify.models.components.FiscalPeriodPeriodType;

FiscalPeriodPeriodType value = FiscalPeriodPeriodType.PERIOD;

// Open enum: use .of() to create instances from custom string values
FiscalPeriodPeriodType custom = FiscalPeriodPeriodType.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `PERIOD`  | period    |
| `QUARTER` | quarter   |
| `YEAR`    | year      |