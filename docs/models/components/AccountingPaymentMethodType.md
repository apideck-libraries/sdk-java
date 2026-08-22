# AccountingPaymentMethodType

The type of payment method.

## Example Usage

```java
import com.apideck.unify.models.components.AccountingPaymentMethodType;

AccountingPaymentMethodType value = AccountingPaymentMethodType.CASH;

// Open enum: use .of() to create instances from custom string values
AccountingPaymentMethodType custom = AccountingPaymentMethodType.of("custom_value");
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `CASH`          | cash            |
| `CHECK`         | check           |
| `CREDIT_CARD`   | credit_card     |
| `DEBIT_CARD`    | debit_card      |
| `BANK_TRANSFER` | bank_transfer   |
| `ELECTRONIC`    | electronic      |
| `OTHER`         | other           |
| `UNKNOWN`       | unknown         |