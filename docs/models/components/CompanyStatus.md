# CompanyStatus

Based on the status some functionality is enabled or disabled.

## Example Usage

```java
import com.apideck.unify.models.components.CompanyStatus;

CompanyStatus value = CompanyStatus.ACTIVE;

// Open enum: use .of() to create instances from custom string values
CompanyStatus custom = CompanyStatus.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `ACTIVE`   | active     |
| `INACTIVE` | inactive   |