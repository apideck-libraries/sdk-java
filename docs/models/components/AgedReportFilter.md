# AgedReportFilter


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               | Example                                                   |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `customerId`                                              | *Optional\<String>*                                       | :heavy_minus_sign:                                        | Filter by customer id                                     | 123abc                                                    |
| `reportAsOfDate`                                          | *Optional\<String>*                                       | :heavy_minus_sign:                                        | The cutoff date for considering transactions              | 2024-01-01                                                |
| `periodCount`                                             | *Optional\<Long>*                                         | :heavy_minus_sign:                                        | Number of periods to split the aged creditors report into | 3                                                         |
| `periodLength`                                            | *Optional\<Long>*                                         | :heavy_minus_sign:                                        | Length of each period in days                             | 30                                                        |