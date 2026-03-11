# PaymentStatus

Status of payment

## Example Usage

```java
import com.apideck.unify.models.components.PaymentStatus;

PaymentStatus value = PaymentStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
PaymentStatus custom = PaymentStatus.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `DRAFT`      | draft        |
| `AUTHORISED` | authorised   |
| `REJECTED`   | rejected     |
| `PAID`       | paid         |
| `VOIDED`     | voided       |
| `DELETED`    | deleted      |