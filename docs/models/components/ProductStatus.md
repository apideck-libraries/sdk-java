# ProductStatus

The current status of the product (active or archived).

## Example Usage

```java
import com.apideck.unify.models.components.ProductStatus;

ProductStatus value = ProductStatus.ACTIVE;

// Open enum: use .of() to create instances from custom string values
ProductStatus custom = ProductStatus.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `ACTIVE`   | active     |
| `ARCHIVED` | archived   |