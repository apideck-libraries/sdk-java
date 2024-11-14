# CompanyInfo


## Fields

| Field                                                                                                                                      | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                | Example                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                                       | *Optional\<String>*                                                                                                                        | :heavy_minus_sign:                                                                                                                         | A unique identifier for an object.                                                                                                         | 12345                                                                                                                                      |
| `companyName`                                                                                                                              | *JsonNullable\<String>*                                                                                                                    | :heavy_minus_sign:                                                                                                                         | The name of the company.                                                                                                                   | SpaceX                                                                                                                                     |
| `status`                                                                                                                                   | [Optional\<CompanyStatus>](../../models/components/CompanyStatus.md)                                                                       | :heavy_minus_sign:                                                                                                                         | Based on the status some functionality is enabled or disabled.                                                                             | active                                                                                                                                     |
| `legalName`                                                                                                                                | *Optional\<String>*                                                                                                                        | :heavy_minus_sign:                                                                                                                         | The legal name of the company                                                                                                              | SpaceX Inc.                                                                                                                                |
| `country`                                                                                                                                  | *JsonNullable\<String>*                                                                                                                    | :heavy_minus_sign:                                                                                                                         | country code according to ISO 3166-1 alpha-2.                                                                                              | US                                                                                                                                         |
| `salesTaxNumber`                                                                                                                           | *JsonNullable\<String>*                                                                                                                    | :heavy_minus_sign:                                                                                                                         | N/A                                                                                                                                        | 111.222.333                                                                                                                                |
| `automatedSalesTax`                                                                                                                        | *Optional\<Boolean>*                                                                                                                       | :heavy_minus_sign:                                                                                                                         | Whether sales tax is calculated automatically for the company                                                                              |                                                                                                                                            |
| `salesTaxEnabled`                                                                                                                          | *Optional\<Boolean>*                                                                                                                       | :heavy_minus_sign:                                                                                                                         | Whether sales tax is enabled for the company                                                                                               |                                                                                                                                            |
| `defaultSalesTax`                                                                                                                          | [Optional\<TaxRate>](../../models/components/TaxRate.md)                                                                                   | :heavy_minus_sign:                                                                                                                         | N/A                                                                                                                                        |                                                                                                                                            |
| `currency`                                                                                                                                 | [JsonNullable\<Currency>](../../models/components/Currency.md)                                                                             | :heavy_minus_sign:                                                                                                                         | Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).         | USD                                                                                                                                        |
| `language`                                                                                                                                 | *JsonNullable\<String>*                                                                                                                    | :heavy_minus_sign:                                                                                                                         | language code according to ISO 639-1. For the United States - EN                                                                           | EN                                                                                                                                         |
| `fiscalYearStartMonth`                                                                                                                     | [Optional\<TheStartMonthOfFiscalYear>](../../models/components/TheStartMonthOfFiscalYear.md)                                               | :heavy_minus_sign:                                                                                                                         | The start month of fiscal year.                                                                                                            | January                                                                                                                                    |
| `companyStartDate`                                                                                                                         | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)                                                            | :heavy_minus_sign:                                                                                                                         | Date when company file was created                                                                                                         | 2015-06-05                                                                                                                                 |
| `addresses`                                                                                                                                | List\<[Address](../../models/components/Address.md)>                                                                                       | :heavy_minus_sign:                                                                                                                         | N/A                                                                                                                                        |                                                                                                                                            |
| `phoneNumbers`                                                                                                                             | List\<[PhoneNumber](../../models/components/PhoneNumber.md)>                                                                               | :heavy_minus_sign:                                                                                                                         | N/A                                                                                                                                        |                                                                                                                                            |
| `emails`                                                                                                                                   | List\<[Email](../../models/components/Email.md)>                                                                                           | :heavy_minus_sign:                                                                                                                         | N/A                                                                                                                                        |                                                                                                                                            |
| `customMappings`                                                                                                                           | [JsonNullable\<CustomMappings>](../../models/components/CustomMappings.md)                                                                 | :heavy_minus_sign:                                                                                                                         | When custom mappings are configured on the resource, the result is included here.                                                          |                                                                                                                                            |
| `rowVersion`                                                                                                                               | *JsonNullable\<String>*                                                                                                                    | :heavy_minus_sign:                                                                                                                         | A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object. | 1-12345                                                                                                                                    |
| `updatedBy`                                                                                                                                | *JsonNullable\<String>*                                                                                                                    | :heavy_minus_sign:                                                                                                                         | The user who last updated the object.                                                                                                      | 12345                                                                                                                                      |
| `createdBy`                                                                                                                                | *JsonNullable\<String>*                                                                                                                    | :heavy_minus_sign:                                                                                                                         | The user who created the object.                                                                                                           | 12345                                                                                                                                      |
| `updatedAt`                                                                                                                                | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                                  | :heavy_minus_sign:                                                                                                                         | The date and time when the object was last updated.                                                                                        | 2020-09-30T07:43:32.000Z                                                                                                                   |
| `createdAt`                                                                                                                                | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                                  | :heavy_minus_sign:                                                                                                                         | The date and time when the object was created.                                                                                             | 2020-09-30T07:43:32.000Z                                                                                                                   |