# PeriodType

The type of period to include in the resource: month, quarter, year.

## Example Usage

```java
import com.apideck.unify.models.components.PeriodType;

PeriodType value = PeriodType.MONTH;

// Open enum: use .of() to create instances from custom string values
PeriodType custom = PeriodType.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `MONTH`   | month     |
| `QUARTER` | quarter   |
| `YEAR`    | year      |