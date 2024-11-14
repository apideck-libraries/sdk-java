# LinkedSupplier

The supplier this entity is linked to.


## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              | Example                                                  |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `id`                                                     | *Optional\<String>*                                      | :heavy_minus_sign:                                       | The ID of the supplier this entity is linked to.         | 12345                                                    |
| `displayId`                                              | *JsonNullable\<String>*                                  | :heavy_minus_sign:                                       | The display ID of the supplier.                          | SUPP00101                                                |
| `displayName`                                            | *JsonNullable\<String>*                                  | :heavy_minus_sign:                                       | The display name of the supplier.                        | Windsurf Shop                                            |
| `companyName`                                            | *JsonNullable\<String>*                                  | :heavy_minus_sign:                                       | The company name of the supplier.                        | The boring company                                       |
| `address`                                                | [Optional\<Address>](../../models/components/Address.md) | :heavy_minus_sign:                                       | N/A                                                      |                                                          |