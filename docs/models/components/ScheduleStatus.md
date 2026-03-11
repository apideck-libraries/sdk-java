# ScheduleStatus

Current status of project schedule compared to plan

## Example Usage

```java
import com.apideck.unify.models.components.ScheduleStatus;

ScheduleStatus value = ScheduleStatus.AHEAD_OF_SCHEDULE;

// Open enum: use .of() to create instances from custom string values
ScheduleStatus custom = ScheduleStatus.of("custom_value");
```


## Values

| Name                | Value               |
| ------------------- | ------------------- |
| `AHEAD_OF_SCHEDULE` | ahead_of_schedule   |
| `ON_SCHEDULE`       | on_schedule         |
| `BEHIND_SCHEDULE`   | behind_schedule     |
| `CRITICAL_DELAY`    | critical_delay      |