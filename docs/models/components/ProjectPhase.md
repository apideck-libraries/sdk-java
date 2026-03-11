# ProjectPhase

Current phase of the project lifecycle

## Example Usage

```java
import com.apideck.unify.models.components.ProjectPhase;

ProjectPhase value = ProjectPhase.INITIATION;

// Open enum: use .of() to create instances from custom string values
ProjectPhase custom = ProjectPhase.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `INITIATION` | initiation   |
| `PLANNING`   | planning     |
| `EXECUTION`  | execution    |
| `MONITORING` | monitoring   |
| `CLOSURE`    | closure      |
| `OTHER`      | other        |