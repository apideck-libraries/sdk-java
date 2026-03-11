# ProjectType

Type or category of the project

## Example Usage

```java
import com.apideck.unify.models.components.ProjectType;

ProjectType value = ProjectType.CLIENT_PROJECT;

// Open enum: use .of() to create instances from custom string values
ProjectType custom = ProjectType.of("custom_value");
```


## Values

| Name                   | Value                  |
| ---------------------- | ---------------------- |
| `CLIENT_PROJECT`       | client_project         |
| `INTERNAL_PROJECT`     | internal_project       |
| `MAINTENANCE`          | maintenance            |
| `RESEARCH_DEVELOPMENT` | research_development   |
| `TRAINING`             | training               |
| `OTHER`                | other                  |