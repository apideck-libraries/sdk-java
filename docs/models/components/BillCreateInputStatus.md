# BillCreateInputStatus

Invoice status

## Example Usage

```java
import com.apideck.unify.models.components.BillCreateInputStatus;

BillCreateInputStatus value = BillCreateInputStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
BillCreateInputStatus custom = BillCreateInputStatus.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `DRAFT`          | draft            |
| `SUBMITTED`      | submitted        |
| `AUTHORISED`     | authorised       |
| `PARTIALLY_PAID` | partially_paid   |
| `PAID`           | paid             |
| `VOID`           | void             |
| `CREDIT`         | credit           |
| `DELETED`        | deleted          |
| `POSTED`         | posted           |