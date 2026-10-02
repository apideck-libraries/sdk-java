# CreditNoteCreateInputCreditNoteStatus

Status of credit notes

## Example Usage

```java
import com.apideck.unify.models.components.CreditNoteCreateInputCreditNoteStatus;

CreditNoteCreateInputCreditNoteStatus value = CreditNoteCreateInputCreditNoteStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
CreditNoteCreateInputCreditNoteStatus custom = CreditNoteCreateInputCreditNoteStatus.of("custom_value");
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