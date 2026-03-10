# JournalEntryLineItemType

Debit entries are considered positive, and credit entries are considered negative.

## Example Usage

```java
import com.apideck.unify.models.components.JournalEntryLineItemType;

JournalEntryLineItemType value = JournalEntryLineItemType.DEBIT;

// Open enum: use .of() to create instances from custom string values
JournalEntryLineItemType custom = JournalEntryLineItemType.of("custom_value");
```


## Values

| Name     | Value    |
| -------- | -------- |
| `DEBIT`  | debit    |
| `CREDIT` | credit   |