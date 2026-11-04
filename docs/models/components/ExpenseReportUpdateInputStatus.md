# ExpenseReportUpdateInputStatus

The status of the expense report.

## Example Usage

```java
import com.apideck.unify.models.components.ExpenseReportUpdateInputStatus;

ExpenseReportUpdateInputStatus value = ExpenseReportUpdateInputStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
ExpenseReportUpdateInputStatus custom = ExpenseReportUpdateInputStatus.of("custom_value");
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