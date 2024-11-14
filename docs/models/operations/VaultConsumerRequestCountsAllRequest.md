# VaultConsumerRequestCountsAllRequest


## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              | Example                                                  |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `appId`                                                  | *Optional\<String>*                                      | :heavy_minus_sign:                                       | The ID of your Unify application                         | dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX                  |
| `consumerId`                                             | *String*                                                 | :heavy_check_mark:                                       | ID of the consumer to return                             | test_user_id                                             |
| `startDatetime`                                          | *String*                                                 | :heavy_check_mark:                                       | Scopes results to requests that happened after datetime  | 2021-05-01T12:00:00.000Z                                 |
| `endDatetime`                                            | *String*                                                 | :heavy_check_mark:                                       | Scopes results to requests that happened before datetime | 2021-05-30T12:00:00.000Z                                 |