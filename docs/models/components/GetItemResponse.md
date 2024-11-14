# GetItemResponse

Items


## Fields

| Field                                   | Type                                    | Required                                | Description                             | Example                                 |
| --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- |
| `statusCode`                            | *long*                                  | :heavy_check_mark:                      | HTTP Response Status Code               | 200                                     |
| `status`                                | *String*                                | :heavy_check_mark:                      | HTTP Response Status                    | OK                                      |
| `service`                               | *String*                                | :heavy_check_mark:                      | Apideck ID of service provider          | square                                  |
| `resource`                              | *String*                                | :heavy_check_mark:                      | Unified API resource name               | Items                                   |
| `operation`                             | *String*                                | :heavy_check_mark:                      | Operation performed                     | one                                     |
| `data`                                  | [Item](../../models/components/Item.md) | :heavy_check_mark:                      | N/A                                     |                                         |