# LedgerAccountsFilterStatus

Filter by account status. Supported only on a subset of connectors (e.g. NetSuite); connectors that do not support it reject `filter[status]` with a `400 UnsupportedFiltersError` — read the account's `status` field in the response and filter client-side instead. See the error's `supported_filters` or the connector's supported filters.

## Example Usage

```java
import com.apideck.unify.models.components.LedgerAccountsFilterStatus;

LedgerAccountsFilterStatus value = LedgerAccountsFilterStatus.ACTIVE;

// Open enum: use .of() to create instances from custom string values
LedgerAccountsFilterStatus custom = LedgerAccountsFilterStatus.of("custom_value");
```


## Values

| Name       | Value      |
| ---------- | ---------- |
| `ACTIVE`   | active     |
| `INACTIVE` | inactive   |