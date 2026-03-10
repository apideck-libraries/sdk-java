# PaginationCoverageMode

How pagination is implemented on this connector. Native mode means Apideck is using the pagination parameters of the connector. With virtual pagination, the connector does not support pagination, but Apideck emulates it.

## Example Usage

```java
import com.apideck.unify.models.components.PaginationCoverageMode;

PaginationCoverageMode value = PaginationCoverageMode.NATIVE;

// Open enum: use .of() to create instances from custom string values
PaginationCoverageMode custom = PaginationCoverageMode.of("custom_value");
```


## Values

| Name      | Value     |
| --------- | --------- |
| `NATIVE`  | native    |
| `VIRTUAL` | virtual   |