# PathMatchMode

How the path filter is matched. CONTAINS matches the path anywhere; STARTS_WITH / ENDS_WITH anchor the match; EXACT requires the whole path to match. Only applied when path is set.

## Example Usage

```java
import com.apideck.unify.models.components.PathMatchMode;

PathMatchMode value = PathMatchMode.CONTAINS;

// Open enum: use .of() to create instances from custom string values
PathMatchMode custom = PathMatchMode.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `CONTAINS`    | CONTAINS      |
| `STARTS_WITH` | STARTS_WITH   |
| `ENDS_WITH`   | ENDS_WITH     |
| `EXACT`       | EXACT         |