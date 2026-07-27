# Difficulty

At-a-glance implementation difficulty rating.

## Example Usage

```java
import com.apideck.unify.models.components.Difficulty;

Difficulty value = Difficulty.STRAIGHTFORWARD;

// Open enum: use .of() to create instances from custom string values
Difficulty custom = Difficulty.of("custom_value");
```


## Values

| Name              | Value             |
| ----------------- | ----------------- |
| `STRAIGHTFORWARD` | straightforward   |
| `MODERATE`        | moderate          |
| `INVOLVED`        | involved          |
| `HIGHLY_COMPLEX`  | highly_complex    |