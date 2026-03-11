# EmployeeJobStatus

Indicates the status of the job.

## Example Usage

```java
import com.apideck.unify.models.components.EmployeeJobStatus;

EmployeeJobStatus value = EmployeeJobStatus.ACTIVE;

// Open enum: use .of() to create instances from custom string values
EmployeeJobStatus custom = EmployeeJobStatus.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `ACTIVE`   | active     |
| `INACTIVE` | inactive   |
| `OTHER`    | other      |