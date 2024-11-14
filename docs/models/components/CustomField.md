# CustomField


## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              | Example                                                  |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `id`                                                     | *Optional\<String>*                                      | :heavy_check_mark:                                       | Unique identifier for the custom field.                  | 2389328923893298                                         |
| `name`                                                   | *JsonNullable\<String>*                                  | :heavy_minus_sign:                                       | Name of the custom field.                                | employee_level                                           |
| `description`                                            | *JsonNullable\<String>*                                  | :heavy_minus_sign:                                       | More information about the custom field                  | Employee Level                                           |
| `value`                                                  | [JsonNullable\<Value>](../../models/components/Value.md) | :heavy_minus_sign:                                       | N/A                                                      |                                                          |