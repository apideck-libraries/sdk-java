# DepreciationMethod

The depreciation method of the assets, normalised across accounting systems: declining-balance variants (for example 150% or 200%) are all `declining_balance`, and the accounting system's own value is in `downstream_depreciation_method`. Set only when every asset recorded in the account uses the same method.

## Example Usage

```java
import com.apideck.unify.models.components.DepreciationMethod;

DepreciationMethod value = DepreciationMethod.OTHER;

// Open enum: use .of() to create instances from custom string values
DepreciationMethod custom = DepreciationMethod.of("custom_value");
```


## Values

| Name                | Value               |
| ------------------- | ------------------- |
| `OTHER`             | other               |
| `STRAIGHT_LINE`     | straight_line       |
| `DECLINING_BALANCE` | declining_balance   |
| `NONE`              | none                |