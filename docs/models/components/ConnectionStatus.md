# ConnectionStatus

Status of the connection.

## Example Usage

```java
import com.apideck.unify.models.components.ConnectionStatus;

ConnectionStatus value = ConnectionStatus.LIVE;

// Open enum: use .of() to create instances from custom string values
ConnectionStatus custom = ConnectionStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `LIVE`      | live        |
| `UPCOMING`  | upcoming    |
| `REQUESTED` | requested   |