# FormFieldType

## Example Usage

```java
import com.apideck.unify.models.components.FormFieldType;

FormFieldType value = FormFieldType.TEXT;

// Open enum: use .of() to create instances from custom string values
FormFieldType custom = FormFieldType.of("custom_value");
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