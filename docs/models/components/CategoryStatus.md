# CategoryStatus

Based on the status some functionality is enabled or disabled.

## Example Usage

```java
import com.apideck.unify.models.components.CategoryStatus;

CategoryStatus value = CategoryStatus.ACTIVE;

// Open enum: use .of() to create instances from custom string values
CategoryStatus custom = CategoryStatus.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `ACTIVE`   | active     |
| `INACTIVE` | inactive   |