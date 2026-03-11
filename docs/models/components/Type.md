# Type

The type of address.

## Example Usage

```java
import com.apideck.unify.models.components.Type;

Type value = Type.PRIMARY;

// Open enum: use .of() to create instances from custom string values
Type custom = Type.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `PRIMARY`   | primary     |
| `SECONDARY` | secondary   |
| `HOME`      | home        |
| `OFFICE`    | office      |
| `SHIPPING`  | shipping    |
| `BILLING`   | billing     |
| `WORK`      | work        |
| `OTHER`     | other       |