# ConnectionState

[Connection state flow](#section/Connection-state)

## Example Usage

```java
import com.apideck.unify.models.components.ConnectionState;

ConnectionState value = ConnectionState.AVAILABLE;

// Open enum: use .of() to create instances from custom string values
ConnectionState custom = ConnectionState.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `AVAILABLE`  | available    |
| `CALLABLE`   | callable     |
| `ADDED`      | added        |
| `AUTHORIZED` | authorized   |
| `INVALID`    | invalid      |