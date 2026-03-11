# PurchaseOrderStatus

## Example Usage

```java
import com.apideck.unify.models.components.PurchaseOrderStatus;

PurchaseOrderStatus value = PurchaseOrderStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
PurchaseOrderStatus custom = PurchaseOrderStatus.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `DRAFT`   | draft     |
| `OPEN`    | open      |
| `CLOSED`  | closed    |
| `DELETED` | deleted   |
| `BILLED`  | billed    |
| `OTHER`   | other     |