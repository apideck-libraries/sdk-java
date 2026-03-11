# LeavingReason

The reason because the employment ended.

## Example Usage

```java
import com.apideck.unify.models.components.LeavingReason;

LeavingReason value = LeavingReason.DISMISSED;

// Open enum: use .of() to create instances from custom string values
LeavingReason custom = LeavingReason.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `DISMISSED`  | dismissed    |
| `RESIGNED`   | resigned     |
| `REDUNDANCY` | redundancy   |
| `RETIRED`    | retired      |
| `OTHER`      | other        |