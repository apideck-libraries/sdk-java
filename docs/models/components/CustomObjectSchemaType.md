# CustomObjectSchemaType

## Example Usage

```java
import com.apideck.unify.models.components.CustomObjectSchemaType;

CustomObjectSchemaType value = CustomObjectSchemaType.STRING;

// Open enum: use .of() to create instances from custom string values
CustomObjectSchemaType custom = CustomObjectSchemaType.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `STRING`      | string        |
| `NUMBER`      | number        |
| `INTEGER`     | integer       |
| `BOOLEAN`     | boolean       |
| `DATE`        | date          |
| `DATETIME`    | datetime      |
| `CURRENCY`    | currency      |
| `EMAIL`       | email         |
| `PHONE`       | phone         |
| `REFERENCE`   | reference     |
| `SELECT`      | select        |
| `MULTISELECT` | multiselect   |