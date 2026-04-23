# PaymentsFilterPaymentStatus

Filter by payment status

## Example Usage

```java
import com.apideck.unify.models.components.PaymentsFilterPaymentStatus;

PaymentsFilterPaymentStatus value = PaymentsFilterPaymentStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
PaymentsFilterPaymentStatus custom = PaymentsFilterPaymentStatus.of("custom_value");
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