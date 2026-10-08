# SalesOrderStatus

Sales order status, in order of precedence: `cancelled`; `closed` (the order is closed or completed, whether or not it was billed); `invoiced` (fully billed but not yet closed); `back_ordered`; `on_hold` (including credit hold); `draft` (including pending approval); `open` (every other active state, including partially shipped and partially invoiced); `other` for states that fit none of these.

## Example Usage

```java
import com.apideck.unify.models.components.SalesOrderStatus;

SalesOrderStatus value = SalesOrderStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
SalesOrderStatus custom = SalesOrderStatus.of("custom_value");
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `DRAFT`        | draft          |
| `OPEN`         | open           |
| `ON_HOLD`      | on_hold        |
| `BACK_ORDERED` | back_ordered   |
| `INVOICED`     | invoiced       |
| `CLOSED`       | closed         |
| `CANCELLED`    | cancelled      |
| `OTHER`        | other          |