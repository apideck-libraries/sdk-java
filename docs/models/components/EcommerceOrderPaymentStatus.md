# EcommerceOrderPaymentStatus

Current payment status of the order.

## Example Usage

```java
import com.apideck.unify.models.components.EcommerceOrderPaymentStatus;

EcommerceOrderPaymentStatus value = EcommerceOrderPaymentStatus.PENDING;

// Open enum: use .of() to create instances from custom string values
EcommerceOrderPaymentStatus custom = EcommerceOrderPaymentStatus.of("custom_value");
```


## Values

| Name                 | Value                |
| -------------------- | -------------------- |
| `PENDING`            | pending              |
| `AUTHORIZED`         | authorized           |
| `PAID`               | paid                 |
| `PARTIAL`            | partial              |
| `REFUNDED`           | refunded             |
| `VOIDED`             | voided               |
| `UNKNOWN`            | unknown              |
| `PARTIALLY_REFUNDED` | partially_refunded   |