# FeedStatus

Current status of the bank feed.

## Example Usage

```java
import com.apideck.unify.models.components.FeedStatus;

FeedStatus value = FeedStatus.PENDING;

// Open enum: use .of() to create instances from custom string values
FeedStatus custom = FeedStatus.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `PENDING`  | pending    |
| `REJECTED` | rejected   |