# ActivityType

The type of the activity

## Example Usage

```java
import com.apideck.unify.models.components.ActivityType;

ActivityType value = ActivityType.CALL;

// Open enum: use .of() to create instances from custom string values
ActivityType custom = ActivityType.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `CALL`        | call          |
| `MEETING`     | meeting       |
| `EMAIL`       | email         |
| `NOTE`        | note          |
| `TASK`        | task          |
| `DEADLINE`    | deadline      |
| `SEND_LETTER` | send-letter   |
| `SEND_QUOTE`  | send-quote    |
| `OTHER`       | other         |