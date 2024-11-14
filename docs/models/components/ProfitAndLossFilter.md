# ProfitAndLossFilter


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         | Example                                                             |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `customerId`                                                        | *Optional\<String>*                                                 | :heavy_minus_sign:                                                  | Filter by customer id                                               | 123abc                                                              |
| `startDate`                                                         | *Optional\<String>*                                                 | :heavy_minus_sign:                                                  | Filter by start date. If start date is given, end date is required. | 2021-01-01                                                          |
| `endDate`                                                           | *Optional\<String>*                                                 | :heavy_minus_sign:                                                  | Filter by end date. If end date is given, start date is required.   | 2021-12-31                                                          |