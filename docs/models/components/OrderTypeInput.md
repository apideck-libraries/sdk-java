# OrderTypeInput


## Fields

| Field                                                                                                                                                   | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             | Example                                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `name`                                                                                                                                                  | *Optional\<String>*                                                                                                                                     | :heavy_minus_sign:                                                                                                                                      | N/A                                                                                                                                                     | Default order type                                                                                                                                      |
| `default_`                                                                                                                                              | *Optional\<Boolean>*                                                                                                                                    | :heavy_minus_sign:                                                                                                                                      | N/A                                                                                                                                                     | true                                                                                                                                                    |
| `passThrough`                                                                                                                                           | List\<[PassThroughBody](../../models/components/PassThroughBody.md)>                                                                                    | :heavy_minus_sign:                                                                                                                                      | The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources. |                                                                                                                                                         |