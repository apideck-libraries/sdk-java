# ManagedVia

How the subscription is managed in the downstream.

## Example Usage

```java
import com.apideck.unify.models.components.ManagedVia;

ManagedVia value = ManagedVia.MANUAL;

// Open enum: use .of() to create instances from custom string values
ManagedVia custom = ManagedVia.of("custom_value");
```


## Values

| Name     | Value    |
| -------- | -------- |
| `MANUAL` | manual   |
| `API`    | api      |