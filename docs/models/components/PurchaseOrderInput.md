# PurchaseOrderInput


## Fields

| Field                                                                                                                                                   | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             | Example                                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `poNumber`                                                                                                                                              | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | A PO Number uniquely identifies a purchase order and is generally defined by the buyer.                                                                 | 90000117                                                                                                                                                |
| `reference`                                                                                                                                             | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Optional purchase order reference.                                                                                                                      | 123456                                                                                                                                                  |
| `supplier`                                                                                                                                              | [JsonNullable\<LinkedSupplierInput>](../../models/components/LinkedSupplierInput.md)                                                                    | :heavy_minus_sign:                                                                                                                                      | The supplier this entity is linked to.                                                                                                                  |                                                                                                                                                         |
| `companyId`                                                                                                                                             | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | The company or subsidiary id the transaction belongs to                                                                                                 | 12345                                                                                                                                                   |
| `status`                                                                                                                                                | [JsonNullable\<PurchaseOrderStatus>](../../models/components/PurchaseOrderStatus.md)                                                                    | :heavy_minus_sign:                                                                                                                                      | N/A                                                                                                                                                     | open                                                                                                                                                    |
| `issuedDate`                                                                                                                                            | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)                                                                         | :heavy_minus_sign:                                                                                                                                      | Date purchase order was issued - YYYY-MM-DD.                                                                                                            | 2020-09-30                                                                                                                                              |
| `deliveryDate`                                                                                                                                          | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)                                                                         | :heavy_minus_sign:                                                                                                                                      | The date on which the purchase order is to be delivered - YYYY-MM-DD.                                                                                   | 2020-09-30                                                                                                                                              |
| `expectedArrivalDate`                                                                                                                                   | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)                                                                         | :heavy_minus_sign:                                                                                                                                      | The date on which the order is expected to arrive - YYYY-MM-DD.                                                                                         | 2020-09-30                                                                                                                                              |
| `currency`                                                                                                                                              | [JsonNullable\<Currency>](../../models/components/Currency.md)                                                                                          | :heavy_minus_sign:                                                                                                                                      | Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).                      | USD                                                                                                                                                     |
| `currencyRate`                                                                                                                                          | *JsonNullable\<Double>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Currency Exchange Rate at the time entity was recorded/generated.                                                                                       | 0.69                                                                                                                                                    |
| `subTotal`                                                                                                                                              | *JsonNullable\<Double>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Sub-total amount, normally before tax.                                                                                                                  | 27500                                                                                                                                                   |
| `totalTax`                                                                                                                                              | *JsonNullable\<Double>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Total tax amount applied to this invoice.                                                                                                               | 2500                                                                                                                                                    |
| `total`                                                                                                                                                 | *JsonNullable\<Double>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Total amount of invoice, including tax.                                                                                                                 | 27500                                                                                                                                                   |
| `taxInclusive`                                                                                                                                          | *JsonNullable\<Boolean>*                                                                                                                                | :heavy_minus_sign:                                                                                                                                      | Amounts are including tax                                                                                                                               | true                                                                                                                                                    |
| `lineItems`                                                                                                                                             | List\<[InvoiceLineItemInput](../../models/components/InvoiceLineItemInput.md)>                                                                          | :heavy_minus_sign:                                                                                                                                      | N/A                                                                                                                                                     |                                                                                                                                                         |
| `shippingAddress`                                                                                                                                       | [Optional\<Address>](../../models/components/Address.md)                                                                                                | :heavy_minus_sign:                                                                                                                                      | N/A                                                                                                                                                     |                                                                                                                                                         |
| `ledgerAccount`                                                                                                                                         | [JsonNullable\<LinkedLedgerAccountInput>](../../models/components/LinkedLedgerAccountInput.md)                                                          | :heavy_minus_sign:                                                                                                                                      | N/A                                                                                                                                                     |                                                                                                                                                         |
| `templateId`                                                                                                                                            | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Optional purchase order template                                                                                                                        | 123456                                                                                                                                                  |
| `discountPercentage`                                                                                                                                    | *JsonNullable\<Double>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Discount percentage applied to this transaction.                                                                                                        | 5.5                                                                                                                                                     |
| `bankAccount`                                                                                                                                           | [Optional\<BankAccount>](../../models/components/BankAccount.md)                                                                                        | :heavy_minus_sign:                                                                                                                                      | N/A                                                                                                                                                     |                                                                                                                                                         |
| `accountingByRow`                                                                                                                                       | *JsonNullable\<Boolean>*                                                                                                                                | :heavy_minus_sign:                                                                                                                                      | Indicates if accounting by row is used (true) or not (false). Accounting by row means that a separate ledger transaction is created for each row.       | false                                                                                                                                                   |
| `dueDate`                                                                                                                                               | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)                                                                         | :heavy_minus_sign:                                                                                                                                      | The due date is the date on which a payment is scheduled to be received - YYYY-MM-DD.                                                                   | 2020-10-30                                                                                                                                              |
| `paymentMethod`                                                                                                                                         | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Payment method used for the transaction, such as cash, credit card, bank transfer, or check                                                             | cash                                                                                                                                                    |
| `taxCode`                                                                                                                                               | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Applicable tax id/code override if tax is not supplied on a line item basis.                                                                            | 1234                                                                                                                                                    |
| `channel`                                                                                                                                               | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | The channel through which the transaction is processed.                                                                                                 | email                                                                                                                                                   |
| `memo`                                                                                                                                                  | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | Message for the supplier. This text appears on the Purchase Order.                                                                                      | Thank you for the partnership and have a great day!                                                                                                     |
| `trackingCategories`                                                                                                                                    | List\<[LinkedTrackingCategory](../../models/components/LinkedTrackingCategory.md)>                                                                      | :heavy_minus_sign:                                                                                                                                      | A list of linked tracking categories.                                                                                                                   |                                                                                                                                                         |
| `rowVersion`                                                                                                                                            | *JsonNullable\<String>*                                                                                                                                 | :heavy_minus_sign:                                                                                                                                      | A binary value used to detect updates to a object and prevent data conflicts. It is incremented each time an update is made to the object.              | 1-12345                                                                                                                                                 |
| `passThrough`                                                                                                                                           | List\<[PassThroughBody](../../models/components/PassThroughBody.md)>                                                                                    | :heavy_minus_sign:                                                                                                                                      | The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources. |                                                                                                                                                         |