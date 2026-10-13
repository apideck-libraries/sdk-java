# LineType

`account`: a ledger account. `unappropriated_result`: the result of earlier fiscal years not yet posted to an equity account, added by the connector. `unmapped`: a balance the accounting system reports without a ledger account.

## Example Usage

```java
import com.apideck.unify.models.components.LineType;

LineType value = LineType.ACCOUNT;

// Open enum: use .of() to create instances from custom string values
LineType custom = LineType.of("custom_value");
```


## Values

| Name                    | Value                   |
| ----------------------- | ----------------------- |
| `ACCOUNT`               | account                 |
| `UNAPPROPRIATED_RESULT` | unappropriated_result   |
| `UNMAPPED`              | unmapped                |