# UpdateCommentResponse

Update a Comment


## Fields

| Field                                             | Type                                              | Required                                          | Description                                       | Example                                           |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `statusCode`                                      | *long*                                            | :heavy_check_mark:                                | HTTP Response Status Code                         | 200                                               |
| `status`                                          | *String*                                          | :heavy_check_mark:                                | HTTP Response Status                              | OK                                                |
| `service`                                         | *String*                                          | :heavy_check_mark:                                | Apideck ID of service provider                    | github                                            |
| `resource`                                        | *String*                                          | :heavy_check_mark:                                | Unified API resource name                         | Tickets                                           |
| `operation`                                       | *String*                                          | :heavy_check_mark:                                | Operation performed                               | update                                            |
| `data`                                            | [UnifiedId](../../models/components/UnifiedId.md) | :heavy_check_mark:                                | N/A                                               |                                                   |