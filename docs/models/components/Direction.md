# Direction

The direction of the message.

## Example Usage

```java
import com.apideck.unify.models.components.Direction;

Direction value = Direction.INBOUND;

// Open enum: use .of() to create instances from custom string values
Direction custom = Direction.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `INBOUND`        | inbound          |
| `OUTBOUND_API`   | outbound-api     |
| `OUTBOUND_CALL`  | outbound-call    |
| `OUTBOUND_REPLY` | outbound-reply   |
| `UNKNOWN`        | unknown          |