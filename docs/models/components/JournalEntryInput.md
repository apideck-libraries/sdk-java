# JournalEntryInput


## Fields

| Field                                                                                                                                                   | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             | Example                                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `title`                                                                                                                                                 | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Journal entry title                                                                                                                                     | Purchase Invoice-Inventory (USD): 2019/02/01 Batch Summary Entry                                                                                        |
| `currencyRate`                                                                                                                                          | *JsonNullable\<Double>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Currency Exchange Rate at the time entity was recorded/generated.                                                                                       | 0.69                                                                                                                                                    |
| `currency`                                                                                                                                              | [JsonNullable\<Currency>](../../models/components/Currency.md)                                                                                          | :heavy_minus_sign:                                                                                                                                      | Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).                      | USD                                                                                                                                                     |
| `companyId`                                                                                                                                             | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | The company or subsidiary id the transaction belongs to                                                                                                 | 12345                                                                                                                                                   |
| `lineItems`                                                                                                                                             | List\<[JournalEntryLineItemInput](../../models/components/JournalEntryLineItemInput.md)>                                                                | :heavy_minus_sign:                                                                                                                                      | Requires a minimum of 2 line items that sum to 0                                                                                                        |                                                                                                                                                         |
| `memo`                                                                                                                                                  | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Reference for the journal entry.                                                                                                                        | Thank you for your business and have a great day!                                                                                                       |
| `postedAt`                                                                                                                                              | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                                               | :heavy_minus_sign:                                                                                                                                      | This is the date on which the journal entry was added. This can be different from the creation date and can also be backdated.                          | 2020-09-30T07:43:32.000Z                                                                                                                                |
| `journalSymbol`                                                                                                                                         | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Journal symbol of the entry. For example IND for indirect costs                                                                                         | IND                                                                                                                                                     |
| `taxType`                                                                                                                                               | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | The specific category of tax associated with a transaction like sales or purchase                                                                       | sales                                                                                                                                                   |
| `taxCode`                                                                                                                                               | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Applicable tax id/code override if tax is not supplied on a line item basis.                                                                            | 1234                                                                                                                                                    |
| `number`                                                                                                                                                | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Journal entry number.                                                                                                                                   | OIT00546                                                                                                                                                |
| `trackingCategories`                                                                                                                                    | List\<[LinkedTrackingCategory](../../models/components/LinkedTrackingCategory.md)>                                                                      | :heavy_minus_sign:                                                                                                                                      | A list of linked tracking categories.                                                                                                                   |                                                                                                                                                         |
| `accountingPeriod`                                                                                                                                      | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Accounting period                                                                                                                                       | 01-24                                                                                                                                                   |
| `rowVersion`                                                                                                                                            | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.              | 1-12345                                                                                                                                                 |
| `passThrough`                                                                                                                                           | List\<[PassThroughBody](../../models/components/PassThroughBody.md)>                                                                                    | :heavy_minus_sign:                                                                                                                                      | The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources. |                                                                                                                                                         |