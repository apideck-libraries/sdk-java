# LinkedEcommerceCustomer

The customer this entity is linked to.


## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `id`                                                         | *JsonNullable\<String>*                                      | :heavy_minus_sign:                                           | The ID of the customer this entity is linked to.             | 12345                                                        |
| `name`                                                       | *JsonNullable\<String>*                                      | :heavy_minus_sign:                                           | Full name of the customer                                    | John Doe                                                     |
| `firstName`                                                  | *JsonNullable\<String>*                                      | :heavy_minus_sign:                                           | First name of the customer                                   | John                                                         |
| `lastName`                                                   | *JsonNullable\<String>*                                      | :heavy_minus_sign:                                           | Last name of the customer                                    | Doe                                                          |
| `companyName`                                                | *JsonNullable\<String>*                                      | :heavy_minus_sign:                                           | Company name of the customer                                 | Acme Inc.                                                    |
| `phoneNumbers`                                               | List\<[PhoneNumber](../../models/components/PhoneNumber.md)> | :heavy_minus_sign:                                           | N/A                                                          |                                                              |
| `emails`                                                     | List\<[Email](../../models/components/Email.md)>             | :heavy_minus_sign:                                           | N/A                                                          |                                                              |