# Units

The unit of time off requested. Possible values include: `hours`, `days`, or `other`.

## Example Usage

```java
import com.apideck.unify.models.components.Units;

Units value = Units.DAYS;

// Open enum: use .of() to create instances from custom string values
Units custom = Units.of("custom_value");
```


## Values

| Name    | Value   |
| ------- | ------- |
| `DAYS`  | days    |
| `HOURS` | hours   |
| `OTHER` | other   |