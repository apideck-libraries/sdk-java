# GetMerchantResponse

Merchants


## Fields

| Field                                           | Type                                            | Required                                        | Description                                     | Example                                         |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `statusCode`                                    | *long*                                          | :heavy_check_mark:                              | HTTP Response Status Code                       | 200                                             |
| `status`                                        | *String*                                        | :heavy_check_mark:                              | HTTP Response Status                            | OK                                              |
| `service`                                       | *String*                                        | :heavy_check_mark:                              | Apideck ID of service provider                  | square                                          |
| `resource`                                      | *String*                                        | :heavy_check_mark:                              | Unified API resource name                       | Merchants                                       |
| `operation`                                     | *String*                                        | :heavy_check_mark:                              | Operation performed                             | one                                             |
| `data`                                          | [Merchant](../../models/components/Merchant.md) | :heavy_check_mark:                              | N/A                                             |                                                 |