# ExpenseReportStatus

The status of the expense report.

## Example Usage

```java
import com.apideck.unify.models.components.ExpenseReportStatus;

ExpenseReportStatus value = ExpenseReportStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
ExpenseReportStatus custom = ExpenseReportStatus.of("custom_value");
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `DRAFT`      | draft        |
| `SUBMITTED`  | submitted    |
| `APPROVED`   | approved     |
| `REIMBURSED` | reimbursed   |
| `REJECTED`   | rejected     |
| `REVERSED`   | reversed     |
| `VOIDED`     | voided       |