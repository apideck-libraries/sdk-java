# TimeOffRequestStatusStatus

The status of the time off request.

## Example Usage

```java
import com.apideck.unify.models.components.TimeOffRequestStatusStatus;

TimeOffRequestStatusStatus value = TimeOffRequestStatusStatus.REQUESTED;

// Open enum: use .of() to create instances from custom string values
TimeOffRequestStatusStatus custom = TimeOffRequestStatusStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `REQUESTED` | requested   |
| `APPROVED`  | approved    |
| `DECLINED`  | declined    |
| `CANCELLED` | cancelled   |
| `DELETED`   | deleted     |
| `OTHER`     | other       |