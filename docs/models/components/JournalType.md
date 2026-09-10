# JournalType

Normalized journal classification.

## Example Usage

```java
import com.apideck.unify.models.components.JournalType;

JournalType value = JournalType.GENERAL;

// Open enum: use .of() to create instances from custom string values
JournalType custom = JournalType.of("custom_value");
```


## Values

| Name                   | Value                  |
| ---------------------- | ---------------------- |
| `GENERAL`              | general                |
| `SALES`                | sales                  |
| `PURCHASE`             | purchase               |
| `SALES_CREDIT_NOTE`    | sales_credit_note      |
| `PURCHASE_CREDIT_NOTE` | purchase_credit_note   |
| `CASH`                 | cash                   |
| `BANK`                 | bank                   |
| `PAYMENT_SERVICE`      | payment_service        |
| `OTHER`                | other                  |