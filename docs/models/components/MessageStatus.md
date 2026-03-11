# MessageStatus

Status of the delivery of the message.

## Example Usage

```java
import com.apideck.unify.models.components.MessageStatus;

MessageStatus value = MessageStatus.ACCEPTED;

// Open enum: use .of() to create instances from custom string values
MessageStatus custom = MessageStatus.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `ACCEPTED`    | accepted      |
| `SCHEDULED`   | scheduled     |
| `CANCELED`    | canceled      |
| `QUEUED`      | queued        |
| `SENDING`     | sending       |
| `SENT`        | sent          |
| `FAILED`      | failed        |
| `DELIVERED`   | delivered     |
| `UNDELIVERED` | undelivered   |
| `RECEIVING`   | receiving     |
| `RECEIVED`    | received      |
| `READ`        | read          |