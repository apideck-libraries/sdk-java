# BillPaymentType

Type of payment

## Example Usage

```java
import com.apideck.unify.models.components.BillPaymentType;

BillPaymentType value = BillPaymentType.ACCOUNTS_PAYABLE_CREDIT;

// Open enum: use .of() to create instances from custom string values
BillPaymentType custom = BillPaymentType.of("custom_value");
```


## Values

| Name                           | Value                          |
| ------------------------------ | ------------------------------ |
| `ACCOUNTS_PAYABLE_CREDIT`      | accounts_payable_credit        |
| `ACCOUNTS_PAYABLE_OVERPAYMENT` | accounts_payable_overpayment   |
| `ACCOUNTS_PAYABLE_PREPAYMENT`  | accounts_payable_prepayment    |
| `ACCOUNTS_PAYABLE`             | accounts_payable               |