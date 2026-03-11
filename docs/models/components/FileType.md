# FileType

The type of resource. Could be file, folder or url

## Example Usage

```java
import com.apideck.unify.models.components.FileType;

FileType value = FileType.FILE;

// Open enum: use .of() to create instances from custom string values
FileType custom = FileType.of("custom_value");
```


## Values

| Name     | Value    |
| -------- | -------- |
| `FILE`   | file     |
| `FOLDER` | folder   |
| `URL`    | url      |