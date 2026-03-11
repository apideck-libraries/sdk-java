# TicketPriority

Priority of the ticket

## Example Usage

```java
import com.apideck.unify.models.components.TicketPriority;

TicketPriority value = TicketPriority.LOW;

// Open enum: use .of() to create instances from custom string values
TicketPriority custom = TicketPriority.of("custom_value");
```


## Values

| Name     | Value    |
| -------- | -------- |
| `LOW`    | low      |
| `NORMAL` | normal   |
| `HIGH`   | high     |
| `URGENT` | urgent   |