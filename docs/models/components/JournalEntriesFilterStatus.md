# JournalEntriesFilterStatus

## Example Usage

```java
import com.apideck.unify.models.components.JournalEntriesFilterStatus;

JournalEntriesFilterStatus value = JournalEntriesFilterStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
JournalEntriesFilterStatus custom = JournalEntriesFilterStatus.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `DRAFT`            | draft              |
| `PENDING_APPROVAL` | pending_approval   |
| `APPROVED`         | approved           |
| `POSTED`           | posted             |
| `VOIDED`           | voided             |
| `REJECTED`         | rejected           |
| `DELETED`          | deleted            |
| `OTHER`            | other              |