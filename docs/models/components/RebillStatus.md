# RebillStatus

Status of the rebilling process for this line item.

## Example Usage

```java
import com.apideck.unify.models.components.RebillStatus;

RebillStatus value = RebillStatus.PENDING;

// Open enum: use .of() to create instances from custom string values
RebillStatus custom = RebillStatus.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `PENDING` | pending   |
| `BILLED`  | billed    |
| `VOIDED`  | voided    |