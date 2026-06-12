# JournalEntriesFilterScope

Connector-specific scope hint that controls which downstream source backs the read. On Xero, `manual` reads from `ManualJournals` (free in every tier), while `system` reads from `Journals` (the full general ledger view including manual journal postings, paid post 2026-03-02). Omitting the filter is equivalent to `system` and preserves the legacy default. Only honored on connectors where the distinction is exposed; ignored elsewhere.

## Example Usage

```java
import com.apideck.unify.models.components.JournalEntriesFilterScope;

JournalEntriesFilterScope value = JournalEntriesFilterScope.MANUAL;

// Open enum: use .of() to create instances from custom string values
JournalEntriesFilterScope custom = JournalEntriesFilterScope.of("custom_value");
```


## Values

| Name     | Value    |
| -------- | -------- |
| `MANUAL` | manual   |
| `SYSTEM` | system   |