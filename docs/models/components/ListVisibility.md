# ListVisibility

The visibility of the List. Which of these values a given connector can return depends on its native sharing model — see the connector-specific gotchas below for details.

## Example Usage

```java
import com.apideck.unify.models.components.ListVisibility;

ListVisibility value = ListVisibility.PRIVATE;

// Open enum: use .of() to create instances from custom string values
ListVisibility custom = ListVisibility.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `PRIVATE` | private   |
| `SHARED`  | shared    |
| `PUBLIC`  | public    |