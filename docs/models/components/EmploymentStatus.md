# EmploymentStatus

The employment status of the employee, indicating whether they are currently employed, inactive, terminated, or in another status.

## Example Usage

```java
import com.apideck.unify.models.components.EmploymentStatus;

EmploymentStatus value = EmploymentStatus.ACTIVE;

// Open enum: use .of() to create instances from custom string values
EmploymentStatus custom = EmploymentStatus.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `ACTIVE`     | active       |
| `INACTIVE`   | inactive     |
| `TERMINATED` | terminated   |
| `OTHER`      | other        |