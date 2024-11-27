# VaultSessionsCreateRequest


## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                | Example                                                    |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `consumerId`                                               | *Optional\<String>*                                        | :heavy_minus_sign:                                         | ID of the consumer which you want to get or push data from | test-consumer                                              |
| `appId`                                                    | *Optional\<String>*                                        | :heavy_minus_sign:                                         | The ID of your Unify application                           | dSBdXd2H6Mqwfg0atXHXYcysLJE9qyn1VwBtXHX                    |
| `session`                                                  | [Optional\<Session>](../../models/components/Session.md)   | :heavy_minus_sign:                                         | Additional redirect uri and/or consumer metadata           |                                                            |