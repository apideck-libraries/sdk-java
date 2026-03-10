# TimeOffRequestStatus

The status of the time off request.

## Example Usage

```java
import com.apideck.unify.models.components.TimeOffRequestStatus;

TimeOffRequestStatus value = TimeOffRequestStatus.REQUESTED;

// Open enum: use .of() to create instances from custom string values
TimeOffRequestStatus custom = TimeOffRequestStatus.of("custom_value");
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