# RefundStatus

Status of refund. Maps to: QBO (limited status), NetSuite CashRefund status, Sage Intacct state (draft/posted/voided), Zoho Books vis_state.

## Example Usage

```java
import com.apideck.unify.models.components.RefundStatus;

RefundStatus value = RefundStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
RefundStatus custom = RefundStatus.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `DRAFT`      | draft        |
| `AUTHORISED` | authorised   |
| `POSTED`     | posted       |
| `PAID`       | paid         |
| `VOIDED`     | voided       |
| `DELETED`    | deleted      |