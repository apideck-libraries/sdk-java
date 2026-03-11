# EmploymentType

The type of employment relationship the employee has with the organization.

## Example Usage

```java
import com.apideck.unify.models.components.EmploymentType;

EmploymentType value = EmploymentType.CONTRACTOR;

// Open enum: use .of() to create instances from custom string values
EmploymentType custom = EmploymentType.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `CONTRACTOR` | contractor   |
| `EMPLOYEE`   | employee     |
| `FREELANCE`  | freelance    |
| `TEMP`       | temp         |
| `INTERNSHIP` | internship   |
| `OTHER`      | other        |