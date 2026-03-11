# InvoiceStatus

Invoice status

## Example Usage

```java
import com.apideck.unify.models.components.InvoiceStatus;

InvoiceStatus value = InvoiceStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
InvoiceStatus custom = InvoiceStatus.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `DRAFT`          | draft            |
| `SUBMITTED`      | submitted        |
| `AUTHORISED`     | authorised       |
| `PARTIALLY_PAID` | partially_paid   |
| `PAID`           | paid             |
| `UNPAID`         | unpaid           |
| `VOID`           | void             |
| `CREDIT`         | credit           |
| `DELETED`        | deleted          |
| `POSTED`         | posted           |