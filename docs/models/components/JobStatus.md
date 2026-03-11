# JobStatus

The status of the job.

## Example Usage

```java
import com.apideck.unify.models.components.JobStatus;

JobStatus value = JobStatus.DRAFT;

// Open enum: use .of() to create instances from custom string values
JobStatus custom = JobStatus.of("custom_value");
```


## Values

| Name                   | Value                  |
| ---------------------- | ---------------------- |
| `DRAFT`                | draft                  |
| `INTERNAL`             | internal               |
| `PUBLISHED`            | published              |
| `COMPLETED`            | completed              |
| `PLACED`               | placed                 |
| `ON_HOLD`              | on-hold                |
| `PRIVATE`              | private                |
| `ACCEPTING_CANDIDATES` | accepting_candidates   |
| `OPEN`                 | open                   |
| `CLOSED`               | closed                 |
| `ARCHIVED`             | archived               |