# ProjectStatus

Status of projects to filter by

## Example Usage

```java
import com.apideck.unify.models.components.ProjectStatus;

ProjectStatus value = ProjectStatus.ACTIVE;

// Open enum: use .of() to create instances from custom string values
ProjectStatus custom = ProjectStatus.of("custom_value");
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `ACTIVE`      | active        |
| `COMPLETED`   | completed     |
| `ON_HOLD`     | on_hold       |
| `CANCELLED`   | cancelled     |
| `DRAFT`       | draft         |
| `IN_PROGRESS` | in_progress   |
| `APPROVED`    | approved      |
| `OTHER`       | other         |