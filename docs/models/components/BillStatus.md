# BillStatus

Invoice status

## Example Usage

```java
import com.apideck.unify.models.components.BillStatus;

BillStatus value = BillStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
BillStatus custom = BillStatus.of("custom_value");
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