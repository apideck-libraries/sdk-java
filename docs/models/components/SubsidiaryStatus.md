# SubsidiaryStatus

Based on the status some functionality is enabled or disabled.

## Example Usage

```java
import com.apideck.unify.models.components.SubsidiaryStatus;

SubsidiaryStatus value = SubsidiaryStatus.ACTIVE;

// Open enum: use .of() to create instances from custom string values
SubsidiaryStatus custom = SubsidiaryStatus.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `ACTIVE`   | active     |
| `INACTIVE` | inactive   |