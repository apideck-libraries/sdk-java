# Bill


## Fields

| Field                                                                                                                                                            | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      | Example                                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                             | *Optional\<String>*                                                                                                                                              | :heavy_minus_sign:                                                                                                                                               | A unique identifier for an object.                                                                                                                               | 12345                                                                                                                                                            |
| `downstreamId`                                                                                                                                                   | *JsonNullable\<String>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | The third-party API ID of original entity                                                                                                                        | 12345                                                                                                                                                            |
| `billNumber`                                                                                                                                                     | *JsonNullable\<String>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | Reference to supplier bill number                                                                                                                                | 10001                                                                                                                                                            |
| `supplier`                                                                                                                                                       | [JsonNullable\<LinkedSupplier>](../../models/components/LinkedSupplier.md)                                                                                       | :heavy_minus_sign:                                                                                                                                               | The supplier this entity is linked to.                                                                                                                           |                                                                                                                                                                  |
| `companyId`                                                                                                                                                      | *JsonNullable\<String>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | The company or subsidiary id the transaction belongs to                                                                                                          | 12345                                                                                                                                                            |
| `currency`                                                                                                                                                       | [JsonNullable\<Currency>](../../models/components/Currency.md)                                                                                                   | :heavy_minus_sign:                                                                                                                                               | Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).                               | USD                                                                                                                                                              |
| `currencyRate`                                                                                                                                                   | *JsonNullable\<Double>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | Currency Exchange Rate at the time entity was recorded/generated.                                                                                                | 0.69                                                                                                                                                             |
| `taxInclusive`                                                                                                                                                   | *JsonNullable\<Boolean>*                                                                                                                                         | :heavy_minus_sign:                                                                                                                                               | Amounts are including tax                                                                                                                                        | true                                                                                                                                                             |
| `billDate`                                                                                                                                                       | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)                                                                                  | :heavy_minus_sign:                                                                                                                                               | Date bill was issued - YYYY-MM-DD.                                                                                                                               | 2020-09-30                                                                                                                                                       |
| `dueDate`                                                                                                                                                        | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)                                                                                  | :heavy_minus_sign:                                                                                                                                               | The due date is the date on which a payment is scheduled to be received - YYYY-MM-DD.                                                                            | 2020-10-30                                                                                                                                                       |
| `paidDate`                                                                                                                                                       | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)                                                                                  | :heavy_minus_sign:                                                                                                                                               | The paid date is the date on which a payment was sent to the supplier - YYYY-MM-DD.                                                                              | 2020-10-30                                                                                                                                                       |
| `poNumber`                                                                                                                                                       | *JsonNullable\<String>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | A PO Number uniquely identifies a purchase order and is generally defined by the buyer. The buyer will match the PO number in the invoice to the Purchase Order. | 90000117                                                                                                                                                         |
| `reference`                                                                                                                                                      | *JsonNullable\<String>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | Optional bill reference.                                                                                                                                         | 123456                                                                                                                                                           |
| `lineItems`                                                                                                                                                      | List\<[BillLineItem](../../models/components/BillLineItem.md)>                                                                                                   | :heavy_minus_sign:                                                                                                                                               | N/A                                                                                                                                                              |                                                                                                                                                                  |
| `terms`                                                                                                                                                          | *JsonNullable\<String>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | Terms of payment.                                                                                                                                                | Net 30 days                                                                                                                                                      |
| `balance`                                                                                                                                                        | *JsonNullable\<Double>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | Balance of bill due.                                                                                                                                             | 27500                                                                                                                                                            |
| `deposit`                                                                                                                                                        | *JsonNullable\<Double>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | Amount of deposit made to this bill.                                                                                                                             | 0                                                                                                                                                                |
| `subTotal`                                                                                                                                                       | *JsonNullable\<Double>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | Sub-total amount, normally before tax.                                                                                                                           | 27500                                                                                                                                                            |
| `totalTax`                                                                                                                                                       | *JsonNullable\<Double>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | Total tax amount applied to this bill.                                                                                                                           | 2500                                                                                                                                                             |
| `total`                                                                                                                                                          | *JsonNullable\<Double>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | Total amount of bill, including tax.                                                                                                                             | 27500                                                                                                                                                            |
| `taxCode`                                                                                                                                                        | *JsonNullable\<String>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | Applicable tax id/code override if tax is not supplied on a line item basis.                                                                                     | 1234                                                                                                                                                             |
| `notes`                                                                                                                                                          | *JsonNullable\<String>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | N/A                                                                                                                                                              | Some notes about this bill.                                                                                                                                      |
| `status`                                                                                                                                                         | [JsonNullable\<BillStatus>](../../models/components/BillStatus.md)                                                                                               | :heavy_minus_sign:                                                                                                                                               | Invoice status                                                                                                                                                   | draft                                                                                                                                                            |
| `ledgerAccount`                                                                                                                                                  | [JsonNullable\<LinkedLedgerAccount>](../../models/components/LinkedLedgerAccount.md)                                                                             | :heavy_minus_sign:                                                                                                                                               | N/A                                                                                                                                                              |                                                                                                                                                                  |
| `paymentMethod`                                                                                                                                                  | *JsonNullable\<String>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | Payment method used for the transaction, such as cash, credit card, bank transfer, or check                                                                      | cash                                                                                                                                                             |
| `channel`                                                                                                                                                        | *JsonNullable\<String>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | The channel through which the transaction is processed.                                                                                                          | email                                                                                                                                                            |
| `language`                                                                                                                                                       | *JsonNullable\<String>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | language code according to ISO 639-1. For the United States - EN                                                                                                 | EN                                                                                                                                                               |
| `accountingByRow`                                                                                                                                                | *JsonNullable\<Boolean>*                                                                                                                                         | :heavy_minus_sign:                                                                                                                                               | Indicates if accounting by row is used (true) or not (false). Accounting by row means that a separate ledger transaction is created for each row.                | false                                                                                                                                                            |
| `bankAccount`                                                                                                                                                    | [Optional\<BankAccount>](../../models/components/BankAccount.md)                                                                                                 | :heavy_minus_sign:                                                                                                                                               | N/A                                                                                                                                                              |                                                                                                                                                                  |
| `discountPercentage`                                                                                                                                             | *JsonNullable\<Double>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | Discount percentage applied to this transaction.                                                                                                                 | 5.5                                                                                                                                                              |
| `trackingCategories`                                                                                                                                             | List\<[LinkedTrackingCategory](../../models/components/LinkedTrackingCategory.md)>                                                                               | :heavy_minus_sign:                                                                                                                                               | A list of linked tracking categories.                                                                                                                            |                                                                                                                                                                  |
| `updatedBy`                                                                                                                                                      | *JsonNullable\<String>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | The user who last updated the object.                                                                                                                            | 12345                                                                                                                                                            |
| `createdBy`                                                                                                                                                      | *JsonNullable\<String>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | The user who created the object.                                                                                                                                 | 12345                                                                                                                                                            |
| `updatedAt`                                                                                                                                                      | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                                                        | :heavy_minus_sign:                                                                                                                                               | The date and time when the object was last updated.                                                                                                              | 2020-09-30T07:43:32.000Z                                                                                                                                         |
| `createdAt`                                                                                                                                                      | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                                                        | :heavy_minus_sign:                                                                                                                                               | The date and time when the object was created.                                                                                                                   | 2020-09-30T07:43:32.000Z                                                                                                                                         |
| `rowVersion`                                                                                                                                                     | *JsonNullable\<String>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.                       | 1-12345                                                                                                                                                          |
| `customMappings`                                                                                                                                                 | [JsonNullable\<CustomMappings>](../../models/components/CustomMappings.md)                                                                                       | :heavy_minus_sign:                                                                                                                                               | When custom mappings are configured on the resource, the result is included here.                                                                                |                                                                                                                                                                  |
| `passThrough`                                                                                                                                                    | List\<[PassThroughBody](../../models/components/PassThroughBody.md)>                                                                                             | :heavy_minus_sign:                                                                                                                                               | The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.          |                                                                                                                                                                  |
| `accountingPeriod`                                                                                                                                               | *JsonNullable\<String>*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                               | Accounting period                                                                                                                                                | 01-24                                                                                                                                                            |