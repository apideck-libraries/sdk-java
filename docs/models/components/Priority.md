# Priority

Priority level of the project

## Example Usage

```java
import com.apideck.unify.models.components.Priority;

Priority value = Priority.LOW;

// Open enum: use .of() to create instances from custom string values
Priority custom = Priority.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `LOW`      | low        |
| `MEDIUM`   | medium     |
| `HIGH`     | high       |
| `CRITICAL` | critical   |