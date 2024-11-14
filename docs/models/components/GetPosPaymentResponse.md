# GetPosPaymentResponse

PosPayments


## Fields

| Field                                               | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `statusCode`                                        | *long*                                              | :heavy_check_mark:                                  | HTTP Response Status Code                           | 200                                                 |
| `status`                                            | *String*                                            | :heavy_check_mark:                                  | HTTP Response Status                                | OK                                                  |
| `service`                                           | *String*                                            | :heavy_check_mark:                                  | Apideck ID of service provider                      | square                                              |
| `resource`                                          | *String*                                            | :heavy_check_mark:                                  | Unified API resource name                           | PosPayments                                         |
| `operation`                                         | *String*                                            | :heavy_check_mark:                                  | Operation performed                                 | one                                                 |
| `data`                                              | [PosPayment](../../models/components/PosPayment.md) | :heavy_check_mark:                                  | N/A                                                 |                                                     |