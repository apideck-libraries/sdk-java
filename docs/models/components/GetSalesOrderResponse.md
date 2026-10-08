# GetSalesOrderResponse

Sales Orders


## Fields

| Field                                               | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `statusCode`                                        | *long*                                              | :heavy_check_mark:                                  | HTTP Response Status Code                           | 200                                                 |
| `status`                                            | *String*                                            | :heavy_check_mark:                                  | HTTP Response Status                                | OK                                                  |
| `service`                                           | *String*                                            | :heavy_check_mark:                                  | Apideck ID of service provider                      | acumatica                                           |
| `resource`                                          | *String*                                            | :heavy_check_mark:                                  | Unified API resource name                           | SalesOrders                                         |
| `operation`                                         | *String*                                            | :heavy_check_mark:                                  | Operation performed                                 | one                                                 |
| `data`                                              | [SalesOrder](../../models/components/SalesOrder.md) | :heavy_check_mark:                                  | N/A                                                 |                                                     |
| `meta`                                              | [Optional\<Meta>](../../models/components/Meta.md)  | :heavy_minus_sign:                                  | Response metadata                                   |                                                     |