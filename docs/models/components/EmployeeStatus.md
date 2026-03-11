# EmployeeStatus

The status of the employee.

## Example Usage

```java
import com.apideck.unify.models.components.EmployeeStatus;

EmployeeStatus value = EmployeeStatus.ACTIVE;

// Open enum: use .of() to create instances from custom string values
EmployeeStatus custom = EmployeeStatus.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `ACTIVE`     | active       |
| `INACTIVE`   | inactive     |
| `TERMINATED` | terminated   |