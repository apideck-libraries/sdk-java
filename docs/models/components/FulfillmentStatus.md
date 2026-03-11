# FulfillmentStatus

Current fulfillment status of the order.

## Example Usage

```java
import com.apideck.unify.models.components.FulfillmentStatus;

FulfillmentStatus value = FulfillmentStatus.PENDING;

// Open enum: use .of() to create instances from custom string values
FulfillmentStatus custom = FulfillmentStatus.of("custom_value");
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `PENDING`   | pending     |
| `SHIPPED`   | shipped     |
| `PARTIAL`   | partial     |
| `DELIVERED` | delivered   |
| `CANCELLED` | cancelled   |
| `RETURNED`  | returned    |
| `UNKNOWN`   | unknown     |