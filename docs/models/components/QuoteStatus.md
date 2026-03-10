# QuoteStatus

Quote status

## Example Usage

```java
import com.apideck.unify.models.components.QuoteStatus;

QuoteStatus value = QuoteStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
QuoteStatus custom = QuoteStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `DRAFT`     | draft       |
| `SENT`      | sent        |
| `ACCEPTED`  | accepted    |
| `REJECTED`  | rejected    |
| `EXPIRED`   | expired     |
| `CONVERTED` | converted   |
| `VOID`      | void        |
| `DELETED`   | deleted     |