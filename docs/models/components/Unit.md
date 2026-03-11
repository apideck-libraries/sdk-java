# Unit

The window unit for the rate.

## Example Usage

```java
import com.apideck.unify.models.components.Unit;

Unit value = Unit.SECOND;

// Open enum: use .of() to create instances from custom string values
Unit custom = Unit.of("custom_value");
```


## Values

| Name     | Value    |
| -------- | -------- |
| `SECOND` | second   |
| `MINUTE` | minute   |
| `HOUR`   | hour     |
| `DAY`    | day      |