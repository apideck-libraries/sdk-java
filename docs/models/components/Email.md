# Email


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      | Example                                                          |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `id`                                                             | *JsonNullable\<String>*                                          | :heavy_minus_sign:                                               | Unique identifier for the email address                          | 123                                                              |
| `email`                                                          | *Optional\<String>*                                              | :heavy_check_mark:                                               | Email address                                                    | elon@musk.com                                                    |
| `type`                                                           | [JsonNullable\<EmailType>](../../models/components/EmailType.md) | :heavy_minus_sign:                                               | Email type                                                       | primary                                                          |