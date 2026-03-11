# Gender

The gender represents the gender identity of a person.

## Example Usage

```java
import com.apideck.unify.models.components.Gender;

Gender value = Gender.MALE;

// Open enum: use .of() to create instances from custom string values
Gender custom = Gender.of("custom_value");
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `MALE`          | male            |
| `FEMALE`        | female          |
| `UNISEX`        | unisex          |
| `OTHER`         | other           |
| `NOT_SPECIFIED` | not_specified   |