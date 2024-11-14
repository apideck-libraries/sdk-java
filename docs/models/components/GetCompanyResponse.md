# GetCompanyResponse

Company


## Fields

| Field                                         | Type                                          | Required                                      | Description                                   | Example                                       |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `statusCode`                                  | *long*                                        | :heavy_check_mark:                            | HTTP Response Status Code                     | 200                                           |
| `status`                                      | *String*                                      | :heavy_check_mark:                            | HTTP Response Status                          | OK                                            |
| `service`                                     | *String*                                      | :heavy_check_mark:                            | Apideck ID of service provider                | zoho-crm                                      |
| `resource`                                    | *String*                                      | :heavy_check_mark:                            | Unified API resource name                     | companies                                     |
| `operation`                                   | *String*                                      | :heavy_check_mark:                            | Operation performed                           | one                                           |
| `data`                                        | [Company](../../models/components/Company.md) | :heavy_check_mark:                            | N/A                                           |                                               |