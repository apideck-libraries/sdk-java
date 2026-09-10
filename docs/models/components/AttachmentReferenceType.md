# AttachmentReferenceType

## Example Usage

```java
import com.apideck.unify.models.components.AttachmentReferenceType;

AttachmentReferenceType value = AttachmentReferenceType.INVOICE;

// Open enum: use .of() to create instances from custom string values
AttachmentReferenceType custom = AttachmentReferenceType.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `INVOICE`          | invoice            |
| `BILL`             | bill               |
| `BILL_CREDIT_NOTE` | bill-credit-note   |
| `CREDIT_NOTE`      | credit-note        |
| `EXPENSE`          | expense            |
| `EXPENSE_REPORT`   | expense-report     |
| `QUOTE`            | quote              |
| `JOURNAL_ENTRY`    | journal-entry      |