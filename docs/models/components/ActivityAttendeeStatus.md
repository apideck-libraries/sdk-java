# ActivityAttendeeStatus

Status of the attendee

## Example Usage

```java
import com.apideck.unify.models.components.ActivityAttendeeStatus;

ActivityAttendeeStatus value = ActivityAttendeeStatus.ACCEPTED;

// Open enum: use .of() to create instances from custom string values
ActivityAttendeeStatus custom = ActivityAttendeeStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `ACCEPTED`  | accepted    |
| `TENTATIVE` | tentative   |
| `DECLINED`  | declined    |