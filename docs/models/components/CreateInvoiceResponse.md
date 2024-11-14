# CreateInvoiceResponse

Invoice created


## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `statusCode`                                                  | *long*                                                        | :heavy_check_mark:                                            | HTTP Response Status Code                                     | 200                                                           |
| `status`                                                      | *String*                                                      | :heavy_check_mark:                                            | HTTP Response Status                                          | OK                                                            |
| `service`                                                     | *String*                                                      | :heavy_check_mark:                                            | Apideck ID of service provider                                | xero                                                          |
| `resource`                                                    | *String*                                                      | :heavy_check_mark:                                            | Unified API resource name                                     | invoices                                                      |
| `operation`                                                   | *String*                                                      | :heavy_check_mark:                                            | Operation performed                                           | add                                                           |
| `data`                                                        | [InvoiceResponse](../../models/components/InvoiceResponse.md) | :heavy_check_mark:                                            | N/A                                                           |                                                               |