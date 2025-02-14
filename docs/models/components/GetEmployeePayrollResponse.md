# GetEmployeePayrollResponse

Payrolls


## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `statusCode`                                                  | *long*                                                        | :heavy_check_mark:                                            | HTTP Response Status Code                                     | 200                                                           |
| `status`                                                      | *String*                                                      | :heavy_check_mark:                                            | HTTP Response Status                                          | OK                                                            |
| `service`                                                     | *String*                                                      | :heavy_check_mark:                                            | Apideck ID of service provider                                | undefined                                                     |
| `resource`                                                    | *String*                                                      | :heavy_check_mark:                                            | Unified API resource name                                     | Companies                                                     |
| `operation`                                                   | *String*                                                      | :heavy_check_mark:                                            | Operation performed                                           | one                                                           |
| `data`                                                        | [EmployeePayroll](../../models/components/EmployeePayroll.md) | :heavy_check_mark:                                            | N/A                                                           |                                                               |