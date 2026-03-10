# ConnectorStatus

Status of the connector. Connectors with status live or beta are callable.

## Example Usage

```java
import com.apideck.unify.models.components.ConnectorStatus;

ConnectorStatus value = ConnectorStatus.LIVE;

// Open enum: use .of() to create instances from custom string values
ConnectorStatus custom = ConnectorStatus.of("custom_value");
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `LIVE`         | live           |
| `BETA`         | beta           |
| `EARLY_ACCESS` | early-access   |
| `DEVELOPMENT`  | development    |
| `CONSIDERING`  | considering    |