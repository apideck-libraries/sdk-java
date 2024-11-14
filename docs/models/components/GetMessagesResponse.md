# GetMessagesResponse

Messages


## Fields

| Field                                                       | Type                                                        | Required                                                    | Description                                                 | Example                                                     |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `statusCode`                                                | *long*                                                      | :heavy_check_mark:                                          | HTTP Response Status Code                                   | 200                                                         |
| `status`                                                    | *String*                                                    | :heavy_check_mark:                                          | HTTP Response Status                                        | OK                                                          |
| `service`                                                   | *String*                                                    | :heavy_check_mark:                                          | Apideck ID of service provider                              | twilio                                                      |
| `resource`                                                  | *String*                                                    | :heavy_check_mark:                                          | Unified API resource name                                   | Messages                                                    |
| `operation`                                                 | *String*                                                    | :heavy_check_mark:                                          | Operation performed                                         | all                                                         |
| `data`                                                      | List\<[Message](../../models/components/Message.md)>        | :heavy_check_mark:                                          | N/A                                                         |                                                             |
| `meta`                                                      | [Optional\<Meta>](../../models/components/Meta.md)          | :heavy_minus_sign:                                          | Response metadata                                           |                                                             |
| `links`                                                     | [Optional\<Links>](../../models/components/Links.md)        | :heavy_minus_sign:                                          | Links to navigate to previous or next pages through the API |                                                             |