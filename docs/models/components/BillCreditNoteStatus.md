# BillCreditNoteStatus

Status of bill credit notes

## Example Usage

```java
import com.apideck.unify.models.components.BillCreditNoteStatus;

BillCreditNoteStatus value = BillCreditNoteStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
BillCreditNoteStatus custom = BillCreditNoteStatus.of("custom_value");
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