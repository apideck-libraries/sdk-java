# ConnectorSettingType

## Example Usage

```java
import com.apideck.unify.models.components.ConnectorSettingType;

ConnectorSettingType value = ConnectorSettingType.TEXT;

// Open enum: use .of() to create instances from custom string values
ConnectorSettingType custom = ConnectorSettingType.of("custom_value");
```


## Values

| Name              | Value             |
| ----------------- | ----------------- |
| `TEXT`            | text              |
| `CHECKBOX`        | checkbox          |
| `TEL`             | tel               |
| `EMAIL`           | email             |
| `URL`             | url               |
| `TEXTAREA`        | textarea          |
| `SELECT`          | select            |
| `FILTERED_SELECT` | filtered-select   |
| `MULTI_SELECT`    | multi-select      |
| `DATETIME`        | datetime          |
| `DATE`            | date              |
| `TIME`            | time              |
| `NUMBER`          | number            |
| `PASSWORD`        | password          |