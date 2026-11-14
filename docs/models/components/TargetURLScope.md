# TargetURLScope

Where the vendor stores the webhook target URL. `app` means one URL per vendor developer app, which customers on Apideck's own credentials cannot configure. `tenant` means each customer's vendor account holds its own URL.

## Example Usage

```java
import com.apideck.unify.models.components.TargetURLScope;

TargetURLScope value = TargetURLScope.APP;

// Open enum: use .of() to create instances from custom string values
TargetURLScope custom = TargetURLScope.of("custom_value");
```


## Values

| Name     | Value    |
| -------- | -------- |
| `APP`    | app      |
| `TENANT` | tenant   |