# FlsaStatus

The FLSA status for this compensation.

## Example Usage

```java
import com.apideck.unify.models.components.FlsaStatus;

FlsaStatus value = FlsaStatus.EXEMPT;

// Open enum: use .of() to create instances from custom string values
FlsaStatus custom = FlsaStatus.of("custom_value");
```


## Values

| Name                 | Value                |
| -------------------- | -------------------- |
| `EXEMPT`             | exempt               |
| `SALARIED_NONEXEMPT` | salaried-nonexempt   |
| `NONEXEMPT`          | nonexempt            |
| `OWNER`              | owner                |
| `OTHER`              | other                |