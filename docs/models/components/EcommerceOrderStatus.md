# EcommerceOrderStatus

Current status of the order.

## Example Usage

```java
import com.apideck.unify.models.components.EcommerceOrderStatus;

EcommerceOrderStatus value = EcommerceOrderStatus.ACTIVE;

// Open enum: use .of() to create instances from custom string values
EcommerceOrderStatus custom = EcommerceOrderStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `ACTIVE`    | active      |
| `COMPLETED` | completed   |
| `CANCELLED` | cancelled   |
| `ARCHIVED`  | archived    |
| `UNKNOWN`   | unknown     |
| `OTHER`     | other       |