# GetEmployeeSchedulesResponse

EmployeeSchedules


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       | Example                                                           |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `statusCode`                                                      | *long*                                                            | :heavy_check_mark:                                                | HTTP Response Status Code                                         | 200                                                               |
| `status`                                                          | *String*                                                          | :heavy_check_mark:                                                | HTTP Response Status                                              | OK                                                                |
| `service`                                                         | *String*                                                          | :heavy_check_mark:                                                | Apideck ID of service provider                                    | sage-hr                                                           |
| `resource`                                                        | *String*                                                          | :heavy_check_mark:                                                | Unified API resource name                                         | Employees                                                         |
| `operation`                                                       | *String*                                                          | :heavy_check_mark:                                                | Operation performed                                               | all                                                               |
| `data`                                                            | [EmployeeSchedules](../../models/components/EmployeeSchedules.md) | :heavy_check_mark:                                                | N/A                                                               |                                                                   |