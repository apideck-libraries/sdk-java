# EventSource

Unify event source

## Example Usage

```java
import com.apideck.unify.models.components.EventSource;

EventSource value = EventSource.NATIVE;

// Open enum: use .of() to create instances from custom string values
EventSource custom = EventSource.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `NATIVE`  | native    |
| `VIRTUAL` | virtual   |