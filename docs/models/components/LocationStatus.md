# LocationStatus

Based on the status some functionality is enabled or disabled.

## Example Usage

```java
import com.apideck.unify.models.components.LocationStatus;

LocationStatus value = LocationStatus.ACTIVE;

// Open enum: use .of() to create instances from custom string values
LocationStatus custom = LocationStatus.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `ACTIVE`   | active     |
| `INACTIVE` | inactive   |