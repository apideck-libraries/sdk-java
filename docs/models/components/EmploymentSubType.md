# EmploymentSubType

The work schedule of the employee.

## Example Usage

```java
import com.apideck.unify.models.components.EmploymentSubType;

EmploymentSubType value = EmploymentSubType.FULL_TIME;

// Open enum: use .of() to create instances from custom string values
EmploymentSubType custom = EmploymentSubType.of("custom_value");
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `FULL_TIME`     | full_time       |
| `PART_TIME`     | part_time       |
| `HOURLY`        | hourly          |
| `OTHER`         | other           |
| `NOT_SPECIFIED` | not_specified   |