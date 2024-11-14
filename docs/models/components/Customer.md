# Customer


## Fields

| Field                                                                                                                                                   | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             | Example                                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                    | *String*                                                                                                                                                | :heavy_check_mark:                                                                                                                                      | A unique identifier for an object.                                                                                                                      | 12345                                                                                                                                                   |
| `downstreamId`                                                                                                                                          | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | The third-party API ID of original entity                                                                                                               | 12345                                                                                                                                                   |
| `displayId`                                                                                                                                             | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Display ID                                                                                                                                              | EMP00101                                                                                                                                                |
| `displayName`                                                                                                                                           | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Display name                                                                                                                                            | Windsurf Shop                                                                                                                                           |
| `companyName`                                                                                                                                           | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | The name of the company.                                                                                                                                | SpaceX                                                                                                                                                  |
| `companyId`                                                                                                                                             | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | The company or subsidiary id the transaction belongs to                                                                                                 | 12345                                                                                                                                                   |
| `title`                                                                                                                                                 | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | The job title of the person.                                                                                                                            | CEO                                                                                                                                                     |
| `firstName`                                                                                                                                             | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | The first name of the person.                                                                                                                           | Elon                                                                                                                                                    |
| `middleName`                                                                                                                                            | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Middle name of the person.                                                                                                                              | D.                                                                                                                                                      |
| `lastName`                                                                                                                                              | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | The last name of the person.                                                                                                                            | Musk                                                                                                                                                    |
| `suffix`                                                                                                                                                | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | N/A                                                                                                                                                     | Jr.                                                                                                                                                     |
| `individual`                                                                                                                                            | *JsonNullable\<Boolean>*                                                                                                                                | :heavy_minus_sign:                                                                                                                                      | Is this an individual or business customer                                                                                                              | true                                                                                                                                                    |
| `project`                                                                                                                                               | *JsonNullable\<Boolean>*                                                                                                                                | :heavy_minus_sign:                                                                                                                                      | If true, indicates this is a Project.                                                                                                                   | false                                                                                                                                                   |
| `addresses`                                                                                                                                             | List\<[Address](../../models/components/Address.md)>                                                                                                    | :heavy_minus_sign:                                                                                                                                      | N/A                                                                                                                                                     |                                                                                                                                                         |
| `phoneNumbers`                                                                                                                                          | List\<[PhoneNumber](../../models/components/PhoneNumber.md)>                                                                                            | :heavy_minus_sign:                                                                                                                                      | N/A                                                                                                                                                     |                                                                                                                                                         |
| `emails`                                                                                                                                                | List\<[Email](../../models/components/Email.md)>                                                                                                        | :heavy_minus_sign:                                                                                                                                      | N/A                                                                                                                                                     |                                                                                                                                                         |
| `websites`                                                                                                                                              | List\<[Website](../../models/components/Website.md)>                                                                                                    | :heavy_minus_sign:                                                                                                                                      | N/A                                                                                                                                                     |                                                                                                                                                         |
| `bankAccounts`                                                                                                                                          | List\<[BankAccount](../../models/components/BankAccount.md)>                                                                                            | :heavy_minus_sign:                                                                                                                                      | N/A                                                                                                                                                     |                                                                                                                                                         |
| `notes`                                                                                                                                                 | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Some notes about this customer                                                                                                                          | Some notes about this customer                                                                                                                          |
| `taxRate`                                                                                                                                               | [Optional\<LinkedTaxRate>](../../models/components/LinkedTaxRate.md)                                                                                    | :heavy_minus_sign:                                                                                                                                      | N/A                                                                                                                                                     |                                                                                                                                                         |
| `taxNumber`                                                                                                                                             | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | N/A                                                                                                                                                     | US123945459                                                                                                                                             |
| `currency`                                                                                                                                              | [JsonNullable\<Currency>](../../models/components/Currency.md)                                                                                          | :heavy_minus_sign:                                                                                                                                      | Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).                      | USD                                                                                                                                                     |
| `account`                                                                                                                                               | [JsonNullable\<LinkedLedgerAccount>](../../models/components/LinkedLedgerAccount.md)                                                                    | :heavy_minus_sign:                                                                                                                                      | N/A                                                                                                                                                     |                                                                                                                                                         |
| `parent`                                                                                                                                                | [JsonNullable\<LinkedParentCustomer>](../../models/components/LinkedParentCustomer.md)                                                                  | :heavy_minus_sign:                                                                                                                                      | The parent customer this entity is linked to.                                                                                                           |                                                                                                                                                         |
| `status`                                                                                                                                                | [JsonNullable\<CustomerStatusStatus>](../../models/components/CustomerStatusStatus.md)                                                                  | :heavy_minus_sign:                                                                                                                                      | Customer status                                                                                                                                         | active                                                                                                                                                  |
| `paymentMethod`                                                                                                                                         | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Payment method used for the transaction, such as cash, credit card, bank transfer, or check                                                             | cash                                                                                                                                                    |
| `channel`                                                                                                                                               | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | The channel through which the transaction is processed.                                                                                                 | email                                                                                                                                                   |
| `customMappings`                                                                                                                                        | [JsonNullable\<CustomMappings>](../../models/components/CustomMappings.md)                                                                              | :heavy_minus_sign:                                                                                                                                      | When custom mappings are configured on the resource, the result is included here.                                                                       |                                                                                                                                                         |
| `updatedBy`                                                                                                                                             | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | The user who last updated the object.                                                                                                                   | 12345                                                                                                                                                   |
| `createdBy`                                                                                                                                             | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | The user who created the object.                                                                                                                        | 12345                                                                                                                                                   |
| `updatedAt`                                                                                                                                             | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                                               | :heavy_minus_sign:                                                                                                                                      | The date and time when the object was last updated.                                                                                                     | 2020-09-30T07:43:32.000Z                                                                                                                                |
| `createdAt`                                                                                                                                             | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                                               | :heavy_minus_sign:                                                                                                                                      | The date and time when the object was created.                                                                                                          | 2020-09-30T07:43:32.000Z                                                                                                                                |
| `rowVersion`                                                                                                                                            | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.              | 1-12345                                                                                                                                                 |
| `passThrough`                                                                                                                                           | List\<[PassThroughBody](../../models/components/PassThroughBody.md)>                                                                                    | :heavy_minus_sign:                                                                                                                                      | The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources. |                                                                                                                                                         |