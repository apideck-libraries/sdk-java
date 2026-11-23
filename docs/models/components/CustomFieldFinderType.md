# CustomFieldFinderType

The declared data type of the custom field. Only returned by connectors that can read the field's definition; omitted otherwise.

## Example Usage

```java
import com.apideck.unify.models.components.CustomFieldFinderType;

CustomFieldFinderType value = CustomFieldFinderType.TEXT;

// Open enum: use .of() to create instances from custom string values
CustomFieldFinderType custom = CustomFieldFinderType.of("custom_value");
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