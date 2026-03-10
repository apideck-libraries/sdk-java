# TrackingCategoryStatus

Based on the status some functionality is enabled or disabled.

## Example Usage

```java
import com.apideck.unify.models.components.TrackingCategoryStatus;

TrackingCategoryStatus value = TrackingCategoryStatus.ACTIVE;

// Open enum: use .of() to create instances from custom string values
TrackingCategoryStatus custom = TrackingCategoryStatus.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `ACTIVE`   | active     |
| `INACTIVE` | inactive   |