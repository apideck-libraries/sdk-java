# CreditNoteStatus

Status of credit notes

## Example Usage

```java
import com.apideck.unify.models.components.CreditNoteStatus;

CreditNoteStatus value = CreditNoteStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
CreditNoteStatus custom = CreditNoteStatus.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `DRAFT`          | draft            |
| `AUTHORISED`     | authorised       |
| `POSTED`         | posted           |
| `PARTIALLY_PAID` | partially_paid   |
| `PAID`           | paid             |
| `VOIDED`         | voided           |
| `DELETED`        | deleted          |