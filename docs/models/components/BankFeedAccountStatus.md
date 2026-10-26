# BankFeedAccountStatus

Whether the data consumer may see this account. `revoked` hides it from the consumer without deleting it; `active` restores it. Unrelated to `feed_status`. Only connectors that list it support it; others ignore the field, so setting it there changes nothing.

## Example Usage

```java
import com.apideck.unify.models.components.BankFeedAccountStatus;

BankFeedAccountStatus value = BankFeedAccountStatus.ACTIVE;

// Open enum: use .of() to create instances from custom string values
BankFeedAccountStatus custom = BankFeedAccountStatus.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `ACTIVE`  | active    |
| `REVOKED` | revoked   |