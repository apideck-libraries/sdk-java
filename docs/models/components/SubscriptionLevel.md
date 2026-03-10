# SubscriptionLevel

Received events are scoped to connection or across integration.

## Example Usage

```java
import com.apideck.unify.models.components.SubscriptionLevel;

SubscriptionLevel value = SubscriptionLevel.CONNECTION;

// Open enum: use .of() to create instances from custom string values
SubscriptionLevel custom = SubscriptionLevel.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `CONNECTION`  | connection    |
| `INTEGRATION` | integration   |