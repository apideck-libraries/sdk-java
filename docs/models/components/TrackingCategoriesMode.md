# TrackingCategoriesMode

The mode of tracking categories for the company on transactions

## Example Usage

```java
import com.apideck.unify.models.components.TrackingCategoriesMode;

TrackingCategoriesMode value = TrackingCategoriesMode.TRANSACTION;

// Open enum: use .of() to create instances from custom string values
TrackingCategoriesMode custom = TrackingCategoriesMode.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `TRANSACTION` | transaction   |
| `LINE`        | line          |
| `BOTH`        | both          |
| `DISABLED`    | disabled      |