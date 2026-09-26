# LogUnifiedApi

Which Unified Api request was made to.

## Example Usage

```java
import com.apideck.unify.models.components.LogUnifiedApi;

LogUnifiedApi value = LogUnifiedApi.CRM;

// Open enum: use .of() to create instances from custom string values
LogUnifiedApi custom = LogUnifiedApi.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `CRM`            | crm              |
| `LEAD`           | lead             |
| `PROXY`          | proxy            |
| `VAULT`          | vault            |
| `ACCOUNTING`     | accounting       |
| `HRIS`           | hris             |
| `ATS`            | ats              |
| `ECOMMERCE`      | ecommerce        |
| `ISSUE_TRACKING` | issue-tracking   |
| `POS`            | pos              |
| `FILE_STORAGE`   | file-storage     |
| `SMS`            | sms              |