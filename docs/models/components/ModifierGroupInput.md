# ModifierGroupInput


## Fields

| Field                                                                                                                                                                                                                            | Type                                                                                                                                                                                                                             | Required                                                                                                                                                                                                                         | Description                                                                                                                                                                                                                      | Example                                                                                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `name`                                                                                                                                                                                                                           | *Optional\<String>*                                                                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                                                                               | N/A                                                                                                                                                                                                                              | Modifier                                                                                                                                                                                                                         |
| `alternateName`                                                                                                                                                                                                                  | *Optional\<String>*                                                                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                                                                               | N/A                                                                                                                                                                                                                              | Modifier New                                                                                                                                                                                                                     |
| `minimumRequired`                                                                                                                                                                                                                | *Optional\<Long>*                                                                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                                                                               | N/A                                                                                                                                                                                                                              | 1                                                                                                                                                                                                                                |
| `maximumAllowed`                                                                                                                                                                                                                 | *Optional\<Long>*                                                                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                                                                               | N/A                                                                                                                                                                                                                              | 5                                                                                                                                                                                                                                |
| `selectionType`                                                                                                                                                                                                                  | [Optional\<IndicatesWhetherMultipleOptionsFromTheModifierGroupCanBeAppliedToASingleOrMultipleModifiers>](../../models/components/IndicatesWhetherMultipleOptionsFromTheModifierGroupCanBeAppliedToASingleOrMultipleModifiers.md) | :heavy_minus_sign:                                                                                                                                                                                                               | N/A                                                                                                                                                                                                                              | single                                                                                                                                                                                                                           |
| `presentAtAllLocations`                                                                                                                                                                                                          | *Optional\<Boolean>*                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                               | N/A                                                                                                                                                                                                                              | false                                                                                                                                                                                                                            |
| `modifiers`                                                                                                                                                                                                                      | List\<[Modifiers](../../models/components/Modifiers.md)>                                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                               | N/A                                                                                                                                                                                                                              |                                                                                                                                                                                                                                  |
| `deleted`                                                                                                                                                                                                                        | *JsonNullable\<Boolean>*                                                                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                               | Flag to indicate if the object is deleted.                                                                                                                                                                                       | true                                                                                                                                                                                                                             |
| `rowVersion`                                                                                                                                                                                                                     | *JsonNullable\<String>*                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                               | A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.                                                                                       | 1-12345                                                                                                                                                                                                                          |
| `passThrough`                                                                                                                                                                                                                    | List\<[PassThroughBody](../../models/components/PassThroughBody.md)>                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                               | The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.                                                                          |                                                                                                                                                                                                                                  |